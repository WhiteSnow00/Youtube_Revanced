import java.io.InputStream;
import java.security.PrivilegedAction;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aumx implements PrivilegedAction
{
    final Object a;
    final Object b;
    private final int c;
    
    public aumx(final aumy b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aumx(final Class a, final int c) {
        this.c = c;
        this.a = a;
        this.b = "/android/icumessageformat/ICUConfig.properties";
    }
    
    @Override
    public final Object run() {
        if (this.c != 0) {
            return ((Class)this.a).getResourceAsStream((String)this.b);
        }
        final ClassLoader a = ((aumy)this.b).a;
        InputStream inputStream;
        if (a != null) {
            inputStream = a.getResourceAsStream((String)this.a);
        }
        else {
            inputStream = ClassLoader.getSystemResourceAsStream((String)this.a);
        }
        return inputStream;
    }
}
