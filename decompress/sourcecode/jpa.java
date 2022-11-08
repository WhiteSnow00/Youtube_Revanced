import android.view.View$OnClickListener;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpa
{
    public final tku a;
    public final fa b;
    public final zjy c;
    public final zki d;
    public String e;
    public boolean f;
    private final tku g;
    private final tku h;
    private final SharedPreferences i;
    private final gbn j;
    private final asho k;
    private SharedPreferences$OnSharedPreferenceChangeListener l;
    
    public jpa(final fa b, final uyf uyf, final tku g, final tku a, final tku h, final SharedPreferences i, final gbn j, final asho k, final zjy c, final zki d) {
        this.b = b;
        this.g = g;
        this.a = a;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.f = true;
        this.c = c;
        this.d = d;
        if (!gkt.y(uyf)) {
            return;
        }
        g.d().L((asjc)jch.l).p().P(k).T((asit)new gcn(this, 8)).ak();
        h.d().L((asjc)jch.k).p().P(k).T((asit)new gcn(this, 7)).ak();
        this.e = i.getString("offline_quality", (String)null);
        i.registerOnSharedPreferenceChangeListener(this.l = (SharedPreferences$OnSharedPreferenceChangeListener)new joz(this, 0));
    }
    
    public final void a() {
        if (!this.f) {
            return;
        }
        final gbo d = gbq.d();
        d.k((CharSequence)this.b.getString(2132017832));
        d.c(-1);
        ((acty)d).m(this.b.getString(2132017831), (View$OnClickListener)new jlq(this, 15));
        this.j.n((actz)d.a());
    }
}
