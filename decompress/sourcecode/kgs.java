import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.GridLayout$LayoutParams;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.GridLayout;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgs extends acja
{
    public final vax a;
    public aoru b;
    public Map c;
    private final acng d;
    private final giz e;
    private final GridLayout f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    
    public kgs(final Context context, final acng d, final vax a, final giz e) {
        this.d = d;
        this.a = a;
        this.e = e;
        final View inflate = LayoutInflater.from(context).inflate(2131625631, (ViewGroup)null);
        final View viewById = inflate.findViewById(2131428027);
        this.f = (GridLayout)inflate.findViewById(2131428424);
        this.g = (ImageView)inflate.findViewById(2131429270);
        this.h = (TextView)inflate.findViewById(2131432092);
        this.i = (TextView)inflate.findViewById(2131429361);
        this.j = (TextView)inflate.findViewById(2131428624);
        viewById.setOnClickListener((View$OnClickListener)new kfw(this, 3));
        e.c(inflate);
    }
    
    private static GridLayout$LayoutParams f(final int n, final int n2, final int n3) {
        return new GridLayout$LayoutParams(GridLayout.spec(n, n3, GridLayout.CENTER), GridLayout.spec(n2, 1));
    }
    
    public final View a() {
        return this.e.a;
    }
    
    public final void c(final acir acir) {
    }
}
