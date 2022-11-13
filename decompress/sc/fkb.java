import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.view.View;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class fkb
{
    private final int a;
    private final int b;
    final SpecificNetworkErrorViewLoadingFrameLayout c;
    private final int d;
    private View e;
    private TextView f;
    private CharSequence g;
    
    public fkb(final SpecificNetworkErrorViewLoadingFrameLayout c, final int a, final int b, final int d) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    protected View a() {
        final View inflate = LayoutInflater.from(this.c.a).inflate(this.b, (ViewGroup)this.c, false);
        final int d = this.d;
        if (d > 0) {
            (this.f = (TextView)inflate.findViewById(d)).setMovementMethod(LinkMovementMethod.getInstance());
            this.e(this.g);
        }
        return inflate;
    }
    
    public final void e(final CharSequence charSequence) {
        final TextView f = this.f;
        if (f != null) {
            if (charSequence == null) {
                f.setText((CharSequence)"");
            }
            else {
                f.setText(charSequence);
            }
            this.g = null;
            return;
        }
        this.g = charSequence;
    }
    
    public final void f(final int n) {
        if (this.a == n) {
            if (this.e == null) {
                final View a = this.a();
                this.e = a;
                this.c.addView(a);
            }
            this.e.setVisibility(0);
            return;
        }
        final View e = this.e;
        if (e != null) {
            e.setVisibility(8);
        }
    }
}
