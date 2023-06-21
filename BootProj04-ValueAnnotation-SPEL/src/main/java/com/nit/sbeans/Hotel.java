package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {
	@Value("12345") // direct value injection
	private Integer hotelId;

	@Value("${hotel.name}")
	private String hotelName;

	@Value("${hotel.addrs}")
	private String hotelAddrs;

	@Value("${hotel.contactno}")
	private String contactNo;

	@Value("${customer.name}")
	private String custName;

	@Value("#{menup.pohaPrice+menup.dosaPrice}") // SPEL for arithmetic operation
	//@Value("1234")
	private float billAmount;

	@Value("${os.name}") // os.name is fixed system property key
	private String osName;

	@Value("${user.name}") // user.name is fixed system property key
	private String windowUser;

	@Value("${Path}") // path is fixed env variable name
	private String pathData;

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddrs=" + hotelAddrs + ", contactNo="
				+ contactNo + ", custName=" + custName + ", billAmount=" + billAmount + ", osName=" + osName
				+ ", windowUser=" + windowUser + ", pathData=" + pathData + "]";
	}

}
