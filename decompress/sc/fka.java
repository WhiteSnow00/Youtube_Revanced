import android.view.View$OnClickListener;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fka extends fkb
{
    public final SpecificNetworkErrorViewLoadingFrameLayout a;
    public pvh b;
    private ImageView d;
    private View e;
    private View f;
    private boolean g;
    private int h;
    private boolean i;
    
    public fka(final SpecificNetworkErrorViewLoadingFrameLayout a, final int n) {
        super(this.a = a, 3, n, 2131428917);
    }
    
    protected final View a() {
        final View a = super.a();
        this.d = (ImageView)a.findViewById(2131428913);
        this.e = a.findViewById(2131428919);
        this.f = a.findViewById(2131427422);
        final View e = this.e;
        if (e != null) {
            e.setOnClickListener((View$OnClickListener)new jl(this, 19));
        }
        final View f = this.f;
        if (f != null) {
            f.setOnClickListener((View$OnClickListener)new jl(this, 20));
        }
        this.d(this.g);
        this.b(this.i);
        this.c(this.h);
        return a;
    }
    
    public final void b(final boolean i) {
        final View f = this.f;
        if (f != null) {
            int visibility;
            if (!i) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            f.setVisibility(visibility);
            return;
        }
        this.i = i;
    }
    
    public final void c(final int n) {
        final ImageView d = this.d;
        if (d != null) {
            d.setImageResource(n);
            return;
        }
        this.h = n;
    }
    
    public final void d(final boolean g) {
        final View e = this.e;
        if (e != null) {
            int visibility;
            if (!g) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            e.setVisibility(visibility);
            return;
        }
        this.g = g;
    }
}
