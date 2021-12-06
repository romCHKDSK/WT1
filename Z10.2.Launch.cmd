@echo off
set JAVA_PATH=C:\Progra~1\Java\jdk-17.0.1\bin\java.exe
::set JAVA_PATH=java.exe
pushd "%~dp0\bin"
"%JAVA_PATH%" "App"
pause
popd