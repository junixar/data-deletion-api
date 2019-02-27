package dev.fbd.datadeletion;

import java.util.Set;

public class DeletionCollection {

    private final BoRef entryPoint;

    private final Set<BoRef> archive;

    public DeletionCollection(BoRef entryPoint, Set<BoRef> archive) {
        this.entryPoint = entryPoint;
        this.archive = archive;
    }

    public BoRef getEntryPoint() {
        return entryPoint;
    }

    public Set<BoRef> getArchive() {
        return archive;
    }
}
