// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements aun, qn
{
    final ra a;
    private final auk b;
    private final qx c;
    private qn d;
    
    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(final ra a, final auk b, final qx c) {
        this.a = a;
        this.b = b;
        this.c = c;
        b.b((auo)this);
    }
    
    public final void a(final aup aup, final aui aui) {
        if (aui == aui.ON_START) {
            this.d = this.a.a(this.c);
            return;
        }
        if (aui == aui.ON_STOP) {
            final qn d = this.d;
            if (d != null) {
                d.b();
            }
        }
        else if (aui == aui.ON_DESTROY) {
            this.b();
        }
    }
    
    public final void b() {
        this.b.c((auo)this);
        this.c.d((qn)this);
        final qn d = this.d;
        if (d != null) {
            d.b();
            this.d = null;
        }
    }
}
