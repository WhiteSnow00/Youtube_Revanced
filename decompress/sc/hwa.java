// 
// Decompiled by Procyon v0.6.0
// 

final class hwa extends acnv
{
    final jwd a;
    
    public hwa(final jwd a) {
        this.a = a;
    }
    
    public final void c(final vgu vgu, final boolean b) {
        final anyv a = vgu.a;
        anyn a2;
        if ((a.c & 0x4) != 0x0) {
            anys anys;
            if ((anys = a.h) == null) {
                anys = anys.a;
            }
            if (anys.b == 105924295) {
                a2 = (anyn)anys.c;
            }
            else {
                a2 = anyn.a;
            }
        }
        else {
            a2 = null;
        }
        if (a2 != null) {
            this.a.q(a2);
        }
    }
}
