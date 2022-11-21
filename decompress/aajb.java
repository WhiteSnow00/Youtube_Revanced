import java.util.Map;
import android.net.Uri;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.Locale;
import java.io.File;
import java.util.Iterator;
import java.net.SocketTimeoutException;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.io.IOException;
import java.util.List;
import android.database.sqlite.SQLiteFullException;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Set;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aajb
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
    public final Object j;
    public final Object k;
    public final Object l;
    
    public aajb(final Context f, final oco a, final absv b, final vbo k, final arzb c, final vyb d, final vyc e, final adgg l, final atnb g, final absv h, final vfn i, final atnb j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.k = k;
        this.c = c;
        this.d = d;
        this.e = e;
        this.l = l;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public aajb(final atnb b, final atnb l, final atnb d, final atnb k, final atnb g, final atnb i, final atnb a, final atnb e, final atnb f, final atnb j, final atnb h, final atnb c) {
        b.getClass();
        this.b = b;
        l.getClass();
        this.l = l;
        d.getClass();
        this.d = d;
        k.getClass();
        this.k = k;
        g.getClass();
        this.g = g;
        i.getClass();
        this.i = i;
        this.a = a;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        j.getClass();
        this.j = j;
        h.getClass();
        this.h = h;
        c.getClass();
        this.c = c;
    }
    
    public aajb(final zoa d, final tkf h, final zpf l, final oco a, final tkq e, final zkq i, final Executor j, final Executor f, final tgi k, final zpd b, final Set c) {
        this.d = d;
        this.h = h;
        this.l = l;
        this.a = a;
        this.e = e;
        this.i = i;
        this.j = j;
        this.f = f;
        this.g = afxr.f(f);
        this.k = k;
        this.b = b;
        this.c = c;
    }
    
    public static String b(final String s) {
        return vht.h(119, s);
    }
    
    public static String c(final String s) {
        return vht.h(120, s);
    }
    
    public static final void e(final String s, final String s2, final PlayerResponseModel playerResponseModel, final zxm zxm, final long n, final vku vku) {
        if (zxm.t(s2) != null) {
            try {
                if (zxm.P(s2, playerResponseModel, n, true, vku)) {
                    return;
                }
                final StringBuilder sb = new StringBuilder("[Offline] pudl task[");
                sb.append(s);
                sb.append("] failed to save player response.");
                tut.b(sb.toString());
                throw aahm.b("Fail to save playerResponse", null, aacn.d, amxs.s);
            }
            catch (final SQLiteFullException ex) {
                throw aahm.b("Error trying to write to local disk.", (Exception)ex, aacn.f, amxs.s);
            }
        }
        throw aahm.a("Video not found in database", null, aacn.d, amxs.u);
    }
    
    public static final void f(final zxm ex, final aabs aabs, aadf f) {
        final String u = aahc.u(f.f);
        Object e = ((zxm)ex).e(u);
        if (e == null) {
            return;
        }
        try {
            Label_0489: {
                if (aahc.Z(f.f)) {
                    tcl.k();
                    aowb aowb;
                    if ((aowb = ((aacx)e).d.d) == null) {
                        aowb = aowb.a;
                    }
                    final vig vig = new vig(aamn.q(aowb, afgh.s(240, 480)));
                    f = (aadf)((aacx)e).f();
                    for (final vif vif : vig.b) {
                        try {
                            ((aabr)aabs).p(vif.a(), ((aabr)aabs).h((String)f, vif.a()));
                            continue;
                        }
                        catch (final IOException | ExecutionException ex2) {
                            aabr.w(((aabr)aabs).l((String)f));
                            break Label_0489;
                        }
                        break;
                    }
                    aabr.w(((aabr)aabs).j((String)f));
                    try {
                        for (final vif vif2 : vig.b) {
                            final File h = ((aabr)aabs).h((String)f, vif2.a());
                            final File k = ((aabr)aabs).k((String)f, vif2.a());
                            afqz.b(k);
                            adme.R(h.equals(k) ^ true, "Source %s and destination %s must be different", h, k);
                            if (!h.renameTo(k)) {
                                afqz.a(h, k);
                                if (h.delete()) {
                                    continue;
                                }
                                if (!k.delete()) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Unable to delete ");
                                    sb.append(k);
                                    throw new IOException("Unable to delete ".concat(k.toString()));
                                }
                                e = new StringBuilder();
                                ((StringBuilder)e).append("Unable to delete ");
                                ((StringBuilder)e).append(h);
                                throw new IOException("Unable to delete ".concat(h.toString()));
                            }
                        }
                        break Label_0489;
                    }
                    finally {
                        aabr.w(((aabr)aabs).l((String)f));
                    }
                }
                final amxx d = ((aacx)e).d;
                final String f2 = ((aacx)e).f();
                aowb aowb2;
                if ((aowb2 = d.d) == null) {
                    aowb2 = aowb.a;
                }
                ((aabr)aabs).s(f2, aowb2);
            }
            final agr e2 = ((aacx)e).e;
            if (e2 != null) {
                final Object e3 = e2.e;
                if (TextUtils.isEmpty((CharSequence)e3)) {
                    return;
                }
                final agr aq = ((zxm)ex).aq((String)e3);
                if (aq != null) {
                    aabs.z(aq);
                }
            }
            final zys r = ((zxm)ex).h.r(u);
            if (r != null) {
                final aacx c = r.c();
                final vig a = c.a;
                if (a != null) {
                    r.l(new aacx(c.d, c.b, ((zxm)ex).a.c(u, a), c.e, (byte[])null));
                }
            }
            try {
                ((zxm)ex).E(u);
            }
            catch (final SQLiteFullException ex) {
                throw aahm.a("Out of storage error; couldn't sync player response in db", (Exception)ex, aacn.e, amxs.l);
            }
        }
        catch (final ExecutionException ex) {
            goto Label_0632;
        }
        catch (final IOException ex3) {}
        catch (final SocketTimeoutException ex) {
            goto Label_0667;
        }
        catch (final bce ex) {
            goto Label_0667;
        }
        catch (final yhq yhq) {}
        catch (final aahd aahd) {
            throw aahm.a("Out of storage error.", aahd, aacn.e, amxs.l);
        }
    }
    
    public static final void i(final String s, final PlayerResponseModel playerResponseModel) {
        if (!absv.R(playerResponseModel)) {
            final StringBuilder sb = new StringBuilder("[Offline] pudl task[");
            sb.append(s);
            sb.append("] received actionable playability error.");
            tut.l(sb.toString());
            throw aahm.a("Playability error", null, aacn.h, amxs.k);
        }
        if (absv.Q(playerResponseModel)) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder("[Offline] pudl task[");
        sb2.append(s);
        sb2.append("] received offline state error.");
        tut.b(sb2.toString());
        throw aahm.a("Offline state error", null, aacn.h, amxs.g);
    }
    
    public static final zpb l(final byte[] array, final String s) {
        return new zpb(array, s);
    }
    
    public static final zpb m(final String s) {
        return new zpb(1, s);
    }
    
    public static final zpb n(final String s) {
        return new zpb(2, s);
    }
    
    public static final void o(final String s, final String s2, final String s3, final yhm yhm, final aacu aacu, final long n, final zyd zyd, final String s4, final zch zch, final zch zch2, final acjq acjq) {
        if (aacu.i()) {
            zch2.c(n);
            return;
        }
        final long n2 = aacu.b() - aacu.d;
        long n3;
        if (s4 != null) {
            final zvm c = ((aadl)((atnb)acjq.b).a()).a().c();
            if (c == null) {
                n3 = 0L;
            }
            else {
                final File g = c.g(s4);
                if (g == null) {
                    n3 = acjq.t();
                }
                else {
                    n3 = acjq.u(g);
                }
            }
        }
        else {
            n3 = acjq.t();
        }
        if (n3 > n2) {
            String.format(Locale.US, "[Offline] pudl task[%s] start stream<%d> uri<%s> download", s2, aacu.a(), aacu.b.d);
            if (s4 != null) {
                zyd.k(s, aacu.a(), s4);
            }
            try {
                yhm.b(aacu.b, 0L, n, (PlayerConfigModel)null, s3, zch, zch2);
                return;
            }
            catch (final bcg bcg) {
                if (bcg.d == 403) {
                    throw new aaix();
                }
                throw bcg;
            }
        }
        throw new aahd(n2);
    }
    
    private final FormatStreamModel p(FormatStreamModel formatStreamModel, final VideoStreamingData videoStreamingData) {
        final int e = formatStreamModel.e();
        final String w = formatStreamModel.w();
        final Iterator iterator = videoStreamingData.o.iterator();
        while (true) {
            while (iterator.hasNext()) {
                formatStreamModel = (FormatStreamModel)iterator.next();
                if (formatStreamModel.e() == e && TextUtils.equals((CharSequence)formatStreamModel.w(), (CharSequence)w)) {
                    if (formatStreamModel != null) {
                        return ((absv)this.b).I(formatStreamModel);
                    }
                    return null;
                }
            }
            formatStreamModel = null;
            continue;
        }
    }
    
    private final aacu q(aacu aacu, final FormatStreamModel formatStreamModel, final zyd zyd, final String s) {
        aacu aacu2 = aacu;
        Label_0088: {
            if (aacu != null) {
                final FormatStreamModel b = aacu.b;
                if (formatStreamModel != null && formatStreamModel.j() == b.j() && formatStreamModel.k() == b.k() && formatStreamModel.e() == b.e()) {
                    aacu2 = aacu;
                    if (TextUtils.equals((CharSequence)formatStreamModel.w(), (CharSequence)b.w())) {
                        break Label_0088;
                    }
                }
                zyd.h(s, aacu.a());
                aacu2 = null;
            }
        }
        aacu = aacu2;
        if (formatStreamModel != null) {
            if (aacu2 == null) {
                final boolean contains = vki.b().contains(formatStreamModel.e());
                final long c = ((oco)this.a).c();
                final aact e = aacu.e();
                e.d(formatStreamModel);
                e.b(contains);
                e.c(0L);
                e.g(0);
                e.h(c);
                aacu = e.a();
                zyd.i(aacu);
            }
            else {
                final aact d = aacu2.d();
                d.d(formatStreamModel);
                aacu = d.a();
            }
        }
        return aacu;
    }
    
    public final aahm a(final IOException ex) {
        if (ex instanceof yhq) {
            return aahm.b("Error network timed out", ex, aacn.g, amxs.y);
        }
        if (ex instanceof bce || ex instanceof SocketTimeoutException) {
            return aahm.b("Error reading from network", ex, aacn.g, amxs.y);
        }
        if (ex instanceof bca || ex instanceof lyq) {
            final Object c = this.c;
            if (c != null) {
                final arzb arzb = (arzb)c;
                if (arzb.f() != null && (arzb.f().b & 0x200) != 0x0) {
                    amwj amwj;
                    if ((amwj = arzb.f().g) == null) {
                        amwj = amwj.a;
                    }
                    if (amwj.v) {
                        return aahm.a("Error trying to read from or write to local disk.", ex, aacn.f, amxs.v);
                    }
                }
            }
            return aahm.b("Error trying to read from or write to local disk.", ex, aacn.f, amxs.v);
        }
        if (ex instanceof lyg) {
            final Object c2 = this.c;
            if (c2 != null) {
                final arzb arzb2 = (arzb)c2;
                if (arzb2.f() != null && (arzb2.f().b & 0x200) != 0x0) {
                    amwj amwj2;
                    if ((amwj2 = arzb2.f().g) == null) {
                        amwj2 = amwj.a;
                    }
                    if (amwj2.w) {
                        return aahm.a("Error trying to read from or write to local disk.", ex, aacn.f, amxs.v);
                    }
                }
            }
            return aahm.b("Error trying to read from or write to local disk.", ex, aacn.f, amxs.v);
        }
        if (ex instanceof aahd) {
            return aahm.b("Out of storage error.", ex, aacn.e, amxs.l);
        }
        if (ex instanceof aahg) {
            return ((aahg)ex).a();
        }
        if (ex instanceof lyd) {
            final Object c3 = this.c;
            if (c3 != null) {
                final arzb arzb3 = (arzb)c3;
                if (arzb3.f() != null && (arzb3.f().b & 0x200) != 0x0) {
                    amwj amwj3;
                    if ((amwj3 = arzb3.f().g) == null) {
                        amwj3 = amwj.a;
                    }
                    if (amwj3.x) {
                        return aahm.a("Error trying to read from or write to local disk.", ex, aacn.f, amxs.v);
                    }
                }
            }
            return aahm.b("Error trying to read from or write to local disk.", ex, aacn.f, amxs.v);
        }
        tut.d("[Offline] unknown pudl error", (Throwable)ex);
        return aahm.b("Error trying to download video for offline.", ex, aacn.f, amxs.v);
    }
    
    public final void d(final String ex, final String s, final zxm zxm, final aahk aahk) {
        final amvy u = aaks.u((vbo)this.k);
        if (u != null) {
            if (u.b) {
                try {
                    final vyd b = ((vyc)this.e).b();
                    b.y(s);
                    ((vls)b).i();
                    final WatchNextResponseModel d = ((vyb)this.d).d(b);
                    if (zxm.t(s) != null) {
                        try {
                            if (zxm.T(s, d)) {
                                final aahs a = aaht.a(15);
                                a.f((String)ex);
                                ((aahu)aahk).k(a.a());
                                return;
                            }
                            final StringBuilder sb = new StringBuilder("[Offline] pudl task[");
                            sb.append((String)ex);
                            sb.append("] failed to save watchNextResponse.");
                            tut.b(sb.toString());
                            throw aahm.b("Fail to save watchNextResponse", null, aacn.d, amxs.s);
                        }
                        catch (final SQLiteFullException ex) {
                            throw aahm.b("Error trying to write to local disk.", (Exception)ex, aacn.f, amxs.s);
                        }
                    }
                    throw aahm.a("Video not found in database", null, aacn.d, amxs.u);
                }
                catch (final vnz vnz) {
                    final StringBuilder sb2 = new StringBuilder("[Offline] pudl task[");
                    sb2.append((String)ex);
                    sb2.append("] failed to retrieve watch next response");
                    tut.d(sb2.toString(), (Throwable)vnz);
                    throw aahm.b("Cannot retrieve watch next response from the server.", (Exception)vnz, aacn.g, amxs.y);
                }
            }
        }
    }
    
    final aacv g(int n, final int n2, String s, final String s2, final VideoStreamingData videoStreamingData, final PlayerConfigModel playerConfigModel, final zyd zyd) {
        final aacu aacu = null;
        final aacv m = zyd.m(s2, (foq)null);
        final boolean i = absv.M(n);
        zct zct = null;
        Label_0170: {
            Label_0167: {
                if (m != null && (m.b != null || (m.a != null && vki.x().contains(m.a.a()))) && (i || m.a != null)) {
                    final FormatStreamModel c = m.c();
                    FormatStreamModel p7;
                    if (c != null) {
                        if ((p7 = this.p(c, videoStreamingData)) == null) {
                            break Label_0167;
                        }
                    }
                    else {
                        p7 = null;
                    }
                    final FormatStreamModel a = m.a();
                    FormatStreamModel p8;
                    if (a != null) {
                        if ((p8 = this.p(a, videoStreamingData)) == null) {
                            break Label_0167;
                        }
                    }
                    else {
                        p8 = null;
                    }
                    zct = new zct(p7, p8);
                    break Label_0170;
                }
            }
            zct = null;
        }
        int min;
        if (videoStreamingData.x && !((yqu)((atnb)this.g).a()).e(videoStreamingData.d)) {
            min = Math.min(Integer.MAX_VALUE, 480);
        }
        else {
            min = Integer.MAX_VALUE;
        }
        zct zct2 = zct;
        Label_0437: {
            if (zct == null) {
                final Object l = this.l;
                final yhw a2 = yhs.a;
                final yhw yhw = new yhw(n, n);
                final yhw u = adgg.U(n2);
                if (!i) {
                    n = 0;
                }
                else {
                    n = 32;
                }
                if (TextUtils.isEmpty((CharSequence)s)) {
                    s = null;
                }
                final yhs yhs = new yhs(yhw, u, false, s, -1, -2, -1L, min, n);
                try {
                    final yht a3 = ((yhr)((atnb)((adgg)l).a).a()).a(videoStreamingData.h(), playerConfigModel, yhs);
                    final FormatStreamModel[] e = a3.e();
                    final FormatStreamModel[] c2 = a3.c;
                    FormatStreamModel formatStreamModel;
                    if (e.length > 0) {
                        formatStreamModel = e[0];
                    }
                    else {
                        formatStreamModel = null;
                    }
                    FormatStreamModel formatStreamModel2;
                    if (c2.length > 0) {
                        formatStreamModel2 = c2[0];
                    }
                    else {
                        formatStreamModel2 = null;
                    }
                    FormatStreamModel formatStreamModel3 = formatStreamModel;
                    if (i) {
                        formatStreamModel3 = formatStreamModel;
                        if (formatStreamModel2 != null) {
                            formatStreamModel3 = null;
                        }
                    }
                    if (formatStreamModel3 != null || formatStreamModel2 != null) {
                        zct2 = new zct(formatStreamModel3, formatStreamModel2);
                        break Label_0437;
                    }
                }
                catch (final yhv yhv) {}
                zct2 = null;
            }
        }
        if (zct2 == null) {
            throw aahm.a("Stream pair could not be found.", null, aacn.h, amxs.f);
        }
        if (!i && zct2.b == null) {
            throw aahm.a("Video stream not found.", null, aacn.h, amxs.f);
        }
        final Object b = zct2.b;
        if ((b != null && vki.x().contains(((FormatStreamModel)b).e())) || zct2.a != null) {
            final Object b2 = zct2.b;
            FormatStreamModel j;
            if ((j = (FormatStreamModel)b2) != null) {
                j = ((absv)this.b).I((FormatStreamModel)b2);
            }
            final Object a4 = zct2.a;
            FormatStreamModel k;
            if ((k = (FormatStreamModel)a4) != null) {
                k = ((absv)this.b).I((FormatStreamModel)a4);
            }
            final zct zct3 = new zct((FormatStreamModel)j, (FormatStreamModel)k);
            aacu a5;
            if (m != null) {
                a5 = m.a;
            }
            else {
                a5 = null;
            }
            final aacu q = this.q(a5, (FormatStreamModel)zct3.b, zyd, s2);
            aacu b3 = aacu;
            if (m != null) {
                b3 = m.b;
            }
            return aacv.e(q, this.q(b3, (FormatStreamModel)zct3.a, zyd, s2));
        }
        throw aahm.a("Audio stream not found.", null, aacn.h, amxs.A);
    }
    
    public final PlayerResponseModel h(final String s, final byte[] array, final aadf aadf, final int n) {
        try {
            return ((absv)this.b).T(s, n, array);
        }
        catch (final vnz vnz) {
            final String a = aadf.a;
            final StringBuilder sb = new StringBuilder("[Offline] pudl task[");
            sb.append(a);
            sb.append("] failed to retrieve player response");
            tut.d(sb.toString(), (Throwable)vnz);
            throw aahm.b("Cannot retrieve player response from the server.", (Exception)vnz, aacn.g, amxs.y);
        }
    }
    
    @Deprecated
    public final void j(final zpb zpb, final dbh dbh) {
        this.k(null, zpb, dbh);
    }
    
    public final void k(final zkr zkr, final zpb zpb, final dbh dbh) {
        final Uri b = zpb.b;
        if (b == null || b.getScheme() == null || b.getHost() == null) {
            ((Executor)this.j).execute((Runnable)new zoy(dbh, b, 1));
            return;
        }
        final int k = zpb.k;
        final String string = zpb.b.toString();
        final String a = zpb.a;
        final long e = zpb.e;
        final Object i = this.i;
        int n;
        if (zkr != null) {
            n = zkr.e();
        }
        else {
            n = ((zkq)i).b();
        }
        long n2 = ((oco)this.a).c() + TimeUnit.HOURS.toMillis(n);
        if (e > 0L && e < n2) {
            n2 = e;
        }
        long millis;
        if (zkr != null) {
            millis = TimeUnit.MINUTES.toMillis(zkr.f());
        }
        else {
            millis = 0L;
        }
        final ArrayList list = new ArrayList();
        if (zkr != null) {
            for (final int intValue : zkr.g()) {
                if (intValue > 0) {
                    list.add(TimeUnit.SECONDS.toMillis(intValue));
                }
            }
        }
        final byte[] c = zpb.c;
        final Map f = zpb.f;
        final Object c2 = this.c;
        final Object a2 = this.a;
        final int d = ((zkq)this.i).d();
        znz znz;
        if ((znz = zpb.g) == null) {
            znz = ((zoa)this.d).c();
        }
        final zox zox = new zox(k, string, a, n2, millis, (List)list, c, f, dbh, (Set)c2, (oco)a2, d, znz, zpb.h, zpb.j);
        boolean b2;
        if (zkr != null) {
            b2 = zkr.h();
        }
        else {
            b2 = ((zkq)this.i).g();
        }
        final boolean d2 = zpb.d;
        if (!b2 || !d2 || this.l == zpf.d) {
            ((tkf)this.h).a((tmy)zox);
            return;
        }
        final zoy zoy = new zoy(this, zox, 0, (byte[])null);
        if (((zkq)this.i).h()) {
            ((Executor)this.g).execute((Runnable)zoy);
            return;
        }
        ((Executor)this.f).execute((Runnable)zoy);
    }
}
