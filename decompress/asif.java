// 
// Decompiled by Procyon v0.6.0
// 

final class asif extends asid
{
    public asif() {
    }
    
    public final boolean a(final asig asig) {
        synchronized (asig) {
            if (asig.a == 0) {
                asig.a = -1;
                return true;
            }
            return false;
        }
    }
    
    public final void b(final asig asig) {
        synchronized (asig) {
            asig.a = 0;
        }
    }
}
