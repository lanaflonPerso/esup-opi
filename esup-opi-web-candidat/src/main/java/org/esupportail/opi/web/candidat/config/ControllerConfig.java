package org.esupportail.opi.web.candidat.config;

import org.esupportail.commons.services.i18n.I18nService;
import org.esupportail.opi.domain.DomainApoService;
import org.esupportail.opi.domain.DomainService;
import org.esupportail.opi.web.candidat.controllers.CandidaturesController;
import org.esupportail.opi.web.candidat.controllers.CoordonneesController;
import org.esupportail.opi.web.candidat.controllers.CursusController;
import org.springframework.context.annotation.*;

import javax.inject.Inject;



@Lazy
@Configuration
public class ControllerConfig {

    @Inject
    private DomainService domainService;

    @Inject
    private DomainApoService apoService;

    @Inject
    private I18nService i18nService;

    @Bean
    @Scope("view")
    public CoordonneesController coordonneesController() {
        return CoordonneesController.coordonneesController(domainService, apoService, i18nService);
    }

    @Bean
    @Scope("view")
    public CursusController cursusController() {
        return CursusController.cursusController(domainService, apoService, i18nService);
    }

    @Bean
    @Scope("view")
    public CandidaturesController candidaturesController() {
        return CandidaturesController.candidaturesController(domainService, apoService, i18nService);
    }

}