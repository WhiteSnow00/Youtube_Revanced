import java.util.function.Consumer;
import java.util.function.Function;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import android.os.Bundle;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import j$.util.DesugarCollections;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Map;
import java.util.HashMap;
import j$.util.Optional;
import android.app.Notification;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaal
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public aaal(final Notification b, final zqd c, final atjj d, final arud a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public aaal(final atjj c, final atjj b, final atjj a, final aexq d) {
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public aaal(final atjj a, final atjj b, final atjj d, final atjj c) {
        this.a = a;
        this.b = b;
        d.getClass();
        this.d = d;
        c.getClass();
        this.c = c;
    }
    
    public aaal(final atjj d, final atjj b, final atjj a, final atjj c, final byte[] array) {
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        this.c = c;
    }
    
    public aaal(final atjj c, final atjj a, final atjj d, final atjj b, final byte[] array, final byte[] array2) {
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
    }
    
    public aaal(final atjj a, final atjj b, final atjj d, final atjj c, final char[] array) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        c.getClass();
        this.c = c;
    }
    
    public aaal(final atjj b, final atjj c, final ztu a, final oas d) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
    }
    
    public aaal(final atjj c, final yzf a, final atjj d, final uyf b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public aaal(final Optional d, final zki b, final adcr a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = new HashMap();
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public aaal(final Class d, final String c) {
        this.a = new afcm();
        this.b = new afcm();
        this.d = d;
        this.c = c;
    }
    
    public aaal(final String c, final Class d, final afcr a, final afcr b) {
        agot.u(c.startsWith("QT_") && c.matches("\\w+"));
        if (((afgh)b).c <= 0) {
            this.c = c;
            this.d = d;
            this.a = a;
            this.b = b;
            return;
        }
        final vem vem = ((List<vem>)b).get(0);
        throw null;
    }
    
    public aaal(final Map a, final oas d) {
        this.a = a;
        this.d = d;
        this.b = new AtomicLong();
        this.c = new AtomicLong();
    }
    
    public aaal(final oas d, final aacf c, final ztj b, final arud a, final byte[] array, final byte[] array2) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaal(final oas a, final zki b, final vcf c, final Executor d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public aaal(final tdg a, final uyi c, final tal b, final adcr d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public aaal(final vas d) {
        this.d = d;
        this.a = atig.aD();
        this.c = atig.aD();
        this.b = atig.aD();
    }
    
    public aaal(final vbq a, final vcf b, final vup d, final vei c, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public aaal(final yee d, final arud b, final yec a, final zba c, final byte[] array, final byte[] array2) {
        zbm.a((Object)d);
        this.d = d;
        zbm.a((Object)b);
        this.b = b;
        zbm.a((Object)a);
        this.a = a;
        zbm.a((Object)c);
        this.c = c;
    }
    
    public aaal(final ynt b, final ynt a, final ywv ywv, final boolean b2, final String s, final String s2) {
        this.b = b;
        this.a = a;
        long n;
        if ((n = ywv.a) == -1L) {
            n = ((yoc)ywv.b).c.e;
        }
        final ynu b3 = ywv.b;
        this.d = new yvw((float)n, b2, 0, ((yoc)b3).e, ((yoc)b3).c.d);
        this.c = new yvw((float)((yoc)ywv.b).d.a, b2, 1, s, s2);
    }
    
    public aaal(final zba a, final yyu b, final atjj c) {
        this.d = DesugarCollections.synchronizedMap((Map)new xuv());
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aaal(final zgv b, final qv c, final ysu a, final aeyr d, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public static aaal A(final Class clazz, final String s) {
        return new aaal(clazz, s);
    }
    
    private final aaag E(final amsh amsh, final aaag aaag) {
        final int a = vek.a(amsh.d);
        if (((Map)this.a).containsKey(a)) {
            final String t = uji.T();
            String g;
            if (aaag != null) {
                g = aaag.g;
            }
            else {
                g = t;
            }
            final long nanos = TimeUnit.MILLISECONDS.toNanos(((oas)this.d).c());
            if (nanos != ((AtomicLong)this.b).get()) {
                ((AtomicLong)this.b).set(nanos);
                ((AtomicLong)this.c).set(0L);
            }
            final long andIncrement = ((AtomicLong)this.c).getAndIncrement();
            String a2;
            if (aaag != null) {
                a2 = aaag.a;
            }
            else {
                a2 = null;
            }
            return new aaag(t, amsh, a, nanos + andIncrement, g, a2);
        }
        final StringBuilder sb = new StringBuilder("Couldn't find registered controller for entityType: ");
        sb.append(a);
        throw new aaan(sb.toString());
    }
    
    private final List F(final aaag aaag, final String h, List iterator) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        iterator = ((List)iterator).iterator();
        while (iterator.hasNext()) {
            final amsh amsh = (amsh)iterator.next();
            try {
                final aaag e = this.E(amsh, aaag);
                e.h = h;
                list.add(e);
                if (((List)amsh.f).isEmpty()) {
                    continue;
                }
                list2.add(e);
            }
            catch (final aaan aaan) {
                trn.b("[Offline] One of the chained actions couldn't be created: ".concat(String.valueOf(aaan.getMessage())));
            }
        }
        for (int size = list2.size(), i = 0; i < size; ++i) {
            final aaag aaag2 = (aaag)list2.get(i);
            list.addAll(this.F(aaag, aaag2.a, (List)aaag2.c.f));
        }
        return list;
    }
    
    private final ListenableFuture G(final String s) {
        return tmy.ci(((vcf)this.c).a(((zki)this.b).c()).f(vek.h(ajhu.b.a(), s)).j((Class)ajhr.class));
    }
    
    private static vdv H(final vdo vdo, final ahca ahca) {
        if (vdo instanceof vec) {
            return ((vec)vdo).d(ahca);
        }
        throw new IllegalStateException("EntityStore does not implement FrameworkRestrictedStoreAccess: ".concat(String.valueOf(String.valueOf(vdo))));
    }
    
    public static anau b(final vce vce, String k) {
        k = (String)((afdu)vce.a(k).ab()).k();
        while (((Iterator)k).hasNext()) {
            final String s = ((Iterator<String>)k).next();
            try {
                return (anau)vce.f(s).j((Class)anau.class).af();
            }
            catch (final ClassCastException ex) {
                continue;
            }
            break;
        }
        return null;
    }
    
    public static void c(final anau anau, final zyq zyq) {
        final amtx f = anau.f();
        if (f == null || (f.b.c & 0x8) == 0x0) {
            return;
        }
        try {
            final amth amth = (amth)agzi.parseFrom(amth.a, f.getOfflineStateBytes(), ExtensionRegistryLite.getGeneratedRegistry());
            if ((amth.b & 0x400) != 0x0) {
                final agyc k = amth.k;
                if (!k.H()) {
                    aadj.G(zyq, k.I());
                }
            }
        }
        catch (final ahab ahab) {}
    }
    
    public static void i(final boolean a, final yvw yvw, final ynt ynt) {
        yvw.a = a;
        ynt.i("xvt", (yxx)yvw);
    }
    
    public static final agyp n() {
        return agyp.a;
    }
    
    public static List o(final List list) {
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((FormatStreamModel)iterator.next()).e());
        }
        return list2;
    }
    
    public final void B(final tdg tdg) {
        tdg.B((String)this.c);
    }
    
    public final aeby C(final Set set, final String s) {
        if (s == null) {
            return null;
        }
        final Object a = this.a;
        final Object b = this.b;
        final Object c = this.c;
        final aeby d = this.D(s);
        if (d == null) {
            final zba zba = (zba)a;
            return xyl.P(xyl.w(set, zba, (yyu)b), s, this, zba, (atjj)c);
        }
        return d;
    }
    
    public final aeby D(final String s) {
        return ((Map<K, aeby>)this.d).get(s);
    }
    
    final List a(final amsh amsh, final aaag aaag) {
        final ArrayList list = new ArrayList();
        final aaag e = this.E(amsh, aaag);
        list.add(e);
        if (!((List)amsh.f).isEmpty()) {
            list.addAll(this.F(aaag, e.a, (List)amsh.f));
        }
        return list;
    }
    
    public final ListenableFuture d(final String s) {
        if (aexs.f(s)) {
            return afva.m(null);
        }
        return afrp.e(this.G(s), (aexg)ykp.s, (Executor)this.d);
    }
    
    public final ListenableFuture e(final String s) {
        if (aexs.f(s)) {
            return afva.m(false);
        }
        return afrp.e(this.G(s), (aexg)new zoh(this, s, 6, (byte[])null), (Executor)this.d);
    }
    
    public final boolean f(final String s, final List list) {
        szc.e();
        Label_0032: {
            if (list == null) {
                break Label_0032;
            }
            try {
                if (list.isEmpty()) {
                    ((ztu)this.a).L(s, (List)Collections.emptyList());
                    return false;
                }
                return ((ztu)this.a).L(s, list);
            }
            catch (final IOException ex) {
                final StringBuilder sb = new StringBuilder("Error saving ad breaks for ad [originalVideoId=");
                sb.append(s);
                sb.append("]");
                trn.d(sb.toString(), (Throwable)ex);
                return false;
            }
        }
    }
    
    public final void g(final int n) {
        ((acko)((atjj)this.d).a()).d(new wwc(n - 1, 10), ajrw.j);
    }
    
    public final void h(final MessageLite messageLite) {
        if (((uyi)this.c).f(45352805L)) {
            final Object d = this.d;
            final String t = uji.T();
            tcp.j(afrp.e(afrp.e(afrp.e(((aagm)((adcr)d).a).c((aexg)new zoh(t, messageLite, 3), (Executor)afsl.a), (aexg)new zqp(t, 0), (Executor)afsl.a), (aexg)new xct(messageLite, 18), (Executor)afsl.a), (aexg)new xct(this, 19, (byte[])null, (byte[])null), (Executor)afsl.a), (Executor)afsl.a, (tcn)new wka(this, messageLite, 18, (byte[])null, (byte[])null));
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putByteArray("com.google.android.libraries.youtube.notification.pref.notification_renderer", messageLite.toByteArray());
        bundle.putString("renderer_class_name", messageLite.getClass().getName());
        ((tdg)this.a).b("notification_processing", bundle);
    }
    
    public final agyp j(final xqo xqo) {
        final Object c = this.c;
        final int i = xyl.I(xqo.b);
        boolean b = false;
        if (i != 0) {
            if (i == 11) {
                b = true;
            }
        }
        ((qv)c).e(b);
        return agyp.a;
    }
    
    public final agyp k(final xsz xsz) {
        final Object a = this.a;
        xtn xtn;
        if ((xtn = xsz.b) == null) {
            xtn = xtn.a;
        }
        ((ysu)a).b(xtn, (yul)null);
        return agyp.a;
    }
    
    public final xri l() {
        final agza builder = ((agzi)xri.a).createBuilder();
        final Object a = ((aeyr)this.d).a();
        builder.copyOnWrite();
        final xri xri = (xri)builder.instance;
        a.getClass();
        xri.c = (akja)a;
        xri.b |= 0x1;
        return (xri)builder.build();
    }
    
    public final xrk m() {
        final Long l = ((zgv)this.b).l();
        if (l == null) {
            return xrk.a;
        }
        if (l == Long.MAX_VALUE) {
            final agza builder = ((agzi)xrk.a).createBuilder();
            builder.copyOnWrite();
            final xrk xrk = (xrk)builder.instance;
            xrk.b |= 0x1;
            xrk.c = Double.POSITIVE_INFINITY;
            return (xrk)builder.build();
        }
        final agza builder2 = ((agzi)xrk.a).createBuilder();
        final double a = yuc.a((long)l);
        builder2.copyOnWrite();
        final xrk xrk2 = (xrk)builder2.instance;
        xrk2.b |= 0x1;
        xrk2.c = a;
        return (xrk)builder2.build();
    }
    
    public final boolean p() {
        final akak f = ((yzk)this.c).i.f();
        if (f != null) {
            amdv amdv;
            if ((amdv = f.i) == null) {
                amdv = amdv.a;
            }
            amvh amvh;
            if ((amvh = amdv.d) == null) {
                amvh = amvh.a;
            }
            amvf amvf;
            if ((amvf = amvh.g) == null) {
                amvf = amvf.b;
            }
            if (amvf.f) {
                return true;
            }
        }
        return false;
    }
    
    public final asgt q() {
        return ((asgt)this.c).R().J();
    }
    
    public final void r(final wuy wuy) {
        ((atig)this.a).tr((Object)wuy);
    }
    
    public final void s(final wvc wvc) {
        ((atig)this.c).tr((Object)wvc);
    }
    
    public final Optional t(final vlo vlo) {
        if (vlo.c.equals("")) {
            final String d = vlo.d;
            Optional optional;
            if (d.equals("")) {
                optional = Optional.empty();
            }
            else {
                for (final Map.Entry<K, Set> entry : this.u().entrySet()) {
                    if (entry.getValue().contains(d)) {
                        optional = Optional.of((Object)entry.getKey());
                        return optional;
                    }
                }
                optional = Optional.empty();
            }
            return optional;
        }
        return Optional.of((Object)vlo.c);
    }
    
    public final Map u() {
        final String b = ((zki)this.b).c().b();
        Map map;
        if ((map = ((Map<K, Map>)this.c).get(b)) == null) {
            map = new HashMap();
            ((Map<String, Map>)this.c).put(b, map);
        }
        return map;
    }
    
    public final void v(final vlo vlo, final BrowseResponseModel browseResponseModel) {
        if (!(boolean)((Optional)this.d).map((Function)tko.s).orElse((Object)false)) {
            return;
        }
        this.t(vlo).ifPresent((Consumer)new inj(this, browseResponseModel, 18, null, null));
    }
    
    public final void w(final zkh zkh, final ajnr ajnr) {
        ajnr.getClass();
        aost aost;
        if ((aost = ajnr.c) == null) {
            aost = aost.a;
        }
        final agza builder = ((agzi)ahca.a).createBuilder();
        final long c = aost.c;
        builder.copyOnWrite();
        ((ahca)builder.instance).b = c;
        final int d = aost.d;
        builder.copyOnWrite();
        ((ahca)builder.instance).c = d;
        final ahca ahca = (ahca)builder.build();
        final vdv h = H((vdo)((vbq)this.a).a(zkh), ahca);
        final vdv h2 = H((vdo)((vcf)this.b).a(zkh), ahca);
        final Object c2 = this.c;
        final int size = ajnr.d.size();
        final StringBuilder sb = new StringBuilder("Processing response with mutations: ");
        sb.append(size);
        ((vei)c2).a("EMP", sb.toString());
        for (final ajny ajny : ajnr.d) {
            try {
                final int b = ajny.b;
                final boolean b2 = true;
                final boolean b3 = true;
                final int n = 1;
                agot.E(0x1 == (b & 0x1), (Object)"mutation must have a key set");
                ajnx ajnx;
                if ((ajnx = ajny.g) == null) {
                    ajnx = ajnx.a;
                }
                int e;
                if ((e = ajox.e(ajnx.b)) == 0) {
                    e = 1;
                }
                final boolean b4 = e == 1 || e == 3;
                final boolean b5 = e == 2 || e == 3;
                final int d2 = ajny.d;
                int f;
                if ((f = ajox.f(d2)) == 0) {
                    f = 1;
                }
                if (--f != 1) {
                    if (f != 2) {
                        if (f != 3) {
                            final Object c3 = this.c;
                            int f2 = ajox.f(d2);
                            if (f2 == 0) {
                                f2 = n;
                            }
                            final String c4 = ajny.c;
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid mutation type ");
                            sb2.append(f2 - 1);
                            sb2.append(" for mutation with key: ");
                            sb2.append(c4);
                            ((vei)c3).a("EMP", sb2.toString());
                            continue;
                        }
                        agot.E((ajny.b & 0x8) != 0x0 && b2, (Object)"update mutation must have payload");
                        ajnz ajnz;
                        if ((ajnz = ajny.f) == null) {
                            ajnz = ajnz.a;
                        }
                        final byte[] o = vup.o(((agxl)ajnz).toByteString());
                        if (o == null) {
                            ((vei)this.c).a("EMP", "update mutation must have updates");
                            continue;
                        }
                        if (b5) {
                            final String c5 = ajny.c;
                            ajnt ajnt;
                            if ((ajnt = ajny.e) == null) {
                                ajnt = ajnt.a;
                            }
                            h2.i(c5, ajnt, o);
                        }
                        if (b4) {
                            final String c6 = ajny.c;
                            ajnt ajnt2;
                            if ((ajnt2 = ajny.e) == null) {
                                ajnt2 = ajnt.a;
                            }
                            h.i(c6, ajnt2, o);
                            continue;
                        }
                        continue;
                    }
                    else {
                        Label_0710: {
                            if (b5) {
                                ajnx ajnx2;
                                if ((ajnx2 = ajny.g) == null) {
                                    ajnx2 = ajnx.a;
                                }
                                final int h3 = ajox.h(ajnx2.c);
                                if (h3 != 0) {
                                    if (h3 == 2) {
                                        h2.a(ajny.c);
                                        break Label_0710;
                                    }
                                }
                                h2.g(ajny.c);
                            }
                        }
                        if (b4) {
                            h.g(ajny.c);
                            continue;
                        }
                        continue;
                    }
                }
                else {
                    agot.E((ajny.b & 0x8) != 0x0 && b3, (Object)"replace mutation must have payload");
                    final Object d3 = this.d;
                    final String c7 = ajny.c;
                    ajnz ajnz2;
                    if ((ajnz2 = ajny.f) == null) {
                        ajnz2 = ajnz.a;
                    }
                    final byte[] o2 = vup.o(((agxl)ajnz2).toByteString());
                    if (o2 == null) {
                        throw new ahab("Failed to read the extension for".concat(String.valueOf(c7)));
                    }
                    final vdm a = ((vup)((atjj)((vup)d3).b).a()).l(c7, o2).a((vdo)((vbq)((vup)d3).a).a(zkh));
                    if (b5) {
                        h2.d(a);
                    }
                    if (b4) {
                        h.d(a);
                        continue;
                    }
                    continue;
                }
            }
            catch (final ahab ahab) {
                ((vei)this.c).a("EMP", "Error while parsing payload extension for key ".concat(String.valueOf(ajny.c)));
                continue;
            }
            break;
        }
        h.b().D().X();
        h2.b().E((asjd)new usq(this, 3, (byte[])null, (byte[])null, (byte[])null)).U();
    }
    
    public final void x(final vcl vcl) {
        agot.u(((afcr)this.a).contains((Object)vcl));
    }
    
    public final void y(final vcl vcl, final vcl... array) {
        ((afcm)this.a).h(vcl);
        ((afcm)this.a).i((Object[])array);
    }
    
    public final aaal z() {
        return new aaal((String)this.c, (Class)this.d, ((afcm)this.a).g(), ((afcm)this.b).g());
    }
}
