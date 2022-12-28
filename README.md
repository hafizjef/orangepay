# Sample Project
[![Java CI with Gradle](https://github.com/hafizjef/orangepay/actions/workflows/gradle.yml/badge.svg)](https://github.com/hafizjef/orangepay/actions/workflows/gradle.yml)

## About
Given a csv file, the program will parse the csv and output a list of duplicate and unique user record.
Record are considered as duplicate if two or more field are equal.

Example input file:

```csv
001,James Bond,IC,007,1920/02/28
002,Ian Flaming,IC,007,1920/02/28
003,James Bond,IC,777,1990/12/30
004,Obi Wan,IC,8000,1971/03/31
005,Darth Vader,PP,12345678,1990/12/30
006,Obi Wan,FT,168,1971/03/31
```

output:
```
Duplicate Person
Person{name='James Bond', IdType='IC', IdNumber='007', dob='1920/02/28'}
Person{name='Ian Flaming', IdType='IC', IdNumber='007', dob='1920/02/28'}
Person{name='Obi Wan', IdType='IC', IdNumber='8000', dob='1971/03/31'}
Person{name='Obi Wan', IdType='FT', IdNumber='168', dob='1971/03/31'}
Unique Person
Person{name='James Bond', IdType='IC', IdNumber='777', dob='1990/12/30'}
Person{name='Darth Vader', IdType='PP', IdNumber='12345678', dob='1990/12/30'}
```
