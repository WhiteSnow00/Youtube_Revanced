// 
// Decompiled by Procyon v0.6.0
// 

final class ahao implements ahav
{
    public static final ahao a;
    private final /* synthetic */ int b;
    
    static {
        a = new ahao(1);
    }
    
    public ahao(final int b) {
        this.b = b;
    }
    
    public final ahau a(final Class clazz) {
        if (this.b != 0) {
            if (agzi.class.isAssignableFrom(clazz)) {
                try {
                    return (ahau)agzi.getDefaultInstance(clazz.asSubclass(agzi.class)).buildMessageInfo();
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
        return this.b != 0 && agzi.class.isAssignableFrom(clazz);
    }
}
