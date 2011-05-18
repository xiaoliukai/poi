/*
 *  ====================================================================
 *    Licensed to the Apache Software Foundation (ASF) under one or more
 *    contributor license agreements.  See the NOTICE file distributed with
 *    this work for additional information regarding copyright ownership.
 *    The ASF licenses this file to You under the Apache License, Version 2.0
 *    (the "License"); you may not use this file except in compliance with
 *    the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 * ====================================================================
 */

package org.apache.poi.xssf.usermodel.streaming;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.BaseTestRow;
import org.apache.poi.xssf.SXSSFITestDataProvider;
import org.apache.poi.xssf.XSSFITestDataProvider;

/**
 * Tests for XSSFRow
 */
public final class TestSXSSFRow extends BaseTestRow {

    public TestSXSSFRow() {
        super(SXSSFITestDataProvider.instance);
    }

    public void testRowBounds() {
        //TODO fix me
        //baseTestRowBounds(SpreadsheetVersion.EXCEL2007.getLastRowIndex());
    }

    public void testCellBounds() {
        //TODO fix me
        //baseTestCellBounds(SpreadsheetVersion.EXCEL2007.getLastColumnIndex());
    }

    @Override
    public void testLastAndFirstColumns() {
        //TODO fix me
    }

    @Override
    public void testRemoveCell() {
        //TODO fix me
    }

    @Override
    public void testLastCellNumIsCorrectAfterAddCell_bug43901() {
        //TODO fix me
    }

    @Override
    public void testGetCellPolicy() {
        //TODO fix me
    }

    @Override
    public void testRowHeight() {
        //TODO fix me
    }

    @Override
    public void testCellIterator() {
        //TODO fix me
    }
}