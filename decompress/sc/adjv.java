import java.util.Collection;
import android.net.Uri;
import j$.util.Optional;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.graphics.Bitmap;
import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.HashSet;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import android.content.Context;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjv implements adkb
{
    public static final int t = 0;
    private static final Duration u;
    private final adet A;
    public final Context a;
    public final oby b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final Executor e;
    public final Executor f;
    public final adku g;
    public final arkg h;
    public final adld i;
    public final adpp j;
    public final adlp k;
    public final adln l;
    final adle m;
    public final boolean n;
    final Map o;
    public final Map p;
    public final Map q;
    public final Set r;
    public final ziy s;
    private final Executor v;
    private final adkm w;
    private final Map x;
    private final adet y;
    private final arwh z;
    
    static {
        u = Duration.ofHours(24L);
    }
    
    public adjv(final Context a, final oby b, final Map x, final Executor v, final Executor c, final ScheduledExecutorService d, final Executor f, final arwh z, final ziy s, final adkm w, final adku g, final adpp j, final arkg h, final adld i, final adet a2, final adlp k, final adln l, final adet y, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.o = new HashMap();
        this.p = (Map)new ConcurrentHashMap();
        this.q = (Map)new ConcurrentHashMap();
        this.r = Collections.synchronizedSet(new HashSet<Object>());
        this.a = a;
        this.b = b;
        this.x = x;
        this.f = f;
        this.z = z;
        this.s = s;
        this.w = w;
        this.g = g;
        this.j = j;
        this.h = h;
        this.A = a2;
        this.k = k;
        final adju m = new adju(this);
        this.m = m;
        l.getClass();
        this.l = l;
        this.y = y;
        (this.i = i).p(m);
        this.v = v;
        this.c = c;
        this.d = d;
        this.e = afwm.g(c);
        this.n = ((vai)s.c).f(45366472L);
    }
    
    private final ListenableFuture U(final ListenableFuture listenableFuture, final String s, final String s2, final String s3) {
        final Long n = (Long)((vai)this.s.e).n(45358403L).aM();
        ListenableFuture t = listenableFuture;
        if (n > 0L) {
            t = afwm.t(listenableFuture, (long)n, TimeUnit.SECONDS, this.d);
        }
        teu.j(t, this.c, (tes)new gfr(this, s, s2, s3, 6));
        return t;
    }
    
    private final ListenableFuture V(final String s, final boolean b, final aphu aphu) {
        final ListenableFuture p3 = afnd.p((afty)new adjq(this, s, aphu, b), this.e);
        final Long n = (Long)((vai)this.s.c).n(45364157L).aM();
        ListenableFuture t = p3;
        if (n > 0L) {
            t = afwm.t(p3, (long)n, TimeUnit.SECONDS, this.d);
        }
        teu.k(t, this.c, (tes)new achh(this, s, 6), (tet)new xor(this, s, 8));
        return t;
    }
    
    private final ListenableFuture W(final String s, final Bitmap bitmap, final asjr asjr) {
        return this.U(this.m(s, afnd.p((afty)new phu(this, s, bitmap, asjr, 7), this.e)), s, "Failed to set video file thumbnail.", "setVideoFileThumbnail");
    }
    
    private final List X(final String s) {
        synchronized (this) {
            final List list = this.o.get(s);
            if (list != null) {
                return list;
            }
            return new ArrayList();
        }
    }
    
    public final Set A(final asjs asjs, final aphu aphu) {
        final HashSet set = new HashSet();
        for (final admv admv : this.g.d((aezs)aadz.n).values()) {
            if (asjs.a((Object)admv) && !this.r.contains(admv.k)) {
                this.D(admv.k, true);
                this.I(admv, aphu);
                set.add(admv.k);
            }
        }
        return set;
    }
    
    @Override
    public final void B(final String s, final adkg adkg) {
        synchronized (this) {
            final boolean empty = TextUtils.isEmpty((CharSequence)s);
            boolean b = true;
            adkp.H(empty ^ true);
            adkg.getClass();
            CopyOnWriteArrayList list;
            if ((list = this.o.get(s)) == null) {
                list = new CopyOnWriteArrayList();
                if (this.o.put(s, list) != null) {
                    b = false;
                }
                adkp.Q(b);
            }
            list.addIfAbsent(adkg);
        }
    }
    
    public final void C(final admv admv) {
        if (adds.af(admv)) {
            final aezp ag = adds.ag(admv);
            if (ag.h()) {
                this.p.put(admv.k, ag.c());
            }
        }
    }
    
    public final void D(final String s, final boolean b) {
        this.p.remove(s);
        boolean b2 = b;
        if (this.n) {
            if (!b) {
                return;
            }
            b2 = true;
        }
        this.q.remove(s);
        if (b2) {
            this.l.d(s);
        }
    }
    
    @Override
    public final void E(final String s, final apht apht) {
        this.k.e(s, null, apht);
    }
    
    @Override
    public final void F(final String s, final apho apho) {
        this.k.g(s, apho);
    }
    
    public final void G(final String s, final adlq adlq) {
        final admv b = adlq.b;
        if (b == null || (b.b & 0x80) == 0x0) {
            return;
        }
        admt admt;
        if ((admt = admt.a(b.l)) == null) {
            admt = admt.a;
        }
        final adpk adpk = this.x.get(admt.h);
        if (adpk != null) {
            if (adpk.a(adlq)) {
                if (this.j.e(s) || this.j.f(s)) {
                    this.j.i(s, (boolean)(boolean)((vai)this.s.c).l(45362282L).aM());
                }
                final adjz adjz = this.q.get(s);
                if (adjz != null) {
                    final Map q = this.q;
                    final adjy b2 = adjz.b();
                    b2.f(false);
                    q.put(s, b2.a());
                }
                this.g.a(s, adpk.b());
                if (!this.j.d(s)) {
                    this.A.g("Unconfirmed UploadFlow execution was not scheduled.");
                    ttr.c("UploadClientApi", "Unconfirmed UploadFlow execution was not scheduled.");
                    this.k.g(s, apho.g);
                }
            }
            return;
        }
        throw new UnsupportedOperationException("Cannot reset unknown Upload flavor.");
    }
    
    @Override
    public final void H(final adkg adkg) {
        monitorenter(this);
        try {
            adkg.getClass();
            final Iterator iterator = this.o.entrySet().iterator();
            while (iterator.hasNext()) {
                final CopyOnWriteArrayList list = ((Map.Entry<K, CopyOnWriteArrayList>)iterator.next()).getValue();
                if (list != null && list.contains(adkg)) {
                    list.remove(adkg);
                    if (!list.isEmpty()) {
                        continue;
                    }
                    iterator.remove();
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void I(final admv admv, final aphu aphu) {
        adkp.I(admv.x ^ true, "Removal is allowed for the only unconfirmed uploads.");
        final String k = admv.k;
        this.k.f(k, null, aphu);
        if ((admv.b & 0x80) == 0x0) {
            this.g.a(k, new adkw(1));
            if ((admv.d & 0x4) != 0x0) {
                vdh.bf(new File(admv.ap));
            }
            if ((admv.d & 0x8) != 0x0) {
                final String parent = new File(admv.aq).getParent();
                if (!TextUtils.isEmpty((CharSequence)parent)) {
                    vdh.bf(new File(parent));
                }
            }
            return;
        }
        this.j.h(k);
    }
    
    public final void J(final String s, final apho apho, final String s2, final Throwable t) {
        this.K(s, apho, s2, t, (aezp)aeyo.a);
    }
    
    public final void K(final String s, final apho apho, final String s2, final Throwable t, final aezp aezp) {
        if (t == null) {
            this.A.g(s2);
            ttr.m("UploadClientApi", s2);
        }
        else {
            this.A.h(s2, t);
            ttr.o("UploadClientApi", s2, t);
        }
        final adjz adjz = this.q.get(s);
        if (adjz != null) {
            final Map q = this.q;
            final adjy b = adjz.b();
            b.c(true);
            q.put(s, b.a());
        }
        final Iterator iterator = this.X(s).iterator();
        while (iterator.hasNext()) {
            ((adkg)iterator.next()).b(s);
        }
        this.k.h(s, apho, (Optional)aezp.b((aezf)abvp.n).e((Object)Optional.empty()));
    }
    
    public final void L(final String s) {
        final adjz adjz = this.q.get(s);
        if (adjz != null) {
            if (!adjz.g) {
                this.k.g(s, apho.f);
            }
            final Map q = this.q;
            final adjy b = adjz.b();
            b.f(true);
            q.put(s, b.a());
        }
        final Iterator iterator = this.X(s).iterator();
        while (iterator.hasNext()) {
            ((adkg)iterator.next()).a(s);
        }
    }
    
    public final void M(final String s) {
        this.A.g(s);
        ttr.c("UploadClientApi", s);
    }
    
    public final void N(final String s, final Throwable t) {
        this.A.h(s, t);
        ttr.f("UploadClientApi", s, t);
    }
    
    @Override
    public final void O(final String s, final zme zme, final aphs aphs, final boolean b) {
        sl.c((ace)new adjs(this, s, zme, aphs, b));
    }
    
    @Override
    public final void P(final String s, final admo admo) {
        this.U(this.e(s, (asjs)adjn.e, (asjr)ablr.r, adjr.a, admo), s, "Failed to set video media store metadata.", "setMediaStoreVideoMetadata");
    }
    
    @Override
    public final void Q(final String s, final akui akui) {
        this.U(this.e(s, (asjs)adjn.d, (asjr)ablr.t, adjr.e, akui), s, "Failed to set MetadataUpdateRequest.", "setMetadataUpdateRequest");
    }
    
    @Override
    public final void R(final String s, final admw admw) {
        this.U(this.e(s, (asjs)adjn.f, (asjr)ablr.s, adjr.c, admw), s, "Failed to set UploadMediaStorageInfo.", "setUploadMediaStorageInfo");
    }
    
    @Override
    public final void S(final String s, final admz admz) {
        this.U(this.e(s, (asjs)adjn.k, (asjr)adjt.f, adjr.i, admz), s, "Failed to set UploadMetadataProto.", "setUploadMetadataProto");
    }
    
    @Override
    public final ListenableFuture T(final String s, final int n) {
        return this.U(this.e(s, (asjs)adjn.h, (asjr)adjt.a, adjr.f, adjx.j(n)), s, "Failed to set UploadFlowFlavor.", "setUploadFlowFlavor");
    }
    
    public final adjz a(final admv admv) {
        final adjy a = adjz.a();
        a.d(admv.k);
        if ((admv.b & 0x4) != 0x0) {
            a.a = Uri.parse(admv.g);
        }
        a.g(admv.ap);
        a.e(admv.aq);
        a.b(admv.x);
        if (admv.q && (admv.b & 0x2000) != 0x0) {
            a.b = Optional.of((Object)admv.p);
        }
        final adjz adjz = this.q.get(admv.k);
        final boolean b = true;
        a.f(adjz != null && adjz.g);
        a.c(adjz != null && adjz.f && b);
        final adjz a2 = a.a();
        this.q.put(admv.k, a2);
        return a2;
    }
    
    public final adjz b(admv b, final adlq adlq) {
        if (adlq != null) {
            b = adlq.b;
            b.getClass();
        }
        return this.a(b);
    }
    
    @Override
    public final aezp c(final String s) {
        return aezp.j((Object)this.q.get(s));
    }
    
    @Override
    public final ListenableFuture d(final String s, final aphu aphu) {
        return this.V(s, false, aphu);
    }
    
    final ListenableFuture e(final String s, final asjs asjs, final asjr asjr, final asji asji, final Object o) {
        return afnd.p((afty)new adjp(this, s, o, asjs, asjr, asji), this.e);
    }
    
    @Override
    public final ListenableFuture f(final String s, final aphu aphu) {
        return this.V(s, true, aphu);
    }
    
    @Override
    public final ListenableFuture g(final String s) {
        return this.U(this.i(s, (asjr)ablr.p), s, "Failed to clear CreateCommentParams.", "clearCreateCommentParams");
    }
    
    @Override
    public final ListenableFuture h(final String s) {
        return this.U(this.i(s, (asjr)ablr.u), s, "Failed to clear the files to delete after upload.", "clearFilesToDeleteAfterUpload");
    }
    
    final ListenableFuture i(final String s, final asjr asjr) {
        return afnd.p((afty)new jlw(this, asjr, s, 12), this.e);
    }
    
    @Override
    public final ListenableFuture j(final String s) {
        return this.U(this.i(s, (asjr)adjt.e), s, "Failed to clear VideoShortsCreation.", "clearVideoShortsCreation");
    }
    
    final ListenableFuture k(final String k, final aphp aphp, final Set set) {
        teu.j(afnd.p((afty)new adef(this, set, 6), this.c), this.c, (tes)new wyh(this, 15));
        apin apin;
        if ((apin = this.z.f().h) == null) {
            apin = apin.a;
        }
        final boolean y = aphp == aphp.d && (boolean)(boolean)((vai)this.s.a).l(45355204L).aM();
        final ahaz builder = ((ahbh)admv.a).createBuilder();
        builder.copyOnWrite();
        final admv admv = (admv)builder.instance;
        k.getClass();
        admv.b |= 0x40;
        admv.k = k;
        final long c = this.b.c();
        builder.copyOnWrite();
        final admv admv2 = (admv)builder.instance;
        admv2.b |= 0x8;
        admv2.h = c;
        builder.copyOnWrite();
        admv.a((admv)builder.instance);
        builder.copyOnWrite();
        final admv admv3 = (admv)builder.instance;
        admv3.b |= 0x2000000;
        admv3.x = false;
        builder.copyOnWrite();
        final admv admv4 = (admv)builder.instance;
        admv4.b |= 0x1000000;
        admv4.w = true;
        builder.copyOnWrite();
        admv.b((admv)builder.instance);
        builder.copyOnWrite();
        final admv admv5 = (admv)builder.instance;
        admv5.b |= 0x4000000;
        admv5.y = y;
        builder.copyOnWrite();
        final admv admv6 = (admv)builder.instance;
        admv6.v = 1;
        admv6.b |= 0x100000;
        this.y.e(k, builder);
        adpp.n(builder);
        if (apin.j > 0L && apin.k > 0L) {
            builder.copyOnWrite();
            final admv admv7 = (admv)builder.instance;
            admv7.b |= Integer.MIN_VALUE;
            admv7.D = true;
        }
        final admv admv8 = (admv)builder.build();
        this.a(admv8);
        final Long n = (Long)((vai)this.s.e).n(45358380L).aM();
        ListenableFuture listenableFuture = afnd.p((afty)new phu(this, k, admv8, aphp, 8), this.e);
        if (n > 0L) {
            listenableFuture = afwm.t(listenableFuture, (long)n, TimeUnit.SECONDS, this.d);
        }
        return listenableFuture;
    }
    
    @Override
    public final ListenableFuture l(final String s) {
        final adef adef = new adef(this, s, 7);
        Executor executor;
        if (this.n) {
            executor = this.v;
        }
        else {
            executor = this.e;
        }
        final ListenableFuture p = afnd.p((afty)adef, executor);
        teu.j(p, this.c, (tes)new wyh(this, 16));
        return p;
    }
    
    final ListenableFuture m(final String s, final ListenableFuture listenableFuture) {
        return aftq.f(listenableFuture, (aftz)new xow(this, s, 9), this.e);
    }
    
    @Override
    public final ListenableFuture n(final String s, final String s2) {
        return this.U(this.e(s, (asjs)adjn.c, (asjr)ablr.q, adjr.b, s2), s, "Failed to set CreateCommentParams.", "setCreateCommentParams");
    }
    
    @Override
    public final ListenableFuture o(final String s, final afeq afeq) {
        return this.U(this.e(s, (asjs)adjn.i, (asjr)adjt.c, adjr.g, afeq), s, "Failed to set the files to delete after upload.", "setFilesToDeleteAfterUpload");
    }
    
    @Override
    public final ListenableFuture p(final String s, final Uri uri) {
        return this.U(this.m(s, afnd.p((afty)new jlw(this, s, uri, 13), this.e)), s, "Failed to set source Uri.", "setSourceUri");
    }
    
    @Override
    public final ListenableFuture q(final String s, final Uri uri) {
        return this.U(this.e(s, (asjs)adjn.g, (asjr)adjt.b, adjr.d, uri.toString()), s, "Failed to set upload Uri.", "setUploadUri");
    }
    
    @Override
    public final ListenableFuture r(final String s, final Bitmap bitmap, final adka adka) {
        return this.W(s, bitmap, (asjr)new abqq(adka, 6));
    }
    
    @Override
    public final ListenableFuture s(final String s, final Bitmap bitmap) {
        return this.W(s, bitmap, (asjr)ablr.m);
    }
    
    @Override
    public final ListenableFuture t(final String s, final apos apos) {
        return this.U(this.e(s, (asjs)adjn.a, (asjr)ablr.o, (asji)uxv.t, apos), s, "Failed to set VideoShortsCreation.", "setVideoShortsCreation");
    }
    
    @Override
    public final ListenableFuture u(final String s, final afeq afeq) {
        return this.U(this.e(s, (asjs)adjn.j, (asjr)adjt.d, adjr.h, afeq), s, "Failed to set VoiceoverSegments.", "setVoiceoverSegments");
    }
    
    @Override
    public final ListenableFuture v(final String s, final float n) {
        return this.U(this.e(s, (asjs)adjn.b, (asjr)ablr.n, (asji)uxv.s, n), s, "Failed to set VoiceoverVolume.", "setVoiceoverVolume");
    }
    
    public final Duration w() {
        Duration duration = adjv.u;
        if ((this.z.f().b & 0x1000) != 0x0) {
            apin apin;
            if ((apin = this.z.f().h) == null) {
                apin = apin.a;
            }
            final long y = apin.y;
            duration = duration;
            if (y > 0L) {
                try {
                    duration = Duration.ofHours(y);
                }
                catch (final ArithmeticException ex) {
                    this.N("Failed to convert clean up time to hours.", ex);
                    duration = adjv.u;
                }
            }
        }
        return duration;
    }
    
    @Override
    public final String x(final aphp aphp, final adkg adkg) {
        return this.y(aphp, null, adkg);
    }
    
    @Override
    public final String y(final aphp aphp, String a, final adkg adkg) {
        final adkm w = this.w;
        final vdh c = w.c;
        a = w.a(a, vdh.bc(), aphp, 0);
        if (adkg != null) {
            this.B(a, adkg);
        }
        teu.j(this.k(a, aphp, (Set)afft.s((Object)a)), this.c, (tes)new achh(this, a, 5));
        return a;
    }
    
    @Override
    public final List z(final int n, final aphp aphp, final adkg adkg) {
        final adkm w = this.w;
        adkp.H(true);
        final ArrayList list = new ArrayList(n);
        final vdh c = w.c;
        final String bc = vdh.bc();
        for (int i = 0; i < n; ++i) {
            list.add(w.a(null, bc, aphp, i));
        }
        for (final String s : list) {
            this.B(s, adkg);
            teu.j(this.k(s, aphp, (Set)afft.p((Collection)list)), this.c, (tes)new achh(this, s, 7));
        }
        return list;
    }
}
