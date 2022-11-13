import java.util.List;
import android.view.View;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.view.ViewGroup;
import android.widget.TextView;
import android.text.Html;
import android.text.Spanned;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ica extends ibz
{
    private static final String h;
    
    static {
        h = ttr.a("MDX.MinibarController");
    }
    
    public ica(final Context context, final atke atke) {
        super(context, atke);
    }
    
    private final Spanned d(final String s) {
        return Html.fromHtml(this.a.getString(2132018511, new Object[] { s }), 0);
    }
    
    private final void e() {
        if (!this.f) {
            return;
        }
        final TextView d = this.d;
        final TextView e = this.e;
        final ViewGroup c = this.c;
        if (d != null && e != null) {
            if (c != null) {
                final xsf g = this.g;
                if (g.e == g.d - 1) {
                    final xsd k = g.k;
                    if (k.b == 2) {
                        final PlayerResponseModel a = k.a;
                        if (a != null && !aezr.f(a.J())) {
                            d.setText((CharSequence)this.d(a.J()));
                            e.setText((CharSequence)this.b(this.g));
                            ((View)c).setContentDescription((CharSequence)this.a.getString(2132018507, new Object[] { a.J(), this.g.c }));
                        }
                        else {
                            ttr.m(ica.h, "MdxWatchState's watchNext video is either null or does not have a valid title.");
                        }
                    }
                    else {
                        d.setText((CharSequence)this.a.getString(2132018509));
                        e.setText((CharSequence)"");
                        ((View)c).setContentDescription((CharSequence)this.a.getString(2132018506, new Object[] { this.g.c }));
                    }
                }
                else {
                    final WatchNextResponseModel g2 = g.g;
                    if (g2 == null) {
                        return;
                    }
                    final anjb g3 = g2.g;
                    if (g3 == null) {
                        return;
                    }
                    if (!xrx.a(g3.m)) {
                        return;
                    }
                    final ahbx i = g3.i;
                    final String string = this.a.getString(2132018509);
                    int n = this.g.e + 1;
                    String string2;
                    while (true) {
                        string2 = string;
                        if (n >= ((List)i).size()) {
                            break;
                        }
                        final anja anja = (anja)((List)i).get(n);
                        anjf anjf;
                        if ((anja.b & 0x1) != 0x0) {
                            if ((anjf = anja.c) == null) {
                                anjf = anjf.a;
                            }
                        }
                        else {
                            anjf = null;
                        }
                        if (anjf != null && (anjf.b & 0x1) != 0x0) {
                            ajut ajut;
                            if ((ajut = anjf.d) == null) {
                                ajut = ajut.a;
                            }
                            string2 = acak.b(ajut).toString();
                            break;
                        }
                        ++n;
                    }
                    d.setText((CharSequence)this.d(string2));
                    e.setText((CharSequence)this.b(this.g));
                    ((View)c).setContentDescription((CharSequence)this.a.getString(2132018507, new Object[] { string2, this.g.c }));
                }
                if (!d.getText().toString().isEmpty()) {
                    ((View)c).setVisibility(0);
                }
            }
        }
    }
    
    public final void a(final int n, final xsf g) {
        this.g = g;
        if (g.j != 1) {
            final ViewGroup c = this.c;
            if (c != null) {
                c.setVisibility(8);
            }
            return;
        }
        this.e();
    }
    
    public final void c(ViewGroup c) {
        if (!this.f) {
            if (!super.f) {
                super.c = c;
                final TextView d = (TextView)c.findViewById(2131429881);
                d.getClass();
                super.d = d;
                final TextView e = (TextView)c.findViewById(2131429880);
                e.getClass();
                super.e = e;
                final xsj xsj = (xsj)super.b.a();
                xsj.a((xsh)this);
                super.g = xsj.f;
                super.f = true;
            }
            if (this.g.j != 1) {
                c = this.c;
                if (c != null) {
                    c.setVisibility(8);
                }
                return;
            }
            this.e();
        }
    }
}
