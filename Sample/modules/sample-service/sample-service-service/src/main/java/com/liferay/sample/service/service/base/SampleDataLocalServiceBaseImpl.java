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

package com.liferay.sample.service.service.base;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.sample.service.model.SampleData;
import com.liferay.sample.service.service.SampleDataLocalService;
import com.liferay.sample.service.service.SampleDataLocalServiceUtil;
import com.liferay.sample.service.service.persistence.SampleDataPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the sample data local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.sample.service.service.impl.SampleDataLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.sample.service.service.impl.SampleDataLocalServiceImpl
 * @generated
 */
public abstract class SampleDataLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, SampleDataLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>SampleDataLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>SampleDataLocalServiceUtil</code>.
	 */

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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SampleData addSampleData(SampleData sampleData) {
		sampleData.setNew(true);

		return sampleDataPersistence.update(sampleData);
	}

	/**
	 * Creates a new sample data with the primary key. Does not add the sample data to the database.
	 *
	 * @param sampleDataId the primary key for the new sample data
	 * @return the new sample data
	 */
	@Override
	@Transactional(enabled = false)
	public SampleData createSampleData(long sampleDataId) {
		return sampleDataPersistence.create(sampleDataId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SampleData deleteSampleData(long sampleDataId)
		throws PortalException {

		return sampleDataPersistence.remove(sampleDataId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SampleData deleteSampleData(SampleData sampleData) {
		return sampleDataPersistence.remove(sampleData);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return sampleDataPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			SampleData.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return sampleDataPersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return sampleDataPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return sampleDataPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return sampleDataPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return sampleDataPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public SampleData fetchSampleData(long sampleDataId) {
		return sampleDataPersistence.fetchByPrimaryKey(sampleDataId);
	}

	/**
	 * Returns the sample data matching the UUID and group.
	 *
	 * @param uuid the sample data's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sample data, or <code>null</code> if a matching sample data could not be found
	 */
	@Override
	public SampleData fetchSampleDataByUuidAndGroupId(
		String uuid, long groupId) {

		return sampleDataPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sample data with the primary key.
	 *
	 * @param sampleDataId the primary key of the sample data
	 * @return the sample data
	 * @throws PortalException if a sample data with the primary key could not be found
	 */
	@Override
	public SampleData getSampleData(long sampleDataId) throws PortalException {
		return sampleDataPersistence.findByPrimaryKey(sampleDataId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(sampleDataLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SampleData.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("sampleDataId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			sampleDataLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(SampleData.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"sampleDataId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(sampleDataLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SampleData.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("sampleDataId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<SampleData>() {

				@Override
				public void performAction(SampleData sampleData)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, sampleData);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(SampleData.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return sampleDataPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement SampleDataLocalServiceImpl#deleteSampleData(SampleData) to avoid orphaned data");
		}

		return sampleDataLocalService.deleteSampleData(
			(SampleData)persistedModel);
	}

	@Override
	public BasePersistence<SampleData> getBasePersistence() {
		return sampleDataPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return sampleDataPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the sample datas matching the UUID and company.
	 *
	 * @param uuid the UUID of the sample datas
	 * @param companyId the primary key of the company
	 * @return the matching sample datas, or an empty list if no matches were found
	 */
	@Override
	public List<SampleData> getSampleDatasByUuidAndCompanyId(
		String uuid, long companyId) {

		return sampleDataPersistence.findByUuid_C(uuid, companyId);
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
	public List<SampleData> getSampleDatasByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SampleData> orderByComparator) {

		return sampleDataPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
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
	public SampleData getSampleDataByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return sampleDataPersistence.findByUUID_G(uuid, groupId);
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
	public List<SampleData> getSampleDatas(int start, int end) {
		return sampleDataPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of sample datas.
	 *
	 * @return the number of sample datas
	 */
	@Override
	public int getSampleDatasCount() {
		return sampleDataPersistence.countAll();
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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SampleData updateSampleData(SampleData sampleData) {
		return sampleDataPersistence.update(sampleData);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			SampleDataLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		sampleDataLocalService = (SampleDataLocalService)aopProxy;

		_setLocalServiceUtilService(sampleDataLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return SampleDataLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return SampleData.class;
	}

	protected String getModelClassName() {
		return SampleData.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = sampleDataPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		SampleDataLocalService sampleDataLocalService) {

		try {
			Field field = SampleDataLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, sampleDataLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	protected SampleDataLocalService sampleDataLocalService;

	@Reference
	protected SampleDataPersistence sampleDataPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		SampleDataLocalServiceBaseImpl.class);

}