package asboot.oauth2.resource.feishu.ctrl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class IndexController {
	
	@GetMapping({ "/", "/index" })
	public Map<String, String> index(HttpServletRequest request) {
		Map<String, String> map = new HashMap<>();
		map.put("Scheme", request.getScheme());
		map.put("ServerName", request.getServerName());
		map.put("Port", String.valueOf(request.getServerPort()));
		map.put("ServletPath", request.getServletPath());
		map.forEach((key, value) -> {
			log.info("{}:{}", key, value);
		});
		return map;
	}
	
}
