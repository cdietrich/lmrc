package org.xtext.example.lmrc.entity.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.xtext.example.lmrc.entity.entityDsl.Entity;

public class EntityDslNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	// By default Entities have FQN packagename.entityname
	// we want simply EntityName
	QualifiedName qualifiedName(Entity entity) {
		return QualifiedName.create(entity.getName());
	}

}
