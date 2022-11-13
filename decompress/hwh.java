import java.util.Map;
import com.google.android.apps.youtube.app.offline.OfflineModeChangedMealbarController;

// 
// Decompiled by Procyon v0.6.0
// 

final class hwh implements gab
{
    final hwl a;
    private final int b;
    
    public hwh(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hwh(final hwt a, final int b) {
        this.b = b;
        this.a = (hwl)a;
    }
    
    @Override
    public final void e(final int al) {
        if (this.b != 0) {
            return;
        }
        if (al == 1) {
            this.a.aZ.b(false);
        }
        else if (al == 2) {
            this.a.aZ.b(false);
        }
        else if (al == 0) {
            this.a.bJ();
            this.a.aZ.b(true);
        }
        this.a.al = al;
    }
    
    @Override
    public final boolean f(int b) {
        b = this.b;
        if (b == 0) {
            this.a.aP(false);
            return true;
        }
        if (b != 1) {
            return true;
        }
        this.a.bL();
        return false;
    }
    
    @Override
    public final void pR(int b, final boolean b2) {
        b = this.b;
        if (b != 0) {
            if (b != 1) {
                final aorj h = ((hwt)this.a).ae.h();
                if (!b2 && h != null) {
                    final hwl a = this.a;
                    if (a.bZ) {
                        ((hwt)a).cX = h.c;
                    }
                }
                final OfflineModeChangedMealbarController offlineModeChangedMealbarController = (OfflineModeChangedMealbarController)((hwt)this.a).cW.a();
                if (h != null && "FElibrary".equals(h.c)) {
                    offlineModeChangedMealbarController.k();
                }
            }
            return;
        }
        final aorj h2 = this.a.ae.h();
        if (!b2) {
            this.a.cC.f();
        }
        final hwl a2 = this.a;
        if (a2.al == 0) {
            a2.bJ();
        }
        this.a.aZ.c(h2);
        this.a.bd.a();
        ajrk ajrk;
        if ((ajrk = this.a.cs.f().A) == null) {
            ajrk = ajrk.a;
        }
        final ahaz builder = ((ahbh)ajrl.a).createBuilder();
        builder.copyOnWrite();
        ajrl.a((ajrl)builder.instance);
        final ajrl ajrl = (ajrl)builder.build();
        final ahcr b3 = ajrk.b;
        final Long value = 45371839L;
        ajrl ajrl2 = ajrl;
        if (((Map)b3).containsKey(value)) {
            ajrl2 = (ajrl)((Map)b3).get(value);
        }
        if (ajrl2.b == 1 && (boolean)ajrl2.c) {
            final kau r = this.a.r();
            if (r != null) {
                ((fzf)this.a.aq.a()).n(((acqv)r).N);
            }
        }
    }
    
    @Override
    public final void sr(final float n) {
        if (this.b != 0) {
            return;
        }
        if (n != 0.0f && n != 1.0f) {
            this.a.aP(true);
        }
    }
}
