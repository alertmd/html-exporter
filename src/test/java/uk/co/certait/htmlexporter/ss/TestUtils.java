/**
 * Copyright (C) 2012 alanhay <alanhay99@hotmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.certait.htmlexporter.ss;

import org.easymock.EasyMock;

public class TestUtils {
	public static TableCellReference createCell(int rowIndex, int columnIndex) {
		TableCellReference cell = EasyMock.createMock(TableCellReference.class);
		EasyMock.expect(cell.getRowIndex()).andReturn(rowIndex).anyTimes();
		EasyMock.expect(cell.getColumnIndex()).andReturn(columnIndex).anyTimes();

		EasyMock.replay(cell);

		return cell;
	}
}
