import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igz implements Callable
{
    public final ihb a;
    public final afeq b;
    public final aezp c;
    public final afeq d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final afeq i;
    public final int j;
    public final aezp k;
    
    public igz(final ihb a, final afeq b, final aezp c, final afeq d, final String e, final String f, final boolean g, final String h, final afeq i, final int j, final aezp k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final Object call() {
        final ihb a = this.a;
        final afeq b = this.b;
        final aezp c = this.c;
        final afeq d = this.d;
        final String e = this.e;
        final String f = this.f;
        final boolean g = this.g;
        final String h = this.h;
        final afeq i = this.i;
        final int j = this.j;
        final aezp k = this.k;
        final String concat = h.concat("_selected_values");
        final ahaz builder = ((ahbh)ajge.a).createBuilder();
        builder.copyOnWrite();
        final ajge ajge = (ajge)builder.instance;
        ajge.b |= 0x1;
        ajge.c = g;
        if (!b.isEmpty()) {
            final ajfu d2 = (ajfu)c.c();
            builder.copyOnWrite();
            final ajge ajge2 = (ajge)builder.instance;
            ajge2.d = d2;
            ajge2.b |= 0x2;
        }
        if (!d.isEmpty()) {
            final ajfs e2 = (ajfs)d.get(0);
            builder.copyOnWrite();
            final ajge ajge3 = (ajge)builder.instance;
            e2.getClass();
            ajge3.e = e2;
            ajge3.b |= 0x4;
        }
        final ajge ajge4 = (ajge)builder.build();
        final boolean empty = d.isEmpty();
        final ajfy a2 = a.a(b, d, i, j, concat, empty);
        final heo g2 = a.g;
        final ahbf b2 = ajfz.b;
        final ahaz builder2 = ((ahbh)ajfz.a).createBuilder();
        final aqfl ao = a.h.ao();
        builder2.copyOnWrite();
        final ajfz ajfz = (ajfz)builder2.instance;
        ao.getClass();
        ajfz.f = ao;
        ajfz.c |= 0x8;
        builder2.copyOnWrite();
        final ajfz ajfz2 = (ajfz)builder2.instance;
        a2.getClass();
        ajfz2.d = a2;
        ajfz2.c |= 0x1;
        builder2.copyOnWrite();
        final ajfz ajfz3 = (ajfz)builder2.instance;
        ajge4.getClass();
        ajfz3.e = ajge4;
        ajfz3.c |= 0x2;
        builder2.copyOnWrite();
        final ajfz ajfz4 = (ajfz)builder2.instance;
        h.getClass();
        ajfz4.c |= 0x40;
        ajfz4.g = h;
        final aezp p = g2.p(2131951639, (ahaq)b2, (Object)builder2.build());
        Object o;
        if (!p.h()) {
            o = aeyo.a;
        }
        else {
            final ajgb b3 = a.b(b, e, f, 3, k, concat, empty);
            final heo g3 = a.g;
            final ahbf b4 = ajgc.b;
            final ahaz builder3 = ((ahbh)ajgc.a).createBuilder();
            builder3.copyOnWrite();
            final ajgc ajgc = (ajgc)builder3.instance;
            b3.getClass();
            ajgc.d = b3;
            ajgc.c |= 0x1;
            final aqfl ao2 = a.h.ao();
            builder3.copyOnWrite();
            final ajgc ajgc2 = (ajgc)builder3.instance;
            ao2.getClass();
            ajgc2.f = ao2;
            ajgc2.c |= 0x8;
            builder3.copyOnWrite();
            final ajgc ajgc3 = (ajgc)builder3.instance;
            ajge4.getClass();
            ajgc3.e = ajge4;
            ajgc3.c |= 0x2;
            final aezp p2 = g3.p(2131951641, (ahaq)b4, (Object)builder3.build());
            if (!p2.h()) {
                o = aeyo.a;
            }
            else {
                final ahbb ahbb = (ahbb)((ahbh)aqnu.a).createBuilder();
                final aqfw aqfw = (aqfw)p.c();
                ((ahaz)ahbb).copyOnWrite();
                final aqnu aqnu = (aqnu)ahbb.instance;
                final ahbx f2 = aqnu.f;
                if (!f2.c()) {
                    aqnu.f = ahbh.mutableCopy(f2);
                }
                aqnu.f.add((Object)aqfw);
                final aqfw e3 = (aqfw)p2.c();
                ((ahaz)ahbb).copyOnWrite();
                final aqnu aqnu2 = (aqnu)ahbb.instance;
                aqnu2.e = e3;
                aqnu2.c |= 0x2;
                o = aezp.k((Object)((ahaz)ahbb).build());
            }
        }
        return o;
    }
}
