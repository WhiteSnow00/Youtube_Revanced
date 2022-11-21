// 
// Decompiled by Procyon v0.6.0
// 

final class aheg implements ahem
{
    private final ahem[] a;
    
    public aheg(final ahem... a) {
        this.a = a;
    }
    
    public final ahel a(final Class clazz) {
        final ahem[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            final ahem ahem = a[i];
            if (ahem.b(clazz)) {
                return ahem.a(clazz);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(clazz.getName())));
    }
    
    public final boolean b(final Class clazz) {
        final ahem[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            if (a[i].b(clazz)) {
                return true;
            }
        }
        return false;
    }
}
