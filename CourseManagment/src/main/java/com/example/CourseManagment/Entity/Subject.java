package com.example.CourseManagment.Entity;

public enum Subject {

	SCIENCE("Science"),
	ART("Art"),
	BUSINESS("Business"),
	Technology("Technology"),
	MATHEMATICS("Mathematics")
	;

private final String displayText;

Subject(String displayText) {

	this.displayText = displayText;
}

public String getDisplayText() {
	return displayText;
}

}
