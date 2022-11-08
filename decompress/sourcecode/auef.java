import org.chromium.net.UploadDataSink;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

// 
// Decompiled by Procyon v0.6.0
// 

final class auef extends UploadDataProvider
{
    final /* synthetic */ aueg a;
    
    public auef(final aueg a) {
        this.a = a;
    }
    
    @Override
    public final long getLength() {
        final aueg a = this.a;
        final int a2 = a.a;
        if (a2 == -1) {
            final boolean c = a.c;
            final ByteBuffer b = a.b;
            int n;
            if (c) {
                n = b.limit();
            }
            else {
                n = b.position();
            }
            return n;
        }
        return a2;
    }
    
    @Override
    public final void read(final UploadDataSink uploadDataSink, ByteBuffer b) {
        final int remaining = b.remaining();
        if (remaining < this.a.b.remaining()) {
            b.put(this.a.b.array(), this.a.b.position(), remaining);
            b = this.a.b;
            b = (ByteBuffer)b.position(b.position() + remaining);
        }
        else {
            b.put(this.a.b);
        }
        uploadDataSink.onReadSucceeded(false);
    }
    
    @Override
    public final void rewind(final UploadDataSink uploadDataSink) {
        final ByteBuffer byteBuffer = (ByteBuffer)this.a.b.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
