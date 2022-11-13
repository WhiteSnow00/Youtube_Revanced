import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqd implements iqx
{
    private final atke a;
    private final aezp b;
    private final vai c;
    private final heo d;
    private final fzw e;
    
    public iqd(final heo d, final atke a, final vai c, final fzw e, final aezp b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.e = e;
        this.b = b;
    }
    
    @Override
    public final afeq a(final imt imt) {
        final aezp b = this.b;
        if (!b.h()) {
            return afeq.q();
        }
        final alzj b2 = ((iqt)b.c()).b;
        final ahbb ahbb = (ahbb)((ahbh)appk.a).createBuilder();
        final String i = vgl.i(b2.e());
        ((ahaz)ahbb).copyOnWrite();
        final appk appk = (appk)ahbb.instance;
        appk.b |= 0x1;
        appk.c = i;
        ((ahaz)ahbb).copyOnWrite();
        final appk appk2 = (appk)ahbb.instance;
        appk2.b |= 0x2;
        appk2.d = 306;
        final aezp b3 = ((bhv)this.a.a()).B(fmy.e(b2.getPlaylistId()));
        if (b3.h()) {
            final ahbf b4 = ajic.b;
            final ahaz builder = ajic.a.createBuilder();
            final apza apza = (apza)b3.c();
            builder.copyOnWrite();
            final ajic ajic = (ajic)builder.instance;
            ajic.d = apza.f;
            ajic.c |= 0x1;
            ahbb.e((ahaq)b4, (Object)builder.build());
        }
        final appk appk3 = (appk)((ahaz)ahbb).build();
        final ahaz builder2 = ajie.a.createBuilder();
        final aqfl ao = this.e.ao();
        builder2.copyOnWrite();
        final ajie ajie = (ajie)builder2.instance;
        ao.getClass();
        ajie.d = ao;
        ajie.c |= 0x2;
        final String b5 = glb.B(appk3);
        builder2.copyOnWrite();
        final ajie ajie2 = (ajie)builder2.instance;
        b5.getClass();
        ajie2.c |= 0x4;
        ajie2.e = b5;
        final ahaz builder3 = ajid.a.createBuilder();
        final boolean ag = this.c.ag();
        builder3.copyOnWrite();
        final ajid ajid = (ajid)builder3.instance;
        ajid.b |= 0x1;
        ajid.c = ag;
        builder2.copyOnWrite();
        final ajie ajie3 = (ajie)builder2.instance;
        final ajid g = (ajid)builder3.build();
        g.getClass();
        ajie3.g = g;
        ajie3.c |= 0x80;
        final ahaz builder4 = ((ahbh)aina.a).createBuilder();
        builder4.copyOnWrite();
        final aina aina = (aina)builder4.instance;
        aina.b |= 0x1;
        aina.c = 42357;
        final int a = ((iqt)this.b.c()).a;
        builder4.copyOnWrite();
        final aina aina2 = (aina)builder4.instance;
        aina2.b |= 0x4;
        aina2.e = a;
        final ahaz builder5 = ((ahbh)ainb.a).createBuilder();
        final ahaz builder6 = ((ahbh)ainu.a).createBuilder();
        final ahab a2 = ahab.A(appk3.c);
        builder6.copyOnWrite();
        final ainu ainu = (ainu)builder6.instance;
        ainu.b |= 0x1;
        ainu.c = a2;
        builder5.copyOnWrite();
        final ainb ainb = (ainb)builder5.instance;
        final ainu e = (ainu)builder6.build();
        e.getClass();
        ainb.e = e;
        ainb.b |= 0x4;
        builder4.copyOnWrite();
        final aina aina3 = (aina)builder4.instance;
        final ainb f = (ainb)builder5.build();
        f.getClass();
        aina3.f = f;
        aina3.b |= 0x8;
        builder2.copyOnWrite();
        final ajie ajie4 = (ajie)builder2.instance;
        final aina f2 = (aina)builder4.build();
        f2.getClass();
        ajie4.f = f2;
        ajie4.c |= 0x40;
        final aezp q = this.d.q(2131951649, (ahaq)ajie.b, (Object)builder2.build());
        if (q.h()) {
            final ahaz builder7 = ((ahbh)alkh.a).createBuilder();
            final ajmo al = (ajmo)q.c();
            builder7.copyOnWrite();
            final alkh alkh = (alkh)builder7.instance;
            alkh.al = al;
            alkh.h |= 0x2000000;
            return afeq.r((Object)new iqv((MessageLite)builder7.build()));
        }
        return afeq.q();
    }
}
