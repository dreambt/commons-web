package cn.im47.commons.web.shiro.authc;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * 带验证码的用户名密码令牌
 * <p/>
 * User: baitao.jibt@gmail.com
 * Date: 12-11-2
 * Time: 下午6:50
 */
public class CaptchaUsernamePasswordToken extends UsernamePasswordToken {

	private static final long serialVersionUID = 1L;

	private String captcha;

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public CaptchaUsernamePasswordToken() {
		super();
	}

	public CaptchaUsernamePasswordToken(String username, char[] password, boolean rememberMe, String host, String captcha) {
		super(username, password, rememberMe, host);
		this.captcha = captcha;
	}

}
