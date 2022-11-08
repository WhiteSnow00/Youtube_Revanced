// 
// Decompiled by Procyon v0.6.0
// 

public final class czt
{
    public float a;
    public float b;
    
    public czt() {
        this(1.0f, 1.0f);
    }
    
    public czt(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final float b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("x");
        sb.append(b);
        return sb.toString();
    }
}
