// 
// Decompiled by Procyon v0.6.0
// 

public final class bmi implements bmm
{
    public final ayh a;
    
    public bmi(final ayh a) {
        this.a = a;
    }
    
    @Override
    public final int a(final Object o) {
        final ayh a = this.a;
        final bmc bmc = (bmc)o;
        final int a2 = bmn.a;
        int n;
        try {
            if (bmc.c(a)) {
                return 1;
            }
            n = 0;
        }
        catch (final bml bml) {
            n = -1;
        }
        return n;
    }
}
