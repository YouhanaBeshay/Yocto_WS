SUMMARY = "A Simple Qt6 Wayland image"
MAINTAINER = " Youhana Beshay <youhanabeshay@gmail.com>"

LICENSE = "CLOSED"

inherit core-image

# image features (mostly copying poky's core-image-weston)
IMAGE_FEATURES += " debug-tweaks splash ssh-server-dropbear hwcodecs weston "




# maybe useful installs
IMAGE_INSTALL:append = " \
                    nano  \
                    curl \
"

# qt6 packages (NOT in RDEPENDS of the qt-app)

IMAGE_INSTALL:append = " \
                    qtwayland \
"

# My Apps
IMAGE_INSTALL:append = " \
                    qtcalculator \
"