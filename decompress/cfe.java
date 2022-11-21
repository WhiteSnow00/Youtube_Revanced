import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.Iterator;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import android.os.Looper;
import android.os.Handler;
import androidx.preference.PreferenceGroup;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfe extends nr implements ceo
{
    public List a;
    private final PreferenceGroup e;
    private List f;
    private final List g;
    private final Handler h;
    private final Runnable i;
    
    public cfe(final PreferenceGroup e) {
        this.i = new cde(this, 6);
        this.e = e;
        this.h = new Handler(Looper.getMainLooper());
        ((Preference)e).D = this;
        this.f = new ArrayList();
        this.a = new ArrayList();
        this.g = new ArrayList();
        if (e instanceof PreferenceScreen) {
            this.s(((PreferenceScreen)e).d);
        }
        else {
            this.s(true);
        }
        this.z();
    }
    
    private final List A(final PreferenceGroup preferenceGroup) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final int k = preferenceGroup.k();
        int i = 0;
        int n = 0;
        while (i < k) {
            final Preference o = preferenceGroup.o(i);
            int n2 = n;
            if (o.z) {
                if (C(preferenceGroup) && n >= preferenceGroup.c) {
                    list2.add(o);
                }
                else {
                    list.add(o);
                }
                if (!(o instanceof PreferenceGroup)) {
                    n2 = n + 1;
                }
                else {
                    final PreferenceGroup preferenceGroup2 = (PreferenceGroup)o;
                    n2 = n;
                    if (preferenceGroup2.ae()) {
                        if (C(preferenceGroup) && C(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        final Iterator iterator = this.A(preferenceGroup2).iterator();
                        while (true) {
                            n2 = n;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final Preference preference = (Preference)iterator.next();
                            if (C(preferenceGroup) && n >= preferenceGroup.c) {
                                list2.add(preference);
                            }
                            else {
                                list.add(preference);
                            }
                            ++n;
                        }
                    }
                }
            }
            ++i;
            n = n2;
        }
        if (C(preferenceGroup) && n > preferenceGroup.c) {
            final cei cei = new cei(((Preference)preferenceGroup).j, list2, ((Preference)preferenceGroup).lk());
            cei.o = new cfc(this, preferenceGroup);
            list.add(cei);
        }
        return list;
    }
    
    private final void B(final List list, final PreferenceGroup preferenceGroup) {
        monitorenter(preferenceGroup);
        try {
            Collections.sort((List<Comparable>)preferenceGroup.b);
            monitorexit(preferenceGroup);
            for (int k = preferenceGroup.k(), i = 0; i < k; ++i) {
                final Preference o = preferenceGroup.o(i);
                list.add(o);
                final cfd cfd = new cfd(o);
                if (!this.g.contains(cfd)) {
                    this.g.add(cfd);
                }
                if (o instanceof PreferenceGroup) {
                    final PreferenceGroup preferenceGroup2 = (PreferenceGroup)o;
                    if (preferenceGroup2.ae()) {
                        this.B(list, preferenceGroup2);
                    }
                }
                o.D = this;
            }
        }
        finally {
            monitorexit(preferenceGroup);
            while (true) {}
        }
    }
    
    private static final boolean C(final PreferenceGroup preferenceGroup) {
        return preferenceGroup.c != Integer.MAX_VALUE;
    }
    
    public final int a() {
        return this.a.size();
    }
    
    public final void b() {
        this.h.removeCallbacks(this.i);
        this.h.post(this.i);
    }
    
    public final int d(int n) {
        final cfd cfd = new cfd(this.x(n));
        n = this.g.indexOf(cfd);
        if (n != -1) {
            return n;
        }
        n = this.g.size();
        this.g.add(cfd);
        return n;
    }
    
    public final /* bridge */ oo g(final ViewGroup viewGroup, final int n) {
        return this.y(viewGroup, n);
    }
    
    public final long mO(final int n) {
        if (!super.c) {
            return -1L;
        }
        return this.x(n).lk();
    }
    
    public final /* bridge */ void q(final oo oo, final int n) {
        final cfm cfm = (cfm)oo;
        final Preference x = this.x(n);
        final Drawable background = cfm.a.getBackground();
        final Drawable t = cfm.t;
        if (background != t) {
            anc.Q(cfm.a, t);
        }
        final TextView textView = (TextView)cfm.E(16908310);
        if (textView != null && cfm.u != null && !textView.getTextColors().equals(cfm.u)) {
            textView.setTextColor(cfm.u);
        }
        x.rN(cfm);
    }
    
    public final Preference x(final int n) {
        if (n >= 0 && n < this.a()) {
            return this.a.get(n);
        }
        return null;
    }
    
    public final cfm y(final ViewGroup viewGroup, int b) {
        final cfd cfd = this.g.get(b);
        final LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        final TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet)null, cfn.a);
        Drawable drawable;
        if ((drawable = obtainStyledAttributes.getDrawable(0)) == null) {
            drawable = fc.b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        final View inflate = from.inflate(cfd.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            anc.Q(inflate, drawable);
        }
        final ViewGroup viewGroup2 = (ViewGroup)inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            b = cfd.b;
            if (b != 0) {
                from.inflate(b, viewGroup2);
            }
            else {
                viewGroup2.setVisibility(8);
            }
        }
        return new cfm(inflate);
    }
    
    public final void z() {
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            ((Preference)iterator.next()).D = null;
        }
        this.B(this.f = new ArrayList(this.f.size()), this.e);
        this.a = this.A(this.e);
        final cfj k = ((Preference)this.e).k;
        this.rZ();
        for (Preference preference : this.f) {}
    }
}
