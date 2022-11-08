// 
// Decompiled by Procyon v0.6.0
// 

final class agyt
{
    public static final ahbz a;
    private static final ahbz b;
    
    static {
        a = new ahbz();
        ahbz b2;
        try {
            b2 = (ahbz)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            b2 = null;
        }
        b = b2;
    }
    
    static ahbz a() {
        final ahbz b = agyt.b;
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
