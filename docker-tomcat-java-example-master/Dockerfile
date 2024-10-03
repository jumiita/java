FROM tomcat:9.0-alpine

# Elimina la aplicación ROOT predeterminada
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copia el archivo WAR generado por Gradle en el directorio de aplicaciones de Tomcat
COPY build/libs/app.war /usr/local/tomcat/webapps/ROOT.war
