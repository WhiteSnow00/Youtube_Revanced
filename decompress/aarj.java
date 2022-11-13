import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aarj implements aapp
{
    final Object a;
    final Object b;
    private final int c;
    
    public aarj(final aark a, final afhd b, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aarj(final aarn a, final acxl b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aarj(final aasu a, final aatn b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aarj(final snb b, final Handler a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        final int c = this.c;
        if (c == 0) {
            final aark aark = (aark)this.a;
            aark.g ^= true;
            aark.a();
            final Object b = this.b;
            final boolean f = ((aark)this.a).f;
            final Object a = ((afhd)b).a;
            int n;
            if (!f) {
                n = -2;
            }
            else {
                n = 2160;
            }
            final aaus aaus = (aaus)((adlp)a).a;
            aaus.a.post((Runnable)new aasq(aaus, n, 3));
            return;
        }
        if (c == 1) {
            final Object b2 = this.b;
            final Object a2 = this.a;
            final snb snb = (snb)b2;
            if (snb.b != null) {
                ((Handler)a2).post((Runnable)new rts(snb, 16));
            }
            return;
        }
        if (c != 2) {
            final aapi aapi = (aapi)this.a;
            final boolean o = true ^ aapi.h;
            aapi.h = o;
            final aatn aatn = (aatn)this.b;
            aatn.g = o;
            final aasm b3 = aatn.b;
            if (b3.o != o) {
                b3.o = o;
                if (b3.n && (b3.h == vjj.d || b3.h == vjj.a)) {
                    b3.g();
                }
            }
            aatn.j();
            return;
        }
        final aarn aarn = (aarn)this.a;
        aarn.e = true;
        aarn.c();
        final Object b4 = this.b;
        final boolean e = ((aarn)this.a).e;
        final acxl acxl = (acxl)b4;
        final Object b5 = acxl.b;
        final Object a3 = acxl.a;
        if (e) {
            ((afhd)a3).u(((aaur)b5).h);
        }
    }
}
