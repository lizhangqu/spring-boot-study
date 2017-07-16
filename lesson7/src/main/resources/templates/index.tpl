yieldUnescaped '<!DOCTYPE html>'
html {
    head {
        title('Spring Boot - Groovy templates example')
        link(rel: 'stylesheet', href: '/css/style.css')
    }
    body {
        div(class: 'container') {
            div(class: 'navbar') {
                div(class: 'navbar-inner') {
                    a(class: 'brand', href: 'http://beta.groovy-lang.org/docs/groovy-2.3.2/html/documentation/markup-template-engine.html', 'Groovy - Template Engine docs')
                    a(class: 'brand', href: 'hhttp://projects.spring.io/spring-boot/') {
                        yield 'Spring Boot docs'
                    }
                }
            }
            div("Hello $name")
        }
    }
}