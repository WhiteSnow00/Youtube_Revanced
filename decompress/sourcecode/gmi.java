import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmi extends adrk
{
    final /* synthetic */ gmk a;
    
    public gmi(final gmk a) {
        this.a = a;
    }
    
    private final void c(final int n) {
        final agza builder = ((agzi)aprw.a).createBuilder();
        builder.copyOnWrite();
        ((aprw)builder.instance).b = n - 2;
        final aprw aprw = (aprw)builder.build();
        final wvu ak = this.a.ak;
        final aklo d = aklq.d();
        ((agza)d).copyOnWrite();
        aklq.t((aklq)d.instance, aprw);
        ak.d((aklq)((agza)d).build());
    }
    
    public final void a(final View view, final float n) {
    }
    
    public final void b(final View view, final int n) {
        this.a.aM(n);
        if (n == 5) {
            this.c(5);
            return;
        }
        if (n == 3) {
            this.c(3);
            return;
        }
        if (n == 4) {
            this.c(4);
        }
    }
}
