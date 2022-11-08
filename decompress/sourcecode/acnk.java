import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class acnk implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ View a;
    final /* synthetic */ ameo b;
    final /* synthetic */ View c;
    final /* synthetic */ Object d;
    final /* synthetic */ wwv e;
    final /* synthetic */ acnn f;
    
    public acnk(final acnn f, final View a, final ameo b, final View c, final Object d, final wwv e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        this.f.a(this.b, this.c, this.d, this.e);
    }
}
