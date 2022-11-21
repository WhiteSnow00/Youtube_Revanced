import java.util.Iterator;
import java.util.Set;
import java.util.Locale;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aanl extends xcf
{
    private final ablc b;
    private final aanf c;
    private final Map d;
    
    public aanl(final ablc b, final aanf c, final Map d, final xck xck) {
        super("watch", xck);
        b.getClass();
        this.b = b;
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    protected final boolean a(final tgk tgk) {
        final boolean a = super.a(tgk);
        if (a && tgk.getClass() != aaon.class && tgk.getClass() != aaoo.class && tgk.getClass() != aaok.class) {
            this.f("abandoned_watch");
            return true;
        }
        return a;
    }
    
    public final eop b() {
        this.g("vis", this.b.a());
        this.g("bwm", String.format(Locale.US, "%d:%.3f", this.c.a.get(), this.c.b.get() / 1000.0f));
        if (this.c.f() > 0L) {
            this.g("cache_bytes", String.valueOf(this.c.f()));
        }
        return super.b();
    }
    
    protected final void c(final tgk tgk, final Set set, final Set set2) {
        super.c(tgk, set, set2);
        for (final Map.Entry<String, V> entry : this.d.entrySet()) {
            this.g((String)entry.getKey(), (String)entry.getValue());
        }
    }
}
