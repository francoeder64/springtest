package sv.edu.udb.mod6.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class HelloWorldService {

	public String getDesc() {

		return "Gradle + Spring MVC Hello World Example";

	}

	public String getTitle(String name) {

		if (StringUtils.isEmpty(name)) {
			return "Hello World";
		} else {
			return "Hello " + name;
		}

	}
}
