import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UploadDataProvider;

// 
// Decompiled by Procyon v0.6.0
// 

final class bcq extends UploadDataProvider
{
    private final byte[] a;
    private int b;
    
    public bcq(final byte[] a) {
        this.a = a;
    }
    
    @Override
    public final long getLength() {
        return this.a.length;
    }
    
    @Override
    public final void read(final UploadDataSink uploadDataSink, final ByteBuffer byteBuffer) {
        final int min = Math.min(byteBuffer.remaining(), this.a.length - this.b);
        byteBuffer.put(this.a, this.b, min);
        this.b += min;
        uploadDataSink.onReadSucceeded(false);
    }
    
    @Override
    public final void rewind(final UploadDataSink uploadDataSink) {
        this.b = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
