echo "Openning Selenium grid Node "

cd C:\Users\Magali\Desktop\selenium hub


start java  -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.1.25:4444/grid/register -port 5555 -browser browserName=chrome,maxInstances=2  -browser browserName=firefox,maxInstances=2
