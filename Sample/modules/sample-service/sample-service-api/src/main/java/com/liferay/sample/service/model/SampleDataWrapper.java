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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SampleData}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SampleData
 * @generated
 */
public class SampleDataWrapper
	extends BaseModelWrapper<SampleData>
	implements ModelWrapper<SampleData>, SampleData {

	public SampleDataWrapper(SampleData sampleData) {
		super(sampleData);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("sampleDataId", getSampleDataId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("mobileNumber", getMobileNumber());
		attributes.put("email", getEmail());
		attributes.put("product", getProduct());
		attributes.put("expiryDate", getExpiryDate());
		attributes.put("hobbies", getHobbies());
		attributes.put("consent", getConsent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long sampleDataId = (Long)attributes.get("sampleDataId");

		if (sampleDataId != null) {
			setSampleDataId(sampleDataId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String mobileNumber = (String)attributes.get("mobileNumber");

		if (mobileNumber != null) {
			setMobileNumber(mobileNumber);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String product = (String)attributes.get("product");

		if (product != null) {
			setProduct(product);
		}

		Date expiryDate = (Date)attributes.get("expiryDate");

		if (expiryDate != null) {
			setExpiryDate(expiryDate);
		}

		String hobbies = (String)attributes.get("hobbies");

		if (hobbies != null) {
			setHobbies(hobbies);
		}

		String consent = (String)attributes.get("consent");

		if (consent != null) {
			setConsent(consent);
		}
	}

	@Override
	public SampleData cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sample data.
	 *
	 * @return the company ID of this sample data
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the consent of this sample data.
	 *
	 * @return the consent of this sample data
	 */
	@Override
	public String getConsent() {
		return model.getConsent();
	}

	/**
	 * Returns the create date of this sample data.
	 *
	 * @return the create date of this sample data
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this sample data.
	 *
	 * @return the email of this sample data
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the expiry date of this sample data.
	 *
	 * @return the expiry date of this sample data
	 */
	@Override
	public Date getExpiryDate() {
		return model.getExpiryDate();
	}

	/**
	 * Returns the first name of this sample data.
	 *
	 * @return the first name of this sample data
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the group ID of this sample data.
	 *
	 * @return the group ID of this sample data
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hobbies of this sample data.
	 *
	 * @return the hobbies of this sample data
	 */
	@Override
	public String getHobbies() {
		return model.getHobbies();
	}

	/**
	 * Returns the last name of this sample data.
	 *
	 * @return the last name of this sample data
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the mobile number of this sample data.
	 *
	 * @return the mobile number of this sample data
	 */
	@Override
	public String getMobileNumber() {
		return model.getMobileNumber();
	}

	/**
	 * Returns the modified date of this sample data.
	 *
	 * @return the modified date of this sample data
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sample data.
	 *
	 * @return the primary key of this sample data
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product of this sample data.
	 *
	 * @return the product of this sample data
	 */
	@Override
	public String getProduct() {
		return model.getProduct();
	}

	/**
	 * Returns the sample data ID of this sample data.
	 *
	 * @return the sample data ID of this sample data
	 */
	@Override
	public long getSampleDataId() {
		return model.getSampleDataId();
	}

	/**
	 * Returns the user ID of this sample data.
	 *
	 * @return the user ID of this sample data
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sample data.
	 *
	 * @return the user name of this sample data
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sample data.
	 *
	 * @return the user uuid of this sample data
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this sample data.
	 *
	 * @return the uuid of this sample data
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this sample data.
	 *
	 * @param companyId the company ID of this sample data
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the consent of this sample data.
	 *
	 * @param consent the consent of this sample data
	 */
	@Override
	public void setConsent(String consent) {
		model.setConsent(consent);
	}

	/**
	 * Sets the create date of this sample data.
	 *
	 * @param createDate the create date of this sample data
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this sample data.
	 *
	 * @param email the email of this sample data
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the expiry date of this sample data.
	 *
	 * @param expiryDate the expiry date of this sample data
	 */
	@Override
	public void setExpiryDate(Date expiryDate) {
		model.setExpiryDate(expiryDate);
	}

	/**
	 * Sets the first name of this sample data.
	 *
	 * @param firstName the first name of this sample data
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the group ID of this sample data.
	 *
	 * @param groupId the group ID of this sample data
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hobbies of this sample data.
	 *
	 * @param hobbies the hobbies of this sample data
	 */
	@Override
	public void setHobbies(String hobbies) {
		model.setHobbies(hobbies);
	}

	/**
	 * Sets the last name of this sample data.
	 *
	 * @param lastName the last name of this sample data
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the mobile number of this sample data.
	 *
	 * @param mobileNumber the mobile number of this sample data
	 */
	@Override
	public void setMobileNumber(String mobileNumber) {
		model.setMobileNumber(mobileNumber);
	}

	/**
	 * Sets the modified date of this sample data.
	 *
	 * @param modifiedDate the modified date of this sample data
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sample data.
	 *
	 * @param primaryKey the primary key of this sample data
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product of this sample data.
	 *
	 * @param product the product of this sample data
	 */
	@Override
	public void setProduct(String product) {
		model.setProduct(product);
	}

	/**
	 * Sets the sample data ID of this sample data.
	 *
	 * @param sampleDataId the sample data ID of this sample data
	 */
	@Override
	public void setSampleDataId(long sampleDataId) {
		model.setSampleDataId(sampleDataId);
	}

	/**
	 * Sets the user ID of this sample data.
	 *
	 * @param userId the user ID of this sample data
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sample data.
	 *
	 * @param userName the user name of this sample data
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sample data.
	 *
	 * @param userUuid the user uuid of this sample data
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this sample data.
	 *
	 * @param uuid the uuid of this sample data
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected SampleDataWrapper wrap(SampleData sampleData) {
		return new SampleDataWrapper(sampleData);
	}

}