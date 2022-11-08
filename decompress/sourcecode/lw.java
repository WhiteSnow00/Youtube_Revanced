// 
// Decompiled by Procyon v0.6.0
// 

public final class lw
{
    public on a;
    public on b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    
    public lw(final on a, final on b, final int c, final int d, final int e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
        sb.append(this.a);
        sb.append(", newHolder=");
        sb.append(this.b);
        sb.append(", fromX=");
        sb.append(this.c);
        sb.append(", fromY=");
        sb.append(this.d);
        sb.append(", toX=");
        sb.append(this.e);
        sb.append(", toY=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
