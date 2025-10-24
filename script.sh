#!/bin/bash

one=$1

GREEN='\033[0;32m'
RED='\033[0;31m'
ORANGE='\033[0;33m'
BLUE='\033[0;34m'
NC='\033[0m'

BUILD_PATH="bin/"
LIBRARY_PATH="lib/"
TOMCAT_PATH="$HOME/Documents/S2/Programmation/Tahina/Autre/apache-tomcat-10.1.28/"
WEBAPPAS_PATH_LOCAL="src/webapps/"
WEBAPPAS_PATH_SERVER="webapps/"
WAR_NAME="TestFrameWork"

if [ "$one" = -1 ]; then
    echo -e "$RED\t...Fermeture du Tomcat$NC\n"
    "${TOMCAT_PATH}/bin/shutdown.sh" ; echo ""
    exit 1
fi

echo -e "$ORANGE\t...Lancement du Script\n$NC"

echo -e "$BLUE...compilation du code java$NC\n"

rm -rf "$BUILD_PATH"*

find . -name "*.java" > source.txt

if javac -d  "$BUILD_PATH/WEB-INF/classes/" -cp "$LIBRARY_PATH*" @source.txt; then
    echo -e "${GREEN}\tCompilation reussie${NC}\n"
else
    echo -e "${RED}\tCompilation Failed${NC}\n"
    exit 1;
fi

rm source.txt

echo -e "${BLUE}...Copie du contenu du dossier WEB_APPS dans build${NC}\n"

if cp -R "$WEBAPPAS_PATH_LOCAL"* "$BUILD_PATH"; then
    echo -e "${GREEN}\tCopie Reussie${NC}\n"
else
    echo -e "${RED}\tErreur de Copie${NC}\n"
    exit 1;
fi

echo -e "${BLUE}...Creatin du fichier War${NC}\n"

cd "$BUILD_PATH" || exit 1

if jar -cvf "../$WAR_NAME.war" ./*
    echo "" ; then
    echo -e "${GREEN}\tArchivage Reussie${NC}\n"
else
    echo -e "${RED}\tErreur de l'archivage${NC}\n"
    exit 1;
fi

cd ..

echo -e "${BLUE}...Deployement dans le serveur Tomcat${NC}\n"

if mv -f "$WAR_NAME.war" "$TOMCAT_PATH$WEBAPPAS_PATH_SERVER" ; then
    echo -e "${GREEN}\tDeployement Reussie${NC}\n"
else
    echo -e "${RED}Deployement Failed${NC}\n"
    exit 1;
fi


if pgrep -f tomcat > /dev/null; then
    if [ -n "$one" ]; then
        if [ "$one" = 0 ]; then 
            echo -e "$RED\t...Fermeture du Tomcat$NC\n"
            "${TOMCAT_PATH}/bin/shutdown.sh" ; echo ""
        else
            echo -e "${RED}Paramatre introuvable${NC}\n"
        fi 
    fi
else
    echo -e "$RED\t...Lancement du Tomcat\n$NC"
    "${TOMCAT_PATH}/bin/startup.sh" ; echo ""
fi

echo -e "$ORANGE\t...Fin du script$NC"