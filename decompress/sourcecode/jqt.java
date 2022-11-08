// 
// Decompiled by Procyon v0.6.0
// 

public class jqt
{
    public final anxs a;
    
    public jqt(final anxs a) {
        this.a = a;
    }
    
    public static jqt a(final anxs anxs) {
        int bz;
        if ((bz = aqql.bz(anxs.c)) == 0) {
            bz = 1;
        }
        if (--bz == 270) {
            return (jqt)new jqq(anxs);
        }
        if (bz == 273) {
            return (jqt)new jqr(anxs);
        }
        if (bz == 280) {
            return (jqt)new jqs(anxs);
        }
        if (bz != 345) {
            return (jqt)new jqp(anxs);
        }
        return (jqt)new jqo(anxs);
    }
}
