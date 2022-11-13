// 
// Decompiled by Procyon v0.6.0
// 

final class asfj extends asfh
{
    public asfj() {
    }
    
    @Override
    public final boolean a(final asfk asfk) {
        synchronized (asfk) {
            if (asfk.a == 0) {
                asfk.a = -1;
                return true;
            }
            return false;
        }
    }
    
    @Override
    public final void b(final asfk asfk) {
        synchronized (asfk) {
            asfk.a = 0;
        }
    }
}
