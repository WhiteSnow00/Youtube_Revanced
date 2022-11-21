import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UploadDataProvider;

// 
// Decompiled by Procyon v0.6.0
// 

final class bct extends UploadDataProvider
{
    private final byte[] a;
    private int b;
    
    public bct(final byte[] a) {
        this.a = a;
    }
    
    public final long getLength() {
        return this.a.length;
    }
    
    public final void read(final UploadDataSink uploadDataSink, final ByteBuffer byteBuffer) {
        final int min = Math.min(byteBuffer.remaining(), this.a.length - this.b);
        byteBuffer.put(this.a, this.b, min);
        this.b += min;
        uploadDataSink.onReadSucceeded(false);
    }
    
    public final void rewind(final UploadDataSink uploadDataSink) {
        this.b = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
