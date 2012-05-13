/*
 * Copyright (c) 2012, bad robot (london) ltd.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package bad.robot.excel;

import bad.robot.excel.valuetypes.ExcelColumnIndex;
import org.apache.poi.ss.usermodel.Cell;

public class PoiToExcelCoordinateCoercions {

    public static String asExcelCoordinate(Cell cell) {
        return asExcelColumn(cell) + asExcelRow(cell);
    }

    private static String asExcelColumn(Cell cell) {
        return ExcelColumnIndex.from(cell.getColumnIndex()).name();
    }

    private static int asExcelRow(Cell cell) {
        return cell.getRowIndex() + 1;
    }
}