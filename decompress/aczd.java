import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class aczd
{
    private final int a;
    public View b;
    final LoadingFrameLayout c;
    private final int d;
    private final int e;
    private TextView f;
    private CharSequence g;
    
    public aczd(final LoadingFrameLayout c, final int a, final int d, final int e) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
    }
    
    protected View a() {
        final View inflate = LayoutInflater.from(this.c.c).inflate(this.d, (ViewGroup)this.c, false);
        final int e = this.e;
        if (e > 0) {
            (this.f = (TextView)inflate.findViewById(e)).setMovementMethod(LinkMovementMethod.getInstance());
            this.d(this.g);
        }
        return inflate;
    }
    
    public final void d(final CharSequence charSequence) {
        final TextView f = this.f;
        if (f != null) {
            f.setText(charSequence);
            this.g = null;
            return;
        }
        this.g = charSequence;
    }
    
    public final void e(final int n) {
        if (this.a == n) {
            if (this.b == null) {
                final View a = this.a();
                this.b = a;
                this.c.addView(a);
            }
            this.b.setVisibility(0);
            return;
        }
        final View b = this.b;
        if (b != null) {
            b.setVisibility(8);
            this.b.clearFocus();
        }
    }
}
