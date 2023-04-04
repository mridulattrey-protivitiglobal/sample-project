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

package com.liferay.sample.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SampleDataLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SampleDataLocalService
 * @generated
 */
public class SampleDataLocalServiceWrapper
	implements SampleDataLocalService, ServiceWrapper<SampleDataLocalService> {

	public SampleDataLocalServiceWrapper() {
		this(null);
	}

	public SampleDataLocalServiceWrapper(
		SampleDataLocalService sampleDataLocalService) {

		_sampleDataLocalService = sampleDataLocalService;
	}

	/**
	 * Adds the sample data to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SampleDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sampleData the sample data
	 * @return the sample data that was added
	 */
	@Override
	public com.liferay.sample.service.model.SampleData addSampleData(
		com.liferay.sample.service.model.SampleData sampleData) {

		return _sampleDataLocalService.addSampleData(sampleData);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sampleDataLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sample data with the primary key. Does not add the sample data to the database.
	 *
	 * @param sampleDataId the primary key for the new sample data
	 * @return the new sample data
	 */
	@Override
	public com.liferay.sample.service.model.SampleData createSampleData(
		long sampleDataId) {

		return _sampleDataLocalService.createSampleData(sampleDataId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sampleDataLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sample data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SampleDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sampleDataId the primary key of the sample data
	 * @return the sample data that was removed
	 * @throws PortalException if a sample data with the primary key could not be found
	 */
	@Override
	public com.liferay.sample.service.model.SampleData deleteSampleData(
			long sampleDataId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sampleDataLocalService.deleteSampleData(sampleDataId);
	}

	/**
	 * Deletes the sample data from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SampleDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sampleData the sample data
	 * @return the sample data that was removed
	 */
	@Override
	public com.liferay.sample.service.model.SampleData deleteSampleData(
		com.liferay.sample.service.model.SampleData sampleData) {

		return _sampleDataLocalService.deleteSampleData(sampleData);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sampleDataLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sampleDataLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sampleDataLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _sampleDataLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.sample.service.model.impl.SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _sampleDataLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.sample.service.model.impl.SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _sampleDataLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _sampleDataLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _sampleDataLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.sample.service.model.SampleData fetchSampleData(
		long sampleDataId) {

		return _sampleDataLocalService.fetchSampleData(sampleDataId);
	}

	/**
	 * Returns the sample data matching the UUID and group.
	 *
	 * @param uuid the sample data's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	@Override
	public com.liferay.sample.service.model.SampleData
		fetchSampleDataByUuidAndGroupId(String uuid, long groupId) {

		return _sampleDataLocalService.fetchSampleDataByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sampleDataLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _sampleDataLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sampleDataLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sampleDataLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sampleDataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sample data with the primary key.
	 *
	 * @param sampleDataId the primary key of the sample data
	 * @return the sample data
	 * @throws PortalException if a sample data with the primary key could not be found
	 */
	@Override
	public com.liferay.sample.service.model.SampleData getSampleData(
			long sampleDataId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sampleDataLocalService.getSampleData(sampleDataId);
	}

	/**
	 * Returns the sample data matching the UUID and group.
	 *
	 * @param uuid the sample data's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sample data
	 * @throws PortalException if a matching sample data could not be found
	 */
	@Override
	public com.liferay.sample.service.model.SampleData
			getSampleDataByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sampleDataLocalService.getSampleDataByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the sample datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.sample.service.model.impl.SampleDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @return the range of sample datas
	 */
	@Override
	public java.util.List<com.liferay.sample.service.model.SampleData>
		getSampleDatas(int start, int end) {

		return _sampleDataLocalService.getSampleDatas(start, end);
	}

	/**
	 * Returns all the sample datas matching the UUID and company.
	 *
	 * @param uuid the UUID of the sample datas
	 * @param companyId the primary key of the company
	 * @return the matching sample datas, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.sample.service.model.SampleData>
		getSampleDatasByUuidAndCompanyId(String uuid, long companyId) {

		return _sampleDataLocalService.getSampleDatasByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of sample datas matching the UUID and company.
	 *
	 * @param uuid the UUID of the sample datas
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sample datas
	 * @param end the upper bound of the range of sample datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sample datas, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.sample.service.model.SampleData>
		getSampleDatasByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.sample.service.model.SampleData>
					orderByComparator) {

		return _sampleDataLocalService.getSampleDatasByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sample datas.
	 *
	 * @return the number of sample datas
	 */
	@Override
	public int getSampleDatasCount() {
		return _sampleDataLocalService.getSampleDatasCount();
	}

	/**
	 * Updates the sample data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SampleDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sampleData the sample data
	 * @return the sample data that was updated
	 */
	@Override
	public com.liferay.sample.service.model.SampleData updateSampleData(
		com.liferay.sample.service.model.SampleData sampleData) {

		return _sampleDataLocalService.updateSampleData(sampleData);
	}

	@Override
	public SampleDataLocalService getWrappedService() {
		return _sampleDataLocalService;
	}

	@Override
	public void setWrappedService(
		SampleDataLocalService sampleDataLocalService) {

		_sampleDataLocalService = sampleDataLocalService;
	}

	private SampleDataLocalService _sampleDataLocalService;

}