package com.example.demo.Exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Error {

	public Error(int i, String string) {
		super();
		this.code=i;
		this.message=string;
	}
	private Integer code;
	private String message;
}
