// 
// Decompiled by Procyon v0.6.0
// 

public final class arho extends aglt
{
    public static int aw(final aglr aglr, final long n, final long n2, final int n3, final float n4, final long n5, final int n6, final int n7, final float n8, final long n9, final int n10, final boolean b, final int n11, final int n12, final int n13, final long n14, final float n15) {
        aglr.q(16);
        aglr.t(15, n15);
        aglr.u(14, (int)n14);
        aglr.v(13, n13);
        aglr.u(12, n12);
        aglr.u(11, n11);
        aglr.u(9, n10);
        aglr.u(8, (int)n9);
        aglr.t(7, n8);
        aglr.v(6, n7);
        aglr.u(5, n6);
        aglr.u(4, (int)n5);
        aglr.t(3, n4);
        aglr.v(2, n3);
        aglr.u(1, (int)n2);
        aglr.u(0, (int)n);
        aglr.g(10, b, false);
        return aglr.c();
    }
    
    public final long aA() {
        final int b = this.b(32);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public final long aB() {
        final int b = this.b(12);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public final long aC() {
        final int b = this.b(20);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public final String aD() {
        final int b = this.b(30);
        if (b != 0) {
            return this.e(b + this.a);
        }
        return null;
    }
    
    public final String aE() {
        final int b = this.b(8);
        if (b != 0) {
            return this.e(b + this.a);
        }
        return null;
    }
    
    public final boolean aF() {
        final int b = this.b(24);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
    
    public final aglt aG() {
        final aglt aglt = new aglt();
        final int b = this.b(16);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
    
    public final float as() {
        final int b = this.b(34);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final float at() {
        final int b = this.b(10);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final float au() {
        final int b = this.b(18);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final int av() {
        final int b = this.b(28);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int ax() {
        final int b = this.b(26);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int ay() {
        final int b = this.b(14);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int az() {
        final int b = this.b(22);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final long p() {
        final int b = this.b(6);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public final long q() {
        final int b = this.b(4);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
}
