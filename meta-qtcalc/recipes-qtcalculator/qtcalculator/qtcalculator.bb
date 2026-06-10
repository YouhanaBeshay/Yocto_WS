
# setup

SUMMARY = " A simmple Qt calculator recipe"
MAINTAINER = " Youhana Beshay <youhanabeshay@gmail.com>"

LICENSE = "CLOSED"


# SOURCE

SRC_URI ="git://github.com/YouhanaBeshay/QT_ITI.git;protocol=https;branch=main"

SRCREV = "b8bd39c9e8eec9888be7359e9dd51bc8e98c796c"

# setup vars 

PN = "qtcalculator"
PV = "1.0.0"
PR = "r0"


S = "${WORKDIR}/git/Task2_Calculator"

# dependencies

## NOTE: qtdeclarative-native is needed for the cmake build system to find the qml modules, even if they are not used at runtime. This is a quirk of how qt6-cmake works in Yocto.
DEPENDS += " qtbase qtdeclarative  qtdeclarative-native  "

RDEPENDS:${PN} += " qtbase qtdeclarative   "


# inherit cmake

inherit qt6-cmake

