package myApp

class UrlMappings {
    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/indexx")
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
