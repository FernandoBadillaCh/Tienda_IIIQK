package com.Tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {


    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

        //El BuketName es el <id_del_proyecto>"//
        final String BucketName = "techshop-ccf9c.appspot.com";

        //Esta es la ruta básica de este proyecto Techshop
        final String rutaSuperiorStorage = "techshop";

        //Ubicación donde se encuentra el archivo de configuración Json
        final String rutaJsonFile = "firebase";

        //El nombre del archivo Json
        final String archivoJsonFile = "techshop-ccf9c-firebase-adminsdk-xi3zp-4f45b39f47.json";
}

