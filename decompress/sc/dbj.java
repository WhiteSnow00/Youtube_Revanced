// 
// Decompiled by Procyon v0.6.0
// 

public class dbj extends Exception
{
    public final dbb b;
    
    public dbj() {
        this.b = null;
    }
    
    public dbj(final dbb b) {
        this.b = b;
    }
    
    public dbj(final String s) {
        super(s);
        this.b = null;
    }
    
    public dbj(final String s, final Throwable t) {
        super(s, t);
        this.b = null;
    }
    
    public dbj(final Throwable t) {
        super(t);
        this.b = null;
    }
}
