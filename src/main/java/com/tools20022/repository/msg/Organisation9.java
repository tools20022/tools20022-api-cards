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
import com.tools20022.repository.codeset.ISO3NumericCountryCode;
import com.tools20022.repository.codeset.LocationCategory1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification32;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Merchant performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation9#mmIdentification
 * Organisation9.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation9#mmCommonName
 * Organisation9.mmCommonName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation9#mmLocationCategory
 * Organisation9.mmLocationCategory}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation9#mmAddress
 * Organisation9.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation9#mmCountryCode
 * Organisation9.mmCountryCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation9#mmSchemeData
 * Organisation9.mmSchemeData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Organisation9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Merchant performing the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Organisation9", propOrder = {"identification", "commonName", "locationCategory", "address", "countryCode", "schemeData"})
public class Organisation9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected GenericIdentification32 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation9 Organisation9}</li>
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
	 * definition} = "Identification of the merchant."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation9, GenericIdentification32> mmIdentification = new MMMessageAssociationEnd<Organisation9, GenericIdentification32>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation9.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the merchant.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public GenericIdentification32 getValue(Organisation9 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Organisation9 obj, GenericIdentification32 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "CmonNm")
	protected Max70Text commonName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation9 Organisation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the merchant as appearing on the receipt."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation9, Optional<Max70Text>> mmCommonName = new MMMessageAttribute<Organisation9, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation9.mmObject();
			isDerived = false;
			xmlTag = "CmonNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonName";
			definition = "Name of the merchant as appearing on the receipt.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(Organisation9 obj) {
			return obj.getCommonName();
		}

		@Override
		public void setValue(Organisation9 obj, Optional<Max70Text> value) {
			obj.setCommonName(value.orElse(null));
		}
	};
	@XmlElement(name = "LctnCtgy")
	protected LocationCategory1Code locationCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory1Code
	 * LocationCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation9 Organisation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LctnCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocationCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location category of the place where the merchant actually performed the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation9, Optional<LocationCategory1Code>> mmLocationCategory = new MMMessageAttribute<Organisation9, Optional<LocationCategory1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation9.mmObject();
			isDerived = false;
			xmlTag = "LctnCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocationCategory";
			definition = "Location category of the place where the merchant actually performed the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LocationCategory1Code.mmObject();
		}

		@Override
		public Optional<LocationCategory1Code> getValue(Organisation9 obj) {
			return obj.getLocationCategory();
		}

		@Override
		public void setValue(Organisation9 obj, Optional<LocationCategory1Code> value) {
			obj.setLocationCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "Adr")
	protected Max140Text address;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation9 Organisation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Adr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Address"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location of the merchant where the transaction took place, as appearing on the receipt."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation9, Optional<Max140Text>> mmAddress = new MMMessageAttribute<Organisation9, Optional<Max140Text>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation9.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Location of the merchant where the transaction took place, as appearing on the receipt.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(Organisation9 obj) {
			return obj.getAddress();
		}

		@Override
		public void setValue(Organisation9 obj, Optional<Max140Text> value) {
			obj.setAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryCd")
	protected ISO3NumericCountryCode countryCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ISO3NumericCountryCode
	 * ISO3NumericCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation9 Organisation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the merchant where the transaction took place."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation9, Optional<ISO3NumericCountryCode>> mmCountryCode = new MMMessageAttribute<Organisation9, Optional<ISO3NumericCountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation9.mmObject();
			isDerived = false;
			xmlTag = "CtryCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryCode";
			definition = "Country of the merchant where the transaction took place.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISO3NumericCountryCode.mmObject();
		}

		@Override
		public Optional<ISO3NumericCountryCode> getValue(Organisation9 obj) {
			return obj.getCountryCode();
		}

		@Override
		public void setValue(Organisation9 obj, Optional<ISO3NumericCountryCode> value) {
			obj.setCountryCode(value.orElse(null));
		}
	};
	@XmlElement(name = "SchmeData")
	protected Max140Text schemeData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation9 Organisation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchmeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SchemeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional merchant data required by a card scheme."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation9, Optional<Max140Text>> mmSchemeData = new MMMessageAttribute<Organisation9, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation9.mmObject();
			isDerived = false;
			xmlTag = "SchmeData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeData";
			definition = "Additional merchant data required by a card scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(Organisation9 obj) {
			return obj.getSchemeData();
		}

		@Override
		public void setValue(Organisation9 obj, Optional<Max140Text> value) {
			obj.setSchemeData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation9.mmIdentification, com.tools20022.repository.msg.Organisation9.mmCommonName,
						com.tools20022.repository.msg.Organisation9.mmLocationCategory, com.tools20022.repository.msg.Organisation9.mmAddress, com.tools20022.repository.msg.Organisation9.mmCountryCode,
						com.tools20022.repository.msg.Organisation9.mmSchemeData);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Organisation9";
				definition = "Merchant performing the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification32 getIdentification() {
		return identification;
	}

	public Organisation9 setIdentification(GenericIdentification32 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max70Text> getCommonName() {
		return commonName == null ? Optional.empty() : Optional.of(commonName);
	}

	public Organisation9 setCommonName(Max70Text commonName) {
		this.commonName = commonName;
		return this;
	}

	public Optional<LocationCategory1Code> getLocationCategory() {
		return locationCategory == null ? Optional.empty() : Optional.of(locationCategory);
	}

	public Organisation9 setLocationCategory(LocationCategory1Code locationCategory) {
		this.locationCategory = locationCategory;
		return this;
	}

	public Optional<Max140Text> getAddress() {
		return address == null ? Optional.empty() : Optional.of(address);
	}

	public Organisation9 setAddress(Max140Text address) {
		this.address = address;
		return this;
	}

	public Optional<ISO3NumericCountryCode> getCountryCode() {
		return countryCode == null ? Optional.empty() : Optional.of(countryCode);
	}

	public Organisation9 setCountryCode(ISO3NumericCountryCode countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	public Optional<Max140Text> getSchemeData() {
		return schemeData == null ? Optional.empty() : Optional.of(schemeData);
	}

	public Organisation9 setSchemeData(Max140Text schemeData) {
		this.schemeData = schemeData;
		return this;
	}
}