/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.iti.jets.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author Abdolrahman
 */
@Entity
@Table(name = "actor")
@NamedQueries(
        @NamedQuery(name = "Actor.getByName",
                query = "from Actor a where a.firstName ilike '%' || :name || '%' or a.lastName ilike '%' || :name || '%' ")
    )
@Data
@NoArgsConstructor
public class Actor implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "actor_id")
    private Integer actorId;
    @Basic(optional = false)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "last_update")
//    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime lastUpdate;
    @OneToMany( mappedBy = "actor")
    private List<FilmActor> filmActorList;

//    public Actor() {
//    }

    public Actor(Integer actorId) {
        this.actorId = actorId;
    }

//    public Actor(Integer actorId, String firstName, String lastName, LocalDateTime lastUpdate) {
//        this.actorId = actorId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.lastUpdate = lastUpdate;
//    }
//
//    public Integer getActorId() {
//        return actorId;
//    }
//
//    public void setActorId(Integer actorId) {
//        this.actorId = actorId;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public LocalDateTime getLastUpdate() {
//        return lastUpdate;
//    }
//
//    public void setLastUpdate(LocalDateTime lastUpdate) {
//        this.lastUpdate = lastUpdate;
//    }
//
//    public List<FilmActor> getFilmActorList() {
//        return filmActorList;
//    }
//
//    public void setFilmActorList(List<FilmActor> filmActorList) {
//        this.filmActorList = filmActorList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actorId != null ? actorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actor)) {
            return false;
        }
        Actor other = (Actor) object;
        if ((this.actorId == null && other.actorId != null) || (this.actorId != null && !this.actorId.equals(other.actorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Actor[ actorId=" + actorId + " ]";
    }
    
}
