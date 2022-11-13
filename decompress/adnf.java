import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.InputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public class adnf extends FilterInputStream implements InputStreamRetargetInterface
{
    private final boolean a;
    private final long b;
    
    public adnf(final InputStream inputStream) {
        super(inputStream);
        this.a = false;
        this.b = -1L;
    }
    
    public adnf(final InputStream inputStream, final long b) {
        super(inputStream);
        adkp.H(b >= 0L);
        this.a = true;
        this.b = b;
    }
    
    public long a() {
        return this.b;
    }
    
    public boolean b() {
        return this.a;
    }
    
    public final long transferTo(final OutputStream outputStream) {
        return DesugarInputStream.transferTo((InputStream)this, outputStream);
    }
}
