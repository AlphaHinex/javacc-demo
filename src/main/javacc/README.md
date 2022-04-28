How to use
==========

Run these commands in project root directory to generate JavaCC parser.

### Example1.jj

```bash
$ java -classpath ./lib/javacc-7.0.11.jar javacc \
-OUTPUT_DIRECTORY=./src/main/java/org/javacc/tutorials/example/ \
./src/main/javacc/Example1.jj
```

### Semantic.jj

```bash
$ java -classpath ./lib/javacc-7.0.11.jar javacc \
-OUTPUT_DIRECTORY=./src/main/java/org/javacc/tutorials/semantic/ \
./src/main/javacc/Semantic.jj
```

### AbccParser.jj

```bash
$ java -classpath ./lib/javacc-7.0.11.jar javacc \
-OUTPUT_DIRECTORY=./src/main/java/org/javacc/tutorials/abcc/ \
./src/main/javacc/AbccParser.jj
```

### SumParser.jj

```bash
$ java -classpath ./lib/javacc-7.0.11.jar javacc \
-OUTPUT_DIRECTORY=./src/main/java/com/github/alphahinex/javacc/demo/sum/ \
./src/main/javacc/SumParser.jj
```