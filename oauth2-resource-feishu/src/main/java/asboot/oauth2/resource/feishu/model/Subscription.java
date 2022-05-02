package asboot.oauth2.resource.feishu.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class Subscription {
	
	private String encrypt;
	
	private String challenge;
	
	private String token;
	
	private String type;

}
