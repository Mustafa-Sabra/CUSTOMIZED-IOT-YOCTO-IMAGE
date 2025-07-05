# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

# No information for SRC_URI yet (only an external source tree was specified)
SRC_URI = "file://iotgateway-src/"

S = "${WORKDIR}/iotgateway-src"

DEPENDS += " openssl "

inherit pkgconfig

do_compile(){
	$CXX ${S}/main.cpp -o helloiotapp `pkg-config --cflags --libs openssl`
}

do_install(){
	# D = ${WORKDIR}/image
	# 1. create directory ${WORKDIR}/image/usr/bin
	install -d ${D}/${bindir}

	# 2. install hello binary in ${WORKDIR}/image/usr/bin
	install -m 0755 helloiotapp ${D}/${bindir} 
}

do_package_qa[noexec] = "1"
# NOTE: no Makefile found, unable to determine what needs to be done



