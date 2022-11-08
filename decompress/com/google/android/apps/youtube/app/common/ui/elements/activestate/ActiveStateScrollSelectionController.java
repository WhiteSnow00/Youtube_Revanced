// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.elements.activestate;

import j$.util.Optional;
import com.google.android.apps.youtube.app.common.ui.scrollselection.DefaultScrollSelectionController;

public class ActiveStateScrollSelectionController extends DefaultScrollSelectionController
{
    public gje a;
    private final gjj d;
    private final iw e;
    
    public ActiveStateScrollSelectionController(final uyf uyf, final uyi uyi) {
        super(uyi, uyf);
        this.e = new gdm(this);
        final gjf a = gjj.a();
        a.a = "ActiveStateScrollVisibility";
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        a.b(alvl.aF / 100.0f);
        final gjh a2 = gji.a();
        alvl alvl2;
        if ((alvl2 = uyf.b().e) == null) {
            alvl2 = alvl.a;
        }
        a2.b(alvl2.aE / 100.0f);
        a.b = Optional.of((Object)a2.a());
        this.d = a.a();
    }
    
    protected final gjj j(final gje gje) {
        return this.d;
    }
    
    public final void k(final gje gje) {
        if (this.a != gje) {
            this.l(gje);
        }
    }
    
    public final void l(final gje a) {
        final gje a2 = this.a;
        if (a == a2) {
            return;
        }
        if (a2 != null && a2.l() != null) {
            a2.l().aH(this.e);
        }
        if (a != null && a.l() != null) {
            a.l().aE(this.e);
        }
        super.l(this.a = a);
    }
}
