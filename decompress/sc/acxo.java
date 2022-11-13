import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import android.view.View;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxo extends acxq
{
    public acxp a;
    private ImageView d;
    private View e;
    private boolean f;
    private int g;
    
    public acxo(final LoadingFrameLayout loadingFrameLayout, final int n) {
        super(loadingFrameLayout, 3, n, 2131428917);
    }
    
    protected final View a() {
        final View a = super.a();
        this.d = (ImageView)a.findViewById(2131428913);
        final View viewById = a.findViewById(2131428919);
        this.e = viewById;
        if (viewById != null) {
            viewById.setOnClickListener((View$OnClickListener)new acun(this, 4));
        }
        this.c(this.f);
        this.b(this.g);
        return a;
    }
    
    public final void b(final int n) {
        final ImageView d = this.d;
        if (d != null) {
            d.setImageResource(n);
            return;
        }
        this.g = n;
    }
    
    public final void c(final boolean f) {
        final View e = this.e;
        if (e != null) {
            int visibility;
            if (!f) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            e.setVisibility(visibility);
            return;
        }
        this.f = f;
    }
}
