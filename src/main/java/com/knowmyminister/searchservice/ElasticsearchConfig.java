package com.knowmyminister.searchservice;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration public class ElasticsearchConfig {

    private TransportClient client;

    @Bean public TransportClient client() throws UnknownHostException
    {

        Settings settings = Settings.builder()
                .put("client.transport.nodes_sampler_interval", "5s")
                .put("client.transport.sniff", false)
                .put("transport.tcp.compress", true)
                .put("cluster.name", "knowmyminister-cluster")
                //.put("xpack.security.transport.ssl.enabled", true)
                .build();

        client = new PreBuiltTransportClient(settings);

        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300));

        return client;
    }
}