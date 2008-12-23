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

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbsRegexFilenameFilter implements IRegexFilenameFilter {
	
	private Pattern ptrnRegex;

	public Pattern getPtrnRegex() {
		return ptrnRegex;
	}

	public void setPtrnRegex(Pattern ptrnRegex) {
		this.ptrnRegex = ptrnRegex;
	}

	@Override
	public boolean accept(File dir, String name) {
		boolean bRet = false;
		Matcher match = this.ptrnRegex.matcher(name);
		bRet = match.matches();
		return bRet;
	}

}
