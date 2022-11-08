import org.chromium.net.UploadDataSink;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubx extends UploadDataProvider
{
    private final ByteBuffer a;
    
    public aubx(final ByteBuffer a) {
        this.a = a;
    }
    
    @Override
    public final long getLength() {
        return this.a.limit();
    }
    
    @Override
    public final void read(final UploadDataSink uploadDataSink, final ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            if (byteBuffer.remaining() >= this.a.remaining()) {
                byteBuffer.put(this.a);
            }
            else {
                final int limit = this.a.limit();
                final ByteBuffer a = this.a;
                a.limit(a.position() + byteBuffer.remaining());
                byteBuffer.put(this.a);
                this.a.limit(limit);
            }
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }
    
    @Override
    public final void rewind(final UploadDataSink uploadDataSink) {
        this.a.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
