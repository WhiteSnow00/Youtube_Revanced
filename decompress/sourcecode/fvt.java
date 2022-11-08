// 
// Decompiled by Procyon v0.6.0
// 

public final class fvt implements UncaughtExceptionHandler
{
    public UncaughtExceptionHandler a;
    public final atjj b;
    public final boolean c;
    private final fvp d;
    
    public fvt(final tlq tlq, final fvp d, final atjj b) {
        this.c = tlq.m(tlq.n);
        this.d = d;
        this.b = b;
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        if (this.c && this.d.d()) {
            this.d.c();
        }
        final UncaughtExceptionHandler a = this.a;
        if (a != null) {
            a.uncaughtException(thread, t);
        }
    }
}
