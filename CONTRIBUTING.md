# Contributing to Develocity Conventions Plugin

Develocity Conventions Plugin is released under the Apache 2.0 license.
If you would like to contribute something, or simply want to work with the code, this document should help you to get started.

## Code of conduct

This project adheres to the Contributor Covenant [code of conduct][1].
By participating, you are expected to uphold this code. Please report unacceptable behavior to spring-code-of-conduct@pivotal.io.

## Sign the contributor license agreement

Before we accept a non-trivial patch or pull request we will need you to sign the [contributor's license agreement (CLA)][2].
Signing the contributor's agreement does not grant anyone commit rights to the main repository, but it does mean that we can accept your contributions, and you will get an author credit if we do.


## Code conventions and housekeeping

None of these is essential for a pull request, but they will all help

- Make sure all new `.java` files to have a simple Javadoc class comment with at least an `@author` tag identifying you, and preferably at least a paragraph on what the class is for.
- Add the ASF license header comment to all new `.java` files (copy from existing files in the project)
- Add yourself as an `@author` to the `.java` files that you modify substantially (more than cosmetic changes).
- Add some Javadocs
- Add unit tests that cover any new or modified functionality
- Whenever possible, please rebase your branch against the current main (or other target branch in the main project).
- When writing a commit message please follow [these conventions][3].
  Also, if you are fixing an existing issue please add `Fixes gh-nnn` at the end of the commit message (where nnn is the issue number).

## Working with the code

### Building from source

The code is built with Gradle:

```
$ ./gradlew build
```

[1]: CODE_OF_CONDUCT.md
[2]: https://cla.pivotal.io/sign/spring
[3]: https://tbaggery.com/2008/04/19/a-note-about-git-commit-messages.html