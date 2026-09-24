package com.example.maven_github_demo_nandithan;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class File_test {
@Test
	
void testTotal() {
	assertEquals(225,Gradecalulator.calculateTotal(75, 68, 82));
}
@Test
void testAverage() {
	assertEquals(75.0,Gradecalulator.calculateAvg(75, 68, 82));
}
@Test
void testPass() {
	assertTrue(Gradecalulator.isPass(75.0));
}
@Test
void testFail() {
	assertFalse(Gradecalulator.isPass(35.0));
}
}


