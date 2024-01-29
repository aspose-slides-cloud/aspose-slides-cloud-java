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
import com.aspose.slides.model.DataSource;
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.SeriesMarker;
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
 * A chart series.
 */
@ApiModel(description = "A chart series.")
public class Series {
  /**
   * Series type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CLUSTEREDCOLUMN("ClusteredColumn"),
    
    STACKEDCOLUMN("StackedColumn"),
    
    PERCENTSSTACKEDCOLUMN("PercentsStackedColumn"),
    
    CLUSTEREDCOLUMN3D("ClusteredColumn3D"),
    
    STACKEDCOLUMN3D("StackedColumn3D"),
    
    PERCENTSSTACKEDCOLUMN3D("PercentsStackedColumn3D"),
    
    COLUMN3D("Column3D"),
    
    CLUSTEREDCYLINDER("ClusteredCylinder"),
    
    STACKEDCYLINDER("StackedCylinder"),
    
    PERCENTSSTACKEDCYLINDER("PercentsStackedCylinder"),
    
    CYLINDER3D("Cylinder3D"),
    
    CLUSTEREDCONE("ClusteredCone"),
    
    STACKEDCONE("StackedCone"),
    
    PERCENTSSTACKEDCONE("PercentsStackedCone"),
    
    CONE3D("Cone3D"),
    
    CLUSTEREDPYRAMID("ClusteredPyramid"),
    
    STACKEDPYRAMID("StackedPyramid"),
    
    PERCENTSSTACKEDPYRAMID("PercentsStackedPyramid"),
    
    PYRAMID3D("Pyramid3D"),
    
    LINE("Line"),
    
    STACKEDLINE("StackedLine"),
    
    PERCENTSSTACKEDLINE("PercentsStackedLine"),
    
    LINEWITHMARKERS("LineWithMarkers"),
    
    STACKEDLINEWITHMARKERS("StackedLineWithMarkers"),
    
    PERCENTSSTACKEDLINEWITHMARKERS("PercentsStackedLineWithMarkers"),
    
    LINE3D("Line3D"),
    
    PIE("Pie"),
    
    PIE3D("Pie3D"),
    
    PIEOFPIE("PieOfPie"),
    
    EXPLODEDPIE("ExplodedPie"),
    
    EXPLODEDPIE3D("ExplodedPie3D"),
    
    BAROFPIE("BarOfPie"),
    
    PERCENTSSTACKEDBAR("PercentsStackedBar"),
    
    CLUSTEREDBAR3D("ClusteredBar3D"),
    
    CLUSTEREDBAR("ClusteredBar"),
    
    STACKEDBAR("StackedBar"),
    
    STACKEDBAR3D("StackedBar3D"),
    
    PERCENTSSTACKEDBAR3D("PercentsStackedBar3D"),
    
    CLUSTEREDHORIZONTALCYLINDER("ClusteredHorizontalCylinder"),
    
    STACKEDHORIZONTALCYLINDER("StackedHorizontalCylinder"),
    
    PERCENTSSTACKEDHORIZONTALCYLINDER("PercentsStackedHorizontalCylinder"),
    
    CLUSTEREDHORIZONTALCONE("ClusteredHorizontalCone"),
    
    STACKEDHORIZONTALCONE("StackedHorizontalCone"),
    
    PERCENTSSTACKEDHORIZONTALCONE("PercentsStackedHorizontalCone"),
    
    CLUSTEREDHORIZONTALPYRAMID("ClusteredHorizontalPyramid"),
    
    STACKEDHORIZONTALPYRAMID("StackedHorizontalPyramid"),
    
    PERCENTSSTACKEDHORIZONTALPYRAMID("PercentsStackedHorizontalPyramid"),
    
    AREA("Area"),
    
    STACKEDAREA("StackedArea"),
    
    PERCENTSSTACKEDAREA("PercentsStackedArea"),
    
    AREA3D("Area3D"),
    
    STACKEDAREA3D("StackedArea3D"),
    
    PERCENTSSTACKEDAREA3D("PercentsStackedArea3D"),
    
    SCATTERWITHMARKERS("ScatterWithMarkers"),
    
    SCATTERWITHSMOOTHLINESANDMARKERS("ScatterWithSmoothLinesAndMarkers"),
    
    SCATTERWITHSMOOTHLINES("ScatterWithSmoothLines"),
    
    SCATTERWITHSTRAIGHTLINESANDMARKERS("ScatterWithStraightLinesAndMarkers"),
    
    SCATTERWITHSTRAIGHTLINES("ScatterWithStraightLines"),
    
    HIGHLOWCLOSE("HighLowClose"),
    
    OPENHIGHLOWCLOSE("OpenHighLowClose"),
    
    VOLUMEHIGHLOWCLOSE("VolumeHighLowClose"),
    
    VOLUMEOPENHIGHLOWCLOSE("VolumeOpenHighLowClose"),
    
    SURFACE3D("Surface3D"),
    
    WIREFRAMESURFACE3D("WireframeSurface3D"),
    
    CONTOUR("Contour"),
    
    WIREFRAMECONTOUR("WireframeContour"),
    
    DOUGHNUT("Doughnut"),
    
    EXPLODEDDOUGHNUT("ExplodedDoughnut"),
    
    BUBBLE("Bubble"),
    
    BUBBLEWITH3D("BubbleWith3D"),
    
    RADAR("Radar"),
    
    RADARWITHMARKERS("RadarWithMarkers"),
    
    FILLEDRADAR("FilledRadar"),
    
    SERIESOFMIXEDTYPES("SeriesOfMixedTypes"),
    
    TREEMAP("Treemap"),
    
    SUNBURST("Sunburst"),
    
    HISTOGRAM("Histogram"),
    
    PARETOLINE("ParetoLine"),
    
    BOXANDWHISKER("BoxAndWhisker"),
    
    WATERFALL("Waterfall"),
    
    FUNNEL("Funnel"),
    
    MAP("Map");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "type", alternate = { "Type" })
  private TypeEnum type;

  @SerializedName(value = "name", alternate = { "Name" })
  private String name;

  @SerializedName(value = "dataSourceForSeriesName", alternate = { "DataSourceForSeriesName" })
  private DataSource dataSourceForSeriesName;

  @SerializedName(value = "isColorVaried", alternate = { "IsColorVaried" })
  private Boolean isColorVaried;

  @SerializedName(value = "invertedSolidFillColor", alternate = { "InvertedSolidFillColor" })
  private String invertedSolidFillColor;

  @SerializedName(value = "smooth", alternate = { "Smooth" })
  private Boolean smooth;

  @SerializedName(value = "plotOnSecondAxis", alternate = { "PlotOnSecondAxis" })
  private Boolean plotOnSecondAxis;

  @SerializedName(value = "order", alternate = { "Order" })
  private Integer order;

  @SerializedName(value = "invertIfNegative", alternate = { "InvertIfNegative" })
  private Boolean invertIfNegative;

  @SerializedName(value = "explosion", alternate = { "Explosion" })
  private Integer explosion;

  @SerializedName(value = "marker", alternate = { "Marker" })
  private SeriesMarker marker;

  @SerializedName(value = "fillFormat", alternate = { "FillFormat" })
  private FillFormat fillFormat;

  @SerializedName(value = "effectFormat", alternate = { "EffectFormat" })
  private EffectFormat effectFormat;

  @SerializedName(value = "lineFormat", alternate = { "LineFormat" })
  private LineFormat lineFormat;

  /**
   * Gets or Sets dataPointType
   */
  @JsonAdapter(DataPointTypeEnum.Adapter.class)
  public enum DataPointTypeEnum {
    ONEVALUE("OneValue"),
    
    SCATTER("Scatter"),
    
    BUBBLE("Bubble");

    private String value;

    DataPointTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataPointTypeEnum fromValue(String text) {
      for (DataPointTypeEnum b : DataPointTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DataPointTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataPointTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataPointTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DataPointTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "dataPointType", alternate = { "DataPointType" })
  private DataPointTypeEnum dataPointType;


  public Series() {
    super();
  }

  public Series type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Series type.
   * @return type
  **/
  @ApiModelProperty(value = "Series type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Series name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Series name.
   * @return name
  **/
  @ApiModelProperty(value = "Series name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Series dataSourceForSeriesName(DataSource dataSourceForSeriesName) {
    this.dataSourceForSeriesName = dataSourceForSeriesName;
    return this;
  }

   /**
   * Series name data source.
   * @return dataSourceForSeriesName
  **/
  @ApiModelProperty(value = "Series name data source.")
  public DataSource getDataSourceForSeriesName() {
    return dataSourceForSeriesName;
  }

  public void setDataSourceForSeriesName(DataSource dataSourceForSeriesName) {
    this.dataSourceForSeriesName = dataSourceForSeriesName;
  }

  public Series isColorVaried(Boolean isColorVaried) {
    this.isColorVaried = isColorVaried;
    return this;
  }

   /**
   * True if each data marker in the series has a different color.
   * @return isColorVaried
  **/
  @ApiModelProperty(value = "True if each data marker in the series has a different color.")
  public Boolean getIsColorVaried() {
    return isColorVaried;
  }

  public void setIsColorVaried(Boolean isColorVaried) {
    this.isColorVaried = isColorVaried;
  }

  public Series invertedSolidFillColor(String invertedSolidFillColor) {
    this.invertedSolidFillColor = invertedSolidFillColor;
    return this;
  }

   /**
   * Invert solid color for the series.
   * @return invertedSolidFillColor
  **/
  @ApiModelProperty(value = "Invert solid color for the series.")
  public String getInvertedSolidFillColor() {
    return invertedSolidFillColor;
  }

  public void setInvertedSolidFillColor(String invertedSolidFillColor) {
    this.invertedSolidFillColor = invertedSolidFillColor;
  }

  public Series smooth(Boolean smooth) {
    this.smooth = smooth;
    return this;
  }

   /**
   * True if curve smoothing is turned on. Applies only to line and scatter connected by lines charts.
   * @return smooth
  **/
  @ApiModelProperty(value = "True if curve smoothing is turned on. Applies only to line and scatter connected by lines charts.")
  public Boolean isSmooth() {
    return smooth;
  }

  public void setSmooth(Boolean smooth) {
    this.smooth = smooth;
  }

  public Series plotOnSecondAxis(Boolean plotOnSecondAxis) {
    this.plotOnSecondAxis = plotOnSecondAxis;
    return this;
  }

   /**
   * True if the series is plotted on second value axis.
   * @return plotOnSecondAxis
  **/
  @ApiModelProperty(value = "True if the series is plotted on second value axis.")
  public Boolean isPlotOnSecondAxis() {
    return plotOnSecondAxis;
  }

  public void setPlotOnSecondAxis(Boolean plotOnSecondAxis) {
    this.plotOnSecondAxis = plotOnSecondAxis;
  }

  public Series order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Series order.
   * @return order
  **/
  @ApiModelProperty(value = "Series order.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public Series invertIfNegative(Boolean invertIfNegative) {
    this.invertIfNegative = invertIfNegative;
    return this;
  }

   /**
   * True if the series shall invert its colors if the value is negative. Applies to bar, column and bubble series.
   * @return invertIfNegative
  **/
  @ApiModelProperty(value = "True if the series shall invert its colors if the value is negative. Applies to bar, column and bubble series.")
  public Boolean isInvertIfNegative() {
    return invertIfNegative;
  }

  public void setInvertIfNegative(Boolean invertIfNegative) {
    this.invertIfNegative = invertIfNegative;
  }

  public Series explosion(Integer explosion) {
    this.explosion = explosion;
    return this;
  }

   /**
   * The distance of an open pie slice from the center of the pie chart is expressed as a percentage of the pie diameter.
   * @return explosion
  **/
  @ApiModelProperty(value = "The distance of an open pie slice from the center of the pie chart is expressed as a percentage of the pie diameter.")
  public Integer getExplosion() {
    return explosion;
  }

  public void setExplosion(Integer explosion) {
    this.explosion = explosion;
  }

  public Series marker(SeriesMarker marker) {
    this.marker = marker;
    return this;
  }

   /**
   * Series marker.
   * @return marker
  **/
  @ApiModelProperty(value = "Series marker.")
  public SeriesMarker getMarker() {
    return marker;
  }

  public void setMarker(SeriesMarker marker) {
    this.marker = marker;
  }

  public Series fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Fill properties set for the series.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Fill properties set for the series.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public Series effectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
    return this;
  }

   /**
   * Effect properties set for the series.
   * @return effectFormat
  **/
  @ApiModelProperty(value = "Effect properties set for the series.")
  public EffectFormat getEffectFormat() {
    return effectFormat;
  }

  public void setEffectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
  }

  public Series lineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
    return this;
  }

   /**
   * Line properties set for the series.
   * @return lineFormat
  **/
  @ApiModelProperty(value = "Line properties set for the series.")
  public LineFormat getLineFormat() {
    return lineFormat;
  }

  public void setLineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
  }

   /**
   * Get dataPointType
   * @return dataPointType
  **/
  @ApiModelProperty(value = "")
  public DataPointTypeEnum getDataPointType() {
    return dataPointType;
  }

  protected void setDataPointType(DataPointTypeEnum dataPointType) {
    this.dataPointType = dataPointType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Series series = (Series) o;
    return true && Objects.equals(this.type, series.type) && Objects.equals(this.name, series.name) && Objects.equals(this.dataSourceForSeriesName, series.dataSourceForSeriesName) && Objects.equals(this.isColorVaried, series.isColorVaried) && Objects.equals(this.invertedSolidFillColor, series.invertedSolidFillColor) && Objects.equals(this.smooth, series.smooth) && Objects.equals(this.plotOnSecondAxis, series.plotOnSecondAxis) && Objects.equals(this.order, series.order) && Objects.equals(this.invertIfNegative, series.invertIfNegative) && Objects.equals(this.explosion, series.explosion) && Objects.equals(this.marker, series.marker) && Objects.equals(this.fillFormat, series.fillFormat) && Objects.equals(this.effectFormat, series.effectFormat) && Objects.equals(this.lineFormat, series.lineFormat) && Objects.equals(this.dataPointType, series.dataPointType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, dataSourceForSeriesName, isColorVaried, invertedSolidFillColor, smooth, plotOnSecondAxis, order, invertIfNegative, explosion, marker, fillFormat, effectFormat, lineFormat, dataPointType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Series {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataSourceForSeriesName: ").append(toIndentedString(dataSourceForSeriesName)).append("\n");
    sb.append("    isColorVaried: ").append(toIndentedString(isColorVaried)).append("\n");
    sb.append("    invertedSolidFillColor: ").append(toIndentedString(invertedSolidFillColor)).append("\n");
    sb.append("    smooth: ").append(toIndentedString(smooth)).append("\n");
    sb.append("    plotOnSecondAxis: ").append(toIndentedString(plotOnSecondAxis)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    invertIfNegative: ").append(toIndentedString(invertIfNegative)).append("\n");
    sb.append("    explosion: ").append(toIndentedString(explosion)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    effectFormat: ").append(toIndentedString(effectFormat)).append("\n");
    sb.append("    lineFormat: ").append(toIndentedString(lineFormat)).append("\n");
    sb.append("    dataPointType: ").append(toIndentedString(dataPointType)).append("\n");
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
