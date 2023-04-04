package SampleModule.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.sample.service.model.SampleData;
import com.liferay.sample.service.service.SampleDataLocalServiceUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;

import org.osgi.service.component.annotations.Component;

import SampleModule.constants.SampleModulePortletKeys;

@Component(immediate = true, property = { "javax.portlet.name=" + SampleModulePortletKeys.SAMPLEMODULE,
		"mvc.command.name=practiceProcessActionName" }, service = MVCActionCommand.class)
public class SampleActionCommand implements MVCActionCommand {

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {

		PortletPreferences prefs = actionRequest.getPreferences();
		System.out.println("action method called!!");
		String firstName = ParamUtil.getString(actionRequest, "firstName");
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		String contactNumber = ParamUtil.getString(actionRequest, "contactNumber");
		String email = ParamUtil.getString(actionRequest, "email");
		String product = ParamUtil.getString(actionRequest, "product");
		String expiryDate = ParamUtil.getString(actionRequest, "dateOfExpiry");
		String hobbies = ParamUtil.getString(actionRequest, "hobbies");
		String consent = ParamUtil.getString(actionRequest, "consent");
		System.out.println(expiryDate);
		System.out.println(firstName + " " + lastName);
		String isName = "[a-zA-Z]+";
		String isNumber = "^\\d{10}$";
		String isEmail = "^[\\w.+\\-]+@gmail\\.com$";
		Date today = new Date();
		Date formattedExpiryDate = null;
		try {
			formattedExpiryDate = new SimpleDateFormat("yyyy-MM-dd").parse(expiryDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("formattedExpiryDate: " + formattedExpiryDate);
		/*
		 * System.out.println(today+"today"); if(today.compareTo(expDate)>0)
		 * System.out.println("past date");
		 */
		if (firstName.matches(isName) && lastName.matches(isName)

				&& contactNumber.matches(isNumber) && email.matches(isEmail)

				&& today.compareTo(formattedExpiryDate) < 0) {
			System.out.println("data is valid");
			// SampleModel sample =
			// SampleLocalServiceUtil.createSample(CounterLocalServiceUtil.increment(Sample.class.getName()));
			SampleData sample = SampleDataLocalServiceUtil
					.createSampleData(CounterLocalServiceUtil.increment(SampleData.class.getName()));
			sample.setFirstName(firstName);
			sample.setLastName(lastName);
			sample.setMobileNumber(contactNumber);
			sample.setEmail(email);
			sample.setProduct(product);
			sample.setExpiryDate(formattedExpiryDate);
			sample.setHobbies(hobbies);
			sample.setConsent(consent);
			SampleDataLocalServiceUtil.addSampleData(sample);
			SessionMessages.add(actionRequest, "success");
		} else {
			System.out.println("data is invalid");
			SessionErrors.add(actionRequest, "error");
		}
		return false;

	}
	/*
	 * public static void main(String[] args) { String date="2023-04-20"; try { Date
	 * formattedExpiryDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
	 * System.out.println(formattedExpiryDate); } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
}
