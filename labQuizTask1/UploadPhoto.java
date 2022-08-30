package labQuizTask1;


public class UploadPhoto {
	
	
	public void upload(int height,int width,int length) {
		
		if(length>width && length >height) {
			
			System.out.println("UPLOAD ANOTHER");
			
		}
		
		else if(width>length && height>length && height==width) {
			
			System.out.println("ACCEPTED");
		}
		
		else {
			System.out.println("CROP IT");
	
		}
		}
	
	
}
