package org.pedrero.ecos.ms.hint;

import org.hibernate.dialect.PostgreSQLDialect;
import org.pedrero.ecos.ms.model.entities.Competition;
import org.pedrero.ecos.ms.model.entities.ScrapperEntity;
import org.pedrero.ecos.ms.model.entities.Authority;
import org.springframework.aop.SpringProxy;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.core.DecoratingProxy;
import org.springframework.data.projection.TargetAware;

public class RuntimeHints implements RuntimeHintsRegistrar {

    private final MemberCategory[] SERIALIZABLE_CATEGORIES =
            {
                    MemberCategory.DECLARED_FIELDS,
                    MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
                    MemberCategory.INVOKE_DECLARED_METHODS
            };

    @Override
    public void registerHints(org.springframework.aot.hint.RuntimeHints hints, ClassLoader classLoader) {

        hints.reflection()
                .registerType(PostgreSQLDialect.class, SERIALIZABLE_CATEGORIES);

        hints.serialization()
                .registerType(Competition.class)
                .registerType(ScrapperEntity.class)
                .registerType(Authority.class);

    }

}
