import androidx.work.CoroutineWorker;

// 
// Decompiled by Procyon v0.6.0
// 

@atmm(b = "androidx.work.CoroutineWorker$startWork$1", c = "CoroutineWorker.kt", d = "invokeSuspend", e = { 68 })
public final class cmh extends atmq implements atnk
{
    int a;
    final CoroutineWorker b;
    
    public cmh(final CoroutineWorker b, final atly atly) {
        this.b = b;
        super(2, atly);
    }
    
    public final atly create(final Object o, final atly atly) {
        return (atly)new cmh(this.b, atly);
    }
    
    public final /* bridge */ Object invoke(final Object o, final Object o2) {
        return ((cmh)((atmi)this).create(o, (atly)o2)).invokeSuspend(atkq.a);
    }
    
    public final Object invokeSuspend(Object c) {
        final atmf a = atmf.a;
        Label_0051: {
            Label_0022: {
                if (this.a != 0) {
                    Label_0070: {
                        try {
                            arbu.F(c);
                            break Label_0051;
                        }
                        finally {
                            break Label_0070;
                        }
                        break Label_0022;
                    }
                    this.b.b.d((Throwable)c);
                    return atkq.a;
                }
            }
            arbu.F(c);
            final CoroutineWorker b = this.b;
            this.a = 1;
            if ((c = b.c((atly)this)) == a) {
                return a;
            }
        }
        this.b.b.g(c);
        return atkq.a;
    }
}
