import java.util.Iterator;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.util.Pair;
import android.os.StatFs;
import android.net.Uri;
import java.util.List;
import android.view.ViewGroup;
import java.util.concurrent.Callable;
import android.os.Handler;
import android.view.View;
import com.google.android.libraries.youtube.innertube.model.player.Vss3ConfigModel;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.ToLongFunction;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import android.net.Uri$Builder;
import java.util.concurrent.ExecutionException;
import java.io.IOException;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import j$.util.Optional;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.SharedPreferences;
import java.util.HashMap;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absv
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    
    public absv(final aajb g, final tkq e, final zkn b, final afci a, final Executor h, final aana f, final wza i, final arzb c, final afci d, final byte[] array, final byte[] array2, final byte[] array3) {
        g.getClass();
        this.g = g;
        e.getClass();
        this.e = e;
        b.getClass();
        this.b = b;
        this.a = a;
        h.getClass();
        this.h = h;
        f.getClass();
        this.f = f;
        this.i = i;
        this.c = c;
        this.d = d;
    }
    
    public absv(final Context a, final afci h, final eg g, final plt f, final afbh d, final pkm e, final Executor i, final pfo b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = new HashMap();
        this.a = a;
        this.h = h;
        this.g = g;
        this.f = f;
        this.d = d;
        this.e = e;
        this.i = i;
        this.b = b;
    }
    
    public absv(final SharedPreferences a, final rjj e, final rjo f, final riw b, final roc h, final uda g, final rmt d, final atnb i, final thg c, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        b.getClass();
        this.b = b;
        h.getClass();
        this.h = h;
        g.getClass();
        this.g = g;
        d.getClass();
        this.d = d;
        i.getClass();
        this.i = i;
        c.getClass();
        this.c = c;
    }
    
    public absv(final atnb a, final atnb b, final atnb c, final atnb d, final atnb e, final atnb f, final atnb g, final atnb h, final atnb i) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.f = f;
        g.getClass();
        this.g = g;
        this.h = h;
        i.getClass();
        this.i = i;
    }
    
    public absv(final atnb b, final atnb d, final atnb h, final atnb c, final atnb f, final atnb e, final atnb a, final atnb i, final atnb g, final byte[] array) {
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        h.getClass();
        this.h = h;
        c.getClass();
        this.c = c;
        f.getClass();
        this.f = f;
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
        i.getClass();
        this.i = i;
        g.getClass();
        this.g = g;
    }
    
    public absv(final atnb h, final atnb d, final atnb b, final atnb g, final atnb f, final atnb a, final atnb e, final atnb c, final atnb i, final byte[] array, final byte[] array2) {
        h.getClass();
        this.h = h;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        g.getClass();
        this.g = g;
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
        i.getClass();
        this.i = i;
    }
    
    public absv(final aup c, final uye e, final vvd f, final Executor h, final tre i, final uyh g, final kht a, final veh b, final byte[] array, final byte[] array2) {
        this.d = new mtf(c.getLifecycle());
        this.c = c;
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = i;
        this.g = g;
        this.a = a;
        this.b = b;
    }
    
    public absv(final oco oco, final zoa e, final atnb a, final atnb d, final atnb b, final abmt f, final atnb c, final atnb h, final atnb i) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.f = f;
        this.d = d;
        this.c = c;
        this.h = h;
        this.i = i;
        this.g = new zkt(new adfx(new adzx(oco), zzj.m, aaku.a, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (Executor)afwd.a, oco);
    }
    
    public absv(final thg b, final oco c, final atnb e, final atnb d, final atnb h, final atnb a, final atnb i, final atnb g, final atnb f) {
        this.b = b;
        this.d = d;
        this.h = h;
        this.e = e;
        this.a = a;
        this.i = i;
        this.g = g;
        this.c = c;
        this.f = f;
    }
    
    public absv(final vbo f, final arzb a, final vbs d, final vbs h, final vbs c, final vbs g, final vbs e, final vbs i, final vbs b, final byte[] array, final byte[] array2) {
        this.f = f;
        this.a = a;
        this.d = d;
        this.h = h;
        this.c = c;
        this.g = g;
        this.e = e;
        this.i = i;
        this.b = b;
    }
    
    public absv(final veh c, final adhd e, final tre b, final thg g, final wza f, final zoa a, final vey i, final askz d, final Executor h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        c.getClass();
        this.c = c;
        e.getClass();
        this.e = e;
        b.getClass();
        this.b = b;
        g.getClass();
        this.g = g;
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        i.getClass();
        this.i = i;
        d.getClass();
        this.d = d;
        this.h = h;
    }
    
    public absv(final zdb g, final zkn h, final tkq f, final tuf i, final yyl b, final tnz e, final afci a, final zff d, final tun c, final byte[] array, final byte[] array2) {
        this.g = g;
        this.h = h;
        this.f = f;
        this.i = i;
        this.b = b;
        this.e = e;
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    public absv(final zeo i, final xye c, final arna a, final wza g, final SharedPreferences e, final afxk b, final oco f) {
        this.i = i;
        this.d = new CopyOnWriteArrayList();
        this.c = c;
        this.a = a;
        this.g = g;
        this.e = e;
        this.b = b;
        this.f = f;
        this.h = new AtomicBoolean();
    }
    
    public static angm A(final vbo vbo) {
        if (vbo != null && vbo.b() != null) {
            angm angm;
            if ((angm = vbo.b().t) == null) {
                angm = angm.a;
            }
            return angm;
        }
        return null;
    }
    
    public static boolean B(final vbo vbo) {
        final angm a = A(vbo);
        return a != null && a.k;
    }
    
    public static boolean C(final vbo vbo) {
        final angm a = A(vbo);
        return a != null && a.l;
    }
    
    public static boolean D(final vbo vbo) {
        if (vbo != null && vbo.b() != null) {
            angm angm;
            if ((angm = vbo.b().t) == null) {
                angm = angm.a;
            }
            return angm.b;
        }
        return false;
    }
    
    public static boolean E(final vbo vbo) {
        if (vbo != null && vbo.b() != null) {
            angm angm;
            if ((angm = vbo.b().t) == null) {
                angm = angm.a;
            }
            return angm.d;
        }
        return false;
    }
    
    public static boolean F(final vbo vbo) {
        if (vbo != null && vbo.b() != null) {
            angm angm;
            if ((angm = vbo.b().t) == null) {
                angm = angm.a;
            }
            return angm.c;
        }
        return false;
    }
    
    public static boolean G(final vbo vbo) {
        final angm a = A(vbo);
        return a != null && a.e;
    }
    
    public static void K(final Throwable t) {
        znh.c(zng.b, znf.B, "Some error occurred when evicting player response", t);
    }
    
    public static void L(final Throwable t) {
        znh.c(zng.b, znf.B, "Some error occurred when putting a player response into cache", t);
    }
    
    public static boolean M(final int n) {
        return n == aakx.a(amze.e, -1);
    }
    
    public static final boolean N(final PlayerResponseModel playerResponseModel) {
        final akyz y = playerResponseModel.y();
        return y != null && aamr.q(y);
    }
    
    public static final String O(final PlayerResponseModel playerResponseModel) {
        final akyz y = playerResponseModel.y();
        if (y != null && !y.d.isEmpty()) {
            return y.d;
        }
        return null;
    }
    
    public static final byte[] P(final PlayerResponseModel playerResponseModel) {
        return playerResponseModel.Y();
    }
    
    public static final boolean Q(final PlayerResponseModel playerResponseModel) {
        final amxq b = playerResponseModel.B();
        if (b != null) {
            final int cg = aqvq.cG(b.h);
            if (cg != 0) {
                if (cg == 2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static final boolean R(final PlayerResponseModel playerResponseModel) {
        final akyz y = playerResponseModel.y();
        return y != null && aamr.o(y);
    }
    
    public static int X(final arzb arzb) {
        final anhj ac = ac(arzb);
        if (ac == null) {
            return 0;
        }
        anjk anjk;
        if ((anjk = ac.q) == null) {
            anjk = anjk.a;
        }
        return anjk.b;
    }
    
    public static long Y(final arzb arzb, final long n) {
        final int d = ac(arzb).d;
        if (d == 0) {
            return n;
        }
        return d;
    }
    
    public static long Z(final arzb arzb) {
        final int b = aa(arzb).b;
        if (b <= 0) {
            return -1L;
        }
        return b;
    }
    
    public static ahvc aa(final arzb arzb) {
        ahvc ahvc;
        if ((ahvc = ac(arzb).c) == null) {
            ahvc = ahvc.a;
        }
        return ahvc;
    }
    
    public static amib ab(final arzb arzb) {
        amib amib;
        if (arzb != null && arzb.f() != null) {
            if ((amib = arzb.f().i) == null) {
                amib = amib.a;
            }
        }
        else {
            amib = amib.a;
        }
        return amib;
    }
    
    public static anhj ac(final arzb arzb) {
        anhj anhj;
        if (arzb != null && arzb.f() != null) {
            if ((anhj = arzb.f().j) == null) {
                anhj = anhj.a;
            }
        }
        else {
            anhj = anhj.a;
        }
        return anhj;
    }
    
    public static boolean ad(final arzb arzb, final boolean b, final boolean b2) {
        ahsn ahsn;
        if (arzb.f() != null) {
            if ((ahsn = arzb.f().o) == null) {
                ahsn = ahsn.a;
            }
        }
        else {
            ahsn = ahsn.a;
        }
        if (b2) {
            return ahsn.J;
        }
        return (ahsn != null && ahsn.j) || b;
    }
    
    public static boolean ae(final arzb arzb) {
        final anhj ac = ac(arzb);
        return ac != null && ac.D;
    }
    
    public static boolean af(final arzb arzb) {
        final amib ab = ab(arzb);
        if (ab != null) {
            amic amic;
            if ((amic = ab.j) == null) {
                amic = amic.a;
            }
            if (amic.c) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean ag(final arzb arzb) {
        final anhj ac = ac(arzb);
        return ac != null && ac.z;
    }
    
    public static boolean ah(final arzb arzb) {
        return ac(arzb).g;
    }
    
    public static boolean ai(final arzb arzb) {
        final anhj ac = ac(arzb);
        return ac != null && ac.v;
    }
    
    public static boolean aj(final arzb arzb) {
        final anhj ac = ac(arzb);
        return ac != null && ac.t;
    }
    
    public static boolean ak(final arzb arzb) {
        final anhj ac = ac(arzb);
        return ac != null && ac.u;
    }
    
    public static boolean al(final arzb arzb) {
        return ac(arzb).y;
    }
    
    public static boolean am(final arzb arzb) {
        final anhj ac = ac(arzb);
        return ac != null && ac.N;
    }
    
    public static boolean an(final arzb arzb) {
        return ac(arzb).l;
    }
    
    public static boolean ao(final arzb arzb) {
        amzq amzq;
        if ((amzq = ab(arzb).d) == null) {
            amzq = amzq.a;
        }
        return amzq.u;
    }
    
    public static boolean ap(final arzb arzb) {
        return ac(arzb).p;
    }
    
    public static Optional ar(final aisc aisc) {
        if (!((ahcu)aisc).ry((ahci)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
            return Optional.empty();
        }
        final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)((ahcu)aisc).rx((ahci)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
        if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 0x4) != 0x0) {
            return Optional.of((Object)showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint);
        }
        return Optional.empty();
    }
    
    public static final void at(final uwd uwd, final boolean b) {
        if (!(uwd instanceof uvl)) {
            return;
        }
        if (b) {
            ((uvl)uwd).c().c();
            return;
        }
        ((uvl)uwd).c().a();
    }
    
    public final abdv H(final Context context, final abdt abdt, final abqz abqz) {
        final afbh k = afbh.k(this.e);
        final Object g = this.g;
        final Object h = this.h;
        final Object f = this.f;
        return new abdv(abdt, context, k, (zdb)g, (zkn)h, (tkq)f, (tuf)this.i, (zff)this.d, (afci)this.a, (afci)this.b, (tre)new tqu(context, (tkq)f, (vbs)null), abqz, (tun)this.c, (byte[])null);
    }
    
    public final FormatStreamModel I(final FormatStreamModel formatStreamModel) {
        if (formatStreamModel.j() > 0L && formatStreamModel.e() != 22) {
            return formatStreamModel;
        }
        final tdh b = tdh.b();
        ((zqb)((atnb)this.h).a()).c((Object)formatStreamModel.d, (tdg)b);
        try {
            final long longValue = (long)((afwo)b).get();
            final ahct ahct = (ahct)((ahcz)formatStreamModel.a).toBuilder();
            final Uri$Builder buildUpon = formatStreamModel.d.buildUpon();
            final String b2 = formatStreamModel.b;
            final long c = formatStreamModel.c;
            ((ahcr)ahct).copyOnWrite();
            final ajwl ajwl = (ajwl)ahct.instance;
            ajwl.c |= 0x800;
            ajwl.p = longValue;
            return wbe.N(buildUpon, b2, c, ahct);
        }
        catch (final ExecutionException ex) {
            throw new IOException("fetchContentLengthIfNecessary failed", ex);
        }
    }
    
    public final void J(final String s) {
        final Object g = this.g;
        final zak zak = new zak(this, s, 2, (byte[])null, (byte[])null);
        final zkt zkt = (zkt)g;
        tfx.j(afxr.q((afvp)new adfs(zkt, (afbk)zak, 3, (byte[])null, (byte[])null, (byte[])null), (Executor)zkt.c), (Executor)afwd.a, (tfv)zvv.i);
    }
    
    public final FormatStreamModel S(final int n, final int n2, final int n3, final VideoStreamingData videoStreamingData, final boolean b, final PlayerConfigModel playerConfigModel) {
        if (M(n) && !b) {
            return null;
        }
        int min = n2;
        if (videoStreamingData.x) {
            min = n2;
            if (!((yqu)((atnb)this.i).a()).e(videoStreamingData.d)) {
                min = Math.min(n2, 480);
            }
        }
        final adgg adgg = (adgg)((atnb)this.c).a();
        final yhs yhs = new yhs(new yhw(n, n), adgg.U(n3), true, (String)null);
        FormatStreamModel formatStreamModel = null;
        Label_0260: {
            Label_0257: {
                try {
                    final yht b2 = ((yhr)((atnb)adgg.a).a()).b(videoStreamingData.h(), playerConfigModel, b, yhs, min);
                    final FormatStreamModel[] e = b2.e();
                    FormatStreamModel[] c;
                    if (b) {
                        c = b2.c;
                    }
                    else {
                        c = e;
                    }
                    if (c.length > 0) {
                        formatStreamModel = c[0];
                        break Label_0260;
                    }
                    final ango c2 = playerConfigModel.c;
                    if ((c2.b & 0x2000) != 0x0) {
                        ahuk ahuk;
                        if ((ahuk = c2.j) == null) {
                            ahuk = ahuk.a;
                        }
                        if (ahuk.l) {
                            break Label_0257;
                        }
                    }
                    if (b && e.length > 0 && e[0].M()) {
                        formatStreamModel = e[0];
                        break Label_0260;
                    }
                }
                catch (final yhv yhv) {}
            }
            formatStreamModel = null;
        }
        Label_0276: {
            if (formatStreamModel == null) {
                break Label_0276;
            }
            try {
                return this.I(formatStreamModel);
                return null;
            }
            catch (final IOException ex) {
                return null;
            }
        }
    }
    
    public final PlayerResponseModel T(final String b, int ae, final byte[] array) {
        tcl.k();
        final String d = ((zoa)this.e).c().d();
        Object o;
        if (array != null) {
            o = array;
        }
        else {
            o = new byte[0];
        }
        final aakv aakv = new aakv(d, b, ae, (byte[])o);
        final int n = 2;
        final Throwable t = null;
        Label_0276: {
            try {
                o = this.g;
                final adfz adfz = (adfz)((abo)((zkt)o).d).c((Object)aakv);
                if (adfz == null) {
                    o = null;
                }
                else {
                    final long b2 = adfz.b;
                    if (b2 == 0L) {
                        o = adfw.a(adfz.a, 2);
                    }
                    else {
                        final Object a = adfz.a;
                        int n2;
                        if (b2 > ((oco)((zkt)o).a).d()) {
                            n2 = 2;
                        }
                        else {
                            n2 = 4;
                        }
                        o = adfw.a(a, n2);
                    }
                }
                if (o != null) {
                    o = afxr.l(afbh.k(o));
                }
                else {
                    o = afxr.l(afag.a);
                }
                final afbh afbh = (afbh)((afxe)o).b;
                o = t;
                if (!afbh.h()) {
                    break Label_0276;
                }
                o = t;
                if (((adfw)afbh.c()).b != 4) {
                    o = ((adfw)afbh.c()).a;
                }
                break Label_0276;
            }
            catch (final ExecutionException o) {}
            catch (final InterruptedException ex) {}
            znh.c(zng.b, znf.B, "Some error occurred when reading from the cache player response", (Throwable)o);
            o = t;
        }
        if (o != null) {
            return (PlayerResponseModel)o;
        }
        final abms abms = (abms)((atnb)this.a).a();
        final abno d2 = ((abnm)((atnb)this.d).a()).d();
        d2.y = true;
        d2.b = b;
        if (array != null) {
            ((vls)d2).k(array);
        }
        else {
            ((vls)d2).i();
        }
        final int n3 = ae - 1;
        ae = n;
        if (n3 != 1) {
            if (n3 != 2) {
                ae = 1;
            }
            else {
                ae = 3;
            }
        }
        if (ae != 1) {
            d2.ae = ae;
        }
        ((abos)((atnb)this.b).a()).sG(d2);
        ((abnl)this.f).sG(d2);
        final PlayerResponseModel a2 = abms.a(d2);
        final Object g = this.g;
        ListenableFuture listenableFuture;
        if (a2 == null) {
            listenableFuture = afxr.k(new IllegalArgumentException("value cannot be null."));
        }
        else {
            final zkt zkt = (zkt)g;
            listenableFuture = afxr.q((afvp)new jmi(zkt, (Object)aakv, (Object)a2, 10, (byte[])null, (byte[])null, (byte[])null), (Executor)zkt.c);
        }
        tfx.j(listenableFuture, (Executor)afwd.a, (tfv)zvv.h);
        return a2;
    }
    
    public final void U(final String ex, final aakv aakv) {
        final ArrayList list = new ArrayList();
        if (aakv.a.equals(ex)) {
            ((abo)((zkt)this.g).d).i((Object)aakv);
            list.add(afxr.l(null));
        }
        try {
            afxr.L(list).j(afxr.x(), (Executor)afwd.a).get(1L, TimeUnit.SECONDS);
            return;
        }
        catch (final TimeoutException ex) {}
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex2) {}
        znh.c(zng.b, znf.B, "Some error occurred when evicting player response", (Throwable)ex);
    }
    
    public final long V() {
        return Collection$_EL.stream((Collection)this.d).mapToLong((ToLongFunction)ikc.f).sum();
    }
    
    public final yao W() {
        if (((zcx)this.i).aV()) {
            if (((zcx)this.i).h.f(45369959L)) {
                throw new IllegalStateException("Unsupported!");
            }
            if (!((List)this.d).isEmpty()) {
                final int size = ((List)this.d).size();
                boolean b = true;
                if (size != 1) {
                    b = false;
                }
                zfa.d(b);
                return ((List<yao>)this.d).get(0);
            }
        }
        return null;
    }
    
    public final absu a(final String s, final int n, final PlayerResponseModel playerResponseModel) {
        final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)((atnb)this.a).a();
        scheduledExecutorService.getClass();
        final tkq tkq = (tkq)((atnb)this.b).a();
        tkq.getClass();
        final wza wza = (wza)((atnb)this.c).a();
        wza.getClass();
        final twn twn = (twn)((atnb)this.d).a();
        twn.getClass();
        final oco oco = (oco)((atnb)this.e).a();
        oco.getClass();
        final abls abls = (abls)((atnb)this.f).a();
        abls.getClass();
        final abkq abkq = (abkq)((atnb)this.g).a();
        abkq.getClass();
        final apup apup = (apup)((atnb)this.h).a();
        final absv absv = (absv)((atnb)this.i).a();
        absv.getClass();
        s.getClass();
        playerResponseModel.getClass();
        final String k = playerResponseModel.K();
        final long millis = TimeUnit.SECONDS.toMillis(playerResponseModel.h());
        Optional optional;
        if (playerResponseModel.V()) {
            optional = Collection$_EL.stream((Collection)playerResponseModel.n().o).filter((Predicate)xas.r).filter((Predicate)xas.s).findFirst().map((Function)zzl.n);
        }
        else {
            optional = Optional.empty();
        }
        final int b = twn.b;
        boolean b2 = false;
        Label_0338: {
            if (absu.j(n)) {
                final PlayerConfigModel m = playerResponseModel.m();
                if (abkq.s == 2 || (m != null && (m.ax() || (m.az() && abkq.s == 1)))) {
                    b2 = true;
                    break Label_0338;
                }
            }
            b2 = false;
        }
        final boolean b3 = absu.j(n) && abls.l();
        final boolean t = playerResponseModel.T();
        final ablk r = abkq.r;
        final aaoe c = abkq.c();
        final Vss3ConfigModel i = playerResponseModel.o().k;
        final long d = oco.d();
        final ahcr builder = apvo.a.createBuilder();
        final ahcr builder2 = apvp.a.createBuilder();
        builder2.copyOnWrite();
        final apvp apvp = (apvp)builder2.instance;
        apvp.b |= 0x4;
        apvp.e = -1.0f;
        final apvp a = apvp.a;
        final boolean b4 = playerResponseModel.r().e() == 2L;
        final apvn j = apvn.j;
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)((vbs)absv.b).l(45375646L).aH(new abkh(atomicBoolean, 11)));
        return new absu(scheduledExecutorService, tkq, wza, twn, oco, apup, s, k, 1.0f, millis, "-", optional, b, -1L, b2, b3, t, r, c, i, false, d, builder, builder2, a, -1L, b4, false, j, atomicBoolean.get());
    }
    
    public final wgc aq(final View view, xab xab) {
        final Context context = (Context)((atnb)this.b).a();
        context.getClass();
        final acrd acrd = (acrd)((atnb)this.d).a();
        acrd.getClass();
        final wde wde = (wde)((atnb)this.h).a();
        wde.getClass();
        final veh veh = (veh)((atnb)this.c).a();
        veh.getClass();
        final aefs aefs = (aefs)((atnb)this.f).a();
        aefs.getClass();
        final acdr acdr = (acdr)((atnb)this.e).a();
        acdr.getClass();
        final Handler handler = (Handler)((atnb)this.a).a();
        handler.getClass();
        final xab xab2 = (xab)((atnb)this.i).a();
        xab2.getClass();
        final vbs vbs = (vbs)((atnb)this.g).a();
        vbs.getClass();
        view.getClass();
        xab.getClass();
        if (!(boolean)vbs.l(45377737L).aM()) {
            xab = xab2;
        }
        return new wgc(context, acrd, wde, veh, acdr, aefs, xab, handler, view, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void as(final aisc aisc) {
        if (ar(aisc).isEmpty()) {
            return;
        }
        ((mtf)this.d).w((Callable)new ost(this, askp.n(((uye)this.e).b(), askp.X(aisc), (asme)lgs.j).Z((asmn)twx.k).aC(Optional.empty()), 19, (byte[])null, (byte[])null));
    }
    
    public final tyy au(final tzg tzg, final uae uae, final atnb atnb, final ViewGroup viewGroup, final View view, final tzr tzr, final tzp tzp, final int n) {
        final Executor executor = (Executor)((atnb)this.h).a();
        executor.getClass();
        final aapu aapu = (aapu)((atnb)this.d).a();
        aapu.getClass();
        final ubc ubc = (ubc)((atnb)this.b).a();
        final tzv tzv = (tzv)((atnb)this.g).a();
        tzv.getClass();
        final aefs aefs = (aefs)((atnb)this.f).a();
        final zkt zkt = (zkt)((atnb)this.a).a();
        final zkt zkt2 = (zkt)((atnb)this.e).a();
        final Context context = (Context)((atnb)this.c).a();
        final aefs aefs2 = (aefs)((atnb)this.i).a();
        aefs2.getClass();
        tzg.getClass();
        uae.getClass();
        atnb.getClass();
        view.getClass();
        tzr.getClass();
        tzp.getClass();
        return new tyy(executor, aapu, ubc, tzv, aefs, zkt, zkt2, context, aefs2, tzg, uae, atnb, viewGroup, view, tzr, tzp, n, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void av(final akkz akkz, final int n, final Runnable runnable, final Runnable runnable2) {
        if ((akkz.b & 0x8) != 0x0) {
            akky akky;
            if ((akky = akkz.f) == null) {
                akky = akky.a;
            }
            ajws ajws;
            if ((ajws = akky.c) == null) {
                ajws = ajws.a;
            }
            ((tre)this.b).d(acbu.b(ajws).toString());
            if (runnable2 != null) {
                runnable2.run();
            }
            return;
        }
        if (akkz.g.size() > 0) {
            ((veh)this.c).b((List)akkz.g);
        }
        final ahcr builder = aqcg.a.createBuilder();
        builder.copyOnWrite();
        final aqcg aqcg = (aqcg)builder.instance;
        aqcg.c = n - 1;
        aqcg.b |= 0x1;
        final aqcg aqcg2 = (aqcg)builder.build();
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.al((akpu)d.instance, aqcg2);
        ((wza)this.f).d((akpu)((ahcr)d).build());
        runnable.run();
        ((thg)this.g).d((Object)new rhu(true));
    }
    
    public final ListenableFuture aw(final pge c, int h, final long d, String e, final Uri uri, String iterator, int j, final pfx pfx, final pkg pkg, final int n, final List list) {
        if (!((HashMap)this.c).containsKey(uri)) {
            ListenableFuture listenableFuture = null;
            Label_0959: {
                if (iterator.startsWith("http")) {
                    ((pfo)this.b).l();
                    if (!iterator.startsWith("https")) {
                        pkl.d("%s: File url = %s is not secure", (Object)"MddFileDownloader", (Object)iterator);
                        final asdz a = pfm.a();
                        a.a = pfl.s;
                        listenableFuture = afxr.k((Throwable)a.u());
                        break Label_0959;
                    }
                }
                long ae;
                try {
                    ae = ((eg)this.g).ae(uri);
                }
                catch (final IOException ex) {
                    ae = 0L;
                }
                try {
                    final Object a2 = this.a;
                    final long n2 = j - ae;
                    final Object b = this.b;
                    ((pfo)b).h();
                    Label_0926: {
                        if (!qep.Z(iterator, afhk.s("inlinefile")) || n2 != 0L) {
                            final StatFs statFs = new StatFs(((Context)a2).getFilesDir().getAbsolutePath());
                            final long n3 = statFs.getBlockCount();
                            final long n4 = statFs.getBlockSize();
                            final long n5 = statFs.getAvailableBlocks();
                            final long n6 = statFs.getBlockSize();
                            final float n7 = (float)(n3 * n4);
                            ((pfo)b).i();
                            final float n8 = n7 * 0.1f;
                            ((pfo)b).c();
                            double n9 = Math.min(n8, 5.24288E8f);
                            Label_0353: {
                                if (pfx != null) {
                                    if ((j = ptv.j(pfx.c)) == 0) {
                                        j = 1;
                                    }
                                    float n10;
                                    if (--j != 1) {
                                        if (j != 2) {
                                            n9 = n9;
                                            break Label_0353;
                                        }
                                        ((pfo)b).i();
                                        ((pfo)b).d();
                                        n10 = Math.min(n8, 2097152.0f);
                                    }
                                    else {
                                        ((pfo)b).i();
                                        n10 = Math.min(n8, (float)((pfo)b).a());
                                    }
                                    n9 = n10;
                                }
                            }
                            if (n5 * n6 - n2 <= n9) {
                                break Label_0926;
                            }
                        }
                        ((pfo)this.b).u();
                        final Object f = this.f;
                        final Object e2 = this.e;
                        final ahcr builder = ((ahcz)pfz.a).createBuilder();
                        builder.copyOnWrite();
                        final pfz pfz = (pfz)builder.instance;
                        c.getClass();
                        pfz.c = c;
                        pfz.b |= 0x1;
                        builder.copyOnWrite();
                        final pfz pfz2 = (pfz)builder.instance;
                        pfz2.b |= 0x2;
                        pfz2.d = d;
                        builder.copyOnWrite();
                        final pfz pfz3 = (pfz)builder.instance;
                        e.getClass();
                        pfz3.b |= 0x4;
                        pfz3.e = e;
                        builder.copyOnWrite();
                        final pfz pfz4 = (pfz)builder.instance;
                        pfz4.b |= 0x8;
                        pfz4.f = h;
                        final pfz pfz5 = (pfz)builder.build();
                        e = (String)((plt)f).c;
                        synchronized (e) {
                            if (!((plt)f).d.containsKey(pfz5)) {
                                final HashMap d2 = ((plt)f).d;
                                final pls pls = new pls(((plt)f).b, (pkm)e2, pfz5);
                                final pha a3 = ((plt)f).a;
                                d2.put(pfz5, new qpr((qpq)pls, (qpp)new plq(), 10L, TimeUnit.SECONDS));
                            }
                            ((plt)f).e.put(uri, ((plt)f).d.get(pfz5));
                            monitorexit(e);
                            if (((afbh)this.d).h()) {
                                e = (String)((afbh)this.d).c();
                                final String c2 = c.c;
                                synchronized (plp.class) {
                                    ((plp)e).b.put(uri, c2);
                                }
                            }
                            final phf a4 = phg.a();
                            a4.d(uri);
                            a4.f(iterator);
                            Label_0818: {
                                if (pfx != null) {
                                    h = psq.H(pfx.d);
                                    if (h != 0) {
                                        if (h == 2) {
                                            a4.b(phe.c);
                                            break Label_0818;
                                        }
                                    }
                                }
                                a4.b(phe.b);
                            }
                            if (n > 0) {
                                a4.e(n);
                            }
                            e = (String)afgh.d();
                            iterator = (String)list.iterator();
                            while (((Iterator)iterator).hasNext()) {
                                final pfy pfy = ((Iterator<pfy>)iterator).next();
                                ((afgc)e).h(Pair.create((Object)pfy.b, (Object)pfy.c));
                            }
                            a4.c(((afgc)e).g());
                            ((phh)((afci)this.h).a()).a(a4.a());
                            break Label_0959;
                        }
                    }
                    final asdz a5 = pfm.a();
                    a5.a = pfl.t;
                    throw a5.u();
                }
                catch (final pfm pfm) {
                    pkl.d("%s: Not enough space to download file %s", (Object)"MddFileDownloader", (Object)iterator);
                    listenableFuture = afxr.k((Throwable)pfm);
                }
            }
            final plv c3 = plv.d(listenableFuture).f((afvq)new piz(pkg, uri, 8), (Executor)this.i).c((Class)pfm.class, (afvq)new piz(this, pkg, 9, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (Executor)this.i);
            ((HashMap)this.c).put(uri, c3);
            ((afwo)c3).addListener((Runnable)new ogp(this, uri, 9, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (Executor)this.i);
            return (ListenableFuture)c3;
        }
        return ((HashMap)this.c).get(uri);
    }
    
    public final void ax(final Uri uri) {
        final ListenableFuture listenableFuture = ((HashMap)this.c).get(uri);
        if (listenableFuture != null) {
            final int a = pkl.a;
            ((HashMap)this.c).remove(uri);
            listenableFuture.cancel(true);
            return;
        }
        pkl.g("%s: stopDownloading on non-existent download", (Object)"MddFileDownloader");
    }
    
    public final absm b(List list, List list2, final String s) {
        final Object g = this.g;
        final Object e = this.e;
        final Object b = this.b;
        final Object a = this.a;
        if (list == null) {
            list = new ArrayList();
        }
        if (list2 == null) {
            list2 = new ArrayList();
        }
        return new absm((aajb)g, (tkq)e, (zkn)b, (afci)a, list, list2, s, (Executor)this.h, (aana)this.f, (wza)this.i, (arzb)this.c, (afci)this.d, null, null, null);
    }
    
    public final boolean c() {
        final angm a = A((vbo)this.f);
        return a != null && a.o;
    }
    
    public final boolean d() {
        return ((vbs)this.i).A();
    }
    
    public final boolean e() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)((vbs)this.g).l(45384862L).aH(new abkh(atomicBoolean, 11)));
        return atomicBoolean.get();
    }
    
    public final boolean f() {
        return ((vbs)this.c).f(45361125L);
    }
    
    public final boolean g() {
        return ac((arzb)this.a).L || ((vbs)this.h).f(45358588L);
    }
    
    public final boolean h() {
        return ((vbs)this.e).aC();
    }
    
    public final boolean i() {
        return ac((arzb)this.a).F;
    }
    
    public final boolean j() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)((vbs)this.c).l(45377654L).aH(new abkh(atomicBoolean, 11)));
        return atomicBoolean.get();
    }
    
    public final boolean k() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)((vbs)this.g).l(45368753L).aH(new abkh(atomicBoolean, 11)));
        return atomicBoolean.get();
    }
    
    public final boolean l() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)((vbs)this.c).l(45375607L).aH(new abkh(atomicBoolean, 11)));
        return atomicBoolean.get();
    }
    
    public final boolean m(final PlaybackStartDescriptor playbackStartDescriptor) {
        if (!playbackStartDescriptor.v()) {
            return false;
        }
        if (TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            asmr.b((AtomicReference)((vbs)this.c).l(45380134L).aH(new abkh(atomicBoolean, 11)));
            return atomicBoolean.get();
        }
        return ac((arzb)this.a).O;
    }
    
    public final boolean n() {
        return ac((arzb)this.a).Q;
    }
    
    public final boolean o() {
        return ((vbs)this.e).f(45376611L);
    }
    
    public final boolean p() {
        return ((vbs)this.g).f(45360803L);
    }
    
    public final boolean q() {
        return ac((arzb)this.a).J;
    }
    
    public final boolean r() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)((vbs)this.g).l(45371561L).aH(new abkh(atomicBoolean, 11)));
        return atomicBoolean.get();
    }
    
    public final boolean s() {
        return ac((arzb)this.a).P;
    }
    
    public final boolean t() {
        final angm a = A((vbo)this.f);
        return a != null && a.p;
    }
    
    public final boolean u() {
        final angm a = A((vbo)this.f);
        return a != null && a.n;
    }
    
    public final boolean v() {
        return ((vbs)this.c).f(45370174L);
    }
    
    public final boolean w() {
        final angm a = A((vbo)this.f);
        return a != null && a.q;
    }
    
    public final boolean x() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)((vbs)this.g).l(45366433L).aH(new abkh(atomicBoolean, 11)));
        return atomicBoolean.get();
    }
    
    public final boolean y() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)((vbs)this.e).l(45379969L).aH(new abkh(atomicBoolean, 11)));
        return atomicBoolean.get();
    }
    
    public final boolean z() {
        return ((vbs)this.g).f(45360907L);
    }
}
