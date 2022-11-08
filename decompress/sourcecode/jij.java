import android.content.Intent;
import android.net.Uri;
import android.net.Uri$Builder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.app.Activity;
import android.view.View$OnLayoutChangeListener;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jij extends acja implements View$OnClickListener, View$OnLayoutChangeListener
{
    private final Activity a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final aceo e;
    private final ImageView f;
    private final ImageView g;
    private final ImageView h;
    private final ImageView i;
    private String j;
    private ajvm k;
    private float l;
    
    public jij(final Activity a, final aceo e, final ViewGroup viewGroup) {
        this.l = 0.0f;
        this.a = a;
        this.e = e;
        final View inflate = LayoutInflater.from((Context)a).inflate(2131624489, viewGroup, false);
        this.b = inflate;
        this.c = (TextView)inflate.findViewById(2131430402);
        this.d = (TextView)inflate.findViewById(2131430389);
        this.f = (ImageView)inflate.findViewById(2131430399);
        final ImageView g = (ImageView)inflate.findViewById(2131430401);
        this.g = g;
        final ImageView h = (ImageView)inflate.findViewById(2131432480);
        this.h = h;
        final ImageView i = (ImageView)inflate.findViewById(2131430400);
        this.i = i;
        g.setOnClickListener((View$OnClickListener)this);
        h.setOnClickListener((View$OnClickListener)this);
        i.setOnClickListener((View$OnClickListener)this);
        inflate.addOnLayoutChangeListener((View$OnLayoutChangeListener)this);
    }
    
    private final void f() {
        if (this.k == null) {
            return;
        }
        ImageView imageView;
        int round;
        if (this.h.getVisibility() == 0) {
            final float l = this.l;
            if (l == 0.0f) {
                return;
            }
            imageView = this.h;
            round = Math.round(l * 300.0f);
        }
        else {
            imageView = this.g;
            round = 300;
        }
        final Uri$Builder path = new Uri$Builder().scheme("https").authority("maps.googleapis.com").path("/maps/api/staticmap");
        ajvk ajvk;
        if ((ajvk = this.k.f) == null) {
            ajvk = ajvk.a;
        }
        final Uri$Builder appendQueryParameter = path.appendQueryParameter("key", ajvk.e);
        final StringBuilder sb = new StringBuilder();
        sb.append(round);
        sb.append("x300");
        final Uri$Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("size", sb.toString());
        final ajvk f = this.k.f;
        ajvk a;
        if (f == null) {
            a = ajvk.a;
        }
        else {
            a = f;
        }
        final double b = a.b;
        ajvk a2 = f;
        if (f == null) {
            a2 = ajvk.a;
        }
        final double c = a2.c;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(b);
        sb2.append(",");
        sb2.append(c);
        final Uri$Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("markers", sb2.toString());
        if (this.k.g.size() > 0) {
            final StringBuilder sb3 = new StringBuilder();
            for (int i = 0; i < this.k.g.size(); ++i) {
                if (i > 0) {
                    sb3.append('|');
                }
                sb3.append(((ajvl)this.k.g.get(i)).b);
                sb3.append(',');
                sb3.append(((ajvl)this.k.g.get(i)).c);
            }
            appendQueryParameter3.appendQueryParameter("visible", sb3.toString());
        }
        String.valueOf(appendQueryParameter3.build());
        this.e.f(imageView, appendQueryParameter3.build());
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void c(final acir acir) {
    }
    
    public final void onClick(final View view) {
        final String j = this.j;
        if (j != null) {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(j)));
        }
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (n3 - n == n7 - n5) {
            return;
        }
        this.l = this.h.getWidth() / (float)this.h.getHeight();
        this.f();
    }
}
