#!/bin/bash
sudo apt update
sudo apt install -y openjdk-8-jre
sudo apt --fix-broken install
wget https://raw.githubusercontent.com/gdevby/starter-app/master/example-compiled-app/os_installer/bootstrapinstaller.deb
sudo chmod +x bootstrapinstaller.deb
sudo dpkg -i bootstrapinstaller.deb
sudo rm bootstrapinstaller.deb
