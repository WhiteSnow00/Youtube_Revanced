import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyb
{
    public int a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public View$OnClickListener e;
    public CharSequence f;
    public View$OnClickListener g;
    public int h;
    public boolean i;
    public adcd j;
    public adcd k;
    private final View l;
    private int m;
    
    public acyb(final View l) {
        this.l = l;
    }
    
    private static final void c(final TextView textView, final adcd adcd) {
        if (adcd == null) {
            return;
        }
        final Resources resources = textView.getResources();
        textView.setTextColor(adcd.a);
        final int b = adcd.b;
        Drawable drawable;
        if (b == 0) {
            drawable = null;
        }
        else {
            drawable = resources.getDrawable(b);
        }
        tqf.r((View)textView, drawable);
    }
    
    private static final void d(final View view, final View$OnClickListener view$OnClickListener, final acgn acgn) {
        view.setOnClickListener((View$OnClickListener)new zig(view$OnClickListener, acgn, 8, (byte[])null));
    }
    
    public final void a() {
        this.m = 2;
    }
    
    public final acgn b() {
        final View inflate = View.inflate(this.l.getContext(), 2131625652, (ViewGroup)null);
        final TextView textView = (TextView)inflate.findViewById(2131432134);
        final TextView textView2 = (TextView)inflate.findViewById(2131432131);
        final TextView textView3 = (TextView)inflate.findViewById(2131427452);
        final TextView textView4 = (TextView)inflate.findViewById(2131428701);
        c(textView3, this.j);
        c(textView4, this.k);
        tqf.t(textView, this.b);
        tqf.t(textView2, this.c);
        tqf.t(textView3, this.d);
        tqf.t(textView4, this.f);
        tqf.r((View)textView3, textView3.getBackground());
        tqf.r((View)textView4, textView4.getBackground());
        if (textView.getVisibility() == 8) {
            tqf.aF((View)textView2, tqf.aB(0), (Class)ViewGroup$MarginLayoutParams.class);
        }
        acgn acgn;
        if (this.i) {
            acgn = new acgn(inflate, this.a, this.l, this.m, this.h);
        }
        else {
            acgn = new acgn(inflate, this.a, this.l, this.m);
        }
        d((View)textView3, this.e, acgn);
        d((View)textView4, this.g, acgn);
        return acgn;
    }
}
