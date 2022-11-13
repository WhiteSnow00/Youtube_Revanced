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

public final class jip extends BaseAdapter implements acxy, jhm
{
    public final ArrayList a;
    public final SparseIntArray b;
    public final acgs c;
    public boolean d;
    public final Resources e;
    public final Context f;
    public int g;
    public Typeface h;
    public xan i;
    public final vaf j;
    public final vai k;
    public final vai l;
    public final vai m;
    public final arwh n;
    public pvh o;
    private final LayoutInflater p;
    private Typeface q;
    private final vcy r;
    private final atke s;
    
    public jip(final Context f, final vaf j, final arwh n, final vcy r, final acgs c, final vai k, final atke s, final vai l, final vai m, final byte[] array, final byte[] array2) {
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
        final xan i = this.i;
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
    
    public final xan b() {
        return this.i;
    }
    
    public final void c(final xan xan) {
        throw null;
    }
    
    public final boolean d() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjv.b((AtomicReference)this.k.l(45362408L).aC(false).aa((asjm)new jdq(atomicBoolean, 10)));
        if (!atomicBoolean.get()) {
            return false;
        }
        final amqs b = ((addu)this.s.a()).b();
        return b == amqs.c || b == amqs.d || b == amqs.e || b == amqs.b;
    }
    
    public final boolean e() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjv.b((AtomicReference)this.k.l(45375635L).aC(false).aa((asjm)new jdq(atomicBoolean, 10)));
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
        if (item instanceof acyn) {
            if (((acyn)item).a()) {
                return 3;
            }
            return 0;
        }
        else {
            if (item instanceof jmc) {
                return 2;
            }
            if (item instanceof jmd) {
                return 1;
            }
            return 0;
        }
    }
    
    public final View getView(int i, View view, final ViewGroup viewGroup) {
        this.f("ss_rds");
        final Object item = this.getItem(i);
        Label_3645: {
            if (item instanceof acyn) {
                final acyn f = (acyn)item;
                if (f.a()) {
                    if (view == null) {
                        view = this.p.inflate(2131625322, viewGroup, false);
                        view.setPaddingRelative(0, 0, 0, 0);
                    }
                    jin jin;
                    if ((jin = (jin)view.getTag(2131430023)) == null) {
                        jin = new jin(this, view);
                        view.setTag(2131430023, (Object)jin);
                    }
                    jin.b.setText((CharSequence)((aezv)((acym)f.k.c()).b).a);
                    jin.c.setText((CharSequence)((acym)f.k.c()).e.c());
                    jin.d.setText((CharSequence)jin.h.e.getString(2132018762, new Object[] { ((acym)f.k.c()).f.c(), ((acym)f.k.c()).g.c() }));
                    jin.e.setText((CharSequence)((aezv)((acym)f.k.c()).c).a);
                    jin.e.a();
                    jin.e.setVisibility(0);
                    if (!f.i.isEmpty()) {
                        i = tpe.aZ(jin.h.e.getDisplayMetrics(), 44);
                        Object o = aeyo.a;
                        for (final audb audb : f.i) {
                            o = audb.c;
                            if (i < audb.b) {
                                break;
                            }
                        }
                        final aezp aezp = (aezp)o;
                        if (aezp.h() && !jin.h.d()) {
                            jin.a.setVisibility(0);
                            jin.a.setImageDrawable((Drawable)null);
                            jin.h.c.f(jin.a, Uri.parse((String)aezp.c()));
                        }
                        else {
                            jin.a.setImageDrawable((Drawable)null);
                            jin.a.setVisibility(4);
                        }
                        final ViewGroup$LayoutParams layoutParams = jin.a.getLayoutParams();
                        if (jin.h.e()) {
                            if (layoutParams != null) {
                                layoutParams.width = -2;
                            }
                            jin.a.setClipToOutline(true);
                            jin.a.setAdjustViewBounds(true);
                            jin.a.setBackgroundResource(2131231035);
                        }
                        else {
                            if (layoutParams != null) {
                                layoutParams.width = tpe.aZ(jin.h.e.getDisplayMetrics(), 56);
                            }
                            jin.a.setClipToOutline(false);
                            jin.a.setAdjustViewBounds(false);
                            jin.a.setBackground((Drawable)null);
                        }
                        if (layoutParams != null) {
                            jin.a.setLayoutParams(layoutParams);
                        }
                    }
                    else {
                        jin.a.setImageDrawable((Drawable)null);
                        jin.a.setVisibility(4);
                        jin.a.setClipToOutline(false);
                        jin.a.setBackground((Drawable)null);
                    }
                    if (((acym)f.k.c()).d <= 0.0f) {
                        jin.f.setVisibility(8);
                    }
                    else {
                        jin.f.setVisibility(0);
                        jin.g.setVisibility(0);
                        jin.g.setProgress((int)(((acym)f.k.c()).d * 100.0f));
                    }
                }
                else {
                    if (view == null) {
                        view = this.p.inflate(2131625332, viewGroup, false);
                        view.setPaddingRelative(0, 0, 0, 0);
                    }
                    jio jio;
                    if ((jio = (jio)view.getTag(2131431308)) == null) {
                        jio = new jio(this, view);
                        jio.c.setOnClickListener((View$OnClickListener)new ivc(this, jio, 17));
                        view.setTag(2131431308, (Object)jio);
                    }
                    jio.f = f;
                    final Spanned h = f.h;
                    if (h != null) {
                        final SpannableString text = new SpannableString((CharSequence)f.a);
                        final StyleSpan[] array = (StyleSpan[])h.getSpans(0, h.length(), (Class)StyleSpan.class);
                        int length;
                        StyleSpan styleSpan;
                        jip j;
                        jip k;
                        jip l;
                        int g;
                        for (length = array.length, i = 0; i < length; ++i) {
                            styleSpan = array[i];
                            if (styleSpan.getStyle() == 1) {
                                j = jio.j;
                                if (j.h == null) {
                                    j.h = Typeface.create("sans-serif-medium", 0);
                                }
                                k = jio.j;
                                if (k.h == null) {
                                    k.h = Typeface.create("sans-serif-medium", 0);
                                }
                                text.setSpan((Object)new acag(k.h), h.getSpanStart((Object)styleSpan), h.getSpanEnd((Object)styleSpan), 33);
                                l = jio.j;
                                if ((g = l.g) == 0) {
                                    g = tpe.cx(l.f, 2130970924).orElse(0);
                                    l.g = g;
                                }
                                text.setSpan((Object)new ForegroundColorSpan(g), h.getSpanStart((Object)styleSpan), h.getSpanEnd((Object)styleSpan), 33);
                            }
                        }
                        jio.b.setText((CharSequence)text);
                    }
                    else {
                        jio.b.setText((CharSequence)f.a);
                    }
                    jio.c.setContentDescription((CharSequence)jio.j.e.getString(2132017385, new Object[] { f.a }));
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
                                alxw alxw;
                                if ((alxw = jio.j.n.f().e) == null) {
                                    alxw = alxw.a;
                                }
                                if (alxw.ak.equals("trending")) {
                                    jio.a.setImageResource(2131233736);
                                    jio.a.setTag((Object)2131233736);
                                }
                                else {
                                    jio.a.setImageResource(2131233879);
                                    jio.a.setTag((Object)2131233879);
                                }
                                jio.a.setVisibility(0);
                                if (f.m) {
                                    final jip m = jio.j;
                                    final AtomicLong atomicLong = new AtomicLong();
                                    asjv.b((AtomicReference)m.k.n(45378449L).aC(0L).aa((asjm)new jdq(atomicLong, 11)));
                                    i = (int)atomicLong.get();
                                    if (i != 1) {
                                        if (i != 2) {
                                            if (i != 3) {
                                                if (i != 4) {
                                                    jio.h.setVisibility(8);
                                                    jio.i.setVisibility(8);
                                                    jio.g.setVisibility(8);
                                                }
                                                else {
                                                    jio.h.setVisibility(8);
                                                    jio.i.setVisibility(8);
                                                    jio.g.setVisibility(0);
                                                }
                                            }
                                            else {
                                                jio.h.setVisibility(8);
                                                jio.i.setVisibility(0);
                                                jio.g.setVisibility(8);
                                                jio.i.setText((CharSequence)jio.j.e.getString(2132018789));
                                            }
                                        }
                                        else {
                                            jio.h.setVisibility(0);
                                            jio.i.setVisibility(0);
                                            jio.g.setVisibility(8);
                                            jio.i.setText((CharSequence)jio.j.e.getString(2132018790));
                                        }
                                    }
                                    else {
                                        jio.h.setVisibility(0);
                                        jio.i.setVisibility(0);
                                        jio.g.setVisibility(8);
                                        jio.i.setText((CharSequence)jio.j.e.getString(2132018789));
                                    }
                                }
                                else {
                                    jio.h.setVisibility(8);
                                    jio.i.setVisibility(8);
                                    jio.g.setVisibility(8);
                                }
                                i = f.j;
                                final int n2 = 12;
                                final int n3 = 32;
                                if (i == 1) {
                                    jio.d.setVisibility(8);
                                    jio.c.setVisibility(0);
                                    jio.e.setMinimumHeight(tpe.aZ(jio.j.e.getDisplayMetrics(), 48));
                                    final adr layoutParams2 = (adr)jio.a.getLayoutParams();
                                    layoutParams2.width = tpe.aZ(jio.j.e.getDisplayMetrics(), 48);
                                    layoutParams2.height = -1;
                                    layoutParams2.setMarginStart(tpe.aZ(jio.j.e.getDisplayMetrics(), 4));
                                    jio.a.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                                    apk.c(jio.a, tpe.ct(jio.j.f, 2130970924));
                                    final adr layoutParams3 = (adr)jio.d.getLayoutParams();
                                    if (jio.j.e()) {
                                        i = -2;
                                    }
                                    else {
                                        i = tpe.aZ(jio.j.e.getDisplayMetrics(), 56);
                                    }
                                    layoutParams3.width = i;
                                    layoutParams3.height = tpe.aZ(jio.j.e.getDisplayMetrics(), 32);
                                    layoutParams3.setMarginEnd(tpe.aZ(jio.j.e.getDisplayMetrics(), 0));
                                    jio.d.setLayoutParams((ViewGroup$LayoutParams)layoutParams3);
                                }
                                else if (i == 2) {
                                    final int ad = fbu.aD(jio.j.n);
                                    if (ad != 2) {
                                        if (ad != 3) {
                                            if (ad != 4) {
                                                jio.a.setVisibility(0);
                                                jio.e.setMinimumHeight(tpe.aZ(jio.j.e.getDisplayMetrics(), 48));
                                                jio.c.setVisibility(0);
                                                final adr layoutParams4 = (adr)jio.d.getLayoutParams();
                                                if (jio.j.e()) {
                                                    i = -2;
                                                }
                                                else {
                                                    i = tpe.aZ(jio.j.e.getDisplayMetrics(), 56);
                                                }
                                                layoutParams4.width = i;
                                                layoutParams4.height = tpe.aZ(jio.j.e.getDisplayMetrics(), 32);
                                                jio.d.setLayoutParams((ViewGroup$LayoutParams)layoutParams4);
                                                apk.c(jio.a, tpe.ct(jio.j.f, 2130970924));
                                            }
                                            else {
                                                jio.a.setVisibility(0);
                                                jio.e.setMinimumHeight(tpe.aZ(jio.j.e.getDisplayMetrics(), 52));
                                                jio.c.setVisibility(0);
                                                final adr layoutParams5 = (adr)jio.d.getLayoutParams();
                                                if (jio.j.e()) {
                                                    i = -2;
                                                }
                                                else {
                                                    i = tpe.aZ(jio.j.e.getDisplayMetrics(), 64);
                                                }
                                                layoutParams5.width = i;
                                                layoutParams5.height = tpe.aZ(jio.j.e.getDisplayMetrics(), 36);
                                                jio.d.setLayoutParams((ViewGroup$LayoutParams)layoutParams5);
                                                apk.c(jio.a, tpe.ct(jio.j.f, 2130970924));
                                            }
                                        }
                                        else {
                                            jio.a.setVisibility(0);
                                            jio.e.setMinimumHeight(tpe.aZ(jio.j.e.getDisplayMetrics(), 48));
                                            jio.c.setVisibility(8);
                                            final adr layoutParams6 = (adr)jio.d.getLayoutParams();
                                            if (jio.j.e()) {
                                                i = -2;
                                            }
                                            else {
                                                i = tpe.aZ(jio.j.e.getDisplayMetrics(), 56);
                                            }
                                            layoutParams6.width = i;
                                            layoutParams6.height = tpe.aZ(jio.j.e.getDisplayMetrics(), 32);
                                            layoutParams6.setMarginEnd(tpe.aZ(jio.j.e.getDisplayMetrics(), 12));
                                            jio.d.setLayoutParams((ViewGroup$LayoutParams)layoutParams6);
                                            apk.c(jio.a, tpe.ct(jio.j.f, 2130970924));
                                        }
                                    }
                                    else {
                                        jio.a.setVisibility(0);
                                        jio.e.setMinimumHeight(tpe.aZ(jio.j.e.getDisplayMetrics(), 48));
                                        jio.c.setVisibility(0);
                                        jio.d.setVisibility(8);
                                        final adr layoutParams7 = (adr)jio.a.getLayoutParams();
                                        if (jio.j.e()) {
                                            i = -2;
                                        }
                                        else {
                                            i = tpe.aZ(jio.j.e.getDisplayMetrics(), 56);
                                        }
                                        layoutParams7.width = i;
                                        layoutParams7.height = tpe.aZ(jio.j.e.getDisplayMetrics(), 32);
                                        layoutParams7.setMarginStart(tpe.aZ(jio.j.e.getDisplayMetrics(), 12));
                                        jio.a.setLayoutParams((ViewGroup$LayoutParams)layoutParams7);
                                        apk.c(jio.a, (ColorStateList)null);
                                    }
                                    if (!f.i.isEmpty()) {
                                        i = tpe.aZ(jio.j.e.getDisplayMetrics(), 44);
                                        Object o2 = aeyo.a;
                                        for (final audb audb2 : f.i) {
                                            o2 = aezp.k((Object)audb2);
                                            if (i < audb2.b) {
                                                break;
                                            }
                                        }
                                        if (((aezp)o2).h() && !jio.j.d()) {
                                            if (ad == 2) {
                                                jio.a.setVisibility(0);
                                                jio.a.setImageDrawable((Drawable)null);
                                                jio.j.c.f(jio.a, Uri.parse((String)((aezv)((audb)((aezp)o2).c()).c).a));
                                            }
                                            else {
                                                jio.d.setVisibility(0);
                                                jio.d.setImageDrawable((Drawable)null);
                                                final ImageView d2 = jio.d;
                                                final adr layoutParams8 = (adr)((View)d2).getLayoutParams();
                                                if (layoutParams8 != null) {
                                                    if (((audb)((aezp)o2).c()).b > ((audb)((aezp)o2).c()).a) {
                                                        layoutParams8.topMargin = tpe.aZ(jio.j.e.getDisplayMetrics(), 4);
                                                        layoutParams8.bottomMargin = tpe.aZ(jio.j.e.getDisplayMetrics(), 4);
                                                        layoutParams8.height = tpe.aZ(jio.j.e.getDisplayMetrics(), 40);
                                                    }
                                                    else {
                                                        layoutParams8.topMargin = tpe.aZ(jio.j.e.getDisplayMetrics(), 8);
                                                        layoutParams8.bottomMargin = tpe.aZ(jio.j.e.getDisplayMetrics(), 8);
                                                        final DisplayMetrics displayMetrics = jio.j.e.getDisplayMetrics();
                                                        i = n3;
                                                        if (ad == 4) {
                                                            i = 36;
                                                        }
                                                        layoutParams8.height = tpe.aZ(displayMetrics, i);
                                                    }
                                                    ((View)d2).setLayoutParams((ViewGroup$LayoutParams)layoutParams8);
                                                }
                                                jio.j.c.f(jio.d, Uri.parse((String)((aezv)((audb)((aezp)o2).c()).c).a));
                                            }
                                        }
                                        else if (ad == 2) {
                                            jio.a.setImageDrawable((Drawable)null);
                                            jio.a.setVisibility(4);
                                        }
                                        else {
                                            jio.d.setImageDrawable((Drawable)null);
                                            jio.d.setVisibility(4);
                                        }
                                    }
                                    else if (ad == 2) {
                                        jio.a.setImageDrawable((Drawable)null);
                                        jio.a.setVisibility(4);
                                    }
                                    else {
                                        jio.d.setImageDrawable((Drawable)null);
                                        jio.d.setVisibility(4);
                                    }
                                    if (jio.j.e()) {
                                        jio.d.setClipToOutline(true);
                                        jio.d.setAdjustViewBounds(true);
                                        jio.d.setBackgroundResource(2131231035);
                                    }
                                    else {
                                        jio.d.setAdjustViewBounds(false);
                                        jio.d.setClipToOutline(false);
                                        jio.d.setBackground((Drawable)null);
                                    }
                                }
                                final jip j2 = jio.j;
                                final TextView b = jio.b;
                                i = n2;
                                if (!fbu.al(j2.j)) {
                                    i = 20;
                                }
                                int n4 = 0;
                                Label_3259: {
                                    if (!j2.l.ci()) {
                                        n4 = i;
                                        if (!j2.m.aF()) {
                                            break Label_3259;
                                        }
                                    }
                                    n4 = i + 4;
                                }
                                b.setPaddingRelative(tpe.aZ(j2.e.getDisplayMetrics(), n4), 0, tpe.aZ(j2.e.getDisplayMetrics(), 0), 0);
                                final jip j3 = jio.j;
                                final TextView b2 = jio.b;
                                i = tpe.be(j3.f);
                                if (i == 3 || i == 4) {
                                    b2.setTypeface(j3.a(b2));
                                    b2.setTextColor(tpe.cx(j3.f, 2130970924).orElse(0));
                                    b2.setTextSize(2, 20.0f);
                                    break Label_3645;
                                }
                                b2.setTypeface(j3.a(b2));
                                b2.setTextColor(tpe.cx(j3.f, 2130970924).orElse(0));
                                if ((j3.l.ci() || j3.m.aF()) && (j3.l.cj() || j3.m.aE())) {
                                    b2.setTextSize(2, 14.0f);
                                    break Label_3645;
                                }
                                b2.setTextSize(2, 16.0f);
                                break Label_3645;
                            }
                        }
                        if (f.b()) {
                            jio.a.setImageResource(2131233646);
                            jio.a.setVisibility(0);
                            continue;
                        }
                        if (f.n == 1) {
                            jio.a.setVisibility(4);
                            jio.a.setImageResource(0);
                            continue;
                        }
                        jio.a.setImageResource(2131233879);
                        jio.a.setTag((Object)2131233879);
                        jio.a.setVisibility(0);
                        continue;
                    }
                }
            }
            else if (item instanceof jmc) {
                final jmc jmc = (jmc)item;
                if (view == null) {
                    view = this.p.inflate(2131625330, viewGroup, false);
                }
                jki jki;
                if ((jki = (jki)view.getTag(2131431288)) == null) {
                    view.setTag(2131431288, (Object)(jki = new jki(view, this.r, this.n, (byte[])null, (byte[])null)));
                }
                ((TextView)jki.b).setText((CharSequence)jmc.a);
            }
            else if (item instanceof jmd) {
                final jmd jmd = (jmd)item;
                if (view == null) {
                    view = this.p.inflate(2131625331, viewGroup, false);
                }
                ((ImageView)view.findViewById(2131428705)).getLayoutParams().height = Math.round(jmd.a);
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
        return this.getItem(n) instanceof acyn;
    }
}
