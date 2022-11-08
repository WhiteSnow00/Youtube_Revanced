// 
// Decompiled by Procyon v0.6.0
// 

public final class dpx
{
    public int a;
    public final int b;
    
    public dpx(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder(44);
        sb.append("Entry{count=");
        sb.append(a);
        sb.append(", offset=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
