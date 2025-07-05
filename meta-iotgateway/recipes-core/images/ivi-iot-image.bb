#1. include base image --> poky, BSP

require  recipes-core/images/core-image-minimal.bb

#2. set of local variables
SUMMARY="IVI-IOT Image that include rpi func + Helloworld package recipe."

#3. custemize your image
#inherit audio

# add package recipes that we want to be in the output package recipe.
IMAGE_INSTALL:append=" htop procps sysstat busybox-syslog \ 
    iotop openssl rpiplay nano helloiotapp openssh \ 
    wpa-supplicant iw crda qtbase qtbase-plugins qtquickcontrols2 \
    vsomeip alsa-utils alsa-lib pulseaudio mesa \
    packagegroup-core-x11 \
    packagegroup-core-tools-debug \
    wpa-supplicant \ 
    crda \
    iw  "

# 1. IMAGE_install -->  ssh
# 2. allow root access through ssh
# 3. access root through ssh using empty password

IMAGE_FEATURES:append=" debug-tweaks tools-debug "