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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ATMStatus3Code;
import com.tools20022.repository.codeset.CryptographicKeyType3Code;
import com.tools20022.repository.codeset.FailureReason6Code;
import com.tools20022.repository.codeset.KeyUsage1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Cryptographic Key component.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey7#mmName
 * CryptographicKey7.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmIdentification
 * CryptographicKey7.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmSecurityDomainIdentification
 * CryptographicKey7.mmSecurityDomainIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmAdditionalIdentification
 * CryptographicKey7.mmAdditionalIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey7#mmVersion
 * CryptographicKey7.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmSequenceCounter
 * CryptographicKey7.mmSequenceCounter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey7#mmType
 * CryptographicKey7.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey7#mmFunction
 * CryptographicKey7.mmFunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmActivationDate
 * CryptographicKey7.mmActivationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmDeactivationDate
 * CryptographicKey7.mmDeactivationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmKeyCheckValue
 * CryptographicKey7.mmKeyCheckValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmCurrentStatus
 * CryptographicKey7.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey7#mmFailureReason
 * CryptographicKey7.mmFailureReason}</li>
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
 * "CryptographicKey7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cryptographic Key component."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CryptographicKey6
 * CryptographicKey6}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey8
 * CryptographicKey8}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CryptographicKey7", propOrder = {"name", "identification", "securityDomainIdentification", "additionalIdentification", "version", "sequenceCounter", "type", "function", "activationDate", "deactivationDate",
		"keyCheckValue", "currentStatus", "failureReason"})
public class CryptographicKey7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text name;
	/**
	 * Name or label of the key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name or label of the key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6#mmName
	 * CryptographicKey6.mmName}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey8#mmName
	 * CryptographicKey8.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey7.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name or label of the key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey8.mmName);
			previousVersion_lazy = () -> CryptographicKey6.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max140Text identification;
	/**
	 * Name of the cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6#mmIdentification
	 * CryptographicKey6.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmIdentification
	 * CryptographicKey8.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey7.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Name of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey8.mmIdentification);
			previousVersion_lazy = () -> CryptographicKey6.mmIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max35Text securityDomainIdentification;
	/**
	 * Identification of the security domain.
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
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyDomnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDomainIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the security domain."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmSecurityDomainIdentification
	 * CryptographicKey8.mmSecurityDomainIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityDomainIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey7.mmObject();
			isDerived = false;
			xmlTag = "SctyDomnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDomainIdentification";
			definition = "Identification of the security domain.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey8.mmSecurityDomainIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Binary additionalIdentification;
	/**
	 * Additional identification of the key, for instance to derive the key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Binary
	 * Max35Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional identification of the key, for instance to derive the key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmAdditionalIdentification
	 * CryptographicKey8.mmAdditionalIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey7.mmObject();
			isDerived = false;
			xmlTag = "AddtlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalIdentification";
			definition = "Additional identification of the key, for instance to derive the key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey8.mmAdditionalIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}
	};
	protected Max256Text version;
	/**
	 * Version of the cryptographic key.
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
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
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
	 * definition} = "Version of the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6#mmVersion
	 * CryptographicKey6.mmVersion}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmVersion
	 * CryptographicKey8.mmVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey7.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey8.mmVersion);
			previousVersion_lazy = () -> CryptographicKey6.mmVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected Number sequenceCounter;
	/**
	 * Sequence counter of the cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqCntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceCounter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequence counter of the cryptographic key."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSequenceCounter = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey7.mmObject();
			isDerived = false;
			xmlTag = "SeqCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceCounter";
			definition = "Sequence counter of the cryptographic key.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected CryptographicKeyType3Code type;
	/**
	 * Type of algorithm used by the cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code
	 * CryptographicKeyType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of algorithm used by the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6#mmType
	 * CryptographicKey6.mmType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey8#mmType
	 * CryptographicKey8.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey7.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of algorithm used by the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey8.mmType);
			previousVersion_lazy = () -> CryptographicKey6.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CryptographicKeyType3Code.mmObject();
		}
	};
	protected List<KeyUsage1Code> function;
	/**
	 * Allowed usage of the key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Function"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allowed usage of the key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6#mmFunction
	 * CryptographicKey6.mmFunction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmFunction
	 * CryptographicKey8.mmFunction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFunction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey7.mmObject();
			isDerived = false;
			xmlTag = "Fctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Function";
			definition = "Allowed usage of the key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey8.mmFunction);
			previousVersion_lazy = () -> CryptographicKey6.mmFunction;
			minOccurs = 1;
			simpleType_lazy = () -> KeyUsage1Code.mmObject();
		}
	};
	protected ISODateTime activationDate;
	/**
	 * Date and time on which the key must be activated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time on which the key must be activated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6#mmActivationDate
	 * CryptographicKey6.mmActivationDate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmActivationDate
	 * CryptographicKey8.mmActivationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActivationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey7.mmObject();
			isDerived = false;
			xmlTag = "ActvtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivationDate";
			definition = "Date and time on which the key must be activated.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey8.mmActivationDate);
			previousVersion_lazy = () -> CryptographicKey6.mmActivationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime deactivationDate;
	/**
	 * Date and time on which the key must be deactivated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeactvtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time on which the key must be deactivated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey6#mmDeactivationDate
	 * CryptographicKey6.mmDeactivationDate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmDeactivationDate
	 * CryptographicKey8.mmDeactivationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeactivationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey7.mmObject();
			isDerived = false;
			xmlTag = "DeactvtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivationDate";
			definition = "Date and time on which the key must be deactivated.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey8.mmDeactivationDate);
			previousVersion_lazy = () -> CryptographicKey6.mmDeactivationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max35Binary keyCheckValue;
	/**
	 * Value for checking a cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Binary
	 * Max35Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyChckVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyCheckValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value for checking a cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmKeyCheckValue
	 * CryptographicKey8.mmKeyCheckValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmKeyCheckValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey7.mmObject();
			isDerived = false;
			xmlTag = "KeyChckVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyCheckValue";
			definition = "Value for checking a cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey8.mmKeyCheckValue);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}
	};
	protected ATMStatus3Code currentStatus;
	/**
	 * Current status of the key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMStatus3Code
	 * ATMStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current status of the key."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey7.mmObject();
			isDerived = false;
			xmlTag = "CurSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatus";
			definition = "Current status of the key.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMStatus3Code.mmObject();
		}
	};
	protected FailureReason6Code failureReason;
	/**
	 * Reason for which the key has been stopped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason6Code
	 * FailureReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FailrRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for which the key has been stopped."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFailureReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey7.mmObject();
			isDerived = false;
			xmlTag = "FailrRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailureReason";
			definition = "Reason for which the key has been stopped.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FailureReason6Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CryptographicKey7.mmName, CryptographicKey7.mmIdentification, CryptographicKey7.mmSecurityDomainIdentification, CryptographicKey7.mmAdditionalIdentification,
						CryptographicKey7.mmVersion, CryptographicKey7.mmSequenceCounter, CryptographicKey7.mmType, CryptographicKey7.mmFunction, CryptographicKey7.mmActivationDate, CryptographicKey7.mmDeactivationDate,
						CryptographicKey7.mmKeyCheckValue, CryptographicKey7.mmCurrentStatus, CryptographicKey7.mmFailureReason);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CryptographicKey7";
				definition = "Cryptographic Key component.";
				nextVersions_lazy = () -> Arrays.asList(CryptographicKey8.mmObject());
				previousVersion_lazy = () -> CryptographicKey6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Nm")
	public Max140Text getName() {
		return name;
	}

	public void setName(Max140Text name) {
		this.name = name;
	}

	@XmlElement(name = "Id")
	public Max140Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max140Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "SctyDomnId")
	public Max35Text getSecurityDomainIdentification() {
		return securityDomainIdentification;
	}

	public void setSecurityDomainIdentification(Max35Text securityDomainIdentification) {
		this.securityDomainIdentification = securityDomainIdentification;
	}

	@XmlElement(name = "AddtlId")
	public Max35Binary getAdditionalIdentification() {
		return additionalIdentification;
	}

	public void setAdditionalIdentification(Max35Binary additionalIdentification) {
		this.additionalIdentification = additionalIdentification;
	}

	@XmlElement(name = "Vrsn", required = true)
	public Max256Text getVersion() {
		return version;
	}

	public void setVersion(Max256Text version) {
		this.version = version;
	}

	@XmlElement(name = "SeqCntr")
	public Number getSequenceCounter() {
		return sequenceCounter;
	}

	public void setSequenceCounter(Number sequenceCounter) {
		this.sequenceCounter = sequenceCounter;
	}

	@XmlElement(name = "Tp", required = true)
	public CryptographicKeyType3Code getType() {
		return type;
	}

	public void setType(CryptographicKeyType3Code type) {
		this.type = type;
	}

	@XmlElement(name = "Fctn", required = true)
	public List<KeyUsage1Code> getFunction() {
		return function;
	}

	public void setFunction(List<KeyUsage1Code> function) {
		this.function = function;
	}

	@XmlElement(name = "ActvtnDt")
	public ISODateTime getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(ISODateTime activationDate) {
		this.activationDate = activationDate;
	}

	@XmlElement(name = "DeactvtnDt")
	public ISODateTime getDeactivationDate() {
		return deactivationDate;
	}

	public void setDeactivationDate(ISODateTime deactivationDate) {
		this.deactivationDate = deactivationDate;
	}

	@XmlElement(name = "KeyChckVal")
	public Max35Binary getKeyCheckValue() {
		return keyCheckValue;
	}

	public void setKeyCheckValue(Max35Binary keyCheckValue) {
		this.keyCheckValue = keyCheckValue;
	}

	@XmlElement(name = "CurSts", required = true)
	public ATMStatus3Code getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(ATMStatus3Code currentStatus) {
		this.currentStatus = currentStatus;
	}

	@XmlElement(name = "FailrRsn")
	public FailureReason6Code getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(FailureReason6Code failureReason) {
		this.failureReason = failureReason;
	}
}