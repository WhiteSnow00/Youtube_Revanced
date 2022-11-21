// 
// Decompiled by Procyon v0.6.0
// 

public final class atrg
{
    public static final int a = 0;
    
    static {
        try {
            final auig auig = (auig)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        }
        catch (final ClassCastException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {}
    }
    
    public static String a(final atqw atqw) {
        return auig.b(atqw);
    }
    
    public static atrt b(final Class clazz) {
        return (atrt)new atqt(clazz);
    }
}
