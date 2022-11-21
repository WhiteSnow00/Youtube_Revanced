import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UploadDataProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auhq extends UploadDataProvider
{
    private final UploadDataProvider a;
    
    public auhq(final UploadDataProvider a) {
        this.a = a;
    }
    
    public final void close() {
        this.a.close();
    }
    
    public final long getLength() {
        return this.a.getLength();
    }
    
    public final void read(final UploadDataSink uploadDataSink, final ByteBuffer byteBuffer) {
        this.a.read(uploadDataSink, byteBuffer);
    }
    
    public final void rewind(final UploadDataSink uploadDataSink) {
        this.a.rewind(uploadDataSink);
    }
}
