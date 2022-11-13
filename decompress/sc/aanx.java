import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Collections;
import java.util.LinkedHashSet;
import android.util.Pair;
import java.util.LinkedList;
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
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.Comparator;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aanx
{
    public final Object a;
    public final Object b;
    
    public aanx() {
        this.b = new LinkedHashMap();
        this.a = new tgb((Comparator)new mm(17));
    }
    
    public aanx(final aadx b, final Executor a) {
        this.b = b;
        this.a = a;
    }
    
    public aanx(final aagi a, final msr b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public aanx(final aanx b, final aaec a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public aanx(final abuh a, final Map b) {
        this.a = a;
        this.b = b;
    }
    
    public aanx(final Context a) {
        this.b = new SparseArray();
        this.a = a;
    }
    
    public aanx(final Context a, final AlertDialog$Builder alertDialog$Builder) {
        this.a = a;
        this.b = alertDialog$Builder.create();
    }
    
    public aanx(final SharedPreferences a, final zmf b) {
        this.a = a;
        this.b = b;
    }
    
    public aanx(final View view) {
        final TextView b = (TextView)view.findViewById(2131431780);
        b.getClass();
        this.b = b;
        final TextView a = (TextView)view.findViewById(2131431782);
        a.getClass();
        this.a = a;
    }
    
    public aanx(final atke a, final abnl b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aanx(final atke a, final atke b) {
        this.a = a;
        this.b = b;
    }
    
    public aanx(final atke b, final atke a, final byte[] array) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public aanx(final atke b, final atke a, final byte[] array, final byte[] array2) {
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public aanx(final atke a, final atke b, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aanx(final atke b, final atke a, final char[] array) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public aanx(final WatchNextResponseModel a, final xah b) {
        this.a = a;
        this.b = b;
    }
    
    public aanx(final String a, final aazz b) {
        this.a = a;
        this.b = b;
    }
    
    public aanx(final tmx b, final tmx a) {
        this.b = b;
        this.a = a;
    }
    
    public aanx(final tvn a, final abwa b) {
        this.a = a;
        this.b = b;
    }
    
    public aanx(final vjm b, final vlq a) {
        this.b = b;
        this.a = a;
    }
    
    public aanx(final byte[] array) {
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    public aanx(final byte[] array, final byte[] array2) {
        final ativ ae = ativ.aE();
        this.b = ae;
        this.a = ae;
    }
    
    public aanx(final char[] array) {
        this.b = new CopyOnWriteArraySet();
        this.a = ((atjz)atjm.aW((Object)false)).bc();
    }
    
    public static final boolean I(final aiqj aiqj) {
        if (aiqj != null) {
            if (((ahbc)aiqj).ry((ahaq)WatchEndpointOuterClass.watchEndpoint)) {
                apsl apsl;
                if ((apsl = ((apsk)((ahbc)aiqj).rx((ahaq)WatchEndpointOuterClass.watchEndpoint)).o) == null) {
                    apsl = apsl.a;
                }
                andk andk;
                if ((andk = apsl.d) == null) {
                    andk = andk.a;
                }
                if ((andk.b & 0x1) != 0x0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static final String L(final zme zme) {
        return tpe.aM("%s_uses_offline", zme.d());
    }
    
    private final int M(final aaar aaar, final Collection collection) {
        synchronized (this) {
            final String a = aaar.a;
            int e;
            final int n = e = aaar.e;
            if (collection != null) {
                e = n - collection.size();
            }
            final aaen p2 = this.p(a);
            if (p2 != null) {
                final int a2 = p2.a();
                monitorexit(this);
                return e - a2;
            }
            return e;
        }
    }
    
    private static final aujg N(final List list, final List list2) {
        final HashSet set = new HashSet();
        final ArrayList list3 = new ArrayList();
        final ArrayList list4 = new ArrayList();
        for (final aaba aaba : list2) {
            if (list.contains(aaba.f())) {
                set.add(aaba.f());
            }
            else {
                list4.add(aaba);
            }
        }
        for (final String s : list) {
            if (!set.contains(s)) {
                list3.add(s);
            }
        }
        return new aujg((Set)set, (List)list3, (List)list4);
    }
    
    public static aqrb z(final aqrd aqrd, final String s) {
        final aqrb a = aqrb.a;
        s.getClass();
        final ahcr d = aqrd.d;
        if (((Map)d).containsKey(s)) {
            return (aqrb)((Map)d).get(s);
        }
        return a;
    }
    
    public final asir A(final asjm asjm) {
        return ((tmx)this.b).d().R().am(asjm);
    }
    
    public final boolean B() {
        return (((aqrd)((tmx)this.b).c()).b & 0x1) != 0x0;
    }
    
    public final aaba C(final String s) {
        tbi.e();
        final aadw a = ((aadx)this.b).a();
        a.a.add(s);
        ((vkk)a).i();
        try {
            while (true) {
                for (final amvt amvt : ((aadx)this.b).b(a).c) {
                    amvs amvs;
                    if ((amvs = amvt.c) == null) {
                        amvs = amvs.a;
                    }
                    if (amvs.c.equals(s)) {
                        amvs amvs2;
                        if ((amvs2 = amvt.c) == null) {
                            amvs2 = amvs.a;
                        }
                        if (amvs2 != null) {
                            return aaba.c(amvs2);
                        }
                        throw new ExecutionException((Throwable)new vmr("No video data returned for videoId=".concat(String.valueOf(s))));
                    }
                }
                amvs amvs2 = null;
                continue;
            }
        }
        catch (final vmr vmr) {
            throw new ExecutionException((Throwable)vmr);
        }
    }
    
    public final akvm D(long b, long e, final int d, final float e2, final List list, final boolean f) {
        tbi.e();
        final aadx aadx = (aadx)this.b;
        final aadv aadv = new aadv(aadx.c, ((zmf)aadx.d).c(), (arwh)aadx.f, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        aadv.b = b;
        aadv.c = e;
        aadv.d = d;
        aadv.e = e2;
        for (final aadr aadr : list) {
            final String a = aadr.a;
            b = aadr.b;
            final String[] c = aadr.c;
            final long d2 = aadr.d;
            e = aadr.e;
            aait.w(aadv.f);
            final ahaz builder = akvj.a.createBuilder();
            builder.copyOnWrite();
            final akvj akvj = (akvj)builder.instance;
            akvj.b |= 0x1;
            akvj.c = a;
            builder.copyOnWrite();
            final akvj akvj2 = (akvj)builder.instance;
            akvj2.b |= 0x2;
            akvj2.d = b;
            final List<String> list2 = Arrays.asList((String[])c);
            builder.copyOnWrite();
            final akvj akvj3 = (akvj)builder.instance;
            final ahbx e3 = akvj3.e;
            if (!e3.c()) {
                akvj3.e = ahbh.mutableCopy(e3);
            }
            agzk.addAll((Iterable)list2, (List)akvj3.e);
            builder.copyOnWrite();
            final akvj akvj4 = (akvj)builder.instance;
            akvj4.b |= 0x4;
            akvj4.f = f;
            builder.copyOnWrite();
            final akvj akvj5 = (akvj)builder.instance;
            akvj5.b |= 0x8;
            akvj5.g = d2;
            builder.copyOnWrite();
            final akvj akvj6 = (akvj)builder.instance;
            akvj6.b |= 0x10;
            akvj6.h = 0L;
            aadv.a.add(builder.build());
        }
        ((vkk)aadv).i();
        try {
            return (akvm)((vml)((aadx)this.b).e).d((vls)aadv);
        }
        catch (final vmr vmr) {
            throw new ExecutionException((Throwable)vmr);
        }
    }
    
    public final void E(final List list) {
        final abvx p = ((abuh)this.a).p();
        if (p == null) {
            zlm.b(zll.b, zlk.j, "Error registering Server driven CueRanges, trying to add CueRanges without an available VideoPlayback");
            return;
        }
        final abwa e = p.e();
        if (e == null) {
            zlm.b(zll.b, zlk.j, "Error registering Server driven CueRanges, trying to add CueRanges without an available CueRangeRegistrar");
            return;
        }
        e.l((Class)abwi.class);
        final ArrayList list2 = new ArrayList();
        for (final ajbq ajbq : list) {
            apns apns;
            if ((apns = ajbq.d) == null) {
                apns = apns.a;
            }
            long d;
            boolean b;
            if ((apns.b & 0x2) != 0x0) {
                d = apns.d;
                b = true;
            }
            else {
                final long c = apns.c;
                b = false;
                d = c;
                if (c < 0L) {
                    d = c + p.b();
                }
            }
            ahan ahan;
            if ((ahan = ajbq.e) == null) {
                ahan = ahan.a;
            }
            final long a = ahey.a(ahan);
            final ahbx g = ajbq.g;
            String c2;
            if ((ajbq.b & 0x1) != 0x0) {
                c2 = ajbq.c;
            }
            else {
                c2 = "innertube_cue_range";
            }
            list2.add(new abwi(this, d, d + a, b, (List)g, c2, ajbq.f, (byte[])null));
        }
        e.f((List)list2);
    }
    
    public final asht F() {
        return ((asht)this.a).A();
    }
    
    public final void G(final abur abur) {
        synchronized (this) {
            if (((CopyOnWriteArraySet)this.b).remove(abur)) {
                abur.b.c(abur.a);
                if (((CopyOnWriteArraySet)this.b).isEmpty()) {
                    ((atjz)this.a).tu((Object)false);
                }
            }
        }
    }
    
    public final abur H(final aui aui) {
        synchronized (this) {
            final abur abur = new abur(this, aui, (byte[])null, (byte[])null);
            abur.a = (aum)new PausePlaybackLockControllerImpl$PausePlaybackLockImpl$1(abur);
            ((CopyOnWriteArraySet)this.b).add(abur);
            ((atjz)this.a).tu((Object)true);
            aui.b(abur.a);
            return abur;
        }
    }
    
    public final zaz J(final String s, int size) {
        tbi.e();
        final aadw a = ((aadx)this.b).a();
        a.b.add(s);
        ((vkk)a).i();
        try {
            final akvp b = ((aadx)this.b).b(a);
            final amuw p2 = aakr.p(b, s);
            final amuw p3 = aakr.p(b, s);
            final zaz zaz = null;
            ArrayList list2;
            if (p3 != null) {
                final ArrayList list = new ArrayList();
                final Iterator<Object> iterator = ((List<Object>)p3.f).iterator();
                while (true) {
                    list2 = list;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    amvs amvs;
                    if ((amvs = iterator.next().c) == null) {
                        amvs = amvs.a;
                    }
                    list.add(amvs);
                }
            }
            else {
                list2 = null;
            }
            zaz zaz2 = zaz;
            if (p2 != null) {
                if (list2 == null) {
                    zaz2 = zaz;
                }
                else {
                    int size2;
                    amuw amuw;
                    if (p2.f.size() != 0) {
                        size2 = p2.f.size();
                        final ahaz builder = ((ahbh)p2).toBuilder();
                        builder.copyOnWrite();
                        ((amuw)builder.instance).f = amuw.emptyProtobufList();
                        amuw = (amuw)builder.build();
                    }
                    else {
                        size2 = 0;
                        amuw = p2;
                    }
                    aotp aotp;
                    if ((aotp = amuw.d) == null) {
                        aotp = aotp.a;
                    }
                    final vgy vgy = new vgy(aakr.q(aotp, (List)afeq.r((Object)480)));
                    amti amti;
                    if ((amti = amuw.e) == null) {
                        amti = amti.a;
                    }
                    final aaar c = aaar.c(amuw, false, size2, vgy, agq.d(amti));
                    final ArrayList<aaba> list3 = new ArrayList<aaba>();
                    final Iterator iterator2 = list2.iterator();
                    while (iterator2.hasNext()) {
                        list3.add(aaba.c((amvs)iterator2.next()));
                    }
                    final zaz zaz3 = new zaz(c, (List)list3);
                    if (size < 0) {
                        return null;
                    }
                    final Object b2 = zaz3.b;
                    final Object a2 = zaz3.a;
                    final List subList = ((List)a2).subList(0, Math.min(((List)a2).size(), size));
                    size = subList.size();
                    zaz2 = new zaz(new aaar((aaar)b2, size), (List)subList);
                }
            }
            return zaz2;
        }
        catch (final vmr vmr) {
            throw new ExecutionException((Throwable)vmr);
        }
    }
    
    public final abmk K(final zpf zpf, final long n, final abrj abrj, final PlayerResponseModel playerResponseModel) {
        final vai vai = (vai)((atke)this.b).a();
        vai.getClass();
        final Set set = (Set)((atke)this.a).a();
        set.getClass();
        abrj.getClass();
        return new abmk(vai, set, zpf, n, abrj, playerResponseModel, (byte[])null);
    }
    
    public final int a() {
        synchronized (this) {
            final zme c = ((zmf)this.b).c();
            if (c.z()) {
                return 2;
            }
            final String l = L(c);
            if (!((SharedPreferences)this.a).contains(l)) {
                return 0;
            }
            final boolean boolean1 = ((SharedPreferences)this.a).getBoolean(l, false);
            monitorexit(this);
            if (boolean1) {
                return 1;
            }
            return 2;
        }
    }
    
    public final void b(final boolean b) {
        synchronized (this) {
            final zme c = ((zmf)this.b).c();
            if (c.z()) {
                return;
            }
            ((SharedPreferences)this.a).edit().putBoolean(L(c), b).apply();
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
            ttr.c("ShaderSourceCache", "Error retrieving resource: ".concat(String.valueOf(ex.getMessage())));
        }
        return "";
    }
    
    public final void e(final String s, final String s2, final boolean b) {
        tvb.n(s2);
        final aabh aabh = new aabh();
        aaff.U((aaak)aabh, s2);
        aaff.T((aaak)aabh, 2);
        aaff.E((aaak)aabh, b);
        aaff.Q((aaak)aabh, ((msr)this.b).A());
        ((aagi)this.a).c(s, aakr.r(s, s2), 100, (aaak)aabh);
    }
    
    public final List f(final PlayerResponseModel playerResponseModel) {
        final ArrayList list = new ArrayList();
        final long f = playerResponseModel.n().f;
        final ahbx g = playerResponseModel.z().G;
        if (((List)g).isEmpty()) {
            return list;
        }
        final Iterator iterator = ((List)g).iterator();
        while (iterator.hasNext()) {
            final Iterator<Object> iterator2 = ((List<Object>)((aljd)iterator.next()).d).iterator();
            while (iterator2.hasNext()) {
                final akxi akxi = (akxi)((vlq)this.a).a(iterator2.next().c.I(), (MessageLite)akxi.a);
                if (akxi != null) {
                    final PlayerResponseModelImpl playerResponseModelImpl = new PlayerResponseModelImpl(akxi, f, (vjm)this.b);
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
    
    public final aafd h(final String s) {
        synchronized (this) {
            return ((Map<K, aafd>)this.b).get(s);
        }
    }
    
    public final aafd i(final String s) {
        synchronized (this) {
            ((tgb)this.a).b((Object)s);
            return ((Map<K, aafd>)this.b).remove(s);
        }
    }
    
    public final List j() {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final Iterator iterator = ((tgb)this.a).iterator();
            while (iterator.hasNext()) {
                final aafd aafd = ((Map<K, aafd>)this.b).get(iterator.next());
                if (aafd != null) {
                    list.add(aafd);
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
            for (final aafd aafd : ((Map<K, aafd>)this.b).values()) {
                hashMap.put(aafd.a, aafd.a());
            }
            monitorexit(this);
            return hashMap;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void l(final aafd aafd) {
        monitorenter(this);
        try {
            ((Map<String, aafd>)this.b).put(aafd.a, aafd);
            final Object a = this.a;
            final String a2 = aafd.a;
            final Iterator iterator = ((tgb)a).a.values().iterator();
            while (iterator.hasNext()) {
                if (((LinkedList)iterator.next()).contains(a2)) {
                    ((tgb)this.a).b((Object)aafd.a);
                    break;
                }
            }
            ((tgb)this.a).a((Object)new Pair((Object)aafd.h, (Object)aaff.m(aafd.e)), (Object)aafd.a);
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
            ((tgb)this.a).a.clear();
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
    
    public final aaen p(final String s) {
        synchronized (this) {
            tvb.n(s);
            return ((Map<K, aaen>)this.a).get(s);
        }
    }
    
    public final aaen q(final aaar aaar, final Collection collection) {
        monitorenter(this);
        try {
            aaar.getClass();
            final String a = aaar.a;
            final aaen aaen = new aaen(this, aaar, (byte[])null, (byte[])null);
            aaen.h(this.M(aaar, collection));
            aaen.g();
            aaen.f();
            if (collection != null) {
                final Iterator iterator = collection.iterator();
                while (iterator.hasNext()) {
                    aaen.e((String)iterator.next());
                }
            }
            final aaen p2 = this.p(a);
            if (p2 != null) {
                final Iterator iterator2 = p2.d().iterator();
                while (iterator2.hasNext()) {
                    aaen.e((String)iterator2.next());
                }
            }
            ((Map<String, aaen>)this.a).put(a, aaen);
            monitorexit(this);
            return aaen;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final List r(final String s) {
        monitorenter(this);
        try {
            tvb.n(s);
            final ArrayList list = new ArrayList();
            final Set set = ((Map<K, Set>)this.b).get(s);
            if (set != null) {
                final Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                    final aaen p = this.p((String)iterator.next());
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
            tvb.n(s);
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
        final aabf t = ((zvo)((atke)this.a).a()).t(s);
        if (t == null) {
            return 0L;
        }
        if (t.e) {
            return 0L;
        }
        final Set y = ((zvo)((atke)this.a).a()).y(s);
        if (!y.isEmpty() && (y.size() != 1 || s2 == null || !y.contains(s2))) {
            return 0L;
        }
        final zvo zvo = (zvo)((atke)this.a).a();
        tvb.n(s);
        final Set g = zvo.h.g(s);
        if (!g.isEmpty() && (g.size() != 1 || s3 == null || !g.contains(s3))) {
            return 0L;
        }
        return t.f();
    }
    
    public final boolean w(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final aabf t = ((zvo)((atke)this.a).a()).t((String)iterator.next());
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
                for (final aaba aaba : list3) {
                    if (!collection.contains(aaba.f())) {
                        list2.add(aaba.f());
                    }
                }
                hashMap2.put(s, list2);
                final Integer n2 = map.get(s);
                amwd amwd;
                if ((n2 != null && n2 == 2) || size == 0) {
                    amwd = amwd.b;
                }
                else {
                    amwd = amwd.c;
                }
                hashMap3.put(s, amwd);
            }
        }
        final afev b = afim.b;
        final HashMap hashMap4 = new HashMap();
        final HashMap hashMap5 = new HashMap();
        final HashMap hashMap6 = new HashMap();
        final HashMap hashMap7 = new HashMap();
        size = hashMap2.size();
        final Iterator iterator3 = hashMap2.keySet().iterator();
        long n3 = 0L;
        while (iterator3.hasNext()) {
            final String s2 = (String)iterator3.next();
            adkp.H(map2.containsKey(s2));
            final long max = Math.max(n - n3, 0L);
            final int u = ((aaec)this.a).U((amwz)tpe.L(map6, (Object)s2, (Object)amwz.a));
            final Integer n4 = (Integer)tpe.L(map5, (Object)s2, (Object)(-1));
            final Boolean b2 = (Boolean)tpe.L((Map)b, (Object)s2, (Object)false);
            final amwd amwd2 = (amwd)tpe.L((Map)hashMap3, (Object)s2, (Object)amwd.a);
            final List list4 = (List)tpe.L(map2, (Object)s2, (Object)afeq.q());
            final Object b3 = this.b;
            final List list5 = (List)hashMap2.get(s2);
            final byte[] array = map4.get(s2);
            final boolean booleanValue = b2;
            n4.intValue();
            final adik y = ((aanx)b3).y(s2, null, list5, list4, amwd2, array, booleanValue, max, map6.get(s2), u);
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
                    ttr.b("Encountered transient list in batched playlist mode. This is not supported.");
                }
                else {
                    hashMap7.put(s2, c);
                }
            }
            n3 += y.a;
        }
        final adik adik = new adik(hashMap4, hashMap5, hashMap6, hashMap7, n3);
        for (final String s3 : list) {
            final LinkedHashSet a = adik.a(s3);
            final HashSet set2 = new HashSet();
            final Iterator iterator5 = a.iterator();
            while (iterator5.hasNext()) {
                set2.add(((aaba)iterator5.next()).f());
            }
            hashMap.put(s3, set2);
        }
        return hashMap;
    }
    
    public final adik y(String iterator, String s, final List list, final List list2, final amwd amwd, final byte[] array, final boolean b, long n, amwz amwz, int i) {
        final Integer value = 1;
        adkp.H(iterator != null ^ s != null);
        String s2;
        if (!aezr.f(iterator)) {
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
        final amwd a = amwd.a;
        final int ordinal = amwd.ordinal();
        final long n2 = 0L;
        if (ordinal != 2 && ordinal != 3) {
            final aujg n3 = N(list, list2);
            final Iterator iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                list3.add(((aaba)iterator2.next()).f());
            }
            set.addAll((Collection)n3.c);
            set2.addAll((Collection)n3.a);
            n = n2;
        }
        else {
            final aujg n4 = N(list, list2);
            final abrj abrj = (abrj)((atke)this.b).a();
            final int a2 = aaiz.a(amwz, -1);
            if (a2 == -1) {
                n = n2;
            }
            else {
                final Iterator<Object> iterator3 = ((List<Object>)n4.c).iterator();
                long n5 = n;
                n = 0L;
                while (iterator3.hasNext()) {
                    final String s3 = iterator3.next();
                    final long v = this.v(s3, iterator, s);
                    n5 += v;
                    n -= v;
                    set.add(s3);
                }
                long n6 = n5;
                long n7 = n;
                Label_0540: {
                    if (n5 < 0L) {
                        final HashMap hashMap = new HashMap();
                        for (final String s4 : n4.b) {
                            hashMap.put(s4, this.v(s4, iterator, s));
                        }
                        final ArrayList list5 = new ArrayList(hashMap.entrySet());
                        Collections.sort((List<E>)list5, (Comparator<? super E>)zks.f);
                        for (int size = list5.size(), j = 0; j < size; ++j) {
                            final Map.Entry<String, V> entry = (Map.Entry<String, V>)list5.get(j);
                            if (n5 >= 0L) {
                                n6 = n5;
                                n7 = n;
                                break Label_0540;
                            }
                            n5 += (long)entry.getValue();
                            n -= (long)entry.getValue();
                            set.add(entry.getKey());
                        }
                        n7 = n;
                        n6 = n5;
                    }
                }
                amwz = (amwz)new HashSet();
                iterator = (String)list2.iterator();
                long n8 = n6;
                n = n7;
                while (((Iterator)iterator).hasNext()) {
                    final aaba aaba = ((Iterator<aaba>)iterator).next();
                    final String f = aaba.f();
                    long n10 = 0L;
                    long n11 = 0L;
                    Label_0919: {
                        if (((Set)n4.b).contains(f)) {
                            list3.add(aaba.f());
                        }
                        else {
                            if (!((Set)amwz).contains(f)) {
                                int n9;
                                if (!b) {
                                    n9 = 2;
                                }
                                else {
                                    n9 = 3;
                                }
                                try {
                                    final PlayerResponseModel t = abrj.T(f, n9, array);
                                    n10 = n8;
                                    n11 = n;
                                    if (abrj.R(t)) {
                                        n10 = n8;
                                        n11 = n;
                                        if (abrj.Q(t)) {
                                            final VideoStreamingData n12 = t.n();
                                            final boolean m = abrj.M(a2);
                                            final FormatStreamModel s5 = abrj.S(a2, Integer.MAX_VALUE, i, n12, true, t.m());
                                            FormatStreamModel s6;
                                            if (m) {
                                                s6 = null;
                                            }
                                            else {
                                                s6 = abrj.S(a2, Integer.MAX_VALUE, i, n12, false, t.m());
                                            }
                                            n10 = n8;
                                            n11 = n;
                                            if (s5 != null) {
                                                if (!m) {
                                                    n10 = n8;
                                                    n11 = n;
                                                    if (s6 == null) {
                                                        break Label_0919;
                                                    }
                                                }
                                                final long k = s5.j();
                                                long l;
                                                if (s6 == null) {
                                                    l = 0L;
                                                }
                                                else {
                                                    l = s6.j();
                                                }
                                                final long n13 = k + l;
                                                n10 = n8;
                                                n11 = n;
                                                if (n8 >= n13) {
                                                    n11 = n + n13;
                                                    set2.add(aaba);
                                                    list3.add(f);
                                                    ((Set<String>)amwz).add(f);
                                                    n10 = n8 - n13;
                                                }
                                            }
                                        }
                                    }
                                }
                                catch (final vmr vmr) {
                                    n11 = n;
                                    n10 = n8;
                                }
                                break Label_0919;
                            }
                            list3.add(aaba.f());
                        }
                        n10 = n8;
                        n11 = n;
                    }
                    n8 = n10;
                    n = n11;
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
        if (amwd == amwd.d) {
            if (!this.w(list3)) {
                final Iterator iterator6 = set.iterator();
                while (iterator6.hasNext()) {
                    s = (String)iterator6.next();
                    final aabf t2 = ((zvo)((atke)this.a).a()).t(s);
                    if (t2 != null && t2.l == aaaq.b) {
                        iterator6.remove();
                    }
                }
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (final String s7 : list) {
                if (!set.contains(s7)) {
                    if (linkedHashMap.containsKey(s7)) {
                        linkedHashMap.put(s7, (int)linkedHashMap.get(s7) + 1);
                    }
                    else {
                        linkedHashMap.put(s7, value);
                    }
                }
            }
            final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int size2;
            String s8;
            for (size2 = list3.size(), i = 0; i < size2; ++i) {
                s8 = (String)list3.get(i);
                if (linkedHashMap2.containsKey(s8)) {
                    linkedHashMap2.put(s8, (int)linkedHashMap2.get(s8) + 1);
                }
                else {
                    linkedHashMap2.put(s8, value);
                }
            }
            for (final String s9 : linkedHashMap2.keySet()) {
                if (linkedHashMap.containsKey(s9)) {
                    i = (int)linkedHashMap.get(s9);
                }
                else {
                    i = 0;
                }
                linkedHashMap.put(s9, Math.max(i, (int)linkedHashMap2.get(s9)));
            }
            for (final String s10 : linkedHashMap.keySet()) {
                for (i = 0; i < (int)linkedHashMap.get(s10); ++i) {
                    list4.add(s10);
                }
            }
        }
        if (list4.isEmpty()) {
            return new adik(s2, set, set2, list3, null, n);
        }
        return new adik(s2, set, set2, list3, list4, n);
    }
}
