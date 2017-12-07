package smbms.web;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import org.springframework.web.filter.CharacterEncodingFilter;

@WebFilter(value="/*",initParams=@WebInitParam(name="encoding",value="utf-8"))
public class EncodingFilter extends CharacterEncodingFilter {

}
