import android.content.Context;
import android.view.View;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class end extends enu
{
    private final Map h;
    private final View i;
    private final Context j;
    
    public end(final emj emj, final agza agza, final int n, final Map h, final View i, final Context j) {
        super(emj, "FdWssDbNTznwvaSwEiy9othUceULqhXS0NiSaXeIdQIZaN4heVunXmsWFB1bgBsj", "TzSf4nrBofZD4sG4/0KqSG9VhwNKl95AgxoEIclkVIM=", agza, n, 85);
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    private final long c(final int n) {
        final Map h = this.h;
        final Integer value = n;
        if (h.containsKey(value)) {
            return (long)this.h.get(value);
        }
        return Long.MIN_VALUE;
    }
    
    protected final void a() {
        final long c = this.c(1);
        final long c2 = this.c(2);
        Context context;
        if ((context = this.j) == null) {
            context = this.a.a;
        }
        final long[] array = (long[])this.d.invoke(null, new long[] { c, c2 }, context, this.i);
        final long ad = array[0];
        this.h.put(1, array[1]);
        final long ae = array[2];
        this.h.put(2, array[3]);
        synchronized (this.g) {
            final agza g = this.g;
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a = ehs.a;
            ehs.d |= 0x800;
            ehs.ad = ad;
            final agza g2 = this.g;
            g2.copyOnWrite();
            final ehs ehs2 = (ehs)g2.instance;
            ehs2.d |= 0x1000;
            ehs2.ae = ae;
        }
    }
}
