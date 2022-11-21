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
import android.util.Log;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.io.IOException;
import java.io.OutputStream;
import j$.time.temporal.Temporal;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.Executor;
import android.content.SharedPreferences;
import android.content.Context;
import java.util.HashMap;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agop
{
    private static WeakReference d;
    public final Object a;
    public final Object b;
    public Object c;
    
    public agop() {
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    public agop(final Context context) {
        this(context, null, null, null, null);
    }
    
    public agop(final Context a, final aczn b) {
        this.b = b;
        this.a = a;
    }
    
    public agop(final Context b, final aefs a, final byte[] array, final byte[] array2, final byte[] array3) {
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public agop(final Context b, final tre a) {
        this.b = b;
        this.a = a;
    }
    
    private agop(final SharedPreferences a, final Executor b) {
        this.b = b;
        this.a = a;
    }
    
    public agop(final Runnable b, final Executor a, final agop c, final byte[] array) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public agop(final vey a, final zoa b) {
        this.a = a;
        this.b = b;
    }
    
    public agop(final wza a, final xab b) {
        this.a = a;
        this.b = b;
    }
    
    public agop(final byte[] array) {
        this.b = new ReentrantReadWriteLock();
        this.a = new HashMap();
    }
    
    private final void A() {
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            final afbh g = ((aczn)this.b).g();
            if (!g.h()) {
                tut.l("OnDeviceSuggestIndexStore: Index file is absent in SharedPrefrences, probably not fetched yet. No on-device suggestions will be returned until the file is fetched.");
                return;
            }
            this.j((String)g.c());
        }
    }
    
    private final void B(final boolean c, final boolean b, final int n) {
        final Object c2 = this.c;
        if (c2 != null) {
            final ahcr builder = apwm.a.createBuilder();
            builder.copyOnWrite();
            ((apwm)builder.instance).b = b;
            builder.copyOnWrite();
            ((apwm)builder.instance).c = c;
            final afuh a = afuh.a;
            final int d = (int)Duration.between((Temporal)c2, (Temporal)Instant.now()).getSeconds();
            builder.copyOnWrite();
            ((apwm)builder.instance).d = d;
            builder.copyOnWrite();
            ((apwm)builder.instance).e = aqvq.am(n);
            final apwm apwm = (apwm)builder.build();
            final akps d2 = akpu.d();
            ((ahcr)d2).copyOnWrite();
            akpu.H((akpu)d2.instance, apwm);
            ((wza)this.a).d((akpu)((ahcr)d2).build());
            this.c = null;
        }
    }
    
    public static agop b(final Context context, final Executor executor) {
        synchronized (agop.class) {
            final WeakReference d = agop.d;
            agop agop;
            if (d != null) {
                agop = (agop)d.get();
            }
            else {
                agop = null;
            }
            if (agop == null) {
                final agop agop2 = new agop(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                agop2.z();
                agop.d = new WeakReference(agop2);
                return agop2;
            }
            return agop;
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
    
    private final void z() {
        monitorenter(this);
        try {
            final zkt c = new zkt((SharedPreferences)this.a, (Executor)this.b);
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
    
    final agoo a() {
        synchronized (this) {
            final Object c = this.c;
            Object o = ((zkt)c).d;
            synchronized (o) {
                final String s = ((ArrayDeque)((zkt)c).d).peek();
                monitorexit(o);
                o = agoo.a(s);
                return (agoo)o;
            }
        }
    }
    
    final void c(final agoo agoo) {
        synchronized (this) {
            final Object c = this.c;
            final String c2 = agoo.c;
            if (!TextUtils.isEmpty((CharSequence)c2)) {
                if (!c2.contains((CharSequence)((zkt)c).a)) {
                    synchronized (((zkt)c).d) {
                        ((zkt)c).ae(((ArrayDeque)((zkt)c).d).add(c2));
                    }
                }
            }
        }
    }
    
    final void d(final agoo agoo) {
        synchronized (this) {
            final Object c = this.c;
            final String c2 = agoo.c;
            synchronized (((zkt)c).d) {
                ((zkt)c).ae(((ArrayDeque)((zkt)c).d).remove(c2));
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
    
    public final void f(final List list, final aben aben) {
        this.g(list, aben, null);
    }
    
    public final void g(final List list, final aben aben, final xaa xaa) {
        final String string = ((Context)this.b).getString(2132019905);
        aben.getClass();
        this.e();
        final ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this.b, 17367057, list);
        final szi szi = new szi(arrayAdapter, aben, 8);
        final Object a = this.a;
        Object v;
        if (a != null && ((aefs)a).Y()) {
            v = ((aefs)this.a).V((Context)this.b);
        }
        else {
            v = new AlertDialog$Builder((Context)this.b);
        }
        final AlertDialog create = ((AlertDialog$Builder)v).setTitle((CharSequence)string).setSingleChoiceItems((ListAdapter)arrayAdapter, 0, (DialogInterface$OnClickListener)szi).create();
        this.c = create;
        ((Dialog)create).show();
        if (xaa != null) {
            final InteractionLoggingScreen a2 = xaa.pE().a();
            if (a2 != null) {
                final xbe xbe = new xbe(a2, xbf.c(107242));
                xaa.pE().D(xbe);
                xaa.pE().t(xbe, (alji)null);
            }
        }
    }
    
    public final afbh h() {
        this.A();
        synchronized (this) {
            return afbh.j(this.c);
        }
    }
    
    public final boolean j(String string) {
        synchronized (this) {
            final File file = new File(string);
            if (!file.exists()) {
                tut.b("OnDeviceSuggestIndexStore: Index file does not exist.");
                return false;
            }
            try {
                this.c = new aqzf(file.getPath(), ((aczn)this.b).a());
                string = file.toString();
                final StringBuilder sb = new StringBuilder("OnDeviceSuggestIndexStore: Successfully created Serving instance from ");
                sb.append(string);
                tut.g(sb.toString());
                return true;
            }
            catch (final IOException ex) {
                acws.h("Failed to create Serving instance", (Throwable)ex);
                tut.d("OnDeviceSuggestIndexStore: Failed to create Serving instance. ", (Throwable)ex);
                return false;
            }
        }
    }
    
    public final void k(final int n) {
        this.B(true, false, n);
    }
    
    public final void l(final int n) {
        this.B(false, true, n);
    }
    
    public final void m(int n) {
        if (n != 0) {
            if (n - 2 != 95) {
                n = 131462;
            }
            else {
                n = 153248;
            }
            ((xab)this.b).D((xbe)new wzy(xbf.c(n)));
            ((xab)this.b).J(3, (xbe)new wzy(xbf.c(n)), (alji)null);
            final afuh a = afuh.a;
            this.c = Instant.now();
            return;
        }
        throw null;
    }
    
    public final void n(final int n) {
        if (n != 0) {
            int n2;
            if (n - 2 != 95) {
                n2 = 131463;
            }
            else {
                n2 = 153249;
            }
            ((xab)this.b).D((xbe)new wzy(xbf.c(n2)));
            ((xab)this.b).J(3, (xbe)new wzy(xbf.c(n2)), (alji)null);
            this.B(false, false, n);
            return;
        }
        throw null;
    }
    
    public final ajws o(final aluj aluj) {
        final ahct ahct = (ahct)((ahcz)ajws.a).createBuilder();
        final int size = aluj.c.size();
        if (size > 0) {
            for (int i = 0; i < size; ++i) {
                final ahct ahct2 = (ahct)((ahcz)ajwu.a).createBuilder();
                final aluk aluk = (aluk)aluj.c.get(i);
                final int b = aluk.b;
                String c = "";
                String s;
                if (b == 1) {
                    s = (String)aluk.c;
                }
                else {
                    s = "";
                }
                if (!s.isEmpty()) {
                    final aluk aluk2 = (aluk)aluj.c.get(i);
                    if (aluk2.b == 1) {
                        c = (String)aluk2.c;
                    }
                    ((ahcr)ahct2).copyOnWrite();
                    final ajwu ajwu = (ajwu)ahct2.instance;
                    c.getClass();
                    ajwu.b |= 0x1;
                    ajwu.c = c;
                }
                else {
                    final aluk aluk3 = (aluk)aluj.c.get(i);
                    String s2;
                    if (aluk3.b == 2) {
                        s2 = (String)aluk3.c;
                    }
                    else {
                        s2 = "";
                    }
                    if (!s2.isEmpty()) {
                        final ahcx b2 = ajqh.b;
                        final Object a = this.a;
                        final aluk aluk4 = (aluk)aluj.c.get(i);
                        if (aluk4.b == 2) {
                            c = (String)aluk4.c;
                        }
                        ahct2.e((ahci)b2, (Object)((Map<K, ajqh>)a).get(c));
                    }
                }
                ahct.u(ahct2);
            }
        }
        final boolean d = aluj.d;
        ((ahcr)ahct).copyOnWrite();
        final ajws ajws = (ajws)ahct.instance;
        ajws.b |= 0x2;
        ajws.e = d;
        return (ajws)((ahcr)ahct).build();
    }
    
    public final aowb p(final String s) {
        if (((Map)this.a).containsKey(s)) {
            aowb aowb;
            if ((aowb = ((Map<K, ajqh>)this.a).get(s).f) == null) {
                aowb = aowb.a;
            }
            return aowb;
        }
        return null;
    }
    
    public final String q(final String s) {
        final ajqh ajqh = ((Map<K, ajqh>)this.a).get(s);
        if (ajqh != null && (ajqh.c & 0x4) != 0x0) {
            aowb aowb;
            if ((aowb = ajqh.f) == null) {
                aowb = aowb.a;
            }
            if ((aowb.b & 0x8) != 0x0) {
                aowb aowb2;
                if ((aowb2 = ajqh.f) == null) {
                    aowb2 = aowb.a;
                }
                ahkc ahkc;
                if ((ahkc = aowb2.d) == null) {
                    ahkc = ahkc.a;
                }
                if ((ahkc.b & 0x1) != 0x0) {
                    aowb aowb3;
                    if ((aowb3 = ajqh.f) == null) {
                        aowb3 = aowb.a;
                    }
                    ahkc ahkc2;
                    if ((ahkc2 = aowb3.d) == null) {
                        ahkc2 = ahkc.a;
                    }
                    ahkb ahkb;
                    if ((ahkb = ahkc2.c) == null) {
                        ahkb = ahkb.a;
                    }
                    return ahkb.c;
                }
            }
        }
        return null;
    }
    
    public final String r(final String s) {
        if (((Map)this.b).containsKey(s.toLowerCase(Locale.ROOT))) {
            return ((Map<K, String>)this.b).get(s.toLowerCase(Locale.ROOT));
        }
        return null;
    }
    
    public final String s(final String s) {
        final ajqh ajqh = ((Map<K, ajqh>)this.a).get(s);
        if (ajqh == null) {
            return "";
        }
        String s2 = s;
        if (ajqh.g) {
            final ajqh ajqh2 = ((Map<K, ajqh>)this.a).get(s);
            if (ajqh2 != null && ajqh2.e.size() > 0 && !TextUtils.isEmpty((CharSequence)ajqh2.e.get(0))) {
                s2 = (String)ajqh2.e.get(0);
            }
            else {
                s2 = " ";
            }
        }
        return s2;
    }
    
    public final Pattern t() {
        if (!((Map)this.b).isEmpty()) {
            return (Pattern)this.c;
        }
        return null;
    }
    
    public final void u(final List list, final boolean b) {
        if (b) {
            this.c = null;
            ((Map)this.a).clear();
            ((Map)this.b).clear();
        }
        if (list != null) {
            for (final ajqh ajqh : list) {
                ((Map<String, ajqh>)this.a).put(ajqh.d, ajqh);
            }
        }
        final ArrayList list2 = new ArrayList();
        for (final ajqh ajqh2 : ((Map<K, ajqh>)this.a).values()) {
            if (!ajqh2.h) {
                for (final String s : ajqh2.e) {
                    if (ajqh2.g) {
                        ((Map<String, String>)this.b).put(s.toLowerCase(Locale.ROOT), ajqh2.d);
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
    
    public final boolean v() {
        return this.c != null;
    }
    
    public final acmw w(Object c) {
        ((ReadWriteLock)this.b).readLock().lock();
        if ((c = ((Map<K, atnb>)this.a).get(c)) == null) {
            c = this.c;
        }
        ((ReadWriteLock)this.b).readLock().unlock();
        if (c != null) {
            return (acmw)((atnb)c).a();
        }
        return null;
    }
    
    public final void x(final Map map) {
        ((ReadWriteLock)this.b).readLock().lock();
        try {
            final Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                adme.T(((Map)this.a).containsKey(iterator.next()) ^ true);
            }
            ((ReadWriteLock)this.b).readLock().unlock();
            ((ReadWriteLock)this.b).writeLock().lock();
            ((Map<Object, Object>)this.a).putAll(map);
            ((ReadWriteLock)this.b).writeLock().unlock();
        }
        finally {
            ((ReadWriteLock)this.b).readLock().unlock();
            while (true) {}
        }
    }
    
    public final void y(final atnb c) {
        ((ReadWriteLock)this.b).writeLock().lock();
        this.c = c;
        ((ReadWriteLock)this.b).writeLock().unlock();
    }
}
