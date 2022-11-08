// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jbr
{
    static jbr b(final boolean b, final aols aols) {
        return c(b, aols, 0);
    }
    
    static jbr c(final boolean b, final aols aols, final int n) {
        return (jbr)new jbs(b, aols, n);
    }
    
    public abstract int a();
    
    public abstract aols d();
    
    public abstract boolean e();
}
