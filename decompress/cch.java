import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public class cch extends cck
{
    public final Object j;
    Executor k;
    ccf l;
    Collection m;
    oqz n;
    
    public cch() {
        this.j = new Object();
    }
    
    public final void k(final ccf l, final Collection collection) {
        if (l != null) {
            synchronized (this.j) {
                final Executor k = this.k;
                if (k != null) {
                    k.execute((Runnable)new tv(this, this.n, l, collection, 13, (byte[])null, (byte[])null, (byte[])null));
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
