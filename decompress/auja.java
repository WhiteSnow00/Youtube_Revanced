// 
// Decompiled by Procyon v0.6.0
// 

public final class auja implements aujd
{
    public final auje a;
    
    private auja(final auje a) {
        this.a = a;
    }
    
    public static aujd b(final auje auje) {
        if (auje instanceof auje) {
            return (aujd)auje;
        }
        if (auje == null) {
            return null;
        }
        return (aujd)new auja(auje);
    }
    
    public final int a() {
        return this.a.a();
    }
    
    public final int c(final auiz auiz, final CharSequence charSequence, final int n) {
        return this.a.a.c(auiz, (CharSequence)charSequence.toString(), n);
    }
}
