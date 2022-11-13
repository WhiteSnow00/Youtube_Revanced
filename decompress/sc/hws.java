import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hws extends acle
{
    public final hwt a;
    
    public hws(final hwt a) {
        this.a = a;
    }
    
    public final void d(final Object o) {
        if (((tfz)this).isEmpty()) {
            this.add(o);
            return;
        }
        this.n(0, o);
    }
    
    public final void f(final String s) {
        this.d(new kdt(s, (View$OnClickListener)new hrb(this, 16)));
    }
    
    public final /* bridge */ void qP(final acjm acjm) {
        super.j((tfw)acjm);
    }
}
