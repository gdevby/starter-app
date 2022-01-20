#!/bin/bash
sudo apt install openjdk-8-jre
wget https://raw.githubusercontent.com/gdevby/starter-app/master/example-compiled-app/bootstrapinstaller.deb
chmod +x bootstrapinstaller.deb
sudo dpkg -i bootstrapinstaller.deb
sudo rm bootstrapinstaller.deb
sudo rm installDebPackage.sh
