import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxd implements acxb
{
    private final Context a;
    private final zlv b;
    
    public acxd(final Context a, final zlv b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        throw new IllegalArgumentException("Non account scoped callsite should pass Identity.");
    }
    
    public final void b(final zme zme) {
        this.g(zme).a();
    }
    
    public final void c(final String s) {
        throw new IllegalArgumentException("Non account scoped callsite should pass Identity.");
    }
    
    public final void d(final String s, final zme zme) {
        this.g(zme).c(s);
    }
    
    public final void e(final String s, final int n, final xan xan, final ttg ttg) {
        throw new IllegalArgumentException("Non account scoped callsite should pass Identity.");
    }
    
    public final void f(final String s, final zme zme, final int n, final xan xan, final ttg ttg) {
        this.g(zme).e(s, n, xan, ttg);
    }
    
    public final acxb g(final zme zme) {
        return ((acxc)aefb.O(this.a, (Class)acxc.class, this.b.a(zme))).e();
    }
}
