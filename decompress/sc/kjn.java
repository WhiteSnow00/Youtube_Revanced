import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.content.res.Resources;
import android.view.View;
import android.content.Context;
import android.view.ViewStub;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjn
{
    public final vgy A;
    public final hyx B;
    public final int a;
    public final int b;
    public final int c;
    public final ViewStub d;
    public final Context e;
    public final acgs f;
    public final vcy g;
    public final acpn h;
    public final rzy i;
    public final oyy j;
    public final View k;
    public final Resources l;
    public kmh m;
    public View n;
    public View o;
    public View p;
    public TextView q;
    public TextView r;
    public TextView s;
    public RatingBar t;
    public TextView u;
    public TextView v;
    public TextView w;
    public ImageView x;
    public View y;
    public Drawable z;
    
    protected kjn(final Context e, final acgs f, final vcy g, final acpn h, final rzy i, final oyy j, final vgy a, final hyx b, final View k, final int n, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.A = a;
        this.B = b;
        k.getClass();
        this.k = k;
        this.l = e.getResources();
        this.a = tpe.cx(e, 2130968626).orElse(0);
        this.b = tpe.cx(e, 2130968634).orElse(0);
        this.c = tpe.cx(e, 2130968624).orElse(0);
        this.d = (ViewStub)k.findViewById(n);
    }
}
