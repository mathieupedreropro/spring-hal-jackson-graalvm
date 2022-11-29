package org.pedrero.ecos.ms.repositories;

import org.pedrero.ecos.ms.model.entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@RepositoryRestResource()
public interface SportAuthorityRepository extends JpaRepository<Authority, UUID> {

}
