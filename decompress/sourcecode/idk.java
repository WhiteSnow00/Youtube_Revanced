import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.function.Function;
import j$.util.Collection$_EL;
import java.util.Set;
import java.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idk extends icx
{
    public final Map a;
    private final Executor b;
    
    public idk(final Executor b) {
        this.a = (Map)new ConcurrentHashMap();
        this.b = b;
    }
    
    public static afdu k(final zyz zyz) {
        return l(zyz.a.a, (Set)afdu.p((Collection)zyz.b));
    }
    
    public static afdu l(final String s, final Set set) {
        return (afdu)Collection$_EL.stream((Collection)set).map((Function)new hqf(s, 7)).collect(afaj.b);
    }
    
    public static void m(final vdv vdv, final String s, final Set set) {
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            vdv.g(gkt.bk(s, (String)iterator.next()));
        }
    }
    
    public final ListenableFuture a(final vdv vdv, final zyz zyz) {
        return afld.k((Callable)new czz(this, vdv, zyz, 9), this.b);
    }
    
    public final ListenableFuture b(final vdv vdv, final String s) {
        return afld.k((Callable)new czz(this, s, vdv, 8), this.b);
    }
    
    public final ListenableFuture c(final vdv vdv, final zyz zyz) {
        return afld.k((Callable)new fol(this, vdv, zyz, zyz.a.a, 3), this.b);
    }
    
    public final ListenableFuture d(final vdv vdv, final zyz zyz) {
        return afld.k((Callable)new fol(this, vdv, zyz, zyz.a.a, 2), this.b);
    }
    
    public final ListenableFuture f(final aack aack) {
        return (ListenableFuture)aete.f(aack.i().k()).g((aexg)new hwh(this, 6), this.b);
    }
}
