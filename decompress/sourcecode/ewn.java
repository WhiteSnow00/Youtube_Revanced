import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewn
{
    public final atjj a;
    public final Executor b;
    public final asho c;
    public final atjj d;
    public volatile boolean e;
    public ashp f;
    public final uyf g;
    private final atjj h;
    
    public ewn(final atjj a, final uyf g, final atjj h, final Executor b, final asho c, final atjj d) {
        this.a = a;
        this.g = g;
        this.h = h;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final ajwk ajwk) {
        final ajwl a = ajwm.a();
        a.copyOnWrite();
        ajwm.c((ajwm)a.instance, ajwk);
        final ajwm ajwm = (ajwm)a.build();
        final wvu wvu = (wvu)this.h.a();
        final aklo d = aklq.d();
        ((agza)d).copyOnWrite();
        aklq.B((aklq)d.instance, ajwm);
        wvu.d((aklq)((agza)d).build());
    }
}
