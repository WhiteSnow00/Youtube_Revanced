// 
// Decompiled by Procyon v0.6.0
// 

public class dbi extends Exception
{
    public final dba b;
    
    public dbi() {
        this.b = null;
    }
    
    public dbi(final dba b) {
        this.b = b;
    }
    
    public dbi(final String s) {
        super(s);
        this.b = null;
    }
    
    public dbi(final String s, final Throwable t) {
        super(s, t);
        this.b = null;
    }
    
    public dbi(final Throwable t) {
        super(t);
        this.b = null;
    }
}
