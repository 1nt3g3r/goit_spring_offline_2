DEPLOY_PATH="/home/integer/git/goit_spring_offline_2/target/"
WEBAPP_PATH="/opt/tomcat/webapps/"
WAR_NAME="spring2.war"

#Clean Up
rm -r $DEPLOY_PATH
sudo rm $WEBAPP_PATH$WAR_NAME

#Build
mvn clean package

#Copy .war
sudo cp $DEPLOY_PATH$WAR_NAME $WEBAPP_PATH$WAR_NAME

#Restart Tomcat
sudo initctl restart tomcat

#Restart Tomcat
#sudo systemctl restart tomcat
