import java.util.Collection;
import android.content.res.ColorStateList;
import java.util.Iterator;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.ProgressBar;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.util.SparseArray;
import java.util.ArrayList;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.mdx.WatchOnTvMenuItem;
import android.content.Context;
import android.app.Activity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgz implements acko
{
    final Object a;
    public final Object b;
    public final Object c;
    private final View d;
    private final int e;
    private final Object f;
    private final Object g;
    private final Object h;
    
    public kgz(final Activity activity, final Context context, final mam mam, final WatchOnTvMenuItem watchOnTvMenuItem, final int e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        final ViewGroup f = (ViewGroup)View.inflate(context, 2131624904, (ViewGroup)null);
        this.f = f;
        final ViewGroup viewGroup = f;
        this.g = f.findViewById(2131432095);
        final ViewGroup viewGroup2 = f;
        final View viewById = f.findViewById(2131428448);
        this.d = viewById;
        this.h = activity.getMenuInflater();
        final np a = new np(context, viewById);
        this.a = a;
        final kgy d = new kgy(this);
        final np np = a;
        a.d = (no)d;
        viewById.setOnClickListener((View$OnClickListener)new kgx(this, 0));
        final ArrayList c = new ArrayList();
        ((Collection<WatchOnTvMenuItem>)(this.c = c)).add(watchOnTvMenuItem);
        c.add(mam.e());
        this.b = new SparseArray();
        aald.E((View)f, (acko)this);
    }
    
    public kgz(final Context context, final int e) {
        this.e = e;
        context.getClass();
        this.a = context.getResources();
        final LinearLayout g = (LinearLayout)View.inflate(context, 2131625779, (ViewGroup)null);
        this.g = g;
        final LinearLayout linearLayout = g;
        this.f = g.findViewById(2131427916);
        this.h = agx.a(context, 2131231425);
        this.b = agx.a(context, 2131231422);
        final LinearLayout linearLayout2 = g;
        this.c = g.findViewById(2131429479);
        final LinearLayout linearLayout3 = g;
        this.d = g.findViewById(2131428939);
        anb.N((View)g, (akw)new jkw(this, (byte[])null));
    }
    
    public kgz(final Context context, final int e, final byte[] array) {
        this.e = e;
        final View inflate = LayoutInflater.from(context).inflate(2131624090, (ViewGroup)null);
        this.a = inflate;
        final View view = inflate;
        this.g = inflate.findViewById(2131429586);
        final View view2 = inflate;
        this.b = inflate.findViewById(2131429582);
        final View view3 = inflate;
        this.f = inflate.findViewById(2131429587);
        final View view4 = inflate;
        this.c = inflate.findViewById(2131429588);
        final View view5 = inflate;
        this.h = inflate.findViewById(2131429584);
        final View view6 = inflate;
        this.d = inflate.findViewById(2131429677);
    }
    
    public kgz(final Context context, final acgs g, final ziy ziy, final ViewGroup viewGroup, final int e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.e = e;
        this.g = g;
        final View inflate = LayoutInflater.from(context).inflate(2131625803, viewGroup, false);
        this.a = inflate;
        final View view = inflate;
        this.b = inflate.findViewById(2131429296);
        final View view2 = inflate;
        this.f = inflate.findViewById(2131432095);
        final View view3 = inflate;
        this.d = inflate.findViewById(2131431822);
        final View view4 = inflate;
        final TextView h = (TextView)inflate.findViewById(2131427916);
        this.h = h;
        final TextView textView = h;
        this.c = ziy.ap(h);
    }
    
    public kgz(final Context context, final vcy f, final ziy ziy, final ViewGroup viewGroup, final int e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.e = e;
        this.f = f;
        final View inflate = LayoutInflater.from(context).inflate(2131625474, viewGroup, false);
        this.a = inflate;
        final View view = inflate;
        this.h = inflate.findViewById(2131427585);
        final View view2 = inflate;
        final YouTubeTextView b = (YouTubeTextView)inflate.findViewById(2131427452);
        this.b = b;
        this.g = ziy.ap((TextView)b);
        final View view3 = inflate;
        final YouTubeTextView d = (YouTubeTextView)inflate.findViewById(2131431319);
        this.d = (View)d;
        this.c = ziy.ap((TextView)d);
    }
    
    @Override
    public final View a() {
        final int e = this.e;
        Object o;
        if (e != 0) {
            if (e != 1) {
                if (e != 2) {}
                o = this.a;
            }
            else {
                o = this.g;
            }
        }
        else {
            o = this.f;
        }
        return (View)o;
    }
    
    @Override
    public final void c(final acku acku) {
        final int e = this.e;
        if (e == 0) {
            ((np)this.a).c.b();
            return;
        }
        if (e != 2) {
            return;
        }
        ((acgs)this.g).d((ImageView)this.b);
    }
    
    @Override
    public final void mN(final ackm ackm, Object o) {
        final int e = this.e;
        final aicz aicz = null;
        if (e == 0) {
            final fzw fzw = (fzw)o;
            ((TextView)this.g).setText((CharSequence)fzw.a);
            ((SparseArray)this.b).clear();
            for (final fzi fzi : fzw.b) {
                o = this.b;
                ((SparseArray)o).put(fzi.j(), (Object)fzi);
            }
            for (final fzi fzi2 : this.c) {
                ((SparseArray)this.b).put(fzi2.j(), (Object)fzi2);
            }
            ((Menu)((np)this.a).b).clear();
            ezt.p((Menu)((np)this.a).b, (MenuInflater)this.h, (tqb)null, (SparseArray)this.b, 0);
            return;
        }
        if (e != 1) {
            if (e != 2) {
                if (e == 3) {
                    final aojk aojk = (aojk)o;
                    final wyw a = ackm.a;
                    final Object h = this.h;
                    ajut ajut;
                    if ((aojk.b & 0x1) != 0x0) {
                        if ((ajut = aojk.c) == null) {
                            ajut = ajut.a;
                        }
                    }
                    else {
                        ajut = null;
                    }
                    tpe.t((TextView)h, (CharSequence)vde.a(ajut, (vcy)this.f, false));
                    final Object g = this.g;
                    anuv anuv;
                    if ((anuv = aojk.d) == null) {
                        anuv = anuv.a;
                    }
                    aicz aicz2;
                    if (anuv.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
                        anuv anuv2;
                        if ((anuv2 = aojk.d) == null) {
                            anuv2 = anuv.a;
                        }
                        aicz2 = (aicz)anuv2.rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
                    }
                    else {
                        aicz2 = null;
                    }
                    ((acsx)g).b(aicz2, a);
                    final Object c = this.c;
                    anuv anuv3;
                    if ((anuv3 = aojk.e) == null) {
                        anuv3 = anuv.a;
                    }
                    aicz aicz3 = aicz;
                    if (anuv3.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
                        anuv anuv4;
                        if ((anuv4 = aojk.e) == null) {
                            anuv4 = anuv.a;
                        }
                        aicz3 = (aicz)anuv4.rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
                    }
                    ((acsx)c).b(aicz3, a);
                    return;
                }
                final acry acry = (acry)o;
                ((TextView)this.g).setText((CharSequence)((qkq)acry).c);
                final Object g2 = this.g;
                final boolean e2 = ((qkq)acry).e();
                final int n = 2130970922;
                final int n2 = 2130970924;
                ColorStateList textColor;
                if (e2) {
                    if ((textColor = ((qkq)acry).d) == null) {
                        textColor = tpe.ct(((TextView)this.g).getContext(), 2130970924);
                    }
                }
                else {
                    textColor = tpe.ct(((TextView)this.g).getContext(), 2130970922);
                }
                ((TextView)g2).setTextColor(textColor);
                if (acry instanceof acrz) {
                    if (((acrz)acry).l) {
                        ((ProgressBar)this.d).setVisibility(0);
                    }
                    else {
                        ((ProgressBar)this.d).setVisibility(8);
                    }
                }
                final Drawable e3 = ((qkq)acry).e;
                if (e3 == null) {
                    ((ImageView)this.b).setVisibility(8);
                }
                else {
                    ((ImageView)this.b).setImageDrawable(e3);
                    ((ImageView)this.b).setVisibility(0);
                    final ImageView imageView = (ImageView)this.b;
                    final Context context = imageView.getContext();
                    int n3;
                    if (!((qkq)acry).e()) {
                        n3 = 2130970865;
                    }
                    else {
                        n3 = 2130970924;
                    }
                    imageView.setImageTintList(tpe.ct(context, n3));
                }
                final String h2 = acry.h;
                if (h2 == null) {
                    ((TextView)this.f).setVisibility(8);
                    ((TextView)this.c).setVisibility(8);
                }
                else {
                    ((TextView)this.f).setText((CharSequence)h2);
                    ((TextView)this.f).setVisibility(0);
                    ((TextView)this.c).setText((CharSequence)"\u2022");
                    ((TextView)this.c).setVisibility(0);
                    final Context context2 = ((TextView)this.f).getContext();
                    int n4;
                    if (!((qkq)acry).e()) {
                        n4 = n;
                    }
                    else {
                        n4 = 2130970926;
                    }
                    final ColorStateList ct = tpe.ct(context2, n4);
                    ((TextView)this.f).setTextColor(ct);
                    ((TextView)this.c).setTextColor(ct);
                }
                final Drawable f = ((qkq)acry).f;
                if (f == null) {
                    ((ImageView)this.h).setVisibility(8);
                }
                else {
                    ((ImageView)this.h).setImageDrawable(f);
                    ((ImageView)this.h).setVisibility(0);
                    final ImageView imageView2 = (ImageView)this.h;
                    final Context context3 = imageView2.getContext();
                    int n5 = n2;
                    if (!((qkq)acry).e()) {
                        n5 = 2130970865;
                    }
                    imageView2.setImageTintList(tpe.ct(context3, n5));
                }
                ((View)this.a).setBackgroundColor(acry.i);
                final View view = (View)this.a;
                acvc.d(view, 0, view.getBackground());
                final Runnable j = acry.j;
                if (j != null) {
                    ((View)this.a).setOnClickListener((View$OnClickListener)new xqn(j, 19));
                    return;
                }
                ((View)this.a).setOnClickListener((View$OnClickListener)null);
            }
            else {
                final apsr apsr = (apsr)o;
                if ((apsr.b & 0x1) != 0x0) {
                    tpe.v((View)this.b, true);
                    final Object g3 = this.g;
                    final Object b = this.b;
                    aotp aotp;
                    if ((aotp = apsr.c) == null) {
                        aotp = aotp.a;
                    }
                    ((acgs)g3).g((ImageView)b, aotp);
                }
                else {
                    tpe.v((View)this.b, false);
                }
                final Object f2 = this.f;
                ajut ajut2;
                if ((ajut2 = apsr.d) == null) {
                    ajut2 = ajut.a;
                }
                tpe.t((TextView)f2, (CharSequence)acak.b(ajut2));
                final View d = this.d;
                ajut ajut3;
                if ((ajut3 = apsr.e) == null) {
                    ajut3 = ajut.a;
                }
                tpe.t((TextView)d, (CharSequence)acak.b(ajut3));
                aida aida;
                if ((aida = apsr.f) == null) {
                    aida = aida.a;
                }
                if ((aida.b & 0x1) != 0x0) {
                    tpe.v((View)this.h, true);
                    final Object c2 = this.c;
                    aida aida2;
                    if ((aida2 = apsr.f) == null) {
                        aida2 = aida.a;
                    }
                    aicz aicz4;
                    if ((aicz4 = aida2.c) == null) {
                        aicz4 = aicz.a;
                    }
                    ((acsx)c2).b(aicz4, ackm.a);
                    return;
                }
                tpe.v((View)this.h, false);
            }
        }
        else {
            final jiu jiu = (jiu)o;
            final Resources resources = ((ImageView)this.f).getResources();
            if (jiu.a == 0 && jiu.d) {
                final View view2 = (View)this.g;
                view2.setPadding(view2.getPaddingLeft(), (int)((Resources)this.a).getDimension(2131166440), ((View)this.g).getPaddingRight(), ((View)this.g).getPaddingBottom());
            }
            else {
                final View view3 = (View)this.g;
                view3.setPadding(view3.getPaddingLeft(), (int)((Resources)this.a).getDimension(2131165841), ((View)this.g).getPaddingRight(), ((View)this.g).getPaddingBottom());
            }
            if (jiu.a == 0) {
                ((LinearLayout)this.g).setOnClickListener(jiu.b);
                ((ImageView)this.f).setImageDrawable((Drawable)this.h);
                ((ImageView)this.f).setVisibility(0);
                ((TextView)this.c).setVisibility(0);
                final Object c3 = this.c;
                Object text;
                if ((text = jiu.c) == null) {
                    text = resources.getString(2132020192);
                }
                ((TextView)c3).setText((CharSequence)text);
                ((FrameLayout)this.d).setContentDescription((CharSequence)"");
                return;
            }
            o = this.g;
            ((LinearLayout)o).setOnClickListener(jiu.b);
            ((ImageView)this.f).setImageDrawable((Drawable)this.b);
            ((ImageView)this.f).setVisibility(0);
            ((TextView)this.c).setVisibility(8);
            ((TextView)this.c).setText((CharSequence)null);
            ((FrameLayout)this.d).setContentDescription((CharSequence)((Resources)this.a).getString(2132020011));
        }
    }
}
