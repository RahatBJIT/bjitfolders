package org.example.bridgedesignpattern.example;

class StudentRepository implements BaseRepository {

    private StorageRepository repository;

    public StudentRepository(StorageRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(BaseEntiy entiy) {

    }

    public StorageRepository getRepository() {
        return repository;
    }

    public Student save(Student student) {

        if (student == null || student.getName() == null) {
            return null;
        }
        student.setId(getNextId());
        repository.store(student);
        return student;
    }

    private String getNextId() {
        //fd
        return null;
    }

}
