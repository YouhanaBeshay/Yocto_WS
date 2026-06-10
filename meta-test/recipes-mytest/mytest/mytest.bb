# setup

SUMMARY = "My Test Recipe"
MAINTAINER = " Youhana Beshay <youhanabeshay@gmail.com>"

LICENSE = "CLOSED"

# determine dir for source code

# "file://"  (by default looks for dir named "files" in same dir)
# default local dir for "file://" can be changed 
# look up "FILESEXTRAPATHS" variable for more details

SRC_URI = " \
       file://main.c \
       file://CMakeLists.txt \
"

# setup vars 

# "PN" by default is the recipe name "mytest"
PN = "mytest" 
PV = "1.0.0"
PR = "r0"

# VERY IMPORTANT: {S} var must be set for cmake class to work
#                 {B} || {D} are optional (default to {S} if not set)

S = "${WORKDIR}"
B = "${WORKDIR}/build"

# D = "${D}/${bindir}"

# OPTOIONAL: set DPENDENCIES (if any) [DEPENDS && RDEPENDS:mytest]


# use cmake Class

inherit cmake

# implement custom logic for required tasks (if needed) (ALL ARE OPTIONAL HERE)

do_configure(){
    cmake -S ${S} -B ${B}
}

do_compile(){
    cmake --build ${B}
}

## can be important
### install -d : create dir if not exists (mkdir -p)
### install -m : (cp) bin to dest dir with permissions (chmod)

do_install(){
    install -d ${D}/${bindir}
    install -m 0777 ${B}/${PN} ${D}/${bindir}/
}
