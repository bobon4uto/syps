#!/bin/bash
sbt --client nativeLink && cat typycalcompiler_output.txt |./target/scala-3.3.6/native/Main  

