import java.util.Calendar;
import android.content.res.Resources;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.Duration;
import j$.time.Instant;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iiu
{
    static final long a;
    static final long b;
    public static final int c = 0;
    private final Context d;
    private final oby e;
    private final tjm f;
    private final fmj g;
    private final atke h;
    private final atke i;
    private final aait j;
    private final acid k;
    private final zaz l;
    
    static {
        TimeUnit.DAYS.toMillis(30L);
        a = TimeUnit.DAYS.toSeconds(30L);
        TimeUnit.HOURS.toMillis(12L);
        b = TimeUnit.HOURS.toSeconds(12L);
    }
    
    public iiu(final Context d, final oby e, final tjm f, final fmj g, final acid k, final atke h, final atke i, final zaz l, final aait j, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.k = k;
        this.h = h;
        this.i = i;
        this.l = l;
        this.j = j;
    }
    
    private static boolean A(final aowy aowy) {
        return aowy.f.equals((Object)aowy) || aowy.a.equals((Object)aowy);
    }
    
    private static final List B(final aoxc aoxc) {
        return (List)Collection$_EL.stream((Collection)aoxc.c()).flatMap((Function)ifj.h).collect(afci.a);
    }
    
    private static final afeq C(final ancy ancy) {
        final afel d = afeq.d();
        if (ancy != null) {
            final aoxc h = ancy.h();
            if (h != null) {
                d.j(B(h));
            }
            Object g;
            try {
                final afel afel = new afel();
                final Iterator<Object> iterator = ((List<Object>)ancy.c.j).iterator();
                while (iterator.hasNext()) {
                    final vfn b = ancy.b.b((String)iterator.next());
                    if (b != null) {
                        if (!(b instanceof ahmc)) {
                            final String string = b.toString();
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Entity ");
                            sb.append(string);
                            sb.append(" is not a AdPlaybackDataEntityModel");
                            throw new IllegalArgumentException(sb.toString());
                        }
                        afel.h(b);
                    }
                }
                g = afel.g();
            }
            catch (final IllegalArgumentException ex) {
                g = null;
            }
            if (g != null) {
                for (int c = ((afih)g).c, i = 0; i < c; ++i) {
                    final ahmc ahmc = ((List<ahmc>)g).get(i);
                    final vfn b2 = ahmc.b.b(ahmc.c.e);
                    boolean b3 = true;
                    if (b2 != null) {
                        b3 = (b2 instanceof aoxc && b3);
                    }
                    adkp.R(b3, (Object)"entityFromStore is not instance of TransferEntityModel, key=transfer");
                    final aoxc aoxc = (aoxc)b2;
                    if (aoxc != null) {
                        d.j(B(aoxc));
                    }
                }
            }
        }
        return d.g();
    }
    
    public static apme f(final ijk ijk) {
        final ijk a = ijk.a;
        switch (ijk.ordinal()) {
            default: {
                ttr.b("Unrecognized video display state, defaulting to unknown.");
                return apme.a;
            }
            case 4: {
                return apme.g;
            }
            case 3: {
                return apme.c;
            }
            case 2: {
                return apme.d;
            }
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13: {
                return apme.f;
            }
            case 0: {
                return apme.e;
            }
        }
    }
    
    public static final boolean p(final amwb amwb) {
        if (amwb != null) {
            final int cx = aqsx.cX(amwb.getOfflineFutureUnplayableInfo().d);
            if (cx != 0) {
                if (cx == 2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static final float q(final ancy ancy) {
        final afeq c = C(ancy);
        final int c2 = ((afih)c).c;
        int i = 0;
        long n = 0L;
        long n2 = 0L;
        while (i < c2) {
            final aoln aoln = ((List<aoln>)c).get(i);
            n += aoln.d;
            n2 += aoln.c;
            ++i;
        }
        if (n > 0L) {
            return n2 / (float)n;
        }
        return 0.0f;
    }
    
    private final ijk r(final ancy ancy, final amwb amwb) {
        Object failureReason = null;
        ajjv c;
        if (ancy != null) {
            c = ancy.c();
        }
        else {
            c = null;
        }
        aoxc h;
        if (ancy != null) {
            h = ancy.h();
        }
        else {
            h = null;
        }
        aowy transferState;
        if (h != null) {
            transferState = h.getTransferState();
        }
        else {
            transferState = null;
        }
        if (h != null) {
            failureReason = h.getFailureReason();
        }
        akwz akwz;
        if ((akwz = t(ancy).f) == null) {
            akwz = akwz.a;
        }
        Object o;
        if (h != null) {
            o = B(h);
        }
        else {
            o = afeq.q();
        }
        if (this.w(transferState, amwb, akwz, (List)o, c)) {
            if (x(akwz) && aakv.q(akwz)) {
                return ijk.f;
            }
            if (x(akwz)) {
                return ijk.g;
            }
            if (this.y(amwb, c)) {
                if (this.i(amwb, c)) {
                    return ijk.i;
                }
                return ijk.h;
            }
            else {
                if (z((List)o)) {
                    return ijk.l;
                }
                if (aowy.f.equals((Object)transferState) && aowz.b.equals(failureReason)) {
                    return ijk.j;
                }
                if (A(transferState)) {
                    return ijk.n;
                }
            }
        }
        else {
            if (aowy.g.equals((Object)transferState) || (h != null && q(ancy) == 1.0f)) {
                return ijk.a;
            }
            if (aowy.e.equals((Object)transferState)) {
                return ijk.e;
            }
            if (aowy.d.equals((Object)transferState)) {
                if (aowy.d.equals((Object)transferState) && aowz.c.equals(failureReason)) {
                    return ijk.k;
                }
                return ijk.c;
            }
        }
        return ijk.d;
    }
    
    private static ajjz s(final ajjv ajjv) {
        final String i = vgl.i(ajjv.e());
        if (aezr.f(i)) {
            return null;
        }
        for (final ajjz ajjz : ajjv.getLicenses()) {
            if ((ajjz.b & 0x80) != 0x0 && ajjz.i.equals(i)) {
                return ajjz;
            }
        }
        return null;
    }
    
    private static akxi t(final ancy ancy) {
        if (ancy != null) {
            final akxi akxi = (akxi)vlq.c(ancy.getPlayerResponseBytes().I(), (MessageLite)akxi.a);
            if (akxi != null) {
                return akxi;
            }
        }
        return akxi.a;
    }
    
    private static amvl u(final amwb amwb) {
        try {
            return (amvl)ahbh.parseFrom((ahbh)amvl.a, amwb.getOfflineStateBytes(), ExtensionRegistryLite.getGeneratedRegistry());
        }
        catch (final ahca ahca) {
            ttr.d("Failed to get Offline State.", (Throwable)ahca);
            return amvl.a;
        }
    }
    
    private final boolean v(final ancy ancy, final String s, final int n, final long n2) {
        aoxc h;
        if (ancy != null) {
            h = ancy.h();
        }
        else {
            h = null;
        }
        Object o;
        if (h != null) {
            o = B(h);
        }
        else {
            o = afeq.q();
        }
        for (final aoln aoln : o) {
            final int bc = aqsx.bc(aoln.e);
            if (bc != 0 && bc == 3) {
                final ajum ajum = (ajum)vlq.c(aoln.g.I(), (MessageLite)ajum.b);
                if (ajum == null) {
                    return false;
                }
                if (TimeUnit.MICROSECONDS.toSeconds(((xwk)this.i.a()).d(new FormatStreamModel(ajum, s, TimeUnit.SECONDS.toMillis(n)), 0L)) >= n2) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
    
    private final boolean w(final aowy aowy, final amwb amwb, final akwz akwz, final List list, final ajjv ajjv) {
        return A(aowy) || this.y(amwb, ajjv) || x(akwz) || z(list);
    }
    
    private static boolean x(final akwz akwz) {
        return !aakv.o(akwz);
    }
    
    private final boolean y(final amwb amwb, final ajjv ajjv) {
        boolean b = false;
        if (amwb != null) {
            if (amwb.getAction().equals((Object)amvy.b)) {
                if (this.i(amwb, ajjv)) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    private static boolean z(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final int af = aevy.aF(((aoln)iterator.next()).f);
            if (af != 0 && af == 4) {
                return true;
            }
        }
        return false;
    }
    
    public final long a(final amwb amwb) {
        if (amwb.getOfflineFutureUnplayableInfo() != null && amwb.getOfflineFutureUnplayableInfo().c >= 0L) {
            return Math.max(amwb.getLastUpdatedTimestampSeconds() + amwb.getOfflineFutureUnplayableInfo().c - TimeUnit.MILLISECONDS.toSeconds(this.e.c()), 0L);
        }
        return 0L;
    }
    
    public final ijk b(final amar amar) {
        final amam c = amar.c();
        amwb f = null;
        ancy f2;
        if (c != null) {
            f2 = c.f();
        }
        else {
            f2 = null;
        }
        if (f2 != null) {
            f = f2.f();
        }
        return this.r(f2, f);
    }
    
    public final ijk c(final apys apys) {
        return this.r(apys.f(), apys.c());
    }
    
    public final aezp d(final amwb amwb, final ancy ancy) {
        if (amwb != null && (amwb.b.c & 0x40) != 0x0) {
            return aezp.k((Object)amwb.getOnTapCommandOverrideData());
        }
        if (amwb != null && q(ancy) == 1.0f && (amwb.b.c & 0x10) != 0x0 && p(amwb) && this.a(amwb) == 0L) {
            Object o;
            if ((amwb.getOfflineFutureUnplayableInfo().b & 0x4) != 0x0) {
                amub amub;
                if ((amub = amwb.getOfflineFutureUnplayableInfo().e) == null) {
                    amub = amub.a;
                }
                o = aezp.k((Object)amub);
            }
            else {
                o = aeyo.a;
            }
            return (aezp)o;
        }
        return (aezp)aeyo.a;
    }
    
    final aiab e(final ajjv ajjv) {
        final ajjz s = s(ajjv);
        if (s == null) {
            return null;
        }
        if (s.f) {
            final ahaz builder = ((ahbh)aiab.a).createBuilder();
            final String string = this.d.getString(2132019307);
            builder.copyOnWrite();
            final aiab aiab = (aiab)builder.instance;
            string.getClass();
            aiab.b |= 0x1;
            aiab.c = string;
            return (aiab)builder.build();
        }
        Instant instant;
        if (ajjv.getPlaybackStartSeconds() > 0L) {
            instant = Instant.ofEpochSecond((long)ajjv.getPlaybackStartSeconds()).plus((TemporalAmount)Duration.ofSeconds(s.e));
        }
        else {
            instant = Instant.ofEpochSecond((long)ajjv.getLicenseExpirySeconds());
        }
        final Duration between = Duration.between((Temporal)Instant.ofEpochMilli(this.e.c()), (Temporal)instant);
        String d;
        String s2;
        if (between.compareTo(Duration.ofHours(1L)) < 0) {
            d = this.d.getString(2132019507);
            s2 = this.d.getString(2132019506);
        }
        else if (between.compareTo(Duration.ofDays(2L)) < 0) {
            final long hours = between.toHours();
            final Resources resources = this.d.getResources();
            final int n = (int)hours;
            final Integer value = n;
            d = resources.getQuantityString(2131886143, n, new Object[] { value });
            s2 = this.d.getResources().getQuantityString(2131886140, n, new Object[] { value });
        }
        else if (between.compareTo(Duration.ofDays(7L)) < 0) {
            final long days = between.toDays();
            final Resources resources2 = this.d.getResources();
            final int n2 = (int)days;
            final Integer value2 = n2;
            d = resources2.getQuantityString(2131886142, n2, new Object[] { value2 });
            s2 = this.d.getResources().getQuantityString(2131886139, n2, new Object[] { value2 });
        }
        else {
            final long n3 = between.toDays() / 7L;
            final Resources resources3 = this.d.getResources();
            final int n4 = (int)n3;
            final Integer value3 = n4;
            d = resources3.getQuantityString(2131886144, n4, new Object[] { value3 });
            s2 = this.d.getResources().getQuantityString(2131886141, n4, new Object[] { value3 });
        }
        final String string2 = this.d.getString(2132019512);
        final ahaz builder2 = ((ahbh)aiab.a).createBuilder();
        builder2.copyOnWrite();
        final aiab aiab2 = (aiab)builder2.instance;
        string2.getClass();
        aiab2.b |= 0x1;
        aiab2.c = string2;
        builder2.copyOnWrite();
        final aiab aiab3 = (aiab)builder2.instance;
        d.getClass();
        aiab3.b |= 0x2;
        aiab3.d = d;
        final StringBuilder sb = new StringBuilder();
        sb.append(string2);
        sb.append(", ");
        sb.append(s2);
        final String string3 = sb.toString();
        builder2.copyOnWrite();
        final aiab aiab4 = (aiab)builder2.instance;
        aiab4.b |= 0x4;
        aiab4.e = string3;
        return (aiab)builder2.build();
    }
    
    public final String g(long timeInMillis) {
        if (timeInMillis == 0L) {
            return "";
        }
        final long c = this.e.c();
        final long n = c - timeInMillis;
        if (n < 0L) {
            return "";
        }
        final Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(timeInMillis);
        final Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(c);
        timeInMillis = instance2.get(1);
        final long n2 = instance.get(1);
        final int value = instance2.get(2);
        final int value2 = instance.get(2);
        final int value3 = instance2.get(5);
        final int value4 = instance.get(5);
        final long n3 = timeInMillis = (timeInMillis - n2) * 12L + (value - value2);
        if (value3 < value4) {
            timeInMillis = n3 - 1L;
        }
        if (timeInMillis >= 12L) {
            return cjh.g(this.d, 2132020208, new Object[] { "count", timeInMillis / 12L });
        }
        if (timeInMillis > 0L) {
            return cjh.g(this.d, 2132018668, new Object[] { "count", timeInMillis });
        }
        timeInMillis = TimeUnit.MILLISECONDS.toDays(n);
        final long n4 = timeInMillis / 7L;
        if (n4 > 0L) {
            return cjh.g(this.d, 2132020205, new Object[] { "count", n4 });
        }
        if (timeInMillis > 0L) {
            return cjh.g(this.d, 2132017838, new Object[] { "count", timeInMillis });
        }
        timeInMillis = TimeUnit.MILLISECONDS.toHours(n);
        if (timeInMillis > 0L) {
            return cjh.g(this.d, 2132018161, new Object[] { "count", timeInMillis });
        }
        timeInMillis = TimeUnit.MILLISECONDS.toMinutes(n);
        if (timeInMillis > 0L) {
            return cjh.g(this.d, 2132018665, new Object[] { "count", timeInMillis });
        }
        timeInMillis = TimeUnit.MILLISECONDS.toSeconds(n);
        return cjh.g(this.d, 2132019663, new Object[] { "count", Math.max(1L, timeInMillis) });
    }
    
    public final String h(final long n, final boolean b) {
        final int x = fbu.x(n);
        if (x <= 60) {
            if (b) {
                return this.d.getResources().getQuantityString(2131886102, x, new Object[] { x });
            }
            return this.d.getResources().getQuantityString(2131886099, x, new Object[] { x });
        }
        else {
            final int w = fbu.w(n);
            if (w <= 24) {
                if (b) {
                    return this.d.getResources().getQuantityString(2131886101, w, new Object[] { w });
                }
                return this.d.getResources().getQuantityString(2131886098, w, new Object[] { w });
            }
            else {
                final int v = fbu.v(n);
                if (b) {
                    return this.d.getResources().getQuantityString(2131886100, v, new Object[] { v });
                }
                return this.d.getResources().getQuantityString(2131886097, v, new Object[] { v });
            }
        }
    }
    
    public final boolean i(final amwb amwb, final ajjv ajjv) {
        if (ajjv != null) {
            final ajjz s = s(ajjv);
            if (s != null && !s.f) {
                final Instant ofEpochMilli = Instant.ofEpochMilli(this.e.c());
                boolean b;
                if (ajjv.getPlaybackStartSeconds() > 0L) {
                    b = ofEpochMilli.isAfter(Instant.ofEpochSecond((long)ajjv.getPlaybackStartSeconds()).plus((TemporalAmount)Duration.ofSeconds(s.e)));
                }
                else {
                    b = ofEpochMilli.isAfter(Instant.ofEpochSecond((long)ajjv.getLicenseExpirySeconds()));
                }
                if (b) {
                    return true;
                }
            }
        }
        if (amwb != null) {
            final long seconds = TimeUnit.MILLISECONDS.toSeconds(this.e.c());
            final long longValue = amwb.getExpirationTimestamp();
            final long n = u(amwb).g;
            final boolean b2 = p(amwb) && this.a(amwb) == 0L;
            final long longValue2 = amwb.getExpirationTimestamp();
            final long b3 = iiu.b;
            return seconds > longValue2 || seconds < longValue - n - b3 || b2;
        }
        return false;
    }
    
    public final boolean j(final amwb amwb, final ajjv ajjv) {
        return amwb != null && this.i(amwb, ajjv) && amwb.getExpirationTimestamp() + iiu.a <= TimeUnit.MILLISECONDS.toSeconds(this.e.c());
    }
    
    public final boolean k(final apys apys) {
        return this.l(apys.f(), apys.c());
    }
    
    public final boolean l(final ancy ancy, final amwb amwb) {
        final aoln aoln = null;
        aoxc h;
        if (ancy != null) {
            h = ancy.h();
        }
        else {
            h = null;
        }
        aowy transferState;
        if (h != null) {
            transferState = h.getTransferState();
        }
        else {
            transferState = null;
        }
        akwz akwz;
        if ((akwz = t(ancy).f) == null) {
            akwz = akwz.a;
        }
        Object o;
        if (h != null) {
            o = B(h);
        }
        else {
            o = afeq.q();
        }
        ajjv c;
        if (ancy != null) {
            c = ancy.c();
        }
        else {
            c = null;
        }
        if (this.w(transferState, amwb, akwz, (List)o, c)) {
            return false;
        }
        final Iterator iterator = ((List)o).iterator();
        aoln aoln2 = null;
        aoln aoln3 = aoln;
        while (iterator.hasNext()) {
            final aoln aoln4 = (aoln)iterator.next();
            final int e = aoln4.e;
            final int bc = aqsx.bc(e);
            if (bc != 0) {
                if (bc == 2) {
                    aoln3 = aoln4;
                    continue;
                }
            }
            final int bc2 = aqsx.bc(e);
            if (bc2 != 0 && bc2 == 3) {
                aoln2 = aoln4;
            }
        }
        if (aoln3 != null && aoln2 != null && aoln3.c == aoln3.d) {
            final long c2 = aoln2.c;
            if (c2 > 0L && c2 < aoln2.d) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean m(final amar amar, final long n) {
        final amam c = amar.c();
        amwb f = null;
        ancy f2;
        if (c != null) {
            f2 = c.f();
        }
        else {
            f2 = null;
        }
        if (f2 != null) {
            f = f2.f();
        }
        return this.l(f2, f) && !this.v(f2, amar.getVideoId(), amar.getLengthSeconds(), n);
    }
    
    public final boolean n(final apys apys, final long n) {
        if (this.k(apys)) {
            final apzm g = apys.g();
            if (g != null) {
                if (this.v(apys.f(), g.getVideoId(), g.getLengthSeconds(), n)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final String o(final ijk ijk, final ancy ancy, final amwb amwb, int n) {
        if (ijk.equals(ijk.a) && !p(amwb)) {
            return "";
        }
        String s = null;
        Label_1196: {
            if (ijk.equals(ijk.c)) {
                s = this.d.getString(2132017937, new Object[] { (int)Math.max(0.0f, Math.min(q(ancy) * 100.0f, 100.0f)) });
            }
            else {
                if (amwb != null) {
                    final amvl u = u(amwb);
                    if (u != null && (u.b & 0x10) != 0x0) {
                        s = u.i;
                        break Label_1196;
                    }
                }
                final int ordinal = ijk.ordinal();
                Object o = null;
                Label_1106: {
                    if (ordinal != 0) {
                        if (ordinal == 13) {
                            o = aezp.k((Object)2132017927);
                            break Label_1106;
                        }
                        switch (ordinal) {
                            case 11: {
                                o = aezp.k((Object)2132017931);
                                break Label_1106;
                            }
                            case 10: {
                                o = aezp.k((Object)2132017947);
                                break Label_1106;
                            }
                            case 9: {
                                o = aezp.k((Object)2132017921);
                                break Label_1106;
                            }
                            case 8: {
                                ajjv c;
                                if (ancy != null) {
                                    c = ancy.c();
                                }
                                else {
                                    c = null;
                                }
                                if (amwb != null) {
                                    amus amus;
                                    if ((amus = amus.b(u(amwb).j)) == null) {
                                        amus = amus.a;
                                    }
                                    if (amus == amus.d) {
                                        o = aezp.k((Object)2132017926);
                                        break Label_1106;
                                    }
                                    if (p(amwb)) {
                                        o = aezp.k((Object)2132017918);
                                        break Label_1106;
                                    }
                                }
                                if (c != null) {
                                    final ajjz s2 = s(c);
                                    if (s2 != null && !s2.f) {
                                        o = aezp.k((Object)2132019503);
                                        break Label_1106;
                                    }
                                }
                                if (!this.f.o()) {
                                    o = aezp.k((Object)2132017924);
                                    break Label_1106;
                                }
                                if (this.g.a) {
                                    o = aezp.k((Object)2132017946);
                                    break Label_1106;
                                }
                                o = aezp.k((Object)2132017923);
                                break Label_1106;
                            }
                            case 6:
                            case 7: {
                                o = aezp.k((Object)2132017935);
                                break Label_1106;
                            }
                            case 5: {
                                final akxi t = t(ancy);
                                if ((t.b & 0x4) == 0x0) {
                                    o = aezp.k((Object)2132017935);
                                    break Label_1106;
                                }
                                akwz akwz;
                                if ((akwz = t.f) == null) {
                                    akwz = akwz.a;
                                }
                                if ((n = aqsx.cG(akwz.c)) == 0) {
                                    n = 1;
                                }
                                if (--n == 4) {
                                    o = aezp.k((Object)2132017934);
                                    break Label_1106;
                                }
                                if (n != 5) {
                                    o = aezp.k((Object)2132017935);
                                    break Label_1106;
                                }
                                o = aezp.k((Object)2132017933);
                                break Label_1106;
                            }
                            case 4: {
                                o = aezp.k((Object)2132017939);
                                break Label_1106;
                            }
                            case 3: {
                                if (!this.f.o()) {
                                    if (n == 3) {
                                        o = aezp.k((Object)2132017944);
                                        break Label_1106;
                                    }
                                    o = aezp.k((Object)2132017942);
                                    break Label_1106;
                                }
                                else {
                                    int n2 = n;
                                    Label_0777: {
                                        if (this.j.e()) {
                                            final aqra w = ((aaec)this.h.a()).w();
                                            int n3 = n;
                                            if (w != aqra.c) {
                                                n2 = n;
                                                if (w == aqra.b || (n2 = n) != 2) {
                                                    break Label_0777;
                                                }
                                                n3 = 2;
                                            }
                                            if (this.f.r()) {
                                                n2 = n3;
                                                if (!this.f.i()) {
                                                    break Label_0777;
                                                }
                                            }
                                            n2 = n3;
                                            if (!this.f.q()) {
                                                if (this.l.p()) {
                                                    o = aezp.k((Object)2132017945);
                                                    break Label_1106;
                                                }
                                                o = aezp.k((Object)2132017944);
                                                break Label_1106;
                                            }
                                        }
                                    }
                                    if ((((aaec)this.h.a()).w() == aqra.b || (!this.j.e() && ((aaec)this.h.a()).w() != aqra.d) || n2 == 3) && (!this.f.o() || !this.f.r() || this.f.i())) {
                                        o = aezp.k((Object)2132017944);
                                        break Label_1106;
                                    }
                                    final afkf d = C(ancy).D();
                                    long n4 = 0L;
                                    long n5 = 0L;
                                    while (((Iterator)d).hasNext()) {
                                        final aoln aoln = (aoln)((Iterator)d).next();
                                        n5 += aoln.c;
                                        n4 += aoln.d;
                                    }
                                    final long t2 = this.k.t();
                                    if (n4 > 0L && t2 < n4 - n5) {
                                        o = aezp.k((Object)2132017943);
                                        break Label_1106;
                                    }
                                    o = aezp.k((Object)2132017948);
                                    break Label_1106;
                                }
                                break;
                            }
                        }
                    }
                    else if (amwb != null && p(amwb)) {
                        final long a = this.a(amwb);
                        if ((int)TimeUnit.SECONDS.toMinutes(a) <= 60) {
                            n = 2131886102;
                        }
                        else if ((int)TimeUnit.SECONDS.toHours(a) <= 24) {
                            n = 2131886101;
                        }
                        else {
                            n = 2131886100;
                        }
                        o = aezp.k((Object)n);
                        break Label_1106;
                    }
                    o = aeyo.a;
                }
                if (((aezp)o).h()) {
                    n = (int)((aezp)o).c();
                    if (amwb != null && (n == 2131886100 || n == 2131886101 || n == 2131886102)) {
                        s = this.h(this.a(amwb), true);
                    }
                    else {
                        s = this.d.getString(n);
                    }
                }
                else {
                    s = this.d.getString(2132017927);
                }
            }
        }
        if (!ijk.p && this.l(ancy, amwb)) {
            final String string = this.d.getString(2132017938);
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("\n");
            sb.append(string);
            return sb.toString();
        }
        return s;
    }
}
