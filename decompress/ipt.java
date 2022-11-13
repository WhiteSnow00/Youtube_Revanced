import java.util.Iterator;
import com.google.android.libraries.blocks.runtime.BaseClient;
import java.util.ArrayList;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipt implements iqx
{
    private final int a;
    private final Object b;
    private final Object c;
    
    public ipt(final Context c, final heo b, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ipt(final hzn c, final aezp b, final int a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ipt(final ihb c, final aezp b, final int a) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ipt(final iqw b, final ing c, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ipt(final List c, final Map b, final int a) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ipt(final Map b, final ing c, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final void b(final iqh iqh, final imt imt, final aezp aezp, final ahbb ahbb) {
        final iqw iqw = ((Map<K, iqw>)this.b).get(iqh);
        iqw.getClass();
        final afeq a = iqw.a(aezp).a(imt);
        if (a.isEmpty()) {
            return;
        }
        ahbb.l((alkh)((iqv)a.get(0)).a);
    }
    
    @Override
    public final afeq a(final imt imt) {
        final int a = this.a;
        if (a == 0) {
            final afeq a2 = ((iqw)this.b).a(((ing)this.c).a()).a(imt);
            afeq afeq;
            if (!a2.isEmpty()) {
                final ahaz builder = ((ahbh)anyy.a).createBuilder();
                final ahbb ahbb = (ahbb)((ahbh)alke.a).createBuilder();
                ((ahaz)ahbb).copyOnWrite();
                final alke alke = (alke)ahbb.instance;
                alke.c |= 0x8;
                alke.i = "downloads_page_banner_item_section_identifier";
                ahbb.l((alkh)((iqv)a2.get(0)).a);
                final alke j = (alke)((ahaz)ahbb).build();
                builder.copyOnWrite();
                final anyy anyy = (anyy)builder.instance;
                j.getClass();
                anyy.j = j;
                anyy.b |= 0x10;
                afeq = afeq.r((Object)new iqv((MessageLite)builder.build()));
            }
            else {
                afeq = afeq.q();
            }
            return afeq;
        }
        if (a == 1) {
            final aezp a3 = ((ing)this.c).a();
            final ahbb ahbb2 = (ahbb)((ahbh)alke.a).createBuilder();
            ((ahaz)ahbb2).copyOnWrite();
            final alke alke2 = (alke)ahbb2.instance;
            alke2.c |= 0x8;
            alke2.i = "downloads_page_banner_item_section_identifier";
            this.b(iqh.f, imt, a3, ahbb2);
            if (((alke)ahbb2.instance).e.size() == 0) {
                this.b(iqh.g, imt, a3, ahbb2);
            }
            afeq afeq2;
            if (((alke)ahbb2.instance).e.size() == 1) {
                final ahaz builder2 = ((ahbh)anyy.a).createBuilder();
                builder2.copyOnWrite();
                final anyy anyy2 = (anyy)builder2.instance;
                final alke i = (alke)((ahaz)ahbb2).build();
                i.getClass();
                anyy2.j = i;
                anyy2.b |= 0x10;
                afeq2 = afeq.r((Object)new iqv((MessageLite)builder2.build()));
            }
            else {
                afeq2 = afeq.q();
            }
            return afeq2;
        }
        if (a == 2) {
            afeq afeq3;
            if (((aezp)this.b).h()) {
                final ahaz builder3 = ((ahbh)alkh.a).createBuilder();
                final ajmo al = (ajmo)((hzn)this.c).E(apyn.class, ajmo.class, ((aezp)this.b).c(), null);
                al.getClass();
                builder3.copyOnWrite();
                final alkh alkh = (alkh)builder3.instance;
                alkh.al = al;
                alkh.h |= 0x2000000;
                afeq3 = afeq.r((Object)new irc((MessageLite)builder3.build(), ((apyn)((aezp)this.b).c()).getAddedTimestampMillis()));
            }
            else {
                afeq3 = afeq.q();
            }
            return afeq3;
        }
        if (a == 3) {
            final aezp b = imt.b;
            ajhp ajhp;
            if (b.h()) {
                final ajhn ajhn = (ajhn)b.c();
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
            }
            else if ((ajhp = ajhp.b(((ajhq)imt.c.instance).c)) == null) {
                ajhp = ajhp.a;
            }
            final aezp aezp = (aezp)this.b;
            if (aezp.h()) {
                final Object c = this.c;
                final int intValue = (int)aezp.c();
                final ahaz builder4 = ajhr.a.createBuilder();
                final ihb ihb = (ihb)c;
                final aqfl ao = ihb.h.ao();
                builder4.copyOnWrite();
                final ajhr ajhr = (ajhr)builder4.instance;
                ao.getClass();
                ajhr.d = ao;
                ajhr.c |= 0x2;
                final String c2 = aevy.c(ihb.a.getString(2132018029, new Object[] { intValue }));
                builder4.copyOnWrite();
                final ajhr ajhr2 = (ajhr)builder4.instance;
                c2.getClass();
                ajhr2.c |= 0x8;
                ajhr2.e = c2;
                builder4.copyOnWrite();
                final ajhr ajhr3 = (ajhr)builder4.instance;
                ajhr3.f = ajhp.e;
                ajhr3.c |= 0x10;
                final String g = glb.G((ahaq)ajjb.b, "downloads_page_state");
                builder4.copyOnWrite();
                final ajhr ajhr4 = (ajhr)builder4.instance;
                g.getClass();
                ajhr4.c |= 0x40;
                ajhr4.h = g;
                builder4.copyOnWrite();
                final ajhr ajhr5 = (ajhr)builder4.instance;
                ajhr5.c |= 0x20;
                ajhr5.g = 122455;
                final long h = ihb.e.h(45354176L);
                final int n = (int)h;
                if (h != n) {
                    throw new ArithmeticException();
                }
                final int ab = aevy.aB(n);
                builder4.copyOnWrite();
                final ajhr ajhr6 = (ajhr)builder4.instance;
                if (ab == 0) {
                    throw null;
                }
                ajhr6.i = ab - 1;
                ajhr6.c |= 0x80;
                final ajhr ajhr7 = (ajhr)builder4.build();
                aezp aezp2;
                if (ihb.c.h()) {
                    final ahbb ahbb3 = (ahbb)((ahbh)ajmo.a).createBuilder();
                    final obq obq = (obq)ihb.c.c();
                    obq.r();
                    acbn.f(ahbb3, (aqfw)((BaseClient)obq).c(2062862545, (MessageLite)ajhr7, ((ahbh)aqfw.a).getParserForType()));
                    aezp2 = aezp.k((Object)((ahaz)ahbb3).build());
                }
                else {
                    aezp2 = ihb.g.q(2131951646, (ahaq)ajhr.b, (Object)ajhr7);
                }
                if (aezp2.h()) {
                    final ahaz builder5 = ((ahbh)alkh.a).createBuilder();
                    final ajmo al2 = (ajmo)aezp2.c();
                    builder5.copyOnWrite();
                    final alkh alkh2 = (alkh)builder5.instance;
                    alkh2.al = al2;
                    alkh2.h |= 0x2000000;
                    return afeq.r((Object)new iqv((MessageLite)builder5.build()));
                }
            }
            return afeq.q();
        }
        if (a != 4) {
            final Object b2 = this.b;
            final ahbf b3 = ajhv.b;
            final ahaz builder6 = ajhv.a.createBuilder();
            final String string = ((Context)this.c).getString(2132019842);
            builder6.copyOnWrite();
            final ajhv ajhv = (ajhv)builder6.instance;
            string.getClass();
            ajhv.c |= 0x2;
            ajhv.d = string;
            final aezp q = ((heo)b2).q(2131951648, (ahaq)b3, (Object)builder6.build());
            afeq afeq5;
            if (!q.h()) {
                afeq5 = afeq.q();
            }
            else {
                final ahaz builder7 = ((ahbh)alkh.a).createBuilder();
                final ajmo al3 = (ajmo)q.c();
                builder7.copyOnWrite();
                final alkh alkh3 = (alkh)builder7.instance;
                alkh3.al = al3;
                alkh3.h |= 0x2000000;
                afeq5 = afeq.r((Object)new iqv((MessageLite)builder7.build()));
            }
            return afeq5;
        }
        final ahaz builder8 = ((ahbh)anyv.a).createBuilder();
        final ArrayList list = new ArrayList();
        final afkf d = ((afeq)this.c).D();
        while (((Iterator)d).hasNext()) {
            final iqx iqx = ((Map<K, iqx>)this.b).get(((Iterator)d).next());
            iqx.getClass();
            final afeq a5 = iqx.a(imt);
            if (!a5.isEmpty()) {
                list.add(((iqv)a5.get(0)).a);
            }
        }
        builder8.bA((Iterable)list);
        return afeq.r((Object)new iqv((MessageLite)builder8.build()));
    }
}
