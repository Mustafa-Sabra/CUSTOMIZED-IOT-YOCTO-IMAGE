

SUMMARY = "A small and friendly text editor"
DESCRIPTION = "GNU nano is a small, free, and friendly text editor for Unix-like computing systems or environments using a command line interface."
HOMEPAGE = "https://www.nano-editor.org/"


PN = "nano"
PV = "6.2" 


LICENSE = "GPLv3"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0-only;md5=c79ff39f19dfec6d293b95dea7b07891"

SRC_URI = "https://nano-editor.org/dist/v6/nano-6.2.tar.xz;name=nano"

SRC_URI[nano.sha256sum] = "2bca1804bead6aaf4ad791f756e4749bb55ed860eec105a97fba864bc6a77cb3"

S = "${WORKDIR}/nano-6.2"


inherit autotools autotools-brokensep gettext pkgconfig

DEPENDS = "ncurses zlib"

RDEPENDS:nano = "ncurses zlib"


FILES:${PN} += "${bindir}/nano ${datadir}/nano ${mandir}/man1/nano.1"