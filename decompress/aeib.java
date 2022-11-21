import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeib extends nr
{
    public View a;
    private final nr e;
    private final fo f;
    
    public aeib(final nr e) {
        final aeia f = new aeia(this);
        this.f = f;
        (this.e = e).v((fo)f);
        this.s(e.c);
    }
    
    public final int a() {
        int a = this.e.a();
        if (this.a != null) {
            ++a;
        }
        return a;
    }
    
    public final int d(final int n) {
        int n2 = n;
        if (this.a != null) {
            n2 = n - 1;
        }
        if (n2 < 0) {
            return Integer.MAX_VALUE;
        }
        return this.e.d(n2);
    }
    
    public final oo g(final ViewGroup viewGroup, final int n) {
        if (n == Integer.MAX_VALUE) {
            final FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -2));
            return new aeic((View)frameLayout);
        }
        return this.e.g(viewGroup, n);
    }
    
    public final long mO(final int n) {
        int n2 = n;
        if (this.a != null) {
            n2 = n - 1;
        }
        if (n2 < 0) {
            return Long.MAX_VALUE;
        }
        return this.e.mO(n2);
    }
    
    public final void q(final oo oo, final int n) {
        final View a = this.a;
        int n2 = n;
        if (a != null) {
            n2 = n - 1;
        }
        if (!(oo instanceof aeic)) {
            this.e.q(oo, n2);
            return;
        }
        if (a != null) {
            if (a.getParent() != null) {
                ((ViewGroup)this.a.getParent()).removeView(this.a);
            }
            ((FrameLayout)oo.a).addView(this.a);
            return;
        }
        throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
    }
}
