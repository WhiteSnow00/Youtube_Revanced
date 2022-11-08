import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class afrv extends afrt
{
    public afrv() {
    }
    
    public final int a(final afrw afrw) {
        synchronized (afrw) {
            return --afrw.remaining;
        }
    }
    
    public final void b(final afrw afrw, final Set seenExceptions) {
        synchronized (afrw) {
            if (afrw.seenExceptions == null) {
                afrw.seenExceptions = seenExceptions;
            }
        }
    }
}
