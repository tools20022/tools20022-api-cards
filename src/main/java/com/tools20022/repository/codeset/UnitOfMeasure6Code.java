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
import com.tools20022.repository.codeset.UnitOfMeasure6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Unit of measure of the item purchased.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Piece
 * UnitOfMeasure6Code.mmPiece}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Ton
 * UnitOfMeasure6Code.mmTon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Foot
 * UnitOfMeasure6Code.mmFoot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#GBGallon
 * UnitOfMeasure6Code.mmGBGallon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#USGallon
 * UnitOfMeasure6Code.mmUSGallon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Gram
 * UnitOfMeasure6Code.mmGram}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Inch
 * UnitOfMeasure6Code.mmInch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Kilogram
 * UnitOfMeasure6Code.mmKilogram}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Pound
 * UnitOfMeasure6Code.mmPound}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Metre
 * UnitOfMeasure6Code.mmMetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Centimetre
 * UnitOfMeasure6Code.mmCentimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Millimetre
 * UnitOfMeasure6Code.mmMillimetre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Litre
 * UnitOfMeasure6Code.mmLitre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Centilitre
 * UnitOfMeasure6Code.mmCentilitre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#MilliLitre
 * UnitOfMeasure6Code.mmMilliLitre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#GBOunce
 * UnitOfMeasure6Code.mmGBOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#USOunce
 * UnitOfMeasure6Code.mmUSOunce}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#GBQuart
 * UnitOfMeasure6Code.mmGBQuart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#USQuart
 * UnitOfMeasure6Code.mmUSQuart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#GBPint
 * UnitOfMeasure6Code.mmGBPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#USPint
 * UnitOfMeasure6Code.mmUSPint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Mile
 * UnitOfMeasure6Code.mmMile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Kilometre
 * UnitOfMeasure6Code.mmKilometre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Yard
 * UnitOfMeasure6Code.mmYard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareKilometre
 * UnitOfMeasure6Code.mmSquareKilometre}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Hectare
 * UnitOfMeasure6Code.mmHectare}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Are
 * UnitOfMeasure6Code.mmAre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareMetre
 * UnitOfMeasure6Code.mmSquareMetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareCentimetre
 * UnitOfMeasure6Code.mmSquareCentimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareMillimetre
 * UnitOfMeasure6Code.mmSquareMillimetre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareMile
 * UnitOfMeasure6Code.mmSquareMile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareYard
 * UnitOfMeasure6Code.mmSquareYard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareFoot
 * UnitOfMeasure6Code.mmSquareFoot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#SquareInch
 * UnitOfMeasure6Code.mmSquareInch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#Acre
 * UnitOfMeasure6Code.mmAcre}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#KilowattHours
 * UnitOfMeasure6Code.mmKilowattHours}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#DieselGallonEquivalent
 * UnitOfMeasure6Code.mmDieselGallonEquivalent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code#GasolineGallonEquivalent
 * UnitOfMeasure6Code.mmGasolineGallonEquivalent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
 * UnitOfMeasureCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PIEC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitOfMeasure6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unit of measure of the item purchased."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnitOfMeasure6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Piece"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Piece = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Piece";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Piece.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ton"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Ton = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ton";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Ton.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Foot"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Foot = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Foot";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Foot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBGallon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code GBGallon = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBGallon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.GBGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGallon"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code USGallon = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGallon";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.USGallon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gram"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Gram = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gram";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Gram.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Inch = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Inch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilogram"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Kilogram = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilogram";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Kilogram.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pound"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Pound = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pound";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Pound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Metre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Metre = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Metre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Metre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Centimetre = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Centimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Millimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Millimetre = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Millimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Millimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Litre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Litre = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Litre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Litre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Centilitre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Centilitre = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Centilitre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Centilitre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MilliLitre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code MilliLitre = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MilliLitre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.MilliLitre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code GBOunce = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBOunce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.GBOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USOunce"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code USOunce = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USOunce";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.USOunce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBQuart"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code GBQuart = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBQuart";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.GBQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USQuart"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code USQuart = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USQuart";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.USQuart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GBPint"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code GBPint = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GBPint";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.GBPint.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USPint"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code USPint = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USPint";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.USPint.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mile"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Mile = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mile";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Mile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kilometre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Kilometre = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Kilometre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Kilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yard"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Yard = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yard";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Yard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareKilometre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code SquareKilometre = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareKilometre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.SquareKilometre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hectare"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Hectare = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hectare";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Hectare.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Are"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Are = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Are";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Are.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code SquareMetre = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.SquareMetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareCentimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code SquareCentimetre = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareCentimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.SquareCentimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMillimetre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code SquareMillimetre = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMillimetre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.SquareMillimetre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareMile"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code SquareMile = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareMile";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.SquareMile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareYard"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code SquareYard = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareYard";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.SquareYard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareFoot"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code SquareFoot = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareFoot";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.SquareFoot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SquareInch"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code SquareInch = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SquareInch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.SquareInch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acre"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code Acre = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acre";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.Acre.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KilowattHours"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code KilowattHours = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KilowattHours";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.KilowattHours.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DieselGallonEquivalent"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code DieselGallonEquivalent = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DieselGallonEquivalent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.DieselGallonEquivalent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure6Code
	 * UnitOfMeasure6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GasolineGallonEquivalent"</li>
	 * </ul>
	 */
	public static final UnitOfMeasure6Code GasolineGallonEquivalent = new UnitOfMeasure6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GasolineGallonEquivalent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnitOfMeasure6Code.mmObject();
			codeName = UnitOfMeasureCode.GasolineGallonEquivalent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnitOfMeasure6Code> codesByName = new LinkedHashMap<>();

	protected UnitOfMeasure6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PIEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnitOfMeasure6Code";
				definition = "Unit of measure of the item purchased.";
				trace_lazy = () -> UnitOfMeasureCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnitOfMeasure6Code.Piece, com.tools20022.repository.codeset.UnitOfMeasure6Code.Ton, com.tools20022.repository.codeset.UnitOfMeasure6Code.Foot,
						com.tools20022.repository.codeset.UnitOfMeasure6Code.GBGallon, com.tools20022.repository.codeset.UnitOfMeasure6Code.USGallon, com.tools20022.repository.codeset.UnitOfMeasure6Code.Gram,
						com.tools20022.repository.codeset.UnitOfMeasure6Code.Inch, com.tools20022.repository.codeset.UnitOfMeasure6Code.Kilogram, com.tools20022.repository.codeset.UnitOfMeasure6Code.Pound,
						com.tools20022.repository.codeset.UnitOfMeasure6Code.Metre, com.tools20022.repository.codeset.UnitOfMeasure6Code.Centimetre, com.tools20022.repository.codeset.UnitOfMeasure6Code.Millimetre,
						com.tools20022.repository.codeset.UnitOfMeasure6Code.Litre, com.tools20022.repository.codeset.UnitOfMeasure6Code.Centilitre, com.tools20022.repository.codeset.UnitOfMeasure6Code.MilliLitre,
						com.tools20022.repository.codeset.UnitOfMeasure6Code.GBOunce, com.tools20022.repository.codeset.UnitOfMeasure6Code.USOunce, com.tools20022.repository.codeset.UnitOfMeasure6Code.GBQuart,
						com.tools20022.repository.codeset.UnitOfMeasure6Code.USQuart, com.tools20022.repository.codeset.UnitOfMeasure6Code.GBPint, com.tools20022.repository.codeset.UnitOfMeasure6Code.USPint,
						com.tools20022.repository.codeset.UnitOfMeasure6Code.Mile, com.tools20022.repository.codeset.UnitOfMeasure6Code.Kilometre, com.tools20022.repository.codeset.UnitOfMeasure6Code.Yard,
						com.tools20022.repository.codeset.UnitOfMeasure6Code.SquareKilometre, com.tools20022.repository.codeset.UnitOfMeasure6Code.Hectare, com.tools20022.repository.codeset.UnitOfMeasure6Code.Are,
						com.tools20022.repository.codeset.UnitOfMeasure6Code.SquareMetre, com.tools20022.repository.codeset.UnitOfMeasure6Code.SquareCentimetre, com.tools20022.repository.codeset.UnitOfMeasure6Code.SquareMillimetre,
						com.tools20022.repository.codeset.UnitOfMeasure6Code.SquareMile, com.tools20022.repository.codeset.UnitOfMeasure6Code.SquareYard, com.tools20022.repository.codeset.UnitOfMeasure6Code.SquareFoot,
						com.tools20022.repository.codeset.UnitOfMeasure6Code.SquareInch, com.tools20022.repository.codeset.UnitOfMeasure6Code.Acre, com.tools20022.repository.codeset.UnitOfMeasure6Code.KilowattHours,
						com.tools20022.repository.codeset.UnitOfMeasure6Code.DieselGallonEquivalent, com.tools20022.repository.codeset.UnitOfMeasure6Code.GasolineGallonEquivalent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Piece.getCodeName().get(), Piece);
		codesByName.put(Ton.getCodeName().get(), Ton);
		codesByName.put(Foot.getCodeName().get(), Foot);
		codesByName.put(GBGallon.getCodeName().get(), GBGallon);
		codesByName.put(USGallon.getCodeName().get(), USGallon);
		codesByName.put(Gram.getCodeName().get(), Gram);
		codesByName.put(Inch.getCodeName().get(), Inch);
		codesByName.put(Kilogram.getCodeName().get(), Kilogram);
		codesByName.put(Pound.getCodeName().get(), Pound);
		codesByName.put(Metre.getCodeName().get(), Metre);
		codesByName.put(Centimetre.getCodeName().get(), Centimetre);
		codesByName.put(Millimetre.getCodeName().get(), Millimetre);
		codesByName.put(Litre.getCodeName().get(), Litre);
		codesByName.put(Centilitre.getCodeName().get(), Centilitre);
		codesByName.put(MilliLitre.getCodeName().get(), MilliLitre);
		codesByName.put(GBOunce.getCodeName().get(), GBOunce);
		codesByName.put(USOunce.getCodeName().get(), USOunce);
		codesByName.put(GBQuart.getCodeName().get(), GBQuart);
		codesByName.put(USQuart.getCodeName().get(), USQuart);
		codesByName.put(GBPint.getCodeName().get(), GBPint);
		codesByName.put(USPint.getCodeName().get(), USPint);
		codesByName.put(Mile.getCodeName().get(), Mile);
		codesByName.put(Kilometre.getCodeName().get(), Kilometre);
		codesByName.put(Yard.getCodeName().get(), Yard);
		codesByName.put(SquareKilometre.getCodeName().get(), SquareKilometre);
		codesByName.put(Hectare.getCodeName().get(), Hectare);
		codesByName.put(Are.getCodeName().get(), Are);
		codesByName.put(SquareMetre.getCodeName().get(), SquareMetre);
		codesByName.put(SquareCentimetre.getCodeName().get(), SquareCentimetre);
		codesByName.put(SquareMillimetre.getCodeName().get(), SquareMillimetre);
		codesByName.put(SquareMile.getCodeName().get(), SquareMile);
		codesByName.put(SquareYard.getCodeName().get(), SquareYard);
		codesByName.put(SquareFoot.getCodeName().get(), SquareFoot);
		codesByName.put(SquareInch.getCodeName().get(), SquareInch);
		codesByName.put(Acre.getCodeName().get(), Acre);
		codesByName.put(KilowattHours.getCodeName().get(), KilowattHours);
		codesByName.put(DieselGallonEquivalent.getCodeName().get(), DieselGallonEquivalent);
		codesByName.put(GasolineGallonEquivalent.getCodeName().get(), GasolineGallonEquivalent);
	}

	public static UnitOfMeasure6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnitOfMeasure6Code[] values() {
		UnitOfMeasure6Code[] values = new UnitOfMeasure6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnitOfMeasure6Code> {
		@Override
		public UnitOfMeasure6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnitOfMeasure6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}