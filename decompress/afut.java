import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afut
{
    public static boolean a(final AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, final Object o, final Object o2, final Object o3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(o, o2, o3)) {
            if (atomicReferenceFieldUpdater.get(o) != o2) {
                return false;
            }
        }
        return true;
    }
}
