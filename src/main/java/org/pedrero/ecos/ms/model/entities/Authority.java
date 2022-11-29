package org.pedrero.ecos.ms.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Authority extends ScrapperEntity {

    @Column
    private String name;

    @ManyToOne
    private Authority parent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authority sport = (Authority) o;
        return Objects.equals(id, sport.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
