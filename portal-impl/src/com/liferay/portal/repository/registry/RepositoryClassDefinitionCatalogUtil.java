/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.repository.registry;

import com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission;
import com.liferay.portal.repository.util.ExternalRepositoryFactory;

import java.util.Collection;

/**
 * @author Adolfo Pérez
 */
public class RepositoryClassDefinitionCatalogUtil {

	public static Collection<String> getExternalRepositoryClassNames() {
		return
			_repositoryClassDefinitionCatalog.getExternalRepositoryClassNames();
	}

	public static void registerLegacyExternalRepositoryFactory(
		String className, ExternalRepositoryFactory externalRepositoryFactory) {

		_repositoryClassDefinitionCatalog.
			registerLegacyExternalRepositoryFactory(
				className, externalRepositoryFactory);
	}

	public static void unregisterLegacyExternalRepositoryFactory(
		String className) {

		_repositoryClassDefinitionCatalog.
			unregisterLegacyExternalRepositoryFactory(className);
	}

	public void setRepositoryClassDefinitionCatalog(
		RepositoryClassDefinitionCatalog repositoryClassDefinitionCatalog) {

		PortalRuntimePermission.checkSetBeanProperty(getClass());

		_repositoryClassDefinitionCatalog = repositoryClassDefinitionCatalog;
	}

	private static RepositoryClassDefinitionCatalog
		_repositoryClassDefinitionCatalog;

}