// 
// Decompiled by Procyon v0.6.0
// 

public final class ffh implements wyz
{
    private final /* synthetic */ int a;
    
    public ffh(final int a) {
        this.a = a;
    }
    
    public final wyy a(final wzd wzd) {
        final int a = this.a;
        if (a == 0) {
            return new ffi(wzd);
        }
        if (a == 1) {
            return new fet(wzd);
        }
        if (a == 2) {
            return new fiq(wzd);
        }
        if (a == 3) {
            return (wyy)new xcc(wzd);
        }
        if (a == 4) {
            return (wyy)new xcg(wzd);
        }
        if (a != 5) {
            return new fgk(wzd, null);
        }
        return new fgi(wzd, null);
    }
}
