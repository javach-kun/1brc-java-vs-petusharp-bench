import org.apache.commons.lang3.time.StopWatch;
import ru.ancap._1brc.abeobk.CalculateAverage;

import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;

void main(String[] args) throws Throwable {
    Class<?> class_ = Class.forName(STR."ru.ancap._1brc.\{args[1]}.CalculateAverage");
    Method method = class_.getMethod("main", String[].class);
    method.setAccessible(true);
    for (int i = 0; i < 10; i++) {
        var stopwatch = new StopWatch();
        stopwatch.start();
        method.invoke(null, (Object) args);
        stopwatch.stop();
        System.out.println(stopwatch.formatTime());
    }
}