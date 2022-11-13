import androidx.work.CoroutineWorker;

// 
// Decompiled by Procyon v0.6.0
// 

@atmm(b = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", c = "CoroutineWorker.kt", d = "invokeSuspend", e = { 134 })
public final class cmg extends atmq implements atnk
{
    Object a;
    int b;
    final cmn c;
    final CoroutineWorker d;
    
    public cmg(final cmn c, final CoroutineWorker d, final atly atly) {
        this.c = c;
        this.d = d;
        super(2, atly);
    }
    
    public final atly create(final Object o, final atly atly) {
        return (atly)new cmg(this.c, this.d, atly);
    }
    
    public final /* bridge */ Object invoke(final Object o, final Object o2) {
        return ((cmg)((atmi)this).create(o, (atly)o2)).invokeSuspend(atkq.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final atmf a = atmf.a;
        if (this.b != 0) {
            final Object a2 = this.a;
            arbu.F(o);
            ((cmn)a2).a.g(o);
            return atkq.a;
        }
        arbu.F(o);
        this.a = this.c;
        this.b = 1;
        throw new IllegalStateException("Not implemented");
    }
}
