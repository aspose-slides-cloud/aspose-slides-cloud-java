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
import com.aspose.slides.model.ExportOptions;
import com.aspose.slides.model.FontFallbackRule;
import com.aspose.slides.model.FontSubstRule;
import com.aspose.slides.model.NotesCommentsLayoutingOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Provides options that control how a presentation is saved in Html5 format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in Html5 format.")
public class Html5ExportOptions extends ExportOptions {
  @SerializedName(value = "animateTransitions", alternate = { "AnimateTransitions" })
  private Boolean animateTransitions;

  @SerializedName(value = "animateShapes", alternate = { "AnimateShapes" })
  private Boolean animateShapes;

  @SerializedName(value = "embedImages", alternate = { "EmbedImages" })
  private Boolean embedImages;

  @SerializedName(value = "notesCommentsLayouting", alternate = { "NotesCommentsLayouting" })
  private NotesCommentsLayoutingOptions notesCommentsLayouting;

  @SerializedName(value = "templatesPath", alternate = { "TemplatesPath" })
  private String templatesPath;


  public Html5ExportOptions() {
    super();
    setFormat("HTML5");
  }

  public Html5ExportOptions animateTransitions(Boolean animateTransitions) {
    this.animateTransitions = animateTransitions;
    return this;
  }

   /**
   * Gets or sets transitions animation option.
   * @return animateTransitions
  **/
  @ApiModelProperty(value = "Gets or sets transitions animation option.")
  public Boolean isAnimateTransitions() {
    return animateTransitions;
  }

  public void setAnimateTransitions(Boolean animateTransitions) {
    this.animateTransitions = animateTransitions;
  }

  public Html5ExportOptions animateShapes(Boolean animateShapes) {
    this.animateShapes = animateShapes;
    return this;
  }

   /**
   * Gets or sets shapes animation option.
   * @return animateShapes
  **/
  @ApiModelProperty(value = "Gets or sets shapes animation option.")
  public Boolean isAnimateShapes() {
    return animateShapes;
  }

  public void setAnimateShapes(Boolean animateShapes) {
    this.animateShapes = animateShapes;
  }

  public Html5ExportOptions embedImages(Boolean embedImages) {
    this.embedImages = embedImages;
    return this;
  }

   /**
   * Gets or sets embed images option.
   * @return embedImages
  **/
  @ApiModelProperty(value = "Gets or sets embed images option.")
  public Boolean isEmbedImages() {
    return embedImages;
  }

  public void setEmbedImages(Boolean embedImages) {
    this.embedImages = embedImages;
  }

  public Html5ExportOptions notesCommentsLayouting(NotesCommentsLayoutingOptions notesCommentsLayouting) {
    this.notesCommentsLayouting = notesCommentsLayouting;
    return this;
  }

   /**
   * Slides layouting options
   * @return notesCommentsLayouting
  **/
  @ApiModelProperty(value = "Slides layouting options")
  public NotesCommentsLayoutingOptions getNotesCommentsLayouting() {
    return notesCommentsLayouting;
  }

  public void setNotesCommentsLayouting(NotesCommentsLayoutingOptions notesCommentsLayouting) {
    this.notesCommentsLayouting = notesCommentsLayouting;
  }

  public Html5ExportOptions templatesPath(String templatesPath) {
    this.templatesPath = templatesPath;
    return this;
  }

   /**
   * Path to custom templates
   * @return templatesPath
  **/
  @ApiModelProperty(value = "Path to custom templates")
  public String getTemplatesPath() {
    return templatesPath;
  }

  public void setTemplatesPath(String templatesPath) {
    this.templatesPath = templatesPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Html5ExportOptions html5ExportOptions = (Html5ExportOptions) o;
    return true && Objects.equals(this.animateTransitions, html5ExportOptions.animateTransitions) && Objects.equals(this.animateShapes, html5ExportOptions.animateShapes) && Objects.equals(this.embedImages, html5ExportOptions.embedImages) && Objects.equals(this.notesCommentsLayouting, html5ExportOptions.notesCommentsLayouting) && Objects.equals(this.templatesPath, html5ExportOptions.templatesPath) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(animateTransitions, animateShapes, embedImages, notesCommentsLayouting, templatesPath, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Html5ExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    animateTransitions: ").append(toIndentedString(animateTransitions)).append("\n");
    sb.append("    animateShapes: ").append(toIndentedString(animateShapes)).append("\n");
    sb.append("    embedImages: ").append(toIndentedString(embedImages)).append("\n");
    sb.append("    notesCommentsLayouting: ").append(toIndentedString(notesCommentsLayouting)).append("\n");
    sb.append("    templatesPath: ").append(toIndentedString(templatesPath)).append("\n");
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
