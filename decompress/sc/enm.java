import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enm extends env
{
    private List h;
    private final Context i;
    
    public enm(final emk emk, final ahaz ahaz, final int n, final Context i) {
        super(emk, "S/SJ7YtODXxfB+6o9UyIgHiId71g3ksNaRMWqG3MsynbaW5fZJkURKKNBmxPvqKI", "TBTy2z6/sYWhl/djL8GAQh763EadMhWk9n5M3AmRbIg=", ahaz, n, 31);
        this.h = null;
        this.i = i;
    }
    
    protected final void a() {
        final ahaz g = this.g;
        g.copyOnWrite();
        final eht eht = (eht)g.instance;
        final eht a = eht.a;
        eht.b |= 0x2000000;
        eht.u = -1L;
        final ahaz g2 = this.g;
        g2.copyOnWrite();
        final eht eht2 = (eht)g2.instance;
        eht2.b |= 0x4000000;
        eht2.v = -1L;
        Context context;
        if ((context = this.i) == null) {
            context = this.a.a;
        }
        if (this.h == null) {
            this.h = (List)this.d.invoke(null, context);
        }
        final List h = this.h;
        if (h != null && h.size() == 2) {
            synchronized (this.g) {
                final ahaz g3 = this.g;
                final long longValue = this.h.get(0);
                g3.copyOnWrite();
                final eht eht3 = (eht)g3.instance;
                eht3.b |= 0x2000000;
                eht3.u = longValue;
                final ahaz g4 = this.g;
                final long longValue2 = this.h.get(1);
                g4.copyOnWrite();
                final eht eht4 = (eht)g4.instance;
                eht4.b |= 0x4000000;
                eht4.v = longValue2;
            }
        }
    }
}
