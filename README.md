Для запуска на шинде:
В рабочей директории (желательно на RAM-диске размером 15 гб) создать папку runtime и data;
Склонировать этот репозиторий в ту же рабочую директорию;
runners из репозитория скопировать в data и подредактировать пути;
В runtime установить нужные рантаймы под именами dotnet и graal;
Создать measurements.txt с помощью measurement-preparator и положить его в data (mvn clean install; java -jar measurement-preparator.jar);
Создать java-bench.jar с помощью 1brc-java-bench и положить его в data (mvn clean install);
Создать папку с бенчмарками с помощью 1brc-petusharp-bench/1brc и положить папку вместе со всеми зависимостями в data, назвав её petusharp-bench (dotnet build -c release);
Запускать раннеры.