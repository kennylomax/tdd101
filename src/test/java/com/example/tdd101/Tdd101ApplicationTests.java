package com.example.tdd101;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Tdd101ApplicationTests {

	@Test
	void someBasicTest() {
		assertTrue(Boolean.TRUE);
	}

	@ParameterizedTest
	@CsvSource({
		"exampleInput1, 1",
		"exampleInput2, 2",
	})
	void csvSourceTestsAreUseful(String something, int somethingElse) {
		assertTrue(Boolean.TRUE);
	}

}
