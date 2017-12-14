A [Giter8][g8] template for creating squbs scala apps.

[g8]: http://www.foundweekends.org/giter8/

This is a fork of https://github.com/paypal/squbs-scala-seed.g8 with changes to versions and build.sbt settings for working with scala 2.12 and sbt 1.0.  Note that it references squbs version `0.10.0-SNAPSHOT`.

The fork was created by Tom Schweiger; please direct questions, suggestions, and compaints to him.

To use a port other than 8080 (the default port) edit `src/main/resources/application.conf` 

Getting Started
---------------

* Run `sbt new daffinity/squbs-scala-seed.g8` from the directory you want to create the squbs scala app.

* Enter the requested details.

* After that you can delete this README.markdown as well as src/main/g8 to clean up

