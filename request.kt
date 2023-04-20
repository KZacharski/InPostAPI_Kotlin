package xyz.puffercat.mdtrack.inpostapikotlin

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main() {
    val tracking_number = "" /* <- Enter the parcel's tracking number */
    val client = HttpClient.newBuilder().build();
    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://api-shipx-pl.easypack24.net/v1/tracking/$tracking_number"))
        .build();
        
    val response = client.send(request, HttpResponse.BodyHandlers.ofString());
    println(response.body())
}