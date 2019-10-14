# fitnesse
Repo with simple fitnesse setup, wiki and tests
Used for Experis Ciber test automation workshop 14.10.2019

Fitnesse must be downloaded and fitnesse-standalone copied to fitnesse directory.
Fitnesse help must be downloaded to FitNesse directory.
RestFixture is used as one of the examples.

No additional software needed. 
Everything in here is Open Source.

Powerpoint material (English), installation instructions and workshop exercises are included (Norwegian)

Note:
Minor bugs are detected when using Fitnesse with Norwegian characters æøåÆØÅ
A major bug is detected when using RestFixture with Norwegian characters æøåÆØÅ
(Rest test with search for Norwegian location fails, e.f. with Sløttvegen 17).

Note:
Some problems with logging detected, because fitnesse_standalone requires java.util.logging
The Intellij FitNesse plugin cannot control the logging setup.
It can be quite tricky sometimes to set up Fitnesse with proper logging.
Use the fitnesse maven version e.g. to integrate with Log4j or Logback.

Hans Reier Sigmond, 14042019 Moelv.
