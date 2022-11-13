// 
// Decompiled by Procyon v0.6.0
// 

public final class bjy
{
    public final String a;
    public final String b;
    
    public bjy(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(", ");
        sb.append(b);
        return sb.toString();
    }
}
