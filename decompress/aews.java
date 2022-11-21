import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

final class aews implements aewq
{
    final AtomicReferenceFieldUpdater a;
    
    public aews() {
        this.a = AtomicReferenceFieldUpdater.newUpdater(aewu.class, aewr.class, "currentMetadata");
    }
    
    @Override
    public final aewr a(final aewu aewu) {
        return this.a.get(aewu);
    }
}
