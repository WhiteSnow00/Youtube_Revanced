// 
// Decompiled by Procyon v0.6.0
// 

public final class myd
{
    public static final myd a;
    public final String b;
    public final int c;
    public final String d;
    
    static {
        final zvm a2 = a();
        a2.d = "gmscompliance-pa.googleapis.com";
        a2.j();
        a2.c = "AIzaSyAZyAvJ8K9XaZCj_nrBkIYRe_iyODXJxAk";
        a = a2.i();
        final zvm a3 = a();
        a3.d = "staging-gmscompliance-pa.sandbox.googleapis.com";
        a3.j();
        a3.c = "AIzaSyBJO1-Q7JrHnlrtDZgengd4liAMLoT7sIU";
        a3.i();
    }
    
    public myd() {
    }
    
    public myd(final String b, final int c, final String d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static zvm a() {
        return new zvm();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof myd) {
            final myd myd = (myd)o;
            if (this.b.equals(myd.b) && this.c == myd.c && this.d.equals(myd.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.b.hashCode() ^ 0xF4243) * 1000003 ^ this.c) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final int c = this.c;
        final String d = this.d;
        final StringBuilder sb = new StringBuilder("UdevsSpec{hostName=");
        sb.append(b);
        sb.append(", hostPort=");
        sb.append(c);
        sb.append(", apiKey=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
