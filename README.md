A simple and self explain example that show you how to use **sonarqube** and **jacoco** to generate:

* Unit tests coverage
* Line coverage
* Unit tests success report

# Used framworks
* [Jacoco coverage gradle plugin](https://docs.gradle.org/current/userguide/jacoco_plugin.html)
* [Sonar gradle plugin ](https://docs.gradle.org/current/userguide/sonar_plugin.html)

# Running it

    $ sonar.sh start
    $ gradle sonarqube
    # open browser on http://localhost:9000


# Print
![](http://i.imgur.com/xg80Jbd.png)