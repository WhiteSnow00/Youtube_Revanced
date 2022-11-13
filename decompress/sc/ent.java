import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ent extends env
{
    private final View h;
    
    public ent(final emk emk, final ahaz ahaz, final int n, final View h) {
        super(emk, "JgNevmfyr8lZxnvZfq3r729JgtxbLk039SjEVr1jMI7eztR3nd0tOgO6sMz+FJz+", "ylslQbtrjnaBQeIQLiG5TQpHgACRff6HBxNL0ysPa0Q=", ahaz, n, 57);
        this.h = h;
    }
    
    protected final void a() {
        if (this.h != null) {
            final Boolean b = (Boolean)mdx.z.e();
            final Boolean b2 = (Boolean)mdx.E.e();
            final emo emo = new emo((String)this.d.invoke(null, this.h, this.a.a.getResources().getDisplayMetrics(), b, b2));
            final ahaz builder = ((ahbh)ehs.a).createBuilder();
            final long longValue = emo.a;
            builder.copyOnWrite();
            final ehs ehs = (ehs)builder.instance;
            ehs.b |= 0x4;
            ehs.d = longValue;
            final long longValue2 = emo.b;
            builder.copyOnWrite();
            final ehs ehs2 = (ehs)builder.instance;
            ehs2.b |= 0x8;
            ehs2.e = longValue2;
            final long longValue3 = emo.c;
            builder.copyOnWrite();
            final ehs ehs3 = (ehs)builder.instance;
            ehs3.b |= 0x10;
            ehs3.f = longValue3;
            if (b2) {
                final long longValue4 = emo.e;
                builder.copyOnWrite();
                final ehs ehs4 = (ehs)builder.instance;
                ehs4.b |= 0x1;
                ehs4.c = longValue4;
            }
            if (b) {
                final long longValue5 = emo.d;
                builder.copyOnWrite();
                final ehs ehs5 = (ehs)builder.instance;
                ehs5.b |= 0x20;
                ehs5.g = longValue5;
            }
            final ahaz g = this.g;
            final ehs r = (ehs)builder.build();
            g.copyOnWrite();
            final eht eht = (eht)g.instance;
            final eht a = eht.a;
            r.getClass();
            eht.R = r;
            eht.c |= 0x80000;
        }
    }
}
