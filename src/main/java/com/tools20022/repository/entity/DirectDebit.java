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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Payment, initiated by the creditor, to debit a debtor's account in favour of
 * the creditor. A direct debit can be pre-authorised or not. In most countries,
 * authorisation is in the form of a mandate between the debtor and creditor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DirectDebit" src="doc-files/DirectDebit.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmRegistrationIdentification
 * DirectDebit.mmRegistrationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmDirectDebitMandate
 * DirectDebit.mmDirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmPreNotificationIdentification
 * DirectDebit.mmPreNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmPreNotificationDate
 * DirectDebit.mmPreNotificationDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmRelatedDirectDebit
 * DirectDebitMandate.mmRelatedDirectDebit}</li>
 * </ul>
 * </li>
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
 * "DirectDebit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor."
 * </li>
 * </ul>
 */
public class DirectDebit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text registrationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<DirectDebit, Max35Text> mmRegistrationIdentification = new MMBusinessAttribute<DirectDebit, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationIdentification";
			definition = "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DirectDebit obj) {
			return obj.getRegistrationIdentification();
		}

		@Override
		public void setValue(DirectDebit obj, Max35Text value) {
			obj.setRegistrationIdentification(value);
		}
	};
	protected DirectDebitMandate directDebitMandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmRelatedDirectDebit
	 * DirectDebitMandate.mmRelatedDirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebitMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the direct debit mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<DirectDebit, DirectDebitMandate> mmDirectDebitMandate = new MMBusinessAssociationEnd<DirectDebit, DirectDebitMandate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DirectDebitMandate";
			definition = "Set of elements providing information specific to the direct debit mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DirectDebitMandate.mmRelatedDirectDebit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DirectDebitMandate.mmObject();
		}

		@Override
		public DirectDebitMandate getValue(DirectDebit obj) {
			return obj.getDirectDebitMandate();
		}

		@Override
		public void setValue(DirectDebit obj, DirectDebitMandate value) {
			obj.setDirectDebitMandate(value);
		}
	};
	protected Max35Text preNotificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\nUsage: the direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<DirectDebit, Max35Text> mmPreNotificationIdentification = new MMBusinessAttribute<DirectDebit, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreNotificationIdentification";
			definition = "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\nUsage: the direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DirectDebit obj) {
			return obj.getPreNotificationIdentification();
		}

		@Override
		public void setValue(DirectDebit obj, Max35Text value) {
			obj.setPreNotificationIdentification(value);
		}
	};
	protected ISODate preNotificationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreNotificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<DirectDebit, ISODate> mmPreNotificationDate = new MMBusinessAttribute<DirectDebit, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DirectDebit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreNotificationDate";
			definition = "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(DirectDebit obj) {
			return obj.getPreNotificationDate();
		}

		@Override
		public void setValue(DirectDebit obj, ISODate value) {
			obj.setPreNotificationDate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DirectDebit";
				definition = "Payment, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor.";
				associationDomain_lazy = () -> Arrays.asList(DirectDebitMandate.mmRelatedDirectDebit);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebit.mmRegistrationIdentification, com.tools20022.repository.entity.DirectDebit.mmDirectDebitMandate,
						com.tools20022.repository.entity.DirectDebit.mmPreNotificationIdentification, com.tools20022.repository.entity.DirectDebit.mmPreNotificationDate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return DirectDebit.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getRegistrationIdentification() {
		return registrationIdentification;
	}

	public DirectDebit setRegistrationIdentification(Max35Text registrationIdentification) {
		this.registrationIdentification = Objects.requireNonNull(registrationIdentification);
		return this;
	}

	public DirectDebitMandate getDirectDebitMandate() {
		return directDebitMandate;
	}

	public DirectDebit setDirectDebitMandate(DirectDebitMandate directDebitMandate) {
		this.directDebitMandate = Objects.requireNonNull(directDebitMandate);
		return this;
	}

	public Max35Text getPreNotificationIdentification() {
		return preNotificationIdentification;
	}

	public DirectDebit setPreNotificationIdentification(Max35Text preNotificationIdentification) {
		this.preNotificationIdentification = Objects.requireNonNull(preNotificationIdentification);
		return this;
	}

	public ISODate getPreNotificationDate() {
		return preNotificationDate;
	}

	public DirectDebit setPreNotificationDate(ISODate preNotificationDate) {
		this.preNotificationDate = Objects.requireNonNull(preNotificationDate);
		return this;
	}
}