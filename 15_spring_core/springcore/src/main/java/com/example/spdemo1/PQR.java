package com.example.spdemo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PQR {
	private int data;
	private XYZ xyz;
	
	public PQR(int data) {
		super();
		this.data = data;
	}
}
