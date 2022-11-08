// 
// Decompiled by Procyon v0.6.0
// 

final class ahbc
{
    public static final ahbz a;
    public static final ahbz b;
    
    static {
        ahbz a2;
        try {
            a2 = (ahbz)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            a2 = null;
        }
        a = a2;
        b = new ahbz();
    }
}
