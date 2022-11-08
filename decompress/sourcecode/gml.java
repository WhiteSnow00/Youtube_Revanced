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

public final class gml implements no
{
    public final View a;
    public String b;
    public WebView c;
    public np d;
    public final vup e;
    private final TextView f;
    private final TextView g;
    private final View h;
    private final View i;
    private final ImageView j;
    private final wwv k;
    
    public gml(final ViewStub viewStub, final gko gko, final wwv k) {
        this.e = vup.P((ttk)eyg.i);
        this.k = k;
        viewStub.setLayoutResource(2131625815);
        final View inflate = viewStub.inflate();
        this.a = inflate;
        inflate.findViewById(2131428234).setOnClickListener((View$OnClickListener)new fuh(this, 10));
        (this.j = (ImageView)inflate.findViewById(2131427738)).setOnClickListener((View$OnClickListener)new gbw(this, k, 5));
        inflate.findViewById(2131430176).setOnClickListener((View$OnClickListener)new gbw(this, k, 6));
        inflate.findViewById(2131430214).setOnClickListener((View$OnClickListener)new gbw(this, gko, 7));
        this.f = (TextView)inflate.findViewById(2131432474);
        final TextView g = (TextView)inflate.findViewById(2131432475);
        (this.g = g).setTextColor(tmy.cn(g.getContext(), 2130970926));
        this.i = inflate.findViewById(2131430084);
        this.h = inflate.findViewById(2131431333);
        k.l((wxz)new wws(wya.c(116204)));
        k.l((wxz)new wws(wya.c(116205)));
        k.l((wxz)new wws(wya.c(116207)));
        k.l((wxz)new wws(wya.c(116206)));
    }
    
    public final boolean a(final MenuItem menuItem) {
        final int a = ((io)menuItem).a;
        if (a == 2131429079) {
            this.k.J(3, (wxz)new wws(wya.c(116205)), (alff)null);
            this.c.goForward();
            return true;
        }
        if (a == 2131431119) {
            this.k.J(3, (wxz)new wws(wya.c(116207)), (alff)null);
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
        tmy.v(this.h, contains);
        tmy.v(this.i, contains ^ true);
        this.j.setEnabled(c.canGoBack());
        if (this.j.isEnabled()) {
            this.j.setColorFilter(tmy.cn(this.a.getContext(), 2130970924));
        }
        else {
            this.j.setColorFilter(tmy.cn(this.a.getContext(), 2130970922));
        }
        this.a.requestLayout();
    }
}
