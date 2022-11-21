import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
import java.util.List;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.MissingFormatArgumentException;
import java.util.Arrays;
import android.content.res.Resources;
import android.util.Log;
import android.text.TextUtils;
import android.content.SharedPreferences$Editor;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.CommandOuterClass$GestureOptions;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import java.util.concurrent.TimeUnit;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import j$.time.format.DateTimeFormatter;
import j$.time.ZoneOffset;
import j$.util.DateRetargetClass;
import java.util.Date;
import java.io.ByteArrayInputStream;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;
import org.chromium.net.CronetEngine;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.Map;
import java.security.interfaces.ECPublicKey;
import java.nio.ByteBuffer;
import java.io.InputStream;
import android.os.Bundle;
import android.media.MediaCodec;
import java.io.IOException;
import java.io.File;
import android.content.Context;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpb
{
    private static WeakReference b;
    public final Object a;
    
    public agpb() {
    }
    
    public agpb(final int n) {
        final atsm[] a = new atsm[n];
        for (int i = 0; i < n; ++i) {
            a[i] = auop.j((Object)null);
        }
        this.a = a;
    }
    
    public agpb(final int n, final byte[] array) {
        this.a = areq.t(n);
    }
    
    public agpb(final agcb a) {
        this.a = a;
    }
    
    public agpb(final agfd a) {
        this.a = a;
    }
    
    private agpb(final agij a) {
        this.a = a;
    }
    
    public agpb(final agpa a) {
        this.a = a;
    }
    
    public agpb(final ahcr a) {
        this.a = a;
    }
    
    public agpb(final ahct a) {
        this.a = a;
    }
    
    public agpb(final Context context) {
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        final File file = new File(agy.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !this.d()) {
                this.b();
            }
        }
        catch (final IOException ex) {}
    }
    
    public agpb(final Context context, final String s) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat".concat(s), 0);
    }
    
    public agpb(final Context context, final byte[] array) {
        final mrk mrk = new mrk(context, (byte[])null);
        this.a = new agkn(mrk);
    }
    
    public agpb(final Context a, final char[] array) {
        this.a = a;
    }
    
    public agpb(final MediaCodec a) {
        this.a = a;
    }
    
    public agpb(final Bundle bundle) {
        this.a = new Bundle(bundle);
    }
    
    public agpb(final aqzi a) {
        this.a = a;
    }
    
    public agpb(final asis a) {
        this.a = a;
    }
    
    private agpb(final InputStream a) {
        this.a = a;
    }
    
    public agpb(final String a) {
        this.a = a;
    }
    
    public agpb(final ByteBuffer a) {
        a.getClass();
        this.a = a;
    }
    
    public agpb(final ECPublicKey a) {
        this.a = a;
    }
    
    public agpb(final Map map, final Map map2) {
        Map<Object, Object> unmodifiableMap = map2;
        if (!map.isEmpty()) {
            final LinkedHashMap t = areq.t(((afkc)map).d + ((afkc)map2).d);
            t.putAll(map2);
            for (final Map.Entry<Class, V> entry : ((afgm)map).r()) {
                t.put(entry.getKey().getName(), entry.getValue());
            }
            unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)t);
        }
        this.a = unmodifiableMap;
    }
    
    public agpb(final CronetEngine a) {
        this.a = a;
    }
    
    public agpb(final byte[] array) {
        final afce a = new afce();
        a.f();
        this.a = a;
    }
    
    public agpb(final byte[] array, final byte[] array2) {
        this(null, null, null);
    }
    
    public agpb(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = auop.j((Object)new atyv(8, false));
    }
    
    public agpb(final char[] array) {
        this.a = new ArrayList(1);
    }
    
    public agpb(final char[] array, final byte[] array2) {
        this.a = new AtomicLong();
    }
    
    public agpb(final short[] array) {
        this.a = new float[] { 0.0f, 0.0f, 0.0f, 1.0f };
    }
    
    public static agpb H(final byte[] array) {
        return new agpb(new ByteArrayInputStream(array));
    }
    
    private static final String am(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("|T|");
        sb.append(s2);
        sb.append("|*");
        return sb.toString();
    }
    
    private static String an(final String s) {
        if (!s.startsWith("gcm.n.")) {
            return s;
        }
        return s.replace("gcm.n.", "gcm.notification.");
    }
    
    private final String ao(final long n) {
        synchronized (this) {
            return DateRetargetClass.toInstant(new Date(n)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
    }
    
    private final String ap(String s) {
        monitorenter(this);
        try {
            for (Map.Entry<K, Set> entry : ((SharedPreferences)this.a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    final Iterator iterator2 = entry.getValue().iterator();
                    while (iterator2.hasNext()) {
                        if (s.equals(iterator2.next())) {
                            s = (String)entry.getKey();
                            monitorexit(this);
                            return s;
                        }
                    }
                }
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void aq() {
        monitorenter(this);
        try {
            final long long1 = ((SharedPreferences)this.a).getLong("fire-count", 0L);
            final Iterator iterator = ((SharedPreferences)this.a).getAll().entrySet().iterator();
            String s = "";
            String s2 = null;
            while (iterator.hasNext()) {
                final Map.Entry<K, Set> entry = (Map.Entry<K, Set>)iterator.next();
                if (entry.getValue() instanceof Set) {
                    final Iterator iterator2 = entry.getValue().iterator();
                    String s3 = s2;
                    String s4 = s;
                    while (true) {
                        s = s4;
                        s2 = s3;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final String s5 = (String)iterator2.next();
                        if (s3 != null && s3.compareTo(s5) <= 0) {
                            continue;
                        }
                        s4 = (String)entry.getKey();
                        s3 = s5;
                    }
                }
            }
            final HashSet set = new HashSet(((SharedPreferences)this.a).getStringSet(s, (Set)new HashSet()));
            set.remove(s2);
            ((SharedPreferences)this.a).edit().putStringSet(s, (Set)set).putLong("fire-count", long1 - 1L).commit();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void ar(final String s) {
        synchronized (this) {
            final String ap = this.ap(s);
            if (ap == null) {
                return;
            }
            final HashSet set = new HashSet(((SharedPreferences)this.a).getStringSet(ap, (Set)new HashSet()));
            set.remove(s);
            if (set.isEmpty()) {
                ((SharedPreferences)this.a).edit().remove(ap).commit();
                return;
            }
            ((SharedPreferences)this.a).edit().putStringSet(ap, (Set)set).commit();
        }
    }
    
    private final byte[] as(byte[] doFinal, final byte[] array, final int n) {
        final Mac mac = (Mac)aghs.b.a((String)this.a);
        if (n <= mac.getMacLength() * 255) {
            final byte[] array2 = new byte[n];
            mac.init(new SecretKeySpec(doFinal, (String)this.a));
            doFinal = new byte[0];
            int n2 = 1;
            int n3 = 0;
            while (true) {
                mac.update(doFinal);
                mac.update(array);
                mac.update((byte)n2);
                doFinal = mac.doFinal();
                final int length = doFinal.length;
                final int n4 = n3 + length;
                if (n4 >= n) {
                    break;
                }
                System.arraycopy(doFinal, 0, array2, n3, length);
                ++n2;
                n3 = n4;
            }
            System.arraycopy(doFinal, 0, array2, n3, n - n3);
            return array2;
        }
        throw new GeneralSecurityException("size too large");
    }
    
    private final byte[] at(final byte[] array, final byte[] array2) {
        final Mac mac = (Mac)aghs.b.a((String)this.a);
        if (array2 != null && array2.length != 0) {
            mac.init(new SecretKeySpec(array2, (String)this.a));
        }
        else {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], (String)this.a));
        }
        return mac.doFinal(array);
    }
    
    public static String j(final String s) {
        String substring = s;
        if (s.startsWith("gcm.n.")) {
            substring = s.substring(6);
        }
        return substring;
    }
    
    public static boolean m(final Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(an("gcm.n.e")));
    }
    
    public static agpb y(final Context context) {
        synchronized (agpb.class) {
            kht.aL((Object)context);
            final WeakReference b = agpb.b;
            agpb agpb;
            if (b == null) {
                agpb = null;
            }
            else {
                agpb = (agpb)b.get();
            }
            if (agpb == null) {
                final agpb agpb2 = new agpb(context.getApplicationContext(), (byte[])null);
                agpb.b = new WeakReference(agpb2);
                return agpb2;
            }
            return agpb;
        }
    }
    
    public static agpb z(final byte[] array) {
        return new agpb(agij.a(array));
    }
    
    public final int A() {
        return Mac.getInstance((String)this.a).getMacLength();
    }
    
    public final byte[] B() {
        final String s = (String)this.a;
        final int hashCode = s.hashCode();
        int n = 0;
        Label_0084: {
            if (hashCode != 984523022) {
                if (hashCode != 984524074) {
                    if (hashCode == 984525777) {
                        if (s.equals("HmacSha512")) {
                            n = 2;
                            break Label_0084;
                        }
                    }
                }
                else if (s.equals("HmacSha384")) {
                    n = 1;
                    break Label_0084;
                }
            }
            else if (s.equals("HmacSha256")) {
                n = 0;
                break Label_0084;
            }
            n = -1;
        }
        if (n == 0) {
            return agbw.f;
        }
        if (n == 1) {
            return agbw.g;
        }
        if (n == 2) {
            return agbw.h;
        }
        throw new GeneralSecurityException("Could not determine HPKE KDF ID");
    }
    
    public final byte[] C(final byte[] array, final byte[] array2, final String s, final byte[] array3, final int n) {
        return this.as(array, agbw.f(s, array2, array3, n), n);
    }
    
    public final byte[] D(final byte[] array, final byte[] array2, final String s, final byte[] array3) {
        return this.at(agbw.e(s, array2, array3), array);
    }
    
    public final byte[] E(final byte[] array, final byte[] array2, final byte[] array3, final int n) {
        return this.as(this.at(agbw.e("eae_prk", array, array3), null), agbw.f("shared_secret", array2, array3, n), n);
    }
    
    public final MessageLite F(final ahbt ahbt) {
        final MessageLite b = ((agcb)this.a).b(ahbt);
        ((agcb)this.a).d(b);
        return ((agcb)this.a).a(b);
    }
    
    public final long G() {
        return ((afce)this.a).a(TimeUnit.MICROSECONDS);
    }
    
    public final boolean I(final int n) {
        synchronized (this) {
            if (((List)this.a).size() >= 256) {
                return false;
            }
            ((List<Integer>)this.a).add(Integer.valueOf(n));
            return true;
        }
    }
    
    public final int J() {
        final long b = ((atyv)((atsm)this.a).a).b.b;
        return 0x3FFFFFFF & (int)((b & 0xFFFFFFFC0000000L) >> 30) - (int)(0x3FFFFFFFL & b);
    }
    
    public final Object K() {
        final Object a = this.a;
        Object b;
        while (true) {
            final atyv atyv = (atyv)((atsm)a).a;
            b = atyv.b();
            if (b != atyv.a) {
                break;
            }
            ((atsm)this.a).d(atyv, atyv.c());
        }
        return b;
    }
    
    public final void L() {
        final Object a = this.a;
        while (true) {
            final atyv atyv = (atyv)((atsm)a).a;
            if (atyv.d()) {
                break;
            }
            ((atsm)this.a).d(atyv, atyv.c());
        }
    }
    
    public final boolean M(final Object o) {
        final Object a = this.a;
        while (true) {
            final atyv atyv = (atyv)((atsm)a).a;
            final int a2 = atyv.a(o);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return false;
            }
            ((atsm)this.a).d(atyv, atyv.c());
        }
    }
    
    public final atsm N(final int n) {
        return ((atsm[])this.a)[n];
    }
    
    public final long O(final long n) {
        return ((AtomicLong)this.a).addAndGet(n);
    }
    
    public final int P() {
        return ((ByteBuffer)this.a).position();
    }
    
    public final int Q() {
        return ((ByteBuffer)this.a).remaining();
    }
    
    public final void R(final byte[] array, final int n, final int n2) {
        ((ByteBuffer)this.a).put(array, n, n2);
    }
    
    public final void S(final Object o, final atnb atnb) {
        final Object a = this.a;
        o.getClass();
        atnb.getClass();
        ((LinkedHashMap)a).put(o, atnb);
    }
    
    public final void T(final Object o) {
        if (!this.U(o)) {
            final ArrayList list = new ArrayList();
            for (Class<?> clazz = o.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
                if (((Map)this.a).containsKey(clazz.getCanonicalName())) {
                    list.add(clazz.getCanonicalName());
                }
            }
            String s;
            if (list.isEmpty()) {
                s = String.format("No injector factory bound for Class<%s>", o.getClass().getCanonicalName());
            }
            else {
                s = String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", o.getClass().getCanonicalName(), list);
            }
            throw new IllegalArgumentException(s);
        }
    }
    
    public final boolean U(final Object o) {
        final atnb atnb = ((Map<K, atnb>)this.a).get(o.getClass().getName());
        if (atnb == null) {
            return false;
        }
        final arnb arnb = (arnb)atnb.a();
        try {
            final agpb a = arnb.a();
            arnb.getClass();
            a.getClass();
            a.T(o);
            return true;
        }
        catch (final ClassCastException ex) {
            throw new arnd(String.format("%s does not implement AndroidInjector.Factory<%s>", arnb.getClass().getCanonicalName(), o.getClass().getCanonicalName()), ex);
        }
    }
    
    public final int V(final long n) {
        return ((MediaCodec)this.a).dequeueInputBuffer(n);
    }
    
    public final int W(final MediaCodec$BufferInfo mediaCodec$BufferInfo, final long n) {
        return ((MediaCodec)this.a).dequeueOutputBuffer(mediaCodec$BufferInfo, n);
    }
    
    public final void X() {
        ((MediaCodec)this.a).release();
    }
    
    public final void Y(final int n, final boolean b) {
        ((MediaCodec)this.a).releaseOutputBuffer(n, b);
    }
    
    public final void Z(final Bundle parameters) {
        ((MediaCodec)this.a).setParameters(parameters);
    }
    
    public final agol a(final String s, final String s2) {
        synchronized (this) {
            return agol.a(((SharedPreferences)this.a).getString(am(s, s2), (String)null));
        }
    }
    
    public final void aa() {
        ((MediaCodec)this.a).start();
    }
    
    public final void ab() {
        ((MediaCodec)this.a).stop();
    }
    
    public final ByteBuffer[] ac() {
        return ((MediaCodec)this.a).getInputBuffers();
    }
    
    public final ByteBuffer[] ad() {
        return ((MediaCodec)this.a).getOutputBuffers();
    }
    
    public final void ae(final MediaFormat mediaFormat, final Surface surface, final int n) {
        ((MediaCodec)this.a).configure(mediaFormat, surface, (MediaCrypto)null, n);
    }
    
    public final void af(final int n, final int n2, final long n3) {
        ((MediaCodec)this.a).queueInputBuffer(n, 0, n2, n3, 0);
    }
    
    public final void ag(final float[] array) {
        synchronized (this) {
            System.arraycopy(this.a, 0, array, 0, 4);
        }
    }
    
    public final void ah(final float[] array) {
        monitorenter(this);
        final boolean b = false;
        final double n = array[0];
        final double n2 = array[5];
        final double n3 = array[10];
        Double.isNaN(n);
        final double n4 = n + 1.0;
        Double.isNaN(n2);
        Double.isNaN(n3);
        try {
            final float n5 = (float)Math.sqrt(Math.max(0.0, n4 + n2 + n3));
            Double.isNaN(n2);
            Double.isNaN(n3);
            final float n6 = (float)Math.sqrt(Math.max(0.0, n4 - n2 - n3));
            Double.isNaN(n);
            final double n7 = 1.0 - n;
            Double.isNaN(n2);
            Double.isNaN(n3);
            final float n8 = (float)Math.sqrt(Math.max(0.0, n7 + n2 - n3));
            Double.isNaN(n2);
            Double.isNaN(n3);
            final float n9 = (float)Math.sqrt(Math.max(0.0, n7 - n2 + n3));
            final Object a = this.a;
            final boolean b2 = array[6] - array[9] < 0.0f;
            final float n10 = n6 * 0.5f;
            final boolean b3 = n10 < 0.0f;
            float n11 = n10;
            if (b2 != b3) {
                n11 = -n10;
            }
            final float n12 = n8 * 0.5f;
            ((float[])a)[0] = n11;
            final boolean b4 = array[8] - array[2] < 0.0f;
            final boolean b5 = n12 < 0.0f;
            float n13 = n12;
            if (b4 != b5) {
                n13 = -n12;
            }
            final float n14 = n9 * 0.5f;
            ((float[])a)[1] = n13;
            final boolean b6 = array[1] - array[4] < 0.0f;
            final boolean b7 = n14 < 0.0f || b;
            float n15 = n14;
            if (b6 != b7) {
                n15 = -n14;
            }
            ((float[])a)[2] = n15;
            ((float[])a)[3] = n5 * 0.5f;
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final aqzv ai(final String s, final aqzj aqzj, final aqzg aqzg, final String s2, final aqzy aqzy) {
        final boolean d = aewr.d("POST", "put");
        boolean b = true;
        if (!d) {
            b = (aewr.d("POST", "post") && b);
        }
        adme.K(b);
        if (aqzg.a() != -1L && aqzg.a() < 0L) {
            return (aqzv)new aqzp(s, aqzj, aqzg, s2, (aqzi)this.a, aqzy);
        }
        return (aqzv)new aqzt(s, "POST", aqzj, aqzg, s2, (aqzi)this.a, aqzy, false);
    }
    
    public final aqvk aj(final vgx vgx) {
        return new aqvk((aqvl)((ahcr)this.a).build());
    }
    
    public final aqhk ak() {
        return new aqhk((CommandOuterClass$GestureOptions)((ahcr)this.a).build());
    }
    
    public final aqhj al() {
        return new aqhj((CommandOuterClass$Command)((ahcr)this.a).build());
    }
    
    public final void b() {
        synchronized (this) {
            ((SharedPreferences)this.a).edit().clear().commit();
        }
    }
    
    public final void c(final String s, final String s2, final String s3, String b) {
        synchronized (this) {
            b = agol.b(s3, b, System.currentTimeMillis());
            if (b == null) {
                return;
            }
            final SharedPreferences$Editor edit = ((SharedPreferences)this.a).edit();
            edit.putString(am(s, s2), b);
            edit.commit();
        }
    }
    
    public final boolean d() {
        synchronized (this) {
            return ((SharedPreferences)this.a).getAll().isEmpty();
        }
    }
    
    public final Bundle e() {
        final Bundle bundle = new Bundle((Bundle)this.a);
        for (final String s : ((Bundle)this.a).keySet()) {
            if (!s.startsWith("google.c.a.") && !s.equals("from")) {
                bundle.remove(s);
            }
        }
        return bundle;
    }
    
    public final Integer f(final String s) {
        final String i = this.i(s);
        if (!TextUtils.isEmpty((CharSequence)i)) {
            try {
                return Integer.parseInt(i);
            }
            catch (final NumberFormatException ex) {
                final String j = j(s);
                final StringBuilder sb = new StringBuilder("Couldn't parse value of ");
                sb.append(j);
                sb.append("(");
                sb.append(i);
                sb.append(") into an int");
                Log.w("NotificationParams", sb.toString());
            }
        }
        return null;
    }
    
    public final String g(final Resources resources, String o, String j) {
        final String i = this.i(j.concat("_loc_key"));
        if (TextUtils.isEmpty((CharSequence)i)) {
            return null;
        }
        final int identifier = resources.getIdentifier(i, "string", (String)o);
        if (identifier != 0) {
            final JSONArray k = this.k(j.concat("_loc_args"));
            if (k == null) {
                o = null;
            }
            else {
                final int length = k.length();
                final String[] array = new String[length];
                int n = 0;
                while (true) {
                    o = array;
                    if (n >= length) {
                        break;
                    }
                    array[n] = k.optString(n);
                    ++n;
                }
            }
            if (o == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, (Object[])o);
            }
            catch (final MissingFormatArgumentException ex) {
                j = j(j);
                final String string = Arrays.toString((Object[])o);
                final StringBuilder sb = new StringBuilder("Missing format argument for ");
                sb.append(j);
                sb.append(": ");
                sb.append(string);
                sb.append(" Default value will be used.");
                Log.w("NotificationParams", sb.toString(), (Throwable)ex);
                return null;
            }
        }
        final String l = j(j.concat("_loc_key"));
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(l);
        sb2.append(" resource not found: ");
        sb2.append(j);
        sb2.append(" Default value will be used.");
        Log.w("NotificationParams", sb2.toString());
        return null;
    }
    
    public final String h(final Resources resources, final String s, final String s2) {
        final String i = this.i(s2);
        if (!TextUtils.isEmpty((CharSequence)i)) {
            return i;
        }
        return this.g(resources, s, s2);
    }
    
    public final String i(final String s) {
        final Bundle bundle = (Bundle)this.a;
        String s2 = s;
        if (!bundle.containsKey(s)) {
            s2 = s;
            if (s.startsWith("gcm.n.")) {
                final String an = an(s);
                s2 = s;
                if (((Bundle)this.a).containsKey(an)) {
                    s2 = an;
                }
            }
        }
        return bundle.getString(s2);
    }
    
    public final JSONArray k(final String s) {
        final String i = this.i(s);
        if (!TextUtils.isEmpty((CharSequence)i)) {
            try {
                return new JSONArray(i);
            }
            catch (final JSONException ex) {
                final String j = j(s);
                final StringBuilder sb = new StringBuilder("Malformed JSON for key ");
                sb.append(j);
                sb.append(": ");
                sb.append(i);
                sb.append(", falling back to default");
                Log.w("NotificationParams", sb.toString());
            }
        }
        return null;
    }
    
    public final boolean l(String i) {
        i = this.i(i);
        return "1".equals(i) || Boolean.parseBoolean(i);
    }
    
    public final List n() {
        monitorenter(this);
        try {
            final ArrayList<agmm> list = new ArrayList<agmm>();
            for (final Map.Entry<String, V> entry : ((SharedPreferences)this.a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    list.add(new agmm(entry.getKey(), new ArrayList((Collection<?>)entry.getValue())));
                }
            }
            this.r(System.currentTimeMillis());
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void o() {
        monitorenter(this);
        try {
            final SharedPreferences$Editor edit = ((SharedPreferences)this.a).edit();
            for (final Map.Entry<String, V> entry : ((SharedPreferences)this.a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    edit.remove((String)entry.getKey());
                }
            }
            edit.remove("fire-count");
            edit.commit();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void p() {
        synchronized (this) {
            final String ao = this.ao(System.currentTimeMillis());
            ((SharedPreferences)this.a).edit().putString("last-used-date", ao).commit();
            this.ar(ao);
        }
    }
    
    public final void q(long n, final String s) {
        synchronized (this) {
            final String ao = this.ao(n);
            if (((SharedPreferences)this.a).getString("last-used-date", "").equals(ao)) {
                return;
            }
            if ((n = ((SharedPreferences)this.a).getLong("fire-count", 0L)) + 1L == 30L) {
                this.aq();
                n = ((SharedPreferences)this.a).getLong("fire-count", 0L);
            }
            final HashSet set = new HashSet(((SharedPreferences)this.a).getStringSet(s, (Set)new HashSet()));
            set.add(ao);
            ((SharedPreferences)this.a).edit().putStringSet(s, (Set)set).putLong("fire-count", n + 1L).putString("last-used-date", ao).commit();
        }
    }
    
    final void r(final long n) {
        synchronized (this) {
            ((SharedPreferences)this.a).edit().putLong("fire-global", n).commit();
        }
    }
    
    final boolean s(final long n, final long n2) {
        synchronized (this) {
            return this.ao(n).equals(this.ao(n2));
        }
    }
    
    public final boolean t(final long n) {
        synchronized (this) {
            return this.u(n);
        }
    }
    
    final boolean u(final long n) {
        synchronized (this) {
            if (!((SharedPreferences)this.a).contains("fire-global")) {
                ((SharedPreferences)this.a).edit().putLong("fire-global", n).commit();
                return true;
            }
            if (!this.s(((SharedPreferences)this.a).getLong("fire-global", -1L), n)) {
                ((SharedPreferences)this.a).edit().putLong("fire-global", n).commit();
                return true;
            }
            return false;
        }
    }
    
    public final void v(final agkh... array) {
        try {
            final Thing[] array2 = { null };
            System.arraycopy(array, 0, array2, 0, 1);
            this.w(new MutateRequest(1, array2, (String[])null, (String[])null, (ActionImpl)null, (String)null, (String)null));
        }
        catch (final ArrayStoreException ex) {
            nom.d((Exception)new agkf("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
        }
    }
    
    public final void w(final MutateRequest mutateRequest) {
        final Object a = this.a;
        final agkn agkn = (agkn)a;
        final athd athd = new athd(agkn, mutateRequest);
        ((nnt)((noj)athd.b).a).l((Executor)a, (nnn)a);
        synchronized (agkn.b) {
            final boolean empty = ((agkn)a).b.isEmpty();
            ((agkn)a).b.add(athd);
            monitorexit(agkn.b);
            if (empty) {
                athd.f();
            }
        }
    }
    
    public final int x() {
        return ((agij)this.a).a.length;
    }
}
