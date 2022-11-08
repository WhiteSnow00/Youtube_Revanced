import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import android.content.Intent;
import android.util.Log;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;
import androidx.work.impl.WorkDatabase;
import android.content.Context;
import android.os.PowerManager$WakeLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cns implements cng, cqc
{
    public static final String a;
    public PowerManager$WakeLock b;
    public final Context c;
    public final WorkDatabase d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Set h;
    public final Object i;
    private final cmc j;
    private final List k;
    private final List l;
    private final aja m;
    
    static {
        a = cmr.b("Processor");
    }
    
    public cns(final Context c, final cmc j, final aja m, final WorkDatabase d, final List k, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.j = j;
        this.m = m;
        this.d = d;
        this.f = new HashMap();
        this.e = new HashMap();
        this.k = k;
        this.h = new HashSet();
        this.l = new ArrayList();
        this.b = null;
        this.i = new Object();
        this.g = new HashMap();
    }
    
    public static void f(final coi coi) {
        if (coi != null) {
            coi.e = true;
            coi.d();
            coi.g.cancel(true);
            if (coi.d != null && coi.g.isCancelled()) {
                coi.d.i();
            }
            else {
                new StringBuilder("WorkSpec ").append(coi.c);
                cmr.a();
            }
            cmr.a();
            return;
        }
        cmr.a();
    }
    
    private final void h(final cqv cqv) {
        ((Executor)this.m.a).execute(new bhc(this, cqv, 19));
    }
    
    public final void a(final cqv cqv, final boolean b) {
        final Object i = this.i;
        monitorenter(i);
        try {
            final coi coi = this.f.get(cqv.a);
            if (coi != null && cqv.equals((Object)coi.a())) {
                this.f.remove(cqv.a);
            }
            cmr.a();
            this.getClass().getSimpleName();
            final Iterator iterator = this.l.iterator();
            while (iterator.hasNext()) {
                ((cng)iterator.next()).a(cqv, b);
            }
            monitorexit(i);
        }
        finally {
            monitorexit(i);
            while (true) {}
        }
    }
    
    public final void b(final cng cng) {
        synchronized (this.i) {
            this.l.add(cng);
        }
    }
    
    public final void c(final cng cng) {
        synchronized (this.i) {
            this.l.remove(cng);
        }
    }
    
    public final void d() {
        synchronized (this.i) {
            if (this.e.isEmpty()) {
                final Intent d = cqe.d(this.c);
                try {
                    this.c.startService(d);
                }
                finally {
                    cmr.a();
                    final Throwable t;
                    Log.e(cns.a, "Unable to stop foreground service", t);
                }
                final PowerManager$WakeLock b = this.b;
                if (b != null) {
                    b.release();
                    this.b = null;
                }
            }
        }
    }
    
    public final boolean e(final String s) {
        synchronized (this.i) {
            final boolean containsKey = this.f.containsKey(s);
            boolean b = true;
            if (!containsKey) {
                b = (this.e.containsKey(s) && b);
            }
            return b;
        }
    }
    
    public final boolean g(final avt avt) {
        final Object a = avt.a;
        final cqv cqv = (cqv)a;
        final String a2 = cqv.a;
        final ArrayList list = new ArrayList();
        final crg crg = (crg)this.d.d((Callable)new czz(this, list, a2, 1));
        if (crg == null) {
            cmr.a();
            final String a3 = cns.a;
            new StringBuilder("Didn't find WorkSpec for id ").append(a);
            Log.w(a3, "Didn't find WorkSpec for id ".concat(a.toString()));
            this.h(cqv);
            return false;
        }
        final Object i = this.i;
        monitorenter(i);
        coh coh;
        Context c;
        cmc j;
        aja m;
        WorkDatabase d;
        Object o;
        try {
            if (this.e(a2)) {
                final Set set = this.g.get(a2);
                if (((cqv)((avt)set.iterator().next()).a).b == ((cqv)a).b) {
                    set.add(avt);
                    cmr.a();
                    new StringBuilder("Work ").append(a);
                }
                else {
                    this.h((cqv)a);
                }
                monitorexit(i);
                return false;
            }
            if (crg.s != ((cqv)a).b) {
                this.h((cqv)a);
                monitorexit(i);
                return false;
            }
            coh = new(coh.class)();
            c = this.c;
            j = this.j;
            m = this.m;
            d = this.d;
            o = i;
            final coh coh2 = coh;
            final Context context = c;
            final cmc cmc = j;
            final aja aja = m;
            final cns cns = this;
            final WorkDatabase workDatabase = d;
            final crg crg2 = crg;
            final ArrayList list2 = list;
            final byte[] array = null;
            final byte[] array2 = null;
            final byte[] array3 = null;
            new coh(context, cmc, aja, (cqc)cns, workDatabase, crg2, (List)list2, array, array2, array3);
            o = i;
            final coh coh3 = coh;
            final cns cns2 = this;
            final List list3 = cns2.k;
            coh3.f = list3;
            o = i;
            final coi coi = new(coi.class)();
            final coi coi2 = coi;
            o = i;
            final coi coi3 = coi2;
            final coh coh4 = coh;
            new coi(coh4);
            o = i;
            final coi coi4 = coi2;
            final ctj ctj = coi4.f;
            o = i;
            final cnr cnr = new(cnr.class)();
            final cnr cnr2 = cnr;
            o = i;
            final cnr cnr3 = cnr2;
            final cns cns3 = this;
            final avt avt2 = avt;
            final Object o2 = avt2.a;
            final cqv cqv2 = (cqv)o2;
            final Object o3 = ctj;
            final int n = 0;
            new cnr((cng)cns3, cqv2, (ListenableFuture)o3, n);
            o = i;
            final Object o4 = ctj;
            final cnr cnr4 = cnr2;
            final cns cns4 = this;
            final aja aja2 = cns4.m;
            final Object o5 = aja2.a;
            ((ListenableFuture)o4).addListener((Runnable)cnr4, (Executor)o5);
            o = i;
            final cns cns5 = this;
            final Map map = cns5.f;
            final String s = a2;
            final coi coi5 = coi2;
            map.put(s, coi5);
            o = i;
            final HashSet set2 = new(java.util.HashSet.class)();
            final HashSet set3 = set2;
            o = i;
            final HashSet set4 = set3;
            new HashSet();
            o = i;
            final HashSet set5 = set3;
            final avt avt3 = avt;
            set5.add(avt3);
            o = i;
            final cns cns6 = this;
            final Map map2 = cns6.g;
            final String s2 = a2;
            final HashSet set6 = set3;
            map2.put(s2, set6);
            o = i;
            final Object o6 = i;
            monitorexit(o6);
            final cns cns7 = this;
            final aja aja3 = cns7.m;
            final Object o7 = aja3.c;
            final csn csn = (csn)o7;
            final coi coi6 = coi2;
            csn.execute((Runnable)coi6);
            cmr.a();
            final StringBuilder sb = new StringBuilder();
            final StringBuilder sb3;
            final StringBuilder sb2 = sb3 = sb;
            final cns cns8 = this;
            final Class<? extends cns> clazz = cns8.getClass();
            final String s3 = clazz.getSimpleName();
            sb3.append(s3);
            final StringBuilder sb4 = sb2;
            final String s4 = ": processing ";
            sb4.append(s4);
            final StringBuilder sb5 = sb2;
            final cqv cqv3 = (cqv)a;
            sb5.append(cqv3);
            return true;
        }
        finally {
            final Object o8;
            o = o8;
            final Object o9 = i;
            final Object o10 = o;
        }
        while (true) {
            try {
                final coh coh2 = coh;
                final Context context = c;
                final cmc cmc = j;
                final aja aja = m;
                final cns cns = this;
                final WorkDatabase workDatabase = d;
                final crg crg2 = crg;
                final ArrayList list2 = list;
                final byte[] array = null;
                final byte[] array2 = null;
                final byte[] array3 = null;
                new coh(context, cmc, aja, (cqc)cns, workDatabase, crg2, (List)list2, array, array2, array3);
                o = i;
                final coh coh3 = coh;
                final cns cns2 = this;
                final List list3 = cns2.k;
                coh3.f = list3;
                o = i;
                final coi coi = new(coi.class)();
                final coi coi2 = coi;
                o = i;
                final coi coi3 = coi2;
                final coh coh4 = coh;
                new coi(coh4);
                o = i;
                final coi coi4 = coi2;
                final ctj ctj = coi4.f;
                o = i;
                final cnr cnr = new(cnr.class)();
                final cnr cnr2 = cnr;
                o = i;
                final cnr cnr3 = cnr2;
                final cns cns3 = this;
                final avt avt2 = avt;
                final Object o2 = avt2.a;
                final cqv cqv2 = (cqv)o2;
                final Object o3 = ctj;
                final int n = 0;
                new cnr((cng)cns3, cqv2, (ListenableFuture)o3, n);
                o = i;
                final Object o4 = ctj;
                final cnr cnr4 = cnr2;
                final cns cns4 = this;
                final aja aja2 = cns4.m;
                final Object o5 = aja2.a;
                ((ListenableFuture)o4).addListener((Runnable)cnr4, (Executor)o5);
                o = i;
                final cns cns5 = this;
                final Map map = cns5.f;
                final String s = a2;
                final coi coi5 = coi2;
                map.put(s, coi5);
                o = i;
                final HashSet set2 = new(java.util.HashSet.class)();
                final HashSet set3 = set2;
                o = i;
                final HashSet set4 = set3;
                new HashSet();
                o = i;
                final HashSet set5 = set3;
                final avt avt3 = avt;
                set5.add(avt3);
                o = i;
                final cns cns6 = this;
                final Map map2 = cns6.g;
                final String s2 = a2;
                final HashSet set6 = set3;
                map2.put(s2, set6);
                o = i;
                final Object o6 = i;
                monitorexit(o6);
                final cns cns7 = this;
                final aja aja3 = cns7.m;
                final Object o7 = aja3.c;
                final csn csn = (csn)o7;
                final coi coi6 = coi2;
                csn.execute((Runnable)coi6);
                cmr.a();
                final StringBuilder sb = new StringBuilder();
                final StringBuilder sb3;
                final StringBuilder sb2 = sb3 = sb;
                final cns cns8 = this;
                final Class<? extends cns> clazz = cns8.getClass();
                final String s3 = clazz.getSimpleName();
                sb3.append(s3);
                final StringBuilder sb4 = sb2;
                final String s4 = ": processing ";
                sb4.append(s4);
                final StringBuilder sb5 = sb2;
                final cqv cqv3 = (cqv)a;
                sb5.append(cqv3);
                return true;
                final Object o9;
                o = o9;
                monitorexit(o9);
                throw;
            }
            finally {
                final Object o9 = o;
                continue;
            }
            break;
        }
    }
}
