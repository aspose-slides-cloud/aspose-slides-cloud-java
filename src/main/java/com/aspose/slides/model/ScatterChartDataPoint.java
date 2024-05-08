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
import com.aspose.slides.model.DataPoint;
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.SeriesMarker;
import com.aspose.slides.model.ThreeDFormat;
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
 * Scatter chart (two-dimensional) data point
 */
@ApiModel(description = "Scatter chart (two-dimensional) data point")
public class ScatterChartDataPoint extends DataPoint {
  @SerializedName(value = "xvalue", alternate = { "XValue" })
  private Double xvalue;

  @SerializedName(value = "yvalue", alternate = { "YValue" })
  private Double yvalue;

  @SerializedName(value = "xvalueFormula", alternate = { "XValueFormula" })
  private String xvalueFormula;

  @SerializedName(value = "yvalueFormula", alternate = { "YValueFormula" })
  private String yvalueFormula;


  public ScatterChartDataPoint() {
    super();
    setType(TypeEnum.SCATTER);
  }

  public ScatterChartDataPoint xvalue(Double xvalue) {
    this.xvalue = xvalue;
    return this;
  }

   /**
   * X-value
   * @return xvalue
  **/
  @ApiModelProperty(value = "X-value")
  public Double getXvalue() {
    return xvalue;
  }

  public void setXvalue(Double xvalue) {
    this.xvalue = xvalue;
  }

  public ScatterChartDataPoint yvalue(Double yvalue) {
    this.yvalue = yvalue;
    return this;
  }

   /**
   * Y-value
   * @return yvalue
  **/
  @ApiModelProperty(value = "Y-value")
  public Double getYvalue() {
    return yvalue;
  }

  public void setYvalue(Double yvalue) {
    this.yvalue = yvalue;
  }

  public ScatterChartDataPoint xvalueFormula(String xvalueFormula) {
    this.xvalueFormula = xvalueFormula;
    return this;
  }

   /**
   * Spreadsheet formula in A1-style.
   * @return xvalueFormula
  **/
  @ApiModelProperty(value = "Spreadsheet formula in A1-style.")
  public String getXvalueFormula() {
    return xvalueFormula;
  }

  public void setXvalueFormula(String xvalueFormula) {
    this.xvalueFormula = xvalueFormula;
  }

  public ScatterChartDataPoint yvalueFormula(String yvalueFormula) {
    this.yvalueFormula = yvalueFormula;
    return this;
  }

   /**
   * Spreadsheet formula in A1-style.
   * @return yvalueFormula
  **/
  @ApiModelProperty(value = "Spreadsheet formula in A1-style.")
  public String getYvalueFormula() {
    return yvalueFormula;
  }

  public void setYvalueFormula(String yvalueFormula) {
    this.yvalueFormula = yvalueFormula;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterChartDataPoint scatterChartDataPoint = (ScatterChartDataPoint) o;
    return true && Objects.equals(this.xvalue, scatterChartDataPoint.xvalue) && Objects.equals(this.yvalue, scatterChartDataPoint.yvalue) && Objects.equals(this.xvalueFormula, scatterChartDataPoint.xvalueFormula) && Objects.equals(this.yvalueFormula, scatterChartDataPoint.yvalueFormula) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xvalue, yvalue, xvalueFormula, yvalueFormula, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterChartDataPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    xvalue: ").append(toIndentedString(xvalue)).append("\n");
    sb.append("    yvalue: ").append(toIndentedString(yvalue)).append("\n");
    sb.append("    xvalueFormula: ").append(toIndentedString(xvalueFormula)).append("\n");
    sb.append("    yvalueFormula: ").append(toIndentedString(yvalueFormula)).append("\n");
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

  static {
      typeDeterminers.put("Type", TypeEnum.SCATTER);
  }
}
