rem -d is location of fitnesse root, set to a git version controlled location
rem -l log location
rem -v verbose logging
rem -e 0, keep 0 days of fitnesse internal version control (no backup).

rem setting FITNESSSE_ROOT_PARENT
rem Note: If set not as parent to existing FitNesseRoot catalog
rem Fitnesse will create a new FitNesseRoot with initial Fitnesse project.
rem If a new fitNesseRoot is created, there will be new unversioned files
rem Make sure that duplicate FitnesseRoot does not exist in project.
rem setting PROJECT_ROOT
rem setting FITNESSE_CLASSES (is the generated .classes catalog that Fitnesse needs).
rem setting FITNESSE_DEPENDENCIES (is the maven dependencies that Fitnesse needs).
set PROJECT_ROOT=%~dp0
set FITNESSE_ROOT_PARENT=%PROJECT_ROOT%src\main\resources
set FITNESSE_CLASSES=%PROJECT_ROOT%target\classes
set FITNESSE_DEPENDENCIES=%PROJECT_ROOT%target\dependencies
setLocal EnableDelayedExpansion
set CLASSPATH="
for /R %FITNESSE_DEPENDENCIES% %%a in (*.jar) do (
   set CLASSPATH=!CLASSPATH!;%%a
)
set CLASSPATH=!CLASSPATH!"
echo !CLASSPATH! 

java -cp !CLASSPATH! fitnesseMain.FitNesseMain -p 8081 -d %FITNESSE_ROOT_PARENT% -e 2 -l C:/fitnesseLogs -v

