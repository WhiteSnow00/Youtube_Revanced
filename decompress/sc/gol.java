import android.app.AlertDialog$Builder;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.HashMap;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import android.content.Intent;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.os.Parcelable;
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

public final class gol implements vcv
{
    public static final int e = 0;
    private final msr A;
    private final cyb B;
    private final elx C;
    private final cyb D;
    private final lkx E;
    private final fzw F;
    private final fzw G;
    private final aeea H;
    public final xnt a;
    public final oby b;
    public final acgs c;
    public xnr d;
    private final Context f;
    private final hng g;
    private final hrp h;
    private final arkg i;
    private final Optional j;
    private final wyv k;
    private final Optional l;
    private final hny m;
    private final tok n;
    private final fkf o;
    private final PipObserver p;
    private final vdr r;
    private final hsh s;
    private Optional t;
    private final vaf u;
    private final vai v;
    private final vai w;
    private final vai x;
    private final vai y;
    private final arwh z;
    
    public gol(final Context f, final xnt a, final cyb b, final hng g, final hrp h, final fzw g2, final fzw f2, final oby b2, final arkg i, final wyv k, final Optional j, final Optional l, final hny m, final elx c, final vai x, final vai v, final vai w, final cyb d, final tok n, final aeea h2, final fkf o, final vaf u, final arwh z, final vai y, final PipObserver p37, final acgs c2, final vdr r, final msr a2, final hsh s, final lkx e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.t = Optional.empty();
        this.f = f;
        this.a = a;
        this.B = b;
        this.g = g;
        this.h = h;
        this.G = g2;
        this.F = f2;
        this.b = b2;
        this.i = i;
        this.k = k;
        this.j = j;
        this.l = l;
        this.m = m;
        this.v = v;
        this.w = w;
        this.n = n;
        this.H = h2;
        this.o = o;
        this.u = u;
        this.z = z;
        this.y = y;
        this.D = d;
        this.p = p37;
        this.c = c2;
        this.r = r;
        this.A = a2;
        this.s = s;
        this.E = e;
        this.C = c;
        this.x = x;
    }
    
    private final Optional c() {
        return Optional.ofNullable((Object)this.z).map((Function)gnx.n);
    }
    
    private final void d(final String s) {
        if (this.c().map((Function)gnx.i).orElse((Object)false)) {
            this.g.c(s);
        }
    }
    
    private final void e(final aiqj aiqj, final Map map, final String s, final boolean b, final Map map2) {
        try {
            ((AlertDialog$Builder)this.H.al(this.f)).setTitle(2132019388).setMessage(2132019387).setPositiveButton(2132018939, (DialogInterface$OnClickListener)new snq(this, aiqj, map, s, b, map2, 1)).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).create().show();
            final wyv k = this.k;
            if (k != null && k.pF() != null) {
                this.k.pF().l((wzz)new wyt(xaa.c(135786)));
            }
        }
        catch (final WindowManager$BadTokenException ex) {}
    }
    
    public final void b(aiqj aiqj, final Map map, final long n, final String s, final boolean b, Map b2) {
        final aiqj aiqj2 = aiqj;
        final boolean ry = ((ahbc)aiqj2).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        final Boolean value = false;
        aiqj = aiqj2;
        if (ry) {
            aiqj = aiqj2;
            if (!((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj2).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).l) {
                aiqj = aiqj2;
                if (this.c().map((Function)gnx.h).orElse((Object)value)) {
                    aiqj = this.G.P(aiqj2);
                }
            }
        }
        final int b3 = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).b;
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = null;
        aiqj a = null;
        Label_0462: {
            if ((b3 & 0x100000) != 0x0) {
                final vdr r = this.r;
                if (r != null) {
                    final vdq b4 = r.b();
                    final ants ants = (ants)((vfp)b4).f(((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).t).j((Class)ants.class).q((asjm)fua.u).G((asjs)new fdp((Class)ahca.class, 10)).af();
                    Label_0415: {
                        if (ants != null) {
                            Object updatedEndpointProto = null;
                            Label_0259: {
                                if (ants.f()) {
                                    updatedEndpointProto = ants.getUpdatedEndpointProto();
                                }
                                else {
                                    if (ants.c()) {
                                        try {
                                            updatedEndpointProto = ahbh.parseFrom((ahbh)aiqj.a, ants.getUpdatedEndpoint(), ExtensionRegistryLite.getGeneratedRegistry());
                                            break Label_0259;
                                        }
                                        catch (final ahca ahca) {
                                            ttr.d("Error parsing bytes for updated ReelWatchEndpoint.", (Throwable)ahca);
                                        }
                                    }
                                    updatedEndpointProto = null;
                                }
                            }
                            if (updatedEndpointProto != null && ((ahbc)updatedEndpointProto).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                                final ahaz builder = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)updatedEndpointProto).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).toBuilder();
                                if (!((ReelWatchEndpointOuterClass$ReelWatchEndpoint)builder.instance).C.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint2.C)) {
                                    final String c = reelWatchEndpointOuterClass$ReelWatchEndpoint2.C;
                                    builder.copyOnWrite();
                                    final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint3 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)builder.instance;
                                    c.getClass();
                                    reelWatchEndpointOuterClass$ReelWatchEndpoint3.b |= 0x20000000;
                                    reelWatchEndpointOuterClass$ReelWatchEndpoint3.C = c;
                                }
                                final ahbb ahbb = (ahbb)((ahbh)aiqj).toBuilder();
                                ahbb.e((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, (Object)builder.build());
                                a = (aiqj)((ahaz)ahbb).build();
                                break Label_0415;
                            }
                        }
                        a = aiqj;
                    }
                    final veb e = ((vdw)b4).e();
                    ((vfw)e).g(((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).t);
                    ((vfw)e).b().U();
                    break Label_0462;
                }
            }
            a = aiqj;
        }
        final abjp d = PlaybackStartDescriptor.d();
        d.a = a;
        final PlaybackStartDescriptor a2 = d.a();
        amxr amxr;
        if ((amxr = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)a).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).m) == null) {
            amxr = amxr.a;
        }
        final int b5 = amxr.b;
        final boolean booleanValue = (boolean)this.c().map((Function)gnx.l).orElse((Object)value);
        final boolean booleanValue2 = (boolean)this.c().map((Function)gnx.m).orElse((Object)value);
        final boolean b6 = booleanValue && ((b5 & 0x2) != 0x0 || booleanValue2);
        if (this.s != null && !(boolean)this.c().map((Function)gnx.g).orElse((Object)value)) {
            this.s.a();
        }
        this.g.j(0, 2, (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)a).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint), null, n, s);
        if (b) {
            final hng g = this.g;
            synchronized (g.a) {
                if (g.d != null) {
                    final ahaz builder2 = ((ahbh)almj.a).createBuilder();
                    final ahaz builder3 = ((ahbh)almq.a).createBuilder();
                    builder3.copyOnWrite();
                    final almq almq = (almq)builder3.instance;
                    almq.b |= 0x40;
                    almq.i = true;
                    builder2.copyOnWrite();
                    final almj almj = (almj)builder2.instance;
                    final almq p5 = (almq)builder3.build();
                    p5.getClass();
                    almj.P = p5;
                    almj.d |= 0x10;
                    g.d.a((almj)builder2.build());
                }
            }
        }
        if ((boolean)this.v.cr().aM() && "cold".equals(s) && !((Map)b2).isEmpty()) {
            final Optional ofNullable = Optional.ofNullable((Object)((Map)b2).get("r_aoc"));
            final Long value2 = 0L;
            final long longValue = (long)ofNullable.orElse((Object)value2);
            final long longValue2 = (long)Optional.ofNullable((Object)((Map)b2).get("r_wwaoc")).orElse((Object)value2);
            final long longValue3 = (long)Optional.ofNullable((Object)((Map)b2).get("r_wwaos")).orElse((Object)value2);
            final long longValue4 = (long)Optional.ofNullable((Object)((Map)b2).get("r_wwaor")).orElse((Object)value2);
            this.g.d("r_aoc", longValue);
            this.g.d("r_wwaoc", longValue2);
            this.g.d("r_wwaos", longValue3);
            this.g.d("r_wwaor", longValue4);
        }
        final Optional c2 = this.c();
        if (this.A != null) {
            if (c2.map((Function)gnx.e).orElse((Object)value)) {
                b2 = a2.B(this.A);
                final Optional a3 = this.g.a();
                if (a3.isPresent() && !this.D.m()) {
                    final hrp h = this.h;
                    final xan xan = (xan)a3.get();
                    synchronized (h.a) {
                        h.a.put(b2, xan);
                    }
                }
                if (b6) {
                    this.d("r_ofs");
                    final lkx e2 = this.E;
                    if (e2 != null) {
                        final String k = a2.k();
                        a2.g = true;
                        final aiqj b7 = a2.b;
                        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint4 = reelWatchEndpointOuterClass$ReelWatchEndpoint;
                        if (b7 != null) {
                            reelWatchEndpointOuterClass$ReelWatchEndpoint4 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)b7).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                        }
                        ((abkz)e2.f).h(a2, k, (Executor)e2.e, e2.k(reelWatchEndpointOuterClass$ReelWatchEndpoint4, b2, ((zdh)e2.b).b()));
                    }
                    if (this.s != null && (boolean)c2.map((Function)gnx.k).orElse((Object)value)) {
                        final hsh s2 = this.s;
                        final zpf a4 = zpg.a;
                        s2.f(a, b2, false, false, true, true, a4, a4);
                    }
                    this.d("r_ofe");
                }
                else if (this.s != null) {
                    final boolean b8 = (boolean)c2.map((Function)gnx.f).orElse((Object)value) && !TextUtils.isEmpty((CharSequence)a2.k());
                    final hsh s3 = this.s;
                    final zpf a5 = zpg.a;
                    s3.d(a, b2, false, b8, false, a5, a5);
                }
            }
        }
        boolean b9;
        if (map != null) {
            b9 = false;
            if (((int)Map$_EL.getOrDefault(map, (Object)"com.google.android.apps.youtube.app.endpoint.flags", (Object)0) & 0x40) != 0x0) {
                b9 = true;
            }
        }
        else {
            b9 = false;
        }
        final vaf u = this.u;
        aipx aipx;
        if (u != null) {
            aipx = u.b();
        }
        else {
            aipx = aipx.a;
        }
        ansd ansd;
        if ((ansd = aipx.A) == null) {
            ansd = ansd.a;
        }
        Label_1771: {
            Label_1521: {
                if (ansd.c) {
                    aiqj = a2.b;
                    aiqj.getClass();
                    if (hko.x(aiqj)) {
                        break Label_1521;
                    }
                }
                aiqj = a2.b;
                aiqj.getClass();
                if (!hko.t(aiqj)) {
                    break Label_1771;
                }
            }
            if (((Optional)this.i.a()).isPresent() && this.j.isPresent()) {
                if (this.l.isPresent()) {
                    final vai y = this.y;
                    if (y != null && y.f(45365602L)) {
                        ((hsi)this.l.get()).b();
                    }
                }
                final hwo hwo = (hwo)this.j.get();
                final aiqj b10 = a2.b;
                b10.getClass();
                final Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", (Parcelable)a2);
                bundle.putLong("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY", n);
                bundle.putString("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY", s);
                bundle.putBoolean("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.USE_CLIENT_TRIGGERED_GET_PLAYER_INITIAL_KEY", b6);
                bundle.putBoolean("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.IS_REFERRED_FROM_DISCOVER_KEY", b9);
                final Bundle bundle2 = new Bundle();
                bundle2.putBundle("ReelWatchFragmentArgs", bundle);
                final PaneDescriptor c3 = PaneDescriptor.c((Class)hpo.class, b10, bundle2);
                final ggr ggr = (ggr)((Optional)this.i.a()).get();
                if (this.x.bO()) {
                    final Optional optional = (Optional)this.C.a;
                    if (optional.isPresent()) {
                        c3.m((amqg)optional.get());
                        this.C.A();
                    }
                }
                ggr.d(c3);
                return;
            }
        }
        final Intent intent = new Intent(this.f, (Class)this.B.a);
        intent.setFlags(262144);
        intent.putExtra("com.google.android.apps.youtube.PlaybackStartDescriptor", (Parcelable)a2);
        intent.putExtra("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY", n);
        intent.putExtra("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY", s);
        intent.putExtra("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.USE_CLIENT_TRIGGERED_GET_PLAYER_INITIAL_KEY", b6);
        final Bundle bundle3 = (Bundle)Optional.ofNullable((Object)tpe.O(map, (Object)"com.google.android.libraries.youtube.innertube.bundle", (Class)Bundle.class)).orElseGet((Supplier)new igs(this, a, 1));
        this.g.c("r_as");
        final Context f = this.f;
        final PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor)intent.getParcelableExtra("com.google.android.apps.youtube.PlaybackStartDescriptor");
        playbackStartDescriptor.getClass();
        int n2;
        if (!hko.C(hko.n(playbackStartDescriptor))) {
            n2 = 2130772090;
        }
        else {
            n2 = 2130772088;
        }
        final boolean w = hko.w(playbackStartDescriptor);
        if (bundle3 == null && !w) {
            f.startActivity(intent);
            return;
        }
        if (bundle3 != null) {
            intent.putExtras(bundle3);
        }
        f.startActivity(intent, sw.g(f, n2, 2130772086).f());
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        final fkf o = this.o;
        if (o != null) {
            o.e();
        }
        adkp.H(((ahbc)aiqj).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        Map a = map;
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x10000000) != 0x0) {
            final fzw f = this.F;
            final List list = ((Map<K, List>)f.b).get(reelWatchEndpointOuterClass$ReelWatchEndpoint.B);
            final boolean empty = ((Map)f.a).isEmpty();
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
                            final kmi kmi = ((Map<K, kmi>)f.a).get(iterator.next());
                            if (kmi != null && kmi.c != null && !kmi.b) {
                                final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
                                final ahbf reelWatchEndpoint = ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
                                final Object c = kmi.c;
                                c.getClass();
                                ahbb.e((ahaq)reelWatchEndpoint, c);
                                list4.add(((ahaz)ahbb).build());
                            }
                        }
                        list3 = new ReelToReelList(Collections.unmodifiableList((List<?>)list4));
                    }
                }
            }
            a = map;
            if (list3 != null) {
                a = ReelToReelList.a(aiqj, list3, map);
            }
        }
        boolean b = false;
        Label_0368: {
            if (this.v.cs()) {
                final hny m = this.m;
                if (m.b > 0L && m.f != 1 && (!(boolean)this.v.cr().aM() || this.n.o <= 1)) {
                    b = true;
                    break Label_0368;
                }
            }
            b = false;
        }
        final boolean b2 = this.v.cs() && this.m.f == 2;
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
            this.F.O(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        }
        long n;
        if (b) {
            n = this.m.b;
        }
        else {
            n = this.b.c();
        }
        if (b) {
            final hny i = this.m;
            i.f = 1;
            i.a = -2L;
            i.b = -2L;
            i.c = -2L;
            i.d = -2L;
            i.e = -2L;
        }
        final boolean booleanValue = (boolean)this.c().map((Function)gnx.o).orElse((Object)false);
        final xnr d = this.d;
        if (d != null) {
            this.a.k(d);
        }
        if (!(boolean)this.w.cn().aM() && (this.a.g() != null || this.a.o())) {
            this.e(aiqj, a, s, b2, hashMap);
            return;
        }
        if (this.p != null && booleanValue) {
            this.t.ifPresent((Consumer)fwj.u);
            this.t = Optional.of((Object)((asht)this.p.a).K((asjs)fma.h).ar(1L).aH((asjm)new goj(this, aiqj, a, n, s, b2, hashMap)));
            return;
        }
        this.b(aiqj, a, n, s, b2, hashMap);
    }
}
