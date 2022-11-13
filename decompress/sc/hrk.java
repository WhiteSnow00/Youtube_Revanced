import java.util.List;
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

public final class hrk
{
    public final int a;
    public final int b;
    public final Context c;
    public final vcy d;
    public hrj e;
    public angx f;
    public ViewTreeObserver$OnGlobalLayoutListener g;
    public Dialog h;
    public int i;
    public int j;
    public final aujg k;
    private final wyv l;
    private final acpk m;
    
    public hrk(final Context c, final vcy d, final wyv l, final aujg k, final acpk m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.d = d;
        this.l = l;
        this.k = k;
        this.m = m;
        this.a = c.getResources().getDimensionPixelSize(2131170261);
        this.b = c.getResources().getDimensionPixelSize(2131170257);
    }
    
    public static afeq c(final angw angw) {
        final ArrayList list = new ArrayList();
        final Iterator<Object> iterator = ((List<Object>)angw.d).iterator();
        while (iterator.hasNext()) {
            final angy d = d(iterator.next());
            if (d != null) {
                list.add(d);
            }
        }
        if (list.isEmpty()) {
            anuv anuv;
            if ((anuv = angw.c) == null) {
                anuv = anuv.a;
            }
            final angy d2 = d(anuv);
            if (d2 != null) {
                list.add(d2);
            }
        }
        return afeq.o((Collection)list);
    }
    
    public static angy d(final anuv anuv) {
        final angy angy = (angy)aakt.v(anuv, (ahaq)PlayerOverlayVideoInteractionsOuterClass.videoInteractionPopUpRenderer);
        if (angy != null && (angy.b & 0x8) != 0x0) {
            return angy;
        }
        return null;
    }
    
    public static boolean h(final angy angy, final angy angy2) {
        if (angy == null || (angy.b & 0x1) == 0x0) {
            return false;
        }
        if (angy2 != null && (angy2.b & 0x1) != 0x0) {
            ajut ajut;
            if ((ajut = angy.c) == null) {
                ajut = ajut.a;
            }
            final int length = acak.b(ajut).length();
            ajut ajut2;
            if ((ajut2 = angy2.c) == null) {
                ajut2 = ajut.a;
            }
            return length > acak.b(ajut2).length();
        }
        return true;
    }
    
    private final void i(final ImageView imageView, final akdh akdh) {
        final Drawable drawable = this.c.getResources().getDrawable(this.m.a(akdh));
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
        if (view != null && tsy.e(this.c)) {
            final Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            return new Point(rect.centerX(), rect.centerY());
        }
        final hrj e = this.e;
        return new Point(e.a, e.b);
    }
    
    public final View b(View viewById, final afeq afeq) {
        final View inflate = ((LayoutInflater)this.c.getSystemService("layout_inflater")).inflate(2131625724, (ViewGroup)this.e, false);
        final View viewById2 = inflate.findViewById(2131432139);
        final View viewById3 = inflate.findViewById(2131427827);
        if (this.a(viewById).y < this.b) {
            viewById2.setVisibility(0);
            viewById3.setVisibility(8);
        }
        else {
            viewById2.setVisibility(8);
            viewById3.setVisibility(0);
        }
        final LinearLayout linearLayout = (LinearLayout)inflate.findViewById(2131432319);
        for (int i = 0; i < afeq.size(); ++i) {
            final angy angy = (angy)afeq.get(i);
            final int size = afeq.size();
            final View inflate2 = ((LayoutInflater)this.c.getSystemService("layout_inflater")).inflate(2131625723, (ViewGroup)linearLayout, false);
            inflate2.setOnClickListener((View$OnClickListener)new hqd(this, angy, 3));
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
            tpe.r(inflate2, drawable);
            if (angy != null && (angy.b & 0x2) != 0x0) {
                final ImageView imageView = (ImageView)inflate2.findViewById(2131432321);
                akdi akdi;
                if ((akdi = angy.d) == null) {
                    akdi = akdi.a;
                }
                akdh akdh;
                if ((akdh = akdh.b(akdi.c)) == null) {
                    akdh = akdh.a;
                }
                this.i(imageView, akdh);
                inflate2.findViewById(2131428662).setVisibility(0);
            }
            if (angy != null && (angy.b & 0x4) != 0x0) {
                final ImageView imageView2 = (ImageView)inflate2.findViewById(2131432320);
                akdi akdi2;
                if ((akdi2 = angy.e) == null) {
                    akdi2 = akdi.a;
                }
                akdh akdh2;
                if ((akdh2 = akdh.b(akdi2.c)) == null) {
                    akdh2 = akdh.a;
                }
                this.i(imageView2, akdh2);
                inflate2.findViewById(2131428662).setVisibility(8);
            }
            if (angy != null) {
                final int b = angy.b;
                if ((b & 0x4) == 0x0) {
                    if ((b & 0x2) == 0x0) {
                        viewById = inflate2.findViewById(2131432320);
                        float scaleX;
                        if (anb.f(inflate2) == 1) {
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
            if (angy != null && (angy.b & 0x1) != 0x0) {
                final TextView textView = (TextView)inflate2.findViewById(2131428668);
                ajut ajut;
                if ((ajut = angy.c) == null) {
                    ajut = ajut.a;
                }
                textView.setText((CharSequence)acak.b(ajut));
            }
            linearLayout.addView(inflate2);
        }
        return inflate;
    }
    
    public final void e(final ahab ahab) {
        if (ahab == null) {
            return;
        }
        this.l.pF().l((wzz)new wyt(ahab));
    }
    
    public final void f(final ahab ahab) {
        if (ahab == null) {
            return;
        }
        this.l.pF().J(3, (wzz)new wyt(ahab), (alhi)null);
    }
    
    public final void g() {
        final Dialog h = this.h;
        if (h != null) {
            h.dismiss();
        }
    }
}
