import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.Rect;
import android.graphics.Point;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.protos.youtube.api.innertube.PlayerOverlayVideoInteractionsOuterClass;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import android.app.Dialog;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqq
{
    public final int a;
    public final int b;
    public final Context c;
    public final vax d;
    public hqp e;
    public anet f;
    public ViewTreeObserver$OnGlobalLayoutListener g;
    public Dialog h;
    public int i;
    public int j;
    public final auip k;
    private final wwu l;
    private final acng m;
    
    public hqq(final Context c, final vax d, final wwu l, final auip k, final acng m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.d = d;
        this.l = l;
        this.k = k;
        this.m = m;
        this.a = c.getResources().getDimensionPixelSize(2131170260);
        this.b = c.getResources().getDimensionPixelSize(2131170256);
    }
    
    public static afcr c(final anes anes) {
        final ArrayList list = new ArrayList();
        final Iterator<Object> iterator = anes.d.iterator();
        while (iterator.hasNext()) {
            final aneu d = d(iterator.next());
            if (d != null) {
                list.add(d);
            }
        }
        if (list.isEmpty()) {
            anss anss;
            if ((anss = anes.c) == null) {
                anss = anss.a;
            }
            final aneu d2 = d(anss);
            if (d2 != null) {
                list.add(d2);
            }
        }
        return afcr.o((Collection)list);
    }
    
    public static aneu d(final anss anss) {
        final aneu aneu = (aneu)aaiy.w(anss, (agyr)PlayerOverlayVideoInteractionsOuterClass.videoInteractionPopUpRenderer);
        if (aneu != null && (aneu.b & 0x8) != 0x0) {
            return aneu;
        }
        return null;
    }
    
    public static boolean h(final aneu aneu, final aneu aneu2) {
        if (aneu == null || (aneu.b & 0x1) == 0x0) {
            return false;
        }
        if (aneu2 != null && (aneu2.b & 0x1) != 0x0) {
            ajsq ajsq;
            if ((ajsq = aneu.c) == null) {
                ajsq = ajsq.a;
            }
            final int length = abyh.b(ajsq).length();
            ajsq ajsq2;
            if ((ajsq2 = aneu2.c) == null) {
                ajsq2 = ajsq.a;
            }
            return length > abyh.b(ajsq2).length();
        }
        return true;
    }
    
    private final void i(final ImageView imageView, final akbe akbe) {
        final Drawable drawable = this.c.getResources().getDrawable(this.m.a(akbe));
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            float scaleX;
            if (imageView.getParent().getLayoutDirection() == 1) {
                scaleX = -1.0f;
            }
            else {
                scaleX = 1.0f;
            }
            imageView.setScaleX(scaleX);
        }
    }
    
    public final Point a(final View view) {
        if (view != null && tqt.e(this.c)) {
            final Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            return new Point(rect.centerX(), rect.centerY());
        }
        final hqp e = this.e;
        return new Point(e.a, e.b);
    }
    
    public final View b(View viewById, final afcr afcr) {
        final View inflate = ((LayoutInflater)this.c.getSystemService("layout_inflater")).inflate(2131625720, (ViewGroup)this.e, false);
        final View viewById2 = inflate.findViewById(2131432136);
        final View viewById3 = inflate.findViewById(2131427827);
        if (this.a(viewById).y < this.b) {
            viewById2.setVisibility(0);
            viewById3.setVisibility(8);
        }
        else {
            viewById2.setVisibility(8);
            viewById3.setVisibility(0);
        }
        final LinearLayout linearLayout = (LinearLayout)inflate.findViewById(2131432316);
        for (int i = 0; i < afcr.size(); ++i) {
            final aneu aneu = (aneu)afcr.get(i);
            final int size = afcr.size();
            final View inflate2 = ((LayoutInflater)this.c.getSystemService("layout_inflater")).inflate(2131625719, (ViewGroup)linearLayout, false);
            inflate2.setOnClickListener((View$OnClickListener)new hpi(this, aneu, 3));
            Drawable drawable = inflate2.getBackground();
            if (size > 1) {
                final Context c = this.c;
                int n;
                if (i == 0) {
                    n = 2131233414;
                }
                else {
                    n = 2131233413;
                }
                drawable = c.getDrawable(n);
            }
            tmy.r(inflate2, drawable);
            if (aneu != null && (aneu.b & 0x2) != 0x0) {
                final ImageView imageView = (ImageView)inflate2.findViewById(2131432318);
                akbf akbf;
                if ((akbf = aneu.d) == null) {
                    akbf = akbf.a;
                }
                akbe akbe;
                if ((akbe = akbe.b(akbf.c)) == null) {
                    akbe = akbe.a;
                }
                this.i(imageView, akbe);
                inflate2.findViewById(2131428662).setVisibility(0);
            }
            if (aneu != null && (aneu.b & 0x4) != 0x0) {
                final ImageView imageView2 = (ImageView)inflate2.findViewById(2131432317);
                akbf akbf2;
                if ((akbf2 = aneu.e) == null) {
                    akbf2 = akbf.a;
                }
                akbe akbe2;
                if ((akbe2 = akbe.b(akbf2.c)) == null) {
                    akbe2 = akbe.a;
                }
                this.i(imageView2, akbe2);
                inflate2.findViewById(2131428662).setVisibility(8);
            }
            if (aneu != null) {
                final int b = aneu.b;
                if ((b & 0x4) == 0x0) {
                    if ((b & 0x2) == 0x0) {
                        viewById = inflate2.findViewById(2131432317);
                        float scaleX;
                        if (ana.f(inflate2) == 1) {
                            scaleX = -1.0f;
                        }
                        else {
                            scaleX = 1.0f;
                        }
                        viewById.setScaleX(scaleX);
                        viewById.setVisibility(0);
                    }
                }
            }
            if (aneu != null && (aneu.b & 0x1) != 0x0) {
                final TextView textView = (TextView)inflate2.findViewById(2131428668);
                ajsq ajsq;
                if ((ajsq = aneu.c) == null) {
                    ajsq = ajsq.a;
                }
                textView.setText((CharSequence)abyh.b(ajsq));
            }
            linearLayout.addView(inflate2);
        }
        return inflate;
    }
    
    public final void e(final agyc agyc) {
        if (agyc == null) {
            return;
        }
        this.l.n().l((wxz)new wws(agyc));
    }
    
    public final void f(final agyc agyc) {
        if (agyc == null) {
            return;
        }
        this.l.n().J(3, (wxz)new wws(agyc), (alff)null);
    }
    
    public final void g() {
        final Dialog h = this.h;
        if (h != null) {
            h.dismiss();
        }
    }
}
