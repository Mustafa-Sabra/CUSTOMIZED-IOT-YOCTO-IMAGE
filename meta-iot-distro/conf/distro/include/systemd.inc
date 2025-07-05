DISTRO_FEATURES:append=" systemd opengl wayland "

# add systemd as init process
VIRTUAL-RUNTIME_init_manager="systemd"

VIRTUAL-RUNTIME_initscripts="systemd-compat-units"
