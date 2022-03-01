#!/bin/bash
sudo apt update
sudo apt install -y openjdk-8-jre
sudo apt --fix-broken install
wget https://raw.githubusercontent.com/gdevby/starter-app/master/example-compiled-app/os_installer/starter.deb
sudo chmod +x starter.deb
sudo dpkg -i starter.deb
sudo rm starter.deb
