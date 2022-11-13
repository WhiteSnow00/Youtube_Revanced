import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class emw extends env
{
    private static final cyb i;
    private final Context h;
    
    static {
        i = new cyb((short[])null);
    }
    
    public emw(final emk emk, final ahaz ahaz, final int n, final Context h) {
        super(emk, "ATj3hbklxV/XiswqkLJ9VlaAJFBsAV/1VJ4eSTnw1AP/96KhgekAXYnIpmljK7wO", "rfBYaobM06JIPnbukgoyOwsb7bCc9rvkUNfR4KOQWHU=", ahaz, n, 29);
        this.h = h;
    }
    
    protected final void a() {
        final ahaz g = this.g;
        g.copyOnWrite();
        final eht eht = (eht)g.instance;
        final eht a = eht.a;
        eht.b |= 0x1000000;
        eht.t = "E";
        final AtomicReference g2 = emw.i.g(this.h.getPackageName());
        if (g2.get() == null) {
            synchronized (g2) {
                if (g2.get() == null) {
                    g2.set(this.d.invoke(null, this.h));
                }
            }
        }
        final String s = g2.get();
        synchronized (this.g) {
            final ahaz g3 = this.g;
            final String j = epf.j(s.getBytes(), true);
            g3.copyOnWrite();
            final eht eht2 = (eht)g3.instance;
            j.getClass();
            eht2.b |= 0x1000000;
            eht2.t = j;
        }
    }
}
