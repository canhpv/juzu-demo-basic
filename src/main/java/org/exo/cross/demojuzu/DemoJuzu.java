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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import juzu.Action;
import juzu.Path;
import juzu.Response;
import juzu.View;
import juzu.template.Template;

/**
 * Created by The eXo Platform SAS
 * Author : Canh Pham Van
 *          canhpv@exoplatform.com
 * Sep 28, 2012  
 */
public class DemoJuzu {
  static Set<String> languages = new HashSet<String>();  
  static Set<String> others = new HashSet<String>();  
  @Inject
  @Path("index.gtmpl")
  Template index;
  
  @View
  public void index(){
    index("French");
  }
  
  @View
  public void index(String temp2){
    Map<String,Object> parameters = new HashMap<String, Object>();
    parameters.put("location", temp2);
    parameters.put("name", "Julien Viet");
    parameters.put("others", others);
    index.render(parameters);
    
  }
  
  @Action
  public Response add(String other){
    others.add(other);
    return DemoJuzu_.index(other);
  }
}
