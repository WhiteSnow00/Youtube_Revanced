// 
// Decompiled by Procyon v0.6.0
// 

public final class adaq implements Runnable
{
    public final adaw a;
    
    public adaq(final adaw a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final adaw a = this.a;
        a.b();
        a.n = a.m.b(a.o);
        final ahcr builder = aexe.a.createBuilder();
        final aexk h = a.h;
        builder.copyOnWrite();
        final aexe aexe = (aexe)builder.instance;
        h.getClass();
        aexe.c = h;
        int n = 1;
        aexe.b = 1;
        final aexm i = a.i;
        builder.copyOnWrite();
        final aexe aexe2 = (aexe)builder.instance;
        i.getClass();
        aexe2.d = i;
        final aexn a2 = a.a;
        builder.copyOnWrite();
        final aexe aexe3 = (aexe)builder.instance;
        a2.getClass();
        aexe3.f = a2;
        final ahcr builder2 = ((ahcz)akjf.a).createBuilder();
        final int z = a.z;
        builder2.copyOnWrite();
        final akjf akjf = (akjf)builder2.instance;
        if (z != 0) {
            akjf.g = z - 1;
            akjf.b |= 0x2000;
            final float r = a.r;
            builder2.copyOnWrite();
            final akjf akjf2 = (akjf)builder2.instance;
            akjf2.b |= 0x4000;
            akjf2.h = r;
            final boolean t = a.t;
            builder2.copyOnWrite();
            final akjf akjf3 = (akjf)builder2.instance;
            akjf3.b |= 0x40;
            akjf3.e = t;
            final ahcr builder3 = ((ahcz)akje.a).createBuilder();
            final boolean w = a.w;
            builder3.copyOnWrite();
            final akje akje = (akje)builder3.instance;
            akje.b |= 0x1;
            akje.c = w;
            final ahcr builder4 = ((ahcz)aoxi.a).createBuilder();
            final long b = a.x.b;
            builder4.copyOnWrite();
            final aoxi aoxi = (aoxi)builder4.instance;
            aoxi.b |= 0x1;
            aoxi.c = b;
            final int c = a.x.c;
            builder4.copyOnWrite();
            final aoxi aoxi2 = (aoxi)builder4.instance;
            aoxi2.b |= 0x2;
            aoxi2.d = c;
            final aoxi d = (aoxi)builder4.build();
            builder3.copyOnWrite();
            final akje akje2 = (akje)builder3.instance;
            d.getClass();
            akje2.d = d;
            akje2.b |= 0x2;
            final akje j = (akje)builder3.build();
            builder2.copyOnWrite();
            final akjf akjf4 = (akjf)builder2.instance;
            j.getClass();
            akjf4.j = j;
            akjf4.b |= 0x200000;
            a.g(builder2);
            a.h(builder2);
            final ahcr be = a.B.bE();
            builder2.copyOnWrite();
            final akjf akjf5 = (akjf)builder2.instance;
            final aknh c2 = (aknh)be.build();
            c2.getClass();
            akjf5.c = c2;
            akjf5.b |= 0x1;
            final ahcr builder5 = ((ahcz)aqyr.a).createBuilder();
            final ahbt byteString = ((ahbc)builder2.build()).toByteString();
            builder5.copyOnWrite();
            final aqyr aqyr = (aqyr)builder5.instance;
            aqyr.b = 1;
            aqyr.c = byteString;
            if (a.u) {
                final ahcr builder6 = ((ahcz)aqyt.a).createBuilder();
                final ahcr builder7 = aexw.a.createBuilder();
                builder7.copyOnWrite();
                final aexw aexw = (aexw)builder7.instance;
                final ahdh b2 = aexw.b;
                if (!b2.c()) {
                    aexw.b = ahcz.mutableCopy(b2);
                }
                aexw.b.g(0);
                builder6.copyOnWrite();
                final aqyt aqyt = (aqyt)builder6.instance;
                final aexw c3 = (aexw)builder7.build();
                c3.getClass();
                aqyt.c = c3;
                aqyt.b |= 0x1;
                final ahcr builder8 = aexx.a.createBuilder();
                builder8.copyOnWrite();
                final aexx aexx = (aexx)builder8.instance;
                aexx.c = 5;
                aexx.b |= 0x1;
                final int a3 = a.A;
                final int n2 = a3 - 1;
                if (a3 == 0) {
                    throw null;
                }
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 == 4) {
                            n = 8;
                        }
                    }
                    else {
                        n = 10;
                    }
                }
                else {
                    n = 7;
                }
                builder8.copyOnWrite();
                final aexx aexx2 = (aexx)builder8.instance;
                aexx2.d = n - 1;
                aexx2.b |= 0x2;
                builder6.copyOnWrite();
                final aqyt aqyt2 = (aqyt)builder6.instance;
                final aexx d2 = (aexx)builder8.build();
                d2.getClass();
                aqyt2.d = d2;
                aqyt2.b |= 0x2;
                final ahbt byteString2 = ((ahbc)builder6.build()).toByteString();
                builder5.copyOnWrite();
                final aqyr aqyr2 = (aqyr)builder5.instance;
                aqyr2.d = 4;
                aqyr2.e = byteString2;
            }
            final aqyr aqyr3 = (aqyr)builder5.build();
            final ahcr builder9 = aexo.a.createBuilder();
            final String f = a.f;
            builder9.copyOnWrite();
            final aexo aexo = (aexo)builder9.instance;
            f.getClass();
            aexo.c = f;
            final boolean s = a.s;
            builder9.copyOnWrite();
            ((aexo)builder9.instance).d = s;
            if (a.y > 0) {
                final ahcr builder10 = aexg.a.createBuilder();
                final ahcr builder11 = aexf.a.createBuilder();
                final int y = a.y;
                builder11.copyOnWrite();
                ((aexf)builder11.instance).b = y;
                final aexf b3 = (aexf)builder11.build();
                builder10.copyOnWrite();
                final aexg aexg = (aexg)builder10.instance;
                b3.getClass();
                aexg.b = b3;
                final aexg b4 = (aexg)builder10.build();
                builder9.copyOnWrite();
                final aexo aexo2 = (aexo)builder9.instance;
                b4.getClass();
                aexo2.b = b4;
            }
            final ahcr builder12 = aexr.a.createBuilder();
            final ahbt byteString3 = ((ahbc)aqyr3).toByteString();
            builder12.copyOnWrite();
            ((aexr)builder12.instance).b = byteString3;
            final aexr g = (aexr)builder12.build();
            builder.copyOnWrite();
            final aexe aexe4 = (aexe)builder.instance;
            g.getClass();
            aexe4.g = g;
            final aexo e = (aexo)builder9.build();
            builder.copyOnWrite();
            final aexe aexe5 = (aexe)builder.instance;
            e.getClass();
            aexe5.e = e;
            synchronized (a) {
                if (a.n != null) {
                    final asjm n3 = a.n;
                    final ahcr builder13 = aexi.a.createBuilder();
                    builder13.copyOnWrite();
                    final aexi aexi = (aexi)builder13.instance;
                    final aexe c4 = (aexe)builder.build();
                    c4.getClass();
                    aexi.c = c4;
                    aexi.b = 2;
                    n3.c(builder13.build());
                    a.p.run();
                }
                else {
                    a.d();
                    a.c.post((Runnable)new abse(a, new NullPointerException(), 18));
                }
                return;
            }
        }
        throw null;
    }
}
