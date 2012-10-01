/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.exo.cross.demojuzu;

import juzu.impl.common.Path;
import juzu.impl.plugin.template.TemplatePlugin;
import juzu.template.Template;

/**
 * Created by The eXo Platform SAS
 * Author : Canh Pham Van
 *          canhpv@exoplatform.com
 * Oct 1, 2012  
 */
public class index extends Template{

  public index(TemplatePlugin applicationContext) {
    super(applicationContext, "index.gtmpl");
    // TODO Auto-generated constructor stub
  }

  @Override
  public Builder with() {
    // TODO Auto-generated method stub
    return null;
  }

}
