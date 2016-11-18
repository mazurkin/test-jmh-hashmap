package org.sample;

import gnu.trove.map.TIntIntMap;
import gnu.trove.map.hash.TIntIntHashMap;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.SingleShotTime)
@Fork(1)
@Threads(1)
@State(Scope.Thread)
@Warmup(iterations = 100)
@Measurement(iterations = 100)
@Timeout(time = 5, timeUnit = TimeUnit.MINUTES)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class HashBenchmark {

    @Param({"1000000"})
    public int size;

    @Benchmark
    public long testMethod() {
        TIntIntMap map = new TIntIntHashMap(size, 0.75f, -1, -1);

        long c = 0;

        for (int i = 0; i < size; i++) {
            final int index = i * i;

            c += map.adjustOrPutValue(index, i, i);
        }

        return c + map.size() + map.get(1);
    }

}
