import java.util.concurrent.locks.ReadWriteLock;
import java.util.Map;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.Locale;
import java.io.File;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import android.app.AlertDialog;
import android.content.DialogInterface$OnClickListener;
import android.widget.ListAdapter;
import android.app.AlertDialog$Builder;
import android.widget.ArrayAdapter;
import java.util.List;
import android.app.Dialog;
import java.io.IOException;
import java.io.OutputStream;
import j$.time.temporal.Temporal;
import j$.time.Duration;
import j$.time.Instant;
import android.util.Log;
import android.text.TextUtils;
import java.util.ArrayDeque;
import android.net.Uri;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.Executor;
import android.content.SharedPreferences;
import android.content.Context;
import java.util.WeakHashMap;
import java.util.HashMap;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmx
{
    private static WeakReference d;
    public final Object a;
    public final Object b;
    public Object c;
    
    public agmx() {
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    public agmx(final acjd a) {
        this.a = a;
        this.b = new WeakHashMap();
    }
    
    public agmx(final Context context) {
        this(context, null, null, null, null);
    }
    
    public agmx(final Context a, final acya b) {
        this.b = b;
        this.a = a;
    }
    
    public agmx(final Context b, final aeea a, final byte[] array, final byte[] array2, final byte[] array3) {
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public agmx(final Context a, final tqd b) {
        this.a = a;
        this.b = b;
    }
    
    private agmx(final SharedPreferences a, final Executor b) {
        this.b = b;
        this.a = a;
    }
    
    public agmx(final Runnable b, final Executor a, final agmx c, final byte[] array) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public agmx(final wxx b, final wyw a) {
        this.b = b;
        this.a = a;
    }
    
    public agmx(final byte[] array) {
        this.a = new ReentrantReadWriteLock();
        this.b = new HashMap();
    }
    
    static final Uri K(final String s) {
        return acjd.g(1, "comment", s, "creator_heart_button");
    }
    
    static final Uri L(final String s) {
        return acjd.g(1, "comment", s, "like_button");
    }
    
    public static final Uri M(final String s) {
        return acjd.g(1, "comment", s, "poll_renderer");
    }
    
    public static final Uri N(final String s) {
        return acjd.g(1, "comment", s, "poll_status");
    }
    
    private final void O() {
        monitorenter(this);
        try {
            final ziy c = new ziy((SharedPreferences)this.a, (Executor)this.b);
            synchronized (c.d) {
                ((ArrayDeque)c.d).clear();
                final String string = ((SharedPreferences)c.b).getString((String)c.c, "");
                if (!TextUtils.isEmpty((CharSequence)string) && string.contains((CharSequence)c.a)) {
                    final String[] split = string.split((String)c.a, -1);
                    final int length = split.length;
                    int i;
                    final int n = i = 0;
                    if (length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                        i = n;
                    }
                    while (i < length) {
                        final String s = split[i];
                        if (!TextUtils.isEmpty((CharSequence)s)) {
                            ((ArrayDeque)c.d).add(s);
                        }
                        ++i;
                    }
                    monitorexit(c.d);
                }
                else {
                    monitorexit(c.d);
                }
                this.c = c;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void P() {
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            final aezp g = ((acya)this.b).g();
            if (!g.h()) {
                ttr.l("OnDeviceSuggestIndexStore: Index file is absent in SharedPrefrences, probably not fetched yet. No on-device suggestions will be returned until the file is fetched.");
                return;
            }
            this.j((String)g.c());
        }
    }
    
    private final void Q(final boolean c, final boolean b, final int n) {
        final Object c2 = this.c;
        if (c2 != null) {
            final ahaz builder = aptz.a.createBuilder();
            builder.copyOnWrite();
            ((aptz)builder.instance).b = b;
            builder.copyOnWrite();
            ((aptz)builder.instance).c = c;
            final afsr a = afsr.a;
            final int d = (int)Duration.between((Temporal)c2, (Temporal)Instant.now()).getSeconds();
            builder.copyOnWrite();
            ((aptz)builder.instance).d = d;
            builder.copyOnWrite();
            ((aptz)builder.instance).e = aqsx.au(n);
            final aptz aptz = (aptz)builder.build();
            final aknr d2 = aknt.d();
            ((ahaz)d2).copyOnWrite();
            aknt.H((aknt)d2.instance, aptz);
            ((wxx)this.b).d((aknt)((ahaz)d2).build());
            this.c = null;
        }
    }
    
    private static final Uri R(final String s) {
        return acjd.g(1, "comment", s, "dislike_button");
    }
    
    public static agmx b(final Context context, final Executor executor) {
        synchronized (agmx.class) {
            final WeakReference d = agmx.d;
            agmx agmx;
            if (d != null) {
                agmx = (agmx)d.get();
            }
            else {
                agmx = null;
            }
            if (agmx == null) {
                final agmx agmx2 = new agmx(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                agmx2.O();
                agmx.d = new WeakReference(agmx2);
                return agmx2;
            }
            return agmx;
        }
    }
    
    public static void i(final OutputStream outputStream) {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        }
        catch (final IOException ex) {}
    }
    
    public final aidi A(final String s, final aiqn aiqn, final boolean b) {
        aida aida;
        if ((aida = aiqn.c) == null) {
            aida = aida.a;
        }
        aidi aidi;
        if ((aida.b & 0x2) != 0x0) {
            aida aida2;
            if ((aida2 = aiqn.c) == null) {
                aida2 = aida.a;
            }
            if ((aidi = aida2.d) == null) {
                aidi = aidi.a;
            }
        }
        else {
            aidi = null;
        }
        return (aidi)this.D(L(s), aidi, aidi.class, aiqn.h, b);
    }
    
    public final airo B(final airz airz, final boolean b) {
        ahzy ahzy;
        if ((ahzy = airz.B) == null) {
            ahzy = ahzy.a;
        }
        anlc a;
        if (ahzy.b == 99391126) {
            ahzy ahzy2;
            if ((ahzy2 = airz.B) == null) {
                ahzy2 = ahzy.a;
            }
            if (ahzy2.b == 99391126) {
                a = (anlc)ahzy2.c;
            }
            else {
                a = anlc.a;
            }
        }
        else {
            a = null;
        }
        if (a != null) {
            airo airo;
            if ((airo = airo.b(airz.H)) == null) {
                airo = airo.a;
            }
            if (airo != airo.a) {
                final Uri n = N(airz.i);
                airo airo2;
                if ((airo2 = airo.b(airz.H)) == null) {
                    airo2 = airo.a;
                }
                return (airo)this.D(n, airo2, airo.class, a.k, b);
            }
        }
        airo airo3;
        if ((airo3 = airo.b(airz.H)) == null) {
            airo3 = airo.a;
        }
        return airo3;
    }
    
    public final ajaz C(final String s, final aiqn aiqn, final boolean b) {
        ajba ajba;
        if ((ajba = aiqn.f) == null) {
            ajba = ajba.a;
        }
        ajaz ajaz;
        if ((ajba.b & 0x1) != 0x0) {
            ajba ajba2;
            if ((ajba2 = aiqn.f) == null) {
                ajba2 = ajba.a;
            }
            if ((ajaz = ajba2.c) == null) {
                ajaz = ajaz.a;
            }
        }
        else {
            ajaz = null;
        }
        return (ajaz)this.D(K(s), ajaz, ajaz.class, aiqn.h, b);
    }
    
    public final Object D(final Uri uri, final Object o, final Class clazz, final long n, final boolean b) {
        if (o != null) {
            if (n != 0L) {
                final swh swh = (swh)((acjd)this.a).b(uri);
                if (swh != null && swh.b >= n) {
                    return clazz.cast(swh.a);
                }
                if ((swh == null && b) || (swh != null && swh.b < n)) {
                    ((acjd)this.a).d(uri, (acjb)new swh(o, n));
                }
            }
        }
        return o;
    }
    
    public final void E(final Uri uri, final swi swi) {
        final swg swg = new swg(this, swi, (byte[])null, (byte[])null, (byte[])null);
        ((acjd)this.a).h(uri, (acjc)swg);
        ((Map<swi, acjc>)this.b).put(swi, (acjc)swg);
    }
    
    public final void F(final swi swi) {
        final acjc acjc = ((Map<K, acjc>)this.b).remove(swi);
        if (acjc != null) {
            ((acjd)this.a).f(acjc);
        }
    }
    
    public final void G(final String s, final long n, final aidi aidi, final aidi aidi2) {
        if (n == 0L) {
            return;
        }
        if (aidi != null) {
            ((acjd)this.a).c(L(s), (acjb)new swh((Object)aidi, n));
        }
        if (aidi2 != null) {
            ((acjd)this.a).c(R(s), (acjb)new swh((Object)aidi2, n));
        }
    }
    
    public final void H(final String s, final long n, final ajaz ajaz) {
        if (n == 0L) {
            return;
        }
        if (ajaz != null) {
            ((acjd)this.a).c(K(s), (acjb)new swh((Object)ajaz, n));
        }
    }
    
    public final void I(final String s, final anlc anlc) {
        if (anlc != null) {
            if (anlc.k != 0L) {
                ((acjd)this.a).c(M(s), (acjb)new swh((Object)anlc, anlc.k));
            }
        }
    }
    
    public final void J(final String s, final long n, final airo airo) {
        if (n != 0L) {
            if (airo != airo.a) {
                ((acjd)this.a).c(N(s), (acjb)new swh((Object)airo, n));
            }
        }
    }
    
    final agmw a() {
        synchronized (this) {
            final Object c = this.c;
            Object o = ((ziy)c).d;
            synchronized (o) {
                final String s = ((ArrayDeque)((ziy)c).d).peek();
                monitorexit(o);
                o = agmw.a(s);
                return (agmw)o;
            }
        }
    }
    
    final void c(final agmw agmw) {
        synchronized (this) {
            final Object c = this.c;
            final String c2 = agmw.c;
            if (!TextUtils.isEmpty((CharSequence)c2)) {
                if (!c2.contains((CharSequence)((ziy)c).a)) {
                    synchronized (((ziy)c).d) {
                        ((ziy)c).ag(((ArrayDeque)((ziy)c).d).add(c2));
                    }
                }
            }
        }
    }
    
    final void d(final agmw agmw) {
        synchronized (this) {
            final Object c = this.c;
            final String c2 = agmw.c;
            synchronized (((ziy)c).d) {
                ((ziy)c).ag(((ArrayDeque)((ziy)c).d).remove(c2));
            }
        }
    }
    
    public final void e() {
        final Object c = this.c;
        if (c != null && ((Dialog)c).isShowing()) {
            ((Dialog)this.c).dismiss();
        }
        this.c = null;
    }
    
    public final void f(final List list, final abdh abdh) {
        this.g(list, abdh, null);
    }
    
    public final void g(final List list, final abdh abdh, final wyv wyv) {
        final String string = ((Context)this.b).getString(2132019902);
        abdh.getClass();
        this.e();
        final ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this.b, 17367057, list);
        final syf syf = new syf(arrayAdapter, abdh, 8);
        final Object a = this.a;
        Object al;
        if (a != null && ((aeea)a).ao()) {
            al = ((aeea)this.a).al((Context)this.b);
        }
        else {
            al = new AlertDialog$Builder((Context)this.b);
        }
        final AlertDialog create = ((AlertDialog$Builder)al).setTitle((CharSequence)string).setSingleChoiceItems((ListAdapter)arrayAdapter, 0, (DialogInterface$OnClickListener)syf).create();
        this.c = create;
        ((Dialog)create).show();
        if (wyv != null) {
            final InteractionLoggingScreen a2 = wyv.pF().a();
            if (a2 != null) {
                final wzz wzz = new wzz(a2, xaa.c(107242));
                wyv.pF().D(wzz);
                wyv.pF().t(wzz, (alhi)null);
            }
        }
    }
    
    public final aezp h() {
        this.P();
        synchronized (this) {
            return aezp.j(this.c);
        }
    }
    
    public final boolean j(String string) {
        synchronized (this) {
            final File file = new File(string);
            if (!file.exists()) {
                ttr.b("OnDeviceSuggestIndexStore: Index file does not exist.");
                return false;
            }
            try {
                this.c = new aqwk(file.getPath(), ((acya)this.b).a());
                string = file.toString();
                final StringBuilder sb = new StringBuilder("OnDeviceSuggestIndexStore: Successfully created Serving instance from ");
                sb.append(string);
                ttr.g(sb.toString());
                return true;
            }
            catch (final IOException ex) {
                acvg.n("Failed to create Serving instance", (Throwable)ex);
                ttr.d("OnDeviceSuggestIndexStore: Failed to create Serving instance. ", (Throwable)ex);
                return false;
            }
        }
    }
    
    public final ajut k(final alsj alsj) {
        final ahbb ahbb = (ahbb)((ahbh)ajut.a).createBuilder();
        final int size = alsj.c.size();
        if (size > 0) {
            for (int i = 0; i < size; ++i) {
                final ahbb ahbb2 = (ahbb)((ahbh)ajuv.a).createBuilder();
                final alsk alsk = (alsk)alsj.c.get(i);
                final int b = alsk.b;
                String c = "";
                String s;
                if (b == 1) {
                    s = (String)alsk.c;
                }
                else {
                    s = "";
                }
                if (!s.isEmpty()) {
                    final alsk alsk2 = (alsk)alsj.c.get(i);
                    if (alsk2.b == 1) {
                        c = (String)alsk2.c;
                    }
                    ((ahaz)ahbb2).copyOnWrite();
                    final ajuv ajuv = (ajuv)ahbb2.instance;
                    c.getClass();
                    ajuv.b |= 0x1;
                    ajuv.c = c;
                }
                else {
                    final alsk alsk3 = (alsk)alsj.c.get(i);
                    String s2;
                    if (alsk3.b == 2) {
                        s2 = (String)alsk3.c;
                    }
                    else {
                        s2 = "";
                    }
                    if (!s2.isEmpty()) {
                        final ahbf b2 = ajoi.b;
                        final Object a = this.a;
                        final alsk alsk4 = (alsk)alsj.c.get(i);
                        if (alsk4.b == 2) {
                            c = (String)alsk4.c;
                        }
                        ahbb2.e((ahaq)b2, (Object)((Map<K, ajoi>)a).get(c));
                    }
                }
                ahbb.u(ahbb2);
            }
        }
        final boolean d = alsj.d;
        ((ahaz)ahbb).copyOnWrite();
        final ajut ajut = (ajut)ahbb.instance;
        ajut.b |= 0x2;
        ajut.e = d;
        return (ajut)((ahaz)ahbb).build();
    }
    
    public final aotp l(final String s) {
        if (((Map)this.a).containsKey(s)) {
            aotp aotp;
            if ((aotp = ((Map<K, ajoi>)this.a).get(s).f) == null) {
                aotp = aotp.a;
            }
            return aotp;
        }
        return null;
    }
    
    public final String m(final String s) {
        final ajoi ajoi = ((Map<K, ajoi>)this.a).get(s);
        if (ajoi != null && (ajoi.c & 0x4) != 0x0) {
            aotp aotp;
            if ((aotp = ajoi.f) == null) {
                aotp = aotp.a;
            }
            if ((aotp.b & 0x8) != 0x0) {
                aotp aotp2;
                if ((aotp2 = ajoi.f) == null) {
                    aotp2 = aotp.a;
                }
                ahil ahil;
                if ((ahil = aotp2.d) == null) {
                    ahil = ahil.a;
                }
                if ((ahil.b & 0x1) != 0x0) {
                    aotp aotp3;
                    if ((aotp3 = ajoi.f) == null) {
                        aotp3 = aotp.a;
                    }
                    ahil ahil2;
                    if ((ahil2 = aotp3.d) == null) {
                        ahil2 = ahil.a;
                    }
                    ahik ahik;
                    if ((ahik = ahil2.c) == null) {
                        ahik = ahik.a;
                    }
                    return ahik.c;
                }
            }
        }
        return null;
    }
    
    public final String n(final String s) {
        if (((Map)this.b).containsKey(s.toLowerCase(Locale.ROOT))) {
            return ((Map<K, String>)this.b).get(s.toLowerCase(Locale.ROOT));
        }
        return null;
    }
    
    public final String o(final String s) {
        final ajoi ajoi = ((Map<K, ajoi>)this.a).get(s);
        if (ajoi == null) {
            return "";
        }
        String s2 = s;
        if (ajoi.g) {
            final ajoi ajoi2 = ((Map<K, ajoi>)this.a).get(s);
            if (ajoi2 != null && ajoi2.e.size() > 0 && !TextUtils.isEmpty((CharSequence)ajoi2.e.get(0))) {
                s2 = (String)ajoi2.e.get(0);
            }
            else {
                s2 = " ";
            }
        }
        return s2;
    }
    
    public final Pattern p() {
        if (!((Map)this.b).isEmpty()) {
            return (Pattern)this.c;
        }
        return null;
    }
    
    public final void q(final List list, final boolean b) {
        if (b) {
            this.c = null;
            ((Map)this.a).clear();
            ((Map)this.b).clear();
        }
        if (list != null) {
            for (final ajoi ajoi : list) {
                ((Map<String, ajoi>)this.a).put(ajoi.d, ajoi);
            }
        }
        final ArrayList list2 = new ArrayList();
        for (final ajoi ajoi2 : ((Map<K, ajoi>)this.a).values()) {
            if (!ajoi2.h) {
                for (final String s : ajoi2.e) {
                    if (ajoi2.g) {
                        ((Map<String, String>)this.b).put(s.toLowerCase(Locale.ROOT), ajoi2.d);
                        final String replaceAll = s.replaceAll("([^a-zA-Z0-9 :_-])", "\\\\$1");
                        final StringBuilder sb = new StringBuilder("(");
                        sb.append(replaceAll);
                        sb.append(")");
                        list2.add(sb.toString());
                    }
                }
            }
        }
        Collections.sort((List<Comparable>)list2);
        if (!((Map)this.b).isEmpty()) {
            this.c = Pattern.compile(TextUtils.join((CharSequence)"|", (Iterable)list2), 10);
        }
    }
    
    public final boolean r() {
        return this.c != null;
    }
    
    public final aclj s(Object c) {
        ((ReadWriteLock)this.a).readLock().lock();
        if ((c = ((Map<K, atke>)this.b).get(c)) == null) {
            c = this.c;
        }
        ((ReadWriteLock)this.a).readLock().unlock();
        if (c != null) {
            return (aclj)((atke)c).a();
        }
        return null;
    }
    
    public final void t(final Map map) {
        ((ReadWriteLock)this.a).readLock().lock();
        try {
            final Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                adkp.Q(((Map)this.b).containsKey(iterator.next()) ^ true);
            }
            ((ReadWriteLock)this.a).readLock().unlock();
            ((ReadWriteLock)this.a).writeLock().lock();
            ((Map<Object, Object>)this.b).putAll(map);
            ((ReadWriteLock)this.a).writeLock().unlock();
        }
        finally {
            ((ReadWriteLock)this.a).readLock().unlock();
            while (true) {}
        }
    }
    
    public final void u(final atke c) {
        ((ReadWriteLock)this.a).writeLock().lock();
        this.c = c;
        ((ReadWriteLock)this.a).writeLock().unlock();
    }
    
    public final void v(final int n) {
        this.Q(true, false, n);
    }
    
    public final void w(final int n) {
        this.Q(false, true, n);
    }
    
    public final void x(int n) {
        if (n != 0) {
            if (n - 2 != 95) {
                n = 131462;
            }
            else {
                n = 153248;
            }
            ((wyw)this.a).D((wzz)new wyt(xaa.c(n)));
            ((wyw)this.a).J(3, (wzz)new wyt(xaa.c(n)), (alhi)null);
            final afsr a = afsr.a;
            this.c = Instant.now();
            return;
        }
        throw null;
    }
    
    public final void y(final int n) {
        if (n != 0) {
            int n2;
            if (n - 2 != 95) {
                n2 = 131463;
            }
            else {
                n2 = 153249;
            }
            ((wyw)this.a).D((wzz)new wyt(xaa.c(n2)));
            ((wyw)this.a).J(3, (wzz)new wyt(xaa.c(n2)), (alhi)null);
            this.Q(false, false, n);
            return;
        }
        throw null;
    }
    
    public final aidi z(final String s, final aiqn aiqn, final boolean b) {
        aida aida;
        if ((aida = aiqn.d) == null) {
            aida = aida.a;
        }
        aidi aidi;
        if ((aida.b & 0x2) != 0x0) {
            aida aida2;
            if ((aida2 = aiqn.d) == null) {
                aida2 = aida.a;
            }
            if ((aidi = aida2.d) == null) {
                aidi = aidi.a;
            }
        }
        else {
            aidi = null;
        }
        return (aidi)this.D(R(s), aidi, aidi.class, aiqn.h, b);
    }
}
