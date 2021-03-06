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
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.OneValueChartDataPoint;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Represents chart category resource
 */
@ApiModel(description = "Represents chart category resource")
public class ChartCategory {
  @SerializedName(value = "parentCategories", alternate = { "ParentCategories" })
  private List<String> parentCategories = null;

  @SerializedName(value = "level", alternate = { "Level" })
  private Integer level;

  @SerializedName(value = "value", alternate = { "Value" })
  private String value;

  @SerializedName(value = "fillFormat", alternate = { "FillFormat" })
  private FillFormat fillFormat;

  @SerializedName(value = "effectFormat", alternate = { "EffectFormat" })
  private EffectFormat effectFormat;

  @SerializedName(value = "lineFormat", alternate = { "LineFormat" })
  private LineFormat lineFormat;

  @SerializedName(value = "dataPoints", alternate = { "DataPoints" })
  private List<OneValueChartDataPoint> dataPoints = null;


  public ChartCategory() {
    super();
  }

  public ChartCategory parentCategories(List<String> parentCategories) {
    this.parentCategories = parentCategories;
    return this;
  }

  public ChartCategory addParentCategoriesItem(String parentCategoriesItem) {
    if (this.parentCategories == null) {
      this.parentCategories = new ArrayList<String>();
    }
    this.parentCategories.add(parentCategoriesItem);
    return this;
  }

   /**
   * Gets or sets the parent categories. Used with Sunburst &amp;amp; treemap categories; ignored for other chart types.
   * @return parentCategories
  **/
  @ApiModelProperty(value = "Gets or sets the parent categories. Used with Sunburst &amp; treemap categories; ignored for other chart types.")
  public List<String> getParentCategories() {
    return parentCategories;
  }

  public void setParentCategories(List<String> parentCategories) {
    this.parentCategories = parentCategories;
  }

  public ChartCategory level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Gets or sets the grouping level for the category. Used with Sunburst &amp;amp; treemap categories; ignored for other chart types.
   * @return level
  **/
  @ApiModelProperty(value = "Gets or sets the grouping level for the category. Used with Sunburst &amp; treemap categories; ignored for other chart types.")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public ChartCategory value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Category value
   * @return value
  **/
  @ApiModelProperty(value = "Category value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ChartCategory fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Get or sets the fill format.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Get or sets the fill format.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public ChartCategory effectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
    return this;
  }

   /**
   * Get or sets the effect format.
   * @return effectFormat
  **/
  @ApiModelProperty(value = "Get or sets the effect format.")
  public EffectFormat getEffectFormat() {
    return effectFormat;
  }

  public void setEffectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
  }

  public ChartCategory lineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
    return this;
  }

   /**
   * Get or sets the line format.
   * @return lineFormat
  **/
  @ApiModelProperty(value = "Get or sets the line format.")
  public LineFormat getLineFormat() {
    return lineFormat;
  }

  public void setLineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
  }

  public ChartCategory dataPoints(List<OneValueChartDataPoint> dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  public ChartCategory addDataPointsItem(OneValueChartDataPoint dataPointsItem) {
    if (this.dataPoints == null) {
      this.dataPoints = new ArrayList<OneValueChartDataPoint>();
    }
    this.dataPoints.add(dataPointsItem);
    return this;
  }

   /**
   * Gets or sets the data points for chart data
   * @return dataPoints
  **/
  @ApiModelProperty(value = "Gets or sets the data points for chart data")
  public List<OneValueChartDataPoint> getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(List<OneValueChartDataPoint> dataPoints) {
    this.dataPoints = dataPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartCategory chartCategory = (ChartCategory) o;
    return true && Objects.equals(this.parentCategories, chartCategory.parentCategories) && Objects.equals(this.level, chartCategory.level) && Objects.equals(this.value, chartCategory.value) && Objects.equals(this.fillFormat, chartCategory.fillFormat) && Objects.equals(this.effectFormat, chartCategory.effectFormat) && Objects.equals(this.lineFormat, chartCategory.lineFormat) && Objects.equals(this.dataPoints, chartCategory.dataPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentCategories, level, value, fillFormat, effectFormat, lineFormat, dataPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartCategory {\n");
    
    sb.append("    parentCategories: ").append(toIndentedString(parentCategories)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    effectFormat: ").append(toIndentedString(effectFormat)).append("\n");
    sb.append("    lineFormat: ").append(toIndentedString(lineFormat)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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
