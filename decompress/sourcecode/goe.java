import android.app.AlertDialog$Builder;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.HashMap;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import java.util.function.Supplier;
import android.content.Intent;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.os.Bundle;
import j$.util.Map$_EL;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import android.view.WindowManager$BadTokenException;
import android.content.DialogInterface$OnClickListener;
import java.util.Map;
import java.util.function.Function;
import com.google.android.apps.youtube.app.common.ui.pip.PipObserver;
import j$.util.Optional;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class goe implements vau
{
    private final cya A;
    private final lht B;
    private final fzo C;
    private final fzo D;
    private final avt E;
    private final aeby F;
    public final xlv a;
    public final oas b;
    public final aceo c;
    public xlt d;
    private final Context f;
    private final hmm g;
    private final hqv h;
    private final arhr i;
    private final Optional j;
    private final wwu k;
    private final Optional l;
    private final hnd m;
    private final tme n;
    private final fjz o;
    private final PipObserver p;
    private final vbq r;
    private final hrm s;
    private Optional t;
    private final uyf u;
    private final uyi v;
    private final uyi w;
    private final uyi x;
    private final arud y;
    private final cya z;
    
    public goe(final Context f, final xlv a, final cya z, final hmm g, final hqv h, final fzo d, final fzo c, final oas b, final arhr i, final wwu k, final Optional j, final Optional l, final hnd m, final uyi v, final uyi w, final cya a2, final tme n, final aeby f2, final fjz o, final uyf u, final arud y, final uyi x, final PipObserver p35, final aceo c2, final vbq r, final avt e, final hrm s, final lht b2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.t = Optional.empty();
        this.f = f;
        this.a = a;
        this.z = z;
        this.g = g;
        this.h = h;
        this.D = d;
        this.C = c;
        this.b = b;
        this.i = i;
        this.k = k;
        this.j = j;
        this.l = l;
        this.m = m;
        this.v = v;
        this.w = w;
        this.n = n;
        this.F = f2;
        this.o = o;
        this.u = u;
        this.y = y;
        this.x = x;
        this.A = a2;
        this.p = p35;
        this.c = c2;
        this.r = r;
        this.E = e;
        this.s = s;
        this.B = b2;
    }
    
    private final Optional c() {
        return Optional.ofNullable((Object)this.y).map((Function)gnq.n);
    }
    
    private final void d(final String s) {
        if (this.c().map((Function)gnq.i).orElse((Object)false)) {
            this.g.c(s);
        }
    }
    
    private final void e(final aioe aioe, final Map map, final String s, final boolean b, final Map map2) {
        try {
            ((AlertDialog$Builder)this.F.af(this.f)).setTitle(2132019387).setMessage(2132019386).setPositiveButton(2132018938, (DialogInterface$OnClickListener)new sll(this, aioe, map, s, b, map2, 1)).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).create().show();
            final wwu k = this.k;
            if (k != null && k.n() != null) {
                this.k.n().l((wxz)new wws(wya.c(135786)));
            }
        }
        catch (final WindowManager$BadTokenException ex) {}
    }
    
    public final void b(aioe aioe, final Map map, final long n, final String s, final boolean b, final Map map2) {
        final aioe aioe2 = aioe;
        final boolean rs = ((agzd)aioe2).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        final Boolean value = false;
        aioe = aioe2;
        if (rs) {
            aioe = aioe2;
            if (!((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe2).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).l) {
                aioe = aioe2;
                if (this.c().map((Function)gnq.h).orElse((Object)value)) {
                    aioe = this.D.Q(aioe2);
                }
            }
        }
        final int b2 = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).b;
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = null;
        aioe a = null;
        Label_0462: {
            if ((b2 & 0x100000) != 0x0) {
                final vbq r = this.r;
                if (r != null) {
                    final vbp b3 = r.b();
                    final anrp anrp = (anrp)((vdo)b3).f(((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).t).j((Class)anrp.class).q((asix)fts.u).G((asjd)new fdl(ahab.class, 10)).af();
                    Label_0415: {
                        if (anrp != null) {
                            Object updatedEndpointProto = null;
                            Label_0259: {
                                if (anrp.f()) {
                                    updatedEndpointProto = anrp.getUpdatedEndpointProto();
                                }
                                else {
                                    if (anrp.c()) {
                                        try {
                                            updatedEndpointProto = agzi.parseFrom((agzi)aioe.a, anrp.getUpdatedEndpoint(), ExtensionRegistryLite.getGeneratedRegistry());
                                            break Label_0259;
                                        }
                                        catch (final ahab ahab) {
                                            trn.d("Error parsing bytes for updated ReelWatchEndpoint.", (Throwable)ahab);
                                        }
                                    }
                                    updatedEndpointProto = null;
                                }
                            }
                            if (updatedEndpointProto != null && ((agzd)updatedEndpointProto).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                                final agza builder = ((agzi)((agzd)updatedEndpointProto).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).toBuilder();
                                if (!((ReelWatchEndpointOuterClass$ReelWatchEndpoint)builder.instance).C.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint2.C)) {
                                    final String c = reelWatchEndpointOuterClass$ReelWatchEndpoint2.C;
                                    builder.copyOnWrite();
                                    final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint3 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)builder.instance;
                                    c.getClass();
                                    reelWatchEndpointOuterClass$ReelWatchEndpoint3.b |= 0x20000000;
                                    reelWatchEndpointOuterClass$ReelWatchEndpoint3.C = c;
                                }
                                final agzc agzc = (agzc)((agzi)aioe).toBuilder();
                                agzc.e((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, (Object)builder.build());
                                a = (aioe)((agza)agzc).build();
                                break Label_0415;
                            }
                        }
                        a = aioe;
                    }
                    final vcb e = ((vbw)b3).e();
                    ((vdv)e).g(((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).t);
                    ((vdv)e).b().U();
                    break Label_0462;
                }
            }
            a = aioe;
        }
        final abhx d = PlaybackStartDescriptor.d();
        d.a = a;
        final PlaybackStartDescriptor a2 = d.a();
        amvn amvn;
        if ((amvn = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)a).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).m) == null) {
            amvn = amvn.a;
        }
        final int b4 = amvn.b;
        final boolean booleanValue = (boolean)this.c().map((Function)gnq.l).orElse((Object)value);
        final boolean booleanValue2 = (boolean)this.c().map((Function)gnq.m).orElse((Object)value);
        final boolean b5 = booleanValue && ((b4 & 0x2) != 0x0 || booleanValue2);
        if (this.s != null && !(boolean)this.c().map((Function)gnq.g).orElse((Object)value)) {
            this.s.a();
        }
        this.g.j(0, 2, (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)a).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint), (wyn)null, n, s);
        if (b) {
            final hmm g = this.g;
            synchronized (g.a) {
                if (g.d != null) {
                    final agza builder2 = ((agzi)alkg.a).createBuilder();
                    final agza builder3 = ((agzi)alkn.a).createBuilder();
                    builder3.copyOnWrite();
                    final alkn alkn = (alkn)builder3.instance;
                    alkn.b |= 0x40;
                    alkn.i = true;
                    builder2.copyOnWrite();
                    final alkg alkg = (alkg)builder2.instance;
                    final alkn p6 = (alkn)builder3.build();
                    p6.getClass();
                    alkg.P = p6;
                    alkg.d |= 0x10;
                    g.d.a((alkg)builder2.build());
                }
            }
        }
        if ((boolean)this.v.cp().aG() && "cold".equals(s) && !map2.isEmpty()) {
            final Optional ofNullable = Optional.ofNullable((Object)map2.get("r_aoc"));
            final Long value2 = 0L;
            final long longValue = (long)ofNullable.orElse((Object)value2);
            final long longValue2 = (long)Optional.ofNullable((Object)map2.get("r_wwaoc")).orElse((Object)value2);
            final long longValue3 = (long)Optional.ofNullable((Object)map2.get("r_wwaos")).orElse((Object)value2);
            final long longValue4 = (long)Optional.ofNullable((Object)map2.get("r_wwaor")).orElse((Object)value2);
            this.g.d("r_aoc", longValue);
            this.g.d("r_wwaoc", longValue2);
            this.g.d("r_wwaos", longValue3);
            this.g.d("r_wwaor", longValue4);
        }
        final Optional c2 = this.c();
        if (this.E != null) {
            if (c2.map((Function)gnq.e).orElse((Object)value)) {
                final avt e2 = this.E;
                final PlaybackStartDescriptor playbackStartDescriptor = a2;
                final String b6 = playbackStartDescriptor.B(e2);
                final Optional a3 = this.g.a();
                if (a3.isPresent() && !this.A.m()) {
                    final hqv h = this.h;
                    final wyn wyn = (wyn)a3.get();
                    synchronized (h.a) {
                        h.a.put(b6, wyn);
                    }
                }
                if (b5) {
                    this.d("r_ofs");
                    final lht b7 = this.B;
                    if (b7 != null) {
                        final String k = playbackStartDescriptor.k();
                        playbackStartDescriptor.g = true;
                        final aioe b8 = playbackStartDescriptor.b;
                        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint4 = reelWatchEndpointOuterClass$ReelWatchEndpoint;
                        if (b8 != null) {
                            reelWatchEndpointOuterClass$ReelWatchEndpoint4 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)b8).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                        }
                        ((abjf)b7.d).h(playbackStartDescriptor, k, (Executor)b7.c, b7.k(reelWatchEndpointOuterClass$ReelWatchEndpoint4, b6, ((zbo)b7.e).b()));
                    }
                    if (this.s != null && (boolean)c2.map((Function)gnq.k).orElse((Object)value)) {
                        final hrm s2 = this.s;
                        final znj a4 = znk.a;
                        s2.f(a, b6, false, false, true, true, a4, a4);
                    }
                    this.d("r_ofe");
                }
                else if (this.s != null) {
                    final boolean b9 = (boolean)c2.map((Function)gnq.f).orElse((Object)value) && !TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k());
                    final hrm s3 = this.s;
                    final znj a5 = znk.a;
                    s3.d(a, b6, false, b9, false, a5, a5);
                }
            }
        }
        final Parcelable parcelable = (Parcelable)a2;
        boolean b10;
        if (map != null) {
            b10 = false;
            if (((int)Map$_EL.getOrDefault(map, (Object)"com.google.android.apps.youtube.app.endpoint.flags", (Object)0) & 0x40) != 0x0) {
                b10 = true;
            }
        }
        else {
            b10 = false;
        }
        final uyf u = this.u;
        ains ains;
        if (u != null) {
            ains = u.b();
        }
        else {
            ains = ains.a;
        }
        anqa anqa;
        if ((anqa = ains.A) == null) {
            anqa = anqa.a;
        }
        Label_1762: {
            Label_1556: {
                if (anqa.c) {
                    aioe = ((PlaybackStartDescriptor)parcelable).b;
                    aioe.getClass();
                    if (iba.H(aioe)) {
                        break Label_1556;
                    }
                }
                aioe = ((PlaybackStartDescriptor)parcelable).b;
                aioe.getClass();
                if (!iba.D(aioe)) {
                    break Label_1762;
                }
            }
            if (((Optional)this.i.a()).isPresent() && this.j.isPresent()) {
                if (this.l.isPresent()) {
                    final uyi x = this.x;
                    if (x != null && x.f(45365602L)) {
                        ((hrn)this.l.get()).b();
                    }
                }
                final ggi ggi = (ggi)((Optional)this.i.a()).get();
                final hor hor = (hor)this.j.get();
                final aioe b11 = ((PlaybackStartDescriptor)parcelable).b;
                b11.getClass();
                final Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", parcelable);
                bundle.putLong("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY", n);
                bundle.putString("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY", s);
                bundle.putBoolean("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.USE_CLIENT_TRIGGERED_GET_PLAYER_INITIAL_KEY", b5);
                bundle.putBoolean("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.IS_REFERRED_FROM_DISCOVER_KEY", b10);
                final Bundle bundle2 = new Bundle();
                bundle2.putBundle("ReelWatchFragmentArgs", bundle);
                ggi.d(PaneDescriptor.c((Class)hos.class, b11, bundle2));
                return;
            }
        }
        final Intent intent = new Intent(this.f, (Class)this.z.a);
        intent.setFlags(262144);
        intent.putExtra("com.google.android.apps.youtube.PlaybackStartDescriptor", parcelable);
        intent.putExtra("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY", n);
        intent.putExtra("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY", s);
        intent.putExtra("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.USE_CLIENT_TRIGGERED_GET_PLAYER_INITIAL_KEY", b5);
        final Bundle bundle3 = (Bundle)Optional.ofNullable((Object)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.bundle", (Class)Bundle.class)).orElseGet((Supplier)new ifu(this, a, 1));
        this.g.c("r_as");
        final Context f = this.f;
        final PlaybackStartDescriptor playbackStartDescriptor2 = (PlaybackStartDescriptor)intent.getParcelableExtra("com.google.android.apps.youtube.PlaybackStartDescriptor");
        playbackStartDescriptor2.getClass();
        final boolean m = iba.M(iba.x(playbackStartDescriptor2));
        final boolean g2 = iba.G(playbackStartDescriptor2);
        int n2;
        if (!m) {
            n2 = 2130772090;
        }
        else {
            n2 = 2130772088;
        }
        if (bundle3 == null && !g2) {
            f.startActivity(intent);
            return;
        }
        if (bundle3 != null) {
            intent.putExtras(bundle3);
        }
        f.startActivity(intent, sw.g(f, n2, 2130772086).f());
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final fjz o = this.o;
        if (o != null) {
            o.e();
        }
        agot.u(((agzd)aioe).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        Map a = map;
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x10000000) != 0x0) {
            final fzo c = this.C;
            final List list = ((Map<K, List>)c.b).get(reelWatchEndpointOuterClass$ReelWatchEndpoint.B);
            final boolean empty = ((Map)c.a).isEmpty();
            ReelToReelList list3;
            final ReelToReelList list2 = list3 = null;
            if (!empty) {
                list3 = list2;
                if (list != null) {
                    if (list.isEmpty()) {
                        list3 = list2;
                    }
                    else {
                        final ArrayList list4 = new ArrayList();
                        final Iterator iterator = list.iterator();
                        while (iterator.hasNext()) {
                            final klh klh = ((Map<K, klh>)c.a).get(iterator.next());
                            if (klh != null && klh.c != null && !klh.b) {
                                final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
                                final agzg reelWatchEndpoint = ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
                                final Object c2 = klh.c;
                                c2.getClass();
                                agzc.e((agyr)reelWatchEndpoint, c2);
                                list4.add(((agza)agzc).build());
                            }
                        }
                        list3 = new ReelToReelList((List)Collections.unmodifiableList((List<?>)list4));
                    }
                }
            }
            a = map;
            if (list3 != null) {
                a = ReelToReelList.a(aioe, list3, map);
            }
        }
        boolean b = false;
        Label_0355: {
            if (this.v.cq()) {
                final hnd m = this.m;
                if (m.b > 0L && m.f != 1 && (!(boolean)this.v.cp().aG() || this.n.o <= 1)) {
                    b = true;
                    break Label_0355;
                }
            }
            b = false;
        }
        final boolean b2 = this.v.cq() && this.m.f == 2;
        String s;
        if (!b) {
            s = "warm";
        }
        else {
            s = "cold";
        }
        final HashMap hashMap = new HashMap();
        if (b) {
            hashMap.put("r_aoc", this.m.a);
            hashMap.put("r_wwaoc", this.m.c);
            hashMap.put("r_wwaos", this.m.d);
            hashMap.put("r_wwaor", this.m.e);
        }
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x80000) != 0x0) {
            this.C.P(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        }
        long n;
        if (b) {
            n = this.m.b;
        }
        else {
            n = this.b.c();
        }
        if (b) {
            final hnd i = this.m;
            i.f = 1;
            i.a = -2L;
            i.b = -2L;
            i.c = -2L;
            i.d = -2L;
            i.e = -2L;
        }
        final boolean booleanValue = (boolean)this.c().map((Function)gnq.o).orElse((Object)false);
        final xlt d = this.d;
        if (d != null) {
            this.a.k(d);
        }
        if (!(boolean)this.w.cm().aG() && (this.a.g() != null || this.a.o())) {
            this.e(aioe, a, s, b2, hashMap);
            return;
        }
        if (this.p != null && booleanValue) {
            this.t.ifPresent((Consumer)fwb.u);
            this.t = Optional.of((Object)((ashe)this.p.a).J((asjd)flu.h).al(1L).aB((asix)new goc(this, aioe, a, n, s, b2, hashMap)));
            return;
        }
        this.b(aioe, a, n, s, b2, hashMap);
    }
}
