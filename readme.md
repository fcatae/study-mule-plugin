Run the command line:

```
mvn archetype:generate -DarchetypeGroupId=org.mule.extensions -DarchetypeArtifactId=mule-extensions-xml-archetype -DarchetypeVersion=1.2.0 -DgroupId=org.mule.extension -DartifactId=hello-mule-extension -DmuleConnectorName=Hello
```

Differences:
- `<packaging>mule-extension</packaging>` instead of `<packaging>mule-application</packaging>`

- Project dependency: (scope provided)

```
<dependency>
    <groupId>org.mule.runtime</groupId>
    <artifactId>mule-module-extensions-xml-support</artifactId>
    <version>${mule.version}</version>
    <scope>provided</scope>
</dependency>
```

- Build plugin:

```
<plugin>
    <groupId>org.mule.runtime.plugins</groupId>
    <artifactId>mule-extensions-maven-plugin</artifactId>
    <version>${mule.extensions.maven.plugin.version}</version>
    <extensions>true</extensions>
</plugin>
```

# XML Module #

File must be named "module-"

Adjust the prefix

```
<module name="Hello World"
        prefix="hello-world"
        doc:description="This module relies in runtime provided components"

        xmlns="http://www.mulesoft.org/schema/mule/module"
        xmlns:mule="http://www.mulesoft.org/schema/mule/core"
        xmlns:doc="http://www.mulesoft.org/schema/mule/documentation"
        xmlns:tns="http://www.mulesoft.org/schema/mule/hello-world"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="
           http://www.mulesoft.org/schema/mule/module http://www.mulesoft.org/schema/mule/module/current/mule-module.xsd
           http://www.mulesoft.org/schema/mule/core http://www.mulesoft.org/schema/mule/core/current/mule.xsd
           http://www.mulesoft.org/schema/mule/hello-world http://www.mulesoft.org/schema/mule/hello-world/current/mule-hello-world.xsd">
```

Create SVG icon at /icon/icon.svg

