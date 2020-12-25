package parallelecution;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({FirstClass.class, SecondClass.class})
@ExtendWith(TestSuiteProfilerExtension.class)
public class ParallelSuite {
}
