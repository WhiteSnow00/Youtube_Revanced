import androidx.work.CoroutineWorker;

// 
// Decompiled by Procyon v0.6.0
// 

@atlr(b = "androidx.work.CoroutineWorker$startWork$1", c = "CoroutineWorker.kt", d = "invokeSuspend", e = { 68 })
public final class cmg extends atlv implements atmp
{
    int a;
    final /* synthetic */ CoroutineWorker b;
    
    public cmg(final CoroutineWorker b, final atld atld) {
        this.b = b;
        super(2, atld);
    }
    
    public final atld create(final Object o, final atld atld) {
        return (atld)new cmg(this.b, atld);
    }
    
    public final Object invokeSuspend(Object c) {
        final atlk a = atlk.a;
        Label_0051: {
            Label_0022: {
                if (this.a != 0) {
                    Label_0070: {
                        try {
                            arxj.h(c);
                            break Label_0051;
                        }
                        finally {
                            break Label_0070;
                        }
                        break Label_0022;
                    }
                    this.b.b.d((Throwable)c);
                    return atjv.a;
                }
            }
            arxj.h(c);
            final CoroutineWorker b = this.b;
            this.a = 1;
            if ((c = b.c((atld)this)) == a) {
                return a;
            }
        }
        this.b.b.g((Object)c);
        return atjv.a;
    }
}
