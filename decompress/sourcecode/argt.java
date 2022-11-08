// 
// Decompiled by Procyon v0.6.0
// 

public final class argt extends aglt
{
    public static int av(final aglr aglr, final int[] array) {
        int length = array.length;
        aglr.r(4, length, 4);
        while (--length >= 0) {
            aglr.i(array[length]);
        }
        return aglr.d();
    }
    
    public static int aw(final aglr aglr, final int[] array) {
        int length = array.length;
        aglr.r(4, length, 4);
        while (--length >= 0) {
            aglr.i(array[length]);
        }
        return aglr.d();
    }
    
    public static int ax(final aglr aglr, final int[] array) {
        int length = array.length;
        aglr.r(4, length, 4);
        while (--length >= 0) {
            aglr.i(array[length]);
        }
        return aglr.d();
    }
    
    public static int ay(final aglr aglr, final int[] array) {
        int length = array.length;
        aglr.r(4, length, 4);
        while (--length >= 0) {
            aglr.i(array[length]);
        }
        return aglr.d();
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
    
    public final arha aD(final int n) {
        final arha arha = new arha();
        final int b = this.b(12);
        if (b != 0) {
            arha.f(this.a(this.c(b) + n * 4), this.b);
            return arha;
        }
        return null;
    }
    
    public final arho aE(final int n) {
        return this.aF(new arho(), n);
    }
    
    public final arho aF(final arho arho, final int n) {
        final int b = this.b(14);
        if (b != 0) {
            arho.f(this.a(this.c(b) + n * 4), this.b);
            return arho;
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
    
    public final aglt aI(final int n) {
        final aglt aglt = new aglt();
        final int b = this.b(20);
        if (b != 0) {
            aglt.f(this.a(this.c(b) + n * 4), this.b);
            return aglt;
        }
        return null;
    }
    
    public final aglt aJ(final int n) {
        final aglt aglt = new aglt();
        final int b = this.b(26);
        if (b != 0) {
            aglt.f(this.a(this.c(b) + n * 4), this.b);
            return aglt;
        }
        return null;
    }
    
    public final aglt aK() {
        final aglt aglt = new aglt();
        final int b = this.b(28);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
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
    
    public final int n() {
        final int b = this.b(8);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
}
