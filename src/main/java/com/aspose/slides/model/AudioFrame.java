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
import com.aspose.slides.model.GeometryShape;
import com.aspose.slides.model.Hyperlink;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.PictureFill;
import com.aspose.slides.model.ResourceUri;
import com.aspose.slides.model.ThreeDFormat;
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
 * Represents AudioFrame resource.
 */
@ApiModel(description = "Represents AudioFrame resource.")
public class AudioFrame extends GeometryShape {
  @SerializedName(value = "audioCdEndTrack", alternate = { "AudioCdEndTrack" })
  private Integer audioCdEndTrack;

  @SerializedName(value = "audioCdEndTrackTime", alternate = { "AudioCdEndTrackTime" })
  private Integer audioCdEndTrackTime;

  @SerializedName(value = "audioCdStartTrack", alternate = { "AudioCdStartTrack" })
  private Integer audioCdStartTrack;

  @SerializedName(value = "audioCdStartTrackTime", alternate = { "AudioCdStartTrackTime" })
  private Integer audioCdStartTrackTime;

  @SerializedName(value = "embedded", alternate = { "Embedded" })
  private Boolean embedded;

  @SerializedName(value = "hideAtShowing", alternate = { "HideAtShowing" })
  private Boolean hideAtShowing;

  @SerializedName(value = "playLoopMode", alternate = { "PlayLoopMode" })
  private Boolean playLoopMode;

  /**
   * Returns or sets the audio play mode.
   */
  @JsonAdapter(PlayModeEnum.Adapter.class)
  public enum PlayModeEnum {
    AUTO("Auto"),
    
    ONCLICK("OnClick"),
    
    ALLSLIDES("AllSlides"),
    
    INCLICKSEQUENCE("InClickSequence"),
    
    MIXED("Mixed");

    private String value;

    PlayModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlayModeEnum fromValue(String text) {
      for (PlayModeEnum b : PlayModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PlayModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlayModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlayModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PlayModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "playMode", alternate = { "PlayMode" })
  private PlayModeEnum playMode;

  /**
   * Returns or sets the audio volume.
   */
  @JsonAdapter(VolumeEnum.Adapter.class)
  public enum VolumeEnum {
    MUTE("Mute"),
    
    LOW("Low"),
    
    MEDIUM("Medium"),
    
    LOUD("Loud"),
    
    MIXED("Mixed");

    private String value;

    VolumeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VolumeEnum fromValue(String text) {
      for (VolumeEnum b : VolumeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VolumeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VolumeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VolumeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VolumeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "volume", alternate = { "Volume" })
  private VolumeEnum volume;

  @SerializedName(value = "volumeValue", alternate = { "VolumeValue" })
  private Double volumeValue;

  @SerializedName(value = "base64Data", alternate = { "Base64Data" })
  private String base64Data;

  @SerializedName(value = "playAcrossSlides", alternate = { "PlayAcrossSlides" })
  private Boolean playAcrossSlides;

  @SerializedName(value = "rewindAudio", alternate = { "RewindAudio" })
  private Boolean rewindAudio;

  @SerializedName(value = "fadeInDuration", alternate = { "FadeInDuration" })
  private Double fadeInDuration;

  @SerializedName(value = "fadeOutDuration", alternate = { "FadeOutDuration" })
  private Double fadeOutDuration;

  @SerializedName(value = "trimFromStart", alternate = { "TrimFromStart" })
  private Double trimFromStart;

  @SerializedName(value = "trimFromEnd", alternate = { "TrimFromEnd" })
  private Double trimFromEnd;

  @SerializedName(value = "pictureFillFormat", alternate = { "PictureFillFormat" })
  private PictureFill pictureFillFormat;


  public AudioFrame() {
    super();
    setType(TypeEnum.AUDIOFRAME);
  }

  public AudioFrame audioCdEndTrack(Integer audioCdEndTrack) {
    this.audioCdEndTrack = audioCdEndTrack;
    return this;
  }

   /**
   * Returns or sets a last track index.
   * @return audioCdEndTrack
  **/
  @ApiModelProperty(value = "Returns or sets a last track index.")
  public Integer getAudioCdEndTrack() {
    return audioCdEndTrack;
  }

  public void setAudioCdEndTrack(Integer audioCdEndTrack) {
    this.audioCdEndTrack = audioCdEndTrack;
  }

  public AudioFrame audioCdEndTrackTime(Integer audioCdEndTrackTime) {
    this.audioCdEndTrackTime = audioCdEndTrackTime;
    return this;
  }

   /**
   * Returns or sets a last track time.
   * @return audioCdEndTrackTime
  **/
  @ApiModelProperty(value = "Returns or sets a last track time.")
  public Integer getAudioCdEndTrackTime() {
    return audioCdEndTrackTime;
  }

  public void setAudioCdEndTrackTime(Integer audioCdEndTrackTime) {
    this.audioCdEndTrackTime = audioCdEndTrackTime;
  }

  public AudioFrame audioCdStartTrack(Integer audioCdStartTrack) {
    this.audioCdStartTrack = audioCdStartTrack;
    return this;
  }

   /**
   * Returns or sets a start track index.
   * @return audioCdStartTrack
  **/
  @ApiModelProperty(value = "Returns or sets a start track index.")
  public Integer getAudioCdStartTrack() {
    return audioCdStartTrack;
  }

  public void setAudioCdStartTrack(Integer audioCdStartTrack) {
    this.audioCdStartTrack = audioCdStartTrack;
  }

  public AudioFrame audioCdStartTrackTime(Integer audioCdStartTrackTime) {
    this.audioCdStartTrackTime = audioCdStartTrackTime;
    return this;
  }

   /**
   * Returns or sets a start track time. 
   * @return audioCdStartTrackTime
  **/
  @ApiModelProperty(value = "Returns or sets a start track time. ")
  public Integer getAudioCdStartTrackTime() {
    return audioCdStartTrackTime;
  }

  public void setAudioCdStartTrackTime(Integer audioCdStartTrackTime) {
    this.audioCdStartTrackTime = audioCdStartTrackTime;
  }

  public AudioFrame embedded(Boolean embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Determines whether a sound is embedded to a presentation.
   * @return embedded
  **/
  @ApiModelProperty(value = "Determines whether a sound is embedded to a presentation.")
  public Boolean isEmbedded() {
    return embedded;
  }

  public void setEmbedded(Boolean embedded) {
    this.embedded = embedded;
  }

  public AudioFrame hideAtShowing(Boolean hideAtShowing) {
    this.hideAtShowing = hideAtShowing;
    return this;
  }

   /**
   * Determines whether an AudioFrame is hidden.
   * @return hideAtShowing
  **/
  @ApiModelProperty(value = "Determines whether an AudioFrame is hidden.")
  public Boolean isHideAtShowing() {
    return hideAtShowing;
  }

  public void setHideAtShowing(Boolean hideAtShowing) {
    this.hideAtShowing = hideAtShowing;
  }

  public AudioFrame playLoopMode(Boolean playLoopMode) {
    this.playLoopMode = playLoopMode;
    return this;
  }

   /**
   * Determines whether an audio is looped. 
   * @return playLoopMode
  **/
  @ApiModelProperty(value = "Determines whether an audio is looped. ")
  public Boolean isPlayLoopMode() {
    return playLoopMode;
  }

  public void setPlayLoopMode(Boolean playLoopMode) {
    this.playLoopMode = playLoopMode;
  }

  public AudioFrame playMode(PlayModeEnum playMode) {
    this.playMode = playMode;
    return this;
  }

   /**
   * Returns or sets the audio play mode.
   * @return playMode
  **/
  @ApiModelProperty(value = "Returns or sets the audio play mode.")
  public PlayModeEnum getPlayMode() {
    return playMode;
  }

  public void setPlayMode(PlayModeEnum playMode) {
    this.playMode = playMode;
  }

  public AudioFrame volume(VolumeEnum volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Returns or sets the audio volume.
   * @return volume
  **/
  @ApiModelProperty(value = "Returns or sets the audio volume.")
  public VolumeEnum getVolume() {
    return volume;
  }

  public void setVolume(VolumeEnum volume) {
    this.volume = volume;
  }

  public AudioFrame volumeValue(Double volumeValue) {
    this.volumeValue = volumeValue;
    return this;
  }

   /**
   * Audio volume percent.
   * @return volumeValue
  **/
  @ApiModelProperty(value = "Audio volume percent.")
  public Double getVolumeValue() {
    return volumeValue;
  }

  public void setVolumeValue(Double volumeValue) {
    this.volumeValue = volumeValue;
  }

  public AudioFrame base64Data(String base64Data) {
    this.base64Data = base64Data;
    return this;
  }

   /**
   * Audio data encoded in base64.
   * @return base64Data
  **/
  @ApiModelProperty(value = "Audio data encoded in base64.")
  public String getBase64Data() {
    return base64Data;
  }

  public void setBase64Data(String base64Data) {
    this.base64Data = base64Data;
  }

  public AudioFrame playAcrossSlides(Boolean playAcrossSlides) {
    this.playAcrossSlides = playAcrossSlides;
    return this;
  }

   /**
   * Determines whether an audio is playing across the slides.
   * @return playAcrossSlides
  **/
  @ApiModelProperty(value = "Determines whether an audio is playing across the slides.")
  public Boolean isPlayAcrossSlides() {
    return playAcrossSlides;
  }

  public void setPlayAcrossSlides(Boolean playAcrossSlides) {
    this.playAcrossSlides = playAcrossSlides;
  }

  public AudioFrame rewindAudio(Boolean rewindAudio) {
    this.rewindAudio = rewindAudio;
    return this;
  }

   /**
   * Determines whether audio is automatically rewound to start after playing.
   * @return rewindAudio
  **/
  @ApiModelProperty(value = "Determines whether audio is automatically rewound to start after playing.")
  public Boolean isRewindAudio() {
    return rewindAudio;
  }

  public void setRewindAudio(Boolean rewindAudio) {
    this.rewindAudio = rewindAudio;
  }

  public AudioFrame fadeInDuration(Double fadeInDuration) {
    this.fadeInDuration = fadeInDuration;
    return this;
  }

   /**
   * Time duration for the initial fade-in of the media in milliseconds.
   * @return fadeInDuration
  **/
  @ApiModelProperty(value = "Time duration for the initial fade-in of the media in milliseconds.")
  public Double getFadeInDuration() {
    return fadeInDuration;
  }

  public void setFadeInDuration(Double fadeInDuration) {
    this.fadeInDuration = fadeInDuration;
  }

  public AudioFrame fadeOutDuration(Double fadeOutDuration) {
    this.fadeOutDuration = fadeOutDuration;
    return this;
  }

   /**
   * Time duration for the ending fade-out of the media in milliseconds.
   * @return fadeOutDuration
  **/
  @ApiModelProperty(value = "Time duration for the ending fade-out of the media in milliseconds.")
  public Double getFadeOutDuration() {
    return fadeOutDuration;
  }

  public void setFadeOutDuration(Double fadeOutDuration) {
    this.fadeOutDuration = fadeOutDuration;
  }

  public AudioFrame trimFromStart(Double trimFromStart) {
    this.trimFromStart = trimFromStart;
    return this;
  }

   /**
   * Time duration to be removed from the beginning of the media during playback in milliseconds.
   * @return trimFromStart
  **/
  @ApiModelProperty(value = "Time duration to be removed from the beginning of the media during playback in milliseconds.")
  public Double getTrimFromStart() {
    return trimFromStart;
  }

  public void setTrimFromStart(Double trimFromStart) {
    this.trimFromStart = trimFromStart;
  }

  public AudioFrame trimFromEnd(Double trimFromEnd) {
    this.trimFromEnd = trimFromEnd;
    return this;
  }

   /**
   * Time duration to be removed from the end of the media during playback in milliseconds.
   * @return trimFromEnd
  **/
  @ApiModelProperty(value = "Time duration to be removed from the end of the media during playback in milliseconds.")
  public Double getTrimFromEnd() {
    return trimFromEnd;
  }

  public void setTrimFromEnd(Double trimFromEnd) {
    this.trimFromEnd = trimFromEnd;
  }

  public AudioFrame pictureFillFormat(PictureFill pictureFillFormat) {
    this.pictureFillFormat = pictureFillFormat;
    return this;
  }

   /**
   * Picture fill format.
   * @return pictureFillFormat
  **/
  @ApiModelProperty(value = "Picture fill format.")
  public PictureFill getPictureFillFormat() {
    return pictureFillFormat;
  }

  public void setPictureFillFormat(PictureFill pictureFillFormat) {
    this.pictureFillFormat = pictureFillFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioFrame audioFrame = (AudioFrame) o;
    return true && Objects.equals(this.audioCdEndTrack, audioFrame.audioCdEndTrack) && Objects.equals(this.audioCdEndTrackTime, audioFrame.audioCdEndTrackTime) && Objects.equals(this.audioCdStartTrack, audioFrame.audioCdStartTrack) && Objects.equals(this.audioCdStartTrackTime, audioFrame.audioCdStartTrackTime) && Objects.equals(this.embedded, audioFrame.embedded) && Objects.equals(this.hideAtShowing, audioFrame.hideAtShowing) && Objects.equals(this.playLoopMode, audioFrame.playLoopMode) && Objects.equals(this.playMode, audioFrame.playMode) && Objects.equals(this.volume, audioFrame.volume) && Objects.equals(this.volumeValue, audioFrame.volumeValue) && Objects.equals(this.base64Data, audioFrame.base64Data) && Objects.equals(this.playAcrossSlides, audioFrame.playAcrossSlides) && Objects.equals(this.rewindAudio, audioFrame.rewindAudio) && Objects.equals(this.fadeInDuration, audioFrame.fadeInDuration) && Objects.equals(this.fadeOutDuration, audioFrame.fadeOutDuration) && Objects.equals(this.trimFromStart, audioFrame.trimFromStart) && Objects.equals(this.trimFromEnd, audioFrame.trimFromEnd) && Objects.equals(this.pictureFillFormat, audioFrame.pictureFillFormat) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioCdEndTrack, audioCdEndTrackTime, audioCdStartTrack, audioCdStartTrackTime, embedded, hideAtShowing, playLoopMode, playMode, volume, volumeValue, base64Data, playAcrossSlides, rewindAudio, fadeInDuration, fadeOutDuration, trimFromStart, trimFromEnd, pictureFillFormat, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioFrame {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    audioCdEndTrack: ").append(toIndentedString(audioCdEndTrack)).append("\n");
    sb.append("    audioCdEndTrackTime: ").append(toIndentedString(audioCdEndTrackTime)).append("\n");
    sb.append("    audioCdStartTrack: ").append(toIndentedString(audioCdStartTrack)).append("\n");
    sb.append("    audioCdStartTrackTime: ").append(toIndentedString(audioCdStartTrackTime)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    hideAtShowing: ").append(toIndentedString(hideAtShowing)).append("\n");
    sb.append("    playLoopMode: ").append(toIndentedString(playLoopMode)).append("\n");
    sb.append("    playMode: ").append(toIndentedString(playMode)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    volumeValue: ").append(toIndentedString(volumeValue)).append("\n");
    sb.append("    base64Data: ").append(toIndentedString(base64Data)).append("\n");
    sb.append("    playAcrossSlides: ").append(toIndentedString(playAcrossSlides)).append("\n");
    sb.append("    rewindAudio: ").append(toIndentedString(rewindAudio)).append("\n");
    sb.append("    fadeInDuration: ").append(toIndentedString(fadeInDuration)).append("\n");
    sb.append("    fadeOutDuration: ").append(toIndentedString(fadeOutDuration)).append("\n");
    sb.append("    trimFromStart: ").append(toIndentedString(trimFromStart)).append("\n");
    sb.append("    trimFromEnd: ").append(toIndentedString(trimFromEnd)).append("\n");
    sb.append("    pictureFillFormat: ").append(toIndentedString(pictureFillFormat)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.AUDIOFRAME);
  }
}
