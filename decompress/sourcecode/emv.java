import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class emv extends enu
{
    private static final cya i;
    private final Context h;
    
    static {
        i = new cya((short[])null);
    }
    
    public emv(final emj emj, final agza agza, final int n, final Context h) {
        super(emj, "ATj3hbklxV/XiswqkLJ9VlaAJFBsAV/1VJ4eSTnw1AP/96KhgekAXYnIpmljK7wO", "rfBYaobM06JIPnbukgoyOwsb7bCc9rvkUNfR4KOQWHU=", agza, n, 29);
        this.h = h;
    }
    
    protected final void a() {
        final agza g = this.g;
        g.copyOnWrite();
        final ehs ehs = (ehs)g.instance;
        final ehs a = ehs.a;
        ehs.b |= 0x1000000;
        ehs.t = "E";
        final AtomicReference g2 = emv.i.g(this.h.getPackageName());
        if (g2.get() == null) {
            synchronized (g2) {
                if (g2.get() == null) {
                    g2.set(this.d.invoke(null, this.h));
                }
            }
        }
        final String s = g2.get();
        synchronized (this.g) {
            final agza g3 = this.g;
            final String j = epc.j(s.getBytes(), true);
            g3.copyOnWrite();
            final ehs ehs2 = (ehs)g3.instance;
            j.getClass();
            ehs2.b |= 0x1000000;
            ehs2.t = j;
        }
    }
}
