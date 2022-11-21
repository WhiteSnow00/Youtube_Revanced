import java.util.concurrent.ExecutionException;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Supplier;
import j$.util.stream.Collectors;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.util.Pair;
import java.util.Iterator;
import j$.time.Duration;
import j$.util.DateRetargetClass;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aagr implements aagv
{
    private final aagw a;
    private final aafz b;
    private final tkq c;
    private final oco d;
    private final tuf e;
    private final acjq f;
    private final abwe g;
    
    public aagr(final aagw a, final abwe g, final aafz b, final tkq c, final oco d, final tuf e, final acjq f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static final List c(final zxm zxm, final List list) {
        final ArrayList list2 = new ArrayList();
        for (final String s : list) {
            final aacq s2 = zxm.s(s);
            if (s2 == null) {
                tut.b("[Offline] No offlinePlaylistSnapshot found for ".concat(String.valueOf(s)));
            }
            else {
                final Pair p2 = zxm.p(s);
                int i = 0;
                String[] array;
                if (p2 == null) {
                    array = new String[0];
                }
                else {
                    final List list3 = (List)p2.second;
                    array = new String[list3.size()];
                    while (i < list3.size()) {
                        array[i] = ((aacx)list3.get(i)).f();
                        ++i;
                    }
                }
                list2.add(new aafn(s, DateRetargetClass.toInstant(s2.a.i).getEpochSecond(), array, Duration.ofMillis(s2.e).getSeconds()));
            }
        }
        return list2;
    }
    
    @Override
    public final int a(final String s, final aage aage, final boolean b) {
        monitorenter(this);
        try {
            tcl.k();
            if (this.b.l() && !this.c.r()) {
                monitorexit(this);
                return 1;
            }
            final zxm b2 = aage.B();
            if (b2 == null) {
                monitorexit(this);
                return 0;
            }
            final List c = c(b2, (List)Collection$_EL.stream((Collection)b2.h()).map((Function)zzl.k).collect(Collectors.toCollection((Supplier)iid.t)));
            if (c.isEmpty()) {
                monitorexit(this);
                return 0;
            }
            try {
                final akxm b3 = this.b(b2, c, true);
                final aagd i = aage.i();
                final ArrayList list = new ArrayList();
                final HashMap hashMap = new HashMap();
                final HashMap hashMap2 = new HashMap();
                final long t = this.f.t();
                final long d = b3.d;
                final Iterator iterator = c.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final aafn aafn = (aafn)iterator.next();
                    final akxk o = aamn.o(b3, aafn.a);
                    int max = n;
                    boolean b4 = false;
                    Label_0270: {
                        if (o != null) {
                            max = Math.max(n, o.d);
                            if (o.c || !o.f) {
                                b4 = false;
                                break Label_0270;
                            }
                        }
                        b4 = true;
                    }
                    if (b) {
                        String.format("[Offline] Force syncing playlist: %s", aafn.a);
                        list.add(aafn.a);
                        hashMap.put(aafn.a, Integer.MAX_VALUE);
                        hashMap2.put(aafn.a, 0);
                        n = max;
                    }
                    else {
                        n = max;
                        if (!b4) {
                            continue;
                        }
                        list.add(aafn.a);
                        hashMap.put(aafn.a, Integer.MAX_VALUE);
                        final String a = aafn.a;
                        int n2;
                        if (o != null && o.e) {
                            n2 = 0;
                        }
                        else {
                            n2 = 1;
                        }
                        hashMap2.put(a, n2);
                        n = max;
                    }
                }
                if (!list.isEmpty()) {
                    i.D(list, hashMap, hashMap2, 1, t - d);
                }
                if (n > 0) {
                    this.a.c(s, n);
                }
                else {
                    this.a.d();
                }
                monitorexit(this);
                return 0;
            }
            catch (final ExecutionException ex) {
                tut.d("[Offline] PlaylistSyncCheckRequest failed", (Throwable)ex);
                monitorexit(this);
                return 1;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final akxm b(final zxm zxm, final List list, final boolean b) {
        final Iterator iterator = zxm.x().iterator();
        int n = Integer.MAX_VALUE;
        while (iterator.hasNext()) {
            final int n2 = (int)Duration.ofMillis(this.d.c() - ((aadc)iterator.next()).g).getSeconds();
            if (n2 >= 0 && n2 < n) {
                n = n2;
            }
        }
        return this.g.I(this.f.s(), this.f.v(), n, this.e.a(), list, b);
    }
}
