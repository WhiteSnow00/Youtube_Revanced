import androidx.work.CoroutineWorker;

// 
// Decompiled by Procyon v0.6.0
// 

@atlr(b = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", c = "CoroutineWorker.kt", d = "invokeSuspend", e = { 134 })
public final class cmf extends atlv implements atmp
{
    Object a;
    int b;
    final /* synthetic */ cmm c;
    final /* synthetic */ CoroutineWorker d;
    
    public cmf(final cmm c, final CoroutineWorker d, final atld atld) {
        this.c = c;
        this.d = d;
        super(2, atld);
    }
    
    public final atld create(final Object o, final atld atld) {
        return (atld)new cmf(this.c, this.d, atld);
    }
    
    public final Object invokeSuspend(final Object o) {
        final atlk a = atlk.a;
        if (this.b != 0) {
            final Object a2 = this.a;
            arxj.h(o);
            ((cmm)a2).a.g(o);
            return atjv.a;
        }
        arxj.h(o);
        this.a = this.c;
        this.b = 1;
        throw new IllegalStateException("Not implemented");
    }
}
