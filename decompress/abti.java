// 
// Decompiled by Procyon v0.6.0
// 

public final class abti implements zbq
{
    public final Object a;
    private final int b;
    
    public abti(final abtj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abti(final abtl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final String a(final long n) {
        final int b = this.b;
        if (b == 0) {
            final long d = ((abtj)this.a).a.d();
            final StringBuilder sb = new StringBuilder();
            final double n2 = (double)(d - n);
            Double.isNaN(n2);
            sb.append(n2 / 1000.0);
            sb.append(";su");
            return sb.toString();
        }
        if (b == 1) {
            final long d2 = ((abtj)this.a).a.d();
            final StringBuilder sb2 = new StringBuilder();
            final double n3 = (double)(d2 - n);
            Double.isNaN(n3);
            sb2.append(n3 / 1000.0);
            sb2.append(";pi");
            return sb2.toString();
        }
        if (b != 2) {
            final long d3 = ((abtl)this.a).c.d();
            final StringBuilder sb3 = new StringBuilder();
            final double n4 = (double)(d3 - n);
            Double.isNaN(n4);
            sb3.append(n4 / 1000.0);
            sb3.append(";su");
            return sb3.toString();
        }
        final long d4 = ((abtl)this.a).c.d();
        final StringBuilder sb4 = new StringBuilder();
        final double n5 = (double)(d4 - n);
        Double.isNaN(n5);
        sb4.append(n5 / 1000.0);
        sb4.append(";pi");
        return sb4.toString();
    }
}
