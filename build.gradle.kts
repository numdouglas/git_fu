plugins{
    id("java")
}

tasks{
    jar{
        manifest{
            attributes["Main-Class"]="classy"
        }
    }
}