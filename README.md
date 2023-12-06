![](https://img.shields.io/badge/api-v3.0-lightgrey) [![GitHub license](https://img.shields.io/github/license/aspose-slides-cloud/aspose-slides-cloud-java)](https://github.com/aspose-slides-cloud/aspose-slides-cloud-java/blob/master/LICENSE)

# Java REST API to Process Presentation in Cloud
This repository contains Aspose.Slides Cloud SDK for Java source code. This SDK allows you to [process & manipulate PPT, PPTX, ODP, OTP](https://products.aspose.cloud/slides/java) using Aspose.slides Cloud REST APIs in your java applications.

You may want to check out Aspose free [Powerpoint to PDF](https://products.aspose.app/slides/conversion), [Powerpoint to Word](https://products.aspose.app/slides/conversion/ppt-to-word), [Powerpoint to JPG](https://products.aspose.app/slides/conversion/ppt-to-jpg), [Powerpoint to PNG](https://products.aspose.app/slides/conversion/ppt-to-png), [PDF to Powerpoint](https://products.aspose.app/slides/import/pdf-to-powerpoint), [JPG to Powerpoint](https://products.aspose.app/slides/import/jpg-to-ppt), and [PNG to Powerpoint](https://products.aspose.app/slides/import/png-to-ppt) converters because they are live implementations of popular conversion processes.

## Presentation Processing Features

- Fetch presentation images in any of the supported file formats.
- Copy the layout side or clone the master slide from the source presentation.
- Process slides shapes, slides notes, placeholders, colors & font theme info.
- Programmatically create a presentation from HTML & export it to various formats.
- Merge multiple presentations or split the single presentation into multiple ones.
- Extract and replace text from a specific slide or an entire presentation.

## Read & Write Presentation Formats

**Microsoft PowerPoint:** PPT, PPTX, PPS, PPSX, PPTM, PPSM, POTX, POTM
**OpenOffice:** ODP, OTP, FODP
**Other**: PDF, PDF/A

## Save Presentation As

**Fixed Layout:** XPS
**Images:** JPEG, PNG, BMP, TIFF, GIF, SVG
**Web:** HTML/HTML5
**Other:** MPEG4, SWF (export whole presentations)

## Enhancements in Version 23.11

* Added **StartSavePresentation** and **StartConvertAndSave** methods to **SlidesAsyncApi**.
* Added **StartMerge** and **StartMergeAndSave** methods to **SlidesAsyncApi**.
* Added **Progress** property to **Operation** class to enable async operation progress tracking.

## Enhancements in Version 23.10

* Added asynchronous API - **SlidesAsyncApi** class with **StartConvert**, **StartDownloadPresentation**, **GetOperationStatus**, **GetOperationResult** methods that allow tracking progress of conversion operations.

## Enhancements in Version 23.9

* Added **ReplaceImage** and **ReplaceImageOnline** methods that enable replacing images in a presentation.

## Enhancements in Version 23.7

* New methods **ReplaceTextFormatting** and **ReplaceTextFormatting** allow to replace text with formatting.
* Added **AfterAnimationType**, **Rewind** and **AfterAnimationColor** methods to **Effect** class.
* Added **TrimFromStart** and **TrimFromEnd** methods to **VideoFrame** class.

## Enhancements in Version 23.6

* Added methods ho handle VBA methods: **GetVbaProject**, **GetVbaModule**, **CreateVbaModule**, **UpdateVbaModule** and **DeleteVbaModule**. Added model classes related to VBA: **VbaProject**,  **VbaModule** and  **VbaReference**.

## Enhancements in Version 23.4

* Added **CreateTableRow**, **UpdateTableRow** and **DeleteTableRow** methods to add, update and delete table rows.
* Added **UpdateTableCell** method to update table cells.
* Added  **MergeTableCells** and **SplitTableCell** methods to merge &amp; split table cells.
* Added methods to get, add, modify and delete paragraphs & portions within table cells: **GetTableCellParagraph**, **GetTableCellParagraphs**, **GetTableCellPortion**, **GetTableCellPortions**, **CreateTableCellParagraph**, **CreateTableCellPortion**, **UpdateTableCellPortion**, **UpdateTableCellParagraph**, **DeleteTableCellParagraph**,  **DeleteTableCellPortion**.
* New **TextFrameFormat** property in **TableCell** class allows to specify text format for table cells.

## Enhancements in Version 23.3

* Added **options** parameter to **SplitOnline** and **SplitAndSaveOnline** methods. Those options are the same as for other split & convert methods.
* Added **ShowHiddenSlides** boolean property to **ImageExportOptions** class.

## Enhancements in Version 23.2

* New **DownloadShapeFromDto** method allows to convert charts and other shapes from DTO to SVG and other formats without creating and storing presentation files.
* Added **SoundBase64** property to **Hyperlink** class to support getting and setting hyperlink sounds.
* Added **BulletFillFormat** property to **Paragraph** class.
* Added **StopPreviousSound** property to animation **Effect** class.
* Added a number of properties to **TextFrameFormat** that enable formatting shape text: **MarginLeft**, **MarginRight**, **MarginTop**, **MarginBottom**, **WrapText**, **AnchoringType**, **CenterText**, **TextVerticalType**, **AutofitType**, **ColumnCount**, **ColumnSpacing**, **KeepTextFlat**, **RotationAngle**, **DefaultParagraphFormat**.
* Added **Pdf16**, **Pdf17**, **PdfA2b**, **PdfA2a**, **PdfA2u**, **PdfA3a**, **PdfA3b** to the list of allowed values for **PdfExportOptions.Compliance** property.

## Enhancements in Version 23.1

* New **CompressEmbeddedFonts** and **CompressEmbeddedFontsOnline** methods allow to reduce the size taken by embedded fonts by excluding unused characters.

## Licensing
