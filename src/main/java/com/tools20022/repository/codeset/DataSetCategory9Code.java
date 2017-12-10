/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DataSetCategory9Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Category of data set to transfer to the point of interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#AcquirerParameters
 * DataSetCategory9Code.mmAcquirerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#ApplicationParameters
 * DataSetCategory9Code.mmApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#BatchCapture
 * DataSetCategory9Code.mmBatchCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#CaptureResponse
 * DataSetCategory9Code.mmCaptureResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#DelegationData
 * DataSetCategory9Code.mmDelegationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#ManagementPlan
 * DataSetCategory9Code.mmManagementPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#MerchantParameters
 * DataSetCategory9Code.mmMerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#SecurityParameters
 * DataSetCategory9Code.mmSecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#SoftwareModule
 * DataSetCategory9Code.mmSoftwareModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#StatusReport
 * DataSetCategory9Code.mmStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#TerminalParameters
 * DataSetCategory9Code.mmTerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#VendorParameters
 * DataSetCategory9Code.mmVendorParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#Parameters
 * DataSetCategory9Code.mmParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#TMSProtocolParameters
 * DataSetCategory9Code.mmTMSProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code#CertificateParameters
 * DataSetCategory9Code.mmCertificateParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
 * DataSetCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AQPR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DataSetCategory9Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Category of data set to transfer to the point of interaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataSetCategory9Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerParameters"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code AcquirerParameters = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerParameters";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.AcquirerParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code ApplicationParameters = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.ApplicationParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchCapture"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code BatchCapture = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchCapture";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.BatchCapture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaptureResponse"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code CaptureResponse = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CaptureResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.CaptureResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationData"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code DelegationData = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationData";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.DelegationData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementPlan"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code ManagementPlan = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManagementPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.ManagementPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code MerchantParameters = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.MerchantParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code SecurityParameters = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.SecurityParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareModule"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code SoftwareModule = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareModule";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.SoftwareModule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReport"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code StatusReport = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.StatusReport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code TerminalParameters = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.TerminalParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorParameters"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code VendorParameters = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorParameters";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.VendorParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameters"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code Parameters = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameters";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.Parameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolParameters"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code TMSProtocolParameters = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.TMSProtocolParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory9Code
	 * DataSetCategory9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateParameters"</li>
	 * </ul>
	 */
	public static final DataSetCategory9Code CertificateParameters = new DataSetCategory9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateParameters";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory9Code.mmObject();
			codeName = DataSetCategoryCode.CertificateParameters.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DataSetCategory9Code> codesByName = new LinkedHashMap<>();

	protected DataSetCategory9Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AQPR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetCategory9Code";
				definition = "Category of data set to transfer to the point of interaction.";
				trace_lazy = () -> DataSetCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory9Code.AcquirerParameters, com.tools20022.repository.codeset.DataSetCategory9Code.ApplicationParameters,
						com.tools20022.repository.codeset.DataSetCategory9Code.BatchCapture, com.tools20022.repository.codeset.DataSetCategory9Code.CaptureResponse, com.tools20022.repository.codeset.DataSetCategory9Code.DelegationData,
						com.tools20022.repository.codeset.DataSetCategory9Code.ManagementPlan, com.tools20022.repository.codeset.DataSetCategory9Code.MerchantParameters,
						com.tools20022.repository.codeset.DataSetCategory9Code.SecurityParameters, com.tools20022.repository.codeset.DataSetCategory9Code.SoftwareModule, com.tools20022.repository.codeset.DataSetCategory9Code.StatusReport,
						com.tools20022.repository.codeset.DataSetCategory9Code.TerminalParameters, com.tools20022.repository.codeset.DataSetCategory9Code.VendorParameters, com.tools20022.repository.codeset.DataSetCategory9Code.Parameters,
						com.tools20022.repository.codeset.DataSetCategory9Code.TMSProtocolParameters, com.tools20022.repository.codeset.DataSetCategory9Code.CertificateParameters);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcquirerParameters.getCodeName().get(), AcquirerParameters);
		codesByName.put(ApplicationParameters.getCodeName().get(), ApplicationParameters);
		codesByName.put(BatchCapture.getCodeName().get(), BatchCapture);
		codesByName.put(CaptureResponse.getCodeName().get(), CaptureResponse);
		codesByName.put(DelegationData.getCodeName().get(), DelegationData);
		codesByName.put(ManagementPlan.getCodeName().get(), ManagementPlan);
		codesByName.put(MerchantParameters.getCodeName().get(), MerchantParameters);
		codesByName.put(SecurityParameters.getCodeName().get(), SecurityParameters);
		codesByName.put(SoftwareModule.getCodeName().get(), SoftwareModule);
		codesByName.put(StatusReport.getCodeName().get(), StatusReport);
		codesByName.put(TerminalParameters.getCodeName().get(), TerminalParameters);
		codesByName.put(VendorParameters.getCodeName().get(), VendorParameters);
		codesByName.put(Parameters.getCodeName().get(), Parameters);
		codesByName.put(TMSProtocolParameters.getCodeName().get(), TMSProtocolParameters);
		codesByName.put(CertificateParameters.getCodeName().get(), CertificateParameters);
	}

	public static DataSetCategory9Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataSetCategory9Code[] values() {
		DataSetCategory9Code[] values = new DataSetCategory9Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataSetCategory9Code> {
		@Override
		public DataSetCategory9Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataSetCategory9Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}