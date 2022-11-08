import java.util.Set;
import java.util.Locale;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import android.view.View;
import java.util.List;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.ViewStub;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.concurrent.CopyOnWriteArrayList;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejr
{
    private static aejr e;
    public final Object a;
    public int b;
    public final Object c;
    public final Object d;
    
    public aejr() {
        this.a = new Object();
        this.c = new HashSet();
        this.d = new nge(this, 2);
    }
    
    public aejr(final int n, final tlq d) {
        this.d = d;
        this.a = new int[n];
        this.c = new long[n];
    }
    
    private aejr(final Context context) {
        this.c = new Handler(Looper.getMainLooper());
        this.d = new CopyOnWriteArrayList();
        this.a = new Object();
        this.b = 0;
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        baw.B(context, (BroadcastReceiver)new baq(this, (byte[])null, (byte[])null), intentFilter);
    }
    
    public aejr(final Context context, final ViewStub viewStub, final anyf anyf) {
        final List s = kgk.s(anyf);
        final View inflate = viewStub.inflate();
        this.a = inflate.findViewById(2131428644);
        this.c = inflate.findViewById(2131432092);
        this.d = new HashSet();
        if (s.isEmpty()) {
            return;
        }
        this.b = kgk.o(s);
        this.f(context, anyf);
        inflate.setOnClickListener((View$OnClickListener)new ezl(this, context, anyf, s, 6, (byte[])null, (byte[])null));
    }
    
    public aejr(final ltt c, final ltv d, final lsv a) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public aejr(final mrm d, final elw a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.a = a;
        this.c = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public aejr(final vax d, final hqa a, final aeby c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = 0;
        d.getClass();
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public aejr(final byte[] array) {
        this.a = new StringBuilder();
        this.c = new Object();
        this.d = new HashMap();
        synchronized ("mLock") {
            this.b = 1;
        }
    }
    
    public static boolean k(final yq yq) {
        return yq != null && yq.h;
    }
    
    public static aejr l(final Context context) {
        synchronized (aejr.class) {
            if (aejr.e == null) {
                aejr.e = new aejr(context);
            }
            return aejr.e;
        }
    }
    
    public final void a() {
        qcj.s();
        final Object a = this.a;
        monitorenter(a);
        try {
            final Iterator<Object> iterator = ((Set<Object>)this.c).iterator();
            while (iterator.hasNext()) {
                iterator.next().run();
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void b() {
        final Object d = this.d;
        tlo tlo;
        tln tln;
        tlm c;
        do {
            tlo = (tlo)d;
            tln = tlo.a.get();
            final long[] copy = Arrays.copyOf(tln.a, 14);
            final long[] copy2 = Arrays.copyOf(tln.b, 14);
            for (int i = 0; i < this.b; ++i) {
                final int n = ((int[])this.a)[i];
                final long n2 = ((long[])this.c)[i];
                tlo.k(copy2, n, n2);
                if (tlp.f(n)) {
                    tlo.k(copy, n, n2);
                }
            }
            if (Arrays.equals(tln.b, copy2)) {
                break;
            }
            c = tln.c();
            c.n(copy, copy2);
            c.h(true);
        } while (!tlo.l(tln, c));
    }
    
    public final void c(final int n, final long n2) {
        final Object a = this.a;
        final int b = this.b;
        ((int[])a)[b] = n;
        final Object c = this.c;
        this.b = b + 1;
        ((long[])c)[b] = n2;
    }
    
    public final void d(final int n) {
        this.c(n, ((tlq)this.d).e(n) + 1L);
    }
    
    public final void e(final int n, final boolean b) {
        long n2;
        if (!b) {
            n2 = 0L;
        }
        else {
            n2 = 1L;
        }
        this.c(n, n2);
    }
    
    public final void f(final Context context, final anyf anyf) {
        final List s = kgk.s(anyf);
        if (s.isEmpty()) {
            return;
        }
        this.b = kgk.o(s);
        final Object c = this.c;
        c.getClass();
        ajsq ajsq;
        if ((ajsq = anyf.d) == null) {
            ajsq = ajsq.a;
        }
        ((TextView)c).setText((CharSequence)abyh.b(ajsq));
        final String q = kgk.q(context, s, this.b);
        final Object a = this.a;
        a.getClass();
        ((TextView)a).setText((CharSequence)q);
    }
    
    public final void g(final fvk fvk) {
        ((Set<fvk>)this.c).add(fvk);
    }
    
    public final int h() {
        synchronized (this.a) {
            return this.b;
        }
    }
    
    public final void i(final int b) {
        Object a = this.a;
        monitorenter(a);
        try {
            if (this.b == b) {
                monitorexit(a);
                return;
            }
            this.b = b;
            monitorexit(a);
            for (final WeakReference weakReference : (CopyOnWriteArrayList)this.d) {
                a = weakReference.get();
                if (a != null) {
                    ((qpt)a).X(b);
                }
                else {
                    ((CopyOnWriteArrayList)this.d).remove(weakReference);
                }
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void j() {
        if (yi.e("CameraStateRegistry")) {
            ((StringBuilder)this.a).setLength(0);
            ((StringBuilder)this.a).append("Recalculating open cameras:\n");
            ((StringBuilder)this.a).append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            ((StringBuilder)this.a).append("-------------------------------------------------------------------\n");
        }
        final Iterator<Map.Entry<Object, Object>> iterator = ((Map<Object, Object>)this.d).entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<K, cdn> entry = (Map.Entry<K, cdn>)iterator.next();
            if (yi.e("CameraStateRegistry")) {
                String string;
                if (entry.getValue().c != null) {
                    string = ((yq)entry.getValue().c).toString();
                }
                else {
                    string = "UNKNOWN";
                }
                ((StringBuilder)this.a).append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), string));
            }
            if (k((yq)entry.getValue().c)) {
                ++n;
            }
        }
        if (yi.e("CameraStateRegistry")) {
            ((StringBuilder)this.a).append("-------------------------------------------------------------------\n");
            ((StringBuilder)this.a).append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", n, 1));
        }
        this.b = Math.max(1 - n, 0);
    }
}
