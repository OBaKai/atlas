import groovy.util.Node

/*
 *
 *
 *
 *                                   Apache License
 *                             Version 2.0, January 2004
 *                          http://www.apache.org/licenses/
 *
 *     TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTION
 *
 *     1. Definitions.
 *
 *        "License" shall mean the terms and conditions for use, reproduction,
 *        and distribution as defined by Sections 1 through 9 of this document.
 *
 *        "Licensor" shall mean the copyright owner or entity authorized by
 *        the copyright owner that is granting the License.
 *
 *        "Legal Entity" shall mean the union of the acting entity and all
 *        other entities that control, are controlled by, or are under common
 *        control with that entity. For the purposes of this definition,
 *        "control" means (i) the power, direct or indirect, to cause the
 *        direction or management of such entity, whether by contract or
 *        otherwise, or (ii) ownership of fifty percent (50%) or more of the
 *        outstanding shares, or (iii) beneficial ownership of such entity.
 *
 *        "You" (or "Your") shall mean an individual or Legal Entity
 *        exercising permissions granted by this License.
 *
 *        "Source" form shall mean the preferred form for making modifications,
 *        including but not limited to software source code, documentation
 *        source, and configuration files.
 *
 *        "Object" form shall mean any form resulting from mechanical
 *        transformation or translation of a Source form, including but
 *        not limited to compiled object code, generated documentation,
 *        and conversions to other media types.
 *
 *        "Work" shall mean the work of authorship, whether in Source or
 *        Object form, made available under the License, as indicated by a
 *        copyright notice that is included in or attached to the work
 *        (an example is provided in the Appendix below).
 *
 *        "Derivative Works" shall mean any work, whether in Source or Object
 *        form, that is based on (or derived from) the Work and for which the
 *        editorial revisions, annotations, elaborations, or other modifications
 *        represent, as a whole, an original work of authorship. For the purposes
 *        of this License, Derivative Works shall not include works that remain
 *        separable from, or merely link (or bind by name) to the interfaces of,
 *        the Work and Derivative Works thereof.
 *
 *        "Contribution" shall mean any work of authorship, including
 *        the original version of the Work and any modifications or additions
 *        to that Work or Derivative Works thereof, that is intentionally
 *        submitted to Licensor for inclusion in the Work by the copyright owner
 *        or by an individual or Legal Entity authorized to submit on behalf of
 *        the copyright owner. For the purposes of this definition, "submitted"
 *        means any form of electronic, verbal, or written communication sent
 *        to the Licensor or its representatives, including but not limited to
 *        communication on electronic mailing lists, source code control systems,
 *        and issue tracking systems that are managed by, or on behalf of, the
 *        Licensor for the purpose of discussing and improving the Work, but
 *        excluding communication that is conspicuously marked or otherwise
 *        designated in writing by the copyright owner as "Not a Contribution."
 *
 *        "Contributor" shall mean Licensor and any individual or Legal Entity
 *        on behalf of whom a Contribution has been received by Licensor and
 *        subsequently incorporated within the Work.
 *
 *     2. Grant of Copyright License. Subject to the terms and conditions of
 *        this License, each Contributor hereby grants to You a perpetual,
 *        worldwide, non-exclusive, no-charge, royalty-free, irrevocable
 *        copyright license to reproduce, prepare Derivative Works of,
 *        publicly display, publicly perform, sublicense, and distribute the
 *        Work and such Derivative Works in Source or Object form.
 *
 *     3. Grant of Patent License. Subject to the terms and conditions of
 *        this License, each Contributor hereby grants to You a perpetual,
 *        worldwide, non-exclusive, no-charge, royalty-free, irrevocable
 *        (except as stated in this section) patent license to make, have made,
 *        use, offer to sell, sell, import, and otherwise transfer the Work,
 *        where such license applies only to those patent claims licensable
 *        by such Contributor that are necessarily infringed by their
 *        Contribution(s) alone or by combination of their Contribution(s)
 *        with the Work to which such Contribution(s) was submitted. If You
 *        institute patent litigation against any entity (including a
 *        cross-claim or counterclaim in a lawsuit) alleging that the Work
 *        or a Contribution incorporated within the Work constitutes direct
 *        or contributory patent infringement, then any patent licenses
 *        granted to You under this License for that Work shall terminate
 *        as of the date such litigation is filed.
 *
 *     4. Redistribution. You may reproduce and distribute copies of the
 *        Work or Derivative Works thereof in any medium, with or without
 *        modifications, and in Source or Object form, provided that You
 *        meet the following conditions:
 *
 *        (a) You must give any other recipients of the Work or
 *            Derivative Works a copy of this License; and
 *
 *        (b) You must cause any modified files to carry prominent notices
 *            stating that You changed the files; and
 *
 *        (c) You must retain, in the Source form of any Derivative Works
 *            that You distribute, all copyright, patent, trademark, and
 *            attribution notices from the Source form of the Work,
 *            excluding those notices that do not pertain to any part of
 *            the Derivative Works; and
 *
 *        (d) If the Work includes a "NOTICE" text file as part of its
 *            distribution, then any Derivative Works that You distribute must
 *            include a readable copy of the attribution notices contained
 *            within such NOTICE file, excluding those notices that do not
 *            pertain to any part of the Derivative Works, in at least one
 *            of the following places: within a NOTICE text file distributed
 *            as part of the Derivative Works; within the Source form or
 *            documentation, if provided along with the Derivative Works; or,
 *            within a display generated by the Derivative Works, if and
 *            wherever such third-party notices normally appear. The contents
 *            of the NOTICE file are for informational purposes only and
 *            do not modify the License. You may add Your own attribution
 *            notices within Derivative Works that You distribute, alongside
 *            or as an addendum to the NOTICE text from the Work, provided
 *            that such additional attribution notices cannot be construed
 *            as modifying the License.
 *
 *        You may add Your own copyright statement to Your modifications and
 *        may provide additional or different license terms and conditions
 *        for use, reproduction, or distribution of Your modifications, or
 *        for any such Derivative Works as a whole, provided Your use,
 *        reproduction, and distribution of the Work otherwise complies with
 *        the conditions stated in this License.
 *
 *     5. Submission of Contributions. Unless You explicitly state otherwise,
 *        any Contribution intentionally submitted for inclusion in the Work
 *        by You to the Licensor shall be under the terms and conditions of
 *        this License, without any additional terms or conditions.
 *        Notwithstanding the above, nothing herein shall supersede or modify
 *        the terms of any separate license agreement you may have executed
 *        with Licensor regarding such Contributions.
 *
 *     6. Trademarks. This License does not grant permission to use the trade
 *        names, trademarks, service marks, or product names of the Licensor,
 *        except as required for reasonable and customary use in describing the
 *        origin of the Work and reproducing the content of the NOTICE file.
 *
 *     7. Disclaimer of Warranty. Unless required by applicable law or
 *        agreed to in writing, Licensor provides the Work (and each
 *        Contributor provides its Contributions) on an "AS IS" BASIS,
 *        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *        implied, including, without limitation, any warranties or conditions
 *        of TITLE, NON-INFRINGEMENT, MERCHANTABILITY, or FITNESS FOR A
 *        PARTICULAR PURPOSE. You are solely responsible for determining the
 *        appropriateness of using or redistributing the Work and assume any
 *        risks associated with Your exercise of permissions under this License.
 *
 *     8. Limitation of Liability. In no event and under no legal theory,
 *        whether in tort (including negligence), contract, or otherwise,
 *        unless required by applicable law (such as deliberate and grossly
 *        negligent acts) or agreed to in writing, shall any Contributor be
 *        liable to You for damages, including any direct, indirect, special,
 *        incidental, or consequential damages of any character arising as a
 *        result of this License or out of the use or inability to use the
 *        Work (including but not limited to damages for loss of goodwill,
 *        work stoppage, computer failure or malfunction, or any and all
 *        other commercial damages or losses), even if such Contributor
 *        has been advised of the possibility of such damages.
 *
 *     9. Accepting Warranty or Additional Liability. While redistributing
 *        the Work or Derivative Works thereof, You may choose to offer,
 *        and charge a fee for, acceptance of support, warranty, indemnity,
 *        or other liability obligations and/or rights consistent with this
 *        License. However, in accepting such obligations, You may act only
 *        on Your own behalf and on Your sole responsibility, not on behalf
 *        of any other Contributor, and only if You agree to indemnify,
 *        defend, and hold each Contributor harmless for any liability
 *        incurred by, or claims asserted against, such Contributor by reason
 *        of your accepting any such warranty or additional liability.
 *
 *     END OF TERMS AND CONDITIONS
 *
 *     APPENDIX: How to apply the Apache License to your work.
 *
 *        To apply the Apache License to your work, attach the following
 *        boilerplate notice, with the fields enclosed by brackets "[]"
 *        replaced with your own identifying information. (Don't include
 *        the brackets!)  The text should be enclosed in the appropriate
 *        comment syntax for the file format. We also recommend that a
 *        file or class name and description of purpose be included on the
 *        same "printed page" as the copyright notice for easier
 *        identification within third-party archives.
 *
 *     Copyright 2016 Alibaba Group
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 *
 */


plugins {
    id("groovy")
    id("java")
    id("kotlin")
    `maven-publish`
    `maven`

}


val deployVersion: String? = System.getProperty("deployVersion")
val mtlVersion: String? = System.getenv("MUPP_VERSION_NAME")

val snapshotsRepoUrl: String by project

val releasesRepoUrl: String by project

val userName: String by project

val passWord: String by project



repositories {

    mavenLocal()
    jcenter()
    google()
}

sourceSets {
    main {
        java.srcDirs("src/main/java")
        resources.srcDir("src/main/resources")
        withConvention(GroovySourceSet::class) {
            groovy.srcDir("src/core/groovy")
        }
    }
}

val sourcesJar by tasks.registering(Jar::class) {
    classifier = "sources"
    from(sourceSets.main.get().allSource)
}

publishing {
    if (null != deployVersion) {
        version = deployVersion
    } else if (null != mtlVersion) {
        version = mtlVersion
    }



    publications {

        register("mavenJava", MavenPublication::class) {
            from(components["java"])
            artifact(sourcesJar.get())

            pom {
                withXml {
                    (asNode().get("dependencies") as groovy.util.NodeList).forEach {
                        if (it is Node) {
                            it.let { depNode ->
                                (depNode.get("dependency") as groovy.util.NodeList).forEach {
                                    if (it is Node) {
                                        it.apply {
                                            (get("scope") as groovy.util.NodeList).forEach {
                                                if (it is Node) it.apply {
                                                    setValue("compile")
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
//                    asElement().setAttribute("scope","compile")
//                    asNode().setValue()
//                    val dependencies = asNode().dependencies.dependency as groovy.util.NodeList
//                    dependencies.forEach {
//                        it as Node
//                        val scope = it.scope.text()
//                        if(scope == "runtime") {
//                            it.scope.setValue("compile")
//                        }
//                            String group = dep.groupId.text()
//                            String name = dep.artifactId.text()
//                            throw new GradleException("Dependency $group:$name has an invalid version: $version. This publication is invalid")
//                        }
//                    val dependenciesNode = asNode().appendNode("dependencies")
//                    fun addDependency(dep: Dependency, scope: String) {
//                        if (dep.group == null || dep.version == null || dep.name == "unspecified") {
//                            return // ignore invalid dependencies
//                        }
//                        //currently we only handle the dependency implements ModuleDependency interface
//                        // for support more feature, such as excludeRules
//                        if (dep is ModuleDependency) {
//                            val dependencyNode = dependenciesNode.appendNode("dependency")
//                            dependencyNode.apply {
//                                appendNode("groupId", dep.group)
//                                appendNode("artifactId", dep.name)
//                                appendNode("version", dep.version)
//                                appendNode("scope", scope)
//                                dep.artifacts.forEach { depArtifact ->
//                                    appendNode("type", depArtifact.type)
//                                }
//                            }
//
//                            val exclusionsNode = dependencyNode.appendNode("exclusions")
//                            when {
//                                !dep.isTransitive -> { // If this dependency is not transitive, we should force exclude all its dependencies them from the POM
//                                    val exclusionNode = exclusionsNode.appendNode("exclusion")
//                                    exclusionNode.apply {
//                                        appendNode("groupId", "*")
//                                        appendNode("artifactId", "*")
//                                    }
//                                }
//                                !dep.excludeRules.isEmpty() -> // Otherwise add specified exclude rules
//                                    dep.excludeRules.forEach { rule ->
//                                        val exclusionNode = exclusionsNode.appendNode("exclusion")
//                                        exclusionNode.apply {
//                                            appendNode("groupId", rule.group ?: "*")
//                                            appendNode("artifactId", rule.module ?: "*")
//                                        }
//                                    }
//                                else -> {
//                                    //do nothing
//                                }
//                            }
//                        }
//                    }
//
//                    // List all "compile" dependencies (for old Gradle)
//                    project.configurations.getByName("compile").dependencies.forEach { dep ->
//                        addDependency(
//                                dep,
//                                "compile"
//                        )
//                    }
//
//                    //support api & implementation configuration until gradle version 3.4
//                    if (project.configurations.findByName("api") != null) {
//                        // List all "api" dependencies (for new Gradle) as "compile" dependencies
//                        project.configurations.getByName("api").dependencies.forEach { dep -> addDependency(dep, "compile") }
//                    }
//
//                    if (project.configurations.findByName("implementation") != null) {
//                        // List all "implementation" dependencies (for new Gradle) as "runtime" dependencies
//                        project.configurations.getByName("implementation").dependencies.forEach { dep -> addDependency(dep, "compile") }
//                    }
                }
            }
//                    pom.withXml {
//                        (asNode().get("dependencies") as groovy.util.NodeList).forEach {
//                           println(it)
//
//                        }
//                    }
////                    writePom(asNode())

//                    asNode().children().filter { it is groovy.util.Node } .forEach{
//                        (it as groovy.util.Node).children().filter { it is groovy.util.Node } .forEach{
//                            (it as Node).children().forEach {
//                                if(it.toString().contains("scope"))
//                                  ((it as Node).children() as groovy.util.NodeList).apply{
//                                      (get(0) as String).replace("runtime","compile")
//                                  }
//                                }
//                            }
//
//                        }


        }



        repositories {
            mavenLocal()
            maven {
                url = if (version.toString().endsWith("SNAPSHOT")) uri(snapshotsRepoUrl) else uri(releasesRepoUrl)
                credentials {
                    username = userName
                    password = passWord
                }
            }

        }

    }
}







tasks.findByName("test")?.enabled = false


dependencies {
    implementation(localGroovy())
    implementation(gradleApi())
    implementation("com.android.tools.build:gradle:3.4.2")
    implementation("org.apache.commons:commons-lang3:3.4")
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")
    implementation("commons-lang:commons-lang:2.6")
    implementation("com.alibaba:fastjson:1.2.6")
    implementation("org.dom4j:dom4j:2.0.0")
    implementation("jaxen:jaxen:1.1.6")
    implementation("commons-beanutils:commons-beanutils:1.9.0")
    implementation("org.javassist:javassist:3.19.0-GA")
    implementation("org.codehaus.plexus:plexus-utils:3.0.24")
    implementation("com.google.inject:guice:4.0")
    implementation("com.google.auto.value:auto-value:1.0")
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    testCompile("junit:junit:4.11")

}


tasks {
    jar {
        from(zipTree("libs/libarsc.jar"))
        from(zipTree("libs/jxl.jar"))
    }
}
version = "6.1.1-SNAPSHOT"

