import android.content.res.Resources;
import j$.util.Optional;
import com.google.protobuf.MessageLite;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipx implements iqx
{
    private final aezp a;
    private final int b;
    private final Object c;
    private final Object d;
    
    public ipx(final Context d, final heo c, final aezp a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    public ipx(final hzn c, final flv d, final aezp a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public ipx(final hzn c, final fmr d, final aezp a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public ipx(final hzn d, final vdr c, final aezp a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final afeq a(final imt imt) {
        final int b = this.b;
        if (b == 0) {
            final aezp a = this.a;
            if (a.h()) {
                final apys apys = (apys)a.c();
                if (!(boolean)((flv)this.d).d().J((asjr)new ijl(vgl.i(apys.e()), 12)).ac()) {
                    final ahaz builder = ((ahbh)alkh.a).createBuilder();
                    final ajmo al = (ajmo)((hzn)this.c).E(apys.class, ajmo.class, apys, null);
                    al.getClass();
                    builder.copyOnWrite();
                    final alkh alkh = (alkh)builder.instance;
                    alkh.al = al;
                    alkh.h |= 0x2000000;
                    return afeq.r((Object)new irc((MessageLite)builder.build(), ((apys)this.a.c()).getAddedTimestampMillis()));
                }
            }
            return afeq.q();
        }
        int e = -1;
        final boolean b2 = false;
        if (b == 1) {
            final aezp a2 = this.a;
            afeq afeq2;
            if (!a2.h()) {
                afeq2 = afeq.q();
            }
            else {
                final ipv ipv = (ipv)a2.c();
                final Object c = this.c;
                final ahbf b3 = ajho.b;
                final ahaz builder2 = ajho.a.createBuilder();
                final Resources resources = ((Context)this.d).getResources();
                final int a3 = ipv.a;
                final String d = acak.h(resources.getQuantityString(2131886121, a3, new Object[] { a3 })).d;
                builder2.copyOnWrite();
                final ajho ajho = (ajho)builder2.instance;
                d.getClass();
                ajho.c |= 0x4;
                ajho.d = d;
                final int b4 = ipv.b;
                builder2.copyOnWrite();
                final ajho ajho2 = (ajho)builder2.instance;
                ajho2.e = b4 - 1;
                ajho2.c |= 0x8;
                final aezp q = ((heo)c).q(2131951645, (ahaq)b3, (Object)builder2.build());
                if (!q.h()) {
                    afeq2 = afeq.q();
                }
                else {
                    final ahaz builder3 = ((ahbh)alkh.a).createBuilder();
                    final ajmo al2 = (ajmo)q.c();
                    builder3.copyOnWrite();
                    final alkh alkh2 = (alkh)builder3.instance;
                    alkh2.al = al2;
                    alkh2.h |= 0x2000000;
                    afeq2 = afeq.r((Object)new iqv((MessageLite)builder3.build()));
                }
            }
            return afeq2;
        }
        if (b == 2) {
            final aezp b5 = imt.b;
            ajhp ajhp;
            if (b5.h()) {
                final ajhn ajhn = (ajhn)b5.c();
                ajhk a4;
                if (ajhn.b == 2) {
                    a4 = (ajhk)ajhn.c;
                }
                else {
                    a4 = ajhk.a;
                }
                if ((ajhp = ajhp.b(a4.d)) == null) {
                    ajhp = ajhp.a;
                }
                e = a4.e;
            }
            else if ((ajhp = ajhp.b(((ajhq)imt.c.instance).c)) == null) {
                ajhp = ajhp.a;
            }
            final ahaz builder4 = ((ahbh)alkc.a).createBuilder();
            final Object c2 = this.c;
            final Object d2 = this.d;
            final aezp a5 = this.a;
            boolean b6 = b2;
            if (a5.h()) {
                b6 = b2;
                if (((iqu)a5.c()).a) {
                    b6 = true;
                }
            }
            final alki g = (alki)((hzn)c2).E(fmr.class, alki.class, d2, afev.o("downloads_page_filter_type", ajhp.e, "downloads_page_downloads_section_items_to_show", e, "downloads_page_should_hide_filter_menu", b6));
            g.getClass();
            builder4.copyOnWrite();
            final alkc alkc = (alkc)builder4.instance;
            alkc.g = g;
            alkc.b |= 0x10;
            return afeq.r((Object)new iqv((MessageLite)builder4.build()));
        }
        if (b != 3) {
            final aezp b7 = imt.b;
            ajhp ajhp2;
            if (b7.h()) {
                final ajhn ajhn2 = (ajhn)b7.c();
                ajhk a6;
                if (ajhn2.b == 2) {
                    a6 = (ajhk)ajhn2.c;
                }
                else {
                    a6 = ajhk.a;
                }
                if ((ajhp2 = ajhp.b(a6.d)) == null) {
                    ajhp2 = ajhp.a;
                }
            }
            else if ((ajhp2 = ajhp.b(((ajhq)imt.c.instance).c)) == null) {
                ajhp2 = ajhp.a;
            }
            final aezp a7 = this.a;
            Optional optional;
            if (a7.h()) {
                optional = Optional.of((Object)((iqz)a7.c()).a);
            }
            else {
                optional = Optional.empty();
            }
            final ahaz builder5 = ((ahbh)alkh.a).createBuilder();
            final ahyk u = (ahyk)((hzn)this.c).E(fmr.class, ahyk.class, this.d, afev.n("downloads_page_filter_type", ajhp2.e, "background_promo_style_type", optional));
            u.getClass();
            builder5.copyOnWrite();
            final alkh alkh3 = (alkh)builder5.instance;
            alkh3.U = u;
            alkh3.f |= 0x2000;
            return afeq.r((Object)new iqv((MessageLite)builder5.build()));
        }
        afeq afeq3;
        if (jgk.C(this.a, (vfp)((vdr)this.c).b())) {
            final ahaz builder6 = ((ahbh)alkh.a).createBuilder();
            final apao v = (apao)((hzn)this.d).E(Void.class, apao.class, null, afev.m("is_travel_message", true));
            v.getClass();
            builder6.copyOnWrite();
            final alkh alkh4 = (alkh)builder6.instance;
            alkh4.V = v;
            alkh4.f |= 0x10000;
            afeq3 = afeq.r((Object)new iqv((MessageLite)builder6.build()));
        }
        else {
            afeq3 = afeq.q();
        }
        return afeq3;
    }
}
