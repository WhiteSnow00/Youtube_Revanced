import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UploadDataProvider;

// 
// Decompiled by Procyon v0.6.0
// 

final class aueh extends UploadDataProvider
{
    final /* synthetic */ auei a;
    
    public aueh(final auei a) {
        this.a = a;
    }
    
    @Override
    public final long getLength() {
        return -1L;
    }
    
    @Override
    public final void read(final UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.a.b.remaining()) {
            byteBuffer.put(this.a.b);
            byteBuffer = (ByteBuffer)this.a.b.clear();
            uploadDataSink.onReadSucceeded(this.a.c);
            final auei a = this.a;
            if (!a.c) {
                a.a.c();
            }
            return;
        }
        final int limit = this.a.b.limit();
        final ByteBuffer b = this.a.b;
        final ByteBuffer byteBuffer2 = (ByteBuffer)b.limit(b.position() + byteBuffer.remaining());
        byteBuffer.put(this.a.b);
        byteBuffer = (ByteBuffer)this.a.b.limit(limit);
        uploadDataSink.onReadSucceeded(false);
    }
    
    @Override
    public final void rewind(final UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
