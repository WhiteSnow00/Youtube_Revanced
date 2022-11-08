import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import android.view.View;
import android.widget.LinearLayout;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdx
{
    public final ViewGroup a;
    public final aceo b;
    public final int c;
    final ImageView d;
    final TextView e;
    final TextView f;
    final TextView g;
    final ImageView h;
    final gkv i;
    final fyl j;
    public final /* synthetic */ kdy k;
    public final uyf l;
    
    public kdx(final kdy k, final Context context, final aceo b, final uyf l, final boolean b2) {
        this.k = k;
        this.b = b;
        this.l = l;
        if (tmy.bq(context) && gkt.F(l)) {
            this.a = (ViewGroup)View.inflate(context, 2131624258, (ViewGroup)null);
        }
        else {
            this.a = (ViewGroup)View.inflate(context, 2131624257, (ViewGroup)null);
        }
        this.d = (ImageView)this.a.findViewById(2131432006);
        this.e = (TextView)this.a.findViewById(2131432092);
        this.f = (TextView)this.a.findViewById(2131431819);
        final TextView g = (TextView)this.a.findViewById(2131427916);
        this.g = g;
        this.i = k.k.b(g);
        (this.h = (ImageView)this.a.findViewById(2131428701)).setOnClickListener((View$OnClickListener)new jtw(this, 15));
        this.c = context.getResources().getDimensionPixelSize(2131169768);
        final fyl j = new fyl(tmy.ct(context, 2130970822).orElse(0), context.getResources().getDimensionPixelSize(2131167246));
        this.j = j;
        if (b2) {
            g.setOnClickListener((View$OnClickListener)new kdw(this, context, 0));
            j.e(false);
        }
    }
}
