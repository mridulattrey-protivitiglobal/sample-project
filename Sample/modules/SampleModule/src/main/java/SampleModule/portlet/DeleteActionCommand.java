package SampleModule.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.sample.service.model.SampleData;
import com.liferay.sample.service.service.SampleDataLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import SampleModule.constants.SampleModulePortletKeys;

@Component(immediate = true, property = { "javax.portlet.name=" + SampleModulePortletKeys.SAMPLEMODULE,
		"mvc.command.name=deleteProcessActionName" }, service = MVCActionCommand.class)
public class DeleteActionCommand implements MVCActionCommand{

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {

		long sampleDataId = ParamUtil.getLong(actionRequest, "sampleDataId");
		System.out.println(sampleDataId);
		try {
			SampleData sample = SampleDataLocalServiceUtil.deleteSampleData(sampleDataId);
		} catch (PortalException e) {
			e.printStackTrace();
		}
		actionResponse.getRenderParameters().setValue("jspPage","/showDetails.jsp");
		return false;
	}

}
