import android.content.res.XmlResourceParser;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.ListPreference;
import androidx.preference.EditTextPreference;
import android.content.Context;
import org.xmlpull.v1.XmlPullParser;
import androidx.preference.SwitchPreference;
import android.util.TypedValue;
import android.support.v7.widget.LinearLayoutManager;
import androidx.preference.PreferenceGroup;
import android.util.Log;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cey extends br implements cff, cfd, cfe, ced
{
    public cfg a;
    private int ae;
    private final Handler af;
    private final Runnable ag;
    public RecyclerView b;
    private final ceu c;
    private boolean d;
    private boolean e;
    
    public cey() {
        this.c = new ceu(this);
        this.ae = 2131625088;
        this.af = new cet(this, Looper.getMainLooper());
        this.ag = new cdj(this, 3);
    }
    
    public final View K(final LayoutInflater layoutInflater, ViewGroup viewGroup, final Bundle bundle) {
        final TypedArray obtainStyledAttributes = this.nY().obtainStyledAttributes((AttributeSet)null, cfk.h, 2130970122, 0);
        this.ae = obtainStyledAttributes.getResourceId(0, this.ae);
        final Drawable drawable = obtainStyledAttributes.getDrawable(1);
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        final LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.nY());
        final View inflate = cloneInContext.inflate(this.ae, viewGroup, false);
        final View viewById = inflate.findViewById(16908351);
        if (!(viewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        viewGroup = (ViewGroup)viewById;
        final RecyclerView n = this.n(cloneInContext, viewGroup, bundle);
        if (n != null) {
            (this.b = n).aC((hy)this.c);
            this.s(drawable);
            if (dimensionPixelSize != -1) {
                final ceu c = this.c;
                c.b = dimensionPixelSize;
                c.d.b.M();
            }
            this.c.c = boolean1;
            if (this.b.getParent() == null) {
                viewGroup.addView((View)this.b);
            }
            this.af.post(this.ag);
            return inflate;
        }
        throw new RuntimeException("Could not create RecyclerView");
    }
    
    public void aK(final PreferenceScreen b) {
        if (b != null) {
            final cfg a = this.a;
            final PreferenceScreen b2 = a.b;
            if (b != b2) {
                if (b2 != null) {
                    ((Preference)b2).B();
                }
                a.b = b;
                this.d = true;
                if (this.e) {
                    if (!this.af.hasMessages(1)) {
                        this.af.obtainMessage(1).sendToTarget();
                    }
                }
            }
        }
    }
    
    public boolean aL(final Preference preference) {
        final String u = preference.u;
        boolean b = false;
        if (u != null) {
            for (br c = this; !b && c != null; c = c.C) {
                if (c instanceof cew) {
                    b = ((cew)c).b(preference);
                }
            }
            if (!b) {
                this.nT();
            }
            if (!b && (!(this.od() instanceof cew) || !((cew)this.od()).b(preference))) {
                Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                final cl g = this.G();
                final Bundle q = preference.q();
                final by h = g.h();
                this.oe().getClassLoader();
                final br c2 = h.c(preference.u);
                c2.ag(q);
                c2.aG((br)this);
                final ct i = g.i();
                i.A(((View)this.mJ().getParent()).getId(), c2);
                i.t((String)null);
                i.a();
            }
            return true;
        }
        return false;
    }
    
    public abstract void aM();
    
    public final void aN() {
        boolean a = false;
        for (br c = this; !a && c != null; c = c.C) {
            if (c instanceof cex) {
                a = ((cex)c).a();
            }
        }
        if (!a) {
            this.nT();
        }
        if (!a && this.od() instanceof cex) {
            ((cex)this.od()).a();
        }
    }
    
    public void ab(final View view, Bundle bundle) {
        if (bundle != null) {
            bundle = bundle.getBundle("android:preferences");
            if (bundle != null) {
                final PreferenceScreen o = this.o();
                if (o != null) {
                    ((Preference)o).v(bundle);
                }
            }
        }
        if (this.d) {
            this.q();
        }
        this.e = true;
    }
    
    protected nq d(final PreferenceScreen preferenceScreen) {
        return (nq)new cfb((PreferenceGroup)preferenceScreen);
    }
    
    public RecyclerView n(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        if (this.nY().getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            final RecyclerView recyclerView = (RecyclerView)viewGroup.findViewById(2131430801);
            if (recyclerView != null) {
                return recyclerView;
            }
        }
        final RecyclerView recyclerView2 = (RecyclerView)layoutInflater.inflate(2131625090, viewGroup, false);
        this.nY();
        recyclerView2.af((nw)new LinearLayoutManager());
        recyclerView2.ab((op)new cfi(recyclerView2));
        return recyclerView2;
    }
    
    public final void nm() {
        this.af.removeCallbacks(this.ag);
        this.af.removeMessages(1);
        if (this.d) {
            this.b.ac((nq)null);
            final PreferenceScreen o = this.o();
            if (o != null) {
                ((Preference)o).B();
            }
        }
        this.b = null;
        super.nm();
    }
    
    public void no() {
        super.no();
        final cfg a = this.a;
        a.c = this;
        a.d = this;
    }
    
    public void np() {
        super.np();
        final cfg a = this.a;
        a.c = null;
        a.d = null;
    }
    
    public final PreferenceScreen o() {
        final cfg a = this.a;
        if (a == null) {
            return null;
        }
        return a.b;
    }
    
    public void oq(Bundle m) {
        super.oq(m);
        final TypedValue typedValue = new TypedValue();
        this.nY().getTheme().resolveAttribute(2130970128, typedValue, true);
        int resourceId;
        if ((resourceId = typedValue.resourceId) == 0) {
            resourceId = 2132083455;
        }
        this.nY().getTheme().applyStyle(resourceId, false);
        final cfg a = new cfg(this.nY());
        this.a = a;
        a.e = this;
        m = super.m;
        if (m != null) {
            m.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        this.aM();
    }
    
    public final void p(final int n) {
        final cfg a = this.a;
        if (a != null) {
            final Context ny = this.nY();
            final PreferenceScreen o = this.o();
            a.f(true);
            final int a2 = cfc.a;
            final Object[] array = new Object[2];
            final String concat = String.valueOf(Preference.class.getPackage().getName()).concat(".");
            final String concat2 = String.valueOf(SwitchPreference.class.getPackage().getName()).concat(".");
            Object xml = ny.getResources().getXml(n);
            try {
                final Preference a3 = cfc.a((XmlPullParser)xml, o, ny, array, a, new String[] { concat, concat2 });
                ((XmlResourceParser)xml).close();
                xml = a3;
                ((Preference)xml).A(a);
                a.f(false);
                this.aK((PreferenceScreen)xml);
                return;
            }
            finally {
                ((XmlResourceParser)xml).close();
            }
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }
    
    public final Preference pK(final CharSequence charSequence) {
        final cfg a = this.a;
        if (a == null) {
            return null;
        }
        return a.d(charSequence);
    }
    
    public final void pP(final Bundle bundle) {
        final PreferenceScreen o = this.o();
        if (o != null) {
            final Bundle bundle2 = new Bundle();
            ((Preference)o).w(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }
    
    final void q() {
        final PreferenceScreen o = this.o();
        if (o != null) {
            this.b.ac(this.d(o));
            ((Preference)o).z();
        }
    }
    
    public void r(final Preference preference) {
        boolean a = false;
        for (br c = this; !a && c != null; c = c.C) {
            if (c instanceof cev) {
                a = ((cev)c).a(preference);
            }
        }
        if (!a) {
            this.nT();
        }
        if (a || (this.od() instanceof cev && ((cev)this.od()).a(preference))) {
            return;
        }
        if (this.G().f("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        Object o;
        if (preference instanceof EditTextPreference) {
            final String s = preference.s;
            o = new cee();
            final Bundle bundle = new Bundle(1);
            bundle.putString("key", s);
            ((br)o).ag(bundle);
        }
        else if (preference instanceof ListPreference) {
            final String s2 = preference.s;
            o = new cei();
            final Bundle bundle2 = new Bundle(1);
            bundle2.putString("key", s2);
            ((br)o).ag(bundle2);
        }
        else {
            if (!(preference instanceof MultiSelectListPreference)) {
                final StringBuilder sb = new StringBuilder("Cannot display dialog for an unknown Preference type: ");
                sb.append(preference.getClass().getSimpleName());
                sb.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                throw new IllegalArgumentException(sb.toString());
            }
            final String s3 = preference.s;
            o = new cek();
            final Bundle bundle3 = new Bundle(1);
            bundle3.putString("key", s3);
            ((br)o).ag(bundle3);
        }
        ((br)o).aG((br)this);
        ((bi)o).rJ(this.G(), "androidx.preference.PreferenceFragment.DIALOG");
    }
    
    public final void s(final Drawable a) {
        final ceu c = this.c;
        if (a != null) {
            c.b = a.getIntrinsicHeight();
        }
        else {
            c.b = 0;
        }
        c.a = a;
        c.d.b.M();
    }
}
