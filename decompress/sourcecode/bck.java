import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bck implements bbk
{
    private final bbk a;
    private final bcj b;
    private boolean c;
    
    public bck(final bbk a, final bcj b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(final byte[] array, final int n, final int n2) {
        return this.a.a(array, n, n2);
    }
    
    public final long b(bbo a) {
        final Object o = a;
        final ywg ywg = (ywg)this.b;
        final PlayerConfigModel b = ywg.b;
        aiuv aiuv;
        if ((aiuv = b.c.d) == null) {
            aiuv = aiuv.a;
        }
        aiuw aiuw;
        if ((aiuw = aiuv.d) == null) {
            aiuw = aiuw.a;
        }
        a = o;
        if (aiuw.c) {
            if (!"/videoplayback".equals(((bbo)o).a.getPath())) {
                a = new bbo(((bbo)o).a, ((bbo)o).b, ((bbo)o).c, ((bbo)o).d, (Map)ywg.a, ((bbo)o).g, ((bbo)o).h, ((bbo)o).i, ((bbo)o).j, ((bbo)o).k);
            }
            else {
                if (((bbo)o).d != null) {
                    zjp.b(zjo.b, zjn.f, "AbrStateDataSpec: Unexpected http body.");
                }
                Object k = ((bbo)o).k;
                final boolean b2 = k instanceof yhp;
                final byte[] array = null;
                final Long n = null;
                if (!b2) {
                    k = null;
                }
                aiuv aiuv2;
                if ((aiuv2 = b.c.d) == null) {
                    aiuv2 = aiuv.a;
                }
                aiuw aiuw2;
                if ((aiuw2 = aiuv2.d) == null) {
                    aiuw2 = aiuw.a;
                }
                Object a2 = k;
                if (aiuw2.f) {
                    yhp a3;
                    if ((a3 = (yhp)k) == null) {
                        a3 = yhp.a().a();
                    }
                    final yho yho = new yho((yhp)a3);
                    yho.d(true);
                    a2 = yho.a();
                }
                if (ydi.s(ywg.b, (bbo)o, ywg.g)) {
                    ywg.e.p("ppp", "asr");
                    ywg.g = ywg.f;
                }
                aiuv aiuv3;
                if ((aiuv3 = b.c.d) == null) {
                    aiuv3 = aiuv.a;
                }
                aiuw aiuw3;
                if ((aiuw3 = aiuv3.d) == null) {
                    aiuw3 = aiuw.a;
                }
                byte[] byteArray;
                if (aiuw3.e) {
                    byteArray = array;
                }
                else {
                    Long d;
                    Long a4;
                    if (a2 != null) {
                        final yhp yhp = (yhp)a2;
                        d = yhp.d;
                        a4 = yhp.a;
                    }
                    else {
                        a4 = null;
                        d = n;
                    }
                    final agza builder = lpn.a.createBuilder(ywg.d.b());
                    final agyc c = ywg.c.c();
                    if (c != null) {
                        builder.copyOnWrite();
                        final lpn lpn = (lpn)builder.instance;
                        lpn.b |= 0x4;
                        lpn.e = c;
                    }
                    final agza builder2 = lpr.a.createBuilder();
                    final ywh c2 = ywg.c;
                    long longValue;
                    if (d != null) {
                        longValue = d;
                    }
                    else {
                        longValue = -9223372036854775807L;
                    }
                    final lov a5 = c2.a(b, longValue, ywg.f, 0.0f);
                    builder2.copyOnWrite();
                    final lpr lpr = (lpr)builder2.instance;
                    a5.getClass();
                    lpr.c = a5;
                    lpr.b |= 0x1;
                    final lpn f = (lpn)builder.build();
                    builder2.copyOnWrite();
                    final lpr lpr2 = (lpr)builder2.instance;
                    f.getClass();
                    lpr2.f = f;
                    lpr2.b |= 0x8;
                    if ((b.H().b & 0x2) != 0x0) {
                        aiuw aiuw4;
                        if ((aiuw4 = b.H().d) == null) {
                            aiuw4 = aiuw.a;
                        }
                        if ((aiuw4.b & 0x4) != 0x0) {
                            aiuw aiuw5;
                            if ((aiuw5 = b.H().d) == null) {
                                aiuw5 = aiuw.a;
                            }
                            final agyc d2 = aiuw5.d;
                            builder2.copyOnWrite();
                            final lpr lpr3 = (lpr)builder2.instance;
                            d2.getClass();
                            lpr3.b |= 0x2;
                            lpr3.d = d2;
                        }
                    }
                    if (b.ae() && a4 != null && a4 != -9223372036854775807L) {
                        final long longValue2 = a4;
                        builder2.copyOnWrite();
                        final lpr lpr4 = (lpr)builder2.instance;
                        lpr4.b |= 0x4;
                        lpr4.e = longValue2;
                    }
                    byteArray = builder2.build().toByteArray();
                }
                final bbn bbn = new bbn();
                bbn.a = ((bbo)o).a;
                bbn.c = 2;
                bbn.d = byteArray;
                bbn.b = ((bbo)o).b;
                bbn.f = ((bbo)o).g;
                bbn.g = ((bbo)o).h;
                bbn.h = ((bbo)o).i;
                bbn.i = ((bbo)o).j;
                bbn.e = (Map)ywg.a;
                bbn.j = a2;
                a = bbn.a();
            }
        }
        this.c = true;
        return this.a.b((bbo)a);
    }
    
    public final Uri c() {
        Uri c;
        if ((c = this.a.c()) == null) {
            c = null;
        }
        return c;
    }
    
    public final Map d() {
        return this.a.d();
    }
    
    public final void e(final bcn bcn) {
        dk.d((Object)bcn);
        this.a.e(bcn);
    }
    
    public final void f() {
        if (this.c) {
            this.c = false;
            this.a.f();
        }
    }
}
