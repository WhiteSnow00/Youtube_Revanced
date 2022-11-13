import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.protobuf.MessageLite;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqc implements iqx
{
    private final int a;
    private final Object b;
    
    public iqc(final aezp b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public iqc(final Context b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public iqc(final ihb b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public iqc(final iqx b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final afeq a(final imt imt) {
        final int a = this.a;
        if (a == 0) {
            final Object b = this.b;
            final ahaz builder = ajhu.a.createBuilder();
            final ihb ihb = (ihb)b;
            final aqfl ao = ihb.h.ao();
            builder.copyOnWrite();
            final ajhu ajhu = (ajhu)builder.instance;
            ao.getClass();
            ajhu.i = ao;
            ajhu.c |= 0x80;
            final boolean p = tbi.p(ihb.f);
            builder.copyOnWrite();
            final ajhu ajhu2 = (ajhu)builder.instance;
            ajhu2.c |= 0x2;
            ajhu2.d = p;
            final String string = ihb.a.getString(2132018139);
            builder.copyOnWrite();
            final ajhu ajhu3 = (ajhu)builder.instance;
            string.getClass();
            ajhu3.c |= 0x4;
            ajhu3.e = string;
            final String string2 = ihb.a.getString(2132018138);
            builder.copyOnWrite();
            final ajhu ajhu4 = (ajhu)builder.instance;
            string2.getClass();
            ajhu4.c |= 0x8;
            ajhu4.f = string2;
            final String string3 = ihb.a.getString(2132018136);
            builder.copyOnWrite();
            final ajhu ajhu5 = (ajhu)builder.instance;
            string3.getClass();
            ajhu5.c |= 0x10;
            ajhu5.g = string3;
            final String string4 = ihb.a.getString(2132018137);
            builder.copyOnWrite();
            final ajhu ajhu6 = (ajhu)builder.instance;
            string4.getClass();
            ajhu6.c |= 0x20;
            ajhu6.h = string4;
            final ajhu ajhu7 = (ajhu)builder.build();
            aezp aezp;
            if (ihb.c.h()) {
                final ahbb ahbb = (ahbb)((ahbh)ajmo.a).createBuilder();
                final obq obq = (obq)ihb.c.c();
                obq.r();
                acbn.f(ahbb, (aqfw)((BaseClient)obq).c(-1562091377, (MessageLite)ajhu7, ((ahbh)aqfw.a).getParserForType()));
                aezp = aezp.k((Object)((ahaz)ahbb).build());
            }
            else {
                aezp = ihb.g.q(2131951647, (ahaq)ajhu.b, (Object)ajhu7);
            }
            afeq afeq;
            if (!aezp.h()) {
                afeq = afeq.q();
            }
            else {
                final ahaz builder2 = ((ahbh)alkh.a).createBuilder();
                final ajmo al = (ajmo)aezp.c();
                builder2.copyOnWrite();
                final alkh alkh = (alkh)builder2.instance;
                alkh.al = al;
                alkh.h |= 0x2000000;
                afeq = afeq.r((Object)new iqv((MessageLite)builder2.build()));
            }
            return afeq;
        }
        if (a == 1) {
            final Object b2 = this.b;
            final ahaz builder3 = ajhg.a.createBuilder();
            final ihb ihb2 = (ihb)b2;
            final aqfl ao2 = ihb2.h.ao();
            builder3.copyOnWrite();
            final ajhg ajhg = (ajhg)builder3.instance;
            ao2.getClass();
            ajhg.d = ao2;
            ajhg.c |= 0x2;
            final ahbf b3 = ajhf.b;
            final ahbb ahbb2 = (ahbb)((ahbh)appk.a).createBuilder();
            ((ahaz)ahbb2).copyOnWrite();
            final appk appk = (appk)ahbb2.instance;
            appk.b |= 0x2;
            appk.d = 164;
            final String f = glb.F((ahaq)b3, ((agzk)((ahaz)ahbb2).build()).toByteString());
            builder3.copyOnWrite();
            final ajhg ajhg2 = (ajhg)builder3.instance;
            f.getClass();
            ajhg2.c |= 0x100000;
            ajhg2.e = f;
            final ajhg ajhg3 = (ajhg)builder3.build();
            aezp aezp2;
            if (ihb2.c.h()) {
                final ahbb ahbb3 = (ahbb)((ahbh)ajmo.a).createBuilder();
                final obq obq2 = (obq)ihb2.c.c();
                obq2.r();
                acbn.f(ahbb3, (aqfw)((BaseClient)obq2).c(928296322, (MessageLite)ajhg3, ((ahbh)aqfw.a).getParserForType()));
                aezp2 = aezp.k((Object)((ahaz)ahbb3).build());
            }
            else {
                aezp2 = ihb2.g.q(2131951644, (ahaq)ajhg.b, (Object)ajhg3);
            }
            afeq afeq2;
            if (aezp2.h()) {
                final ahaz builder4 = ((ahbh)alkh.a).createBuilder();
                final ajmo al2 = (ajmo)aezp2.c();
                builder4.copyOnWrite();
                final alkh alkh2 = (alkh)builder4.instance;
                alkh2.al = al2;
                alkh2.h |= 0x2000000;
                afeq2 = afeq.r((Object)new iqv((MessageLite)builder4.build()));
            }
            else {
                afeq2 = afeq.q();
            }
            return afeq2;
        }
        if (a == 2) {
            final ahaz builder5 = ((ahbh)alkc.a).createBuilder();
            final ahaz builder6 = ((ahbh)alkb.a).createBuilder();
            final ajut h = acak.h(((Context)this.b).getResources().getString(2132017914));
            builder6.copyOnWrite();
            final alkb alkb = (alkb)builder6.instance;
            h.getClass();
            alkb.c = h;
            alkb.b |= 0x1;
            builder6.copyOnWrite();
            final alkb alkb2 = (alkb)builder6.instance;
            alkb2.d = 10;
            alkb2.b |= 0x2;
            final alkb c = (alkb)builder6.build();
            builder5.copyOnWrite();
            final alkc alkc = (alkc)builder5.instance;
            c.getClass();
            alkc.c = c;
            alkc.b |= 0x1;
            return afeq.r((Object)new iqv((MessageLite)builder5.build()));
        }
        if (a != 3) {
            return ((iqx)this.b).a(imt);
        }
        afeq afeq3;
        if (((aezp)this.b).h()) {
            final ahaz builder7 = ((ahbh)alkh.a).createBuilder();
            final ahaz builder8 = aoit.a.createBuilder();
            final String a2 = ((ira)((aezp)this.b).c()).a;
            builder8.copyOnWrite();
            final aoit aoit = (aoit)builder8.instance;
            aoit.b |= 0x1;
            aoit.c = a2;
            final String b4 = ((ira)((aezp)this.b).c()).b;
            builder8.copyOnWrite();
            final aoit aoit2 = (aoit)builder8.instance;
            aoit2.b |= 0x2;
            aoit2.d = b4;
            final ahaz builder9 = ((ahbh)ahhu.a).createBuilder();
            final int intValue = ((ira)((aezp)this.b).c()).c;
            builder9.copyOnWrite();
            final ahhu ahhu = (ahhu)builder9.instance;
            ahhu.b |= 0x1;
            ahhu.c = intValue;
            final ahhu e = (ahhu)builder9.build();
            builder8.copyOnWrite();
            final aoit aoit3 = (aoit)builder8.instance;
            e.getClass();
            aoit3.e = e;
            aoit3.b |= 0x4;
            builder7.copyOnWrite();
            final alkh alkh3 = (alkh)builder7.instance;
            final aoit ah = (aoit)builder8.build();
            ah.getClass();
            alkh3.ah = ah;
            alkh3.g |= 0x2000;
            afeq3 = afeq.r((Object)new iqv((MessageLite)builder7.build()));
        }
        else {
            afeq3 = afeq.q();
        }
        return afeq3;
    }
}
