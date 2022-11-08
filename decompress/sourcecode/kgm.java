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

final class kgm
{
    public final View a;
    public final vax b;
    public final ImageView c;
    public final ImageView d;
    public final aceo e;
    public final acnj f;
    public final View g;
    public final View h;
    public final View i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final jgc m;
    public aoeq n;
    public CharSequence o;
    public gkz p;
    public gkz q;
    
    public kgm(final Context context, final aceo e, final vax b, final acnj f, final jjg jjg, final byte[] array) {
        b.getClass();
        this.b = b;
        this.e = e;
        this.f = f;
        final View inflate = LayoutInflater.from(context).inflate(2131625419, (ViewGroup)null);
        this.a = inflate;
        this.c = (ImageView)inflate.findViewById(2131432006);
        final ImageView d = (ImageView)inflate.findViewById(2131428086);
        this.d = d;
        if (d != null) {
            d.setOnClickListener((View$OnClickListener)new kfw(this, 2));
        }
        this.g = inflate.findViewById(2131428448);
        this.j = (TextView)inflate.findViewById(2131432092);
        this.k = (TextView)inflate.findViewById(2131431415);
        this.l = (TextView)inflate.findViewById(2131429700);
        this.m = jjg.a((ViewStub)inflate.findViewById(2131427885));
        this.i = inflate.findViewById(2131427853);
        this.h = inflate.findViewById(2131431187);
    }
}
