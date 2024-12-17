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
 * Represents comment of slide
 */
@ApiModel(description = "Represents comment of slide")
public class Effect {
  /**
   * Effect type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    APPEAR("Appear"),
    
    CURVEUPDOWN("CurveUpDown"),
    
    ASCEND("Ascend"),
    
    FLOATUP("FloatUp"),
    
    BLAST("Blast"),
    
    BLINDS("Blinds"),
    
    BLINK("Blink"),
    
    BOLDFLASH("BoldFlash"),
    
    BOLDREVEAL("BoldReveal"),
    
    BOOMERANG("Boomerang"),
    
    BOUNCE("Bounce"),
    
    BOX("Box"),
    
    BRUSHONCOLOR("BrushOnColor"),
    
    BRUSHONUNDERLINE("BrushOnUnderline"),
    
    CENTERREVOLVE("CenterRevolve"),
    
    CHANGEFILLCOLOR("ChangeFillColor"),
    
    CHANGEFONT("ChangeFont"),
    
    CHANGEFONTCOLOR("ChangeFontColor"),
    
    CHANGEFONTSIZE("ChangeFontSize"),
    
    CHANGEFONTSTYLE("ChangeFontStyle"),
    
    CHANGELINECOLOR("ChangeLineColor"),
    
    CHECKERBOARD("Checkerboard"),
    
    CIRCLE("Circle"),
    
    COLORBLEND("ColorBlend"),
    
    COLORTYPEWRITER("ColorTypewriter"),
    
    COLORWAVE("ColorWave"),
    
    COMPLEMENTARYCOLOR("ComplementaryColor"),
    
    COMPLEMENTARYCOLOR2("ComplementaryColor2"),
    
    COMPRESS("Compress"),
    
    CONTRASTINGCOLOR("ContrastingColor"),
    
    CRAWL("Crawl"),
    
    CREDITS("Credits"),
    
    CUSTOM("Custom"),
    
    DARKEN("Darken"),
    
    DESATURATE("Desaturate"),
    
    DESCEND("Descend"),
    
    FLOATDOWN("Floatdown"),
    
    DIAMOND("Diamond"),
    
    DISSOLVE("Dissolve"),
    
    EASEINOUT("EaseInOut"),
    
    EXPAND("Expand"),
    
    FADE("Fade"),
    
    FADEDSWIVEL("FadedSwivel"),
    
    FADEDZOOM("FadedZoom"),
    
    FLASHBULB("FlashBulb"),
    
    FLASHONCE("FlashOnce"),
    
    FLICKER("Flicker"),
    
    FLIP("Flip"),
    
    FLOAT("Float"),
    
    FLY("Fly"),
    
    FOLD("Fold"),
    
    GLIDE("Glide"),
    
    GROWANDTURN("GrowAndTurn"),
    
    GROWSHRINK("GrowShrink"),
    
    GROWWITHCOLOR("GrowWithColor"),
    
    LIGHTEN("Lighten"),
    
    LIGHTSPEED("LightSpeed"),
    
    MEDIAPAUSE("MediaPause"),
    
    MEDIAPLAY("MediaPlay"),
    
    MEDIASTOP("MediaStop"),
    
    PATH4POINTSTAR("Path4PointStar"),
    
    PATH5POINTSTAR("Path5PointStar"),
    
    PATH6POINTSTAR("Path6PointStar"),
    
    PATH8POINTSTAR("Path8PointStar"),
    
    PATHARCDOWN("PathArcDown"),
    
    PATHARCLEFT("PathArcLeft"),
    
    PATHARCRIGHT("PathArcRight"),
    
    PATHARCUP("PathArcUp"),
    
    PATHBEAN("PathBean"),
    
    PATHBOUNCELEFT("PathBounceLeft"),
    
    PATHBOUNCERIGHT("PathBounceRight"),
    
    PATHBUZZSAW("PathBuzzsaw"),
    
    PATHCIRCLE("PathCircle"),
    
    PATHCRESCENTMOON("PathCrescentMoon"),
    
    PATHCURVEDSQUARE("PathCurvedSquare"),
    
    PATHCURVEDX("PathCurvedX"),
    
    PATHCURVYLEFT("PathCurvyLeft"),
    
    PATHCURVYRIGHT("PathCurvyRight"),
    
    PATHCURVYSTAR("PathCurvyStar"),
    
    PATHDECAYINGWAVE("PathDecayingWave"),
    
    PATHDIAGONALDOWNRIGHT("PathDiagonalDownRight"),
    
    PATHDIAGONALUPRIGHT("PathDiagonalUpRight"),
    
    PATHDIAMOND("PathDiamond"),
    
    PATHDOWN("PathDown"),
    
    PATHEQUALTRIANGLE("PathEqualTriangle"),
    
    PATHFIGURE8FOUR("PathFigure8Four"),
    
    PATHFOOTBALL("PathFootball"),
    
    PATHFUNNEL("PathFunnel"),
    
    PATHHEART("PathHeart"),
    
    PATHHEARTBEAT("PathHeartbeat"),
    
    PATHHEXAGON("PathHexagon"),
    
    PATHHORIZONTALFIGURE8("PathHorizontalFigure8"),
    
    PATHINVERTEDSQUARE("PathInvertedSquare"),
    
    PATHINVERTEDTRIANGLE("PathInvertedTriangle"),
    
    PATHLEFT("PathLeft"),
    
    PATHLOOPDELOOP("PathLoopdeLoop"),
    
    PATHNEUTRON("PathNeutron"),
    
    PATHOCTAGON("PathOctagon"),
    
    PATHPARALLELOGRAM("PathParallelogram"),
    
    PATHPEANUT("PathPeanut"),
    
    PATHPENTAGON("PathPentagon"),
    
    PATHPLUS("PathPlus"),
    
    PATHPOINTYSTAR("PathPointyStar"),
    
    PATHRIGHT("PathRight"),
    
    PATHRIGHTTRIANGLE("PathRightTriangle"),
    
    PATHSCURVE1("PathSCurve1"),
    
    PATHSCURVE2("PathSCurve2"),
    
    PATHSINEWAVE("PathSineWave"),
    
    PATHSPIRALLEFT("PathSpiralLeft"),
    
    PATHSPIRALRIGHT("PathSpiralRight"),
    
    PATHSPRING("PathSpring"),
    
    PATHSQUARE("PathSquare"),
    
    PATHSTAIRSDOWN("PathStairsDown"),
    
    PATHSWOOSH("PathSwoosh"),
    
    PATHTEARDROP("PathTeardrop"),
    
    PATHTRAPEZOID("PathTrapezoid"),
    
    PATHTURNDOWN("PathTurnDown"),
    
    PATHTURNRIGHT("PathTurnRight"),
    
    PATHTURNUP("PathTurnUp"),
    
    PATHTURNUPRIGHT("PathTurnUpRight"),
    
    PATHUP("PathUp"),
    
    PATHUSER("PathUser"),
    
    PATHVERTICALFIGURE8("PathVerticalFigure8"),
    
    PATHWAVE("PathWave"),
    
    PATHZIGZAG("PathZigzag"),
    
    PEEK("Peek"),
    
    PINWHEEL("Pinwheel"),
    
    PLUS("Plus"),
    
    RANDOMBARS("RandomBars"),
    
    RANDOMEFFECTS("RandomEffects"),
    
    RISEUP("RiseUp"),
    
    SHIMMER("Shimmer"),
    
    SLING("Sling"),
    
    SPIN("Spin"),
    
    SPINNER("Spinner"),
    
    SPIRAL("Spiral"),
    
    SPLIT("Split"),
    
    STRETCH("Stretch"),
    
    STRIPS("Strips"),
    
    STYLEEMPHASIS("StyleEmphasis"),
    
    SWISH("Swish"),
    
    SWIVEL("Swivel"),
    
    TEETER("Teeter"),
    
    THREAD("Thread"),
    
    TRANSPARENCY("Transparency"),
    
    UNFOLD("Unfold"),
    
    VERTICALGROW("VerticalGrow"),
    
    WAVE("Wave"),
    
    WEDGE("Wedge"),
    
    WHEEL("Wheel"),
    
    WHIP("Whip"),
    
    WIPE("Wipe"),
    
    MAGNIFY("Magnify"),
    
    ZOOM("Zoom"),
    
    OLEOBJECTSHOW("OLEObjectShow"),
    
    OLEOBJECTEDIT("OLEObjectEdit"),
    
    OLEOBJECTOPEN("OLEObjectOpen");

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

  /**
   * Effect subtype.
   */
  @JsonAdapter(SubtypeEnum.Adapter.class)
  public enum SubtypeEnum {
    NONE("None"),
    
    ACROSS("Across"),
    
    BOTTOM("Bottom"),
    
    BOTTOMLEFT("BottomLeft"),
    
    BOTTOMRIGHT("BottomRight"),
    
    CENTER("Center"),
    
    OBJECTCENTER("ObjectCenter"),
    
    SLIDECENTER("SlideCenter"),
    
    CLOCKWISE("Clockwise"),
    
    COUNTERCLOCKWISE("CounterClockwise"),
    
    GRADUALANDCYCLECLOCKWISE("GradualAndCycleClockwise"),
    
    GRADUALANDCYCLECOUNTERCLOCKWISE("GradualAndCycleCounterClockwise"),
    
    DOWN("Down"),
    
    DOWNLEFT("DownLeft"),
    
    DOWNRIGHT("DownRight"),
    
    FONTALLCAPS("FontAllCaps"),
    
    FONTBOLD("FontBold"),
    
    FONTITALIC("FontItalic"),
    
    FONTSHADOW("FontShadow"),
    
    FONTSTRIKETHROUGH("FontStrikethrough"),
    
    FONTUNDERLINE("FontUnderline"),
    
    GRADUAL("Gradual"),
    
    HORIZONTAL("Horizontal"),
    
    HORIZONTALIN("HorizontalIn"),
    
    HORIZONTALOUT("HorizontalOut"),
    
    IN("In"),
    
    INBOTTOM("InBottom"),
    
    INCENTER("InCenter"),
    
    INSLIGHTLY("InSlightly"),
    
    INSTANT("Instant"),
    
    LEFT("Left"),
    
    ORDINALMASK("OrdinalMask"),
    
    OUT("Out"),
    
    OUTBOTTOM("OutBottom"),
    
    OUTCENTER("OutCenter"),
    
    OUTSLIGHTLY("OutSlightly"),
    
    RIGHT("Right"),
    
    SLIGHTLY("Slightly"),
    
    TOP("Top"),
    
    TOPLEFT("TopLeft"),
    
    TOPRIGHT("TopRight"),
    
    UP("Up"),
    
    UPLEFT("UpLeft"),
    
    UPRIGHT("UpRight"),
    
    VERTICAL("Vertical"),
    
    VERTICALIN("VerticalIn"),
    
    VERTICALOUT("VerticalOut"),
    
    WHEEL1("Wheel1"),
    
    WHEEL2("Wheel2"),
    
    WHEEL3("Wheel3"),
    
    WHEEL4("Wheel4"),
    
    WHEEL8("Wheel8");

    private String value;

    SubtypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubtypeEnum fromValue(String text) {
      for (SubtypeEnum b : SubtypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubtypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "subtype", alternate = { "Subtype" })
  private SubtypeEnum subtype;

  /**
   * Preset class type.
   */
  @JsonAdapter(PresetClassTypeEnum.Adapter.class)
  public enum PresetClassTypeEnum {
    ENTRANCE("Entrance"),
    
    EXIT("Exit"),
    
    EMPHASIS("Emphasis"),
    
    PATH("Path"),
    
    MEDIACALL("MediaCall"),
    
    OLEACTIONVERBS("OLEActionVerbs");

    private String value;

    PresetClassTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PresetClassTypeEnum fromValue(String text) {
      for (PresetClassTypeEnum b : PresetClassTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PresetClassTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PresetClassTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PresetClassTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PresetClassTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "presetClassType", alternate = { "PresetClassType" })
  private PresetClassTypeEnum presetClassType;

  /**
   * Preset class type.
   */
  @JsonAdapter(AnimateTextTypeEnum.Adapter.class)
  public enum AnimateTextTypeEnum {
    ALLATONCE("AllAtOnce"),
    
    BYWORD("ByWord"),
    
    BYLETTER("ByLetter");

    private String value;

    AnimateTextTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AnimateTextTypeEnum fromValue(String text) {
      for (AnimateTextTypeEnum b : AnimateTextTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AnimateTextTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnimateTextTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AnimateTextTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AnimateTextTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "animateTextType", alternate = { "AnimateTextType" })
  private AnimateTextTypeEnum animateTextType;

  @SerializedName(value = "shapeIndex", alternate = { "ShapeIndex" })
  private Integer shapeIndex;

  @SerializedName(value = "paragraphIndex", alternate = { "ParagraphIndex" })
  private Integer paragraphIndex;

  /**
   * Effect trigger type.
   */
  @JsonAdapter(TriggerTypeEnum.Adapter.class)
  public enum TriggerTypeEnum {
    AFTERPREVIOUS("AfterPrevious"),
    
    ONCLICK("OnClick"),
    
    WITHPREVIOUS("WithPrevious");

    private String value;

    TriggerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TriggerTypeEnum fromValue(String text) {
      for (TriggerTypeEnum b : TriggerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TriggerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TriggerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TriggerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TriggerTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "triggerType", alternate = { "TriggerType" })
  private TriggerTypeEnum triggerType;

  @SerializedName(value = "accelerate", alternate = { "Accelerate" })
  private Double accelerate;

  @SerializedName(value = "autoReverse", alternate = { "AutoReverse" })
  private Boolean autoReverse;

  @SerializedName(value = "decelerate", alternate = { "Decelerate" })
  private Double decelerate;

  @SerializedName(value = "duration", alternate = { "Duration" })
  private Double duration;

  @SerializedName(value = "repeatCount", alternate = { "RepeatCount" })
  private Double repeatCount;

  @SerializedName(value = "repeatDuration", alternate = { "RepeatDuration" })
  private Double repeatDuration;

  /**
   * The way for a effect to restart after complete.
   */
  @JsonAdapter(RestartEnum.Adapter.class)
  public enum RestartEnum {
    ALWAYS("Always"),
    
    WHENNOTACTIVE("WhenNotActive"),
    
    NEVER("Never"),
    
    NOTDEFINED("NotDefined");

    private String value;

    RestartEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RestartEnum fromValue(String text) {
      for (RestartEnum b : RestartEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RestartEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RestartEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RestartEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RestartEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "restart", alternate = { "Restart" })
  private RestartEnum restart;

  @SerializedName(value = "speed", alternate = { "Speed" })
  private Double speed;

  @SerializedName(value = "triggerDelayTime", alternate = { "TriggerDelayTime" })
  private Double triggerDelayTime;

  @SerializedName(value = "repeatUntilEndSlide", alternate = { "RepeatUntilEndSlide" })
  private Boolean repeatUntilEndSlide;

  @SerializedName(value = "repeatUntilNextClick", alternate = { "RepeatUntilNextClick" })
  private Boolean repeatUntilNextClick;

  @SerializedName(value = "stopPreviousSound", alternate = { "StopPreviousSound" })
  private Boolean stopPreviousSound;

  @SerializedName(value = "rewind", alternate = { "Rewind" })
  private Boolean rewind;

  /**
   * Defined an after animation color for effect.
   */
  @JsonAdapter(AfterAnimationTypeEnum.Adapter.class)
  public enum AfterAnimationTypeEnum {
    DONOTDIM("DoNotDim"),
    
    COLOR("Color"),
    
    HIDEAFTERANIMATION("HideAfterAnimation"),
    
    HIDEONNEXTMOUSECLICK("HideOnNextMouseClick");

    private String value;

    AfterAnimationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AfterAnimationTypeEnum fromValue(String text) {
      for (AfterAnimationTypeEnum b : AfterAnimationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AfterAnimationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AfterAnimationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AfterAnimationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AfterAnimationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "afterAnimationType", alternate = { "AfterAnimationType" })
  private AfterAnimationTypeEnum afterAnimationType;

  @SerializedName(value = "afterAnimationColor", alternate = { "AfterAnimationColor" })
  private String afterAnimationColor;


  public Effect() {
    super();
  }

  public Effect type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Effect type.
   * @return type
  **/
  @ApiModelProperty(value = "Effect type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Effect subtype(SubtypeEnum subtype) {
    this.subtype = subtype;
    return this;
  }

   /**
   * Effect subtype.
   * @return subtype
  **/
  @ApiModelProperty(value = "Effect subtype.")
  public SubtypeEnum getSubtype() {
    return subtype;
  }

  public void setSubtype(SubtypeEnum subtype) {
    this.subtype = subtype;
  }

  public Effect presetClassType(PresetClassTypeEnum presetClassType) {
    this.presetClassType = presetClassType;
    return this;
  }

   /**
   * Preset class type.
   * @return presetClassType
  **/
  @ApiModelProperty(value = "Preset class type.")
  public PresetClassTypeEnum getPresetClassType() {
    return presetClassType;
  }

  public void setPresetClassType(PresetClassTypeEnum presetClassType) {
    this.presetClassType = presetClassType;
  }

  public Effect animateTextType(AnimateTextTypeEnum animateTextType) {
    this.animateTextType = animateTextType;
    return this;
  }

   /**
   * Preset class type.
   * @return animateTextType
  **/
  @ApiModelProperty(value = "Preset class type.")
  public AnimateTextTypeEnum getAnimateTextType() {
    return animateTextType;
  }

  public void setAnimateTextType(AnimateTextTypeEnum animateTextType) {
    this.animateTextType = animateTextType;
  }

  public Effect shapeIndex(Integer shapeIndex) {
    this.shapeIndex = shapeIndex;
    return this;
  }

   /**
   * Shape index.
   * @return shapeIndex
  **/
  @ApiModelProperty(required = true, value = "Shape index.")
  public Integer getShapeIndex() {
    return shapeIndex;
  }

  public void setShapeIndex(Integer shapeIndex) {
    this.shapeIndex = shapeIndex;
  }

  public Effect paragraphIndex(Integer paragraphIndex) {
    this.paragraphIndex = paragraphIndex;
    return this;
  }

   /**
   * Paragraph index.
   * @return paragraphIndex
  **/
  @ApiModelProperty(value = "Paragraph index.")
  public Integer getParagraphIndex() {
    return paragraphIndex;
  }

  public void setParagraphIndex(Integer paragraphIndex) {
    this.paragraphIndex = paragraphIndex;
  }

  public Effect triggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
    return this;
  }

   /**
   * Effect trigger type.
   * @return triggerType
  **/
  @ApiModelProperty(value = "Effect trigger type.")
  public TriggerTypeEnum getTriggerType() {
    return triggerType;
  }

  public void setTriggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
  }

  public Effect accelerate(Double accelerate) {
    this.accelerate = accelerate;
    return this;
  }

   /**
   * The percentage of duration accelerate behavior effect.
   * @return accelerate
  **/
  @ApiModelProperty(value = "The percentage of duration accelerate behavior effect.")
  public Double getAccelerate() {
    return accelerate;
  }

  public void setAccelerate(Double accelerate) {
    this.accelerate = accelerate;
  }

  public Effect autoReverse(Boolean autoReverse) {
    this.autoReverse = autoReverse;
    return this;
  }

   /**
   * True to automatically play the animation in reverse after playing it in the forward direction.
   * @return autoReverse
  **/
  @ApiModelProperty(value = "True to automatically play the animation in reverse after playing it in the forward direction.")
  public Boolean isAutoReverse() {
    return autoReverse;
  }

  public void setAutoReverse(Boolean autoReverse) {
    this.autoReverse = autoReverse;
  }

  public Effect decelerate(Double decelerate) {
    this.decelerate = decelerate;
    return this;
  }

   /**
   * The percentage of duration decelerate behavior effect.
   * @return decelerate
  **/
  @ApiModelProperty(value = "The percentage of duration decelerate behavior effect.")
  public Double getDecelerate() {
    return decelerate;
  }

  public void setDecelerate(Double decelerate) {
    this.decelerate = decelerate;
  }

  public Effect duration(Double duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of animation effect.
   * @return duration
  **/
  @ApiModelProperty(value = "The duration of animation effect.")
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public Effect repeatCount(Double repeatCount) {
    this.repeatCount = repeatCount;
    return this;
  }

   /**
   * The number of times the effect should repeat.
   * @return repeatCount
  **/
  @ApiModelProperty(value = "The number of times the effect should repeat.")
  public Double getRepeatCount() {
    return repeatCount;
  }

  public void setRepeatCount(Double repeatCount) {
    this.repeatCount = repeatCount;
  }

  public Effect repeatDuration(Double repeatDuration) {
    this.repeatDuration = repeatDuration;
    return this;
  }

   /**
   * The number of times the effect should repeat.
   * @return repeatDuration
  **/
  @ApiModelProperty(value = "The number of times the effect should repeat.")
  public Double getRepeatDuration() {
    return repeatDuration;
  }

  public void setRepeatDuration(Double repeatDuration) {
    this.repeatDuration = repeatDuration;
  }

  public Effect restart(RestartEnum restart) {
    this.restart = restart;
    return this;
  }

   /**
   * The way for a effect to restart after complete.
   * @return restart
  **/
  @ApiModelProperty(value = "The way for a effect to restart after complete.")
  public RestartEnum getRestart() {
    return restart;
  }

  public void setRestart(RestartEnum restart) {
    this.restart = restart;
  }

  public Effect speed(Double speed) {
    this.speed = speed;
    return this;
  }

   /**
   * The percentage by which to speed up (or slow down) the timing.
   * @return speed
  **/
  @ApiModelProperty(value = "The percentage by which to speed up (or slow down) the timing.")
  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  public Effect triggerDelayTime(Double triggerDelayTime) {
    this.triggerDelayTime = triggerDelayTime;
    return this;
  }

   /**
   * Delay time after trigger.
   * @return triggerDelayTime
  **/
  @ApiModelProperty(value = "Delay time after trigger.")
  public Double getTriggerDelayTime() {
    return triggerDelayTime;
  }

  public void setTriggerDelayTime(Double triggerDelayTime) {
    this.triggerDelayTime = triggerDelayTime;
  }

  public Effect repeatUntilEndSlide(Boolean repeatUntilEndSlide) {
    this.repeatUntilEndSlide = repeatUntilEndSlide;
    return this;
  }

   /**
   * Specifies if the effect will repeat until the end of slide.
   * @return repeatUntilEndSlide
  **/
  @ApiModelProperty(value = "Specifies if the effect will repeat until the end of slide.")
  public Boolean isRepeatUntilEndSlide() {
    return repeatUntilEndSlide;
  }

  public void setRepeatUntilEndSlide(Boolean repeatUntilEndSlide) {
    this.repeatUntilEndSlide = repeatUntilEndSlide;
  }

  public Effect repeatUntilNextClick(Boolean repeatUntilNextClick) {
    this.repeatUntilNextClick = repeatUntilNextClick;
    return this;
  }

   /**
   * Specifies if the effect will repeat until the next click.
   * @return repeatUntilNextClick
  **/
  @ApiModelProperty(value = "Specifies if the effect will repeat until the next click.")
  public Boolean isRepeatUntilNextClick() {
    return repeatUntilNextClick;
  }

  public void setRepeatUntilNextClick(Boolean repeatUntilNextClick) {
    this.repeatUntilNextClick = repeatUntilNextClick;
  }

  public Effect stopPreviousSound(Boolean stopPreviousSound) {
    this.stopPreviousSound = stopPreviousSound;
    return this;
  }

   /**
   * This attribute specifies if the animation effect stops the previous sound.
   * @return stopPreviousSound
  **/
  @ApiModelProperty(value = "This attribute specifies if the animation effect stops the previous sound.")
  public Boolean isStopPreviousSound() {
    return stopPreviousSound;
  }

  public void setStopPreviousSound(Boolean stopPreviousSound) {
    this.stopPreviousSound = stopPreviousSound;
  }

  public Effect rewind(Boolean rewind) {
    this.rewind = rewind;
    return this;
  }

   /**
   * This attribute specifies if the effect will rewind when done playing.
   * @return rewind
  **/
  @ApiModelProperty(value = "This attribute specifies if the effect will rewind when done playing.")
  public Boolean isRewind() {
    return rewind;
  }

  public void setRewind(Boolean rewind) {
    this.rewind = rewind;
  }

  public Effect afterAnimationType(AfterAnimationTypeEnum afterAnimationType) {
    this.afterAnimationType = afterAnimationType;
    return this;
  }

   /**
   * Defined an after animation color for effect.
   * @return afterAnimationType
  **/
  @ApiModelProperty(value = "Defined an after animation color for effect.")
  public AfterAnimationTypeEnum getAfterAnimationType() {
    return afterAnimationType;
  }

  public void setAfterAnimationType(AfterAnimationTypeEnum afterAnimationType) {
    this.afterAnimationType = afterAnimationType;
  }

  public Effect afterAnimationColor(String afterAnimationColor) {
    this.afterAnimationColor = afterAnimationColor;
    return this;
  }

   /**
   * Defined an after animation color for effect. Applied when the AfterAnimationType property is set to Color.
   * @return afterAnimationColor
  **/
  @ApiModelProperty(value = "Defined an after animation color for effect. Applied when the AfterAnimationType property is set to Color.")
  public String getAfterAnimationColor() {
    return afterAnimationColor;
  }

  public void setAfterAnimationColor(String afterAnimationColor) {
    this.afterAnimationColor = afterAnimationColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Effect effect = (Effect) o;
    return true && Objects.equals(this.type, effect.type) && Objects.equals(this.subtype, effect.subtype) && Objects.equals(this.presetClassType, effect.presetClassType) && Objects.equals(this.animateTextType, effect.animateTextType) && Objects.equals(this.shapeIndex, effect.shapeIndex) && Objects.equals(this.paragraphIndex, effect.paragraphIndex) && Objects.equals(this.triggerType, effect.triggerType) && Objects.equals(this.accelerate, effect.accelerate) && Objects.equals(this.autoReverse, effect.autoReverse) && Objects.equals(this.decelerate, effect.decelerate) && Objects.equals(this.duration, effect.duration) && Objects.equals(this.repeatCount, effect.repeatCount) && Objects.equals(this.repeatDuration, effect.repeatDuration) && Objects.equals(this.restart, effect.restart) && Objects.equals(this.speed, effect.speed) && Objects.equals(this.triggerDelayTime, effect.triggerDelayTime) && Objects.equals(this.repeatUntilEndSlide, effect.repeatUntilEndSlide) && Objects.equals(this.repeatUntilNextClick, effect.repeatUntilNextClick) && Objects.equals(this.stopPreviousSound, effect.stopPreviousSound) && Objects.equals(this.rewind, effect.rewind) && Objects.equals(this.afterAnimationType, effect.afterAnimationType) && Objects.equals(this.afterAnimationColor, effect.afterAnimationColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subtype, presetClassType, animateTextType, shapeIndex, paragraphIndex, triggerType, accelerate, autoReverse, decelerate, duration, repeatCount, repeatDuration, restart, speed, triggerDelayTime, repeatUntilEndSlide, repeatUntilNextClick, stopPreviousSound, rewind, afterAnimationType, afterAnimationColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Effect {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    presetClassType: ").append(toIndentedString(presetClassType)).append("\n");
    sb.append("    animateTextType: ").append(toIndentedString(animateTextType)).append("\n");
    sb.append("    shapeIndex: ").append(toIndentedString(shapeIndex)).append("\n");
    sb.append("    paragraphIndex: ").append(toIndentedString(paragraphIndex)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    accelerate: ").append(toIndentedString(accelerate)).append("\n");
    sb.append("    autoReverse: ").append(toIndentedString(autoReverse)).append("\n");
    sb.append("    decelerate: ").append(toIndentedString(decelerate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    repeatCount: ").append(toIndentedString(repeatCount)).append("\n");
    sb.append("    repeatDuration: ").append(toIndentedString(repeatDuration)).append("\n");
    sb.append("    restart: ").append(toIndentedString(restart)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    triggerDelayTime: ").append(toIndentedString(triggerDelayTime)).append("\n");
    sb.append("    repeatUntilEndSlide: ").append(toIndentedString(repeatUntilEndSlide)).append("\n");
    sb.append("    repeatUntilNextClick: ").append(toIndentedString(repeatUntilNextClick)).append("\n");
    sb.append("    stopPreviousSound: ").append(toIndentedString(stopPreviousSound)).append("\n");
    sb.append("    rewind: ").append(toIndentedString(rewind)).append("\n");
    sb.append("    afterAnimationType: ").append(toIndentedString(afterAnimationType)).append("\n");
    sb.append("    afterAnimationColor: ").append(toIndentedString(afterAnimationColor)).append("\n");
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
