import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddd extends IOException
{
    private static final long serialVersionUID = 1L;
    public final int a;
    
    public ddd(final String s, final int n) {
        this(s, n, null);
    }
    
    public ddd(final String s, final int a, final Throwable t) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(", status code: ");
        sb.append(a);
        super(sb.toString(), t);
        this.a = a;
    }
}
