// 
// Decompiled by Procyon v0.6.0
// 

final class ahef implements ahem
{
    public static final ahef a;
    private final int b;
    
    static {
        a = new ahef(1);
    }
    
    public ahef(final int b) {
        this.b = b;
    }
    
    public final ahel a(final Class clazz) {
        if (this.b != 0) {
            if (ahcz.class.isAssignableFrom(clazz)) {
                try {
                    return (ahel)ahcz.getDefaultInstance(clazz.asSubclass(ahcz.class)).buildMessageInfo();
                }
                catch (final Exception ex) {
                    throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(clazz.getName())), ex);
                }
            }
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(clazz.getName())));
        }
        throw new IllegalStateException("This should never be called.");
    }
    
    public final boolean b(final Class clazz) {
        return this.b != 0 && ahcz.class.isAssignableFrom(clazz);
    }
}
