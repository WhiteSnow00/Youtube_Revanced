import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class hgx implements tvl
{
    final /* synthetic */ hgy a;
    private final View b;
    
    public hgx(final hgy a, final View b) {
        this.a = a;
        this.b = b;
    }
    
    public final float a() {
        final hgy a = this.a;
        if (a.d()) {
            final boolean r = a.r;
            final int n = 0;
            int bottomMargin = 0;
            int n2;
            if (r) {
                n2 = a.c.a();
            }
            else if (a.s) {
                n2 = a.d.a();
            }
            else {
                trn.b("getChooseFilterOpenHeight: No open ChooseFilterViews");
                n2 = 0;
            }
            final hgy a2 = this.a;
            int n3;
            if (!a2.a) {
                n3 = n;
            }
            else {
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)a2.g.getLayoutParams();
                if (viewGroup$MarginLayoutParams != null) {
                    bottomMargin = viewGroup$MarginLayoutParams.bottomMargin;
                }
                n3 = a2.m - (bottomMargin + (a2.g.getHeight() - a2.l) / 2);
            }
            return (float)(-(n2 + n3));
        }
        return 0.0f;
    }
    
    public final float b() {
        return this.b.getTranslationY();
    }
    
    public final View c() {
        return this.b;
    }
    
    public final void d() {
    }
    
    public final void e() {
    }
}
