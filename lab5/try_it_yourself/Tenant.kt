package com.example.tenantmanagementsystemgroupa

data class Tenant(
    val name: String,
    val phone: String,
    val rent: String,
) {
    // Exercise 2: updated format to show "Rent paid: KSh <rent>"
    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent paid: KSh $rent"
    }
}
