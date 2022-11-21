// 
// Decompiled by Procyon v0.6.0
// 

public final class armc extends agpm
{
    public static int av(final agpk agpk, final int[] array) {
        int length = array.length;
        agpk.r(4, length, 4);
        while (--length >= 0) {
            agpk.i(array[length]);
        }
        return agpk.d();
    }
    
    public static int aw(final agpk agpk, final int[] array) {
        int length = array.length;
        agpk.r(4, length, 4);
        while (--length >= 0) {
            agpk.i(array[length]);
        }
        return agpk.d();
    }
    
    public static int ax(final agpk agpk, final int[] array) {
        int length = array.length;
        agpk.r(4, length, 4);
        while (--length >= 0) {
            agpk.i(array[length]);
        }
        return agpk.d();
    }
    
    public static int ay(final agpk agpk, final int[] array) {
        int length = array.length;
        agpk.r(4, length, 4);
        while (--length >= 0) {
            agpk.i(array[length]);
        }
        return agpk.d();
    }
    
    public final int aA() {
        final int b = this.b(10);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int aB() {
        final int b = this.b(14);
        if (b != 0) {
            return this.d(b);
        }
        return 0;
    }
    
    public final int aC() {
        final int b = this.b(24);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final armj aD(final int n) {
        final armj armj = new armj();
        final int b = this.b(12);
        if (b != 0) {
            armj.f(this.a(this.c(b) + n * 4), this.b);
            return armj;
        }
        return null;
    }
    
    public final armx aE(final int n) {
        return this.aF(new armx(), n);
    }
    
    public final armx aF(final armx armx, final int n) {
        final int b = this.b(14);
        if (b != 0) {
            armx.f(this.a(this.c(b) + n * 4), this.b);
            return armx;
        }
        return null;
    }
    
    public final String aG() {
        final int b = this.b(4);
        if (b != 0) {
            return this.e(b + this.a);
        }
        return null;
    }
    
    public final boolean aH() {
        final int b = this.b(22);
        boolean b2 = true;
        if (b != 0) {
            b2 = b2;
            if (this.b.get(b + this.a) == 0) {
                b2 = false;
            }
        }
        return b2;
    }
    
    public final agpm aI(final int n) {
        final agpm agpm = new agpm();
        final int b = this.b(20);
        if (b != 0) {
            agpm.f(this.a(this.c(b) + n * 4), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm aJ(final int n) {
        final agpm agpm = new agpm();
        final int b = this.b(26);
        if (b != 0) {
            agpm.f(this.a(this.c(b) + n * 4), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm aK() {
        final agpm agpm = new agpm();
        final int b = this.b(28);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final float as() {
        final int b = this.b(6);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final int at() {
        final int b = this.b(20);
        if (b != 0) {
            return this.d(b);
        }
        return 0;
    }
    
    public final int au() {
        final int b = this.b(12);
        if (b != 0) {
            return this.d(b);
        }
        return 0;
    }
    
    public final int az() {
        final int b = this.b(26);
        if (b != 0) {
            return this.d(b);
        }
        return 0;
    }
    
    @Override
    public final int n() {
        final int b = this.b(8);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
}
