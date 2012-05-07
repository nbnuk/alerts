class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

        "/ws/$action"(controller:'webservice')
        "/ws/noauth/$action"(controller:'webservice')
		"/"(controller:'notification', action:'index')
		"500"(view:'/error')
	}
}
