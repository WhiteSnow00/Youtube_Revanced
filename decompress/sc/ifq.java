import com.google.android.apps.youtube.app.ui.WatchUpsellDialogController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifq implements aaiq
{
    final Object a;
    private final int b;
    
    public ifq(final aahu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ifq(final ifr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ifq(final inw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ifq(final jwy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        if (this.b != 6) {
            return;
        }
        final jwy jwy = (jwy)this.a;
        final WatchUpsellDialogController a = jwy.a;
        if (a.g) {
            jwy.b.j(a.h);
            ((jwy)this.a).a.h = null;
            return;
        }
        a.a.C();
    }
    
    public final void b() {
        switch (this.b) {
            default: {
                ((aahu)this.a).f();
                return;
            }
            case 6: {
                return;
            }
            case 5: {
                ((inw)this.a).f();
                return;
            }
            case 4: {
                ((inw)this.a).f();
                return;
            }
            case 3: {
                ((ifr)this.a).m.b();
                return;
            }
            case 2: {
                final aaiq k = ((ifr)this.a).k;
                if (k != null) {
                    k.b();
                }
                return;
            }
            case 1: {
                ((ifr)this.a).q.b();
                return;
            }
            case 0: {
                final aaiq l = ((ifr)this.a).l;
                if (l != null) {
                    l.b();
                }
            }
        }
    }
}
