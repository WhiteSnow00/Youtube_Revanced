import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;
import android.net.Uri;
import java.util.List;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class hbe extends utv
{
    final hbg a;
    final aeea b;
    
    public hbe(final hbg a, final Context context, final cl cl, final wyw wyw, final aeea b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
        super(context, cl, wyw, true, true);
    }
    
    protected final View a() {
        if (!this.a.t()) {
            final hbg a = this.a;
            a.m((List)hbg.a);
            a.n(true);
            return a.g;
        }
        final hbg a2 = this.a;
        a2.q(true, true, (Uri)null, (String)null);
        return a2.h;
    }
    
    protected final xab c() {
        return null;
    }
    
    protected final String f() {
        return this.a.e.getString(2132019770);
    }
    
    public final void h() {
        super.h();
        final hbb t = this.a.t;
        if (t.g) {
            final EffectsFeatureDescriptionView e = t.e;
            if (e != null) {
                e.c("", t.f, "");
            }
        }
        final View[] c = this.a.c;
        for (int i = 0; i < 3; ++i) {
            c[i].setVisibility(0);
        }
        if (this.a.o == hbg.b) {
            this.b.cD(xaa.b(127083)).a();
        }
        this.a.n(false);
        this.a.o = null;
    }
    
    public final void l() {
        final View[] c = this.a.c;
        for (int i = 0; i < 3; ++i) {
            c[i].setVisibility(4);
        }
        super.l();
    }
    
    protected final boolean o() {
        return false;
    }
}
