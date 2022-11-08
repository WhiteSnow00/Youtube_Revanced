// 
// Decompiled by Procyon v0.6.0
// 

public final class aquo extends Exception
{
    public final aqun a;
    
    public aquo(final aqun aqun, final String s) {
        this(aqun, s, null);
    }
    
    public aquo(final aqun a, final String s, final Throwable t) {
        super(s, t);
        this.a = a;
    }
    
    public aquo(final aqun aqun, final Throwable t) {
        this(aqun, null, t);
    }
    
    public final boolean a() {
        return this.a.g;
    }
}
