package org.xtext.example.lmrc.db2entity.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.xtext.example.lmrc.db.validation.DbDslJavaValidator;

public class AbstractDb2EntityDslJavaValidator extends DbDslJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.example.lmrc.db2entity.db2EntityDsl.Db2EntityDslPackage.eINSTANCE);
		return result;
	}

}
