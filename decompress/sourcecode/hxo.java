import java.util.function.Consumer;
import android.support.v4.app.Fragment$SavedState;
import android.os.Bundle;
import java.util.ArrayList;
import j$.util.Optional;
import android.view.ViewGroup;
import android.content.Context;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.fragments.panels.PanelsBackStack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxo implements ggw, hxk
{
    public final PanelsBackStack a;
    public final cl b;
    public PanelDescriptor c;
    public PanelsConfiguration d;
    private final Context e;
    private final hxm f;
    
    public hxo(final fa e, final mrm mrm, final ViewGroup viewGroup, final fzo fzo, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.e = (Context)e;
        this.b = e.getSupportFragmentManager();
        final cgh savedStateRegistry = e.getSavedStateRegistry();
        final hxm ah = fzo.aH(mrm, viewGroup, 2131431393, 2131431390, 2131431394, (hxk)this, (aeyr)new grk(this, 13), Optional.empty(), Optional.ofNullable((Object)savedStateRegistry.a("fragments.panels.SelectionDetailPanelsController.restoredPanelsLayoutController")));
        this.f = ah;
        savedStateRegistry.c("PANELS_MANAGER_BUNDLE", (cgg)new cb(this, 6));
        ah.getClass();
        savedStateRegistry.c("fragments.panels.SelectionDetailPanelsController.restoredPanelsLayoutController", (cgg)new cb(ah, 7));
        final Bundle a = savedStateRegistry.a("PANELS_MANAGER_BUNDLE");
        if (a != null && a.containsKey("fragments.panels.SelectionDetailPanelsController.restoredBackStack")) {
            this.a = (PanelsBackStack)a.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredBackStack");
            this.b(this.d = PanelsConfiguration.a((PanelDescriptor)a.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootSelectionPanel"), (PanelDescriptor)a.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootDetailPanel")));
            final PanelDescriptor panelDescriptor = (PanelDescriptor)a.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredMainDescriptor");
            if (panelDescriptor != null) {
                this.c(panelDescriptor, false);
            }
            return;
        }
        this.a = PanelsBackStack.e(new ArrayList());
    }
    
    private final void a(final PanelDescriptor panelDescriptor, final boolean b) {
        if (!b) {
            if (this.c != null) {
                final br e = this.b.e(2131431390);
                Fragment$SavedState c;
                if (e != null) {
                    c = this.b.c(e);
                }
                else {
                    c = null;
                }
                final PanelsBackStack a = this.a;
                final PanelDescriptor c2 = this.c;
                a.f(c2, c, (Object)null, c2.d());
            }
        }
        this.f.d();
        this.aK(panelDescriptor, 2131431390);
        this.aM(2131431390, this.f.h);
    }
    
    public final boolean J() {
        if (this.d == null) {
            return false;
        }
        if (!this.a.g()) {
            this.a(this.a.d().a, true);
            return true;
        }
        return !this.d() && this.f.j();
    }
    
    public final void aK(final PanelDescriptor c, final int n) {
        int n2 = n;
        if (n == 2131431390) {
            this.c = c;
            n2 = 2131431390;
        }
        c.c().ifPresent((Consumer)new hxn(this, n2, c, 0));
    }
    
    public final void aL() {
    }
    
    public final void aM(final int n, final int n2) {
        hxm.b(this.e, this.b.e(n), n2);
    }
    
    public final void b(final PanelsConfiguration d) {
        if (d == null) {
            return;
        }
        this.a.h();
        this.c = null;
        this.d = d;
        this.f.c();
    }
    
    public final void c(final PanelDescriptor panelDescriptor, final boolean b) {
        if (this.d == null) {
            return;
        }
        if (b) {
            this.a.h();
            this.c = null;
            this.d = PanelsConfiguration.a(this.d.a, panelDescriptor);
        }
        final PanelDescriptor c = this.c;
        this.a(panelDescriptor, c == null || c.equals(panelDescriptor));
    }
    
    public final boolean d() {
        return this.f.g();
    }
    
    public final boolean e() {
        return this.f.i() && !this.f.h();
    }
}
