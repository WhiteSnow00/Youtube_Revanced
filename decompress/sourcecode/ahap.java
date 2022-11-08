// 
// Decompiled by Procyon v0.6.0
// 

final class ahap implements ahav
{
    private final ahav[] a;
    
    public ahap(final ahav... a) {
        this.a = a;
    }
    
    public final ahau a(final Class clazz) {
        final ahav[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            final ahav ahav = a[i];
            if (ahav.b(clazz)) {
                return ahav.a(clazz);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(clazz.getName())));
    }
    
    public final boolean b(final Class clazz) {
        final ahav[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            if (a[i].b(clazz)) {
                return true;
            }
        }
        return false;
    }
}
