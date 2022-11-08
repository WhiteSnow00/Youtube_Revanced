import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

final class aesz implements aesx
{
    final AtomicReferenceFieldUpdater a;
    
    public aesz() {
        this.a = AtomicReferenceFieldUpdater.newUpdater(aetb.class, aesy.class, "currentMetadata");
    }
    
    public final aesy a(final aetb aetb) {
        return this.a.get(aetb);
    }
}
