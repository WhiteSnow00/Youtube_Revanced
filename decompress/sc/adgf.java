import java.util.Iterator;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.ArrayList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Semaphore;
import java.util.Set;
import java.util.List;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgf implements adgg
{
    public final Executor a;
    public final oby b;
    public final List c;
    public Set d;
    public final Semaphore e;
    public String f;
    public final adfq g;
    
    public adgf(final adfq g, final Executor a, final oby b, final List c, final int n, final byte[] array, final byte[] array2) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = Collections.emptySet();
        Semaphore e;
        if (n > 0) {
            e = new Semaphore(n, true);
        }
        else {
            e = null;
        }
        this.e = e;
    }
    
    public static void f(final Throwable t) {
        ttr.d("fetchZeroPrefixBackground Error:", t);
    }
    
    private final ListenableFuture g(final String s) {
        final ArrayList list = new ArrayList();
        final afkf d = ((afeq)this.c).D();
        while (((Iterator)d).hasNext()) {
            list.add(((adfx)((Iterator)d).next()).a(s));
        }
        return afwm.K((Iterable)list).j(aeun.i((Callable)new zup(list, 11)), this.a);
    }
    
    public final ListenableFuture a(final String s, final aezp aezp) {
        return aftq.f(this.g(s), (aftz)new adgd(this, s, aezp), this.a);
    }
    
    public final ListenableFuture b() {
        return this.g("");
    }
    
    public final ListenableFuture c() {
        return this.e("", false, (aezp)aeyo.a);
    }
    
    public final void d() {
        teu.m(this.e("", true, (aezp)aeyo.a), (tes)adaz.c);
    }
    
    final ListenableFuture e(final String a, final boolean c, final aezp aezp) {
        final adfq g = this.g;
        final vvh vvh = new vvh(g.c, ((zmf)g.e).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        vvh.a = a;
        vvh.c = c;
        vvh.b = this.f;
        if (aezp.h()) {
            final acqb acqb = (acqb)aezp.c();
            if (((Optional)acqb.a).isPresent()) {
                int intValue;
                if (!((Optional)acqb.a).isPresent()) {
                    intValue = -1;
                }
                else {
                    intValue = (int)((Optional)acqb.a).get();
                }
                vvh.f = intValue;
            }
        }
        if (!c) {
            ((vkk)vvh).v = tlu.d;
        }
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((adgh)iterator.next()).a(vvh);
        }
        return afwm.r(aeun.c((afty)new jlw(this, vvh, a, 11)), this.a);
    }
}
