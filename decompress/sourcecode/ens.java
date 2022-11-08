import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ens extends enu
{
    private final View h;
    
    public ens(final emj emj, final agza agza, final int n, final View h) {
        super(emj, "JgNevmfyr8lZxnvZfq3r729JgtxbLk039SjEVr1jMI7eztR3nd0tOgO6sMz+FJz+", "ylslQbtrjnaBQeIQLiG5TQpHgACRff6HBxNL0ysPa0Q=", agza, n, 57);
        this.h = h;
    }
    
    protected final void a() {
        if (this.h != null) {
            final Boolean b = (Boolean)mcs.z.e();
            final Boolean b2 = (Boolean)mcs.E.e();
            final emn emn = new emn((String)this.d.invoke(null, this.h, this.a.a.getResources().getDisplayMetrics(), b, b2));
            final agza builder = ((agzi)ehr.a).createBuilder();
            final long longValue = emn.a;
            builder.copyOnWrite();
            final ehr ehr = (ehr)builder.instance;
            ehr.b |= 0x4;
            ehr.d = longValue;
            final long longValue2 = emn.b;
            builder.copyOnWrite();
            final ehr ehr2 = (ehr)builder.instance;
            ehr2.b |= 0x8;
            ehr2.e = longValue2;
            final long longValue3 = emn.c;
            builder.copyOnWrite();
            final ehr ehr3 = (ehr)builder.instance;
            ehr3.b |= 0x10;
            ehr3.f = longValue3;
            if (b2) {
                final long longValue4 = emn.e;
                builder.copyOnWrite();
                final ehr ehr4 = (ehr)builder.instance;
                ehr4.b |= 0x1;
                ehr4.c = longValue4;
            }
            if (b) {
                final long longValue5 = emn.d;
                builder.copyOnWrite();
                final ehr ehr5 = (ehr)builder.instance;
                ehr5.b |= 0x20;
                ehr5.g = longValue5;
            }
            final agza g = this.g;
            final ehr r = (ehr)builder.build();
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a = ehs.a;
            r.getClass();
            ehs.R = r;
            ehs.c |= 0x80000;
        }
    }
}
