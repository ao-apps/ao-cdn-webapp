/*
 * ao-cdn-webapp - Content delivery network (CDN) as a Web Application.
 * Copyright (C) 2023  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of ao-cdn-webapp.
 *
 * ao-cdn-webapp is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ao-cdn-webapp is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ao-cdn-webapp.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.aoapps.cdn.webapp;

import com.aoapps.cdn.data.CdnData;
import com.aoapps.cdn.servlet.CdnServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * TODO: Implement.
 */
public class Index extends HttpServlet {

  private static final long serialVersionUID = 1L;

  /**
   * TODO: Implement.
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO: These are just marking dependencies as used
    log(String.valueOf(CdnData.EXTENSION_SEPARATOR));
    log(CdnServlet.class.getName());
  }
}
