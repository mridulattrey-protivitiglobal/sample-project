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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.sample.service.exception.NoSuchSampleDataException;
import com.liferay.sample.service.model.SampleData;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sample data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SampleDataUtil
 * @generated
 */
@ProviderType
public interface SampleDataPersistence extends BasePersistence<SampleData> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SampleDataUtil} to access the sample data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sample datas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sample datas
	 */
	public java.util.List<SampleData> findByUuid(String uuid);

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
	public java.util.List<SampleData> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<SampleData> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator);

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
	public java.util.List<SampleData> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sample data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public SampleData findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SampleData>
				orderByComparator)
		throws NoSuchSampleDataException;

	/**
	 * Returns the first sample data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public SampleData fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator);

	/**
	 * Returns the last sample data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public SampleData findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SampleData>
				orderByComparator)
		throws NoSuchSampleDataException;

	/**
	 * Returns the last sample data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public SampleData fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator);

	/**
	 * Returns the sample datas before and after the current sample data in the ordered set where uuid = &#63;.
	 *
	 * @param sampleDataId the primary key of the current sample data
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sample data
	 * @throws NoSuchSampleDataException if a sample data with the primary key could not be found
	 */
	public SampleData[] findByUuid_PrevAndNext(
			long sampleDataId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SampleData>
				orderByComparator)
		throws NoSuchSampleDataException;

	/**
	 * Removes all the sample datas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of sample datas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sample datas
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the sample data where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSampleDataException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public SampleData findByUUID_G(String uuid, long groupId)
		throws NoSuchSampleDataException;

	/**
	 * Returns the sample data where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public SampleData fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the sample data where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public SampleData fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the sample data where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sample data that was removed
	 */
	public SampleData removeByUUID_G(String uuid, long groupId)
		throws NoSuchSampleDataException;

	/**
	 * Returns the number of sample datas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sample datas
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the sample datas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sample datas
	 */
	public java.util.List<SampleData> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<SampleData> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<SampleData> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator);

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
	public java.util.List<SampleData> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sample data in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public SampleData findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SampleData>
				orderByComparator)
		throws NoSuchSampleDataException;

	/**
	 * Returns the first sample data in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public SampleData fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator);

	/**
	 * Returns the last sample data in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public SampleData findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SampleData>
				orderByComparator)
		throws NoSuchSampleDataException;

	/**
	 * Returns the last sample data in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public SampleData fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator);

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
	public SampleData[] findByUuid_C_PrevAndNext(
			long sampleDataId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SampleData>
				orderByComparator)
		throws NoSuchSampleDataException;

	/**
	 * Removes all the sample datas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of sample datas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sample datas
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the sample datas where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching sample datas
	 */
	public java.util.List<SampleData> findByGroupID(long groupId);

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
	public java.util.List<SampleData> findByGroupID(
		long groupId, int start, int end);

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
	public java.util.List<SampleData> findByGroupID(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator);

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
	public java.util.List<SampleData> findByGroupID(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sample data in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public SampleData findByGroupID_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<SampleData>
				orderByComparator)
		throws NoSuchSampleDataException;

	/**
	 * Returns the first sample data in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public SampleData fetchByGroupID_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator);

	/**
	 * Returns the last sample data in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample data
	 * @throws NoSuchSampleDataException if a matching sample data could not be found
	 */
	public SampleData findByGroupID_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<SampleData>
				orderByComparator)
		throws NoSuchSampleDataException;

	/**
	 * Returns the last sample data in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	public SampleData fetchByGroupID_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator);

	/**
	 * Returns the sample datas before and after the current sample data in the ordered set where groupId = &#63;.
	 *
	 * @param sampleDataId the primary key of the current sample data
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sample data
	 * @throws NoSuchSampleDataException if a sample data with the primary key could not be found
	 */
	public SampleData[] findByGroupID_PrevAndNext(
			long sampleDataId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<SampleData>
				orderByComparator)
		throws NoSuchSampleDataException;

	/**
	 * Removes all the sample datas where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupID(long groupId);

	/**
	 * Returns the number of sample datas where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching sample datas
	 */
	public int countByGroupID(long groupId);

	/**
	 * Caches the sample data in the entity cache if it is enabled.
	 *
	 * @param sampleData the sample data
	 */
	public void cacheResult(SampleData sampleData);

	/**
	 * Caches the sample datas in the entity cache if it is enabled.
	 *
	 * @param sampleDatas the sample datas
	 */
	public void cacheResult(java.util.List<SampleData> sampleDatas);

	/**
	 * Creates a new sample data with the primary key. Does not add the sample data to the database.
	 *
	 * @param sampleDataId the primary key for the new sample data
	 * @return the new sample data
	 */
	public SampleData create(long sampleDataId);

	/**
	 * Removes the sample data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sampleDataId the primary key of the sample data
	 * @return the sample data that was removed
	 * @throws NoSuchSampleDataException if a sample data with the primary key could not be found
	 */
	public SampleData remove(long sampleDataId)
		throws NoSuchSampleDataException;

	public SampleData updateImpl(SampleData sampleData);

	/**
	 * Returns the sample data with the primary key or throws a <code>NoSuchSampleDataException</code> if it could not be found.
	 *
	 * @param sampleDataId the primary key of the sample data
	 * @return the sample data
	 * @throws NoSuchSampleDataException if a sample data with the primary key could not be found
	 */
	public SampleData findByPrimaryKey(long sampleDataId)
		throws NoSuchSampleDataException;

	/**
	 * Returns the sample data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sampleDataId the primary key of the sample data
	 * @return the sample data, or <code>null</code> if a sample data with the primary key could not be found
	 */
	public SampleData fetchByPrimaryKey(long sampleDataId);

	/**
	 * Returns all the sample datas.
	 *
	 * @return the sample datas
	 */
	public java.util.List<SampleData> findAll();

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
	public java.util.List<SampleData> findAll(int start, int end);

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
	public java.util.List<SampleData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator);

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
	public java.util.List<SampleData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleData>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sample datas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sample datas.
	 *
	 * @return the number of sample datas
	 */
	public int countAll();

}