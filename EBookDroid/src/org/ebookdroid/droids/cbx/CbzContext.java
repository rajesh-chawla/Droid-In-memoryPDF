package org.ebookdroid.droids.cbx;

import org.ebookdroid.core.codec.CodecDocument;
import org.ebookdroid.droids.cbx.codec.CbxContext;

import java.io.File;
import java.io.IOException;

import org.emdev.common.archives.ArchiveFile;
import org.emdev.common.archives.zip.ZipArchive;
import org.emdev.common.archives.zip.ZipArchiveEntry;

public class CbzContext extends CbxContext<ZipArchiveEntry> {

    public CbzContext() {
        super();
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.ebookdroid.droids.cbx.codec.CbxArchiveFactory#createArchive(java.io.File, java.lang.String)
     */
    @Override
    public ArchiveFile<ZipArchiveEntry> createArchive(final File file, final String password) throws IOException {
        return new ZipArchive(file);
    }

    /* (non-Javadoc)
     * Stuf to satisfy compiler.
     * @see org.ebookdroid.core.codec.CodecContext#openDocument(byte[], java.lang.String)
     */
    @Override
    public CodecDocument openDocument(byte[] fileData, String password) {
        return null;
    }

}
