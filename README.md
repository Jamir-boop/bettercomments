this SDK seems to be broken so the build needs a specific fix
expand jar and look for `package.json`
inside remove funky stuff from "commands"
then repackage with
`jar --create --file BetterComments-PATCHED.jar -C BetterComments-2.11.0 .`


