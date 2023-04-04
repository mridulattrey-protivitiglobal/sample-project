/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.sample.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;liferay_SampleData&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SampleData
 * @generated
 */
public class SampleDataTable extends BaseTable<SampleDataTable> {

	public static final SampleDataTable INSTANCE = new SampleDataTable();

	public final Column<SampleDataTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, Long> sampleDataId = createColumn(
		"sampleDataId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SampleDataTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, String> firstName = createColumn(
		"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, String> lastName = createColumn(
		"lastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, String> mobileNumber = createColumn(
		"mobileNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, String> product = createColumn(
		"product", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, Date> expiryDate = createColumn(
		"expiryDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, String> hobbies = createColumn(
		"hobbies", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SampleDataTable, String> consent = createColumn(
		"consent", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private SampleDataTable() {
		super("liferay_SampleData", SampleDataTable::new);
	}

}