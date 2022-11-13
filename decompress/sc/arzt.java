import java.text.MessageFormat;
import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

final class arzt extends artz
{
    private final arzu a;
    
    public arzt(final arzu a, final asfw asfw) {
        a.getClass();
        this.a = a;
        asfw.getClass();
    }
    
    public static Level c(int n) {
        if (--n == 1) {
            return Level.FINER;
        }
        if (n != 2 && n != 3) {
            return Level.FINEST;
        }
        return Level.FINE;
    }
    
    private final void d(final int n) {
        if (n != 1) {
            synchronized (this.a.b) {
                monitorexit(this.a.b);
            }
        }
    }
    
    public final void a(final int n, final String s) {
        final arvf c = this.a.c;
        final Level c2 = c(n);
        if (arzu.a.isLoggable(c2)) {
            arzu.a(c, c2, s);
        }
        this.d(n);
    }
    
    public final void b(final int n, String format, final Object... array) {
        final Level c = c(n);
        this.d(n);
        if (arzu.a.isLoggable(c)) {
            format = MessageFormat.format(format, array);
        }
        else {
            format = null;
        }
        this.a(n, format);
    }
}
