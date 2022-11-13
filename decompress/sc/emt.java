import android.view.View;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class emt extends env
{
    private final Activity h;
    private final View i;
    
    public emt(final emk emk, final ahaz ahaz, final int n, final View i, final Activity h) {
        super(emk, "rE+CHn9CLSmLsY/LfivBx+DmSmQMCqSMhAImHDd3dGWtfWUTJAZt/SbpXoR2i5+S", "XOTxexwsk5wzpmsanl+x8sPTZMmLepw+z7JZ/NtNU48=", ahaz, n, 62);
        this.i = i;
        this.h = h;
    }
    
    protected final void a() {
        if (this.i == null) {
            return;
        }
        final boolean booleanValue = (boolean)mdx.m.e();
        final Object[] array = (Object[])this.d.invoke(null, this.i, this.h, booleanValue);
        synchronized (this.g) {
            final ahaz g = this.g;
            final long longValue = (long)array[0];
            g.copyOnWrite();
            final eht eht = (eht)g.instance;
            final eht a = eht.a;
            eht.c |= 0x4000000;
            eht.V = longValue;
            final ahaz g2 = this.g;
            final long longValue2 = (long)array[1];
            g2.copyOnWrite();
            final eht eht2 = (eht)g2.instance;
            eht2.c |= 0x8000000;
            eht2.W = longValue2;
            if (booleanValue) {
                final ahaz g3 = this.g;
                final String x = (String)array[2];
                g3.copyOnWrite();
                final eht eht3 = (eht)g3.instance;
                x.getClass();
                eht3.c |= 0x10000000;
                eht3.X = x;
            }
        }
    }
}
