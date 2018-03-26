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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.TaxExemptionReasonFormatChoice;
import com.tools20022.repository.choice.TaxTypeFormat1Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.LineItemMonetarySummation1;
import com.tools20022.repository.msg.LineItemTax1;
import com.tools20022.repository.msg.Product3;
import com.tools20022.repository.msg.TaxParty3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money due to the government or tax authority, according to various
 * pre-defined parameters such as thresholds or income.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Tax" src="doc-files/Tax.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmExemptionReason
 * Tax.mmExemptionReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCountry Tax.mmCountry}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxLiabilityValueCalculation
 * Tax.mmTaxLiabilityValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
 * Tax.mmTaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxRefundValueCalculation
 * Tax.mmTaxRefundValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmBasis Tax.mmBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmSecuritiesTransfer
 * Tax.mmSecuritiesTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxRateType
 * Tax.mmTaxRateType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxAccount
 * Tax.mmTaxAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxationConditions
 * Tax.mmTaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAdjustment
 * Tax.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmInterest
 * Tax.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmIdentification
 * Tax.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedPaymentSettlement
 * Tax.mmRelatedPaymentSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxableBaseAmount
 * Tax.mmTaxableBaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxDate Tax.mmTaxDate}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmCertificateIdentification
 * Tax.mmCertificateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAdministrationZone
 * Tax.mmAdministrationZone}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmMethod Tax.mmMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmRecord Tax.mmRecord}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmProduct Tax.mmProduct}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCurrencyExchange
 * Tax.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCurrency
 * Tax.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmPartyRole
 * Tax.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxDeduction
 * Tax.mmTaxDeduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedCorporateActionDistribution
 * Tax.mmRelatedCorporateActionDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCalculationDate
 * Tax.mmCalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmDividend
 * Tax.mmDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmWithholdingTaxType
 * Tax.mmWithholdingTaxType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCorporateActionEvent
 * Tax.mmCorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxIdentificationType
 * Tax.mmTaxIdentificationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxRateMarker
 * Tax.mmTaxRateMarker}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmTax Country.mmTax}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmTax
 * Dividend.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxLiability
 * NetAssetValueCalculation.mmTaxLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxRefund
 * NetAssetValueCalculation.mmTaxRefund}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
 * Party.mmTaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmTax
 * CashAccount.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmTax
 * Adjustment.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
 * Payment.mmTaxOnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
 * SecuritiesTransfer.mmTransferTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
 * Interest.mmInterestTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTax
 * CurrencyExchange.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTransactionTax
 * CorporateActionEvent.mmTransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPartyRole#mmTax
 * TaxPartyRole.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmTax
 * TaxRecord.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmDistributionTax
 * Distribution.mmDistributionTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxParty3#mmTaxExemptionReason
 * TaxParty3.mmTaxExemptionReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice
 * TaxExemptionReasonFormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxTypeFormat1Choice
 * TaxTypeFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemTax1 LineItemTax1}</li>
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
 * "Tax"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
 * </li>
 * </ul>
 */
public class Tax {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TaxExemptReasonCode exemptionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice#mmUnstructured
	 * TaxExemptionReasonFormatChoice.mmUnstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice#mmStructured
	 * TaxExemptionReasonFormatChoice.mmStructured}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for a tax exemption."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, TaxExemptReasonCode> mmExemptionReason = new MMBusinessAttribute<Tax, TaxExemptReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxExemptionReasonFormatChoice.mmUnstructured, TaxExemptionReasonFormatChoice.mmStructured);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for a tax exemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxExemptReasonCode.mmObject();
		}

		@Override
		public TaxExemptReasonCode getValue(Tax obj) {
			return obj.getExemptionReason();
		}

		@Override
		public void setValue(Tax obj, TaxExemptReasonCode value) {
			obj.setExemptionReason(value);
		}
	};
	protected Country country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Country#mmTax
	 * Country.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of taxation of an individual person or an organisation, where the tax is due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, Country> mmCountry = new MMBusinessAssociationEnd<Tax, Country>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Place of taxation of an individual person or an organisation, where the tax is due.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Country.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Country.mmObject();
		}

		@Override
		public Country getValue(Tax obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(Tax obj, Country value) {
			obj.setCountry(value);
		}
	};
	protected NetAssetValueCalculation taxLiabilityValueCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxLiability
	 * NetAssetValueCalculation.mmTaxLiability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLiabilityValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which tax liability information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, Optional<NetAssetValueCalculation>> mmTaxLiabilityValueCalculation = new MMBusinessAssociationEnd<Tax, Optional<NetAssetValueCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxLiabilityValueCalculation";
			definition = "Net asset value calculation for which tax liability information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> NetAssetValueCalculation.mmTaxLiability;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
		}

		@Override
		public Optional<NetAssetValueCalculation> getValue(Tax obj) {
			return obj.getTaxLiabilityValueCalculation();
		}

		@Override
		public void setValue(Tax obj, Optional<NetAssetValueCalculation> value) {
			obj.setTaxLiabilityValueCalculation(value.orElse(null));
		}
	};
	protected TaxTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.TaxTypeCode
	 * TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxTypeFormat1Choice#mmCode
	 * TaxTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxTypeFormat1Choice#mmProprietary
	 * TaxTypeFormat1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemTax1#mmTypeCode
	 * LineItemTax1.mmTypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmTaxType
	 * Product3.mmTaxType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, TaxTypeCode> mmType = new MMBusinessAttribute<Tax, TaxTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxTypeFormat1Choice.mmCode, TaxTypeFormat1Choice.mmProprietary, LineItemTax1.mmTypeCode, Product3.mmTaxType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxTypeCode.mmObject();
		}

		@Override
		public TaxTypeCode getValue(Tax obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Tax obj, TaxTypeCode value) {
			obj.setType(value);
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemTax1#mmCalculatedAmount
	 * LineItemTax1.mmCalculatedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1#mmTaxTotalAmount
	 * LineItemMonetarySummation1.mmTaxTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from the calculation of the tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<Tax, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemTax1.mmCalculatedAmount, LineItemMonetarySummation1.mmTaxTotalAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money resulting from the calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Tax obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Tax obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected PercentageRate rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemTax1#mmCalculatedRate
	 * LineItemTax1.mmCalculatedRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used for calculation of the tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, PercentageRate> mmRate = new MMBusinessAttribute<Tax, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemTax1.mmCalculatedRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate used for calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Tax obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(Tax obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	protected Party taxableParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
	 * Party.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which is taxable at a specific location"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, Optional<Party>> mmTaxableParty = new MMBusinessAssociationEnd<Tax, Optional<Party>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableParty";
			definition = "Party which is taxable at a specific location";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Party.mmTaxationConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Party.mmObject();
		}

		@Override
		public Optional<Party> getValue(Tax obj) {
			return obj.getTaxableParty();
		}

		@Override
		public void setValue(Tax obj, Optional<Party> value) {
			obj.setTaxableParty(value.orElse(null));
		}
	};
	protected NetAssetValueCalculation taxRefundValueCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxRefund
	 * NetAssetValueCalculation.mmTaxRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefundValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which tax refund information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, Optional<NetAssetValueCalculation>> mmTaxRefundValueCalculation = new MMBusinessAssociationEnd<Tax, Optional<NetAssetValueCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRefundValueCalculation";
			definition = "Net asset value calculation for which tax refund information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> NetAssetValueCalculation.mmTaxRefund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
		}

		@Override
		public Optional<NetAssetValueCalculation> getValue(Tax obj) {
			return obj.getTaxRefundValueCalculation();
		}

		@Override
		public void setValue(Tax obj, Optional<NetAssetValueCalculation> value) {
			obj.setTaxRefundValueCalculation(value.orElse(null));
		}
	};
	protected TaxationBasisCode basis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::CATB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basis used to determine the capital gain or loss, eg, the purchase price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, TaxationBasisCode> mmBasis = new MMBusinessAttribute<Tax, TaxationBasisCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::CATB"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Basis";
			definition = "Basis used to determine the capital gain or loss, eg, the purchase price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}

		@Override
		public TaxationBasisCode getValue(Tax obj) {
			return obj.getBasis();
		}

		@Override
		public void setValue(Tax obj, TaxationBasisCode value) {
			obj.setBasis(value);
		}
	};
	protected SecuritiesTransfer securitiesTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
	 * SecuritiesTransfer.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer process for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, Optional<SecuritiesTransfer>> mmSecuritiesTransfer = new MMBusinessAssociationEnd<Tax, Optional<SecuritiesTransfer>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer process for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTransfer.mmTransferTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTransfer.mmObject();
		}

		@Override
		public Optional<SecuritiesTransfer> getValue(Tax obj) {
			return obj.getSecuritiesTransfer();
		}

		@Override
		public void setValue(Tax obj, Optional<SecuritiesTransfer> value) {
			obj.setSecuritiesTransfer(value.orElse(null));
		}
	};
	protected RateTypeCode taxRateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.RateTypeCode
	 * RateTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of tax rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, RateTypeCode> mmTaxRateType = new MMBusinessAttribute<Tax, RateTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRateType";
			definition = "Specifies the type of tax rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateTypeCode.mmObject();
		}

		@Override
		public RateTypeCode getValue(Tax obj) {
			return obj.getTaxRateType();
		}

		@Override
		public void setValue(Tax obj, RateTypeCode value) {
			obj.setTaxRateType(value);
		}
	};
	protected List<CashAccount> taxAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmTax
	 * CashAccount.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to be used for taxes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, List<CashAccount>> mmTaxAccount = new MMBusinessAssociationEnd<Tax, List<CashAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxAccount";
			definition = "Account to be used for taxes.";
			minOccurs = 0;
			opposite_lazy = () -> CashAccount.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}

		@Override
		public List<CashAccount> getValue(Tax obj) {
			return obj.getTaxAccount();
		}

		@Override
		public void setValue(Tax obj, List<CashAccount> value) {
			obj.setTaxAccount(value);
		}
	};
	protected Max350Text taxationConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies other taxation conditions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, Max350Text> mmTaxationConditions = new MMBusinessAttribute<Tax, Max350Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Specifies other taxation conditions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Tax obj) {
			return obj.getTaxationConditions();
		}

		@Override
		public void setValue(Tax obj, Max350Text value) {
			obj.setTaxationConditions(value);
		}
	};
	protected Adjustment adjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmTax
	 * Adjustment.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the adjustments subject to a tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, Adjustment> mmAdjustment = new MMBusinessAssociationEnd<Tax, Adjustment>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Specifies the adjustments subject to a tax.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Adjustment.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Adjustment.mmObject();
		}

		@Override
		public Adjustment getValue(Tax obj) {
			return obj.getAdjustment();
		}

		@Override
		public void setValue(Tax obj, Adjustment value) {
			obj.setAdjustment(value);
		}
	};
	protected Interest interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
	 * Interest.mmInterestTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, Optional<Interest>> mmInterest = new MMBusinessAssociationEnd<Tax, Optional<Interest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Interest.mmInterestTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Interest.mmObject();
		}

		@Override
		public Optional<Interest> getValue(Tax obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(Tax obj, Optional<Interest> value) {
			obj.setInterest(value.orElse(null));
		}
	};
	protected Max35Text identification;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, Max35Text> mmIdentification = new MMBusinessAttribute<Tax, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Tax obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Tax obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected Payment relatedPaymentSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
	 * Payment.mmTaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment to which the tax applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, Optional<Payment>> mmRelatedPaymentSettlement = new MMBusinessAssociationEnd<Tax, Optional<Payment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentSettlement";
			definition = "Payment to which the tax applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Payment.mmTaxOnPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}

		@Override
		public Optional<Payment> getValue(Tax obj) {
			return obj.getRelatedPaymentSettlement();
		}

		@Override
		public void setValue(Tax obj, Optional<Payment> value) {
			obj.setRelatedPaymentSettlement(value.orElse(null));
		}
	};
	protected CurrencyAndAmount taxableBaseAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1#mmTaxBasisTotalAmount
	 * LineItemMonetarySummation1.mmTaxBasisTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableBaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money on which the tax is based."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, CurrencyAndAmount> mmTaxableBaseAmount = new MMBusinessAttribute<Tax, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemMonetarySummation1.mmTaxBasisTotalAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableBaseAmount";
			definition = "Amount of money on which the tax is based.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Tax obj) {
			return obj.getTaxableBaseAmount();
		}

		@Override
		public void setValue(Tax obj, CurrencyAndAmount value) {
			obj.setTaxableBaseAmount(value);
		}
	};
	protected ISODate taxDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemTax1#mmTaxPointDate
	 * LineItemTax1.mmTaxPointDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date by which tax is due."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, ISODate> mmTaxDate = new MMBusinessAttribute<Tax, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemTax1.mmTaxPointDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxDate";
			definition = "Date by which tax is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Tax obj) {
			return obj.getTaxDate();
		}

		@Override
		public void setValue(Tax obj, ISODate value) {
			obj.setTaxDate(value);
		}
	};
	protected Max35Text certificateIdentification;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document issued by taxing authority identifying the tax payer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, Max35Text> mmCertificateIdentification = new MMBusinessAttribute<Tax, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateIdentification";
			definition = "Document issued by taxing authority identifying the tax payer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Tax obj) {
			return obj.getCertificateIdentification();
		}

		@Override
		public void setValue(Tax obj, Max35Text value) {
			obj.setCertificateIdentification(value);
		}
	};
	protected Max140Text administrationZone;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdministrationZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Territorial part of a country to which the tax payment is related."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, Max140Text> mmAdministrationZone = new MMBusinessAttribute<Tax, Max140Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdministrationZone";
			definition = "Territorial part of a country to which the tax payment is related.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(Tax obj) {
			return obj.getAdministrationZone();
		}

		@Override
		public void setValue(Tax obj, Max140Text value) {
			obj.setAdministrationZone(value);
		}
	};
	protected Max35Text method;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to indicate the underlying business or how the tax is paid."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, Max35Text> mmMethod = new MMBusinessAttribute<Tax, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Method";
			definition = "Method used to indicate the underlying business or how the tax is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Tax obj) {
			return obj.getMethod();
		}

		@Override
		public void setValue(Tax obj, Max35Text value) {
			obj.setMethod(value);
		}
	};
	protected List<TaxRecord> record;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.TaxRecord#mmTax
	 * TaxRecord.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxRecord TaxRecord}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Record"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record of tax details."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, List<TaxRecord>> mmRecord = new MMBusinessAssociationEnd<Tax, List<TaxRecord>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Record";
			definition = "Record of tax details.";
			minOccurs = 1;
			opposite_lazy = () -> TaxRecord.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TaxRecord.mmObject();
		}

		@Override
		public List<TaxRecord> getValue(Tax obj) {
			return obj.getRecord();
		}

		@Override
		public void setValue(Tax obj, List<TaxRecord> value) {
			obj.setRecord(value);
		}
	};
	protected Product product;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Product#mmTax
	 * Product.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product on which a tax is applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, Product> mmProduct = new MMBusinessAssociationEnd<Tax, Product>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product on which a tax is applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Product.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}

		@Override
		public Product getValue(Tax obj) {
			return obj.getProduct();
		}

		@Override
		public void setValue(Tax obj, Product value) {
			obj.setProduct(value);
		}
	};
	protected List<CurrencyExchange> currencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTax
	 * CurrencyExchange.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency exchange applicable to a tax"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, List<CurrencyExchange>> mmCurrencyExchange = new MMBusinessAssociationEnd<Tax, List<CurrencyExchange>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Currency exchange applicable to a tax";
			minOccurs = 0;
			opposite_lazy = () -> CurrencyExchange.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}

		@Override
		public List<CurrencyExchange> getValue(Tax obj) {
			return obj.getCurrencyExchange();
		}

		@Override
		public void setValue(Tax obj, List<CurrencyExchange> value) {
			obj.setCurrencyExchange(value);
		}
	};
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the tax must be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, CurrencyCode> mmCurrency = new MMBusinessAttribute<Tax, CurrencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency in which the tax must be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Tax obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(Tax obj, CurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	protected List<TaxPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole#mmTax
	 * TaxPartyRole.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxPartyRole
	 * TaxPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a tax and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, List<TaxPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<Tax, List<TaxPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a tax and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> TaxPartyRole.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TaxPartyRole.mmObject();
		}

		@Override
		public List<TaxPartyRole> getValue(Tax obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Tax obj, List<TaxPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected CurrencyAndAmount taxDeduction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of tax that have been previously deducted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, CurrencyAndAmount> mmTaxDeduction = new MMBusinessAttribute<Tax, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxDeduction";
			definition = "Amount of tax that have been previously deducted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Tax obj) {
			return obj.getTaxDeduction();
		}

		@Override
		public void setValue(Tax obj, CurrencyAndAmount value) {
			obj.setTaxDeduction(value);
		}
	};
	protected Distribution relatedCorporateActionDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmDistributionTax
	 * Distribution.mmDistributionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution process for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, Optional<Distribution>> mmRelatedCorporateActionDistribution = new MMBusinessAssociationEnd<Tax, Optional<Distribution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionDistribution";
			definition = "Distribution process for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Distribution.mmDistributionTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}

		@Override
		public Optional<Distribution> getValue(Tax obj) {
			return obj.getRelatedCorporateActionDistribution();
		}

		@Override
		public void setValue(Tax obj, Optional<Distribution> value) {
			obj.setRelatedCorporateActionDistribution(value.orElse(null));
		}
	};
	protected ISODate calculationDate;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the tax is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, ISODate> mmCalculationDate = new MMBusinessAttribute<Tax, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Date on which the tax is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Tax obj) {
			return obj.getCalculationDate();
		}

		@Override
		public void setValue(Tax obj, ISODate value) {
			obj.setCalculationDate(value);
		}
	};
	protected List<Dividend> dividend;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Dividend#mmTax
	 * Dividend.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, List<Dividend>> mmDividend = new MMBusinessAssociationEnd<Tax, List<Dividend>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Dividend for which a tax is specified.";
			minOccurs = 0;
			opposite_lazy = () -> Dividend.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public List<Dividend> getValue(Tax obj) {
			return obj.getDividend();
		}

		@Override
		public void setValue(Tax obj, List<Dividend> value) {
			obj.setDividend(value);
		}
	};
	protected WithholdingTaxRateTypeCode withholdingTaxType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateTypeCode
	 * WithholdingTaxRateTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of withholding tax rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, WithholdingTaxRateTypeCode> mmWithholdingTaxType = new MMBusinessAttribute<Tax, WithholdingTaxRateTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdingTaxType";
			definition = "Type of withholding tax rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WithholdingTaxRateTypeCode.mmObject();
		}

		@Override
		public WithholdingTaxRateTypeCode getValue(Tax obj) {
			return obj.getWithholdingTaxType();
		}

		@Override
		public void setValue(Tax obj, WithholdingTaxRateTypeCode value) {
			obj.setWithholdingTaxType(value);
		}
	};
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTransactionTax
	 * CorporateActionEvent.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event for which a transaction tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Tax, CorporateActionEvent> mmCorporateActionEvent = new MMBusinessAssociationEnd<Tax, CorporateActionEvent>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEvent";
			definition = "Event for which a transaction tax is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionEvent.mmTransactionTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public CorporateActionEvent getValue(Tax obj) {
			return obj.getCorporateActionEvent();
		}

		@Override
		public void setValue(Tax obj, CorporateActionEvent value) {
			obj.setCorporateActionEvent(value);
		}
	};
	protected TaxIdentificationNumberTypeCode taxIdentificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode
	 * TaxIdentificationNumberTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax identification number or identifier."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, TaxIdentificationNumberTypeCode> mmTaxIdentificationType = new MMBusinessAttribute<Tax, TaxIdentificationNumberTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationType";
			definition = "Type of tax identification number or identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxIdentificationNumberTypeCode.mmObject();
		}

		@Override
		public TaxIdentificationNumberTypeCode getValue(Tax obj) {
			return obj.getTaxIdentificationType();
		}

		@Override
		public void setValue(Tax obj, TaxIdentificationNumberTypeCode value) {
			obj.setTaxIdentificationType(value);
		}
	};
	protected TaxRateMarkerCode taxRateMarker;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRateMarkerCode
	 * TaxRateMarkerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRateMarker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the rate of tax levied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Tax, TaxRateMarkerCode> mmTaxRateMarker = new MMBusinessAttribute<Tax, TaxRateMarkerCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRateMarker";
			definition = "Specifies the rate of tax levied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxRateMarkerCode.mmObject();
		}

		@Override
		public TaxRateMarkerCode getValue(Tax obj) {
			return obj.getTaxRateMarker();
		}

		@Override
		public void setValue(Tax obj, TaxRateMarkerCode value) {
			obj.setTaxRateMarker(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Tax";
				definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
				associationDomain_lazy = () -> Arrays.asList(Country.mmTax, Dividend.mmTax, NetAssetValueCalculation.mmTaxLiability, NetAssetValueCalculation.mmTaxRefund, Party.mmTaxationConditions, CashAccount.mmTax, Product.mmTax,
						Adjustment.mmTax, Payment.mmTaxOnPayment, SecuritiesTransfer.mmTransferTax, Interest.mmInterestTax, CurrencyExchange.mmTax, CorporateActionEvent.mmTransactionTax, TaxPartyRole.mmTax, TaxRecord.mmTax,
						Distribution.mmDistributionTax);
				derivationElement_lazy = () -> Arrays.asList(TaxParty3.mmTaxExemptionReason);
				subType_lazy = () -> Arrays.asList(SecuritiesTax.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tax.mmExemptionReason, com.tools20022.repository.entity.Tax.mmCountry, com.tools20022.repository.entity.Tax.mmTaxLiabilityValueCalculation,
						com.tools20022.repository.entity.Tax.mmType, com.tools20022.repository.entity.Tax.mmAmount, com.tools20022.repository.entity.Tax.mmRate, com.tools20022.repository.entity.Tax.mmTaxableParty,
						com.tools20022.repository.entity.Tax.mmTaxRefundValueCalculation, com.tools20022.repository.entity.Tax.mmBasis, com.tools20022.repository.entity.Tax.mmSecuritiesTransfer,
						com.tools20022.repository.entity.Tax.mmTaxRateType, com.tools20022.repository.entity.Tax.mmTaxAccount, com.tools20022.repository.entity.Tax.mmTaxationConditions, com.tools20022.repository.entity.Tax.mmAdjustment,
						com.tools20022.repository.entity.Tax.mmInterest, com.tools20022.repository.entity.Tax.mmIdentification, com.tools20022.repository.entity.Tax.mmRelatedPaymentSettlement,
						com.tools20022.repository.entity.Tax.mmTaxableBaseAmount, com.tools20022.repository.entity.Tax.mmTaxDate, com.tools20022.repository.entity.Tax.mmCertificateIdentification,
						com.tools20022.repository.entity.Tax.mmAdministrationZone, com.tools20022.repository.entity.Tax.mmMethod, com.tools20022.repository.entity.Tax.mmRecord, com.tools20022.repository.entity.Tax.mmProduct,
						com.tools20022.repository.entity.Tax.mmCurrencyExchange, com.tools20022.repository.entity.Tax.mmCurrency, com.tools20022.repository.entity.Tax.mmPartyRole, com.tools20022.repository.entity.Tax.mmTaxDeduction,
						com.tools20022.repository.entity.Tax.mmRelatedCorporateActionDistribution, com.tools20022.repository.entity.Tax.mmCalculationDate, com.tools20022.repository.entity.Tax.mmDividend,
						com.tools20022.repository.entity.Tax.mmWithholdingTaxType, com.tools20022.repository.entity.Tax.mmCorporateActionEvent, com.tools20022.repository.entity.Tax.mmTaxIdentificationType,
						com.tools20022.repository.entity.Tax.mmTaxRateMarker);
				derivationComponent_lazy = () -> Arrays.asList(TaxExemptionReasonFormatChoice.mmObject(), TaxTypeFormat1Choice.mmObject(), LineItemTax1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Tax.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TaxExemptReasonCode getExemptionReason() {
		return exemptionReason;
	}

	public Tax setExemptionReason(TaxExemptReasonCode exemptionReason) {
		this.exemptionReason = Objects.requireNonNull(exemptionReason);
		return this;
	}

	public Country getCountry() {
		return country;
	}

	public Tax setCountry(Country country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public Optional<NetAssetValueCalculation> getTaxLiabilityValueCalculation() {
		return taxLiabilityValueCalculation == null ? Optional.empty() : Optional.of(taxLiabilityValueCalculation);
	}

	public Tax setTaxLiabilityValueCalculation(NetAssetValueCalculation taxLiabilityValueCalculation) {
		this.taxLiabilityValueCalculation = taxLiabilityValueCalculation;
		return this;
	}

	public TaxTypeCode getType() {
		return type;
	}

	public Tax setType(TaxTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public Tax setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public Tax setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public Optional<Party> getTaxableParty() {
		return taxableParty == null ? Optional.empty() : Optional.of(taxableParty);
	}

	public Tax setTaxableParty(Party taxableParty) {
		this.taxableParty = taxableParty;
		return this;
	}

	public Optional<NetAssetValueCalculation> getTaxRefundValueCalculation() {
		return taxRefundValueCalculation == null ? Optional.empty() : Optional.of(taxRefundValueCalculation);
	}

	public Tax setTaxRefundValueCalculation(NetAssetValueCalculation taxRefundValueCalculation) {
		this.taxRefundValueCalculation = taxRefundValueCalculation;
		return this;
	}

	public TaxationBasisCode getBasis() {
		return basis;
	}

	public Tax setBasis(TaxationBasisCode basis) {
		this.basis = Objects.requireNonNull(basis);
		return this;
	}

	public Optional<SecuritiesTransfer> getSecuritiesTransfer() {
		return securitiesTransfer == null ? Optional.empty() : Optional.of(securitiesTransfer);
	}

	public Tax setSecuritiesTransfer(SecuritiesTransfer securitiesTransfer) {
		this.securitiesTransfer = securitiesTransfer;
		return this;
	}

	public RateTypeCode getTaxRateType() {
		return taxRateType;
	}

	public Tax setTaxRateType(RateTypeCode taxRateType) {
		this.taxRateType = Objects.requireNonNull(taxRateType);
		return this;
	}

	public List<CashAccount> getTaxAccount() {
		return taxAccount == null ? taxAccount = new ArrayList<>() : taxAccount;
	}

	public Tax setTaxAccount(List<CashAccount> taxAccount) {
		this.taxAccount = Objects.requireNonNull(taxAccount);
		return this;
	}

	public Max350Text getTaxationConditions() {
		return taxationConditions;
	}

	public Tax setTaxationConditions(Max350Text taxationConditions) {
		this.taxationConditions = Objects.requireNonNull(taxationConditions);
		return this;
	}

	public Adjustment getAdjustment() {
		return adjustment;
	}

	public Tax setAdjustment(Adjustment adjustment) {
		this.adjustment = Objects.requireNonNull(adjustment);
		return this;
	}

	public Optional<Interest> getInterest() {
		return interest == null ? Optional.empty() : Optional.of(interest);
	}

	public Tax setInterest(Interest interest) {
		this.interest = interest;
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public Tax setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Payment> getRelatedPaymentSettlement() {
		return relatedPaymentSettlement == null ? Optional.empty() : Optional.of(relatedPaymentSettlement);
	}

	public Tax setRelatedPaymentSettlement(Payment relatedPaymentSettlement) {
		this.relatedPaymentSettlement = relatedPaymentSettlement;
		return this;
	}

	public CurrencyAndAmount getTaxableBaseAmount() {
		return taxableBaseAmount;
	}

	public Tax setTaxableBaseAmount(CurrencyAndAmount taxableBaseAmount) {
		this.taxableBaseAmount = Objects.requireNonNull(taxableBaseAmount);
		return this;
	}

	public ISODate getTaxDate() {
		return taxDate;
	}

	public Tax setTaxDate(ISODate taxDate) {
		this.taxDate = Objects.requireNonNull(taxDate);
		return this;
	}

	public Max35Text getCertificateIdentification() {
		return certificateIdentification;
	}

	public Tax setCertificateIdentification(Max35Text certificateIdentification) {
		this.certificateIdentification = Objects.requireNonNull(certificateIdentification);
		return this;
	}

	public Max140Text getAdministrationZone() {
		return administrationZone;
	}

	public Tax setAdministrationZone(Max140Text administrationZone) {
		this.administrationZone = Objects.requireNonNull(administrationZone);
		return this;
	}

	public Max35Text getMethod() {
		return method;
	}

	public Tax setMethod(Max35Text method) {
		this.method = Objects.requireNonNull(method);
		return this;
	}

	public List<TaxRecord> getRecord() {
		return record == null ? record = new ArrayList<>() : record;
	}

	public Tax setRecord(List<TaxRecord> record) {
		this.record = Objects.requireNonNull(record);
		return this;
	}

	public Product getProduct() {
		return product;
	}

	public Tax setProduct(Product product) {
		this.product = Objects.requireNonNull(product);
		return this;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange == null ? currencyExchange = new ArrayList<>() : currencyExchange;
	}

	public Tax setCurrencyExchange(List<CurrencyExchange> currencyExchange) {
		this.currencyExchange = Objects.requireNonNull(currencyExchange);
		return this;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public Tax setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public List<TaxPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Tax setPartyRole(List<TaxPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public CurrencyAndAmount getTaxDeduction() {
		return taxDeduction;
	}

	public Tax setTaxDeduction(CurrencyAndAmount taxDeduction) {
		this.taxDeduction = Objects.requireNonNull(taxDeduction);
		return this;
	}

	public Optional<Distribution> getRelatedCorporateActionDistribution() {
		return relatedCorporateActionDistribution == null ? Optional.empty() : Optional.of(relatedCorporateActionDistribution);
	}

	public Tax setRelatedCorporateActionDistribution(Distribution relatedCorporateActionDistribution) {
		this.relatedCorporateActionDistribution = relatedCorporateActionDistribution;
		return this;
	}

	public ISODate getCalculationDate() {
		return calculationDate;
	}

	public Tax setCalculationDate(ISODate calculationDate) {
		this.calculationDate = Objects.requireNonNull(calculationDate);
		return this;
	}

	public List<Dividend> getDividend() {
		return dividend == null ? dividend = new ArrayList<>() : dividend;
	}

	public Tax setDividend(List<Dividend> dividend) {
		this.dividend = Objects.requireNonNull(dividend);
		return this;
	}

	public WithholdingTaxRateTypeCode getWithholdingTaxType() {
		return withholdingTaxType;
	}

	public Tax setWithholdingTaxType(WithholdingTaxRateTypeCode withholdingTaxType) {
		this.withholdingTaxType = Objects.requireNonNull(withholdingTaxType);
		return this;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return corporateActionEvent;
	}

	public Tax setCorporateActionEvent(CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = Objects.requireNonNull(corporateActionEvent);
		return this;
	}

	public TaxIdentificationNumberTypeCode getTaxIdentificationType() {
		return taxIdentificationType;
	}

	public Tax setTaxIdentificationType(TaxIdentificationNumberTypeCode taxIdentificationType) {
		this.taxIdentificationType = Objects.requireNonNull(taxIdentificationType);
		return this;
	}

	public TaxRateMarkerCode getTaxRateMarker() {
		return taxRateMarker;
	}

	public Tax setTaxRateMarker(TaxRateMarkerCode taxRateMarker) {
		this.taxRateMarker = Objects.requireNonNull(taxRateMarker);
		return this;
	}
}