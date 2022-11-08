// 
// Decompiled by Procyon v0.6.0
// 

final class gf
{
    public static gf a;
    public long b;
    public long c;
    public int d;
    
    public gf() {
    }
    
    public final void a(final long n, double n2, double n3) {
        final float n4 = (-946728000000L + n) / 8.64E7f;
        final float n5 = 0.01720197f * n4 + 6.24006f;
        final double n6 = n5;
        final double sin = Math.sin(n6);
        Double.isNaN(n6);
        final double n7 = sin * 0.03341960161924362 + n6 + Math.sin(n5 + n5) * 3.4906598739326E-4 + Math.sin(n5 * 3.0f) * 5.236000106378924E-6 + 1.796593063 + 3.141592653589793;
        n3 = -n3 / 360.0;
        final double n8 = n4 - 9.0E-4f;
        Double.isNaN(n8);
        final double n9 = Math.round(n8 - n3) + 9.0E-4f;
        Double.isNaN(n9);
        n3 = n9 + n3 + Math.sin(n6) * 0.0053 + Math.sin(n7 + n7) * -0.0069;
        final double asin = Math.asin(Math.sin(n7) * Math.sin(0.4092797040939331));
        n2 *= 0.01745329238474369;
        n2 = (Math.sin(-0.10471975803375244) - Math.sin(n2) * Math.sin(asin)) / (Math.cos(n2) * Math.cos(asin));
        if (n2 >= 1.0) {
            this.d = 1;
        }
        else if (n2 <= -1.0) {
            this.d = 0;
        }
        else {
            n2 = (float)(Math.acos(n2) / 6.283185307179586);
            Double.isNaN(n2);
            this.b = Math.round((n3 + n2) * 8.64E7) + 946728000000L;
            Double.isNaN(n2);
            final long c = Math.round((n3 - n2) * 8.64E7) + 946728000000L;
            this.c = c;
            if (c < n && this.b > n) {
                this.d = 0;
                return;
            }
            this.d = 1;
            return;
        }
        this.b = -1L;
        this.c = -1L;
    }
}
