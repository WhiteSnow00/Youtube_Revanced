// 
// Decompiled by Procyon v0.6.0
// 

public final class mxr extends Exception
{
    public final int a;
    
    public mxr(final int a, final String s) {
        super(s);
        this.a = a;
    }
    
    public mxr(final int a, final Throwable t) {
        super(t);
        this.a = a;
    }
}
