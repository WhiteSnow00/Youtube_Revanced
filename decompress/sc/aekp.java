import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.os.Build$VERSION;
import java.io.File;
import java.io.IOException;
import org.json.JSONObject;
import android.util.Pair;
import android.graphics.Bitmap;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetectorUtil;
import java.io.FileNotFoundException;
import java.util.Iterator;
import android.os.storage.StorageVolume;
import android.os.storage.StorageManager;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.List;
import j$.util.Optional;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import android.text.TextUtils;
import android.net.Uri;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import java.util.Map;
import j$.util.DesugarCollections;
import java.util.IdentityHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.graphics.Rect;
import java.util.ArrayList;
import android.content.Context;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aekp
{
    public final Object a;
    public final Object b;
    
    public aekp() {
    }
    
    public aekp(final acid b, final byte[] array) {
        this.b = b;
        this.a = new HashMap();
    }
    
    public aekp(final adiz b, final atke a) {
        this.b = b;
        this.a = a;
    }
    
    public aekp(final adqk b, final Executor a) {
        this.b = b;
        this.a = a;
    }
    
    public aekp(final aect a) {
        this.b = new Handler(Looper.getMainLooper());
        this.a = a;
    }
    
    public aekp(final aezp b, final aezp a) {
        this.b = b;
        this.a = a;
        false.booleanValue();
    }
    
    public aekp(final ahdc b, final atke a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public aekp(final Activity b, final adia a) {
        this.b = b;
        this.a = a;
    }
    
    public aekp(final Context context) {
        this.b = context.getContentResolver();
        final abh a = new abh(3);
        this.a = a;
        final adnc adnc = new adnc();
        a.put("content", adnc);
        a.put("file", adnc);
        a.put("streaming", new adnp());
    }
    
    public aekp(final Context context, final byte[] array) {
        this.a = new String[] { "0 AS suggest_format", "display1 AS suggest_text_1", "display2 AS suggest_text_2", "query AS suggest_intent_query", "_id" };
        this.b = new acxw(context);
    }
    
    public aekp(final anvi b) {
        this.b = b;
        amye amye;
        if ((amye = b.c) == null) {
            amye = amye.a;
        }
        amyd a;
        if ((amye.b & 0x1) != 0x0) {
            amye amye2;
            if ((amye2 = b.c) == null) {
                amye2 = amye.a;
            }
            if ((a = amye2.c) == null) {
                a = amyd.a;
            }
        }
        else {
            a = null;
        }
        this.a = a;
    }
    
    public aekp(final arkg b, final atke a) {
        this.b = b;
        this.a = a;
    }
    
    public aekp(final atke b, final atke a) {
        this.b = b;
        this.a = a;
    }
    
    public aekp(final atke a, final atke b, final byte[] array) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aekp(final atke b, final atke a, final byte[] array, final byte[] array2) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public aekp(final atke b, final atke a, final byte[] array, final byte[] array2, final byte[] array3) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public aekp(final atke b, final atke a, final char[] array) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public aekp(final atke a, final atke b, final char[] array, final byte[] array2) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aekp(final aujg b, final adet a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.a = a;
    }
    
    public aekp(final qqr b, final afvs a) {
        this.b = b;
        this.a = a;
    }
    
    public aekp(final byte[] array) {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
    
    public aekp(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new Rect();
        this.b = new Rect();
    }
    
    public aekp(final byte[] array, final char[] array2) {
        final MediaMetadataRetriever a = new MediaMetadataRetriever();
        final MediaExtractor b = new MediaExtractor();
        this.a = a;
        this.b = b;
    }
    
    public aekp(final byte[] array, final short[] array2) {
        this.a = new acrd();
        this.b = new CopyOnWriteArrayList();
    }
    
    public aekp(final char[] array) {
        this.a = new ArrayList();
        this.b = new adwe(this, (byte[])null, (byte[])null);
    }
    
    public aekp(final int[] array) {
        this.b = DesugarCollections.synchronizedMap((Map)new IdentityHashMap());
        this.a = DesugarCollections.synchronizedMap((Map)new IdentityHashMap());
    }
    
    public aekp(final short[] array) {
        this.b = new HashMap();
        this.a = new abh();
    }
    
    private final aoad N(final aoad aoad) {
        final aoad aoad2 = ((Map<K, aoad>)this.a).get(aoad);
        if (aoad2 == null) {
            return aoad;
        }
        return aoad2;
    }
    
    public static aejy a(final aelf aelf) {
        final AccountId b = AccountId.b(aelf.c);
        aejz aejz;
        if ((aejz = aelf.d) == null) {
            aejz = aejz.a;
        }
        int h;
        if ((h = aevy.h(aelf.e)) == 0) {
            h = 1;
        }
        return aejy.a(b, aejz, h);
    }
    
    public static aelf b(final aelc aelc, final AccountId accountId) {
        try {
            final int a = accountId.a();
            final ahcr d = aelc.d;
            final Integer value = a;
            if (((Map)d).containsKey(value)) {
                return (aelf)((Map)d).get(value);
            }
            throw new IllegalArgumentException();
        }
        catch (final IllegalArgumentException ex) {
            throw new aekl(ex);
        }
    }
    
    public static aimy m(final admr admr) {
        if (admr == null) {
            return null;
        }
        final ahaz builder = ((ahbh)aimy.a).createBuilder();
        final double b = admr.b;
        builder.copyOnWrite();
        final aimy aimy = (aimy)builder.instance;
        final int b2 = aimy.b;
        final int n = 1;
        aimy.b = (b2 | 0x1);
        aimy.c = b;
        final int c = admr.c;
        builder.copyOnWrite();
        final aimy aimy2 = (aimy)builder.instance;
        final int b3 = aimy2.b;
        final int n2 = 2;
        aimy2.b = (b3 | 0x2);
        aimy2.d = c;
        final int d = admr.d;
        builder.copyOnWrite();
        final aimy aimy3 = (aimy)builder.instance;
        aimy3.b |= 0x4;
        aimy3.e = d;
        final boolean e = admr.e;
        builder.copyOnWrite();
        final aimy aimy4 = (aimy)builder.instance;
        aimy4.b |= 0x8;
        aimy4.f = e;
        int be;
        if ((be = adyf.be(admr.f)) == 0) {
            be = 2;
        }
        builder.copyOnWrite();
        final aimy aimy5 = (aimy)builder.instance;
        aimy5.g = be - 1;
        aimy5.b |= 0x10;
        int bf;
        if ((bf = adyf.bf(admr.g)) == 0) {
            bf = 2;
        }
        builder.copyOnWrite();
        final aimy aimy6 = (aimy)builder.instance;
        aimy6.h = bf - 1;
        aimy6.b |= 0x20;
        int bf2 = adyf.bf(admr.h);
        if (bf2 == 0) {
            bf2 = n2;
        }
        builder.copyOnWrite();
        final aimy aimy7 = (aimy)builder.instance;
        aimy7.i = bf2 - 1;
        aimy7.b |= 0x40;
        final double i = admr.i;
        builder.copyOnWrite();
        final aimy aimy8 = (aimy)builder.instance;
        aimy8.b |= 0x80;
        aimy8.j = i;
        int bd = adyf.bd(admr.j);
        if (bd == 0) {
            bd = n;
        }
        builder.copyOnWrite();
        final aimy aimy9 = (aimy)builder.instance;
        aimy9.k = bd - 1;
        aimy9.b |= 0x100;
        final int k = admr.k;
        builder.copyOnWrite();
        final aimy aimy10 = (aimy)builder.instance;
        aimy10.b |= 0x200;
        aimy10.l = k;
        return (aimy)builder.build();
    }
    
    public static final Intent s(final String s, final String s2, final String s3) {
        final Intent intent = new Intent();
        intent.setDataAndType(Uri.parse(s2), "image/*");
        intent.putExtra("CLIENT_ID", s);
        intent.setPackage("com.snapchat.android");
        if (!TextUtils.isEmpty((CharSequence)s3)) {
            intent.putExtra("attachmentUrl", s3);
        }
        intent.setAction("android.intent.action.SEND");
        return intent;
    }
    
    public final boolean A(final anzv anzv) {
        return this.u(anzv).f;
    }
    
    public final boolean B(final aoad aoad) {
        return this.N(aoad).f;
    }
    
    public final boolean C(final anzv anzv) {
        anuv anuv;
        if ((anuv = this.u(anzv).o) == null) {
            anuv = anuv.a;
        }
        return anuv.ry((ahaq)SettingRenderer.settingSingleOptionMenuRenderer);
    }
    
    public final boolean D(final anzv anzv) {
        anuv anuv;
        if ((anuv = this.u(anzv).o) == null) {
            anuv = anuv.a;
        }
        return anuv.ry((ahaq)SettingRenderer.settingDialogRenderer);
    }
    
    public final Cursor E(String string) {
        final SQLiteDatabase readableDatabase = ((SQLiteOpenHelper)this.b).getReadableDatabase();
        final StringBuilder sb = new StringBuilder("%");
        sb.append(string);
        sb.append("%");
        string = sb.toString();
        return readableDatabase.query("suggestions", (String[])this.a, "suggest_intent_query LIKE ?", new String[] { string }, (String)null, (String)null, "date DESC");
    }
    
    public final acsu F(final Optional optional) {
        final wyw wyw = (wyw)((atke)this.b).a();
        wyw.getClass();
        final wyv wyv = (wyv)((atke)this.a).a();
        wyv.getClass();
        return new acsu(wyw, wyv, optional);
    }
    
    public final acsp G(final acso acso) {
        final wyw wyw = (wyw)((atke)this.b).a();
        wyw.getClass();
        final wyv wyv = (wyv)((atke)this.a).a();
        wyv.getClass();
        return new acsp(wyw, wyv, acso);
    }
    
    public final List H(final List list) {
        final List list2 = (List)asht.U(list).Z((asjr)new abqq(this, 4, (byte[])null, (byte[])null, (byte[])null)).aF().ac();
        final ArrayList list3 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            list.get(i);
            ((acrf)list2.get(i)).c();
        }
        final int size = list.size();
        if (size > 0) {
            list3.add(asht.y((Callable)new nke(size, list2, list, 4)));
        }
        if (list3.isEmpty()) {
            return Collections.emptyList();
        }
        asht s;
        if (list3.size() == 1) {
            s = (asht)list3.get(0);
        }
        else {
            final int a = ashi.a;
            s = asht.U(list3).s(askj.a, a, a, false);
        }
        return (List)s.aF().ac();
    }
    
    public final void I(final acrf acrf) {
        if (acrf == null) {
            return;
        }
        ((List<acrf>)this.b).add(0, acrf);
    }
    
    public final aica J() {
        aibz aibz;
        if ((aibz = ((anvi)this.b).h) == null) {
            aibz = aibz.a;
        }
        if ((aibz.b & 0x2) != 0x0) {
            aibz aibz2;
            if ((aibz2 = ((anvi)this.b).h) == null) {
                aibz2 = aibz.a;
            }
            aica aica;
            if ((aica = aibz2.c) == null) {
                aica = aica.a;
            }
            return aica;
        }
        return null;
    }
    
    public final List K(final String s) {
        return ((Map<K, List>)this.a).get(s);
    }
    
    public final acfn L(final wyw wyw) {
        ((atke)this.b).a().getClass();
        wyw.getClass();
        final vai vai = (vai)((atke)this.a).a();
        vai.getClass();
        return new acfn(vai, wyw, null, null);
    }
    
    public final acfn M(final wyw wyw, final ajmo ajmo) {
        ((atke)this.b).a().getClass();
        wyw.getClass();
        final vai vai = (vai)((atke)this.a).a();
        vai.getClass();
        return new acfn(vai, wyw, ajmo, null);
    }
    
    public final ListenableFuture c(final AccountId accountId) {
        return aftq.e(((ahdc)this.b).t(accountId), (aezf)abvp.s, (Executor)afum.a);
    }
    
    public final void d(final ValueAnimator valueAnimator) {
        final adds adds = new adds();
        valueAnimator.addListener((Animator$AnimatorListener)this.b);
        ((ArrayList)this.a).add(adds);
    }
    
    public final aphv e(admv o) {
        if ((((admv)o).b & 0x20000) != 0x0) {
            admw admw;
            if ((admw = ((admv)o).t) == null) {
                admw = admw.a;
            }
            int ac;
            if ((ac = aqsx.aC(admw.c)) == 0) {
                ac = 1;
            }
            if (--ac != 1) {
                if (ac == 2) {
                    return aphv.Y;
                }
                if (ac != 3) {
                    return aphv.Z;
                }
                return aphv.aa;
            }
            else {
                int aa;
                if ((aa = aqsx.aA(admw.d)) == 0) {
                    aa = 1;
                }
                if (--aa != 1) {
                    if (aa == 2) {
                        return aphv.X;
                    }
                    if (aa != 3) {
                        return aphv.w;
                    }
                    return aphv.W;
                }
                else {
                    try {
                        final Object b = this.b;
                        final String e = admw.e;
                        int u = 0;
                        Label_0268: {
                            if (TextUtils.isEmpty((CharSequence)e)) {
                                u = 1;
                            }
                            else {
                                for (final StorageVolume storageVolume : ((StorageManager)((aujg)b).a).getStorageVolumes()) {
                                    if (storageVolume != null) {
                                        String s;
                                        if (TextUtils.isEmpty((CharSequence)(s = storageVolume.getUuid()))) {
                                            s = storageVolume.getDescription((Context)((aujg)b).b);
                                        }
                                        if (!TextUtils.isEmpty((CharSequence)s) && s.equals(e)) {
                                            u = aujg.u(storageVolume.getState());
                                            break Label_0268;
                                        }
                                        continue;
                                    }
                                }
                                u = 4;
                            }
                        }
                        final int b2 = ((admv)o).b;
                        int n2;
                        final int n = n2 = 0;
                        if ((b2 & 0x2) != 0x0) {
                            final Object b3 = this.b;
                            final Uri parse = Uri.parse(((admv)o).f);
                            n2 = n;
                            if (parse != null) {
                                if (!aujg.s(parse)) {
                                    n2 = n;
                                }
                                else {
                                    final Cursor r = ((aujg)b3).r(parse);
                                    n2 = n;
                                    if (r != null) {
                                        if (!r.isClosed()) {
                                            r.close();
                                        }
                                        n2 = 1;
                                    }
                                }
                            }
                        }
                        final boolean f = admw.f;
                        if (--u != 1) {
                            if (u != 2) {
                                if (f) {
                                    o = aphv.U;
                                }
                                else {
                                    o = aphv.T;
                                }
                            }
                            else {
                                o = aphv.S;
                            }
                        }
                        else if (n2 != 0) {
                            o = aphv.R;
                        }
                        else {
                            o = aphv.V;
                        }
                        return (aphv)o;
                    }
                    catch (final Exception ex) {
                        final Object a = this.a;
                        admt admt;
                        if ((admt = admt.a(((admv)o).l)) == null) {
                            admt = admt.a;
                        }
                        ((adet)a).i("Failed storage status check.", ex, admt);
                        return aphv.ab;
                    }
                }
            }
        }
        return aphv.w;
    }
    
    public final adnj f(final Uri uri) {
        if (uri == null) {
            throw new FileNotFoundException("Null Uri scheme");
        }
        final adnj adnj = ((HashMap<K, adnj>)this.b).get(uri.getScheme());
        if (adnj != null) {
            return adnj;
        }
        throw new FileNotFoundException("Unsupported Uri scheme: ".concat(uri.toString()));
    }
    
    public final void g(final adnj adnj) {
        ((HashMap<String, adnj>)this.b).put(adnj.a(), adnj);
    }
    
    public final void h() {
        final Object a = this.a;
        monitorenter(a);
        try {
            final Iterator<Map.Entry<Object, Object>> iterator = ((Map<Object, Object>)this.a).entrySet().iterator();
            while (iterator.hasNext()) {
                final adnh adnh = ((Map.Entry<K, adnh>)iterator.next()).getValue();
                if (adnh != null) {
                    adnh.k();
                }
                iterator.remove();
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final adnh i(final admv admv, final int n, final Uri uri, final adng adng) {
        synchronized (this.a) {
            final adnh adnh = ((Map<K, adnh>)this.a).get(uri);
            if (adnh != null) {
                final adnh b = adnh;
                if (adnh.m()) {
                    return b;
                }
            }
            final adnh b = this.f(uri).b(admv, n, uri, adng);
            ((Map<Uri, adnh>)this.a).put(uri, b);
            return b;
        }
    }
    
    public final apig j(final Uri uri, final String s, final String s2) {
        final String scheme = uri.getScheme();
        if (scheme == null || !this.k(scheme)) {
            throw new UnsupportedOperationException("Uri scheme not supported for resource extraction");
        }
        final adni adni = ((Map<K, adni>)this.a).get(scheme);
        if (adni != null) {
            return adni.c(s, s2);
        }
        throw new UnsupportedOperationException("Resource extraction not available for scheme");
    }
    
    public final boolean k(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && ((Map)this.a).containsKey(s);
    }
    
    public final boolean l(final Uri uri) {
        return this.k(uri.getScheme());
    }
    
    public final void n() {
        try {
            final boolean z = ((tos)((adiz)this.b).e).z;
            final NativeCrashDetectorUtil nativeCrashDetectorUtil = (NativeCrashDetectorUtil)((atke)this.a).a();
            final Object b = this.b;
            nativeCrashDetectorUtil.a((Context)((adiz)b).c, ((adiz)b).a, z);
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            zlm.c(zll.a, zlk.A, "Unable to link native crash library.", (Throwable)unsatisfiedLinkError);
        }
    }
    
    public final void o(final Thread thread, final Throwable t) {
        if (!((tos)((adiz)this.b).e).y) {
            return;
        }
        zlm.c(zll.a, zlk.A, "Background Thread Uncaught Exception", t);
        final ahaz builder = ((ahbh)((arwh)((atke)this.a).a()).d(thread.getName(), t, arwh.e(t))).toBuilder();
        builder.copyOnWrite();
        final ahur ahur = (ahur)builder.instance;
        ahur.c = 16;
        ahur.b |= 0x1;
        adkp.t((adiz)this.b, (MessageLite)builder.build(), adjb.d);
    }
    
    public final void p(final String c, final tcp tcp, final int n) {
        if (!((vai)((atke)this.a).a()).f(45370388L)) {
            return;
        }
        if (tcp instanceof zke) {
            return;
        }
        final ahaz builder = ((ahbh)aoqd.a).createBuilder();
        builder.copyOnWrite();
        final aoqd aoqd = (aoqd)builder.instance;
        c.getClass();
        aoqd.b |= 0x1;
        aoqd.c = c;
        final boolean d = tcp != null;
        builder.copyOnWrite();
        final aoqd aoqd2 = (aoqd)builder.instance;
        aoqd2.b |= 0x2;
        aoqd2.d = d;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    builder.copyOnWrite();
                    final aoqd aoqd3 = (aoqd)builder.instance;
                    aoqd3.e = 0;
                    aoqd3.b |= 0x4;
                }
                else {
                    builder.copyOnWrite();
                    final aoqd aoqd4 = (aoqd)builder.instance;
                    aoqd4.e = 3;
                    aoqd4.b |= 0x4;
                }
            }
            else {
                builder.copyOnWrite();
                final aoqd aoqd5 = (aoqd)builder.instance;
                aoqd5.e = 2;
                aoqd5.b |= 0x4;
            }
        }
        else {
            builder.copyOnWrite();
            final aoqd aoqd6 = (aoqd)builder.instance;
            aoqd6.e = 1;
            aoqd6.b |= 0x4;
        }
        final ahaz builder2 = ((ahbh)aoqj.a).createBuilder();
        final ahaz builder3 = ((ahbh)aoqk.a).createBuilder();
        builder3.copyOnWrite();
        final aoqk aoqk = (aoqk)builder3.instance;
        final aoqd k = (aoqd)builder.build();
        k.getClass();
        aoqk.k = k;
        aoqk.b |= 0x4000;
        builder2.copyOnWrite();
        final aoqj aoqj = (aoqj)builder2.instance;
        final aoqk c2 = (aoqk)builder3.build();
        c2.getClass();
        aoqj.c = c2;
        aoqj.b |= 0x1;
        final aoqj aoqj2 = (aoqj)builder2.build();
        final aknr d2 = aknt.d();
        ((ahaz)d2).copyOnWrite();
        aknt.cf((aknt)d2.instance, aoqj2);
        ((wxx)((atke)this.b).a()).d((aknt)((ahaz)d2).build());
    }
    
    public final void q(final Intent intent, final Bitmap bitmap, final double n, final double n2) {
        try {
            final File j = acvg.j((Activity)this.b, bitmap, "sticker");
            final int intValue = (int)tpe.bh((Context)this.b).first;
            final int width = bitmap.getWidth();
            final int height = bitmap.getHeight();
            final float n3 = (float)intValue;
            final float n4 = (float)height;
            final float n5 = (float)width;
            final float n6 = n3 * 0.65f;
            final Pair create = Pair.create((Object)n6, (Object)(n4 * (n6 / n5)));
            final Uri i = acvg.i((Activity)this.b, j);
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("uri", (Object)i);
            jsonObject.put("posX", n);
            jsonObject.put("posY", n2);
            jsonObject.put("width", create.first);
            jsonObject.put("height", create.second);
            intent.putExtra("sticker", jsonObject.toString());
            ((Activity)this.b).grantUriPermission("com.snapchat.android", i, 1);
        }
        catch (final IOException ex) {
            throw new Exception("Failed to create story sticker asset.", ex);
        }
    }
    
    public final void r(final Intent intent, final String s) {
        try {
            final PackageManager packageManager = ((Activity)this.b).getPackageManager();
            int n = 0;
            final PackageInfo packageInfo = packageManager.getPackageInfo("com.snapchat.android", 0);
            long longVersionCode;
            if (Build$VERSION.SDK_INT >= 28) {
                longVersionCode = packageInfo.getLongVersionCode();
            }
            else {
                longVersionCode = packageInfo.versionCode;
            }
            if (longVersionCode >= 2110L) {
                intent.putExtra("RESULT_INTENT", (Parcelable)PendingIntent.getActivity((Context)this.b, 0, intent, 1140850688));
                final Activity activity = (Activity)this.b;
                final String packageName = activity.getPackageName();
                Label_0133: {
                    if (packageName.hashCode() == 1713433253) {
                        if (packageName.equals("com.google.android.apps.youtube.music")) {
                            break Label_0133;
                        }
                    }
                    n = -1;
                }
                String s2;
                if (n != 0) {
                    s2 = activity.getResources().getString(2132020214);
                }
                else {
                    s2 = activity.getResources().getString(2132020216);
                }
                intent.putExtra("CLIENT_APP_NAME", s2);
                intent.addFlags(268435456);
                ((Activity)this.b).startActivity(intent);
            }
            else {
                ((Activity)this.b).startActivityForResult(intent, 0);
            }
            final Object a = this.a;
            if (a != null) {
                ((adia)a).d(s);
            }
        }
        catch (final PackageManager$NameNotFoundException ex) {
            throw new Exception("Snapchat is not installed.", (Throwable)ex);
        }
    }
    
    public final addo t(final adgg adgg) {
        adgg.getClass();
        final Executor executor = (Executor)((atke)this.a).a();
        executor.getClass();
        final Executor executor2 = (Executor)((atke)this.b).a();
        executor2.getClass();
        return new addo(adgg, executor, executor2);
    }
    
    public final anzv u(final anzv anzv) {
        final anzv anzv2 = ((Map<K, anzv>)this.b).get(anzv);
        if (anzv2 == null) {
            return anzv;
        }
        return anzv2;
    }
    
    public final aoab v(final anzv anzv) {
        anuv anuv;
        if ((anuv = this.u(anzv).o) == null) {
            anuv = anuv.a;
        }
        return (aoab)anuv.rx((ahaq)SettingRenderer.settingDialogRenderer);
    }
    
    public final aoai w(final anzv anzv) {
        anuv anuv;
        if ((anuv = this.u(anzv).o) == null) {
            anuv = anuv.a;
        }
        return (aoai)anuv.rx((ahaq)SettingRenderer.settingSingleOptionMenuRenderer);
    }
    
    public final void x(final anzv anzv, final boolean f) {
        final Object b = this.b;
        final ahaz builder = ((ahbh)this.u(anzv)).toBuilder();
        builder.copyOnWrite();
        final anzv anzv2 = (anzv)builder.instance;
        anzv2.b |= 0x80;
        anzv2.f = f;
        ((Map<anzv, anzv>)b).put(anzv, (anzv)builder.build());
    }
    
    public final void y(final aoad aoad, final boolean f) {
        final Object a = this.a;
        final ahaz builder = ((ahbh)this.N(aoad)).toBuilder();
        builder.copyOnWrite();
        final aoad aoad2 = (aoad)builder.instance;
        aoad2.b |= 0x8;
        aoad2.f = f;
        ((Map<aoad, aoad>)a).put(aoad, (aoad)builder.build());
    }
    
    public final void z(final anzv anzv, final aoab aoab) {
        final Object b = this.b;
        final ahaz builder = ((ahbh)this.u(anzv)).toBuilder();
        anuv anuv;
        if ((anuv = this.u(anzv).o) == null) {
            anuv = anuv.a;
        }
        final ahbb ahbb = (ahbb)((ahbh)anuv).toBuilder();
        ahbb.e((ahaq)SettingRenderer.settingDialogRenderer, (Object)aoab);
        builder.copyOnWrite();
        final anzv anzv2 = (anzv)builder.instance;
        final anuv o = (anuv)((ahaz)ahbb).build();
        o.getClass();
        anzv2.o = o;
        anzv2.b |= 0x20000;
        ((Map<anzv, anzv>)b).put(anzv, (anzv)builder.build());
    }
}
