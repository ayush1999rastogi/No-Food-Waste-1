package com.nfw.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_nfw")
/*@NamedQueries({
        @NamedQuery(name = "findAll", query = "SELECT u from User u")
})*/
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private long id;

    @JsonProperty
    private String username;

    @JsonProperty
    private String mobileNumber;

    @JsonProperty
    private boolean isVolunteer;

    @JsonProperty
    private String deviceId;

    @JsonProperty
    private String deviceToken;


}
