/*
 * ao-cdn-webapp - Content delivery network (CDN) as a Web Application.
 * Copyright (C) 2023, 2025, 2026  AO Industries, Inc.
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
module com.aoapps.cdn.webapp {
  exports com.aoapps.cdn.webapp;
  // Direct
  requires com.aoapps.cdn.data; // <groupId>com.aoapps</groupId><artifactId>ao-cdn-data</artifactId>
  requires com.aoapps.cdn.servlet; // <groupId>com.aoapps</groupId><artifactId>ao-cdn-servlet</artifactId>
  requires jakarta.servlet; // <groupId>jakarta.servlet</groupId><artifactId>jakarta.servlet-api</artifactId>
}
