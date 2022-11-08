import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enl extends enu
{
    private List h;
    private final Context i;
    
    public enl(final emj emj, final agza agza, final int n, final Context i) {
        super(emj, "S/SJ7YtODXxfB+6o9UyIgHiId71g3ksNaRMWqG3MsynbaW5fZJkURKKNBmxPvqKI", "TBTy2z6/sYWhl/djL8GAQh763EadMhWk9n5M3AmRbIg=", agza, n, 31);
        this.h = null;
        this.i = i;
    }
    
    protected final void a() {
        final agza g = this.g;
        g.copyOnWrite();
        final ehs ehs = (ehs)g.instance;
        final ehs a = ehs.a;
        ehs.b |= 0x2000000;
        ehs.u = -1L;
        final agza g2 = this.g;
        g2.copyOnWrite();
        final ehs ehs2 = (ehs)g2.instance;
        ehs2.b |= 0x4000000;
        ehs2.v = -1L;
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
                final agza g3 = this.g;
                final long longValue = this.h.get(0);
                g3.copyOnWrite();
                final ehs ehs3 = (ehs)g3.instance;
                ehs3.b |= 0x2000000;
                ehs3.u = longValue;
                final agza g4 = this.g;
                final long longValue2 = this.h.get(1);
                g4.copyOnWrite();
                final ehs ehs4 = (ehs)g4.instance;
                ehs4.b |= 0x4000000;
                ehs4.v = longValue2;
            }
        }
    }
}
