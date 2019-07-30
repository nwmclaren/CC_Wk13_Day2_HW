package com.codeclan.FilesFolders.projections;

import com.codeclan.FilesFolders.models.File;
import com.codeclan.FilesFolders.models.Folder;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();

}
