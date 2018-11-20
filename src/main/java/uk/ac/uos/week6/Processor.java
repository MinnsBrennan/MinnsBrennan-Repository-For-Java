package uk.ac.uos.week6;

import java.io.IOException;
import java.util.Iterator;

public interface Processor {
	void process(Iterator<String> items) throws IOException;
}
