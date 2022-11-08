import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aube extends WeakReference
{
    final long a;
    
    public aube(final aubf aubf) {
        super(aubf, aubf.a);
        this.a = aubf.d;
    }
}
