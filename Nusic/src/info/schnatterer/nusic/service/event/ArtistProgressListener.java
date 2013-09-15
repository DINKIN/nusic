/* Copyright (C) 2013 Johannes Schnatterer
 * 
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *  
 * This file is part of nusic.
 * 
 * nusic is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * nusic is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with nusic.  If not, see <http://www.gnu.org/licenses/>.
 */
package info.schnatterer.nusic.service.event;

import info.schnatterer.nusic.db.model.Artist;

import org.apache.commons.lang3.ObjectUtils.Null;

/**
 * Returns <code>true</code>, if anything changed, otherwise <code>false</code>
 * or {@link Null}.
 * 
 * @author schnatterer
 * 
 */
public interface ArtistProgressListener extends
		ProgressListener<Artist, Boolean> {

}