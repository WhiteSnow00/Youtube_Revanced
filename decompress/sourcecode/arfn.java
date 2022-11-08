// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arfn
{
    public static arfn d(final Class clazz) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return (arfn)new arfi(clazz.getSimpleName());
        }
        return (arfn)new arfk(clazz.getSimpleName());
    }
    
    public abstract void a(final String p0);
    
    public abstract void b(final String p0);
    
    public abstract void c(final String p0);
}
