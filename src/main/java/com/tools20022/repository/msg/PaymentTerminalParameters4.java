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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Manufacturer configuration parameters of the point of interaction (POI).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmActionType
 * PaymentTerminalParameters4.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmVendorIdentification
 * PaymentTerminalParameters4.mmVendorIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmVersion
 * PaymentTerminalParameters4.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmClockSynchronisation
 * PaymentTerminalParameters4.mmClockSynchronisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmTimeZoneLine
 * PaymentTerminalParameters4.mmTimeZoneLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmLocalDateTime
 * PaymentTerminalParameters4.mmLocalDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4#mmOtherParameters
 * PaymentTerminalParameters4.mmOtherParameters}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTerminalParameters4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Manufacturer configuration parameters of the point of interaction (POI)."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentTerminalParameters4", propOrder = {"actionType", "vendorIdentification", "version", "clockSynchronisation", "timeZoneLine", "localDateTime", "otherParameters"})
public class PaymentTerminalParameters4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TerminalManagementAction3Code actionType;
	/**
	 * Type of action for the configuration parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4
	 * PaymentTerminalParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of action for the configuration parameters."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters4.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Type of action for the configuration parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}
	};
	protected Max35Text vendorIdentification;
	/**
	 * Identification of the vendor for the MTM, if the POI manages various
	 * subsets of terminal parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4
	 * PaymentTerminalParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VndrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the vendor for the MTM, if the POI manages various subsets of terminal parameters."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVendorIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters4.mmObject();
			isDerived = false;
			xmlTag = "VndrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorIdentification";
			definition = "Identification of the vendor for the MTM, if the POI manages various subsets of terminal parameters.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max256Text version;
	/**
	 * Version of the terminal parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4
	 * PaymentTerminalParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the terminal parameters."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters4.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the terminal parameters.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected ClockSynchronisation1 clockSynchronisation;
	/**
	 * Parameters to synchronise the real time clock of the POI (Point Of
	 * Interaction).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ClockSynchronisation1
	 * ClockSynchronisation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4
	 * PaymentTerminalParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClckSynctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClockSynchronisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters to synchronise the real time clock of the POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClockSynchronisation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters4.mmObject();
			isDerived = false;
			xmlTag = "ClckSynctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClockSynchronisation";
			definition = "Parameters to synchronise the real time clock of the POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ClockSynchronisation1.mmObject();
		}
	};
	protected List<Max70Text> timeZoneLine;
	/**
	 * Time zone line to update in the time zone data base subset stored in the
	 * POI (Point Of Interaction). The format of the line is conform to the IANA
	 * (Internet Assigned Number Authority) time zone data base.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4
	 * PaymentTerminalParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmZoneLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeZoneLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time zone line to update in the time zone data base subset stored in the POI (Point Of Interaction). The format of the line is conform to the IANA (Internet Assigned Number Authority) time zone data base."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTimeZoneLine = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters4.mmObject();
			isDerived = false;
			xmlTag = "TmZoneLine";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeZoneLine";
			definition = "Time zone line to update in the time zone data base subset stored in the POI (Point Of Interaction). The format of the line is conform to the IANA (Internet Assigned Number Authority) time zone data base.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.LocalDateTime1> localDateTime;
	/**
	 * Local time offset to UTC (Coordinated Universal Time).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LocalDateTime1
	 * LocalDateTime1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4
	 * PaymentTerminalParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Local time offset to UTC (Coordinated Universal Time)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocalDateTime = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters4.mmObject();
			isDerived = false;
			xmlTag = "LclDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalDateTime";
			definition = "Local time offset to UTC (Coordinated Universal Time).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LocalDateTime1.mmObject();
		}
	};
	protected Max10000Binary otherParameters;
	/**
	 * Others manufacturer configuration parameters of the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4
	 * PaymentTerminalParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Others manufacturer configuration parameters of the point of interaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerminalParameters4.mmObject();
			isDerived = false;
			xmlTag = "OthrParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParameters";
			definition = "Others manufacturer configuration parameters of the point of interaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentTerminalParameters4.mmActionType, PaymentTerminalParameters4.mmVendorIdentification, PaymentTerminalParameters4.mmVersion, PaymentTerminalParameters4.mmClockSynchronisation,
						PaymentTerminalParameters4.mmTimeZoneLine, PaymentTerminalParameters4.mmLocalDateTime, PaymentTerminalParameters4.mmOtherParameters);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTerminalParameters4";
				definition = "Manufacturer configuration parameters of the point of interaction (POI).";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ActnTp", required = true)
	public TerminalManagementAction3Code getActionType() {
		return actionType;
	}

	public void setActionType(TerminalManagementAction3Code actionType) {
		this.actionType = actionType;
	}

	@XmlElement(name = "VndrId")
	public Max35Text getVendorIdentification() {
		return vendorIdentification;
	}

	public void setVendorIdentification(Max35Text vendorIdentification) {
		this.vendorIdentification = vendorIdentification;
	}

	@XmlElement(name = "Vrsn")
	public Max256Text getVersion() {
		return version;
	}

	public void setVersion(Max256Text version) {
		this.version = version;
	}

	@XmlElement(name = "ClckSynctn")
	public ClockSynchronisation1 getClockSynchronisation() {
		return clockSynchronisation;
	}

	public void setClockSynchronisation(com.tools20022.repository.msg.ClockSynchronisation1 clockSynchronisation) {
		this.clockSynchronisation = clockSynchronisation;
	}

	@XmlElement(name = "TmZoneLine")
	public List<Max70Text> getTimeZoneLine() {
		return timeZoneLine;
	}

	public void setTimeZoneLine(List<Max70Text> timeZoneLine) {
		this.timeZoneLine = timeZoneLine;
	}

	@XmlElement(name = "LclDtTm")
	public List<LocalDateTime1> getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(List<com.tools20022.repository.msg.LocalDateTime1> localDateTime) {
		this.localDateTime = localDateTime;
	}

	@XmlElement(name = "OthrParams")
	public Max10000Binary getOtherParameters() {
		return otherParameters;
	}

	public void setOtherParameters(Max10000Binary otherParameters) {
		this.otherParameters = otherParameters;
	}
}