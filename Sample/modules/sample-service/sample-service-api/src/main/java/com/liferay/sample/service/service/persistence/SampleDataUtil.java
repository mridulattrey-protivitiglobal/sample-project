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

package com.liferay.sample.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.sample.service.model.SampleData;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sample data service. This utility wraps <code>com.liferay.sample.service.service.persistence.impl.SampleDataPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SampleDataPersistence
 * @generated
 */
public class SampleDataUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(SampleData sampleData) {
		getPersistence().clearCache(sampleData);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, SampleData> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SampleData> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SampleData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SampleData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SampleData> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SampleData update(SampleData sampleData) {
		return getPersistence().update(sampleData);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SampleData update(
		SampleData sampleData, ServiceContext serviceContext) {

		return getPersistence().update(sampleData, serviceContext);
	}

	/**
	 * Returns all the sample datas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sample datas
	 */
	public static List<SampleData> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the sample datas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @return the range of matching sample datas
	 */
	public static List<SampleData> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the sample datas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sample datas
	 */
	public static List<SampleData> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SampleData> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sample datas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sample datas
	 */
	public static List<SampleData> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SampleData> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sample data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public static SampleData findByUuid_First(
			String uuid, OrderByComparator<SampleData> orderByComparator)
		throws com.liferay.sample.service.exception.NoSuchSampleDataException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first sample data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public static SampleData fetchByUuid_First(
		String uuid, OrderByComparator<SampleData> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last sample data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public static SampleData findByUuid_Last(
			String uuid, OrderByComparator<SampleData> orderByComparator)
		throws com.liferay.sample.service.exception.NoSuchSampleDataException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last sample data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public static SampleData fetchByUuid_Last(
		String uuid, OrderByComparator<SampleData> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the sample datas before and after the current sample data in the ordered set where uuid = &#63;.
	 *
	 * @param sampleDataId the primary key of the current sample data
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sample data
	 * @throws NoSuchSampleDataException if a sample data with the primary key could not be found
	 */
	public static SampleData[] findByUuid_PrevAndNext(
			long sampleDataId, String uuid,
			OrderByComparator<SampleData> orderByComparator)
		throws com.liferay.sample.service.exception.NoSuchSampleDataException {

		return getPersistence().findByUuid_PrevAndNext(
			sampleDataId, uuid, orderByComparator);
	}

	/**
	 * Removes all the sample datas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of sample datas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sample datas
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the sample data where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSampleDataException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public static SampleData findByUUID_G(String uuid, long groupId)
		throws com.liferay.sample.service.exception.NoSuchSampleDataException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sample data where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public static SampleData fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sample data where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public static SampleData fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the sample data where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sample data that was removed
	 */
	public static SampleData removeByUUID_G(String uuid, long groupId)
		throws com.liferay.sample.service.exception.NoSuchSampleDataException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of sample datas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sample datas
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the sample datas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sample datas
	 */
	public static List<SampleData> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the sample datas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @return the range of matching sample datas
	 */
	public static List<SampleData> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the sample datas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sample datas
	 */
	public static List<SampleData> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SampleData> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sample datas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sample datas
	 */
	public static List<SampleData> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SampleData> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sample data in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public static SampleData findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SampleData> orderByComparator)
		throws com.liferay.sample.service.exception.NoSuchSampleDataException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first sample data in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public static SampleData fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SampleData> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sample data in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public static SampleData findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SampleData> orderByComparator)
		throws com.liferay.sample.service.exception.NoSuchSampleDataException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sample data in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public static SampleData fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SampleData> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the sample datas before and after the current sample data in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sampleDataId the primary key of the current sample data
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sample data
	 * @throws NoSuchSampleDataException if a sample data with the primary key could not be found
	 */
	public static SampleData[] findByUuid_C_PrevAndNext(
			long sampleDataId, String uuid, long companyId,
			OrderByComparator<SampleData> orderByComparator)
		throws com.liferay.sample.service.exception.NoSuchSampleDataException {

		return getPersistence().findByUuid_C_PrevAndNext(
			sampleDataId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the sample datas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of sample datas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sample datas
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the sample datas where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching sample datas
	 */
	public static List<SampleData> findByGroupID(long groupId) {
		return getPersistence().findByGroupID(groupId);
	}

	/**
	 * Returns a range of all the sample datas where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @return the range of matching sample datas
	 */
	public static List<SampleData> findByGroupID(
		long groupId, int start, int end) {

		return getPersistence().findByGroupID(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the sample datas where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sample datas
	 */
	public static List<SampleData> findByGroupID(
		long groupId, int start, int end,
		OrderByComparator<SampleData> orderByComparator) {

		return getPersistence().findByGroupID(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sample datas where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sample datas
	 */
	public static List<SampleData> findByGroupID(
		long groupId, int start, int end,
		OrderByComparator<SampleData> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupID(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sample data in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public static SampleData findByGroupID_First(
			long groupId, OrderByComparator<SampleData> orderByComparator)
		throws com.liferay.sample.service.exception.NoSuchSampleDataException {

		return getPersistence().findByGroupID_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first sample data in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public static SampleData fetchByGroupID_First(
		long groupId, OrderByComparator<SampleData> orderByComparator) {

		return getPersistence().fetchByGroupID_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last sample data in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public static SampleData findByGroupID_Last(
			long groupId, OrderByComparator<SampleData> orderByComparator)
		throws com.liferay.sample.service.exception.NoSuchSampleDataException {

		return getPersistence().findByGroupID_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last sample data in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public static SampleData fetchByGroupID_Last(
		long groupId, OrderByComparator<SampleData> orderByComparator) {

		return getPersistence().fetchByGroupID_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the sample datas before and after the current sample data in the ordered set where groupId = &#63;.
	 *
	 * @param sampleDataId the primary key of the current sample data
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sample data
	 * @throws NoSuchSampleDataException if a sample data with the primary key could not be found
	 */
	public static SampleData[] findByGroupID_PrevAndNext(
			long sampleDataId, long groupId,
			OrderByComparator<SampleData> orderByComparator)
		throws com.liferay.sample.service.exception.NoSuchSampleDataException {

		return getPersistence().findByGroupID_PrevAndNext(
			sampleDataId, groupId, orderByComparator);
	}

	/**
	 * Removes all the sample datas where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupID(long groupId) {
		getPersistence().removeByGroupID(groupId);
	}

	/**
	 * Returns the number of sample datas where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching sample datas
	 */
	public static int countByGroupID(long groupId) {
		return getPersistence().countByGroupID(groupId);
	}

	/**
	 * Caches the sample data in the entity cache if it is enabled.
	 *
	 * @param sampleData the sample data
	 */
	public static void cacheResult(SampleData sampleData) {
		getPersistence().cacheResult(sampleData);
	}

	/**
	 * Caches the sample datas in the entity cache if it is enabled.
	 *
	 * @param sampleDatas the sample datas
	 */
	public static void cacheResult(List<SampleData> sampleDatas) {
		getPersistence().cacheResult(sampleDatas);
	}

	/**
	 * Creates a new sample data with the primary key. Does not add the sample data to the database.
	 *
	 * @param sampleDataId the primary key for the new sample data
	 * @return the new sample data
	 */
	public static SampleData create(long sampleDataId) {
		return getPersistence().create(sampleDataId);
	}

	/**
	 * Removes the sample data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sampleDataId the primary key of the sample data
	 * @return the sample data that was removed
	 * @throws NoSuchSampleDataException if a sample data with the primary key could not be found
	 */
	public static SampleData remove(long sampleDataId)
		throws com.liferay.sample.service.exception.NoSuchSampleDataException {

		return getPersistence().remove(sampleDataId);
	}

	public static SampleData updateImpl(SampleData sampleData) {
		return getPersistence().updateImpl(sampleData);
	}

	/**
	 * Returns the sample data with the primary key or throws a <code>NoSuchSampleDataException</code> if it could not be found.
	 *
	 * @param sampleDataId the primary key of the sample data
	 * @return the sample data
	 * @throws NoSuchSampleDataException if a sample data with the primary key could not be found
	 */
	public static SampleData findByPrimaryKey(long sampleDataId)
		throws com.liferay.sample.service.exception.NoSuchSampleDataException {

		return getPersistence().findByPrimaryKey(sampleDataId);
	}

	/**
	 * Returns the sample data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sampleDataId the primary key of the sample data
	 * @return the sample data, or <code>null</code> if a sample data with the primary key could not be found
	 */
	public static SampleData fetchByPrimaryKey(long sampleDataId) {
		return getPersistence().fetchByPrimaryKey(sampleDataId);
	}

	/**
	 * Returns all the sample datas.
	 *
	 * @return the sample datas
	 */
	public static List<SampleData> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sample datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @return the range of sample datas
	 */
	public static List<SampleData> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sample datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sample datas
	 */
	public static List<SampleData> findAll(
		int start, int end, OrderByComparator<SampleData> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sample datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sample datas
	 */
	public static List<SampleData> findAll(
		int start, int end, OrderByComparator<SampleData> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sample datas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sample datas.
	 *
	 * @return the number of sample datas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SampleDataPersistence getPersistence() {
		return _persistence;
	}

	private static volatile SampleDataPersistence _persistence;

}