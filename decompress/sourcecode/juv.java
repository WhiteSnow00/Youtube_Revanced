import android.widget.RelativeLayout$LayoutParams;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.view.View$OnClickListener;
import android.view.View$OnFocusChangeListener;
import android.widget.TextView$OnEditorActionListener;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.SearchEditText;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class juv extends acja
{
    public final Context a;
    public final ViewGroup b;
    public final SearchEditText c;
    public final TextView d;
    public final Animation e;
    public boolean f;
    public CharSequence g;
    public jut h;
    public boolean i;
    private final acng j;
    private final tdz k;
    private final ImageView l;
    private final ImageView m;
    private final Animation n;
    private boolean o;
    private anuy p;
    private String q;
    
    public juv(final Context a, final acng j, final tdz k, final uyi uyi) {
        this.a = a;
        this.j = j;
        this.k = k;
        final ViewGroup b = (ViewGroup)View.inflate(a, 2131625313, (ViewGroup)null);
        this.b = b;
        final SearchEditText c = (SearchEditText)b.findViewById(2131431289);
        (this.c = c).addTextChangedListener((TextWatcher)new eyi(this, 6));
        c.setOnEditorActionListener((TextView$OnEditorActionListener)new hdd(this, 3));
        c.setOnFocusChangeListener((View$OnFocusChangeListener)new gbv(this, 3));
        this.l = (ImageView)b.findViewById(2131431291);
        (this.m = (ImageView)b.findViewById(2131428211)).setOnClickListener((View$OnClickListener)new jtw(this, 4));
        final TextView d = (TextView)b.findViewById(2131427996);
        this.d = d;
        if (uyi.aO()) {
            d.setAllCaps(false);
        }
        d.setOnClickListener((View$OnClickListener)new jtw(this, 5));
        if (uyi.aT()) {
            tmy.r((View)d, (Drawable)new ColorDrawable(tmy.cn(a, 2130970829)));
        }
        else {
            tmy.r((View)d, d.getBackground());
        }
        (this.e = AnimationUtils.loadAnimation(a, 2130772099)).setAnimationListener((Animation$AnimationListener)new cbh(this, 9));
        (this.n = AnimationUtils.loadAnimation(a, 2130772098)).setAnimationListener((Animation$AnimationListener)new cbh(this, 10));
        this.i = false;
        if (uyi.aT()) {
            b.findViewById(2131428419).setBackgroundColor(tmy.cn(a, 2130970829));
        }
    }
    
    private final void l() {
        this.c.setText(this.g);
    }
    
    public final View a() {
        return (View)this.b;
    }
    
    public final void c(final acir acir) {
    }
    
    public final void f() {
        if (this.i) {
            this.d.startAnimation(this.n);
            this.i = false;
        }
    }
    
    public final void g() {
        this.g = "";
        this.l();
        this.j();
    }
    
    public final void h(final boolean b) {
        if (this.c.getEditableText().length() == 0 && !b) {
            return;
        }
        tmy.p((View)this.c);
        final jut h = this.h;
        if (h != null) {
            h.d();
        }
        this.k.f((Object)new juu(this.c.getEditableText().toString(), this.q));
    }
    
    public final void i() {
        this.d.clearAnimation();
        if (this.g.length() <= 0 && !this.f) {
            this.d.setVisibility(8);
            this.i = false;
            return;
        }
        this.d.setVisibility(0);
        this.i = true;
    }
    
    public final void j() {
        if (!this.o) {
            this.m.setImageAlpha(0);
            this.m.setVisibility(8);
            return;
        }
        this.m.setVisibility(0);
        tsp tsp;
        if (this.c.getEditableText().length() == 0) {
            tsp = tmy.ap(16, 2131427996);
            this.m.setImageAlpha(0);
            this.m.setClickable(false);
        }
        else {
            tsp = tmy.ap(16, 2131428211);
            this.m.setImageAlpha(255);
            this.m.setClickable(true);
        }
        tmy.aF((View)this.c, tsp, (Class)RelativeLayout$LayoutParams.class);
    }
}
