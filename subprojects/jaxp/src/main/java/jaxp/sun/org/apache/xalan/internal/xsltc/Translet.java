/*
 *  This file is part of AndroidIDE.
 *
 *  AndroidIDE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  AndroidIDE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with AndroidIDE.  If not, see <https://www.gnu.org/licenses/>.
 */

/*
 * reserved comment block
 * DO NOT REMOVE OR ALTER!
 */
/*
 * Copyright 2001-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * $Id: Translet.java,v 1.2.4.1 2005/08/31 10:46:27 pvedula Exp $
 */

package jaxp.sun.org.apache.xalan.internal.xsltc;

import jaxp.sun.org.apache.xml.internal.dtm.DTMAxisIterator;
import jaxp.sun.org.apache.xml.internal.serializer.SerializationHandler;

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
public interface Translet {

    public void transform(DOM document, SerializationHandler handler)
        throws TransletException;
    public void transform(DOM document, SerializationHandler[] handlers)
        throws TransletException;
    public void transform(DOM document, DTMAxisIterator iterator,
                          SerializationHandler handler)
        throws TransletException;

    public Object addParameter(String name, Object value);

    public void buildKeys(DOM document, DTMAxisIterator iterator,
                          SerializationHandler handler, int root)
        throws TransletException;
    public void addAuxiliaryClass(Class auxClass);
    public Class getAuxiliaryClass(String className);
    public String[] getNamesArray();
    public String[] getUrisArray();
    public int[]    getTypesArray();
    public String[] getNamespaceArray();
    public boolean useServicesMechnism();
    public void setServicesMechnism(boolean flag);

}
