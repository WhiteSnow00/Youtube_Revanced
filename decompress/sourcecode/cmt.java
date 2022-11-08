// 
// Decompiled by Procyon v0.6.0
// 

public final class cmt extends cll
{
    public final Throwable a;
    
    public cmt(final Throwable a) {
        this.a = a;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FAILURE (");
        sb.append(this.a.getMessage());
        sb.append(")");
        return sb.toString();
    }
}
