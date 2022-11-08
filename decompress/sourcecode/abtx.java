// 
// Decompiled by Procyon v0.6.0
// 

public final class abtx
{
    public long a;
    final /* synthetic */ abty b;
    public final int c;
    
    public abtx(final abty b, final int c, final long a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    final int a() {
        return this.b.x;
    }
    
    final String b() {
        return this.b.w;
    }
    
    @Override
    public final String toString() {
        String s;
        if (this.c != 1) {
            s = "EXIT";
        }
        else {
            s = "ENTER";
        }
        final long a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("@");
        sb.append(a);
        return sb.toString();
    }
}
