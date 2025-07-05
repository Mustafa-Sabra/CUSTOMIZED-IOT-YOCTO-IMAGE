# create file avahi.bbappend
# add this lines into it.

PACKAGECONFIG += " libdns_sd"

do_install:append(){
    install -m 0664 ${WORKDIR}/${PN}-${PV}/avahi-compat-libdns_sd/* ${D}/${includedir}/
}