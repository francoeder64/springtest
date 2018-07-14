package sv.edu.udb.mod6.spring.bean;

import org.springframework.util.StringUtils;

public class HelloWorldService {
	

	public String getDesc() {

		return "Spring MVC Hello World Example!!!!!";

	}

	public String getTitle(String name) {

		if (StringUtils.isEmpty(name)) {
			return "Hello World";
		} else {
			return "Hello " + name;
		}

	}
}
