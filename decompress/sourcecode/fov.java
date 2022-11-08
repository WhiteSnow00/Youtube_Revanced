import android.graphics.Rect;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class fov
{
    public final View a;
    final /* synthetic */ foz b;
    private Rect c;
    
    public fov(final foz b, final View a) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public final boolean a(final int n, final int n2) {
        if (!this.a.isShown()) {
            return false;
        }
        if (this.c == null) {
            this.c = new Rect();
        }
        this.b.getGlobalVisibleRect(this.c);
        final int left = this.c.left;
        final int top = this.c.top;
        this.a.getGlobalVisibleRect(this.c);
        return this.c.contains(n + left, n2 + top);
    }
}
