// 
// Decompiled by Procyon v0.6.0
// 

public final class adar implements Runnable
{
    public final adaw a;
    
    public adar(final adaw a) {
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
            final String v = a.v;
            builder2.copyOnWrite();
            final akjf akjf5 = (akjf)builder2.instance;
            v.getClass();
            akjf5.b |= 0x10;
            akjf5.d = v;
            final ahcr be = a.B.bE();
            builder2.copyOnWrite();
            final akjf akjf6 = (akjf)builder2.instance;
            final aknh c2 = (aknh)be.build();
            c2.getClass();
            akjf6.c = c2;
            akjf6.b |= 0x1;
            final ahcr builder5 = ((ahcz)aqyr.a).createBuilder();
            final ahbt byteString = ((ahbc)builder2.build()).toByteString();
            builder5.copyOnWrite();
            final aqyr aqyr = (aqyr)builder5.instance;
            aqyr.b = 1;
            aqyr.c = byteString;
            final aqyr aqyr2 = (aqyr)builder5.build();
            final ahcr builder6 = aexr.a.createBuilder();
            final ahbt byteString2 = ((ahbc)aqyr2).toByteString();
            builder6.copyOnWrite();
            ((aexr)builder6.instance).b = byteString2;
            final aexr g = (aexr)builder6.build();
            builder.copyOnWrite();
            final aexe aexe4 = (aexe)builder.instance;
            g.getClass();
            aexe4.g = g;
            synchronized (a) {
                final asjm n = a.n;
                final ahcr builder7 = aexi.a.createBuilder();
                builder7.copyOnWrite();
                final aexi aexi = (aexi)builder7.instance;
                final aexe c3 = (aexe)builder.build();
                c3.getClass();
                aexi.c = c3;
                aexi.b = 2;
                n.c(builder7.build());
                return;
            }
        }
        throw null;
    }
}
