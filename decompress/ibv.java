import android.widget.CompoundButton$OnCheckedChangeListener;
import android.content.res.Resources$Theme;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import j$.util.Optional;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ibv implements acko, ibt
{
    public final acgs a;
    public final Context b;
    public final View c;
    public final TextView d;
    public final Switch e;
    public final View f;
    public final TextView g;
    public final TextView h;
    public final ImageView i;
    Optional j;
    private final View k;
    private ibu l;
    
    public ibv(final Context b, final acgs a, final vai vai) {
        this.b = b;
        this.a = a;
        this.j = Optional.empty();
        final View inflate = LayoutInflater.from(b).inflate(2131625355, (ViewGroup)null);
        this.c = inflate;
        final TextView d = (TextView)inflate.findViewById(2131427714);
        this.d = d;
        final Switch e = (Switch)inflate.findViewById(2131427716);
        this.e = e;
        final Resources$Theme theme = b.getTheme();
        e.setThumbTintList(b.getResources().getColorStateList(2131101496, theme));
        e.setTrackTintList(b.getResources().getColorStateList(2131101497, theme));
        (this.f = inflate.findViewById(2131427722)).setBackgroundResource(2131231025);
        final TextView g = (TextView)inflate.findViewById(b.getResources().getIdentifier("title", "id", b.getPackageName()));
        this.g = g;
        final TextView h = (TextView)inflate.findViewById(2131428769);
        this.h = h;
        final View viewById = inflate.findViewById(2131432029);
        (this.k = viewById).setBackgroundResource(2131231031);
        final ImageView i = (ImageView)inflate.findViewById(b.getResources().getIdentifier("thumbnail", "id", b.getPackageName()));
        this.i = i;
        d.setTextColor(tpe.cr(b, 2130970924));
        g.setTextColor(tpe.cr(b, 2130970924));
        if (vai.aS()) {
            i.setClipToOutline(true);
            i.setBackgroundResource(2131231033);
            viewById.setBackgroundResource(2131231033);
            h.setClipToOutline(true);
            h.setBackgroundResource(2131233236);
        }
        inflate.findViewById(2131431367).setVisibility(4);
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acku acku) {
        final ibu l = this.l;
        if (l != null) {
            l.b = null;
            this.l = null;
        }
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final ibu l = (ibu)o;
        this.l = l;
        l.b = (ibt)this;
        l.a(l.f);
        l.b(l.e);
        l.c(l.d);
        l.d(l.c, l.g);
        final Optional of = Optional.of((Object)l.a);
        this.j = of;
        this.e.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)of.get());
    }
}
