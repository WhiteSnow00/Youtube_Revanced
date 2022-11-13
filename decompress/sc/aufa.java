import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UploadDataProvider;

// 
// Decompiled by Procyon v0.6.0
// 

final class aufa extends UploadDataProvider
{
    final aufb a;
    
    public aufa(final aufb a) {
        this.a = a;
    }
    
    public final long getLength() {
        return this.a.b;
    }
    
    public final void read(final UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.a.c.remaining()) {
            byteBuffer.put(this.a.c);
            byteBuffer = (ByteBuffer)this.a.c.clear();
            uploadDataSink.onReadSucceeded(false);
            this.a.a.c();
            return;
        }
        final int limit = this.a.c.limit();
        final ByteBuffer c = this.a.c;
        final ByteBuffer byteBuffer2 = (ByteBuffer)c.limit(c.position() + byteBuffer.remaining());
        byteBuffer.put(this.a.c);
        byteBuffer = (ByteBuffer)this.a.c.limit(limit);
        uploadDataSink.onReadSucceeded(false);
    }
    
    public final void rewind(final UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError((Exception)new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
