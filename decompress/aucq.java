import org.chromium.net.UploadDataSink;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucq extends UploadDataProvider
{
    private final ByteBuffer a;
    
    public aucq(final ByteBuffer a) {
        this.a = a;
    }
    
    public final long getLength() {
        return this.a.limit();
    }
    
    public final void read(final UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            if (byteBuffer.remaining() >= this.a.remaining()) {
                byteBuffer.put(this.a);
            }
            else {
                final int limit = this.a.limit();
                final ByteBuffer a = this.a;
                final ByteBuffer byteBuffer2 = (ByteBuffer)a.limit(a.position() + byteBuffer.remaining());
                byteBuffer.put(this.a);
                byteBuffer = (ByteBuffer)this.a.limit(limit);
            }
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }
    
    public final void rewind(final UploadDataSink uploadDataSink) {
        final ByteBuffer byteBuffer = (ByteBuffer)this.a.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
