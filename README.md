# 100+100 iterations

```
Result "testMethod":
  N = 100
  mean =     52.038 ±(99.9%) 2.636 ms/op

  Histogram, ms/op:
    [40.000, 42.500) = 0 
    [42.500, 45.000) = 2 
    [45.000, 47.500) = 31 
    [47.500, 50.000) = 21 
    [50.000, 52.500) = 16 
    [52.500, 55.000) = 8 
    [55.000, 57.500) = 6 
    [57.500, 60.000) = 3 
    [60.000, 62.500) = 2 
    [62.500, 65.000) = 3 
    [65.000, 67.500) = 1 
    [67.500, 70.000) = 0 
    [70.000, 72.500) = 2 
    [72.500, 75.000) = 3 
    [75.000, 77.500) = 2 

  Percentiles, ms/op:
      p(0.0000) =     44.477 ms/op
     p(50.0000) =     49.062 ms/op
     p(90.0000) =     63.133 ms/op
     p(95.0000) =     73.531 ms/op
     p(99.0000) =     76.420 ms/op
     p(99.9000) =     76.420 ms/op
     p(99.9900) =     76.420 ms/op
     p(99.9990) =     76.420 ms/op
     p(99.9999) =     76.420 ms/op
    p(100.0000) =     76.420 ms/op


# Run complete. Total time: 00:00:10

Benchmark                  (size)  Mode  Cnt   Score   Error  Units
HashBenchmark.testMethod  1000000    ss  100  52.038 ± 2.636  ms/op
```

```
real 11.24
user 12.51
sys 0.21
```

# 1+1 iterations

```
Benchmark                  (size)  Mode  Cnt   Score   Error  Units
HashBenchmark.testMethod  1000000    ss       68.947          ms/op
```

```
real 0.83
user 1.38
sys 0.11
```
