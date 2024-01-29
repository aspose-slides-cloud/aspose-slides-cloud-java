/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Slides for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.aspose.slides.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Represents font info.
 */
@ApiModel(description = "Represents font info.")
public class FontData {
  @SerializedName(value = "fontName", alternate = { "FontName" })
  private String fontName;

  @SerializedName(value = "isEmbedded", alternate = { "IsEmbedded" })
  private Boolean isEmbedded;

  @SerializedName(value = "isCustom", alternate = { "IsCustom" })
  private Boolean isCustom;


  public FontData() {
    super();
  }

  public FontData fontName(String fontName) {
    this.fontName = fontName;
    return this;
  }

   /**
   * Font name
   * @return fontName
  **/
  @ApiModelProperty(value = "Font name")
  public String getFontName() {
    return fontName;
  }

  public void setFontName(String fontName) {
    this.fontName = fontName;
  }

  public FontData isEmbedded(Boolean isEmbedded) {
    this.isEmbedded = isEmbedded;
    return this;
  }

   /**
   * Returns true if font is embedded.
   * @return isEmbedded
  **/
  @ApiModelProperty(value = "Returns true if font is embedded.")
  public Boolean getIsEmbedded() {
    return isEmbedded;
  }

  public void setIsEmbedded(Boolean isEmbedded) {
    this.isEmbedded = isEmbedded;
  }

  public FontData isCustom(Boolean isCustom) {
    this.isCustom = isCustom;
    return this;
  }

   /**
   * Returns true for a custom font (contained in fontsFolder directory).
   * @return isCustom
  **/
  @ApiModelProperty(value = "Returns true for a custom font (contained in fontsFolder directory).")
  public Boolean getIsCustom() {
    return isCustom;
  }

  public void setIsCustom(Boolean isCustom) {
    this.isCustom = isCustom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FontData fontData = (FontData) o;
    return true && Objects.equals(this.fontName, fontData.fontName) && Objects.equals(this.isEmbedded, fontData.isEmbedded) && Objects.equals(this.isCustom, fontData.isCustom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontName, isEmbedded, isCustom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FontData {\n");
    
    sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
    sb.append("    isEmbedded: ").append(toIndentedString(isEmbedded)).append("\n");
    sb.append("    isCustom: ").append(toIndentedString(isCustom)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }



  private static final Map<String, Object> typeDeterminers = new Hashtable<String, Object>();

}
