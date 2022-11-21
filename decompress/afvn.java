import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class afvn extends afvl
{
    public afvn() {
    }
    
    @Override
    public final int a(final afvo afvo) {
        synchronized (afvo) {
            return --afvo.remaining;
        }
    }
    
    @Override
    public final void b(final afvo afvo, final Set seenExceptions) {
        synchronized (afvo) {
            if (afvo.seenExceptions == null) {
                afvo.seenExceptions = seenExceptions;
            }
        }
    }
}
