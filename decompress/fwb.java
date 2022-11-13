// 
// Decompiled by Procyon v0.6.0
// 

public final class fwb implements UncaughtExceptionHandler
{
    public UncaughtExceptionHandler a;
    public final atke b;
    public final boolean c;
    private final fvx d;
    
    public fwb(final tnu tnu, final fvx d, final atke b) {
        this.c = tnu.m(tnu.n);
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
