import android.text.Spanned;
import java.util.List;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ism implements acil, abfu
{
    public aioe a;
    private final aceo b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final View$OnClickListener h;
    private abfv i;
    private wwv j;
    private byte[] k;
    private final /* synthetic */ int l;
    
    public ism(final Context context, final aceo b, final vax vax, final ViewGroup viewGroup, final int l) {
        this.l = l;
        this.b = b;
        final View inflate = LayoutInflater.from(context).inflate(2131624036, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView)inflate.findViewById(2131432006);
        this.e = (TextView)inflate.findViewById(2131432092);
        this.g = (TextView)inflate.findViewById(2131429861);
        this.f = (TextView)inflate.findViewById(2131428769);
        this.h = (View$OnClickListener)new hpi(this, vax, 19);
    }
    
    public ism(final Context context, final aceo b, final vax vax, final ViewGroup viewGroup, final int l, final byte[] array) {
        this.l = l;
        this.b = b;
        final View inflate = LayoutInflater.from(context).inflate(2131624035, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView)inflate.findViewById(2131432006);
        this.g = (TextView)inflate.findViewById(2131432092);
        this.f = (TextView)inflate.findViewById(2131429861);
        this.e = (TextView)inflate.findViewById(2131432299);
        this.h = (View$OnClickListener)new hpi(this, vax, 18, null);
    }
    
    private final void f(final int n) {
        if (n == 2) {
            this.c.setOnClickListener(this.h);
            ana.X(this.c, 0);
            final byte[] k = this.k;
            if (k != null) {
                final wwv j = this.j;
                if (j != null) {
                    j.t((wxz)new wws(k), (alff)null);
                }
            }
            return;
        }
        this.c.setOnClickListener((View$OnClickListener)null);
        this.c.setClickable(false);
        ana.X(this.c, 4);
    }
    
    private final void g(final int n) {
        if (n == 2) {
            ana.X(this.c, 0);
            this.c.setOnClickListener(this.h);
            final byte[] k = this.k;
            if (k != null) {
                final wwv j = this.j;
                if (j != null) {
                    j.t((wxz)new wws(k), (alff)null);
                }
            }
            return;
        }
        this.c.setOnClickListener((View$OnClickListener)null);
        this.c.setClickable(false);
        ana.X(this.c, 4);
    }
    
    @Override
    public final View a() {
        if (this.l != 0) {
            return this.c;
        }
        return this.c;
    }
    
    @Override
    public final void b(final int n, final int n2, final int n3) {
        if (this.l != 0) {
            this.g(n2);
            return;
        }
        this.f(n2);
    }
    
    @Override
    public final void c(final acir acir) {
        if (this.l != 0) {
            final abfv i = this.i;
            if (i != null) {
                i.b(this);
            }
            return;
        }
        final abfv j = this.i;
        if (j != null) {
            j.b(this);
        }
    }
    
    @Override
    public final void d(final float n, final boolean b) {
    }
}
