REM abeobk, artsiomkorzun, merykitty
"E:\runtime\graal\bin\java.exe" -Xms12G -Xmx12G -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC -XX:+AlwaysPreTouch --enable-preview --add-modules jdk.incubator.vector -jar "E:\data\java-bench.jar" "E:\data\measurements.txt" artsiomkorzun
pause