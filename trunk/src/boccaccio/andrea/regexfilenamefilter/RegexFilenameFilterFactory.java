/**
 * Copyright 2008 Andrea Boccaccio
 * e-mail:	andrea_boccaccio@yahoo.it
 * phone:	+393388098951
 * 
 *
 * This file is part of regexfilenamefilter.
 *
 *  regexfilenamefilter is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  regexfilenamefilter is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with regexfilenamefilter.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package boccaccio.andrea.regexfilenamefilter;

public class RegexFilenameFilterFactory {
	
	private static RegexFilenameFilterFactory instance = null;
	
	private RegexFilenameFilterFactory() {
		
	}
	
	public static RegexFilenameFilterFactory getInstance() {
		if(instance == null) instance = new RegexFilenameFilterFactory();
		return instance;
	}
	
	/**
	 * Construct a FilenameFilter from a regex as a filter.
	 * @param strRegex the regex used to filter filenames.
	 * @return return the FilenameFilter to filter filenames that
	 * match with the regex passed by parameter.
	 */
	public IRegexFilenameFilter buildRegexFilenameFilter(String strRegex) {
		return new ConcreteRegexFilenameFilter(strRegex);
	}

}
