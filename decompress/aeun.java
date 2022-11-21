import java.lang.ref.ReferenceQueue;
import java.lang.ref.PhantomReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeun extends PhantomReference
{
    public final aeum a;
    
    public aeun(final Object o, final ReferenceQueue referenceQueue) {
        super(o, referenceQueue);
        this.a = new aeum(this);
    }
}
