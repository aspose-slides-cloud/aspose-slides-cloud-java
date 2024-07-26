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
import com.aspose.slides.model.OutputFile;
import com.aspose.slides.model.Task;
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
 * Save slide task.
 */
@ApiModel(description = "Save slide task.")
public class Save extends Task {
  /**
   * Format.
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    PDF("Pdf"),
    
    XPS("Xps"),
    
    TIFF("Tiff"),
    
    PPTX("Pptx"),
    
    ODP("Odp"),
    
    OTP("Otp"),
    
    PPT("Ppt"),
    
    PPS("Pps"),
    
    PPSX("Ppsx"),
    
    PPTM("Pptm"),
    
    PPSM("Ppsm"),
    
    POT("Pot"),
    
    POTX("Potx"),
    
    POTM("Potm"),
    
    HTML("Html"),
    
    HTML5("Html5"),
    
    SWF("Swf"),
    
    SVG("Svg"),
    
    JPEG("Jpeg"),
    
    PNG("Png"),
    
    GIF("Gif"),
    
    BMP("Bmp"),
    
    FODP("Fodp"),
    
    XAML("Xaml"),
    
    MPEG4("Mpeg4"),
    
    MD("Md"),
    
    XML("Xml");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String text) {
      for (FormatEnum b : FormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "format", alternate = { "Format" })
  private FormatEnum format;

  @SerializedName(value = "output", alternate = { "Output" })
  private OutputFile output;

  @SerializedName(value = "options", alternate = { "Options" })
  private ExportOptions options;


  public Save() {
    super();
    setType(TypeEnum.SAVE);
  }

  public Save format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * Format.
   * @return format
  **/
  @ApiModelProperty(required = true, value = "Format.")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public Save output(OutputFile output) {
    this.output = output;
    return this;
  }

   /**
   * Output file.
   * @return output
  **/
  @ApiModelProperty(value = "Output file.")
  public OutputFile getOutput() {
    return output;
  }

  public void setOutput(OutputFile output) {
    this.output = output;
  }

  public Save options(ExportOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Save options.
   * @return options
  **/
  @ApiModelProperty(value = "Save options.")
  public ExportOptions getOptions() {
    return options;
  }

  public void setOptions(ExportOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Save save = (Save) o;
    return true && Objects.equals(this.format, save.format) && Objects.equals(this.output, save.output) && Objects.equals(this.options, save.options) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, output, options, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Save {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.SAVE);
  }
}
