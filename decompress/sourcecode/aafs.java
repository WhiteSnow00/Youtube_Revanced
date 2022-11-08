// 
// Decompiled by Procyon v0.6.0
// 

public final class aafs implements aagw
{
    final /* synthetic */ String a;
    final /* synthetic */ aafu b;
    private final /* synthetic */ int c;
    
    public aafs(final aafu b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aafs(final imt b, final String a, final int c) {
        this.c = c;
        this.b = (aafu)b;
        this.a = a;
    }
    
    public final void a() {
        if (this.c != 0) {
            ((imt)this.b).a.b(this.a);
            this.b.e(2132019922);
            return;
        }
        this.b.f().r(this.a);
        this.b.e(2132019922);
    }
}
