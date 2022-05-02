package asboot.oauth2.resource.feishu.ctrl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import asboot.oauth2.resource.feishu.model.Subscription;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EventController {
	
	@PostMapping("/event")
	public Subscription event(@RequestBody Subscription subs) {
		log.info("Encrypt:{}", subs.getEncrypt());
		log.info("Challenge:{}", subs.getChallenge());
		log.info("Token:{}", subs.getToken());
		log.info("Type:{}", subs.getType());
		
		Subscription result = new Subscription();
		result.setChallenge(subs.getChallenge());
		return result;
	}

}
