// 
// Decompiled by Procyon v0.6.0
// 

public final class adjf
{
    public final String a;
    public final aoql b;
    
    public adjf(final String a, final aoql b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.a != null) {
            sb.append("pcen:");
            sb.append(this.a);
        }
        if (this.b != null) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append("tag:");
            sb.append(this.b.c);
        }
        return sb.toString();
    }
}
