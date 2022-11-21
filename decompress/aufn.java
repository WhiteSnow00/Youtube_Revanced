import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aufn extends UploadDataProvider
{
    private volatile FileChannel a;
    private final aufm b;
    private final Object c;
    
    public aufn(final aufm b) {
        this.c = new Object();
        this.b = b;
    }
    
    private final FileChannel a() {
        if (this.a == null) {
            synchronized (this.c) {
                if (this.a == null) {
                    this.a = this.b.a();
                }
            }
        }
        return this.a;
    }
    
    public final void close() {
        final FileChannel a = this.a;
        if (a != null) {
            a.close();
        }
    }
    
    public final long getLength() {
        return this.a().size();
    }
    
    public final void read(final UploadDataSink uploadDataSink, final ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            final FileChannel a = this.a();
            int read;
            do {
                read = a.read(byteBuffer);
                if (read == -1) {
                    break;
                }
            } while (read == 0);
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }
    
    public final void rewind(final UploadDataSink uploadDataSink) {
        this.a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
