package com.devkduck.mvc.parameter;

import lombok.Data;

@Data
public class BoardParameter {
	private int boardSeq;
	private String title;
	private String contents;
}
