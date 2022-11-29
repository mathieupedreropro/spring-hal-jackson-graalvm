package org.pedrero.ecos.ms.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public class ScrapperEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected UUID id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScrapperEntity that = (ScrapperEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
