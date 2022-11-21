import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyq implements acyo
{
    private final Context a;
    private final znq b;
    
    public acyq(final Context a, final znq b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        throw new IllegalArgumentException("Non account scoped callsite should pass Identity.");
    }
    
    @Override
    public final void b(final znz znz) {
        this.g(znz).a();
    }
    
    @Override
    public final void c(final String s) {
        throw new IllegalArgumentException("Non account scoped callsite should pass Identity.");
    }
    
    @Override
    public final void d(final String s, final znz znz) {
        this.g(znz).c(s);
    }
    
    @Override
    public final void e(final String s, final int n, final xbt xbt, final tui tui) {
        throw new IllegalArgumentException("Non account scoped callsite should pass Identity.");
    }
    
    @Override
    public final void f(final String s, final znz znz, final int n, final xbt xbt, final tui tui) {
        this.g(znz).e(s, n, xbt, tui);
    }
    
    public final acyo g(final znz znz) {
        return ((acyp)adme.ag(this.a, acyp.class, this.b.a(znz))).e();
    }
}
