import java.util.concurrent.Future;
import android.content.Context;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abbd implements AccessibilityManager$AccessibilityStateChangeListener
{
    private final Context a;
    private final ativ b;
    private Boolean c;
    private boolean d;
    
    public abbd(final Context a) {
        this.a = a;
        this.b = ativ.aF((Object)abbc.b(false));
    }
    
    public final ashi a() {
        return ((ashi)this.b).p();
    }
    
    public final void b() {
        final boolean e = this.e();
        final abbc abbc = (abbc)this.b.aG();
        if (abbc != null && e == abbc.a) {
            return;
        }
        this.onAccessibilityStateChanged(e);
    }
    
    public final void c() {
        if (!this.d) {
            return;
        }
        this.d = false;
        tsy.h(this.a, (AccessibilityManager$AccessibilityStateChangeListener)this);
    }
    
    public final void d() {
        if (this.d) {
            return;
        }
        this.d = true;
        tsy.g(this.a, (AccessibilityManager$AccessibilityStateChangeListener)this);
        final Boolean c = this.c;
        boolean b;
        if (c != null) {
            b = c;
        }
        else {
            final Boolean c2 = (Boolean)teu.f((Future)afwm.m((Object)false), (Object)false);
            this.c = c2;
            b = c2;
        }
        if (b) {
            final ativ b2 = this.b;
            final abbb abbb = new abbb(abbc.b(true));
            abbb.e(true);
            b2.tu((Object)abbb.a());
            return;
        }
        this.b.tu((Object)abbc.b(this.e()));
    }
    
    protected final boolean e() {
        return tsy.e(this.a);
    }
    
    public final void onAccessibilityStateChanged(final boolean b) {
        this.b.tu((Object)abbc.b(this.e()));
    }
}
