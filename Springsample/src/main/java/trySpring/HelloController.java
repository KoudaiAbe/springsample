package trySpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*ポイント１
 * Springではコントローラクラスにアノテーションをつける
 * アノテーションをつけることでDIで利用出来る
 */
@Controller

public class HelloController {
	
	/*ポイント２
	 * @GetMappingアノテーションにメソッドをつける
	 * HTTPリクエストのGETメソッドが呼ばれたときにそのメソッドで
	 * 処理をすることが出来る
	 */
	@GetMapping("/hello")
	public String getHello() {
		
		//hello.htmlに画面遷移
		return "hello";
	}
}
