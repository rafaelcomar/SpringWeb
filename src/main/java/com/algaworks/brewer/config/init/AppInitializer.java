package com.algaworks.brewer.config.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.algaworks.brewer.config.WebConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

//	Aqui onde mostra ao spring onde achar nossos controllers.
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

//	antigo url mapping, mapeia todos os servlets e manda para o controller
//	através do Handler mapping
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
