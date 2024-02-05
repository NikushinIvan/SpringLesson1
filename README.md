Запуск приложений через классы Item1Java и Item1Xml. Метод инициализации и BeanPostProcessor реализованы в каждой конфигурации контекста.

При изменении оценки Jil BeanPostProcessor выведет:

"Jil " + subjectGradeEntry.getKey() + " grade changed"


При зачислении ученика метод init выведет:

"Student" + name + "enrolled"