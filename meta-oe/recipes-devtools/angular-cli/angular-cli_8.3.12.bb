SUMMARY = "CLI tool for Angular"
HOMEPAGE = "https://github.com/angular/angular-cli"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dc2a37e472c366af2a7b8bd0f2ba5af4"

SRC_URI = "npm://registry.npmjs.org;name=@angular/cli;version=${PV}"

S = "${WORKDIR}/npm"

inherit npm

NPM_SHRINKWRAP = "${THISDIR}/${BPN}/npm-shrinkwrap.json"

BBCLASSEXTEND = "native"
