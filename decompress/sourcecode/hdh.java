import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchSuggestionsController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchResultsController;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class hdh extends br implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile aenz c;
    private final Object d;
    private boolean e;
    
    public hdh() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void a() {
        if (this.a == null) {
            this.a = aenz.c(super.nT(), (br)this);
            this.b = aqqn.s(super.nT());
        }
    }
    
    @Override
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper a = this.a;
        boolean b = true;
        if (a != null) {
            b = (arin.d((Context)a) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.a();
        this.p();
    }
    
    public final Object aR() {
        return this.o().aR();
    }
    
    @Override
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    @Override
    public final void lP(final Context context) {
        super.lP(context);
        this.a();
        this.p();
    }
    
    @Override
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.a();
        return (Context)this.a;
    }
    
    @Override
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = this.aA();
        return aa.cloneInContext((Context)aenz.d(aa, (br)this));
    }
    
    public final aenz o() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aenz((br)this, true);
                }
            }
        }
        return this.c;
    }
    
    protected final void p() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hda hda = (hda)this;
            final eso eso = (eso)ar;
            hda.a = (Context)eso.aO.L.a();
            hda.b = (MusicSearchResultsController)eso.K.a();
            hda.c = eso.aO.k();
            hda.d = (wwu)eso.aO.j.a();
            hda.e = (MusicSearchSuggestionsController)eso.J.a();
            hda.ai = (auip)eso.a.a.aq.a();
            hda.ae = (acwn)eso.aO.U.a();
        }
    }
}
