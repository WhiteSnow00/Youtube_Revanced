// 
// Decompiled by Procyon v0.6.0
// 

public final class aucp
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public aucp(final String s) {
        final String[] split = s.split("\\.");
        this.a = Integer.parseInt(split[0]);
        this.b = Integer.parseInt(split[1]);
        this.c = Integer.parseInt(split[2]);
        this.d = Integer.parseInt(split[3]);
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final int d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(".");
        sb.append(b);
        sb.append(".");
        sb.append(c);
        sb.append(".");
        sb.append(d);
        return sb.toString();
    }
}
