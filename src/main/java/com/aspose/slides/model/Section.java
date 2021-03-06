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
import com.aspose.slides.model.ResourceBase;
import com.aspose.slides.model.ResourceUri;
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
 * Presentation section.
 */
@ApiModel(description = "Presentation section.")
public class Section extends ResourceBase {
  @SerializedName(value = "name", alternate = { "Name" })
  private String name;

  @SerializedName(value = "firstSlideIndex", alternate = { "FirstSlideIndex" })
  private Integer firstSlideIndex;

  @SerializedName(value = "slideList", alternate = { "SlideList" })
  private List<ResourceUri> slideList = null;


  public Section() {
    super();
  }

  public Section name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name.
   * @return name
  **/
  @ApiModelProperty(value = "Name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Section firstSlideIndex(Integer firstSlideIndex) {
    this.firstSlideIndex = firstSlideIndex;
    return this;
  }

   /**
   * One-based index of slide with which the section starts.
   * @return firstSlideIndex
  **/
  @ApiModelProperty(required = true, value = "One-based index of slide with which the section starts.")
  public Integer getFirstSlideIndex() {
    return firstSlideIndex;
  }

  public void setFirstSlideIndex(Integer firstSlideIndex) {
    this.firstSlideIndex = firstSlideIndex;
  }

  public Section slideList(List<ResourceUri> slideList) {
    this.slideList = slideList;
    return this;
  }

  public Section addSlideListItem(ResourceUri slideListItem) {
    if (this.slideList == null) {
      this.slideList = new ArrayList<ResourceUri>();
    }
    this.slideList.add(slideListItem);
    return this;
  }

   /**
   * Links to the shapes contained in the section.
   * @return slideList
  **/
  @ApiModelProperty(value = "Links to the shapes contained in the section.")
  public List<ResourceUri> getSlideList() {
    return slideList;
  }

  public void setSlideList(List<ResourceUri> slideList) {
    this.slideList = slideList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Section section = (Section) o;
    return true && Objects.equals(this.name, section.name) && Objects.equals(this.firstSlideIndex, section.firstSlideIndex) && Objects.equals(this.slideList, section.slideList) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, firstSlideIndex, slideList, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Section {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstSlideIndex: ").append(toIndentedString(firstSlideIndex)).append("\n");
    sb.append("    slideList: ").append(toIndentedString(slideList)).append("\n");
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
