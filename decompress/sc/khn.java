import android.view.ViewStub;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class khn
{
    public final View a;
    public final vcy b;
    public final ImageView c;
    public final ImageView d;
    public final acgs e;
    public final acpn f;
    public final View g;
    public final View h;
    public final View i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final jhe m;
    public aogt n;
    public CharSequence o;
    public glh p;
    public glh q;
    
    public khn(final Context context, final acgs e, final vcy b, final acpn f, final jki jki, final byte[] array, final byte[] array2) {
        b.getClass();
        this.b = b;
        this.e = e;
        this.f = f;
        final View inflate = LayoutInflater.from(context).inflate(2131625424, (ViewGroup)null);
        this.a = inflate;
        this.c = (ImageView)inflate.findViewById(2131432009);
        final ImageView d = (ImageView)inflate.findViewById(2131428086);
        this.d = d;
        if (d != null) {
            d.setOnClickListener((View$OnClickListener)new kgx(this, 2));
        }
        this.g = inflate.findViewById(2131428448);
        this.j = (TextView)inflate.findViewById(2131432095);
        this.k = (TextView)inflate.findViewById(2131431418);
        this.l = (TextView)inflate.findViewById(2131429700);
        this.m = jki.a((ViewStub)inflate.findViewById(2131427885));
        this.i = inflate.findViewById(2131427853);
        this.h = inflate.findViewById(2131431190);
    }
}
