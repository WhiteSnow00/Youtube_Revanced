// 
// Decompiled by Procyon v0.6.0
// 

public final class atno
{
    static {
        try {
            final atnd atnd = (atnd)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        }
        catch (final ClassCastException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {}
    }
    
    public static String a(final atne atne) {
        return atnd.a(atne);
    }
    
    public static atob b(final Class clazz) {
        return (atob)new atnb(clazz);
    }
}
