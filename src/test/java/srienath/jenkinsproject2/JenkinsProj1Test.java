package srienath.jenkinsproject2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JenkinsProj1Test {

	@Test
	void testCompareString() {
		assertTrue(JenkinsProj1.CompareString("srienath", "srienath"));
	}
	@Test
	void testCompareString1() {
		assertFalse(JenkinsProj1.CompareString("srienath", "sreenath"));
	}

}
