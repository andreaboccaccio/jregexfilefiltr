/**
 * Copyright 2008-2012 Andrea Boccaccio
 * e-mail:	andrea@andreaboccaccio.it
 * phone:	+393388098951
 * 
 *
 * This file is part of JavaRegexFilenameFilter.
 *
 *  JavaRegexFilenameFilter is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  JavaRegexFilenameFilter is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with JavaRegexFilenameFilter.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package boccaccio.andrea.regexfilenamefilter;

import java.util.regex.Pattern;

public class ConcreteRegexFilenameFilter extends AbsRegexFilenameFilter {
	
	@SuppressWarnings("unused")
	private ConcreteRegexFilenameFilter() {
		
	}
	
	protected ConcreteRegexFilenameFilter(String regex) {
		this.setPtrnRegex(Pattern.compile(regex));
	}

}
