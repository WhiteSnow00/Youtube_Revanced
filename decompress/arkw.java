// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arkw
{
    public static arkw d(final Class clazz) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new arkr(clazz.getSimpleName());
        }
        return new arkt(clazz.getSimpleName());
    }
    
    public abstract void a(final String p0);
    
    public abstract void b(final String p0);
    
    public abstract void c(final String p0);
}
