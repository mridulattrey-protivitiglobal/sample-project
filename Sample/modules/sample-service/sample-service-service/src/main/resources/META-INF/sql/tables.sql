create table liferay_SampleData (
	uuid_ VARCHAR(75) null,
	sampleDataId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	mobileNumber VARCHAR(75) null,
	email VARCHAR(75) null,
	product VARCHAR(75) null,
	expiryDate DATE null,
	hobbies VARCHAR(75) null,
	consent VARCHAR(75) null
);