package com.demo.demo.service;

import com.demo.demo.model.Client;

import java.util.List;

public interface ClientService<client> {


    void create(Client client);

    List<client> readAll();


    Client read(int id);


    boolean update(Client client, int id);


    boolean delete(int id);
}