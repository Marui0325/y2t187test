package smbms.web;

import javax.servlet.annotation.WebFilter;

import org.springframework.web.filter.HiddenHttpMethodFilter;

@WebFilter("/*")
public class RESTMethodFilter extends HiddenHttpMethodFilter{

	
}
