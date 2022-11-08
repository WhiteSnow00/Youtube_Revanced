import android.view.View;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ems extends enu
{
    private final Activity h;
    private final View i;
    
    public ems(final emj emj, final agza agza, final int n, final View i, final Activity h) {
        super(emj, "rE+CHn9CLSmLsY/LfivBx+DmSmQMCqSMhAImHDd3dGWtfWUTJAZt/SbpXoR2i5+S", "XOTxexwsk5wzpmsanl+x8sPTZMmLepw+z7JZ/NtNU48=", agza, n, 62);
        this.i = i;
        this.h = h;
    }
    
    protected final void a() {
        if (this.i == null) {
            return;
        }
        final boolean booleanValue = (boolean)mcs.m.e();
        final Object[] array = (Object[])this.d.invoke(null, this.i, this.h, booleanValue);
        synchronized (this.g) {
            final agza g = this.g;
            final long longValue = (long)array[0];
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a = ehs.a;
            ehs.c |= 0x4000000;
            ehs.V = longValue;
            final agza g2 = this.g;
            final long longValue2 = (long)array[1];
            g2.copyOnWrite();
            final ehs ehs2 = (ehs)g2.instance;
            ehs2.c |= 0x8000000;
            ehs2.W = longValue2;
            if (booleanValue) {
                final agza g3 = this.g;
                final String x = (String)array[2];
                g3.copyOnWrite();
                final ehs ehs3 = (ehs)g3.instance;
                x.getClass();
                ehs3.c |= 0x10000000;
                ehs3.X = x;
            }
        }
    }
}
