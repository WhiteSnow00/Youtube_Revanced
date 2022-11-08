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

public final class cfa extends nq implements cek
{
    public List a;
    private final PreferenceGroup e;
    private List f;
    private final List g;
    private final Handler h;
    private final Runnable i;
    
    public cfa(final PreferenceGroup e) {
        this.i = new cdi(this, 5);
        this.e = e;
        this.h = new Handler(Looper.getMainLooper());
        ((Preference)e).D = (cek)this;
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
            int n2;
            if (!o.z) {
                n2 = n;
            }
            else {
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
            final cee cee = new cee(((Preference)preferenceGroup).j, (List)list2, ((Preference)preferenceGroup).lk());
            ((Preference)cee).o = (cem)new cey(this, preferenceGroup);
            list.add(cee);
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
                final cez cez = new cez(o);
                if (!this.g.contains(cez)) {
                    this.g.add(cez);
                }
                if (o instanceof PreferenceGroup) {
                    final PreferenceGroup preferenceGroup2 = (PreferenceGroup)o;
                    if (preferenceGroup2.ae()) {
                        this.B(list, preferenceGroup2);
                    }
                }
                o.D = (cek)this;
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
        final cez cez = new cez(this.x(n));
        n = this.g.indexOf(cez);
        if (n != -1) {
            return n;
        }
        n = this.g.size();
        this.g.add(cez);
        return n;
    }
    
    public final long mR(final int n) {
        if (!super.c) {
            return -1L;
        }
        return this.x(n).lk();
    }
    
    public final Preference x(final int n) {
        if (n >= 0 && n < this.a()) {
            return this.a.get(n);
        }
        return null;
    }
    
    public final cfi y(final ViewGroup viewGroup, int b) {
        final cez cez = this.g.get(b);
        final LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        final TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet)null, cfj.a);
        Drawable drawable;
        if ((drawable = obtainStyledAttributes.getDrawable(0)) == null) {
            drawable = fc.b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        final View inflate = from.inflate(cez.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            ana.Q(inflate, drawable);
        }
        final ViewGroup viewGroup2 = (ViewGroup)inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            b = cez.b;
            if (b != 0) {
                from.inflate(b, viewGroup2);
            }
            else {
                viewGroup2.setVisibility(8);
            }
        }
        return new cfi(inflate);
    }
    
    public final void z() {
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            ((Preference)iterator.next()).D = null;
        }
        this.B(this.f = new ArrayList(this.f.size()), this.e);
        this.a = this.A(this.e);
        final cff k = ((Preference)this.e).k;
        this.rT();
        for (Preference preference : this.f) {}
    }
}
