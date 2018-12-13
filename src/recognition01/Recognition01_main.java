package recognition01;

import java.io.File;
import java.io.FileNotFoundException;
import com.ibm.watson.developer_cloud.service.security.IamOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectFacesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectedFaces;

public class Recognition01_main 
{

	public static void main(String[] args) 
	{
		Recognition01_lib rlib = new Recognition01_lib();
		rlib.getResult("img/IMG_2799.JPG");
	}
}
