import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("Shouldnt be able to find a visit")
    request {
        method GET()
        url("/visits") {
            queryParameters {
                parameter("code", 1)
            }
        }
    }
    response {
        status(404)
        body("No hay cita con ese codigo")
    }
}
