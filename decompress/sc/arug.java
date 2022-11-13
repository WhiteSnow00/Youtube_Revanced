import java.util.zip.GZIPInputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arug implements aruh
{
    public static final aruh a;
    private final int b;
    
    static {
        a = (aruh)new arug(0);
    }
    
    public arug(final int b) {
        this.b = b;
    }
    
    public final InputStream a(final InputStream inputStream) {
        if (this.b != 0) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }
    
    public final String b() {
        if (this.b != 0) {
            return "gzip";
        }
        return "identity";
    }
}
