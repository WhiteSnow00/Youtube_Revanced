import java.lang.ref.Reference;
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

public final class aels
{
    private static aels e;
    public final Object a;
    public int b;
    public final Object c;
    public final Object d;
    
    public aels() {
        this.a = new Object();
        this.c = new HashSet();
        this.d = new nhj(this, 2);
    }
    
    public aels(final int n, final tnu d) {
        this.d = d;
        this.a = new int[n];
        this.c = new long[n];
    }
    
    private aels(final Context context) {
        this.c = new Handler(Looper.getMainLooper());
        this.d = new CopyOnWriteArrayList();
        this.a = new Object();
        this.b = 0;
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        bax.B(context, (BroadcastReceiver)new bar(this, (byte[])null, (byte[])null), intentFilter);
    }
    
    public aels(final Context context, final ViewStub viewStub, final aoai aoai) {
        final List q = jzg.q(aoai);
        final View inflate = viewStub.inflate();
        this.a = inflate.findViewById(2131428644);
        this.c = inflate.findViewById(2131432095);
        this.d = new HashSet();
        if (q.isEmpty()) {
            return;
        }
        this.b = jzg.m(q);
        this.f(context, aoai);
        inflate.setOnClickListener((View$OnClickListener)new ezp(this, context, aoai, q, 6, (byte[])null, (byte[])null));
    }
    
    public aels(final lux c, final luz d, final ltz a) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public aels(final msr d, final elx a, final byte[] array, final byte[] array2) {
        this.d = d;
        this.a = a;
        this.c = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public aels(final vcy d, final hqv a, final aeea c, final byte[] array, final byte[] array2) {
        this.b = 0;
        d.getClass();
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public aels(final byte[] array) {
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
    
    public static aels l(final Context context) {
        synchronized (aels.class) {
            if (aels.e == null) {
                aels.e = new aels(context);
            }
            return aels.e;
        }
    }
    
    public final void a() {
        qdt.h();
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
        tns tns;
        tnr tnr;
        tnq c;
        do {
            tns = (tns)d;
            tnr = tns.a.get();
            final long[] copy = Arrays.copyOf(tnr.a, 14);
            final long[] copy2 = Arrays.copyOf(tnr.b, 14);
            for (int i = 0; i < this.b; ++i) {
                final int n = ((int[])this.a)[i];
                final long n2 = ((long[])this.c)[i];
                tns.k(copy2, n, n2);
                if (tnt.f(n)) {
                    tns.k(copy, n, n2);
                }
            }
            if (Arrays.equals(tnr.b, copy2)) {
                break;
            }
            c = tnr.c();
            c.n(copy, copy2);
            c.h(true);
        } while (!tns.l(tnr, c));
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
        this.c(n, ((tnu)this.d).e(n) + 1L);
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
    
    public final void f(final Context context, final aoai aoai) {
        final List q = jzg.q(aoai);
        if (q.isEmpty()) {
            return;
        }
        this.b = jzg.m(q);
        final Object c = this.c;
        c.getClass();
        ajut ajut;
        if ((ajut = aoai.d) == null) {
            ajut = ajut.a;
        }
        ((TextView)c).setText((CharSequence)acak.b(ajut));
        final String o = jzg.o(context, q, this.b);
        final Object a = this.a;
        a.getClass();
        ((TextView)a).setText((CharSequence)o);
    }
    
    public final void g(final fvs fvs) {
        ((Set<fvs>)this.c).add(fvs);
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
            final Iterator iterator = ((CopyOnWriteArrayList)this.d).iterator();
            while (iterator.hasNext()) {
                a = iterator.next();
                final pvh pvh = (pvh)((Reference)a).get();
                if (pvh != null) {
                    pvh.X(b);
                }
                else {
                    ((CopyOnWriteArrayList)this.d).remove(a);
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
            final Map.Entry<K, cdo> entry = (Map.Entry<K, cdo>)iterator.next();
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
