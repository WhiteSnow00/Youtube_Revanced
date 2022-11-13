import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iha implements Callable
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
    
    public iha(final ihb a, final afeq b, final aezp c, final afeq d, final String e, final String f, final boolean g, final String h, final afeq i, final int j, final aezp k) {
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
        final ahaz builder = ((ahbh)ajgd.a).createBuilder();
        final ahaz builder2 = ((ahbh)ajge.a).createBuilder();
        final boolean empty = d.isEmpty();
        final ajfy a2 = a.a(b, d, i, j, null, empty);
        final ajgb b2 = a.b(b, e, f, (new int[] { 1, 2, 3 })[1], k, null, empty);
        if (!b.isEmpty()) {
            final ajfu d2 = (ajfu)c.c();
            builder2.copyOnWrite();
            final ajge ajge = (ajge)builder2.instance;
            ajge.d = d2;
            ajge.b |= 0x2;
        }
        if (!d.isEmpty()) {
            final ajfs e2 = (ajfs)d.get(0);
            builder2.copyOnWrite();
            final ajge ajge2 = (ajge)builder2.instance;
            e2.getClass();
            ajge2.e = e2;
            ajge2.b |= 0x4;
        }
        final ahaz builder3 = ((ahbh)ajga.a).createBuilder();
        builder3.copyOnWrite();
        final ajga ajga = (ajga)builder3.instance;
        ajga.b |= 0x2;
        ajga.c = true;
        builder.copyOnWrite();
        final ajgd ajgd = (ajgd)builder.instance;
        final ajga e3 = (ajga)builder3.build();
        e3.getClass();
        ajgd.e = e3;
        ajgd.c |= 0x800;
        builder.copyOnWrite();
        final ajgd ajgd2 = (ajgd)builder.instance;
        a2.getClass();
        ajgd2.h = a2;
        ajgd2.c |= 0x20000000;
        builder.copyOnWrite();
        final ajgd ajgd3 = (ajgd)builder.instance;
        b2.getClass();
        ajgd3.i = b2;
        ajgd3.c |= 0x40000000;
        builder2.copyOnWrite();
        final ajge ajge3 = (ajge)builder2.instance;
        ajge3.b |= 0x1;
        ajge3.c = g;
        final ajge f2 = (ajge)builder2.build();
        builder.copyOnWrite();
        final ajgd ajgd4 = (ajgd)builder.instance;
        f2.getClass();
        ajgd4.f = f2;
        ajgd4.c |= 0x20000;
        builder.copyOnWrite();
        final ajgd ajgd5 = (ajgd)builder.instance;
        h.getClass();
        ajgd5.c |= 0x40000;
        ajgd5.g = h;
        final aqfl ao = a.h.ao();
        builder.copyOnWrite();
        final ajgd ajgd6 = (ajgd)builder.instance;
        ao.getClass();
        ajgd6.d = ao;
        ajgd6.c |= 0x400;
        return a.g.p(2131951640, (ahaq)ajgd.b, (Object)builder.build()).b((aezf)huo.l);
    }
}
