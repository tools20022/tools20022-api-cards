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
import com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of transactions to capture, sharing common characteristics.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet19#mmDataSetIdentification
 * CardPaymentDataSet19.mmDataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet19#mmTraceability
 * CardPaymentDataSet19.mmTraceability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet19#mmDataSetInitiator
 * CardPaymentDataSet19.mmDataSetInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet19#mmTransactionTotals
 * CardPaymentDataSet19.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet19#mmCommonData
 * CardPaymentDataSet19.mmCommonData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet19#mmTransaction
 * CardPaymentDataSet19.mmTransaction}</li>
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
 * "CardPaymentDataSet19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of transactions to capture, sharing common characteristics."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentDataSet19", propOrder = {"dataSetIdentification", "traceability", "dataSetInitiator", "transactionTotals", "commonData", "transaction"})
public class CardPaymentDataSet19 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataSetId", required = true)
	protected DataSetIdentification5 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification5
	 * DataSetIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet19
	 * CardPaymentDataSet19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the data set."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet19, DataSetIdentification5> mmDataSetIdentification = new MMMessageAssociationEnd<CardPaymentDataSet19, DataSetIdentification5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet19.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Identification of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DataSetIdentification5.mmObject();
		}

		@Override
		public DataSetIdentification5 getValue(CardPaymentDataSet19 obj) {
			return obj.getDataSetIdentification();
		}

		@Override
		public void setValue(CardPaymentDataSet19 obj, DataSetIdentification5 value) {
			obj.setDataSetIdentification(value);
		}
	};
	@XmlElement(name = "Tracblt")
	protected List<Traceability5> traceability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Traceability5
	 * Traceability5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet19
	 * CardPaymentDataSet19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tracblt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traceability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of partners involved in the data set building."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet19, List<Traceability5>> mmTraceability = new MMMessageAssociationEnd<CardPaymentDataSet19, List<Traceability5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet19.mmObject();
			isDerived = false;
			xmlTag = "Tracblt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traceability";
			definition = "Identification of partners involved in the data set building.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Traceability5.mmObject();
		}

		@Override
		public List<Traceability5> getValue(CardPaymentDataSet19 obj) {
			return obj.getTraceability();
		}

		@Override
		public void setValue(CardPaymentDataSet19 obj, List<Traceability5> value) {
			obj.setTraceability(value);
		}
	};
	@XmlElement(name = "DataSetInitr")
	protected GenericIdentification53 dataSetInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53
	 * GenericIdentification53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet19
	 * CardPaymentDataSet19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetInitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initiator of the data set."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet19, Optional<GenericIdentification53>> mmDataSetInitiator = new MMMessageAssociationEnd<CardPaymentDataSet19, Optional<GenericIdentification53>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet19.mmObject();
			isDerived = false;
			xmlTag = "DataSetInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetInitiator";
			definition = "Initiator of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification53.mmObject();
		}

		@Override
		public Optional<GenericIdentification53> getValue(CardPaymentDataSet19 obj) {
			return obj.getDataSetInitiator();
		}

		@Override
		public void setValue(CardPaymentDataSet19 obj, Optional<GenericIdentification53> value) {
			obj.setDataSetInitiator(value.orElse(null));
		}
	};
	@XmlElement(name = "TxTtls", required = true)
	protected List<TransactionTotals7> transactionTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionTotals7
	 * TransactionTotals7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet19
	 * CardPaymentDataSet19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction totals of the data set."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet19, List<TransactionTotals7>> mmTransactionTotals = new MMMessageAssociationEnd<CardPaymentDataSet19, List<TransactionTotals7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet19.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Transaction totals of the data set.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionTotals7.mmObject();
		}

		@Override
		public List<TransactionTotals7> getValue(CardPaymentDataSet19 obj) {
			return obj.getTransactionTotals();
		}

		@Override
		public void setValue(CardPaymentDataSet19 obj, List<TransactionTotals7> value) {
			obj.setTransactionTotals(value);
		}
	};
	@XmlElement(name = "CmonData")
	protected CommonData7 commonData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommonData7
	 * CommonData7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet19
	 * CardPaymentDataSet19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data common to all transactions of the data set."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet19, Optional<CommonData7>> mmCommonData = new MMMessageAssociationEnd<CardPaymentDataSet19, Optional<CommonData7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet19.mmObject();
			isDerived = false;
			xmlTag = "CmonData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonData";
			definition = "Data common to all transactions of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommonData7.mmObject();
		}

		@Override
		public Optional<CommonData7> getValue(CardPaymentDataSet19 obj) {
			return obj.getCommonData();
		}

		@Override
		public void setValue(CardPaymentDataSet19 obj, Optional<CommonData7> value) {
			obj.setCommonData(value.orElse(null));
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected List<CardPaymentDataSetTransaction6Choice> transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CardPaymentDataSetTransaction6Choice
	 * CardPaymentDataSetTransaction6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet19
	 * CardPaymentDataSet19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of transaction to Process."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentDataSet19, List<CardPaymentDataSetTransaction6Choice>> mmTransaction = new MMMessageAttribute<CardPaymentDataSet19, List<CardPaymentDataSetTransaction6Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet19.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Set of transaction to Process.";
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSetTransaction6Choice.mmObject();
		}

		@Override
		public List<CardPaymentDataSetTransaction6Choice> getValue(CardPaymentDataSet19 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(CardPaymentDataSet19 obj, List<CardPaymentDataSetTransaction6Choice> value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentDataSet19.mmDataSetIdentification, com.tools20022.repository.msg.CardPaymentDataSet19.mmTraceability,
						com.tools20022.repository.msg.CardPaymentDataSet19.mmDataSetInitiator, com.tools20022.repository.msg.CardPaymentDataSet19.mmTransactionTotals, com.tools20022.repository.msg.CardPaymentDataSet19.mmCommonData,
						com.tools20022.repository.msg.CardPaymentDataSet19.mmTransaction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSet19";
				definition = "Set of transactions to capture, sharing common characteristics.";
			}
		});
		return mmObject_lazy.get();
	}

	public DataSetIdentification5 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public CardPaymentDataSet19 setDataSetIdentification(DataSetIdentification5 dataSetIdentification) {
		this.dataSetIdentification = Objects.requireNonNull(dataSetIdentification);
		return this;
	}

	public List<Traceability5> getTraceability() {
		return traceability == null ? traceability = new ArrayList<>() : traceability;
	}

	public CardPaymentDataSet19 setTraceability(List<Traceability5> traceability) {
		this.traceability = Objects.requireNonNull(traceability);
		return this;
	}

	public Optional<GenericIdentification53> getDataSetInitiator() {
		return dataSetInitiator == null ? Optional.empty() : Optional.of(dataSetInitiator);
	}

	public CardPaymentDataSet19 setDataSetInitiator(GenericIdentification53 dataSetInitiator) {
		this.dataSetInitiator = dataSetInitiator;
		return this;
	}

	public List<TransactionTotals7> getTransactionTotals() {
		return transactionTotals == null ? transactionTotals = new ArrayList<>() : transactionTotals;
	}

	public CardPaymentDataSet19 setTransactionTotals(List<TransactionTotals7> transactionTotals) {
		this.transactionTotals = Objects.requireNonNull(transactionTotals);
		return this;
	}

	public Optional<CommonData7> getCommonData() {
		return commonData == null ? Optional.empty() : Optional.of(commonData);
	}

	public CardPaymentDataSet19 setCommonData(CommonData7 commonData) {
		this.commonData = commonData;
		return this;
	}

	public List<CardPaymentDataSetTransaction6Choice> getTransaction() {
		return transaction == null ? transaction = new ArrayList<>() : transaction;
	}

	public CardPaymentDataSet19 setTransaction(List<CardPaymentDataSetTransaction6Choice> transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}