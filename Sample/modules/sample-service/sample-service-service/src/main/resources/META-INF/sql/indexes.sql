create index IX_6DCB1CBF on liferay_SampleData (groupId);
create index IX_4F18217F on liferay_SampleData (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_9EE8FBC1 on liferay_SampleData (uuid_[$COLUMN_LENGTH:75$], groupId);