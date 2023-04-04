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

package com.liferay.sample.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.sample.service.model.SampleData;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SampleData in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SampleDataCacheModel
	implements CacheModel<SampleData>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SampleDataCacheModel)) {
			return false;
		}

		SampleDataCacheModel sampleDataCacheModel =
			(SampleDataCacheModel)object;

		if (sampleDataId == sampleDataCacheModel.sampleDataId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sampleDataId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", sampleDataId=");
		sb.append(sampleDataId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", mobileNumber=");
		sb.append(mobileNumber);
		sb.append(", email=");
		sb.append(email);
		sb.append(", product=");
		sb.append(product);
		sb.append(", expiryDate=");
		sb.append(expiryDate);
		sb.append(", hobbies=");
		sb.append(hobbies);
		sb.append(", consent=");
		sb.append(consent);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SampleData toEntityModel() {
		SampleDataImpl sampleDataImpl = new SampleDataImpl();

		if (uuid == null) {
			sampleDataImpl.setUuid("");
		}
		else {
			sampleDataImpl.setUuid(uuid);
		}

		sampleDataImpl.setSampleDataId(sampleDataId);
		sampleDataImpl.setGroupId(groupId);
		sampleDataImpl.setCompanyId(companyId);
		sampleDataImpl.setUserId(userId);

		if (userName == null) {
			sampleDataImpl.setUserName("");
		}
		else {
			sampleDataImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sampleDataImpl.setCreateDate(null);
		}
		else {
			sampleDataImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sampleDataImpl.setModifiedDate(null);
		}
		else {
			sampleDataImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			sampleDataImpl.setFirstName("");
		}
		else {
			sampleDataImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			sampleDataImpl.setLastName("");
		}
		else {
			sampleDataImpl.setLastName(lastName);
		}

		if (mobileNumber == null) {
			sampleDataImpl.setMobileNumber("");
		}
		else {
			sampleDataImpl.setMobileNumber(mobileNumber);
		}

		if (email == null) {
			sampleDataImpl.setEmail("");
		}
		else {
			sampleDataImpl.setEmail(email);
		}

		if (product == null) {
			sampleDataImpl.setProduct("");
		}
		else {
			sampleDataImpl.setProduct(product);
		}

		if (expiryDate == Long.MIN_VALUE) {
			sampleDataImpl.setExpiryDate(null);
		}
		else {
			sampleDataImpl.setExpiryDate(new Date(expiryDate));
		}

		if (hobbies == null) {
			sampleDataImpl.setHobbies("");
		}
		else {
			sampleDataImpl.setHobbies(hobbies);
		}

		if (consent == null) {
			sampleDataImpl.setConsent("");
		}
		else {
			sampleDataImpl.setConsent(consent);
		}

		sampleDataImpl.resetOriginalValues();

		return sampleDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		sampleDataId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		mobileNumber = objectInput.readUTF();
		email = objectInput.readUTF();
		product = objectInput.readUTF();
		expiryDate = objectInput.readLong();
		hobbies = objectInput.readUTF();
		consent = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(sampleDataId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (mobileNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobileNumber);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (product == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(product);
		}

		objectOutput.writeLong(expiryDate);

		if (hobbies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hobbies);
		}

		if (consent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consent);
		}
	}

	public String uuid;
	public long sampleDataId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String lastName;
	public String mobileNumber;
	public String email;
	public String product;
	public long expiryDate;
	public String hobbies;
	public String consent;

}