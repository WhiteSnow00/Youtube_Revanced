import android.view.View;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbn implements View$OnClickListener
{
    public final CreationButtonView a;
    public final CreationButtonView b;
    public final hao c;
    boolean d;
    boolean e;
    boolean f;
    private final EffectsFeatureDescriptionView g;
    private final Drawable h;
    private final Drawable i;
    private final Drawable j;
    private final Drawable k;
    private final Context l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final aeea q;
    
    public hbn(final CreationButtonView a, final CreationButtonView b, final EffectsFeatureDescriptionView g, final Context l, final hao c, final aeea q, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.q = q;
        this.c = c;
        this.l = l;
        this.m = l.getString(2132017606);
        this.n = l.getString(2132017605);
        this.o = l.getString(2132017215);
        this.p = l.getString(2132017214);
        this.h = fc.b(l, 2131231896);
        this.i = fc.b(l, 2131231895);
        this.j = fc.b(l, 2131231890);
        this.k = fc.b(l, 2131231889);
    }
    
    private final void c(final int n) {
        this.q.cG(xaa.c(n)).d();
    }
    
    private final void d() {
        Drawable h = this.h;
        if (h != null) {
            final Drawable i = this.i;
            if (i != null) {
                final CreationButtonView a = this.a;
                if (!this.e) {
                    h = i;
                }
                a.d(h);
            }
        }
    }
    
    public final void a(final float n, final float n2) {
        final boolean b = true;
        this.e = (n == 1.0f);
        this.d = (n2 == 1.0f && b);
        this.d();
        this.b();
    }
    
    public final void b() {
        if (!this.f) {
            this.b.setVisibility(8);
            return;
        }
        Drawable j = this.j;
        if (j != null) {
            final Drawable k = this.k;
            if (k != null) {
                final CreationButtonView b = this.b;
                if (!this.d) {
                    j = k;
                }
                b.d(j);
                this.b.setVisibility(0);
                return;
            }
        }
        this.b.setVisibility(8);
    }
    
    public final void onClick(final View view) {
        final CreationButtonView a = this.a;
        float n = 1.0f;
        if (view == a) {
            final boolean e = this.e ^ true;
            this.e = e;
            final EffectsFeatureDescriptionView g = this.g;
            String s;
            if (e) {
                s = this.m;
            }
            else {
                s = this.n;
            }
            g.c(s, "", "");
            final Context l = this.l;
            final CreationButtonView a2 = this.a;
            String s2;
            if (this.e) {
                s2 = this.m;
            }
            else {
                s2 = this.n;
            }
            tsy.c(l, (View)a2, (CharSequence)s2);
            final hao c = this.c;
            if (!this.e) {
                n = 0.0f;
            }
            tbi.f();
            c.b(c.b = n);
            c.r();
            c.k();
            this.d();
            this.c(126352);
            return;
        }
        if (view == this.b) {
            final boolean d = this.d;
            this.d = (d ^ true);
            final hao c2 = this.c;
            if (d) {
                n = 0.0f;
            }
            tbi.f();
            c2.b(c2.c = n);
            c2.q();
            c2.k();
            final Context i = this.l;
            final CreationButtonView b = this.b;
            String s3;
            if (this.d) {
                s3 = this.o;
            }
            else {
                s3 = this.p;
            }
            tsy.c(i, (View)b, (CharSequence)s3);
            this.b();
            this.c(126353);
        }
    }
}
