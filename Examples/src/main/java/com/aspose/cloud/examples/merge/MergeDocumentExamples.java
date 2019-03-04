package com.aspose.cloud.examples.merge;

import com.aspose.slides.ApiException;
import com.aspose.slides.api.MergeDocumentApi;
import com.aspose.slides.model.DocumentResponse;
import com.aspose.slides.model.request.PostPresentationMergeRequest;
import com.aspose.slides.model.request.PutPresentationMergeRequest;

public class MergeDocumentExamples {
	
	MergeDocumentApi  api;

	public MergeDocumentExamples() {
		api = new MergeDocumentApi (AppSID, SecretKey);
	}

	final static String AppSID = "78946fb4-3bd4-4d3e-b309-f9e2ff9ac6f9";
	final static String SecretKey = "b125f13bf6b76ed81ee990142d841195";
	
	
	private PostPresentationMergeRequest createPostPresentationMergeRequest() {
        PostPresentationMergeRequest request = new PostPresentationMergeRequest();
        request.setName("test.pptx");
        return request;
    }
	
	
	 private PutPresentationMergeRequest createPutPresentationMergeRequest() {
	        PutPresentationMergeRequest request = new PutPresentationMergeRequest();
	        request.setName("test.pptx");
	        return request;
	    }
	
	public void postPresentationMergeExample() throws ApiException, Exception {
        DocumentResponse response = null;;
        try {
            PostPresentationMergeRequest request = createPostPresentationMergeRequest();
            response = api.postPresentationMerge(request);
			System.out.println(response.getCode());

        } catch (Exception ex) {
           ex.printStackTrace();
        }
       
    }
	
	public void putPresentationMergeExample() throws ApiException, Exception {
        DocumentResponse response = null;
        try {
            PutPresentationMergeRequest request = createPutPresentationMergeRequest();
            response = api.putPresentationMerge(request);
            System.out.println(response.getCode());
        } catch (Exception ex) {
        	ex.printStackTrace();
        }

    }


	public static void main(String[] args) throws ApiException, Exception {		
	}

}
