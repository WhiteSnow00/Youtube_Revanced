import java.io.OutputStream;
import java.io.InputStream;
import org.apache.http.entity.AbstractHttpEntity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abnu extends AbstractHttpEntity
{
    private final bbl a;
    private final bbp b;
    private bbn c;
    
    public abnu(final bbl a, final bbp b) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.setContentType("video/mp4");
    }
    
    public final InputStream getContent() {
        synchronized (this) {
            if (this.c == null) {
                this.c = new bbn(this.a, this.b);
            }
            return (InputStream)this.c;
        }
    }
    
    public final long getContentLength() {
        return this.b.h;
    }
    
    public final boolean isRepeatable() {
        return false;
    }
    
    public final boolean isStreaming() {
        return true;
    }
    
    public final void writeTo(final OutputStream outputStream) {
        outputStream.getClass();
        final InputStream content = this.getContent();
        try {
            afpa.a(content, outputStream);
        }
        finally {
            content.close();
        }
    }
}
