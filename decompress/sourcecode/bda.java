// 
// Decompiled by Procyon v0.6.0
// 

public final class bda extends IllegalStateException
{
    public final int a;
    public final int b;
    
    public bda(final int a, final int b) {
        final StringBuilder sb = new StringBuilder("Buffer too small (");
        sb.append(a);
        sb.append(" < ");
        sb.append(b);
        sb.append(")");
        super(sb.toString());
        this.a = a;
        this.b = b;
    }
}
