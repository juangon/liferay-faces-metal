/**
 * Copyright (c) 2000-2017 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.metal.component.inputfile.internal;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import com.liferay.faces.util.model.UploadedFile;


/**
 * @author  Neil Griffin
 */
public interface InputFileDecoder {

	public Map<String, List<UploadedFile>> decode(FacesContext facesContext, String location);
}
