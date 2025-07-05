# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

SRC_URI = "git://github.com/COVESA/vsomeip.git;branch=master;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "74d1882f619ce2610a85fc3d14786080fd7187a4"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: benchmark Doxygen
DEPENDS = "systemd boost"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

FILES:${PN} += "/usr/bin \
                /usr/etc/vsomeip/*.json"