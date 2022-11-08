import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewStub;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzy extends fzx
{
    private final acng a;
    private final Context b;
    
    public fzy(final acng a, final Context b, final View view) {
        super(view);
        this.a = a;
        this.b = b;
    }
    
    public fzy(final acng a, final Context b, final ViewStub viewStub) {
        super(viewStub);
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final View f = super.f;
        if (f != null) {
            tmy.v(f, false);
        }
    }
    
    public final void f(final amfl amfl) {
        if (amfl == null) {
            this.a();
            return;
        }
        final View c = this.c();
        final ImageView imageView = (ImageView)c.findViewById(2131427764);
        final TextView textView = (TextView)c.findViewById(2131427767);
        if (imageView != null) {
            if (textView != null) {
                tmy.v(c, true);
                if ((amfl.b & 0x1) != 0x0) {
                    final gfd gfd = new gfd(this.b, this.a);
                    akbf akbf;
                    if ((akbf = amfl.c) == null) {
                        akbf = akbf.a;
                    }
                    akbe akbe;
                    if ((akbe = akbe.b(akbf.c)) == null) {
                        akbe = akbe.a;
                    }
                    imageView.setImageResource(gfd.a(akbe));
                }
                tmy.v((View)imageView, 0x1 == (amfl.b & 0x1));
                tmy.t(textView, (CharSequence)amfl.e);
                if ((amfl.b & 0x80) != 0x0) {
                    ahgm ahgm;
                    if ((ahgm = amfl.g) == null) {
                        ahgm = ahgm.a;
                    }
                    c.setContentDescription((CharSequence)ahgm.c);
                }
                else {
                    c.setContentDescription((CharSequence)null);
                }
                final View f = super.f;
                if (f != null) {
                    final ImageView imageView2 = (ImageView)f.findViewById(2131427764);
                    final TextView textView2 = (TextView)f.findViewById(2131427767);
                    int dm;
                    if ((dm = aqql.dm(amfl.d)) == 0) {
                        dm = 1;
                    }
                    if (--dm == 3) {
                        f.setBackground(b(this.b));
                        textView2.setTextColor(tmy.ct(this.b, 2130970850).orElse(0));
                        apj.c(imageView2, tmy.cp(this.b, 2130970850));
                        return;
                    }
                    if (dm != 4) {
                        Label_0857: {
                            if (dm != 6) {
                                if (dm == 22) {
                                    f.setBackground(agw.a(this.b, 2131233133));
                                    textView2.setTextColor(tmy.cn(this.b, 2130970884));
                                    apj.c(imageView2, tmy.cp(this.b, 2130970884));
                                    return;
                                }
                                if (dm == 31) {
                                    final Context b = this.b;
                                    textView2.setTextAppearance(b, tmy.co(b, 2130970914));
                                    textView2.setTextColor(tmy.cn(this.b, 2130970884));
                                    return;
                                }
                                if (dm != 17) {
                                    if (dm != 18) {
                                        switch (dm) {
                                            case 13: {
                                                f.setBackground(b(this.b));
                                                textView2.setTextColor(tmy.ct(this.b, 2130970850).orElse(0));
                                                imageView2.setColorFilter(tmy.ct(this.b, 2130970850).orElse(0));
                                                return;
                                            }
                                            case 11: {
                                                textView2.setPaintFlags(textView2.getPaintFlags() | 0x10);
                                                break;
                                            }
                                            case 12: {
                                                break Label_0857;
                                            }
                                        }
                                        f.setBackground(b(this.b));
                                        textView2.setTextColor(tmy.ct(this.b, 2130970839).orElse(0));
                                        imageView2.setColorFilter(tmy.ct(this.b, 2130970839).orElse(0));
                                        return;
                                    }
                                    f.setBackgroundResource(2131231290);
                                    textView2.setTextColor(tmy.cn(this.b, 2130970908));
                                    apj.c(imageView2, tmy.cp(this.b, 2130970908));
                                    return;
                                }
                                else if (amfl.e.isEmpty()) {
                                    final View f2 = super.f;
                                    if (f2 != null) {
                                        final ImageView imageView3 = (ImageView)f2.findViewById(2131427764);
                                        final TextView textView3 = (TextView)f2.findViewById(2131427767);
                                        f2.setBackground((Drawable)null);
                                        f2.setPadding(0, 0, 0, 0);
                                        textView3.setTextColor(tmy.cn(this.b, 2130970926));
                                        textView3.setPadding(0, 0, 0, 0);
                                        final int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(2131167936);
                                        tmy.aF((View)imageView3, tmy.an(new tsp[] { tmy.ay(0, 0, 0, 0), tmy.aE(dimensionPixelSize, dimensionPixelSize) }), (Class)ViewGroup$MarginLayoutParams.class);
                                    }
                                    return;
                                }
                                else {
                                    final View f3 = super.f;
                                    if (f3 != null) {
                                        final ImageView imageView4 = (ImageView)f3.findViewById(2131427764);
                                        final TextView textView4 = (TextView)f3.findViewById(2131427767);
                                        f3.setBackground(b(this.b));
                                        f3.setPadding(0, 0, 0, 0);
                                        textView4.setTextColor(tmy.cn(this.b, 2130970926));
                                        final int dimensionPixelSize2 = this.b.getResources().getDimensionPixelSize(2131167937);
                                        textView4.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
                                        final int dimensionPixelSize3 = this.b.getResources().getDimensionPixelSize(2131167938);
                                        final int dimensionPixelSize4 = this.b.getResources().getDimensionPixelSize(2131167936);
                                        tmy.aF((View)imageView4, tmy.an(new tsp[] { tmy.ay(dimensionPixelSize3, dimensionPixelSize3, 0, dimensionPixelSize3), tmy.aE(dimensionPixelSize4, dimensionPixelSize4) }), (Class)ViewGroup$MarginLayoutParams.class);
                                    }
                                    return;
                                }
                            }
                        }
                        f.setBackground((Drawable)null);
                        textView2.setTextColor(tmy.ct(this.b, 2130970839).orElse(0));
                        apj.c(imageView2, tmy.cp(this.b, 2130970864));
                        return;
                    }
                    f.setBackground(b(this.b));
                    textView2.setTextColor(tmy.cn(this.b, 2130970941));
                    imageView2.setColorFilter(tmy.cn(this.b, 2130970941));
                }
            }
        }
    }
}
