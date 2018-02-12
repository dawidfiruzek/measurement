# Disclaimer
Library is in alpha phase, but is ready to use with it's basic functionality

# Measurement
[![Download](https://api.bintray.com/packages/dawidfiruzek/kotlin/measurement/images/download.svg) ](https://bintray.com/dawidfiruzek/kotlin/measurement/_latestVersion)
[![Build Status](https://travis-ci.org/dawidfiruzek/measurement.svg?branch=master)](https://travis-ci.org/dawidfiruzek/measurement)
[![codecov](https://codecov.io/gh/dawidfiruzek/measurement/branch/master/graph/badge.svg)](https://codecov.io/gh/dawidfiruzek/measurement)

Measurement is a lightweight library based on the Swift's Measurement structure.

It is made to help Java/Kotlin developers converting units to different, corresponding units with ease, e.g. for weight: stones to kilograms.
Measurement also allows arithmetic operation between different, corresponding units. Just like in previous example you can add 2 kilograms to 4 stones and have result in pounds.

Measurement is written in Kotlin, so it can interop with Java. 

## Usage
### 1. Add gradle dependency
```
compile 'pl.dawidfiruzek:measurement:0.4'
```

### 2. Use it in your project
Example usage:
```Kotlin
val baseMeasurement = Measurement(3.45, LengthUnits.METERS)
val arithmeticResult = baseMeasurement + Measurement(0.77, LengthUnits.INCHES)
val result: Double = arithmeticResult.to(LengthUnits.FEET)
```

## Development plans
Note that the library is in development phase, but is ready to use with it's minimal functionality.

For now it supports basic weight and length units with adding and subtraction operation between corresponding types.

Next development steps are:
- [ ] support more <del>weight and</del> length units
- [x] add more arithmetic's operations (multiplication, division)
- [ ] (Later) add area, and volume units with arithmetic's operations


License
-------

    Copyright 2017 Dawid Firuzek

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
