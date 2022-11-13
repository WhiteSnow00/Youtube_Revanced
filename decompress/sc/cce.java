import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public class cce extends cch
{
    public final Object j;
    Executor k;
    ccc l;
    Collection m;
    pvh n;
    
    public cce() {
        this.j = new Object();
    }
    
    public final void k(final ccc l, final Collection collection) {
        if (l != null) {
            synchronized (this.j) {
                final Executor k = this.k;
                if (k != null) {
                    k.execute((Runnable)new tu(this, this.n, l, collection, 13, (byte[])null, (byte[])null, (byte[])null));
                }
                else {
                    this.l = l;
                    this.m = new ArrayList(collection);
                }
                return;
            }
        }
        throw new NullPointerException("groupRoute must not be null");
    }
}
