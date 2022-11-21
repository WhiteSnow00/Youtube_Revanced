// 
// Decompiled by Procyon v0.6.0
// 

public final class aajk implements aako
{
    final String a;
    final aajm b;
    private final int c;
    
    public aajk(final aajm b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aajk(final iod b, final String a, final int c) {
        this.c = c;
        this.b = (aajm)b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        if (this.c != 0) {
            ((iod)this.b).a.b(this.a);
            this.b.e(2132019926);
            return;
        }
        this.b.f().r(this.a);
        this.b.e(2132019926);
    }
}
