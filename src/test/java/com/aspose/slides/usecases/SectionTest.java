// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="SectionTests.cs">
//   Copyright (c) 2018 Aspose.Slides for Cloud
// </copyright>
// <summary>
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
// 
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
// 
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.
// </summary>
// --------------------------------------------------------------------------------------------------------------------

package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * API tests for section methods
 */
public class SectionTest extends ApiTest {
    @Test
    public void getSectionsTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Sections sections = testSlidesApi.getSections(fileName, password, folderName, null);
        assertNotNull(sections);
        assertEquals(c_sectionCount, sections.getSectionList().size());
    }

    @Test
    public void setSectionsTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Sections dto = new Sections();
        List<Section> sectionList = new ArrayList<Section>();
        Section section1 = new Section();
        section1.setName("Section1");
        section1.setFirstSlideIndex(1);
        Section section2 = new Section();
        section2.setName("Section2");
        section2.setFirstSlideIndex(3);
        sectionList.add(section1);
        sectionList.add(section2);
        dto.setSectionList(sectionList);
        Sections sections = testSlidesApi.setSections(fileName, dto, password, folderName, null);
        assertNotNull(sections);
        assertEquals(dto.getSectionList().size(), sections.getSectionList().size());
        assertEquals(
                dto.getSectionList().get(1).getFirstSlideIndex() - dto.getSectionList().get(0).getFirstSlideIndex(),
                sections.getSectionList().get(0).getSlideList().size());
    }

    @Test
    public void createSectionTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Sections sections = testSlidesApi.createSection(fileName, "NewSection", 5, password, folderName, null);
        assertNotNull(sections);
        assertEquals(c_sectionCount + 1, sections.getSectionList().size());
    }

    @Test
    public void updateSectionTest() throws ApiException, IOException {
        final String sectionName = "NewSection";
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Sections sections = testSlidesApi.updateSection(fileName, 2, sectionName, password, folderName, null);
        assertNotNull(sections);
        assertEquals(c_sectionCount, sections.getSectionList().size());
        assertEquals(sectionName, sections.getSectionList().get(1).getName());
    }

    @Test
    public void moveSectionTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Sections sections = testSlidesApi.moveSection(fileName, 1, 2, password, folderName, null);
        assertNotNull(sections);
        assertEquals(c_sectionCount, sections.getSectionList().size());
    }

    @Test
    public void clearSectionsTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Sections sections = testSlidesApi.deleteSections(fileName, null, null, password, folderName, null);
        assertNotNull(sections);
        assertEquals(0, sections.getSectionList().size());
    }

    @Test
    public void deleteSectionsTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        List<Integer> indexes = new ArrayList<Integer>();
        indexes.add(2);
        indexes.add(3);
        Sections sections = testSlidesApi.deleteSections(fileName, indexes, null, password, folderName, null);
        assertNotNull(sections);
        assertEquals(c_sectionCount - 2, sections.getSectionList().size());
    }

    @Test
    public void deleteSectionTest() throws ApiException, IOException {
        testSlidesApi.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Sections sections = testSlidesApi.deleteSection(fileName, 2, null, password, folderName, null);
        assertNotNull(sections);
        assertEquals(c_sectionCount - 1, sections.getSectionList().size());
    }

    private final int c_sectionCount = 3;
}
