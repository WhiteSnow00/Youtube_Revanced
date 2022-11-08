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

public final class aded implements adee
{
    public final Executor a;
    public final oas b;
    public final List c;
    public Set d;
    public final Semaphore e;
    public String f;
    public final addp g;
    
    public aded(final addp g, final Executor a, final oas b, final List c, final int n, final byte[] array, final byte[] array2) {
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
    
    private final ListenableFuture g(final String s) {
        final ArrayList list = new ArrayList();
        final afif d = ((afcr)this.c).D();
        while (((Iterator)d).hasNext()) {
            list.add(((addw)((Iterator)d).next()).a(s));
        }
        return afva.D(list).j(aesm.i((Callable)new adbx(list, 3)), this.a);
    }
    
    public final ListenableFuture a(final String s, final aexq aexq) {
        return afrp.f(this.g(s), (afry)new adeb(this, s, aexq), this.a);
    }
    
    public final ListenableFuture b() {
        return this.g("");
    }
    
    public final ListenableFuture c() {
        return this.e("", false, aewp.a);
    }
    
    public final void d() {
        tcp.m(this.e("", true, aewp.a), (tcn)acyw.c);
    }
    
    final ListenableFuture e(final String a, final boolean c, final aexq aexq) {
        final addp g = this.g;
        final vtg vtg = new vtg(g.c, ((zki)g.e).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        vtg.a = a;
        vtg.c = c;
        vtg.b = this.f;
        if (aexq.h()) {
            final acnx acnx = (acnx)aexq.c();
            if (((Optional)acnx.a).isPresent()) {
                int intValue;
                if (!((Optional)acnx.a).isPresent()) {
                    intValue = -1;
                }
                else {
                    intValue = (int)((Optional)acnx.a).get();
                }
                vtg.f = intValue;
            }
        }
        if (!c) {
            ((vii)vtg).v = tjq.d;
        }
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((adef)iterator.next()).a(vtg);
        }
        return afva.r(aesm.c((afrx)new jkv(this, vtg, a, 10)), this.a);
    }
}
