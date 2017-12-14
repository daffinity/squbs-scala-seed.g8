# Mini Giter8 How-To

To make a basic Giter8 project template:

- Create a project directory.  
- Add to that directory your README.md, License, and create a `src/main/g8/` directory
- Copy the files and directory structure for the template project to that directory (for example a "Hello World" project),
as though that were the template's root directory.
- create a `default.properties` file that lists key-value pairs.  Giter8 will prompt the user for each key, with the value offered as the default
- In your project, where you want to make substitutions from the prompts, put `$key$`, both in the files and in the directory structure.  Note
that the dollar sign '$' is special.  If in any of your files you have a '$' sign that is not part of the find-and-replace, you will want to escape it,
as in `\$`.

For example, if you ask for an `organization` (eg `com.daffinity`), and a `project` (eg `hello`), and you want the template scala file to 
have as its package generate to `com.daffinity.hello`, you will substitute  `$organization$.$package$`, like so:

```scala
package $organization$.$project$

class HelloWorld {
...

```

Likewise, directory paths can be dynamically generated from the prompts.  For example, the HelloWorld.scala file would be, from the template root direcory,
`src/main/g8/src/main/scala/$organization__packaged$/$project__packaged$/HelloWorld.scala`

When you define the replacement, you can mess with the formating.  See [here](http://www.foundweekends.org/giter8/formatting.html).



