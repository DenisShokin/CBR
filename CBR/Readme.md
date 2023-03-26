# Тестовое задание

### Баг-репорты доступны по [ссылке](https://docs.google.com/spreadsheets/d/1zq7UkJwgAoyp8M1UnnpYjtMbFgJwACVzDhPGRilJyTk/edit#gid=0).

### Валидация XML файла (автотесты)
Реализована возможность валидации xml по xsd схеме.

XML файл для проверки требуется положить в CBR/src/test/resources/xml, задать наименование Balance.xml. 

Добавлен исправленный XML файл Balance_fix.xml согласно требованиям. 

XSD файл для проверки требуется положить в CBR/src/test/resources/xsd , задать наименование schema.xsd.
В XSD схеме приняты условия (в связи с отсутствием явных требований в ТЗ. см.[баг-репорты](https://docs.google.com/spreadsheets/d/1zq7UkJwgAoyp8M1UnnpYjtMbFgJwACVzDhPGRilJyTk/edit#gid=0)) :
1. Атрибут corAcc должен иметь длину 20 символов и состоять только из цифр (см. schema.xsd). Атрибут corAcc обязательный

Выполнить команду gradle ```gradle test```

