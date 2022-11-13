import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aubv extends WeakReference
{
    final long a;
    
    public aubv(final aubw aubw) {
        super(aubw, aubw.a);
        this.a = aubw.d;
    }
}
