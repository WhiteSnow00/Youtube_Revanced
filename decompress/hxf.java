import com.google.android.libraries.youtube.livechat.ui.view.VerticalShimmerLoadingFrameLayout;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxf implements acxp
{
    final Object a;
    final Object b;
    private final int c;
    
    public hxf(final LoadingFrameLayout a, final Runnable b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hxf(final gvm a, final aiqj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hxf(final hxi b, final hxg a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void c() {
        final int c = this.c;
        if (c == 0) {
            ((hxi)this.b).o((zpf)this.a);
            return;
        }
        if (c != 1) {
            final Object a = this.a;
            final Object b = this.b;
            if (a instanceof VerticalShimmerLoadingFrameLayout) {
                ((LoadingFrameLayout)a).a();
            }
            ((LoadingFrameLayout)a).c();
            ((Runnable)b).run();
            return;
        }
        ((gvm)this.a).ak.g((aiqj)this.b);
    }
}
