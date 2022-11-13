import android.view.View$OnClickListener;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etk implements gha, kul
{
    public final eti a;
    public final atke b;
    public final accf c;
    public final atke d;
    public final ghb e;
    public final atke f;
    public final gbo g;
    public final Executor h;
    public final fjv i;
    public final gkx j;
    public acle k;
    public ackz l;
    public acqf m;
    public wyw n;
    public boolean o;
    public final vai p;
    public final adfq q;
    public final aeea r;
    
    public etk(final eti a, final atke b, final aeea r, final accf c, final atke d, final ghb e, final atke f, final adfq q, final gbo g, final Executor h, final fjv i, final gkx j, final vai p18, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
        this.r = r;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.q = q;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.p = p18;
    }
    
    static void b(final Throwable t) {
        ttr.o("ProfileCardController", "getSurveyService onErrorResponse", t);
    }
    
    public static final acqe e(final acot acot, final acqf acqf) {
        return aald.r(acot, (Object)null, (View$OnClickListener)null, acqf);
    }
    
    public final void a() {
        final acle k = this.k;
        k.getClass();
        ((tfz)k).clear();
    }
    
    public final void c(final fkn fkn) {
    }
    
    public final void d(final fkn fkn) {
        this.a.dismiss();
    }
    
    public final void f(final argj argj) {
        this.a.dismiss();
    }
}
