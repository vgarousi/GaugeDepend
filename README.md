# Introduction 

GaugeDepend is a dependency analysis tool for generating, visualizing and exploring dependency graphs for Gauge test suites. 
Such as visualization will allow quality assessment of test-automation scripts.

## What problem does GaugeDepend address? / Why should one use this tool?

As automated test suites grow, test scripts could start to become unorganized and suffer from various test "smells", e.g., test duplication. While the [Gauge](https://www.gauge.org) testing framework is a powerful BDD testing tool, our experience in developing and maintaining several large-scale Gauge test suites has shown that, especially when multiple test engineers are involved in developing large Gauge test suites, could start to become unorganized and internal quality of test code would start going down. 

Dependency analysis is a proven technique for visualizing, exploring and pinpointing issues in the way methods and classes in regular (production) code call each other. Visualizing of dependencies in regular (production) code-base has been around for many years, e.g., see tools such as [NDepend](https://www.ndepend.com) [pJDepend]( https://github.com/clarkware/jdepend), [SourceTrail](https://www.sourcetrail.com). We have taken the novel step of conducting dependency analysis in the test-code space, and have found that it is a promising technique for visualizing, exploring and pinpointing issues in the way that test scripts call each other.

## Getting Started 
To install this project simply clone the repo and run the following commands to install the dependencies and application modules.
```
pip install -r requirements.txt
```
```
pip install .
```

Then to launch the application execute the file `main.py` e.g. 
```
python application/main.py
```

## Running the tests
We have developed a unit test suite for the GaugeDepend project, using the Python unit testing framework. The unit tests for this project are contained in the `test` directory, they can either be executed individually or all unit test can be executed by running the following command in the root directory of this project. 
```
python -m unittest discover -v
```
A Gitlab CI runner has been set up for this project and the unit tests are run automatically on commit.

## Development team and timeline
* [Connor Boyle](https://www.linkedin.com/in/connor-boyle-7239a0150/), Final Year CS student

* [Dr. Vahid Garousi](https://www.vgarousi.com), Associate Professor of Software Engineering, Queen’s University Belfast, Northern Ireland, UK

The project was completed during Spring 2020, as a student project in [Queen’s University Belfast](https://www.qub.ac.uk).

## Demo videos
A general review of the code-base and tool's feature, narrated by Connor Boyle:

<a href="http://www.youtube.com/watch?feature=player_embedded&v=KTqZ4sITg4Y" target="_blank"><img src="http://img.youtube.com/vi/KTqZ4sITg4Y/0.jpg" 
alt="IMAGE ALT TEXT HERE" width="240" height="180" border="10" /></a>

---
Application of the tool on the Gauge test suites of a large web application, named [Testinium](https://www.testinium.com), narrated by Vahid Garousi:
```
Will be published soon.
```
