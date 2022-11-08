import java.io.Closeable;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

final class afnd implements afne
{
    private final Method a;
    
    public afnd(final Method a) {
        this.a = a;
    }
    
    public final void a(final Closeable closeable, final Throwable t, final Throwable t2) {
        if (t == t2) {
            return;
        }
        try {
            this.a.invoke(t, t2);
        }
        finally {
            afnc.a.a(closeable, t, t2);
        }
    }
}
