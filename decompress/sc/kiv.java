import android.graphics.drawable.Drawable;
import android.text.Spanned;
import com.google.protos.youtube.api.innertube.FormfillDropdownInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.FormfillCheckboxInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.FormfillPhoneNumberInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.FormfillTextInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.FormfillConditionalDropdownInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.FormfillInputRendererOuterClass;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.ImageView;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Map;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import android.view.View$OnClickListener;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Arrays;
import android.content.Context;
import android.view.ViewGroup;
import java.util.List;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kiv extends acld
{
    private final kja A;
    private final mcb B;
    public final vcy a;
    public final kja b;
    public final vdr c;
    public ajvk d;
    public wyw e;
    public final View f;
    final kiu g;
    public final elx h;
    private final LayoutInflater i;
    private final TextView j;
    private final LinearLayout k;
    private final LinearLayout l;
    private final TextView m;
    private final TextView n;
    private final Button o;
    private final Button p;
    private final Button q;
    private final Button r;
    private final Button s;
    private final Button t;
    private final Button u;
    private final Button v;
    private final List x;
    private final ViewGroup y;
    private final vai z;
    
    public kiv(final Context context, final vcy a, final elx h, final vdr c, final kja a2, final mcb b, final arwh arwh, final vai z, final aeea aeea, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        final kja b2 = new kja(context, a, arwh, aeea, null, null, null, null, null);
        this.g = new kiu(this);
        final LayoutInflater from = LayoutInflater.from(context);
        this.i = from;
        this.a = a;
        this.h = h;
        this.b = b2;
        this.c = c;
        this.A = a2;
        this.B = b;
        z.getClass();
        this.z = z;
        final View inflate = from.inflate(2131624453, (ViewGroup)null, false);
        this.f = inflate;
        this.k = (LinearLayout)inflate.findViewById(2131430561);
        this.j = (TextView)inflate.findViewById(2131429432);
        this.l = (LinearLayout)inflate.findViewById(2131429421);
        this.m = (TextView)inflate.findViewById(2131428687);
        this.n = (TextView)inflate.findViewById(2131431737);
        final Button o = (Button)inflate.findViewById(2131428234);
        this.o = o;
        final Button p15 = (Button)inflate.findViewById(2131431218);
        this.p = p15;
        final Button q = (Button)inflate.findViewById(2131431809);
        this.q = q;
        final Button r = (Button)inflate.findViewById(2131431221);
        this.r = r;
        final Button s = (Button)inflate.findViewById(2131430554);
        this.s = s;
        final Button t = (Button)inflate.findViewById(2131431219);
        this.t = t;
        final Button u = (Button)inflate.findViewById(2131430599);
        this.u = u;
        final Button v = (Button)inflate.findViewById(2131431220);
        this.v = v;
        this.x = Arrays.asList(q, s, u, r, t, v);
        this.y = (ViewGroup)inflate.findViewById(2131429696);
        if (z.aP()) {
            this.l(p15);
        }
        else {
            this.l(o);
        }
        if (z.aP()) {
            this.o(r);
        }
        else {
            this.o(q);
        }
        if (z.aP()) {
            this.m(t);
        }
        else {
            this.m(s);
        }
        if (z.aP()) {
            this.n(v);
            return;
        }
        this.n(u);
    }
    
    private final void j(final anuv anuv, final Button button, final Button button2) {
        final aicz aicz = (aicz)anuv.rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
        if (this.z.aP()) {
            button.setVisibility(8);
            this.p(aicz, button2);
            return;
        }
        button2.setVisibility(8);
        this.p(aicz, button);
    }
    
    private final void l(final Button button) {
        button.setOnClickListener((View$OnClickListener)new kgx(this, 9));
    }
    
    private final void m(final Button button) {
        button.setOnClickListener((View$OnClickListener)new kit(this));
    }
    
    private final void n(final Button button) {
        button.setOnClickListener((View$OnClickListener)new kgx(this, 11));
    }
    
    private final void o(final Button button) {
        button.setOnClickListener((View$OnClickListener)new kgx(this, 10));
    }
    
    private final void p(final aicz aicz, final Button button) {
        button.setVisibility(0);
        for (final Button button2 : this.x) {
            if (!button2.equals(button)) {
                button2.setVisibility(8);
            }
        }
        ajut ajut;
        if ((aicz.b & 0x200) != 0x0) {
            if ((ajut = aicz.i) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        button.setText((CharSequence)acak.b(ajut));
        this.e.t((wzz)new wyt(aicz.w), (alhi)null);
    }
    
    public final View a() {
        return this.f;
    }
    
    public final void c(final acku acku) {
        final kja b = this.b;
        ((List)b.c).clear();
        ((ViewGroup)b.g).removeAllViews();
        final View g = this.A.g;
        if (g != null) {
            ((ViewGroup)g).removeAllViews();
        }
        final Object c = this.B.c;
        if (c != null) {
            ((ViewGroup)c).removeAllViews();
        }
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((ajvk)o).q.I();
    }
    
    public final RecyclerView f() {
        final uve d = ((DefaultWatchPanelViewController)this.h.a).d;
        return (RecyclerView)d.b(d.h()).a().findViewById(2131431186);
    }
    
    public final void g(final aicz aicz, final boolean b) {
        if ((aicz.b & 0x8000) != 0x0) {
            Map h;
            if (b) {
                final ajvk d = this.d;
                final kja b2 = this.b;
                final ahaz builder = ((ahbh)alhi.a).createBuilder();
                alhf o = alhf.a;
                algj d2 = algj.a;
                for (final kiz kiz : b2.c) {
                    o = kiz.a.c(o);
                    d2 = kiz.a.b(d2);
                }
                final ahaz builder2 = ((ahbh)algn.a).createBuilder();
                builder2.copyOnWrite();
                final algn algn = (algn)builder2.instance;
                d2.getClass();
                algn.d = d2;
                algn.c = 6;
                builder.copyOnWrite();
                final alhi alhi = (alhi)builder.instance;
                final algn v = (algn)builder2.build();
                v.getClass();
                alhi.v = v;
                alhi.c |= 0x400;
                builder.copyOnWrite();
                final alhi alhi2 = (alhi)builder.instance;
                o.getClass();
                alhi2.o = o;
                alhi2.b |= 0x20000;
                h = wyx.h((Object)d, (alhi)builder.build());
            }
            else {
                h = null;
            }
            final vcy a = this.a;
            aiqj aiqj;
            if ((aiqj = aicz.o) == null) {
                aiqj = aiqj.a;
            }
            a.c(aiqj, h);
        }
    }
    
    public final void h(final aicz aicz) {
        if ((aicz.b & 0x4000) != 0x0) {
            final Map i = wyx.i((Object)this.d, false);
            i.put("FORM_RESULTS_ARG", this.b.a());
            final kja b = this.b;
            final ArrayList list = new ArrayList();
            for (final kiz kiz : b.c) {
                if (kiz.a.h()) {
                    final ajvl b2 = kiz.b;
                    if ((b2.b & 0x8) == 0x0) {
                        continue;
                    }
                    aiqj aiqj;
                    if ((aiqj = b2.f) == null) {
                        aiqj = aiqj.a;
                    }
                    list.add(aiqj);
                }
            }
            i.put("SUBMIT_COMMANDS_ARG", list);
            final vcy a = this.a;
            aiqj aiqj2;
            if ((aiqj2 = aicz.n) == null) {
                aiqj2 = aiqj.a;
            }
            a.c(aiqj2, i);
        }
    }
    
    public final boolean i(final RecyclerView recyclerView, final aicz aicz) {
        final kja b = this.b;
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = ((List<Object>)b.c).iterator();
        View view = null;
        boolean b2 = false;
        while (iterator.hasNext()) {
            final kiz kiz = iterator.next();
            final kix a = kiz.a;
            final kiw e = a.e(kiz.b.e);
            a.g(e.a ^ true);
            if (!e.a) {
                final ajvl b3 = kiz.b;
                if ((b3.b & 0x10) != 0x0) {
                    aiqj aiqj;
                    if ((aiqj = b3.g) == null) {
                        aiqj = aiqj.a;
                    }
                    list.add(aiqj);
                }
                final aiqj b4 = e.b;
                if (b4 != null) {
                    list.add(b4);
                }
                final algl c = e.c;
                if (c != null) {
                    list2.add(c);
                }
                View a2;
                if ((a2 = view) == null) {
                    a2 = a.a();
                }
                b2 = true;
                view = a2;
            }
        }
        if (view != null) {
            view.requestFocus();
            if (recyclerView != null) {
                recyclerView.postDelayed((Runnable)new jlv(view, recyclerView, 15), 100L);
            }
        }
        final kiy kiy = new kiy(b2 ^ true, afeq.o((Collection)list), afeq.o((Collection)list2));
        final boolean a3 = kiy.a;
        if (!a3) {
            this.a.d((List)kiy.b, (Map)null);
            final vcy a4 = this.a;
            aiqj aiqj2;
            if ((aiqj2 = this.d.r) == null) {
                aiqj2 = aiqj.a;
            }
            a4.c(aiqj2, (Map)null);
            if (this.e != null && !kiy.c.isEmpty()) {
                final wyw e2 = this.e;
                final wyt wyt = new wyt(aicz.w);
                final afeq c2 = kiy.c;
                final ahaz builder = ((ahbh)alhi.a).createBuilder();
                final ahaz builder2 = ((ahbh)algn.a).createBuilder();
                final ahaz builder3 = ((ahbh)algm.a).createBuilder();
                builder3.be((Iterable)c2);
                builder2.copyOnWrite();
                final algn algn = (algn)builder2.instance;
                final algm d = (algm)builder3.build();
                d.getClass();
                algn.d = d;
                algn.c = 1;
                builder.copyOnWrite();
                final alhi alhi = (alhi)builder.instance;
                final algn v = (algn)builder2.build();
                v.getClass();
                alhi.v = v;
                alhi.c |= 0x400;
                e2.J(3, (wzz)wyt, (alhi)builder.build());
                return false;
            }
        }
        return a3;
    }
    
    protected final void lR(final ackm ackm, Object d) {
        final ajvk d2 = (ajvk)d;
        d2.getClass();
        final wyw a = ackm.a;
        this.e = a;
        this.d = d2;
        final kja a2 = this.A;
        final ViewGroup y = this.y;
        a2.g = (View)y;
        final int v = d2.v;
        final int br = adyf.bR(v);
        View view = null;
        Label_1017: {
            if (br != 0) {
                if (br == 4) {
                    final kdt kdt = (kdt)a2.f;
                    final View inflate = ((LayoutInflater)kdt.a).inflate(2131624454, y, false);
                    final ImageView imageView = (ImageView)inflate.findViewById(2131427786);
                    final Object b = kdt.b;
                    aotp aotp;
                    if ((aotp = d2.x) == null) {
                        aotp = aotp.a;
                    }
                    ((acgs)b).g(imageView, aotp);
                    final TextView textView = (TextView)inflate.findViewById(2131432095);
                    ajut ajut;
                    if ((d2.b & 0x2) != 0x0) {
                        if ((ajut = d2.d) == null) {
                            ajut = ajut.a;
                        }
                    }
                    else {
                        ajut = null;
                    }
                    textView.setText((CharSequence)acak.b(ajut));
                    final TextView textView2 = (TextView)inflate.findViewById(2131429452);
                    ajut ajut2;
                    if ((d2.b & 0x10) != 0x0) {
                        if ((ajut2 = d2.g) == null) {
                            ajut2 = ajut.a;
                        }
                    }
                    else {
                        ajut2 = null;
                    }
                    tpe.t(textView2, (CharSequence)acak.b(ajut2));
                    view = inflate;
                    break Label_1017;
                }
            }
            final int br2 = adyf.bR(v);
            if (br2 != 0) {
                if (br2 == 2) {
                    final View inflate2 = ((LayoutInflater)((bx)a2.b).a).inflate(2131624455, y, false);
                    final TextView textView3 = (TextView)inflate2.findViewById(2131432095);
                    ajut ajut3;
                    if ((d2.b & 0x2) != 0x0) {
                        if ((ajut3 = d2.d) == null) {
                            ajut3 = ajut.a;
                        }
                    }
                    else {
                        ajut3 = null;
                    }
                    textView3.setText((CharSequence)acak.b(ajut3));
                    final TextView textView4 = (TextView)inflate2.findViewById(2131429452);
                    ajut ajut4;
                    if ((d2.b & 0x10) != 0x0) {
                        if ((ajut4 = d2.g) == null) {
                            ajut4 = ajut.a;
                        }
                    }
                    else {
                        ajut4 = null;
                    }
                    tpe.t(textView4, (CharSequence)acak.b(ajut4));
                    view = inflate2;
                    break Label_1017;
                }
            }
            final int br3 = adyf.bR(v);
            if (br3 != 0) {
                if (br3 == 3) {
                    final Object d3 = a2.d;
                    Object a3;
                    if (d3 != null) {
                        a3 = ((elx)d3).a;
                    }
                    else {
                        a3 = null;
                    }
                    uve d4;
                    if (a3 != null) {
                        d4 = ((DefaultWatchPanelViewController)a3).d;
                    }
                    else {
                        d4 = null;
                    }
                    int height;
                    if (d4 != null) {
                        height = d4.g().c.b().height();
                    }
                    else {
                        height = 0;
                    }
                    if (height <= 0) {
                        zlm.b(zll.b, zlk.a, "EngagementPanelController: The height of EP is less than or equal to 0");
                    }
                    String h;
                    if (d4 != null) {
                        h = d4.h();
                    }
                    else {
                        h = null;
                    }
                    uux b2;
                    if (d4 != null && h != null) {
                        b2 = d4.b(h);
                    }
                    else {
                        b2 = null;
                    }
                    uur b3;
                    if (b2 != null) {
                        b3 = b2.b();
                    }
                    else {
                        b3 = null;
                    }
                    View b4;
                    if (b3 != null) {
                        b4 = b3.b();
                    }
                    else {
                        b4 = null;
                    }
                    int height2;
                    if (b4 != null) {
                        height2 = b4.getHeight();
                    }
                    else {
                        height2 = 0;
                    }
                    if (tpe.bf(a2.a.getResources().getDisplayMetrics(), height) >= 326) {
                        final kdt kdt2 = (kdt)a2.e;
                        final View inflate3 = ((LayoutInflater)kdt2.b).inflate(2131624457, y, false);
                        final TextView textView5 = (TextView)inflate3.findViewById(2131429452);
                        final TextView textView6 = (TextView)inflate3.findViewById(2131429449);
                        final LinearLayout linearLayout = (LinearLayout)inflate3.findViewById(2131431276);
                        final TextView textView7 = (TextView)inflate3.findViewById(2131431275);
                        final ImageView imageView2 = (ImageView)inflate3.findViewById(2131428962);
                        ajut ajut5;
                        if ((d2.b & 0x8) != 0x0) {
                            if ((ajut5 = d2.f) == null) {
                                ajut5 = ajut.a;
                            }
                        }
                        else {
                            ajut5 = null;
                        }
                        tpe.t(textView6, (CharSequence)acak.b(ajut5));
                        ajut ajut6;
                        if ((d2.b & 0x10) != 0x0) {
                            if ((ajut6 = d2.g) == null) {
                                ajut6 = ajut.a;
                            }
                        }
                        else {
                            ajut6 = null;
                        }
                        tpe.t(textView5, (CharSequence)acak.b(ajut6));
                        ajut ajut7;
                        if ((d2.b & 0x200) != 0x0) {
                            if ((ajut7 = d2.l) == null) {
                                ajut7 = ajut.a;
                            }
                        }
                        else {
                            ajut7 = null;
                        }
                        textView7.setText((CharSequence)acak.b(ajut7));
                        final int topMargin = height - height2 - kdt.a((Context)kdt2.a, 46) - kdt.a((Context)kdt2.a, 0) - kdt.a((Context)kdt2.a, 60);
                        if (topMargin <= 0) {
                            zlm.b(zll.b, zlk.a, "FormfillFormLockupPresenterController: The height of the heightBetweenHeaderAndScrollText is 0");
                        }
                        final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)linearLayout.getLayoutParams();
                        layoutParams.topMargin = topMargin;
                        linearLayout.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                        imageView2.startAnimation(AnimationUtils.loadAnimation((Context)kdt2.a, 2130772002));
                        ajut ajut8;
                        if ((ajut8 = d2.l) == null) {
                            ajut8 = ajut.a;
                        }
                        xmm.ab(ajut8, a);
                        view = inflate3;
                        break Label_1017;
                    }
                    view = ((kdt)a2.c).d(y, d2);
                    break Label_1017;
                }
            }
            view = ((kdt)a2.c).d(y, d2);
        }
        y.addView(view);
        final mcb b5 = this.B;
        final LinearLayout k = this.k;
        final ajvk d5 = this.d;
        final wyw e = this.e;
        b5.c = k;
        View view2;
        if ((d5.b & 0x80) != 0x0) {
            final heo heo = (heo)b5.a;
            final View inflate4 = ((LayoutInflater)heo.c).inflate(2131624460, (ViewGroup)k, false);
            final TextView textView8 = (TextView)inflate4.findViewById(2131430560);
            final ImageView imageView3 = (ImageView)inflate4.findViewById(2131430562);
            ajut ajut9;
            if ((d5.b & 0x20) != 0x0) {
                if ((ajut9 = d5.h) == null) {
                    ajut9 = ajut.a;
                }
            }
            else {
                ajut9 = null;
            }
            final Spanned a4 = vde.a(ajut9, (vcy)heo.a, false);
            if (TextUtils.isEmpty((CharSequence)a4)) {
                ((ViewGroup)k).setVisibility(8);
            }
            else {
                ((ViewGroup)k).setVisibility(0);
                if ((d5.b & 0x80) != 0x0) {
                    imageView3.setOnClickListener((View$OnClickListener)new keq(heo, d5, 16, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                }
                if (d5.i) {
                    final SpannableStringBuilder text = new SpannableStringBuilder();
                    text.append((CharSequence)a4);
                    final Drawable drawable = ((Context)heo.b).getResources().getDrawable(2131232854);
                    drawable.setBounds(0, 0, 28, 28);
                    aiq.f(drawable, tpe.cx((Context)heo.b, 2130970852).orElse(0));
                    text.setSpan((Object)new ImageSpan(drawable, 0), text.length() - 1, text.length(), 0);
                    textView8.setText((CharSequence)text);
                }
                else {
                    textView8.setText((CharSequence)a4);
                }
                ajut ajut10;
                if ((ajut10 = d5.h) == null) {
                    ajut10 = ajut.a;
                }
                xmm.ab(ajut10, e);
            }
            view2 = inflate4;
        }
        else {
            final heo heo2 = (heo)b5.b;
            final View inflate5 = ((LayoutInflater)heo2.a).inflate(2131624459, (ViewGroup)k, false);
            final TextView textView9 = (TextView)inflate5.findViewById(2131430560);
            ajut ajut11;
            if ((d5.b & 0x20) != 0x0) {
                if ((ajut11 = d5.h) == null) {
                    ajut11 = ajut.a;
                }
            }
            else {
                ajut11 = null;
            }
            final Spanned a5 = vde.a(ajut11, (vcy)heo2.b, false);
            if (TextUtils.isEmpty((CharSequence)a5)) {
                ((ViewGroup)k).setVisibility(8);
                view2 = inflate5;
            }
            else {
                ((ViewGroup)k).setVisibility(0);
                if (d5.i) {
                    final SpannableStringBuilder text2 = new SpannableStringBuilder();
                    text2.append((CharSequence)a5);
                    final Drawable drawable2 = ((Context)heo2.c).getResources().getDrawable(2131232854);
                    drawable2.setBounds(0, 0, 28, 28);
                    aiq.f(drawable2, tpe.cx((Context)heo2.c, 2130970852).orElse(0));
                    text2.setSpan((Object)new ImageSpan(drawable2, 0), text2.length() - 1, text2.length(), 0);
                    textView9.setText((CharSequence)text2);
                }
                else {
                    textView9.setText((CharSequence)a5);
                }
                ajut ajut12;
                if ((ajut12 = d5.h) == null) {
                    ajut12 = ajut.a;
                }
                xmm.ab(ajut12, e);
                view2 = inflate5;
            }
        }
        ((ViewGroup)k).addView(view2);
        final TextView j = this.j;
        final ajvk d6 = this.d;
        ajut ajut13;
        if ((d6.b & 0x100) != 0x0) {
            if ((ajut13 = d6.k) == null) {
                ajut13 = ajut.a;
            }
        }
        else {
            ajut13 = null;
        }
        tpe.t(j, (CharSequence)acak.b(ajut13));
        final TextView n = this.n;
        final ajvk d7 = this.d;
        ajut ajut14;
        if ((d7.b & 0x100000) != 0x0) {
            if ((ajut14 = d7.w) == null) {
                ajut14 = ajut.a;
            }
        }
        else {
            ajut14 = null;
        }
        tpe.t(n, (CharSequence)acak.b(ajut14));
        final TextView m = this.m;
        final ajvk d8 = this.d;
        ajut ajut15;
        if ((d8.b & 0x400) != 0x0) {
            if ((ajut15 = d8.n) == null) {
                ajut15 = ajut.a;
            }
        }
        else {
            ajut15 = null;
        }
        tpe.t(m, (CharSequence)vde.a(ajut15, this.a, false));
        ajut ajut16;
        if ((ajut16 = this.d.n) == null) {
            ajut16 = ajut.a;
        }
        xmm.ab(ajut16, this.e);
        anuv anuv;
        if ((anuv = this.d.o) == null) {
            anuv = anuv.a;
        }
        if (anuv.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
            anuv anuv2;
            if ((anuv2 = this.d.o) == null) {
                anuv2 = anuv.a;
            }
            final aicz aicz = (aicz)anuv2.rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
            if (this.z.aP()) {
                this.p.setVisibility(0);
                final Button p2 = this.p;
                ajut ajut17;
                if ((aicz.b & 0x200) != 0x0) {
                    if ((ajut17 = aicz.i) == null) {
                        ajut17 = ajut.a;
                    }
                }
                else {
                    ajut17 = null;
                }
                p2.setText((CharSequence)acak.b(ajut17));
                this.o.setVisibility(8);
            }
            else {
                this.o.setVisibility(0);
                final Button o = this.o;
                ajut ajut18;
                if ((aicz.b & 0x200) != 0x0) {
                    if ((ajut18 = aicz.i) == null) {
                        ajut18 = ajut.a;
                    }
                }
                else {
                    ajut18 = null;
                }
                o.setText((CharSequence)acak.b(ajut18));
                this.p.setVisibility(8);
            }
            final wyw e2 = this.e;
            anuv anuv3;
            if ((anuv3 = this.d.o) == null) {
                anuv3 = anuv.a;
            }
            e2.t((wzz)new wyt(((aicz)anuv3.rx((ahaq)ButtonRendererOuterClass.buttonRenderer)).w), (alhi)null);
        }
        else {
            this.o.setVisibility(8);
            this.p.setVisibility(8);
        }
        anuv anuv4;
        if ((anuv4 = this.d.t) == null) {
            anuv4 = anuv.a;
        }
        if (anuv4.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
            anuv anuv5;
            if ((anuv5 = this.d.t) == null) {
                anuv5 = anuv.a;
            }
            this.j(anuv5, this.s, this.t);
        }
        else {
            anuv anuv6;
            if ((anuv6 = this.d.p) == null) {
                anuv6 = anuv.a;
            }
            if (anuv6.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
                anuv anuv7;
                if ((anuv7 = this.d.p) == null) {
                    anuv7 = anuv.a;
                }
                this.j(anuv7, this.q, this.r);
            }
            else {
                anuv anuv8;
                if ((anuv8 = this.d.u) == null) {
                    anuv8 = anuv.a;
                }
                if (anuv8.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
                    anuv anuv9;
                    if ((anuv9 = this.d.u) == null) {
                        anuv9 = anuv.a;
                    }
                    this.j(anuv9, this.u, this.v);
                }
            }
        }
        final kja b6 = this.b;
        final LinearLayout l = this.l;
        final ahbx i = this.d.m;
        final wyw e3 = this.e;
        b6.g = (View)l;
        for (final anuv anuv10 : i) {
            if (anuv10 != null && anuv10.ry((ahaq)FormfillInputRendererOuterClass.formfillInputRenderer)) {
                final ajvl ajvl = (ajvl)anuv10.rx((ahaq)FormfillInputRendererOuterClass.formfillInputRenderer);
                anuv anuv11;
                if ((anuv11 = ajvl.c) == null) {
                    anuv11 = anuv.a;
                }
                if (!anuv11.ry((ahaq)FormfillConditionalDropdownInputRendererOuterClass.formfillConditionalDropdownInputRenderer)) {
                    continue;
                }
                anuv anuv12;
                if ((anuv12 = ajvl.c) == null) {
                    anuv12 = anuv.a;
                }
                final ajuy ajuy = (ajuy)anuv12.rx((ahaq)FormfillConditionalDropdownInputRendererOuterClass.formfillConditionalDropdownInputRenderer);
                final Context a6 = b6.a;
                final Object b7 = b6.b;
                final Object d9 = b6.d;
                final kiq kiq = new kiq(a6, (vcy)b7, e3, (ViewGroup)l, ajvl, ajuy);
                if (ajvl.d.isEmpty()) {
                    continue;
                }
                ((Map<String, kiq>)b6.e).put(ajvl.d, kiq);
            }
        }
        final Iterator<Map.Entry<Object, Object>> iterator2 = ((Map<Object, Object>)b6.e).entrySet().iterator();
        while (iterator2.hasNext()) {
            final kiq kiq2 = ((Map.Entry<K, kiq>)iterator2.next()).getValue();
            if (kiq2 != null) {
                final ajuy l2 = kiq2.l;
                final String i2 = l2.i;
                final String j2 = l2.j;
                if (!TextUtils.isEmpty((CharSequence)i2)) {
                    kiq2.n = (kiq)((Map<Object, Object>)b6.e).get(i2);
                }
                if (TextUtils.isEmpty((CharSequence)j2)) {
                    continue;
                }
                kiq2.m = (kiq)((Map<Object, Object>)b6.e).get(j2);
            }
        }
        for (final anuv anuv13 : i) {
            Object o2 = null;
            Label_3110: {
                Label_3108: {
                    if (anuv13 != null) {
                        if (!anuv13.ry((ahaq)FormfillInputRendererOuterClass.formfillInputRenderer)) {
                            o2 = null;
                        }
                        else {
                            final ajvl ajvl2 = (ajvl)anuv13.rx((ahaq)FormfillInputRendererOuterClass.formfillInputRenderer);
                            anuv anuv14;
                            if ((anuv14 = ajvl2.c) == null) {
                                anuv14 = anuv.a;
                            }
                            if (anuv14.ry((ahaq)FormfillTextInputRendererOuterClass.formfillTextInputRenderer)) {
                                final Context a7 = b6.a;
                                final Object b8 = b6.b;
                                anuv anuv15;
                                if ((anuv15 = ajvl2.c) == null) {
                                    anuv15 = anuv.a;
                                }
                                final ajvn ajvn = (ajvn)anuv15.rx((ahaq)FormfillTextInputRendererOuterClass.formfillTextInputRenderer);
                                d = b6.d;
                                o2 = new kjf(a7, (vcy)b8, e3, (ViewGroup)l, ajvl2, ajvn);
                            }
                            else {
                                anuv anuv16;
                                if ((anuv16 = ajvl2.c) == null) {
                                    anuv16 = anuv.a;
                                }
                                if (anuv16.ry((ahaq)FormfillPhoneNumberInputRendererOuterClass.formfillPhoneNumberInputRenderer)) {
                                    final Context a8 = b6.a;
                                    final Object b9 = b6.b;
                                    anuv anuv17;
                                    if ((anuv17 = ajvl2.c) == null) {
                                        anuv17 = anuv.a;
                                    }
                                    final ajvm ajvm = (ajvm)anuv17.rx((ahaq)FormfillPhoneNumberInputRendererOuterClass.formfillPhoneNumberInputRenderer);
                                    final Object d10 = b6.d;
                                    o2 = new kjb(a8, (vcy)b9, e3, (ViewGroup)l, ajvl2, ajvm, (aeea)b6.f, (byte[])null, (byte[])null, (byte[])null);
                                }
                                else {
                                    anuv anuv18;
                                    if ((anuv18 = ajvl2.c) == null) {
                                        anuv18 = anuv.a;
                                    }
                                    if (anuv18.ry((ahaq)FormfillCheckboxInputRendererOuterClass.formfillCheckboxInputRenderer)) {
                                        final Context a9 = b6.a;
                                        final Object b10 = b6.b;
                                        anuv anuv19;
                                        if ((anuv19 = ajvl2.c) == null) {
                                            anuv19 = anuv.a;
                                        }
                                        final ajuw ajuw = (ajuw)anuv19.rx((ahaq)FormfillCheckboxInputRendererOuterClass.formfillCheckboxInputRenderer);
                                        final Object d11 = b6.d;
                                        o2 = new kio(a9, (vcy)b10, e3, (ViewGroup)l, ajvl2, ajuw);
                                    }
                                    else {
                                        anuv anuv20;
                                        if ((anuv20 = ajvl2.c) == null) {
                                            anuv20 = anuv.a;
                                        }
                                        if (anuv20.ry((ahaq)FormfillDropdownInputRendererOuterClass.formfillDropdownInputRenderer)) {
                                            final Context a10 = b6.a;
                                            final Object b11 = b6.b;
                                            anuv anuv21;
                                            if ((anuv21 = ajvl2.c) == null) {
                                                anuv21 = anuv.a;
                                            }
                                            final ajvc ajvc = (ajvc)anuv21.rx((ahaq)FormfillDropdownInputRendererOuterClass.formfillDropdownInputRenderer);
                                            final Object d12 = b6.d;
                                            o2 = new kjh(a10, (vcy)b11, e3, (ViewGroup)l, ajvl2, ajvc);
                                        }
                                        else {
                                            anuv anuv22;
                                            if ((anuv22 = ajvl2.c) == null) {
                                                anuv22 = anuv.a;
                                            }
                                            if (!anuv22.ry((ahaq)FormfillConditionalDropdownInputRendererOuterClass.formfillConditionalDropdownInputRenderer)) {
                                                break Label_3108;
                                            }
                                            o2 = ((Map<Object, Object>)b6.e).get(ajvl2.d);
                                        }
                                    }
                                }
                            }
                        }
                        break Label_3110;
                    }
                }
                o2 = null;
            }
            if (o2 != null && anuv13.ry((ahaq)FormfillInputRendererOuterClass.formfillInputRenderer)) {
                final ajvl ajvl3 = (ajvl)anuv13.rx((ahaq)FormfillInputRendererOuterClass.formfillInputRenderer);
                final View d13 = ((kix)o2).d();
                if (d13 == null) {
                    continue;
                }
                ((List<kiz>)b6.c).add(new kiz((kix)o2, ajvl3));
                ((ViewGroup)l).addView(d13);
            }
        }
        final int br4 = adyf.bR(this.d.v);
        if (br4 != 0) {
            if (br4 == 3) {
                final RecyclerView f = this.f();
                if (f != null) {
                    f.aE((iw)this.g);
                }
            }
        }
    }
}
