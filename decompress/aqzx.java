// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzx extends Exception
{
    public final aqzw a;
    
    public aqzx(final aqzw aqzw, final String s) {
        this(aqzw, s, null);
    }
    
    public aqzx(final aqzw a, final String s, final Throwable t) {
        super(s, t);
        this.a = a;
    }
    
    public aqzx(final aqzw aqzw, final Throwable t) {
        this(aqzw, null, t);
    }
    
    public final boolean a() {
        return this.a.g;
    }
}
