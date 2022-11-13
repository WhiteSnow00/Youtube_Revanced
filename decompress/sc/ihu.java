import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihu implements Callable
{
    public final ihy a;
    public final zme b;
    public final String c;
    public final alzg d;
    
    public ihu(final ihy a, final zme b, final String c, final alzg d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final Object call() {
        final ihy a = this.a;
        final zme b = this.b;
        final String c = this.c;
        final alzg d = this.d;
        aabz aabz;
        if ((d.c & 0x200) != 0x0 && d.l) {
            final aaeh aaeh = (aaeh)fex.k((aabo)a.a.a(), b).orElse((Object)null);
            if (aaeh == null) {
                final aaby b2 = aabz.c.b();
                b2.b = 15;
                aabz = b2.a();
            }
            else {
                final zvo b3 = aaeh.B();
                if (b3 == null) {
                    final aaby b4 = aabz.c.b();
                    b4.b = 15;
                    aabz = b4.a();
                }
                else {
                    final amwz f = b3.f(c);
                    final atib d2 = aaeh.D();
                    if (d2 == null) {
                        final aaby b5 = aabz.c.b();
                        b5.b = 26;
                        aabz = b5.a();
                    }
                    else {
                        final aaeo t = d2.t();
                        final List u = b3.u(c);
                        final aaat s = b3.s(c);
                        if (s == null) {
                            final aaby b6 = aabz.c.b();
                            b6.b = 26;
                            aabz = b6.a();
                        }
                        else {
                            final aanx f2 = aaeh.F();
                            if (f2 == null) {
                                final aaby b7 = aabz.c.b();
                                b7.b = 26;
                                aabz = b7.a();
                            }
                            else {
                                final aaen q = f2.q(s.a, (Collection)u);
                                q.f();
                                final afel d3 = afeq.d();
                                for (final String s2 : u) {
                                    final ahaz builder = ((ahbh)amul.a).createBuilder();
                                    builder.copyOnWrite();
                                    final amul amul = (amul)builder.instance;
                                    amul.c = 1;
                                    amul.b |= 0x1;
                                    final String h = vgl.h(ancz.b.a(), s2);
                                    builder.copyOnWrite();
                                    final amul amul2 = (amul)builder.instance;
                                    h.getClass();
                                    amul2.b |= 0x2;
                                    amul2.d = h;
                                    final ahbb ahbb = (ahbb)((ahbh)amuj.b).createBuilder();
                                    final int j = fex.j(amas.b.a(), 2, 2);
                                    ((ahaz)ahbb).copyOnWrite();
                                    final amuj amuj = (amuj)ahbb.instance;
                                    amuj.c |= 0x1;
                                    amuj.d = j;
                                    ahbb.p(amui.c);
                                    final ahbf b8 = ancv.b;
                                    final ahaz builder2 = ancv.a.createBuilder();
                                    builder2.copyOnWrite();
                                    final ancv ancv = (ancv)builder2.instance;
                                    ancv.e = f.k;
                                    ancv.c |= 0x2;
                                    ahbb.e((ahaq)b8, (Object)builder2.build());
                                    final amuj e = (amuj)((ahaz)ahbb).build();
                                    builder.copyOnWrite();
                                    final amul amul3 = (amul)builder.instance;
                                    e.getClass();
                                    amul3.e = e;
                                    amul3.b |= 0x4;
                                    d3.h(builder.build());
                                    final ahaz builder3 = ((ahbh)amul.a).createBuilder();
                                    builder3.copyOnWrite();
                                    final amul amul4 = (amul)builder3.instance;
                                    amul4.c = 4;
                                    amul4.b |= 0x1;
                                    final String h2 = vgl.h(aman.b.a(), s2);
                                    builder3.copyOnWrite();
                                    final amul amul5 = (amul)builder3.instance;
                                    h2.getClass();
                                    amul5.b |= 0x2;
                                    amul5.d = h2;
                                    final ahbb ahbb2 = (ahbb)((ahbh)amuj.b).createBuilder();
                                    final ahbf b9 = amaj.b;
                                    final ahaz builder4 = ((ahbh)amaj.a).createBuilder();
                                    builder4.copyOnWrite();
                                    final amaj amaj = (amaj)builder4.instance;
                                    amaj.c |= 0x1;
                                    amaj.e = true;
                                    ahbb2.e((ahaq)b9, (Object)builder4.build());
                                    final amuj e2 = (amuj)((ahaz)ahbb2).build();
                                    builder3.copyOnWrite();
                                    final amul amul6 = (amul)builder3.instance;
                                    e2.getClass();
                                    amul6.e = e2;
                                    amul6.b |= 0x4;
                                    d3.h(builder3.build());
                                    q.e(s2);
                                    t.c(s2);
                                }
                                final aaby a2 = aabz.a();
                                a2.a = 2;
                                a2.b(d3.g());
                                aabz = a2.a();
                            }
                        }
                    }
                }
            }
        }
        else {
            final aaby a3 = aabz.a();
            a3.a = 2;
            aabz = a3.a();
        }
        return aabz;
    }
}
