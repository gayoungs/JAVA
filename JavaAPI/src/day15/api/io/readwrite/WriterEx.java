package day15.api.io.readwrite;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx {

	public static void main(String[] args) {
		
		/*
		 * 문자를 써서 저장할 때는 2바이트 기반 클래스 FileWriter() 를 사용합니다.
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\text.txt";
		
		try(   Writer fw = new FileWriter(path)   ) {
			
			// \n 줄바꿈
			// \r 캐리지리턴(맨앞으로 당기기)
			
			String str = "그만좀 자세요.\n\r그만 일어나.\n\r집에가야지";
			fw.write(str);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
	}
}
