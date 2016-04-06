package test;

import org.junit.Test;

import com.gyq.util.SHAUtil;

public class Junit {
	
	@Test
	public void SHAcode() throws Exception{
		System.out.println(SHAUtil.shaEncode("123456"));
	}
}
