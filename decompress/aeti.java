import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Map;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeti implements afvq
{
    public final ahei a;
    
    public aeti(final ahei a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    @Override
    public final ListenableFuture a(final Object o) {
        final ahei a = this.a;
        final Map map = (Map)o;
        ListenableFuture listenableFuture;
        if (map.isEmpty()) {
            listenableFuture = afxr.l(null);
        }
        else {
            final ArrayList list = new ArrayList();
            final Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                final aetd aetd = ((Map.Entry<K, aetd>)iterator.next()).getValue();
                final Object a2 = a.a;
                final aeom aeom = new aeom((byte[])null);
                aeom.a = aetj.class;
                aeom.b = cmi.a;
                aeom.c = aeon.a(0L, TimeUnit.SECONDS);
                aeom.b((Set)afkg.a);
                aeom.d = ckp.a(new HashMap());
                final Set a3 = aetd.a;
                final StringBuilder sb = new StringBuilder("SyncTask");
                final Iterator iterator2 = new TreeSet(a3).iterator();
                while (iterator2.hasNext()) {
                    sb.append(((aesl)iterator2.next()).d);
                    sb.append('_');
                }
                aeom.e = afbh.k(new aeoo(sb.toString()));
                aeom.c = aeon.a(Math.max(0L, aetd.b - ((oco)a.c).c()), TimeUnit.MILLISECONDS);
                final Iterator iterator3 = aetd.a.iterator();
                int n = 0;
                boolean b = false;
                boolean b2 = false;
                int n2;
                while (true) {
                    final boolean hasNext = iterator3.hasNext();
                    n2 = 1;
                    final int n3 = 1;
                    if (!hasNext) {
                        break;
                    }
                    final aesl aesl = (aesl)iterator3.next();
                    b2 |= (aesl == aesl.a);
                    final boolean b3 = b | aesl == aesl.c;
                    int n4;
                    if (aesl == aesl.b) {
                        n4 = n3;
                    }
                    else {
                        n4 = 0;
                    }
                    n |= n4;
                    b = b3;
                }
                final LinkedHashSet set = new LinkedHashSet();
                int n5;
                if (n != 0) {
                    n5 = 3;
                }
                else {
                    n5 = n2;
                    if (b) {
                        n5 = 2;
                    }
                }
                aeom.b = ckd.d(b2, set, n5);
                list.add(((aeoj)a2).a(aeom.a()));
            }
            listenableFuture = afxr.N(list).j((Callable)vcs.i, (Executor)afwd.a);
        }
        return listenableFuture;
    }
}
