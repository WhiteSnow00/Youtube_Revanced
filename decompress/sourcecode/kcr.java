import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kcr implements acil
{
    public final Context a;
    public final aceo b;
    public final acnj c;
    public final acng d;
    public final View e;
    public final FixedAspectRatioFrameLayout f;
    public final ImageView g;
    public final View h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final ViewGroup n;
    
    public kcr(final Context a, final aceo b, final acnj c, final acng d) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
        final View inflate = LayoutInflater.from(a).inflate(2131624242, (ViewGroup)null);
        this.e = inflate;
        this.f = (FixedAspectRatioFrameLayout)inflate.findViewById(2131432026);
        this.g = (ImageView)inflate.findViewById(2131432006);
        this.i = (TextView)inflate.findViewById(2131428769);
        this.h = inflate.findViewById(2131428448);
        this.j = (TextView)inflate.findViewById(2131432092);
        this.k = (TextView)inflate.findViewById(2131431819);
        this.l = (TextView)inflate.findViewById(2131432148);
        this.m = (TextView)inflate.findViewById(2131428624);
        this.n = (ViewGroup)inflate.findViewById(2131427882);
    }
}
