import android.text.Spanned;
import android.widget.FrameLayout$LayoutParams;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import java.util.function.IntConsumer;
import android.widget.TextView;
import app.revanced.integrations.patches.SuggestedActionsPatch;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdd implements acko
{
    public final vcy a;
    public final Runnable b;
    public final Context c;
    public final tmx d;
    public final ashi e;
    public wyw f;
    public aonv g;
    public int h;
    public asir i;
    public pvh j;
    private final acpk k;
    private final acgs l;
    private View m;
    private final vaf n;
    
    public jdd(final Context c, final vcy a, final acpk k, final acgs l, final vaf n, final tmx d, final iya iya, final Runnable b) {
        this.c = c;
        this.a = a;
        this.k = k;
        this.l = l;
        this.n = n;
        this.b = b;
        this.d = d;
        this.m = null;
        this.g = null;
        this.i = null;
        this.e = iya.a();
    }
    
    static void d(final Throwable t) {
        ttr.d("Failed to update number of player controls open trigger suggested action dismissals.", t);
    }
    
    private final void h() {
        if (this.m != null) {
            return;
        }
        final View inflate = LayoutInflater.from(this.c).inflate(2131625606, (ViewGroup)null);
        SuggestedActionsPatch.hideSuggestedActions(inflate);
        this.m = inflate;
        alxp alxp;
        if ((alxp = this.n.b().e) == null) {
            alxp = alxp.a;
        }
        if (!alxp.aI) {
            return;
        }
        final View m = this.m;
        m.getClass();
        final TextView textView = (TextView)m.findViewById(2131427483);
        tpe.cz(this.c, 2130970913).ifPresent((IntConsumer)new rkv(this, textView, 1));
        textView.setPaddingRelative(textView.getPaddingStart(), textView.getPaddingTop(), this.c.getResources().getDimensionPixelSize(2131170059), textView.getPaddingBottom());
        apk.c((ImageView)m.findViewById(2131427470), tpe.ct(this.c, 2130970885));
        final ImageView imageView = (ImageView)m.findViewById(2131427472);
        imageView.setPaddingRelative(this.c.getResources().getDimensionPixelSize(2131170056), imageView.getPaddingTop(), imageView.getPaddingEnd(), imageView.getPaddingBottom());
    }
    
    public final View a() {
        this.h();
        final View m = this.m;
        m.getClass();
        return m;
    }
    
    public final ahab b() {
        final aonv aonv = (aonv)this.a().getTag();
        if (aonv != null) {
            return aonv.h;
        }
        return null;
    }
    
    public final void c(final acku acku) {
    }
    
    public final void f(final ackm ackm, final aonv aonv) {
        this.g = aonv;
        this.h();
        this.f = ((wyy)ackm).a;
        ajut ajut;
        if ((ajut = aonv.e) == null) {
            ajut = ajut.a;
        }
        final Spanned b = acak.b(ajut);
        final View m = this.m;
        m.getClass();
        ((TextView)m.findViewById(2131427483)).setText((CharSequence)b);
        final ImageView imageView = (ImageView)m.findViewById(2131427472);
        final int c = aonv.c;
        if (c == 2) {
            final acpk k = this.k;
            akdh akdh;
            if ((akdh = akdh.b(((akdi)aonv.d).c)) == null) {
                akdh = akdh.a;
            }
            final int a = k.a(akdh);
            if (a != 0) {
                imageView.setImageDrawable(agx.a(this.c, a));
                apk.c(imageView, ColorStateList.valueOf(tpe.cr(this.c, 2130970908)));
            }
            else {
                imageView.setImageDrawable((Drawable)null);
            }
        }
        else if (c == 13) {
            this.l.g(imageView, (aotp)aonv.d);
        }
        else {
            imageView.setImageDrawable((Drawable)null);
        }
        final View viewById = m.findViewById(2131432168);
        aiqj aiqj;
        if ((aiqj = aonv.f) == null) {
            aiqj = aiqj.a;
        }
        viewById.setOnClickListener((View$OnClickListener)new ivc(this, aiqj, 6));
        anb.N(viewById, new jdc((CharSequence)b));
        final ImageView imageView2 = (ImageView)m.findViewById(2131427470);
        imageView2.setOnClickListener((View$OnClickListener)new ivc(this, aonv, 7));
        m.post((Runnable)new iep((View)imageView2, m, 18));
        m.setTag((Object)aonv);
        tut tut = null;
        Label_0467: {
            if ((aonv.b & 0x100) != 0x0) {
                final int ay = aqsx.aY(aonv.i);
                if (ay != 0) {
                    if (ay == 3) {
                        tut = tpe.an(new tut[] { tpe.as(8388691), tpe.aD(-2), tpe.at(this.c.getResources().getDimensionPixelSize(2131170050)), tpe.ax(this.c.getResources().getDimensionPixelSize(2131170055)) });
                        break Label_0467;
                    }
                }
            }
            tut = tpe.an(new tut[] { tpe.as(81), tpe.aD(-2), tpe.at(this.c.getResources().getDimensionPixelSize(2131170050)), tpe.ax(0) });
        }
        tpe.aF(m, tut, (Class)FrameLayout$LayoutParams.class);
        this.g(aonv);
        final wyw f = this.f;
        if (f == null) {
            return;
        }
        f.D((wzz)new wyt(xaa.c(87958)));
    }
    
    public final void g(final aonv aonv) {
        if (aonv == null) {
            return;
        }
        int n = 0;
        Label_0067: {
            if ((aonv.b & 0x100) != 0x0) {
                final int ay = aqsx.aY(aonv.i);
                if (ay != 0) {
                    if (ay == 3) {
                        n = this.c.getResources().getDimensionPixelSize(2131170054);
                        break Label_0067;
                    }
                }
            }
            n = this.c.getResources().getDimensionPixelSize(2131170047);
        }
        final View m = this.m;
        m.getClass();
        tpe.aF(m, tpe.aq(this.h + n), (Class)FrameLayout$LayoutParams.class);
        m.requestLayout();
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        this.f(ackm, (aonv)o);
    }
}
