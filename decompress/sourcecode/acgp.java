// 
// Decompiled by Procyon v0.6.0
// 

public class acgp extends tdc
{
    private final String a;
    private final String b;
    private final int d;
    
    public acgp(final String s, final String b, final int d) {
        this.a = "th";
        this.b = b;
        this.d = d;
    }
    
    public int a() {
        return this.d;
    }
    
    public String b() {
        final String a = this.a;
        final int a2 = this.a();
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(a2);
        sb.append(b);
        return sb.toString();
    }
}
