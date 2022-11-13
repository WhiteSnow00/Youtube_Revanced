import java.util.Iterator;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.nio.ByteBuffer;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawy implements aaxx, abps
{
    public static final aaxw a;
    public final boolean b;
    public final boolean c;
    public final aaxt d;
    public aaxl e;
    public wyw f;
    public String g;
    public aaxu h;
    private final Set i;
    private final asiq j;
    private final atke k;
    private final atke l;
    private final aaxk m;
    private aayf n;
    private aiqj o;
    private aaxw p;
    private boolean q;
    private final adet r;
    private final aujg s;
    
    static {
        a = new aawz((List)afeq.r((Object)xaa.c(22156)), (List)afeq.u((Object)xaa.c(28239), (Object)xaa.c(28240), (Object)xaa.c(123454), (Object)xaa.c(123453)));
    }
    
    public aawy(final adet r, final atke l, final aaxt d, final vai vai, final vai vai2, final atke k, final aaxk m, final aujg s, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.r = r;
        this.l = l;
        this.d = d;
        this.k = k;
        this.m = m;
        this.s = s;
        this.i = new HashSet();
        this.u((wyw)k.a());
        this.p = aawy.a;
        this.b = vai.bs();
        this.c = vai2.bv();
        this.j = new asiq();
    }
    
    private final void A(final wyw f) {
        if (this.f != f) {
            this.z();
            this.f = f;
            this.d.c(f);
        }
    }
    
    private final void B() {
        this.j.b();
    }
    
    private static aezp y(final aiqj aiqj) {
        if (!((ahbc)aiqj).ry((ahaq)WatchEndpointOuterClass.watchEndpoint)) {
            return (aezp)aeyo.a;
        }
        return aezp.k((Object)((apsk)((ahbc)aiqj).rx((ahaq)WatchEndpointOuterClass.watchEndpoint)).d);
    }
    
    private final void z() {
        this.r(false);
    }
    
    @Override
    public final wyw a() {
        return this.f;
    }
    
    final xag b(final aiqj o) {
        Object o2;
        if (!this.q) {
            final aaxw p = this.p;
            final wyw f = this.f;
            final aayf n = this.n;
            ahbb ahbb;
            if (o == null) {
                ahbb = null;
            }
            else {
                ahbb = (ahbb)((ahbh)o).toBuilder();
            }
            aiqj aiqj;
            if (ahbb == null) {
                aiqj = null;
            }
            else if (n == null) {
                aiqj = (aiqj)((ahaz)ahbb).build();
            }
            else {
                final boolean empty = TextUtils.isEmpty((CharSequence)n.a);
                ahaz ahaz;
                if (aawz.a((aiqj)((ahaz)ahbb).build()) == null) {
                    ahaz = ((ahbh)amqg.a).createBuilder();
                }
                else {
                    ahaz = ((ahbh)aawz.a((aiqj)((ahaz)ahbb).build())).toBuilder();
                }
                if (empty ^ true) {
                    final String a = n.a;
                    if (a != null) {
                        ahaz.copyOnWrite();
                        final amqg amqg = (amqg)ahaz.instance;
                        amqg.b |= 0x1;
                        amqg.c = a;
                    }
                    else {
                        ahaz.copyOnWrite();
                        final amqg amqg2 = (amqg)ahaz.instance;
                        amqg2.b &= 0xFFFFFFFE;
                        amqg2.c = amqg.a.c;
                    }
                }
                final int a2 = n.b.a;
                ahaz.copyOnWrite();
                final amqg amqg3 = (amqg)ahaz.instance;
                amqg3.b |= 0x2;
                amqg3.d = a2;
                ahbb.e((ahaq)amqf.b, (Object)ahaz.build());
                aiqj = (aiqj)((ahaz)ahbb).build();
            }
            final InteractionLoggingScreen c = f.c(xaa.b(3832), wzr.a, aiqj, xmm.ae(aiqj, aliu.b), xmm.ae(aiqj, aliu.a));
            final aawz aawz = (aawz)p;
            final afkf d = ((afeq)aawz.a).D();
            while (((Iterator)d).hasNext()) {
                final xab xab = (xab)((Iterator)d).next();
                if (xab != null) {
                    f.l((wzz)new wyt(xab));
                }
            }
            final afkf d2 = ((afeq)aawz.b).D();
            while (((Iterator)d2).hasNext()) {
                f.D((wzz)new wyt((xab)((Iterator)d2).next()));
            }
            this.s(aaxu.b);
            if (c == null) {
                String simpleName;
                if (o == null) {
                    simpleName = "null";
                }
                else {
                    simpleName = o.getClass().getSimpleName();
                }
                final String simpleName2 = this.p.getClass().getSimpleName();
                final StringBuilder sb = new StringBuilder("DefaultWatchInteractionLoggingController: Failed to log new screen when setting video. navigationEndpoint=");
                sb.append(simpleName);
                sb.append(", watchScreenInteractionLoggingBehavior=");
                sb.append(simpleName2);
                zlm.b(zll.b, zlk.y, sb.toString());
                o2 = this.f;
            }
            else {
                final aujg s = this.s;
                final wzc wzc = (wzc)((atke)s.b).a();
                wzc.getClass();
                final aeea aeea = (aeea)((atke)s.c).a();
                aeea.getClass();
                final aeea aeea2 = (aeea)((atke)s.a).a();
                aeea2.getClass();
                o2 = new xad(wzc, aeea, aeea2, c, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
        }
        else {
            o2 = this.f;
        }
        this.o = o;
        this.n = null;
        return (xag)o2;
    }
    
    final xah c(final xag xag, final PlayerResponseModel playerResponseModel, final String s) {
        final aaxt d = this.d;
        final aavc aavc = new aavc(this, 5);
        final aiqj h = this.h();
        d.b = aaxt.a(h);
        final xah d2 = aaxt.d(xag, aavc, new wyt(ByteBuffer.wrap(playerResponseModel.Y()).array()), h);
        if (s != null) {
            aaxt.b((wyw)d.e, (wzz)d.b, s);
        }
        d.c = playerResponseModel.Y();
        return d2;
    }
    
    final xah d(final xag xag, final WatchNextResponseModel watchNextResponseModel, final String s) {
        final aaxt d = this.d;
        final aavc aavc = new aavc(this, 4);
        final aiqj h = this.h();
        d.b = aaxt.a(h);
        final aiqj c = watchNextResponseModel.c;
        xah xah;
        if (c != null && ((ahbc)c).ry((ahaq)OfflineWatchEndpointOuterClass.offlineWatchEndpoint)) {
            xah = aaxt.d(xag, aavc, new wyt(xaa.c(13187)), h);
        }
        else {
            xah = aaxt.d(xag, aavc, new wyt(ByteBuffer.wrap(watchNextResponseModel.d()).array()), h);
        }
        if (s != null) {
            aaxt.b((wyw)d.e, (wzz)d.b, s);
        }
        d.d = watchNextResponseModel.d();
        final vgs h2 = watchNextResponseModel.h;
        if (h2 != null) {
            final zrh zrh = new zrh(xag, 18);
            final Object a = h2.a;
            if (a != null) {
                ((vgp)a).e((aezf)zrh);
            }
            final Object b = h2.b;
            if (b != null) {
                ((vgp)b).e((aezf)zrh);
            }
            final Object c2 = h2.c;
            if (c2 != null) {
                ((vgp)c2).e((aezf)zrh);
            }
            final Object d2 = h2.d;
            if (d2 != null) {
                ((vgp)d2).e((aezf)zrh);
            }
            final Object e = h2.e;
            if (e != null) {
                ((vgp)e).e((aezf)zrh);
            }
            final Object f = h2.f;
            if (f != null) {
                ((vgp)f).e((aezf)zrh);
            }
            final Object g = h2.g;
            if (g != null) {
                ((vgp)g).e((aezf)zrh);
            }
            final Object h3 = h2.h;
            if (h3 != null) {
                ((vgp)h3).e((aezf)zrh);
            }
            final Object i = h2.i;
            if (i != null) {
                ((vgp)i).e((aezf)zrh);
            }
        }
        return xah;
    }
    
    @Override
    public final aaxu f() {
        return this.h;
    }
    
    public final aaye g(final aani aani) {
        if (!this.c) {
            final aaxl e = this.e;
            if (e != null) {
                return e.a(aani);
            }
        }
        return aaye.a;
    }
    
    public final aiqj h() {
        final boolean q = this.q;
        aiqj aiqj = null;
        if (q) {
            final aiqj o = this.o;
            if (o == null) {
                aiqj = aiqj;
            }
            else {
                final ahaz builder = ((ahbh)appm.a).createBuilder();
                final ahab c = o.c;
                builder.copyOnWrite();
                final appm appm = (appm)builder.instance;
                c.getClass();
                appm.b |= 0x1;
                appm.c = c;
                final appm h = (appm)builder.build();
                ahaz ahaz;
                if (((ahbc)o).ry((ahaq)amqf.b)) {
                    ahaz = ((ahbh)((ahbc)o).rx((ahaq)amqf.b)).toBuilder();
                }
                else {
                    ahaz = ((ahbh)amqg.a).createBuilder();
                }
                final ahbb ahbb = (ahbb)((ahbh)o).toBuilder();
                final ahbf b = amqf.b;
                ahaz.copyOnWrite();
                final amqg amqg = (amqg)ahaz.instance;
                h.getClass();
                amqg.h = h;
                amqg.b |= 0x400;
                ahbb.e((ahaq)b, (Object)ahaz.build());
                aiqj = (aiqj)((ahaz)ahbb).build();
            }
        }
        return aiqj;
    }
    
    @Override
    public final void i(final aaxv aaxv) {
        this.i.add(aaxv);
    }
    
    @Override
    public final void j() {
        this.B();
        if (this.e == null) {
            this.e = this.m.a(this);
        }
        this.j.f(this.lX((abpu)this.r.a));
    }
    
    @Override
    public final void k(final wyw f, final aiqj aiqj) {
        if (this.f != f && this.h != aaxu.a) {
            this.f = f;
            this.d.c(f);
            this.q = false;
            this.b(aiqj);
            final aaxt d = this.d;
            final String g = this.g;
            final Object c = d.c;
            if (c != null) {
                ((wyw)d.e).D((wzz)new wyt((byte[])c));
                ((wyw)d.e).q(g);
            }
            final Object d2 = d.d;
            if (d2 != null) {
                ((wyw)d.e).D((wzz)new wyt((byte[])d2));
                ((wyw)d.e).q(g);
            }
        }
    }
    
    final void l(final xag xag) {
        if (this.q) {
            return;
        }
        xag.s();
    }
    
    public final asir[] lX(final abpu abpu) {
        final asir an = ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 512L)).j(aale.q(1)).an(new aauu(this, 5), (asjm)aaof.l);
        asir asir;
        if (((vai)abpu.ci().g).bx()) {
            asir = abpu.Q().an(new aauu(this, 6), (asjm)aaof.l);
        }
        else {
            asir = abpu.P().j(aale.s(abpu.bM(), 512L)).j(aale.q(1)).an(new aauu(this, 6), (asjm)aaof.l);
        }
        return new asir[] { an, asir, abpu.M().j(aale.s(abpu.bM(), 512L)).j(aale.q(1)).an(new aauu(this, 7), (asjm)aaof.l) };
    }
    
    final void m(final aiqj aiqj) {
        final wyw f = this.f;
        if (f == null) {
            return;
        }
        this.n((xag)f, this.o, aiqj);
    }
    
    final void n(final xag xag, final aiqj aiqj, final aiqj aiqj2) {
        if (adkp.ae((Object)aiqj, (Object)aiqj2)) {
            return;
        }
        aiqj g;
        if ((g = aiqj2) == null) {
            final abpq abpq = (abpq)this.l.a();
            g = abkf.g(abpq.s(), abpq.r(), abpq.i(), 0.0f);
        }
        if (!abjr.h(aiqj, g)) {
            this.l(xag);
        }
    }
    
    @Override
    public final void o() {
        final Object e = this.d.e;
        String i;
        if (e != null) {
            i = ((wyw)e).i();
        }
        else {
            i = null;
        }
        this.n = new aayf(i, xaa.c(22156));
    }
    
    @Override
    public final void p() {
        this.B();
        this.z();
        this.i.clear();
        this.A((wyw)this.k.a());
        this.q = false;
    }
    
    @Override
    public final void q(final aaxv aaxv) {
        this.i.remove(aaxv);
    }
    
    public final void r(final boolean b) {
        if (!b) {
            this.o = null;
            this.g = null;
        }
        if (!this.q && this.f != null) {
            final aaxt d = this.d;
            ((Set)d.a).clear();
            d.b = null;
            d.c = null;
            d.d = null;
            this.f.y();
        }
        this.s(aaxu.a);
    }
    
    public final void s(final aaxu h) {
        this.h = h;
        final Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            ((aaxv)iterator.next()).l(h);
        }
    }
    
    @Override
    public final void t(final aaxw p) {
        p.getClass();
        this.p = p;
    }
    
    @Override
    public final void u(final wyw wyw) {
        this.A(wyw);
        this.q = false;
    }
    
    @Override
    public final void v(final wyw wyw) {
        this.A(wyw);
        this.q = true;
    }
    
    final boolean w(final aiqj aiqj) {
        if (this.h != aaxu.a) {
            final aiqj o = this.o;
            if (o != null) {
                if (((ahbh)o).equals((Object)aiqj)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    final boolean x(final aiqj aiqj) {
        final aiqj o = this.o;
        if (o != null) {
            if (aiqj != null) {
                final aezp y = y(o);
                final boolean h = y.h();
                final aezp y2 = y(aiqj);
                if (h && y2.h() && ((String)y.c()).equals(y2.c())) {
                    return true;
                }
            }
        }
        return false;
    }
}
