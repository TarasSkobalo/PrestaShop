del /q "C:\Users\taras.skobalo\IdeaProjects\prestashop\allure-results\*"
FOR /D %%p IN ("C:\Users\taras.skobalo\IdeaProjects\prestashop\allure-results\*.*") DO rmdir "%%p" /s /q
exit
