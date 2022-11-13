// 
// Decompiled by Procyon v0.6.0
// 

public final class iio implements aacb
{
    private final int a;
    
    public iio(final int a) {
        this.a = a;
    }
    
    public final int a() {
        final int a = this.a;
        if (a != 0 && a != 1 && a != 2 && a != 3) {
            return 1;
        }
        return 20;
    }
    
    public final aezs b() {
        final int a = this.a;
        if (a == 0) {
            return (aezs)iim.c;
        }
        if (a == 1) {
            return (aezs)iim.a;
        }
        if (a == 2) {
            return (aezs)iim.d;
        }
        if (a != 3) {
            return (aezs)opl.t;
        }
        return (aezs)opl.s;
    }
}
