package com.enghack.aRIve.service;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.URI;

/**
 * Created by 37264 on 6/25/16.
 */
@Service
public class TtcService extends AbstractService{

//    public String executeGet(String url) throws Exception {
//
//        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
//
//        try {
//            URIBuilder builder = new URIBuilder(url);
//            URI uri = builder.build();
//            HttpGet method = new HttpGet(uri);
//            HttpPost postMethod = new HttpPost(uri);
//            HttpDelete deleteMethod = new HttpDelete(uri);
//
//
//            // Parse and check response
//            HttpResponse response = httpClient.execute(method);
//            ResponseHandler<String> handler = new BasicResponseHandler();
//            String body = handler.handleResponse(response);
//
//
//
//            return body;
//        } catch (Exception ex) {
//            throw new Exception(ex.getMessage());
//        } finally {
//            // Close the connection
//            try {
//                httpClient.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
}
