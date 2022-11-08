import java.util.Iterator;
import java.util.Set;
import java.util.Locale;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaju extends wyy
{
    private final abid b;
    private final aajp c;
    private final Map d;
    
    public aaju(final abid b, final aajp c, final Map d, final wzd wzd) {
        super("watch", wzd);
        b.getClass();
        this.b = b;
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    protected final boolean a(final tdc tdc) {
        final boolean a = super.a(tdc);
        if (a && tdc.getClass() != aakw.class && tdc.getClass() != aakx.class && tdc.getClass() != aakt.class) {
            this.f("abandoned_watch");
            return true;
        }
        return a;
    }
    
    public final eol b() {
        this.g("vis", this.b.a());
        this.g("bwm", String.format(Locale.US, "%d:%.3f", this.c.a.get(), this.c.b.get() / 1000.0f));
        if (this.c.f() > 0L) {
            this.g("cache_bytes", String.valueOf(this.c.f()));
        }
        return super.b();
    }
    
    protected final void c(final tdc tdc, final Set set, final Set set2) {
        super.c(tdc, set, set2);
        for (final Map.Entry<String, V> entry : this.d.entrySet()) {
            this.g((String)entry.getKey(), (String)entry.getValue());
        }
    }
}
