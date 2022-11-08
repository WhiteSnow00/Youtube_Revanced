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

public final class aacx implements aadc
{
    private final aadd a;
    private final aacf b;
    private final thh c;
    private final oas d;
    private final tqy e;
    private final aamd f;
    private final acga g;
    
    public aacx(final aadd a, final aamd f, final aacf b, final thh c, final oas d, final tqy e, final acga g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
    }
    
    public static final List c(final ztu ztu, final List list) {
        final ArrayList list2 = new ArrayList();
        for (final String s : list) {
            final zyz s2 = ztu.s(s);
            if (s2 == null) {
                trn.b("[Offline] No offlinePlaylistSnapshot found for ".concat(String.valueOf(s)));
            }
            else {
                final Pair p2 = ztu.p(s);
                int i = 0;
                String[] array;
                if (p2 == null) {
                    array = new String[0];
                }
                else {
                    final List list3 = (List)p2.second;
                    array = new String[list3.size()];
                    while (i < list3.size()) {
                        array[i] = ((zzg)list3.get(i)).f();
                        ++i;
                    }
                }
                list2.add(new aabu(s, DateRetargetClass.toInstant(s2.a.i).getEpochSecond(), array, Duration.ofMillis(s2.e).getSeconds()));
            }
        }
        return list2;
    }
    
    public final int a(final String s, final aack aack, final boolean b) {
        monitorenter(this);
        try {
            szc.e();
            if (this.b.l() && !this.c.r()) {
                monitorexit(this);
                return 1;
            }
            final ztu b2 = aack.B();
            if (b2 == null) {
                monitorexit(this);
                return 0;
            }
            final List c = c(b2, (List)Collection$_EL.stream((Collection)b2.h()).map((Function)zxk.h).collect(Collectors.toCollection((Supplier)igx.s)));
            if (c.isEmpty()) {
                monitorexit(this);
                return 0;
            }
            try {
                final aktj b3 = this.b(b2, c, true);
                final aacj i = aack.i();
                final ArrayList list = new ArrayList();
                final HashMap hashMap = new HashMap();
                final HashMap hashMap2 = new HashMap();
                final long s2 = this.g.s();
                final long d = b3.d;
                final Iterator iterator = c.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final aabu aabu = (aabu)iterator.next();
                    final akth o = aaiw.o(b3, aabu.a);
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
                        String.format("[Offline] Force syncing playlist: %s", aabu.a);
                        list.add(aabu.a);
                        hashMap.put(aabu.a, Integer.MAX_VALUE);
                        hashMap2.put(aabu.a, 0);
                        n = max;
                    }
                    else {
                        n = max;
                        if (!b4) {
                            continue;
                        }
                        list.add(aabu.a);
                        hashMap.put(aabu.a, Integer.MAX_VALUE);
                        final String a = aabu.a;
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
                    i.D((List)list, (Map)hashMap, (Map)hashMap2, 1, s2 - d);
                }
                if (n > 0) {
                    this.a.c(s, (long)n);
                }
                else {
                    this.a.d();
                }
                monitorexit(this);
                return 0;
            }
            catch (final ExecutionException ex) {
                trn.d("[Offline] PlaylistSyncCheckRequest failed", (Throwable)ex);
                monitorexit(this);
                return 1;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final aktj b(final ztu ztu, final List list, final boolean b) {
        final Iterator iterator = ztu.x().iterator();
        int n = Integer.MAX_VALUE;
        while (iterator.hasNext()) {
            final int n2 = (int)Duration.ofMillis(this.d.c() - ((zzl)iterator.next()).g).getSeconds();
            if (n2 >= 0 && n2 < n) {
                n = n2;
            }
        }
        return this.f.D(this.g.r(), this.g.u(), n, this.e.a(), list, b);
    }
}
