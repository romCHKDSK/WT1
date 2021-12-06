@echo off
set JAR_PATH=C:\Progra~1\Java\jdk-17.0.1\bin\jar.exe
::set JAR_PATH=jar.exe
pushd "%~dp0\bin"
"%JAR_PATH%" -c -f "..\App.jar" -e "App" "App.class" "assignment"
popd