// 
// Decompiled by Procyon v0.6.0
// 

public final class armx extends agpm
{
    public static int aw(final agpk agpk, final long n, final long n2, final int n3, final float n4, final int n5, final long n6, final int n7, final int n8, final float n9, final long n10, final int n11, final boolean b, final int n12, final int n13, final int n14, final long n15, final float n16) {
        agpk.q(17);
        agpk.t(16, n16);
        agpk.u(15, (int)n15);
        agpk.v(14, n14);
        agpk.u(13, n13);
        agpk.u(12, n12);
        agpk.u(10, n11);
        agpk.u(9, (int)n10);
        agpk.t(8, n9);
        agpk.v(7, n8);
        agpk.u(6, n7);
        agpk.u(5, (int)n6);
        agpk.u(4, n5);
        agpk.t(3, n4);
        agpk.v(2, n3);
        agpk.u(1, (int)n2);
        agpk.u(0, (int)n);
        agpk.g(11, b, false);
        return agpk.c();
    }
    
    public final int aA() {
        final int b = this.b(24);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final long aB() {
        final int b = this.b(34);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public final long aC() {
        final int b = this.b(14);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public final long aD() {
        final int b = this.b(22);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public final String aE() {
        final int b = this.b(32);
        if (b != 0) {
            return this.e(b + this.a);
        }
        return null;
    }
    
    public final String aF() {
        final int b = this.b(8);
        if (b != 0) {
            return this.e(b + this.a);
        }
        return null;
    }
    
    public final boolean aG() {
        final int b = this.b(26);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
    
    public final agpm aH() {
        final agpm agpm = new agpm();
        final int b = this.b(18);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final float as() {
        final int b = this.b(36);
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
        final int b = this.b(20);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final int av() {
        final int b = this.b(30);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int ax() {
        final int b = this.b(12);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int ay() {
        final int b = this.b(28);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int az() {
        final int b = this.b(16);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    @Override
    public final long p() {
        final int b = this.b(6);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    @Override
    public final long q() {
        final int b = this.b(4);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
}
