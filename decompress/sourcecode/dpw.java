// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dpw extends ardf
{
    public dpw(final String s) {
        super(s);
    }
    
    public abstract long[] k();
    
    public final String toString() {
        final String simpleName = this.getClass().getSimpleName();
        final int length = this.k().length;
        final StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 24);
        sb.append(simpleName);
        sb.append("[entryCount=");
        sb.append(length);
        sb.append("]");
        return sb.toString();
    }
}
