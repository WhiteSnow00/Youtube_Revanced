import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Collections;
import java.util.LinkedHashSet;
import android.util.Pair;
import java.util.LinkedList;
import java.util.Map;
import android.app.AlertDialog;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModelImpl;
import com.google.protobuf.MessageLite;
import java.io.InputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.ui.locks.PausePlaybackLockControllerImpl$PausePlaybackLockImpl$1;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.HashMap;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.widget.TextView;
import android.view.View;
import android.content.SharedPreferences;
import android.app.AlertDialog$Builder;
import android.util.SparseArray;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.Comparator;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aamd
{
    public final Object a;
    public final Object b;
    
    public aamd() {
        this.b = new LinkedHashMap();
        this.a = new tdx((Comparator)new mm(17));
    }
    
    public aamd(final aaca a, final Executor b) {
        this.a = a;
        this.b = b;
    }
    
    public aamd(final aaen a, final avt b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
    }
    
    public aamd(final aamd b, final aacf a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public aamd(final Context a) {
        this.b = new SparseArray();
        this.a = a;
    }
    
    public aamd(final Context a, final AlertDialog$Builder alertDialog$Builder) {
        this.a = a;
        this.b = alertDialog$Builder.create();
    }
    
    public aamd(final SharedPreferences a, final zki b) {
        this.a = a;
        this.b = b;
    }
    
    public aamd(final View view) {
        final TextView b = (TextView)view.findViewById(2131431777);
        b.getClass();
        this.b = b;
        final TextView a = (TextView)view.findViewById(2131431779);
        a.getClass();
        this.a = a;
    }
    
    public aamd(final atjj a, final abll b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aamd(final atjj a, final atjj b) {
        this.a = a;
        this.b = b;
    }
    
    public aamd(final atjj a, final atjj b, final byte[] array) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aamd(final atjj a, final atjj b, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aamd(final atjj a, final atjj b, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aamd(final atjj a, final atjj b, final char[] array) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aamd(final atjj b, final atjj a, final char[] array, final byte[] array2) {
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public aamd(final WatchNextResponseModel a, final wyh b) {
        this.a = a;
        this.b = b;
    }
    
    public aamd(final String a, final aayc b) {
        this.a = a;
        this.b = b;
    }
    
    public aamd(final tku b, final tku a) {
        this.b = b;
        this.a = a;
    }
    
    public aamd(final ttj a, final abtw b) {
        this.a = a;
        this.b = b;
    }
    
    public aamd(final vhm b, final vjl a) {
        this.b = b;
        this.a = a;
    }
    
    public aamd(final byte[] array) {
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    public aamd(final byte[] array, final byte[] array2) {
        final atid ad = atid.aD();
        this.b = ad;
        this.a = ad;
    }
    
    public aamd(final char[] array) {
        this.b = new CopyOnWriteArraySet();
        this.a = ((atje)atir.aR((Object)false)).aX();
    }
    
    public static final boolean I(final aioe aioe) {
        if (aioe != null) {
            if (((agzd)aioe).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
                apqh apqh;
                if ((apqh = ((apqg)((agzd)aioe).rr((agyr)WatchEndpointOuterClass.watchEndpoint)).o) == null) {
                    apqh = apqh.a;
                }
                anbg anbg;
                if ((anbg = apqh.d) == null) {
                    anbg = anbg.a;
                }
                if ((anbg.b & 0x1) != 0x0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static final String K(final zkh zkh) {
        return tmy.aM("%s_uses_offline", zkh.d());
    }
    
    private final int L(final zyx zyx, final Collection collection) {
        synchronized (this) {
            final String a = zyx.a;
            int e;
            final int n = e = zyx.e;
            if (collection != null) {
                e = n - collection.size();
            }
            final aacq p2 = this.p(a);
            if (p2 != null) {
                final int a2 = p2.a();
                monitorexit(this);
                return e - a2;
            }
            return e;
        }
    }
    
    private static final auip M(final List list, final List list2) {
        final HashSet set = new HashSet();
        final ArrayList list3 = new ArrayList();
        final ArrayList list4 = new ArrayList();
        for (final zzg zzg : list2) {
            if (list.contains(zzg.f())) {
                set.add(zzg.f());
            }
            else {
                list4.add(zzg);
            }
        }
        for (final String s : list) {
            if (!set.contains(s)) {
                list3.add(s);
            }
        }
        return new auip((Set)set, (List)list3, (List)list4);
    }
    
    public static aqop z(final aqor aqor, final String s) {
        final aqop a = aqop.a;
        s.getClass();
        final ahas d = aqor.d;
        if (d.containsKey(s)) {
            return (aqop)d.get(s);
        }
        return a;
    }
    
    public final asic A(final asix asix) {
        return ((tku)this.b).d().R().al(asix);
    }
    
    public final boolean B() {
        return (((aqor)((tku)this.b).c()).b & 0x1) != 0x0;
    }
    
    public final zzg C(final String s) {
        szc.e();
        final aabz a = ((aaca)this.a).a();
        a.a.add(s);
        ((vii)a).i();
        try {
            while (true) {
                for (final amtp amtp : ((aaca)this.a).b(a).c) {
                    amto amto;
                    if ((amto = amtp.c) == null) {
                        amto = amto.a;
                    }
                    if (amto.c.equals(s)) {
                        amto amto2;
                        if ((amto2 = amtp.c) == null) {
                            amto2 = amto.a;
                        }
                        if (amto2 != null) {
                            return zzg.c(amto2);
                        }
                        throw new ExecutionException((Throwable)new vkn("No video data returned for videoId=".concat(String.valueOf(s))));
                    }
                }
                amto amto2 = null;
                continue;
            }
        }
        catch (final vkn vkn) {
            throw new ExecutionException((Throwable)vkn);
        }
    }
    
    public final aktj D(long b, long d, final int d2, final float e, final List list, final boolean f) {
        szc.e();
        final aaca aaca = (aaca)this.a;
        final aaby aaby = new aaby(aaca.c, ((zki)aaca.d).c(), (arud)aaca.f, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        aaby.b = b;
        aaby.c = d;
        aaby.d = d2;
        aaby.e = e;
        for (final aabu aabu : list) {
            final String a = aabu.a;
            b = aabu.b;
            final String[] c = aabu.c;
            d = aabu.d;
            final long e2 = aabu.e;
            aaha.w(aaby.f);
            final agza builder = ((agzi)aktg.a).createBuilder();
            builder.copyOnWrite();
            final aktg aktg = (aktg)builder.instance;
            aktg.b |= 0x1;
            aktg.c = a;
            builder.copyOnWrite();
            final aktg aktg2 = (aktg)builder.instance;
            aktg2.b |= 0x2;
            aktg2.d = b;
            final List<String> list2 = Arrays.asList((String[])c);
            builder.copyOnWrite();
            final aktg aktg3 = (aktg)builder.instance;
            final agzy e3 = aktg3.e;
            if (!e3.c()) {
                aktg3.e = agzi.mutableCopy(e3);
            }
            agxl.addAll((Iterable)list2, (List)aktg3.e);
            builder.copyOnWrite();
            final aktg aktg4 = (aktg)builder.instance;
            aktg4.b |= 0x4;
            aktg4.f = f;
            builder.copyOnWrite();
            final aktg aktg5 = (aktg)builder.instance;
            aktg5.b |= 0x8;
            aktg5.g = d;
            builder.copyOnWrite();
            final aktg aktg6 = (aktg)builder.instance;
            aktg6.b |= 0x10;
            aktg6.h = 0L;
            aaby.a.add(builder.build());
        }
        ((vii)aaby).i();
        try {
            return (aktj)((vkh)((aaca)this.a).e).d((vjn)aaby);
        }
        catch (final vkn vkn) {
            throw new ExecutionException((Throwable)vkn);
        }
    }
    
    public final ashe E() {
        return ((ashe)this.a).z();
    }
    
    public final void F(final absq absq) {
        synchronized (this) {
            if (((CopyOnWriteArraySet)this.b).remove(absq)) {
                absq.b.c(absq.a);
                if (((CopyOnWriteArraySet)this.b).isEmpty()) {
                    ((atje)this.a).tr((Object)false);
                }
            }
        }
    }
    
    public final absq G(final auh auh) {
        synchronized (this) {
            final absq absq = new absq(this, auh, (byte[])null);
            absq.a = (aul)new PausePlaybackLockControllerImpl$PausePlaybackLockImpl$1(absq);
            ((CopyOnWriteArraySet)this.b).add(absq);
            ((atje)this.a).tr((Object)true);
            auh.b(absq.a);
            return absq;
        }
    }
    
    public final abkk H(final znj znj, final long n, final abpj abpj, final PlayerResponseModel playerResponseModel) {
        final uyi uyi = (uyi)((atjj)this.a).a();
        uyi.getClass();
        final Set set = (Set)((atjj)this.b).a();
        set.getClass();
        abpj.getClass();
        return new abkk(uyi, set, znj, n, abpj, playerResponseModel, (byte[])null, (byte[])null);
    }
    
    public final yzf J(final String s, int size) {
        szc.e();
        final aabz a = ((aaca)this.a).a();
        a.b.add(s);
        ((vii)a).i();
        try {
            final aktm b = ((aaca)this.a).b(a);
            final amss p2 = aaiw.p(b, s);
            final amss p3 = aaiw.p(b, s);
            final yzf yzf = null;
            ArrayList list2;
            if (p3 != null) {
                final ArrayList list = new ArrayList();
                final Iterator<Object> iterator = p3.f.iterator();
                while (true) {
                    list2 = list;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    amto amto;
                    if ((amto = iterator.next().c) == null) {
                        amto = amto.a;
                    }
                    list.add(amto);
                }
            }
            else {
                list2 = null;
            }
            yzf yzf2 = yzf;
            if (p2 != null) {
                if (list2 == null) {
                    yzf2 = yzf;
                }
                else {
                    int size2;
                    amss amss;
                    if (p2.f.size() != 0) {
                        size2 = p2.f.size();
                        final agza builder = ((agzi)p2).toBuilder();
                        builder.copyOnWrite();
                        ((amss)builder.instance).f = amss.emptyProtobufList();
                        amss = (amss)builder.build();
                    }
                    else {
                        size2 = 0;
                        amss = p2;
                    }
                    aorm aorm;
                    if ((aorm = amss.d) == null) {
                        aorm = aorm.a;
                    }
                    final vey vey = new vey(aaiw.q(aorm, (List)afcr.r((Object)480)));
                    amre amre;
                    if ((amre = amss.e) == null) {
                        amre = amre.a;
                    }
                    final zyx c = zyx.c(amss, false, size2, vey, agp.d(amre));
                    final ArrayList<zzg> list3 = new ArrayList<zzg>();
                    final Iterator iterator2 = list2.iterator();
                    while (iterator2.hasNext()) {
                        list3.add(zzg.c((amto)iterator2.next()));
                    }
                    final yzf yzf3 = new yzf(c, (List)list3);
                    if (size < 0) {
                        return null;
                    }
                    final Object b2 = yzf3.b;
                    final Object a2 = yzf3.a;
                    final List subList = ((List)a2).subList(0, Math.min(((List)a2).size(), size));
                    size = subList.size();
                    yzf2 = new yzf(new zyx((zyx)b2, size), (List)subList);
                }
            }
            return yzf2;
        }
        catch (final vkn vkn) {
            throw new ExecutionException((Throwable)vkn);
        }
    }
    
    public final int a() {
        synchronized (this) {
            final zkh c = ((zki)this.b).c();
            if (c.z()) {
                return 2;
            }
            final String k = K(c);
            if (!((SharedPreferences)this.a).contains(k)) {
                return 0;
            }
            final boolean boolean1 = ((SharedPreferences)this.a).getBoolean(k, false);
            monitorexit(this);
            if (boolean1) {
                return 1;
            }
            return 2;
        }
    }
    
    public final void b(final boolean b) {
        synchronized (this) {
            final zkh c = ((zki)this.b).c();
            if (c.z()) {
                return;
            }
            ((SharedPreferences)this.a).edit().putBoolean(K(c), b).apply();
        }
    }
    
    public final boolean c() {
        return this.a() != 2;
    }
    
    public final String d(final int n) {
        final String s = (String)((SparseArray)this.b).get(n, (Object)null);
        if (s != null) {
            return s;
        }
        try {
            final InputStream openRawResource = ((Context)this.a).getResources().openRawResource(n);
            final byte[] array = new byte[openRawResource.available()];
            if (openRawResource.read(array) > 0) {
                final String s2 = new String(array, Charset.defaultCharset());
                ((SparseArray)this.b).put(n, (Object)s2);
                return s2;
            }
        }
        catch (final IOException ex) {
            trn.c("ShaderSourceCache", "Error retrieving resource: ".concat(String.valueOf(ex.getMessage())));
        }
        return "";
    }
    
    public final void e(final String s, final String s2, final boolean b) {
        tsx.n(s2);
        final zzn zzn = new zzn();
        aadj.U((zyq)zzn, s2);
        aadj.T((zyq)zzn, 2);
        aadj.E((zyq)zzn, b);
        aadj.Q((zyq)zzn, ((avt)this.b).Z());
        ((aaen)this.a).c(s, aaiw.r(s, s2), 100, (zyq)zzn);
    }
    
    public final List f(final PlayerResponseModel playerResponseModel) {
        final ArrayList list = new ArrayList();
        final long f = playerResponseModel.n().f;
        final agzy g = playerResponseModel.z().G;
        if (g.isEmpty()) {
            return list;
        }
        final Iterator<Object> iterator = g.iterator();
        while (iterator.hasNext()) {
            final Iterator<Object> iterator2 = iterator.next().d.iterator();
            while (iterator2.hasNext()) {
                final akve akve = (akve)((vjl)this.a).a(iterator2.next().c.I(), (MessageLite)akve.a);
                if (akve != null) {
                    final PlayerResponseModelImpl playerResponseModelImpl = new PlayerResponseModelImpl(akve, f, (vhm)this.b);
                    if (playerResponseModelImpl.d == null) {
                        continue;
                    }
                    list.add(playerResponseModelImpl);
                }
            }
        }
        return list;
    }
    
    public final void g() {
        if (((AlertDialog)this.b).isShowing()) {
            ((AlertDialog)this.b).dismiss();
        }
    }
    
    public final aadh h(final String s) {
        synchronized (this) {
            return ((Map<K, aadh>)this.b).get(s);
        }
    }
    
    public final aadh i(final String s) {
        synchronized (this) {
            ((tdx)this.a).b((Object)s);
            return ((Map<K, aadh>)this.b).remove(s);
        }
    }
    
    public final List j() {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final Iterator iterator = ((tdx)this.a).iterator();
            while (iterator.hasNext()) {
                final aadh aadh = ((Map<K, aadh>)this.b).get(iterator.next());
                if (aadh != null) {
                    list.add(aadh);
                }
            }
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final Map k() {
        monitorenter(this);
        try {
            final HashMap hashMap = new HashMap(((Map)this.b).size());
            for (final aadh aadh : ((Map<K, aadh>)this.b).values()) {
                hashMap.put(aadh.a, aadh.a());
            }
            monitorexit(this);
            return hashMap;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void l(final aadh aadh) {
        monitorenter(this);
        try {
            ((Map<String, aadh>)this.b).put(aadh.a, aadh);
            final Object a = this.a;
            final String a2 = aadh.a;
            final Iterator iterator = ((tdx)a).a.values().iterator();
            while (iterator.hasNext()) {
                if (((LinkedList)iterator.next()).contains(a2)) {
                    ((tdx)this.a).b((Object)aadh.a);
                    break;
                }
            }
            ((tdx)this.a).a((Object)new Pair((Object)aadh.h, (Object)aadj.m(aadh.e)), (Object)aadh.a);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void m() {
        synchronized (this) {
            ((Map)this.b).clear();
            ((tdx)this.a).a.clear();
        }
    }
    
    public final boolean n(final String s) {
        synchronized (this) {
            return ((Map)this.b).containsKey(s);
        }
    }
    
    public final boolean o() {
        synchronized (this) {
            final boolean empty = ((Map)this.b).isEmpty();
            monitorexit(this);
            return !empty;
        }
    }
    
    public final aacq p(final String s) {
        synchronized (this) {
            tsx.n(s);
            return ((Map<K, aacq>)this.a).get(s);
        }
    }
    
    public final aacq q(final zyx zyx, final Collection collection) {
        monitorenter(this);
        try {
            zyx.getClass();
            final String a = zyx.a;
            final aacq aacq = new aacq(this, zyx, (byte[])null, (byte[])null);
            aacq.h(this.L(zyx, collection));
            aacq.g();
            aacq.f();
            if (collection != null) {
                final Iterator iterator = collection.iterator();
                while (iterator.hasNext()) {
                    aacq.e((String)iterator.next());
                }
            }
            final aacq p2 = this.p(a);
            if (p2 != null) {
                final Iterator iterator2 = p2.d().iterator();
                while (iterator2.hasNext()) {
                    aacq.e((String)iterator2.next());
                }
            }
            ((Map<String, aacq>)this.a).put(a, aacq);
            monitorexit(this);
            return aacq;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final List r(final String s) {
        monitorenter(this);
        try {
            tsx.n(s);
            final ArrayList list = new ArrayList();
            final Set set = ((Map<K, Set>)this.b).get(s);
            if (set != null) {
                final Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                    final aacq p = this.p((String)iterator.next());
                    if (p != null) {
                        list.add(p);
                    }
                }
            }
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void s(final String s, final String s2) {
        synchronized (this) {
            Set set;
            if ((set = ((Map<K, Set>)this.b).get(s)) == null) {
                set = new HashSet();
                ((Map<String, Set>)this.b).put(s, set);
            }
            set.add(s2);
        }
    }
    
    public final void t(final String s) {
        synchronized (this) {
            tsx.n(s);
            ((Map<Object, Object>)this.a).remove(s);
        }
    }
    
    public final void u(final String s, final String s2) {
        synchronized (this) {
            final Set set = ((Map<K, Set>)this.b).get(s);
            if (set != null) {
                set.remove(s2);
                if (set.isEmpty()) {
                    ((Map<Object, Object>)this.b).remove(s);
                }
            }
        }
    }
    
    public final long v(final String s, final String s2, final String s3) {
        final zzl t = ((ztu)((atjj)this.a).a()).t(s);
        if (t == null) {
            return 0L;
        }
        if (t.e) {
            return 0L;
        }
        final Set y = ((ztu)((atjj)this.a).a()).y(s);
        if (!y.isEmpty() && (y.size() != 1 || s2 == null || !y.contains(s2))) {
            return 0L;
        }
        final ztu ztu = (ztu)((atjj)this.a).a();
        tsx.n(s);
        final Set g = ztu.h.g(s);
        if (!g.isEmpty() && (g.size() != 1 || s3 == null || !g.contains(s3))) {
            return 0L;
        }
        return t.f();
    }
    
    public final boolean w(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final zzl t = ((ztu)((atjj)this.a).a()).t((String)iterator.next());
            boolean b = false;
            if (t != null) {
                if (t.l.b()) {
                    continue;
                }
                b = b;
            }
            return b;
        }
        return true;
    }
    
    public final Map x(final List list, final Map map, final Map map2, final Map map3, final Map map4, final Map map5, final Map map6, final long n, int size) {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final HashMap hashMap3 = new HashMap();
        for (final String s : list) {
            final Collection collection = map3.get(s);
            final ArrayList list2 = new ArrayList();
            final List list3 = map2.get(s);
            if (collection != null && list3 != null) {
                for (final zzg zzg : list3) {
                    if (!collection.contains(zzg.f())) {
                        list2.add(zzg.f());
                    }
                }
                hashMap2.put(s, list2);
                final Integer n2 = map.get(s);
                amtz amtz;
                if ((n2 != null && n2 == 2) || size == 0) {
                    amtz = amtz.b;
                }
                else {
                    amtz = amtz.c;
                }
                hashMap3.put(s, amtz);
            }
        }
        final afcw b = afgm.b;
        final HashMap hashMap4 = new HashMap();
        final HashMap hashMap5 = new HashMap();
        final HashMap hashMap6 = new HashMap();
        final HashMap hashMap7 = new HashMap();
        size = hashMap2.size();
        final Iterator iterator3 = hashMap2.keySet().iterator();
        long n3 = 0L;
        while (iterator3.hasNext()) {
            final String s2 = (String)iterator3.next();
            agot.u(map2.containsKey(s2));
            final long max = Math.max(n - n3, 0L);
            final int u = ((aacf)this.a).U((amuv)tmy.L(map6, (Object)s2, (Object)amuv.a));
            final Integer n4 = (Integer)tmy.L(map5, (Object)s2, (Object)(-1));
            final Boolean b2 = (Boolean)tmy.L((Map)b, (Object)s2, (Object)false);
            final amtz amtz2 = (amtz)tmy.L((Map)hashMap3, (Object)s2, (Object)amtz.a);
            final List list4 = (List)tmy.L(map2, (Object)s2, (Object)afcr.q());
            final Object b3 = this.b;
            final List list5 = (List)hashMap2.get(s2);
            final byte[] array = map4.get(s2);
            final boolean booleanValue = b2;
            n4.intValue();
            final adgi y = ((aamd)b3).y(s2, null, list5, list4, amtz2, array, booleanValue, max, map6.get(s2), u);
            Set set;
            if ((set = ((Map<K, Set>)y.b).get(s2)) == null) {
                set = new HashSet();
            }
            hashMap4.put(s2, set);
            hashMap5.put(s2, y.a(s2));
            hashMap6.put(s2, y.b(s2));
            final List c = y.c(s2);
            if (c != null && !c.isEmpty()) {
                if (size > 1) {
                    trn.b("Encountered transient list in batched playlist mode. This is not supported.");
                }
                else {
                    hashMap7.put(s2, c);
                }
            }
            n3 += y.a;
        }
        final adgi adgi = new adgi(hashMap4, hashMap5, hashMap6, hashMap7, n3);
        for (final String s3 : list) {
            final LinkedHashSet a = adgi.a(s3);
            final HashSet set2 = new HashSet();
            final Iterator iterator5 = a.iterator();
            while (iterator5.hasNext()) {
                set2.add(((zzg)iterator5.next()).f());
            }
            hashMap.put(s3, set2);
        }
        return hashMap;
    }
    
    public final adgi y(String iterator, String s, final List list, final List list2, final amtz amtz, final byte[] array, final boolean b, long n, amuv amuv, int i) {
        final Integer value = 1;
        agot.u(iterator != null ^ s != null);
        String s2;
        if (!aexs.f(iterator)) {
            s2 = iterator;
        }
        else {
            s2 = s;
        }
        s2.getClass();
        final HashSet set = new HashSet();
        final LinkedHashSet set2 = new LinkedHashSet();
        final ArrayList list3 = new ArrayList();
        final ArrayList list4 = new ArrayList();
        final amtz a = amtz.a;
        final int ordinal = amtz.ordinal();
        final long n2 = 0L;
        if (ordinal != 2 && ordinal != 3) {
            final auip m = M(list, list2);
            final Iterator iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                list3.add(((zzg)iterator2.next()).f());
            }
            set.addAll((Collection)m.c);
            set2.addAll((Collection)m.b);
            n = n2;
        }
        else {
            final auip j = M(list, list2);
            final abpj abpj = (abpj)((atjj)this.b).a();
            final int a2 = aahf.a(amuv, -1);
            if (a2 == -1) {
                n = n2;
            }
            else {
                final Iterator<Object> iterator3 = ((List<Object>)j.c).iterator();
                long n3 = n;
                n = 0L;
                while (iterator3.hasNext()) {
                    final String s3 = iterator3.next();
                    final long v = this.v(s3, iterator, s);
                    n3 += v;
                    n -= v;
                    set.add(s3);
                }
                long n4 = n3;
                long n5 = n;
                Label_0540: {
                    if (n3 < 0L) {
                        final HashMap hashMap = new HashMap();
                        for (final String s4 : j.a) {
                            hashMap.put(s4, this.v(s4, iterator, s));
                        }
                        final ArrayList list5 = new ArrayList(hashMap.entrySet());
                        Collections.sort((List<E>)list5, (Comparator<? super E>)zox.e);
                        for (int size = list5.size(), k = 0; k < size; ++k) {
                            final Map.Entry<String, V> entry = (Map.Entry<String, V>)list5.get(k);
                            if (n3 >= 0L) {
                                n4 = n3;
                                n5 = n;
                                break Label_0540;
                            }
                            n3 += (long)entry.getValue();
                            n -= (long)entry.getValue();
                            set.add(entry.getKey());
                        }
                        n5 = n;
                        n4 = n3;
                    }
                }
                amuv = (amuv)new HashSet();
                iterator = (String)list2.iterator();
                long n6 = n4;
                n = n5;
                while (((Iterator)iterator).hasNext()) {
                    final zzg zzg = ((Iterator<zzg>)iterator).next();
                    final String f = zzg.f();
                    long n8 = 0L;
                    long n9 = 0L;
                    Label_0919: {
                        if (((Set)j.a).contains(f)) {
                            list3.add(zzg.f());
                        }
                        else {
                            if (!((Set)amuv).contains(f)) {
                                int n7;
                                if (!b) {
                                    n7 = 2;
                                }
                                else {
                                    n7 = 3;
                                }
                                try {
                                    final PlayerResponseModel s5 = abpj.S(f, n7, array);
                                    n8 = n6;
                                    n9 = n;
                                    if (abpj.Q(s5)) {
                                        n8 = n6;
                                        n9 = n;
                                        if (abpj.P(s5)) {
                                            final VideoStreamingData n10 = s5.n();
                                            final boolean l = abpj.L(a2);
                                            final FormatStreamModel r = abpj.R(a2, Integer.MAX_VALUE, i, n10, true, s5.m());
                                            FormatStreamModel r2;
                                            if (l) {
                                                r2 = null;
                                            }
                                            else {
                                                r2 = abpj.R(a2, Integer.MAX_VALUE, i, n10, false, s5.m());
                                            }
                                            n8 = n6;
                                            n9 = n;
                                            if (r != null) {
                                                if (!l) {
                                                    n8 = n6;
                                                    n9 = n;
                                                    if (r2 == null) {
                                                        break Label_0919;
                                                    }
                                                }
                                                final long j2 = r.j();
                                                long j3;
                                                if (r2 == null) {
                                                    j3 = 0L;
                                                }
                                                else {
                                                    j3 = r2.j();
                                                }
                                                final long n11 = j2 + j3;
                                                n8 = n6;
                                                n9 = n;
                                                if (n6 >= n11) {
                                                    n8 = n6 - n11;
                                                    n9 = n + n11;
                                                    set2.add(zzg);
                                                    list3.add(f);
                                                    ((Set<String>)amuv).add(f);
                                                }
                                            }
                                        }
                                    }
                                }
                                catch (final vkn vkn) {
                                    n9 = n;
                                    n8 = n6;
                                }
                                break Label_0919;
                            }
                            list3.add(zzg.f());
                        }
                        n8 = n6;
                        n9 = n;
                    }
                    n6 = n8;
                    n = n9;
                }
                final Iterator iterator5 = set.iterator();
                while (iterator5.hasNext()) {
                    iterator = (String)iterator5.next();
                    if (list3.contains(iterator)) {
                        list3.removeAll(Collections.singleton(iterator));
                    }
                }
            }
        }
        if (amtz == amtz.d) {
            if (!this.w(list3)) {
                final Iterator iterator6 = set.iterator();
                while (iterator6.hasNext()) {
                    s = (String)iterator6.next();
                    final zzl t = ((ztu)((atjj)this.a).a()).t(s);
                    if (t != null && t.l == zyw.b) {
                        iterator6.remove();
                    }
                }
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            final Iterator iterator7 = list.iterator();
            while (iterator7.hasNext()) {
                s = (String)iterator7.next();
                if (!set.contains(s)) {
                    if (linkedHashMap.containsKey(s)) {
                        linkedHashMap.put(s, (int)linkedHashMap.get(s) + 1);
                    }
                    else {
                        linkedHashMap.put(s, value);
                    }
                }
            }
            final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int size2;
            String s6;
            for (size2 = list3.size(), i = 0; i < size2; ++i) {
                s6 = (String)list3.get(i);
                if (linkedHashMap2.containsKey(s6)) {
                    linkedHashMap2.put(s6, (int)linkedHashMap2.get(s6) + 1);
                }
                else {
                    linkedHashMap2.put(s6, value);
                }
            }
            for (final String s7 : linkedHashMap2.keySet()) {
                if (linkedHashMap.containsKey(s7)) {
                    i = (int)linkedHashMap.get(s7);
                }
                else {
                    i = 0;
                }
                linkedHashMap.put(s7, Math.max(i, (int)linkedHashMap2.get(s7)));
            }
            final Iterator iterator9 = linkedHashMap.keySet().iterator();
            while (iterator9.hasNext()) {
                for (s = (String)iterator9.next(), i = 0; i < (int)linkedHashMap.get(s); ++i) {
                    list4.add(s);
                }
            }
        }
        if (list4.isEmpty()) {
            return new adgi(s2, set, set2, list3, null, n);
        }
        return new adgi(s2, set, set2, list3, list4, n);
    }
}
