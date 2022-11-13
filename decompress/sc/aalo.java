import java.util.Iterator;
import java.util.Set;
import java.util.Locale;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aalo extends xay
{
    private final abjv b;
    private final aalj c;
    private final Map d;
    
    public aalo(final abjv b, final aalj c, final Map d, final xbd xbd) {
        super("watch", xbd);
        b.getClass();
        this.b = b;
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    protected final boolean a(final tfh tfh) {
        final boolean a = super.a(tfh);
        if (a && tfh.getClass() != aamq.class && tfh.getClass() != aamr.class && tfh.getClass() != aamn.class) {
            this.f("abandoned_watch");
            return true;
        }
        return a;
    }
    
    public final eom b() {
        this.g("vis", this.b.a());
        this.g("bwm", String.format(Locale.US, "%d:%.3f", this.c.a.get(), this.c.b.get() / 1000.0f));
        if (this.c.f() > 0L) {
            this.g("cache_bytes", String.valueOf(this.c.f()));
        }
        return super.b();
    }
    
    protected final void c(final tfh tfh, final Set set, final Set set2) {
        super.c(tfh, set, set2);
        for (final Map.Entry<String, V> entry : this.d.entrySet()) {
            this.g((String)entry.getKey(), (String)entry.getValue());
        }
    }
}
