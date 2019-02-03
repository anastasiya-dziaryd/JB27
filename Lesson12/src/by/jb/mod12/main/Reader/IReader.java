package by.jb.mod12.main.Reader;

import java.io.File;

public interface IReader<T> {
    Object Read(String path, String fileName);
    File CheckAndGetFileIfExists(String path, String fileName);
}
