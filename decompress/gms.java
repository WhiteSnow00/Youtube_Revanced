import android.view.MenuItem;
import android.view.View$OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.webkit.WebView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gms implements no
{
    public final View a;
    public String b;
    public WebView c;
    public np d;
    public final vwa e;
    private final TextView f;
    private final TextView g;
    private final View h;
    private final View i;
    private final ImageView j;
    private final wyw k;
    
    public gms(final ViewStub viewStub, final gkx gkx, final wyw k) {
        this.e = vwa.Z((tvo)eyj.i);
        this.k = k;
        viewStub.setLayoutResource(2131625819);
        final View inflate = viewStub.inflate();
        this.a = inflate;
        inflate.findViewById(2131428234).setOnClickListener((View$OnClickListener)new fup(this, 10));
        (this.j = (ImageView)inflate.findViewById(2131427738)).setOnClickListener((View$OnClickListener)new gcd(this, k, 5));
        inflate.findViewById(2131430176).setOnClickListener((View$OnClickListener)new gcd(this, k, 6));
        inflate.findViewById(2131430214).setOnClickListener((View$OnClickListener)new gcd(this, gkx, 7));
        this.f = (TextView)inflate.findViewById(2131432477);
        final TextView g = (TextView)inflate.findViewById(2131432478);
        (this.g = g).setTextColor(tpe.cr(g.getContext(), 2130970926));
        this.i = inflate.findViewById(2131430084);
        this.h = inflate.findViewById(2131431336);
        k.l((wzz)new wyt(xaa.c(116204)));
        k.l((wzz)new wyt(xaa.c(116205)));
        k.l((wzz)new wyt(xaa.c(116207)));
        k.l((wzz)new wyt(xaa.c(116206)));
    }
    
    public final boolean a(final MenuItem menuItem) {
        final int a = ((io)menuItem).a;
        if (a == 2131429079) {
            this.k.J(3, (wzz)new wyt(xaa.c(116205)), (alhi)null);
            this.c.goForward();
            return true;
        }
        if (a == 2131431122) {
            this.k.J(3, (wzz)new wyt(xaa.c(116207)), (alhi)null);
            this.c.reload();
            return true;
        }
        return false;
    }
    
    public final void b(final WebView c, final String s) {
        this.b = s;
        this.c = c;
        this.f.setText((CharSequence)c.getTitle());
        this.g.setText((CharSequence)s);
        final boolean contains = s.contains("https://");
        tpe.v(this.h, contains);
        tpe.v(this.i, contains ^ true);
        this.j.setEnabled(c.canGoBack());
        if (this.j.isEnabled()) {
            this.j.setColorFilter(tpe.cr(this.a.getContext(), 2130970924));
        }
        else {
            this.j.setColorFilter(tpe.cr(this.a.getContext(), 2130970922));
        }
        this.a.requestLayout();
    }
}
