package com.delrony.cake_factory;

import com.delrony.cake_factory.data.CatalogRepository;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.delrony.cake_factory.entity.Catalog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

import java.util.ArrayList;
import java.util.List;

@WebMvcTest(HomeController.class)
public class HomeControllerTests {
    
    @Autowired
    private WebClient webClient;

    @MockBean
    private CatalogRepository catalogRepository;
    
    @Test
    public void testHomePage() throws Exception {
        List<Catalog> catalogs = new ArrayList<Catalog>();
        catalogs.add(new Catalog("abcr", "All Butter Croissant", 0.75));
        catalogs.add(new Catalog("ccr", "Chocolate Croissant", 0.95));

        given(this.catalogRepository.findAll())
            .willReturn(catalogs);

        HtmlPage page = this.webClient.getPage("/");

        final DomNodeList<DomNode> aTitleList = page.querySelectorAll("h4.card-title a");
        DomNode aTitleElement = aTitleList.get(0);

        assertThat(aTitleElement.asText()).isEqualTo("All Butter Croissant");

        final DomNodeList<DomNode> aPriceList = page.querySelectorAll("div.card-body h5");
        DomNode aPriceElement = aPriceList.get(1);

        assertThat(aPriceElement.asText()).isEqualTo("£0.95");
    }
}
