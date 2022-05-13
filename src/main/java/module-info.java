/*
 * semanticcms-section-all - Convenience POM to include most SemanticCMS Section features, not including documentation or examples.
 * Copyright (C) 2021, 2022  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-section-all.
 *
 * semanticcms-section-all is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-section-all is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-section-all.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.semanticcms.section.all {
  // Direct
  requires transitive com.semanticcms.section.model; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-model</artifactId>
  requires transitive com.semanticcms.section.servlet; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-servlet</artifactId>
  requires transitive com.semanticcms.section.taglib; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-taglib</artifactId>
}
