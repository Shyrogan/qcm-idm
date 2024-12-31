package qcm.m2m;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import qcm.Questionnaire;
import qcm.dsl.DSLStandaloneSetup;

public class M2M {
	public static void main(String[] args) {
		Injector injector = new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		Resource resource = resourceSet.createResource(URI.createURI("model/model.qcm"));
		try {
			resource.load(resourceSet.getLoadOptions());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Questionnaire questionnaire = (Questionnaire) resource.getContents().get(0);
		System.out.print(questionnaire);
	}
}