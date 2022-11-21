import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aues extends WeakReference
{
    final long a;
    
    public aues(final auet auet) {
        super(auet, auet.a);
        this.a = auet.d;
    }
}
