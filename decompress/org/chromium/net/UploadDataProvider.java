// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

import java.nio.ByteBuffer;
import java.io.Closeable;

public abstract class UploadDataProvider implements Closeable
{
    @Override
    public void close() {
    }
    
    public abstract long getLength();
    
    public abstract void read(final UploadDataSink p0, final ByteBuffer p1);
    
    public abstract void rewind(final UploadDataSink p0);
}
