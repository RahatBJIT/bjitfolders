package org.example.bridgedesignpattern.example;

interface BaseRepository{
    public void save(BaseEntiy entiy);
    public StorageRepository getRepository();
}
