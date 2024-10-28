package com.devdeolho.hexagonal.adapters.out

import com.devdeolho.hexagonal.adapters.out.client.FindAddressByZipCodeClient
import com.devdeolho.hexagonal.application.core.domain.Address
import com.devdeolho.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import org.springframework.stereotype.Component

@Component
class FindAddressByZipCodeAdapter(
    private val findAddressByZipCodeClient: FindAddressByZipCodeClient
): FindAddressByZipCodeOutputPort {

    override fun find(zipCode: String): Address =
        findAddressByZipCodeClient.find(zipCode).toAddress()

}