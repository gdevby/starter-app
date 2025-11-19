sudo apt update
sudo apt install -y openjdk-21-jre
sudo apt --fix-broken install
wget https://raw.githubusercontent.com/gdevby/starter-app/java_21/example-compiled-app/os_installer/starter.deb
sudo chmod +x starter.deb
sudo dpkg -i starter.deb
sudo rm starter.deb
