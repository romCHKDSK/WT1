@echo off
set JAVAC_PATH=C:\Progra~1\Java\jdk-17.0.1\bin\javac.exe
::set JAVAC_PATH=javac.exe
pushd "%~dp0\src"
"%JAVAC_PATH%" "App.java" -d "..\bin"
popd