import android.view.accessibility.CaptioningManager$CaptioningChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class jrx implements fxn
{
    final /* synthetic */ boolean a;
    final /* synthetic */ jrz b;
    private final /* synthetic */ int c;
    
    public jrx(final jrz b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        if (this.c != 0) {
            final jrz b = this.b;
            b.d.removeCaptioningChangeListener((CaptioningManager$CaptioningChangeListener)b.c);
            return;
        }
        this.b.b.b();
    }
    
    @Override
    public final void c() {
        if (this.c != 0) {
            final jrz b = this.b;
            b.d.addCaptioningChangeListener((CaptioningManager$CaptioningChangeListener)b.c);
            if (!this.a) {
                this.b.d();
            }
            return;
        }
        this.b.c();
        if (!this.a) {
            this.b.d();
        }
    }
}
