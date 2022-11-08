import android.util.DisplayMetrics;
import android.text.Spanned;
import java.util.Iterator;
import android.widget.ImageView;
import android.content.res.ColorStateList;
import android.view.ViewGroup$LayoutParams;
import java.util.concurrent.atomic.AtomicLong;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.SpannableString;
import android.view.View$OnClickListener;
import android.net.Uri;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.graphics.Typeface;
import android.content.Context;
import android.content.res.Resources;
import android.util.SparseIntArray;
import java.util.ArrayList;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhn extends BaseAdapter implements acvw, jgk
{
    public final ArrayList a;
    public final SparseIntArray b;
    public final aceo c;
    public boolean d;
    public final Resources e;
    public final Context f;
    public int g;
    public Typeface h;
    public wyn i;
    public final uyf j;
    public final uyi k;
    public final uyi l;
    public final uyi m;
    public final arud n;
    public qpt o;
    private final LayoutInflater p;
    private Typeface q;
    private final vax r;
    private final atjj s;
    
    public jhn(final Context f, final uyf j, final arud n, final vax r, final aceo c, final uyi k, final atjj s, final uyi l, final uyi m, final byte[] array, final byte[] array2) {
        this.g = 0;
        this.a = new ArrayList();
        this.p = LayoutInflater.from(f);
        this.e = f.getResources();
        this.b = new SparseIntArray();
        this.f = f;
        this.j = j;
        this.n = n;
        this.r = r;
        this.c = c;
        this.k = k;
        this.s = s;
        this.l = l;
        this.m = m;
    }
    
    private final void f(final String s) {
        final wyn i = this.i;
        if (i != null && this.d) {
            i.c(s);
        }
    }
    
    public final Typeface a(final TextView textView) {
        if (this.q == null) {
            this.q = textView.getTypeface();
        }
        return this.q;
    }
    
    public final wyn b() {
        return this.i;
    }
    
    public final void c(final wyn wyn) {
        throw null;
    }
    
    public final boolean d() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjg.b((AtomicReference)this.k.l(45362408L).aw((Object)false).Z((asix)new jcp(atomicBoolean, 8)));
        if (!atomicBoolean.get()) {
            return false;
        }
        final amoo b = ((adbr)this.s.a()).b();
        return b == amoo.c || b == amoo.d || b == amoo.e || b == amoo.b;
    }
    
    public final boolean e() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjg.b((AtomicReference)this.k.l(45375635L).aw((Object)false).Z((asix)new jcp(atomicBoolean, 8)));
        return atomicBoolean.get();
    }
    
    public final int getCount() {
        return this.a.size();
    }
    
    public final Object getItem(final int n) {
        if (n > this.a.size()) {
            return new Object();
        }
        return this.a.get(n);
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final int getItemViewType(final int n) {
        final Object item = this.getItem(n);
        if (item instanceof acwl) {
            if (((acwl)item).a()) {
                return 3;
            }
            return 0;
        }
        else {
            if (item instanceof jlb) {
                return 2;
            }
            if (item instanceof jlc) {
                return 1;
            }
            return 0;
        }
    }
    
    public final View getView(int i, View view, final ViewGroup viewGroup) {
        this.f("ss_rds");
        final Object item = this.getItem(i);
        Label_3642: {
            if (item instanceof acwl) {
                final acwl f = (acwl)item;
                if (f.a()) {
                    if (view == null) {
                        view = this.p.inflate(2131625317, viewGroup, false);
                        view.setPaddingRelative(0, 0, 0, 0);
                    }
                    jhl jhl;
                    if ((jhl = (jhl)view.getTag(2131430023)) == null) {
                        jhl = new jhl(this, view);
                        view.setTag(2131430023, (Object)jhl);
                    }
                    jhl.b.setText((CharSequence)((aexw)((acwk)f.k.c()).b).a);
                    jhl.c.setText((CharSequence)((acwk)f.k.c()).e.c());
                    jhl.d.setText((CharSequence)jhl.h.e.getString(2132018761, new Object[] { ((acwk)f.k.c()).f.c(), ((acwk)f.k.c()).g.c() }));
                    jhl.e.setText((CharSequence)((aexw)((acwk)f.k.c()).c).a);
                    jhl.e.a();
                    jhl.e.setVisibility(0);
                    if (!f.i.isEmpty()) {
                        i = tmy.aZ(jhl.h.e.getDisplayMetrics(), 44);
                        Object o = aewp.a;
                        for (final auck auck : f.i) {
                            o = auck.c;
                            if (i < auck.b) {
                                break;
                            }
                        }
                        final aexq aexq = (aexq)o;
                        if (aexq.h() && !jhl.h.d()) {
                            jhl.a.setVisibility(0);
                            jhl.a.setImageDrawable((Drawable)null);
                            jhl.h.c.f(jhl.a, Uri.parse((String)aexq.c()));
                        }
                        else {
                            jhl.a.setImageDrawable((Drawable)null);
                            jhl.a.setVisibility(4);
                        }
                        final ViewGroup$LayoutParams layoutParams = jhl.a.getLayoutParams();
                        if (jhl.h.e()) {
                            if (layoutParams != null) {
                                layoutParams.width = -2;
                            }
                            jhl.a.setClipToOutline(true);
                            jhl.a.setAdjustViewBounds(true);
                            jhl.a.setBackgroundResource(2131231035);
                        }
                        else {
                            if (layoutParams != null) {
                                layoutParams.width = tmy.aZ(jhl.h.e.getDisplayMetrics(), 56);
                            }
                            jhl.a.setClipToOutline(false);
                            jhl.a.setAdjustViewBounds(false);
                            jhl.a.setBackground((Drawable)null);
                        }
                        if (layoutParams != null) {
                            jhl.a.setLayoutParams(layoutParams);
                        }
                    }
                    else {
                        jhl.a.setImageDrawable((Drawable)null);
                        jhl.a.setVisibility(4);
                        jhl.a.setClipToOutline(false);
                        jhl.a.setBackground((Drawable)null);
                    }
                    if (((acwk)f.k.c()).d <= 0.0f) {
                        jhl.f.setVisibility(8);
                    }
                    else {
                        jhl.f.setVisibility(0);
                        jhl.g.setVisibility(0);
                        jhl.g.setProgress((int)(((acwk)f.k.c()).d * 100.0f));
                    }
                }
                else {
                    if (view == null) {
                        view = this.p.inflate(2131625327, viewGroup, false);
                        view.setPaddingRelative(0, 0, 0, 0);
                    }
                    jhm jhm;
                    if ((jhm = (jhm)view.getTag(2131431305)) == null) {
                        jhm = new jhm(this, view);
                        jhm.c.setOnClickListener((View$OnClickListener)new iue(this, jhm, 16));
                        view.setTag(2131431305, (Object)jhm);
                    }
                    jhm.f = f;
                    final Spanned h = f.h;
                    if (h != null) {
                        final SpannableString text = new SpannableString((CharSequence)f.a);
                        final StyleSpan[] array = (StyleSpan[])h.getSpans(0, h.length(), (Class)StyleSpan.class);
                        int length;
                        StyleSpan styleSpan;
                        jhn j;
                        jhn k;
                        jhn l;
                        int g;
                        for (length = array.length, i = 0; i < length; ++i) {
                            styleSpan = array[i];
                            if (styleSpan.getStyle() == 1) {
                                j = jhm.j;
                                if (j.h == null) {
                                    j.h = Typeface.create("sans-serif-medium", 0);
                                }
                                k = jhm.j;
                                if (k.h == null) {
                                    k.h = Typeface.create("sans-serif-medium", 0);
                                }
                                text.setSpan((Object)new abyd(k.h), h.getSpanStart((Object)styleSpan), h.getSpanEnd((Object)styleSpan), 33);
                                l = jhm.j;
                                if ((g = l.g) == 0) {
                                    g = tmy.ct(l.f, 2130970924).orElse(0);
                                    l.g = g;
                                }
                                text.setSpan((Object)new ForegroundColorSpan(g), h.getSpanStart((Object)styleSpan), h.getSpanEnd((Object)styleSpan), 33);
                            }
                        }
                        jhm.b.setText((CharSequence)text);
                    }
                    else {
                        jhm.b.setText((CharSequence)f.a);
                    }
                    jhm.c.setContentDescription((CharSequence)jhm.j.e.getString(2132017385, new Object[] { f.a }));
                    final int[] d = f.d;
                    final int length2 = d.length;
                    i = 0;
                    while (true) {
                        while (i < length2) {
                            final int n = d[i];
                            if (n != 143 && n != 179) {
                                ++i;
                            }
                            else {
                                alvs alvs;
                                if ((alvs = jhm.j.n.f().e) == null) {
                                    alvs = alvs.a;
                                }
                                if (alvs.ak.equals("trending")) {
                                    jhm.a.setImageResource(2131233734);
                                    jhm.a.setTag((Object)2131233734);
                                }
                                else {
                                    jhm.a.setImageResource(2131233877);
                                    jhm.a.setTag((Object)2131233877);
                                }
                                jhm.a.setVisibility(0);
                                if (f.m) {
                                    final jhn m = jhm.j;
                                    final AtomicLong atomicLong = new AtomicLong();
                                    asjg.b((AtomicReference)m.k.n(45378449L).aw((Object)0L).Z((asix)new jcp(atomicLong, 9)));
                                    i = (int)atomicLong.get();
                                    if (i != 1) {
                                        if (i != 2) {
                                            if (i != 3) {
                                                if (i != 4) {
                                                    jhm.h.setVisibility(8);
                                                    jhm.i.setVisibility(8);
                                                    jhm.g.setVisibility(8);
                                                }
                                                else {
                                                    jhm.h.setVisibility(8);
                                                    jhm.i.setVisibility(8);
                                                    jhm.g.setVisibility(0);
                                                }
                                            }
                                            else {
                                                jhm.h.setVisibility(8);
                                                jhm.i.setVisibility(0);
                                                jhm.g.setVisibility(8);
                                                jhm.i.setText((CharSequence)jhm.j.e.getString(2132018788));
                                            }
                                        }
                                        else {
                                            jhm.h.setVisibility(0);
                                            jhm.i.setVisibility(0);
                                            jhm.g.setVisibility(8);
                                            jhm.i.setText((CharSequence)jhm.j.e.getString(2132018789));
                                        }
                                    }
                                    else {
                                        jhm.h.setVisibility(0);
                                        jhm.i.setVisibility(0);
                                        jhm.g.setVisibility(8);
                                        jhm.i.setText((CharSequence)jhm.j.e.getString(2132018788));
                                    }
                                }
                                else {
                                    jhm.h.setVisibility(8);
                                    jhm.i.setVisibility(8);
                                    jhm.g.setVisibility(8);
                                }
                                i = f.j;
                                final int n2 = 12;
                                final int n3 = 32;
                                if (i == 1) {
                                    jhm.d.setVisibility(8);
                                    jhm.c.setVisibility(0);
                                    jhm.e.setMinimumHeight(tmy.aZ(jhm.j.e.getDisplayMetrics(), 48));
                                    final adq layoutParams2 = (adq)jhm.a.getLayoutParams();
                                    layoutParams2.width = tmy.aZ(jhm.j.e.getDisplayMetrics(), 48);
                                    layoutParams2.height = -1;
                                    layoutParams2.setMarginStart(tmy.aZ(jhm.j.e.getDisplayMetrics(), 4));
                                    jhm.a.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                                    apj.c(jhm.a, tmy.cp(jhm.j.f, 2130970924));
                                    final adq layoutParams3 = (adq)jhm.d.getLayoutParams();
                                    if (jhm.j.e()) {
                                        i = -2;
                                    }
                                    else {
                                        i = tmy.aZ(jhm.j.e.getDisplayMetrics(), 56);
                                    }
                                    layoutParams3.width = i;
                                    layoutParams3.height = tmy.aZ(jhm.j.e.getDisplayMetrics(), 32);
                                    layoutParams3.setMarginEnd(tmy.aZ(jhm.j.e.getDisplayMetrics(), 0));
                                    jhm.d.setLayoutParams((ViewGroup$LayoutParams)layoutParams3);
                                }
                                else if (i == 2) {
                                    final int ak = gkt.ak(jhm.j.n);
                                    if (ak != 2) {
                                        if (ak != 3) {
                                            if (ak != 4) {
                                                jhm.a.setVisibility(0);
                                                jhm.e.setMinimumHeight(tmy.aZ(jhm.j.e.getDisplayMetrics(), 48));
                                                jhm.c.setVisibility(0);
                                                final adq layoutParams4 = (adq)jhm.d.getLayoutParams();
                                                if (jhm.j.e()) {
                                                    i = -2;
                                                }
                                                else {
                                                    i = tmy.aZ(jhm.j.e.getDisplayMetrics(), 56);
                                                }
                                                layoutParams4.width = i;
                                                layoutParams4.height = tmy.aZ(jhm.j.e.getDisplayMetrics(), 32);
                                                jhm.d.setLayoutParams((ViewGroup$LayoutParams)layoutParams4);
                                                apj.c(jhm.a, tmy.cp(jhm.j.f, 2130970924));
                                            }
                                            else {
                                                jhm.a.setVisibility(0);
                                                jhm.e.setMinimumHeight(tmy.aZ(jhm.j.e.getDisplayMetrics(), 52));
                                                jhm.c.setVisibility(0);
                                                final adq layoutParams5 = (adq)jhm.d.getLayoutParams();
                                                if (jhm.j.e()) {
                                                    i = -2;
                                                }
                                                else {
                                                    i = tmy.aZ(jhm.j.e.getDisplayMetrics(), 64);
                                                }
                                                layoutParams5.width = i;
                                                layoutParams5.height = tmy.aZ(jhm.j.e.getDisplayMetrics(), 36);
                                                jhm.d.setLayoutParams((ViewGroup$LayoutParams)layoutParams5);
                                                apj.c(jhm.a, tmy.cp(jhm.j.f, 2130970924));
                                            }
                                        }
                                        else {
                                            jhm.a.setVisibility(0);
                                            jhm.e.setMinimumHeight(tmy.aZ(jhm.j.e.getDisplayMetrics(), 48));
                                            jhm.c.setVisibility(8);
                                            final adq layoutParams6 = (adq)jhm.d.getLayoutParams();
                                            if (jhm.j.e()) {
                                                i = -2;
                                            }
                                            else {
                                                i = tmy.aZ(jhm.j.e.getDisplayMetrics(), 56);
                                            }
                                            layoutParams6.width = i;
                                            layoutParams6.height = tmy.aZ(jhm.j.e.getDisplayMetrics(), 32);
                                            layoutParams6.setMarginEnd(tmy.aZ(jhm.j.e.getDisplayMetrics(), 12));
                                            jhm.d.setLayoutParams((ViewGroup$LayoutParams)layoutParams6);
                                            apj.c(jhm.a, tmy.cp(jhm.j.f, 2130970924));
                                        }
                                    }
                                    else {
                                        jhm.a.setVisibility(0);
                                        jhm.e.setMinimumHeight(tmy.aZ(jhm.j.e.getDisplayMetrics(), 48));
                                        jhm.c.setVisibility(0);
                                        jhm.d.setVisibility(8);
                                        final adq layoutParams7 = (adq)jhm.a.getLayoutParams();
                                        if (jhm.j.e()) {
                                            i = -2;
                                        }
                                        else {
                                            i = tmy.aZ(jhm.j.e.getDisplayMetrics(), 56);
                                        }
                                        layoutParams7.width = i;
                                        layoutParams7.height = tmy.aZ(jhm.j.e.getDisplayMetrics(), 32);
                                        layoutParams7.setMarginStart(tmy.aZ(jhm.j.e.getDisplayMetrics(), 12));
                                        jhm.a.setLayoutParams((ViewGroup$LayoutParams)layoutParams7);
                                        apj.c(jhm.a, (ColorStateList)null);
                                    }
                                    if (!f.i.isEmpty()) {
                                        i = tmy.aZ(jhm.j.e.getDisplayMetrics(), 44);
                                        Object o2 = aewp.a;
                                        for (final auck auck2 : f.i) {
                                            o2 = aexq.k(auck2);
                                            if (i < auck2.b) {
                                                break;
                                            }
                                        }
                                        if (((aexq)o2).h() && !jhm.j.d()) {
                                            if (ak == 2) {
                                                jhm.a.setVisibility(0);
                                                jhm.a.setImageDrawable((Drawable)null);
                                                jhm.j.c.f(jhm.a, Uri.parse((String)((aexw)((auck)((aexq)o2).c()).c).a));
                                            }
                                            else {
                                                jhm.d.setVisibility(0);
                                                jhm.d.setImageDrawable((Drawable)null);
                                                final ImageView d2 = jhm.d;
                                                final adq layoutParams8 = (adq)((View)d2).getLayoutParams();
                                                if (layoutParams8 != null) {
                                                    if (((auck)((aexq)o2).c()).b > ((auck)((aexq)o2).c()).a) {
                                                        layoutParams8.topMargin = tmy.aZ(jhm.j.e.getDisplayMetrics(), 4);
                                                        layoutParams8.bottomMargin = tmy.aZ(jhm.j.e.getDisplayMetrics(), 4);
                                                        layoutParams8.height = tmy.aZ(jhm.j.e.getDisplayMetrics(), 40);
                                                    }
                                                    else {
                                                        layoutParams8.topMargin = tmy.aZ(jhm.j.e.getDisplayMetrics(), 8);
                                                        layoutParams8.bottomMargin = tmy.aZ(jhm.j.e.getDisplayMetrics(), 8);
                                                        final DisplayMetrics displayMetrics = jhm.j.e.getDisplayMetrics();
                                                        i = n3;
                                                        if (ak == 4) {
                                                            i = 36;
                                                        }
                                                        layoutParams8.height = tmy.aZ(displayMetrics, i);
                                                    }
                                                    ((View)d2).setLayoutParams((ViewGroup$LayoutParams)layoutParams8);
                                                }
                                                jhm.j.c.f(jhm.d, Uri.parse((String)((aexw)((auck)((aexq)o2).c()).c).a));
                                            }
                                        }
                                        else if (ak == 2) {
                                            jhm.a.setImageDrawable((Drawable)null);
                                            jhm.a.setVisibility(4);
                                        }
                                        else {
                                            jhm.d.setImageDrawable((Drawable)null);
                                            jhm.d.setVisibility(4);
                                        }
                                    }
                                    else if (ak == 2) {
                                        jhm.a.setImageDrawable((Drawable)null);
                                        jhm.a.setVisibility(4);
                                    }
                                    else {
                                        jhm.d.setImageDrawable((Drawable)null);
                                        jhm.d.setVisibility(4);
                                    }
                                    if (jhm.j.e()) {
                                        jhm.d.setClipToOutline(true);
                                        jhm.d.setAdjustViewBounds(true);
                                        jhm.d.setBackgroundResource(2131231035);
                                    }
                                    else {
                                        jhm.d.setAdjustViewBounds(false);
                                        jhm.d.setClipToOutline(false);
                                        jhm.d.setBackground((Drawable)null);
                                    }
                                }
                                final jhn j2 = jhm.j;
                                final TextView b = jhm.b;
                                i = n2;
                                if (!gkt.J(j2.j)) {
                                    i = 20;
                                }
                                int n4 = 0;
                                Label_3256: {
                                    if (!j2.l.ch()) {
                                        n4 = i;
                                        if (!j2.m.aE()) {
                                            break Label_3256;
                                        }
                                    }
                                    n4 = i + 4;
                                }
                                b.setPaddingRelative(tmy.aZ(j2.e.getDisplayMetrics(), n4), 0, tmy.aZ(j2.e.getDisplayMetrics(), 0), 0);
                                final jhn j3 = jhm.j;
                                final TextView b2 = jhm.b;
                                i = tmy.be(j3.f);
                                if (i == 3 || i == 4) {
                                    b2.setTypeface(j3.a(b2));
                                    b2.setTextColor(tmy.ct(j3.f, 2130970924).orElse(0));
                                    b2.setTextSize(2, 20.0f);
                                    break Label_3642;
                                }
                                b2.setTypeface(j3.a(b2));
                                b2.setTextColor(tmy.ct(j3.f, 2130970924).orElse(0));
                                if ((j3.l.ch() || j3.m.aE()) && (j3.l.ci() || j3.m.aD())) {
                                    b2.setTextSize(2, 14.0f);
                                    break Label_3642;
                                }
                                b2.setTextSize(2, 16.0f);
                                break Label_3642;
                            }
                        }
                        if (f.b()) {
                            jhm.a.setImageResource(2131233644);
                            jhm.a.setVisibility(0);
                            continue;
                        }
                        if (f.n == 1) {
                            jhm.a.setVisibility(4);
                            jhm.a.setImageResource(0);
                            continue;
                        }
                        jhm.a.setImageResource(2131233877);
                        jhm.a.setTag((Object)2131233877);
                        jhm.a.setVisibility(0);
                        continue;
                    }
                }
            }
            else if (item instanceof jlb) {
                final jlb jlb = (jlb)item;
                if (view == null) {
                    view = this.p.inflate(2131625325, viewGroup, false);
                }
                jjg jjg;
                if ((jjg = (jjg)view.getTag(2131431285)) == null) {
                    view.setTag(2131431285, (Object)(jjg = new jjg(view, this.r, this.n, (byte[])null, (byte[])null)));
                }
                ((TextView)jjg.b).setText((CharSequence)jlb.a);
            }
            else if (item instanceof jlc) {
                final jlc jlc = (jlc)item;
                if (view == null) {
                    view = this.p.inflate(2131625326, viewGroup, false);
                }
                ((ImageView)view.findViewById(2131428705)).getLayoutParams().height = Math.round(jlc.a);
            }
            else {
                view = new View(this.f);
            }
        }
        this.f("ss_rdf");
        this.i = null;
        return view;
    }
    
    public final int getViewTypeCount() {
        return 4;
    }
    
    public final boolean isEnabled(final int n) {
        return this.getItem(n) instanceof acwl;
    }
}
