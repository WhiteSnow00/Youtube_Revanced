import java.util.Iterator;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.util.Pair;
import android.os.StatFs;
import android.net.Uri;
import java.util.List;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.innertube.model.player.Vss3ConfigModel;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Callable;
import android.os.Handler;
import android.view.View;
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

public final class abrj
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
    
    public abrj(final aahc g, final tjm e, final zis b, final afaq a, final Executor h, final aale f, final wxx i, final arwh c, final afaq d, final byte[] array, final byte[] array2, final byte[] array3) {
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
    
    public abrj(final Context a, final afaq h, final eg g, final pla f, final aezp d, final pjt e, final Executor i, final pex b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
    
    public abrj(final SharedPreferences a, final ril e, final riq f, final rhx b, final rna h, final ubu g, final rlt d, final atke i, final tgd c, final byte[] array, final byte[] array2) {
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
    
    public abrj(final atke a, final atke b, final atke c, final atke d, final atke e, final atke f, final atke g, final atke h, final atke i) {
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
    
    public abrj(final atke b, final atke d, final atke h, final atke c, final atke f, final atke e, final atke a, final atke i, final atke g, final byte[] array) {
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
    
    public abrj(final atke h, final atke d, final atke b, final atke g, final atke f, final atke a, final atke e, final atke c, final atke i, final byte[] array, final byte[] array2) {
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
    
    public abrj(final atke h, final blu blu, final abij b, final jki g, final asid d, final asid a, final abpq c, final abpu i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.h = h;
        this.b = b;
        this.g = g;
        this.d = d;
        this.a = a;
        this.c = c;
        this.i = i;
        this.e = afdh.b(3);
        this.f = blu.a;
    }
    
    public abrj(final aun c, final uwx e, final vtu f, final Executor h, final tqd i, final uxa g, final kzr a, final vcy b, final byte[] array) {
        this.d = new msr(c.getLifecycle());
        this.c = c;
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = i;
        this.g = g;
        this.a = a;
        this.b = b;
    }
    
    public abrj(final oby oby, final zmf e, final atke a, final atke d, final atke b, final ablm f, final atke c, final atke h, final atke i) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.f = f;
        this.d = d;
        this.c = c;
        this.h = h;
        this.i = i;
        this.g = new ziy(new adek(new xra(oby), zxl.n, aaiw.a, null, null, null), (Executor)afum.a, oby);
    }
    
    public abrj(final tgd b, final oby c, final atke e, final atke d, final atke h, final atke a, final atke i, final atke g, final atke f) {
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
    
    public abrj(final vaf f, final arwh a, final vai d, final vai h, final vai c, final vai g, final vai e, final vai i, final vai b, final byte[] array, final byte[] array2) {
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
    
    public abrj(final vcy c, final adfq e, final tqd b, final tgd g, final wxx f, final zmf a, final vdr i, final asid d, final Executor h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
    
    public abrj(final zbh g, final zis h, final tjm f, final ttd i, final yuk b, final tmx e, final afaq a, final zdk d, final ttl c, final byte[] array, final byte[] array2) {
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
    
    public abrj(final zct i, final xwf c, final arkg a, final wxx g, final SharedPreferences e, final afvt b, final oby f) {
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
    
    public static anef A(final vaf vaf) {
        if (vaf != null && vaf.b() != null) {
            anef anef;
            if ((anef = vaf.b().t) == null) {
                anef = anef.a;
            }
            return anef;
        }
        return null;
    }
    
    public static boolean B(final vaf vaf) {
        final anef a = A(vaf);
        return a != null && a.k;
    }
    
    public static boolean C(final vaf vaf) {
        final anef a = A(vaf);
        return a != null && a.l;
    }
    
    public static boolean D(final vaf vaf) {
        if (vaf != null && vaf.b() != null) {
            anef anef;
            if ((anef = vaf.b().t) == null) {
                anef = anef.a;
            }
            return anef.b;
        }
        return false;
    }
    
    public static boolean E(final vaf vaf) {
        if (vaf != null && vaf.b() != null) {
            anef anef;
            if ((anef = vaf.b().t) == null) {
                anef = anef.a;
            }
            return anef.d;
        }
        return false;
    }
    
    public static boolean F(final vaf vaf) {
        if (vaf != null && vaf.b() != null) {
            anef anef;
            if ((anef = vaf.b().t) == null) {
                anef = anef.a;
            }
            return anef.c;
        }
        return false;
    }
    
    public static boolean G(final vaf vaf) {
        final anef a = A(vaf);
        return a != null && a.e;
    }
    
    public static void K(final Throwable t) {
        zlm.c(zll.b, zlk.B, "Some error occurred when evicting player response", t);
    }
    
    public static void L(final Throwable t) {
        zlm.c(zll.b, zlk.B, "Some error occurred when putting a player response into cache", t);
    }
    
    public static boolean M(final int n) {
        return n == aaiz.a(amwz.e, -1);
    }
    
    public static final boolean N(final PlayerResponseModel playerResponseModel) {
        final akwz y = playerResponseModel.y();
        return y != null && aakv.q(y);
    }
    
    public static final String O(final PlayerResponseModel playerResponseModel) {
        final akwz y = playerResponseModel.y();
        if (y != null && !y.d.isEmpty()) {
            return y.d;
        }
        return null;
    }
    
    public static final byte[] P(final PlayerResponseModel playerResponseModel) {
        return playerResponseModel.Y();
    }
    
    public static final boolean Q(final PlayerResponseModel playerResponseModel) {
        final amvl b = playerResponseModel.B();
        if (b != null) {
            final int co = aqsx.cO(b.h);
            if (co != 0) {
                if (co == 2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static final boolean R(final PlayerResponseModel playerResponseModel) {
        final akwz y = playerResponseModel.y();
        return y != null && aakv.o(y);
    }
    
    public static Optional X(final aiqj aiqj) {
        if (!((ahbc)aiqj).ry((ahaq)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
            return Optional.empty();
        }
        final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)((ahbc)aiqj).rx((ahaq)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
        if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 0x4) != 0x0) {
            return Optional.of((Object)showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint);
        }
        return Optional.empty();
    }
    
    public static final void Z(final uux uux, final boolean b) {
        if (!(uux instanceof uui)) {
            return;
        }
        if (b) {
            ((uui)uux).c().c();
            return;
        }
        ((uui)uux).c().a();
    }
    
    public static int ab(final arwh arwh) {
        final anfc ag = ag(arwh);
        if (ag == null) {
            return 0;
        }
        anhd anhd;
        if ((anhd = ag.q) == null) {
            anhd = anhd.a;
        }
        return anhd.b;
    }
    
    public static long ac(final arwh arwh, final long n) {
        final int d = ag(arwh).d;
        if (d == 0) {
            return n;
        }
        return d;
    }
    
    public static long ad(final arwh arwh) {
        final int b = ae(arwh).b;
        if (b <= 0) {
            return -1L;
        }
        return b;
    }
    
    public static ahtj ae(final arwh arwh) {
        ahtj ahtj;
        if ((ahtj = ag(arwh).c) == null) {
            ahtj = ahtj.a;
        }
        return ahtj;
    }
    
    public static amfz af(final arwh arwh) {
        amfz amfz;
        if (arwh != null && arwh.f() != null) {
            if ((amfz = arwh.f().i) == null) {
                amfz = amfz.a;
            }
        }
        else {
            amfz = amfz.a;
        }
        return amfz;
    }
    
    public static anfc ag(final arwh arwh) {
        anfc anfc;
        if (arwh != null && arwh.f() != null) {
            if ((anfc = arwh.f().j) == null) {
                anfc = anfc.a;
            }
        }
        else {
            anfc = anfc.a;
        }
        return anfc;
    }
    
    public static boolean ah(final arwh arwh, final boolean b, final boolean b2) {
        ahqv ahqv;
        if (arwh.f() != null) {
            if ((ahqv = arwh.f().o) == null) {
                ahqv = ahqv.a;
            }
        }
        else {
            ahqv = ahqv.a;
        }
        if (b2) {
            return ahqv.J;
        }
        return (ahqv != null && ahqv.j) || b;
    }
    
    public static boolean ai(final arwh arwh) {
        final anfc ag = ag(arwh);
        return ag != null && ag.D;
    }
    
    public static boolean aj(final arwh arwh) {
        final amfz af = af(arwh);
        if (af != null) {
            amga amga;
            if ((amga = af.j) == null) {
                amga = amga.a;
            }
            if (amga.c) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean ak(final arwh arwh) {
        final anfc ag = ag(arwh);
        return ag != null && ag.z;
    }
    
    public static boolean al(final arwh arwh) {
        return ag(arwh).g;
    }
    
    public static boolean am(final arwh arwh) {
        final anfc ag = ag(arwh);
        return ag != null && ag.v;
    }
    
    public static boolean an(final arwh arwh) {
        final anfc ag = ag(arwh);
        return ag != null && ag.t;
    }
    
    public static boolean ao(final arwh arwh) {
        final anfc ag = ag(arwh);
        return ag != null && ag.u;
    }
    
    public static boolean ap(final arwh arwh) {
        return ag(arwh).y;
    }
    
    public static boolean aq(final arwh arwh) {
        final anfc ag = ag(arwh);
        return ag != null && ag.N;
    }
    
    public static boolean ar(final arwh arwh) {
        return ag(arwh).l;
    }
    
    public static boolean as(final arwh arwh) {
        amxl amxl;
        if ((amxl = af(arwh).d) == null) {
            amxl = amxl.a;
        }
        return amxl.u;
    }
    
    public static boolean at(final arwh arwh) {
        return ag(arwh).p;
    }
    
    public final abcp H(final Context context, final abcn abcn, final abpu abpu) {
        final aezp k = aezp.k(this.e);
        final Object g = this.g;
        final Object h = this.h;
        final Object f = this.f;
        return new abcp(abcn, context, k, (zbh)g, (zis)h, (tjm)f, (ttd)this.i, (zdk)this.d, (afaq)this.a, (afaq)this.b, (tqd)new tpt(context, (tjm)f, (vai)null), abpu, (ttl)this.c, null);
    }
    
    public final FormatStreamModel I(final FormatStreamModel formatStreamModel) {
        if (formatStreamModel.j() > 0L && formatStreamModel.e() != 22) {
            return formatStreamModel;
        }
        final tcd c = tcd.c();
        ((zof)((atke)this.h).a()).c((Object)formatStreamModel.d, (tcc)c);
        try {
            final long longValue = (long)((afux)c).get();
            final ahbb ahbb = (ahbb)((ahbh)formatStreamModel.a).toBuilder();
            final Uri$Builder buildUpon = formatStreamModel.d.buildUpon();
            final String b = formatStreamModel.b;
            final long c2 = formatStreamModel.c;
            ((ahaz)ahbb).copyOnWrite();
            final ajum ajum = (ajum)ahbb.instance;
            ajum.c |= 0x800;
            ajum.p = longValue;
            return vyg.z(buildUpon, b, c2, ahbb);
        }
        catch (final ExecutionException ex) {
            throw new IOException("fetchContentLengthIfNecessary failed", ex);
        }
    }
    
    public final void J(final String s) {
        final Object g = this.g;
        final yyl yyl = new yyl(this, s, 2, (byte[])null, (byte[])null);
        final ziy ziy = (ziy)g;
        teu.j(afwm.r((afty)new adef(ziy, (aezs)yyl, 3, (byte[])null, (byte[])null, (byte[])null), (Executor)ziy.c), (Executor)afum.a, (tes)zsa.k);
    }
    
    public final FormatStreamModel S(final int n, final int n2, final int n3, final VideoStreamingData videoStreamingData, final boolean b, final PlayerConfigModel playerConfigModel) {
        if (M(n) && !b) {
            return null;
        }
        int min = n2;
        if (videoStreamingData.x) {
            min = n2;
            if (!((yoz)((atke)this.i).a()).e(videoStreamingData.d)) {
                min = Math.min(n2, 480);
            }
        }
        final aeea aeea = (aeea)((atke)this.c).a();
        final yft yft = new yft(new yfx(n, n), aeea.aF(n3), true, (String)null);
        FormatStreamModel formatStreamModel = null;
        Label_0260: {
            Label_0257: {
                try {
                    final yfu b2 = ((yfs)((atke)aeea.a).a()).b(videoStreamingData.h(), playerConfigModel, b, yft, min);
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
                    final aneh c2 = playerConfigModel.c;
                    if ((c2.b & 0x2000) != 0x0) {
                        ahsr ahsr;
                        if ((ahsr = c2.j) == null) {
                            ahsr = ahsr.a;
                        }
                        if (ahsr.l) {
                            break Label_0257;
                        }
                    }
                    if (b && e.length > 0 && e[0].M()) {
                        formatStreamModel = e[0];
                        break Label_0260;
                    }
                }
                catch (final yfw yfw) {}
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
        tbi.e();
        final String d = ((zmf)this.e).c().d();
        Object o;
        if (array != null) {
            o = array;
        }
        else {
            o = new byte[0];
        }
        final aaix aaix = new aaix(d, b, ae, (byte[])o);
        final int n = 2;
        final Throwable t = null;
        Label_0276: {
            try {
                o = this.g;
                final adem adem = (adem)((abn)((ziy)o).d).c((Object)aaix);
                if (adem == null) {
                    o = null;
                }
                else {
                    final long b2 = adem.b;
                    if (b2 == 0L) {
                        o = adej.a(adem.a, 2);
                    }
                    else {
                        final Object a = adem.a;
                        int n2;
                        if (b2 > ((oby)((ziy)o).a).d()) {
                            n2 = 2;
                        }
                        else {
                            n2 = 4;
                        }
                        o = adej.a(a, n2);
                    }
                }
                if (o != null) {
                    o = afwm.m((Object)aezp.k(o));
                }
                else {
                    o = afwm.m((Object)aeyo.a);
                }
                final aezp aezp = (aezp)((afvn)o).b;
                o = t;
                if (!aezp.h()) {
                    break Label_0276;
                }
                o = t;
                if (((adej)aezp.c()).b != 4) {
                    o = ((adej)aezp.c()).a;
                }
                break Label_0276;
            }
            catch (final ExecutionException o) {}
            catch (final InterruptedException ex) {}
            zlm.c(zll.b, zlk.B, "Some error occurred when reading from the cache player response", (Throwable)o);
            o = t;
        }
        if (o != null) {
            return (PlayerResponseModel)o;
        }
        final abll abll = (abll)((atke)this.a).a();
        final abmi d2 = ((abmg)((atke)this.d).a()).d();
        d2.y = true;
        d2.b = b;
        if (array != null) {
            ((vkk)d2).k(array);
        }
        else {
            ((vkk)d2).i();
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
        ((abnl)((atke)this.b).a()).sG(d2);
        ((abmf)this.f).sG(d2);
        final PlayerResponseModel a2 = abll.a(d2);
        final Object g = this.g;
        ListenableFuture listenableFuture;
        if (a2 == null) {
            listenableFuture = afwm.l((Throwable)new IllegalArgumentException("value cannot be null."));
        }
        else {
            final ziy ziy = (ziy)g;
            listenableFuture = afwm.r((afty)new jlw(ziy, aaix, a2, 10, null, null, null), (Executor)ziy.c);
        }
        teu.j(listenableFuture, (Executor)afum.a, (tes)zsa.j);
        return a2;
    }
    
    public final void U(final String ex, final aaix aaix) {
        final ArrayList list = new ArrayList();
        if (aaix.a.equals(ex)) {
            ((abn)((ziy)this.g).d).i((Object)aaix);
            list.add(afwm.m((Object)null));
        }
        try {
            afwm.K((Iterable)list).j(afwm.y(), (Executor)afum.a).get(1L, TimeUnit.SECONDS);
            return;
        }
        catch (final TimeoutException ex) {}
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex2) {}
        zlm.c(zll.b, zlk.B, "Some error occurred when evicting player response", (Throwable)ex);
    }
    
    public final long V() {
        return Collection$_EL.stream((Collection)this.d).mapToLong((ToLongFunction)ijv.f).sum();
    }
    
    public final wet W(final View view, wyw wyw) {
        final Context context = (Context)((atke)this.b).a();
        context.getClass();
        final acps acps = (acps)((atke)this.d).a();
        acps.getClass();
        final xrm xrm = (xrm)((atke)this.h).a();
        xrm.getClass();
        final vcy vcy = (vcy)((atke)this.c).a();
        vcy.getClass();
        final aeea aeea = (aeea)((atke)this.f).a();
        aeea.getClass();
        final accf accf = (accf)((atke)this.e).a();
        accf.getClass();
        final Handler handler = (Handler)((atke)this.a).a();
        handler.getClass();
        final wyw wyw2 = (wyw)((atke)this.i).a();
        wyw2.getClass();
        final vai vai = (vai)((atke)this.g).a();
        vai.getClass();
        view.getClass();
        wyw.getClass();
        if (!(boolean)vai.l(45377737L).aM()) {
            wyw = wyw2;
        }
        return new wet(context, acps, xrm, vcy, accf, aeea, wyw, handler, view, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void Y(final aiqj aiqj) {
        if (X(aiqj).isEmpty()) {
            return;
        }
        ((msr)this.d).Q((Callable)new pak(this, asht.n(((uwx)this.e).b(), asht.X(aiqj), (asji)lgl.j).Z((asjr)tvv.k).aC(Optional.empty()), 18, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final abri a(final String s, final int n, final PlayerResponseModel playerResponseModel) {
        final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)((atke)this.a).a();
        scheduledExecutorService.getClass();
        final tjm tjm = (tjm)((atke)this.b).a();
        tjm.getClass();
        final wxx wxx = (wxx)((atke)this.c).a();
        wxx.getClass();
        final tvl tvl = (tvl)((atke)this.d).a();
        tvl.getClass();
        final oby oby = (oby)((atke)this.e).a();
        oby.getClass();
        final abkl abkl = (abkl)((atke)this.f).a();
        abkl.getClass();
        final abjj abjj = (abjj)((atke)this.g).a();
        abjj.getClass();
        final apsd apsd = (apsd)((atke)this.h).a();
        final abrj abrj = (abrj)((atke)this.i).a();
        abrj.getClass();
        s.getClass();
        playerResponseModel.getClass();
        final String k = playerResponseModel.K();
        final long millis = TimeUnit.SECONDS.toMillis(playerResponseModel.h());
        Optional optional;
        if (playerResponseModel.V()) {
            optional = Collection$_EL.stream((Collection)playerResponseModel.n().o).filter((Predicate)wzn.r).filter((Predicate)wzn.s).findFirst().map((Function)zze.k);
        }
        else {
            optional = Optional.empty();
        }
        final int b = tvl.b;
        boolean b2 = false;
        Label_0338: {
            if (abri.j(n)) {
                final PlayerConfigModel m = playerResponseModel.m();
                if (abjj.s == 2 || (m != null && (m.ax() || (m.az() && abjj.s == 1)))) {
                    b2 = true;
                    break Label_0338;
                }
            }
            b2 = false;
        }
        final boolean b3 = abri.j(n) && abkl.l();
        final boolean t = playerResponseModel.T();
        final abkd r = abjj.r;
        final aamh c = abjj.c();
        final Vss3ConfigModel i = playerResponseModel.o().k;
        final long d = oby.d();
        final ahaz builder = aptb.a.createBuilder();
        final ahaz builder2 = aptc.a.createBuilder();
        builder2.copyOnWrite();
        final aptc aptc = (aptc)builder2.instance;
        aptc.b |= 0x4;
        aptc.e = -1.0f;
        final aptc a = aptc.a;
        final boolean b4 = playerResponseModel.r().e() == 2L;
        final apta j = apta.j;
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjv.b((AtomicReference)((vai)abrj.b).l(45375646L).aH((asjm)new abja(atomicBoolean, 6)));
        return new abri(scheduledExecutorService, tjm, wxx, tvl, oby, apsd, s, k, 1.0f, millis, "-", optional, b, -1L, b2, b3, t, r, c, i, false, d, builder, builder2, a, -1L, b4, false, j, atomicBoolean.get());
    }
    
    public final txx aa(final tye tye, final tzc tzc, final atke atke, final ViewGroup viewGroup, final View view, final typ typ, final tyn tyn, final int n) {
        final Executor executor = (Executor)((atke)this.h).a();
        executor.getClass();
        final aujg aujg = (aujg)((atke)this.d).a();
        aujg.getClass();
        final tzy tzy = (tzy)((atke)this.b).a();
        final tyt tyt = (tyt)((atke)this.g).a();
        tyt.getClass();
        final aeea aeea = (aeea)((atke)this.f).a();
        final ziy ziy = (ziy)((atke)this.a).a();
        final ziy ziy2 = (ziy)((atke)this.e).a();
        final Context context = (Context)((atke)this.c).a();
        final aeea aeea2 = (aeea)((atke)this.i).a();
        aeea2.getClass();
        tye.getClass();
        tzc.getClass();
        atke.getClass();
        view.getClass();
        typ.getClass();
        tyn.getClass();
        return new txx(executor, aujg, tzy, tyt, aeea, ziy, ziy2, context, aeea2, tye, tzc, atke, viewGroup, view, typ, tyn, n, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void au(final akiy akiy, final int n, final Runnable runnable, final Runnable runnable2) {
        if ((akiy.b & 0x8) != 0x0) {
            akix akix;
            if ((akix = akiy.f) == null) {
                akix = akix.a;
            }
            ajut ajut;
            if ((ajut = akix.c) == null) {
                ajut = ajut.a;
            }
            ((tqd)this.b).d(acak.b(ajut).toString());
            if (runnable2 != null) {
                runnable2.run();
            }
            return;
        }
        if (akiy.g.size() > 0) {
            ((vcy)this.c).b((List)akiy.g);
        }
        final ahaz builder = ((ahbh)apzs.a).createBuilder();
        builder.copyOnWrite();
        final apzs apzs = (apzs)builder.instance;
        apzs.c = n - 1;
        apzs.b |= 0x1;
        final apzs apzs2 = (apzs)builder.build();
        final aknr d = aknt.d();
        ((ahaz)d).copyOnWrite();
        aknt.al((aknt)d.instance, apzs2);
        ((wxx)this.f).d((aknt)((ahaz)d).build());
        runnable.run();
        ((tgd)this.g).d((Object)new rgu(true));
    }
    
    public final ListenableFuture av(final pfn c, int h, final long d, String e, final Uri uri, String iterator, int g, final pfg pfg, final pjn pjn, final int n, final List list) {
        if (!((HashMap)this.c).containsKey(uri)) {
            ListenableFuture listenableFuture = null;
            Label_0935: {
                if (iterator.startsWith("http")) {
                    ((pex)this.b).l();
                    if (!iterator.startsWith("https")) {
                        pjs.d("%s: File url = %s is not secure", (Object)"MddFileDownloader", (Object)iterator);
                        final asbe a = pev.a();
                        a.a = peu.s;
                        listenableFuture = afwm.l((Throwable)a.u());
                        break Label_0935;
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
                    final long n2 = g;
                    final Object b = this.b;
                    ((pex)b).h();
                    final StatFs statFs = new StatFs(((Context)a2).getFilesDir().getAbsolutePath());
                    final long n3 = statFs.getBlockCount();
                    final long n4 = statFs.getBlockSize();
                    final long n5 = statFs.getAvailableBlocks();
                    final long n6 = statFs.getBlockSize();
                    final float n7 = (float)(n3 * n4);
                    ((pex)b).i();
                    final float n8 = n7 * 0.1f;
                    ((pex)b).c();
                    double n9 = Math.min(n8, 5.24288E8f);
                    Label_0326: {
                        if (pfg != null) {
                            if ((g = psw.g(pfg.c)) == 0) {
                                g = 1;
                            }
                            float n10;
                            if (--g != 1) {
                                if (g != 2) {
                                    n9 = n9;
                                    break Label_0326;
                                }
                                ((pex)b).i();
                                ((pex)b).d();
                                n10 = Math.min(n8, 2097152.0f);
                            }
                            else {
                                ((pex)b).i();
                                n10 = Math.min(n8, (float)((pex)b).a());
                            }
                            n9 = n10;
                        }
                    }
                    if (n5 * n6 - (n2 - ae) > n9) {
                        ((pex)this.b).u();
                        final Object f = this.f;
                        final Object e2 = this.e;
                        final ahaz builder = ((ahbh)pfi.a).createBuilder();
                        builder.copyOnWrite();
                        final pfi pfi = (pfi)builder.instance;
                        c.getClass();
                        pfi.c = c;
                        pfi.b |= 0x1;
                        builder.copyOnWrite();
                        final pfi pfi2 = (pfi)builder.instance;
                        pfi2.b |= 0x2;
                        pfi2.d = d;
                        builder.copyOnWrite();
                        final pfi pfi3 = (pfi)builder.instance;
                        e.getClass();
                        pfi3.b |= 0x4;
                        pfi3.e = e;
                        builder.copyOnWrite();
                        final pfi pfi4 = (pfi)builder.instance;
                        pfi4.b |= 0x8;
                        pfi4.f = h;
                        final pfi pfi5 = (pfi)builder.build();
                        e = (String)((pla)f).c;
                        synchronized (e) {
                            if (!((pla)f).d.containsKey(pfi5)) {
                                final HashMap d2 = ((pla)f).d;
                                final pkz pkz = new pkz(((pla)f).b, (pjt)e2, pfi5);
                                final pgi a3 = ((pla)f).a;
                                d2.put(pfi5, new qox((qow)pkz, (qov)new pkx(), 10L, TimeUnit.SECONDS));
                            }
                            ((pla)f).e.put(uri, ((pla)f).d.get(pfi5));
                            monitorexit(e);
                            if (((aezp)this.d).h()) {
                                e = (String)((aezp)this.d).c();
                                final String c2 = c.c;
                                synchronized (pkw.class) {
                                    ((pkw)e).b.put(uri, c2);
                                }
                            }
                            final pgn a4 = pgo.a();
                            a4.d(uri);
                            a4.f(iterator);
                            Label_0794: {
                                if (pfg != null) {
                                    h = psw.h(pfg.d);
                                    if (h != 0) {
                                        if (h == 2) {
                                            a4.b(pgm.c);
                                            break Label_0794;
                                        }
                                    }
                                }
                                a4.b(pgm.b);
                            }
                            if (n > 0) {
                                a4.e(n);
                            }
                            e = (String)afeq.d();
                            iterator = (String)list.iterator();
                            while (((Iterator)iterator).hasNext()) {
                                final pfh pfh = ((Iterator<pfh>)iterator).next();
                                ((afel)e).h(Pair.create((Object)pfh.b, (Object)pfh.c));
                            }
                            a4.c(((afel)e).g());
                            ((pgp)((afaq)this.h).a()).a(a4.a());
                            break Label_0935;
                        }
                    }
                    final asbe a5 = pev.a();
                    a5.a = peu.t;
                    throw a5.u();
                }
                catch (final pev pev) {
                    pjs.d("%s: Not enough space to download file %s", (Object)"MddFileDownloader", (Object)iterator);
                    listenableFuture = afwm.l((Throwable)pev);
                }
            }
            final plc c3 = plc.d(listenableFuture).f((aftz)new phy(pjn, uri, 9), (Executor)this.i).c((Class)pev.class, (aftz)new phy(this, pjn, 10, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (Executor)this.i);
            ((HashMap)this.c).put(uri, c3);
            ((afux)c3).addListener((Runnable)new oku(this, uri, 6, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (Executor)this.i);
            return (ListenableFuture)c3;
        }
        return ((HashMap)this.c).get(uri);
    }
    
    public final void aw(final Uri uri) {
        final ListenableFuture listenableFuture = ((HashMap)this.c).get(uri);
        if (listenableFuture != null) {
            final int a = pjs.a;
            ((HashMap)this.c).remove(uri);
            listenableFuture.cancel(true);
            return;
        }
        pjs.g("%s: stopDownloading on non-existent download", (Object)"MddFileDownloader");
    }
    
    public final long ax() {
        final abvx q = ((abpq)this.c).q();
        if (q == null) {
            return 0L;
        }
        return q.c();
    }
    
    public final long ay(final long n) {
        return Math.min(this.ax() + n, ((abpq)this.c).j());
    }
    
    public final ashi az(final abil abil, final long n) {
        tbi.f();
        final Rect f = abil.f(abil.a(n));
        final Object e = this.e;
        final int a = ((afdh)e).a;
        final int size = ((afdm)e).size();
        Bitmap bitmap2;
        final Bitmap bitmap = bitmap2 = null;
        if (a - size == 0) {
            final Bitmap bitmap3 = (Bitmap)((afdq)this.e).remove();
            bitmap2 = bitmap;
            if (bitmap3.getWidth() >= f.width()) {
                if (bitmap3.getHeight() < f.height()) {
                    bitmap2 = bitmap;
                }
                else {
                    bitmap2 = bitmap3;
                }
            }
        }
        return vdh.aZ(((jki)this.g).b(abil, 0, abil.a(n), bitmap2)).g((asjs)lfr.g).C((asjr)lgk.n).h().w((asjm)new lem((afdh)this.e, 17)).L((asjr)new lcy(f, 4));
    }
    
    public final abra b(List list, List list2, final String s) {
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
        return new abra((aahc)g, (tjm)e, (zis)b, (afaq)a, (List)list, (List)list2, s, (Executor)this.h, (aale)this.f, (wxx)this.i, (arwh)this.c, (afaq)this.d, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final boolean c() {
        final anef a = A((vaf)this.f);
        return a != null && a.o;
    }
    
    public final boolean d() {
        return ((vai)this.i).A();
    }
    
    public final boolean e() {
        return ((vai)this.g).f(45372700L);
    }
    
    public final boolean f() {
        return ((vai)this.c).f(45361125L);
    }
    
    public final boolean g() {
        return ag((arwh)this.a).L || ((vai)this.h).f(45358588L);
    }
    
    public final boolean h() {
        return ((vai)this.e).aC();
    }
    
    public final boolean i() {
        return ag((arwh)this.a).F;
    }
    
    public final boolean j() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjv.b((AtomicReference)((vai)this.c).l(45377654L).aH((asjm)new abja(atomicBoolean, 6)));
        return atomicBoolean.get();
    }
    
    public final boolean k() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjv.b((AtomicReference)((vai)this.g).l(45368753L).aH((asjm)new abja(atomicBoolean, 6)));
        return atomicBoolean.get();
    }
    
    public final boolean l() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjv.b((AtomicReference)((vai)this.c).l(45375607L).aH((asjm)new abja(atomicBoolean, 6)));
        return atomicBoolean.get();
    }
    
    public final boolean m(final PlaybackStartDescriptor playbackStartDescriptor) {
        if (!playbackStartDescriptor.v()) {
            return false;
        }
        if (TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            asjv.b((AtomicReference)((vai)this.c).l(45380134L).aH((asjm)new abja(atomicBoolean, 6)));
            return atomicBoolean.get();
        }
        return ag((arwh)this.a).O;
    }
    
    public final boolean n() {
        return ag((arwh)this.a).Q;
    }
    
    public final boolean o() {
        return ((vai)this.e).f(45376611L);
    }
    
    public final boolean p() {
        return ((vai)this.g).f(45360803L);
    }
    
    public final boolean q() {
        return ag((arwh)this.a).J;
    }
    
    public final boolean r() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjv.b((AtomicReference)((vai)this.g).l(45371561L).aH((asjm)new abja(atomicBoolean, 6)));
        return atomicBoolean.get();
    }
    
    public final boolean s() {
        return ag((arwh)this.a).P;
    }
    
    public final boolean t() {
        final anef a = A((vaf)this.f);
        return a != null && a.p;
    }
    
    public final boolean u() {
        final anef a = A((vaf)this.f);
        return a != null && a.n;
    }
    
    public final boolean v() {
        return ((vai)this.c).f(45370174L);
    }
    
    public final boolean w() {
        final anef a = A((vaf)this.f);
        return a != null && a.q;
    }
    
    public final boolean x() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjv.b((AtomicReference)((vai)this.g).l(45366433L).aH((asjm)new abja(atomicBoolean, 6)));
        return atomicBoolean.get();
    }
    
    public final boolean y() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjv.b((AtomicReference)((vai)this.e).l(45379969L).aH((asjm)new abja(atomicBoolean, 6)));
        return atomicBoolean.get();
    }
    
    public final boolean z() {
        return ((vai)this.g).f(45360907L);
    }
}
