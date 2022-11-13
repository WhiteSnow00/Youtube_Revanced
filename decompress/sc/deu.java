import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class deu extends WeakReference
{
    final ddk a;
    final boolean b;
    dfy c;
    
    public deu(final ddk a, final dfs dfs, final ReferenceQueue referenceQueue, final boolean b) {
        super(dfs, referenceQueue);
        clm.h((Object)a);
        this.a = a;
        final boolean a2 = dfs.a;
        dfy b2;
        final dfy dfy = b2 = null;
        if (a2) {
            b2 = dfy;
            if (b) {
                b2 = dfs.b;
                clm.h((Object)b2);
            }
        }
        this.c = b2;
        this.b = dfs.a;
    }
    
    final void a() {
        this.c = null;
        this.clear();
    }
}
