import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UploadDataProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aued extends UploadDataProvider
{
    private final UploadDataProvider a;
    
    public aued(final UploadDataProvider a) {
        this.a = a;
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    @Override
    public final long getLength() {
        return this.a.getLength();
    }
    
    @Override
    public final void read(final UploadDataSink uploadDataSink, final ByteBuffer byteBuffer) {
        this.a.read(uploadDataSink, byteBuffer);
    }
    
    @Override
    public final void rewind(final UploadDataSink uploadDataSink) {
        this.a.rewind(uploadDataSink);
    }
}
