// 
// Decompiled by Procyon v0.6.0
// 

public final class aawa implements atke
{
    public final aawb a;
    public final int b;
    private final int c;
    
    public aawa(final aawb a, final int b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final Object a() {
        final int c = this.c;
        if (c == 0) {
            final aawb a = this.a;
            aawf aawf;
            if (this.b == 2) {
                aawf = a.e;
            }
            else {
                aawf = a.d;
            }
            return aawf;
        }
        if (c != 1) {
            final aawb a2 = this.a;
            aawd aawd;
            if (this.b == 2) {
                aawd = a2.j;
            }
            else {
                aawd = a2.i;
            }
            return aawd;
        }
        final aawb a3 = this.a;
        aawd aawd2;
        if (this.b == 2) {
            aawd2 = a3.h;
        }
        else {
            aawd2 = a3.g;
        }
        return aawd2;
    }
}
