package com.delrony.cake_factory.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.*;
import java.util.Optional;

import com.delrony.cake_factory.entity.Catalog;

@DataJpaTest
public class CatalogRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CatalogRepository catalogRepository;

    @Test
    public void testCatalog() {
        this.entityManager.persist(new Catalog("abcr", "All Butter Croissant", 0.75));

        Optional<Catalog> optionalCatalog = this.catalogRepository.findById("abcr");

        assertThat(optionalCatalog.get().getTitle()).isEqualTo("All Butter Croissant");
    }
}
