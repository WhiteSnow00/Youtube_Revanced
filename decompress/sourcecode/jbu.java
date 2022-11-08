import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbu implements jby, itw, uut
{
    public final abns a;
    public final itx b;
    public final asib c;
    public asgu d;
    public asgt e;
    private final utk f;
    private final aols g;
    private final aolr h;
    private final tku i;
    private boolean j;
    
    public jbu(final abns a, final itx b, final utk f, final tku i, final aols g) {
        this.a = a;
        this.g = g;
        aolu aolu;
        if ((aolu = g.g) == null) {
            aolu = aolu.a;
        }
        this.h = (aolr)((agzd)aolu).rr((agyr)aolr.b);
        this.b = b;
        this.f = f;
        this.c = new asib();
        this.i = i;
    }
    
    public final asgt a() {
        if (this.e == null) {
            this.e = asgt.m((asgv)new iwo(this, 3), asgm.c);
        }
        return this.e;
    }
    
    public final void b() {
        this.b.a(this);
        this.f.E().i((uut)this);
    }
    
    public final void c() {
        final asgu d = this.d;
        if (d == null) {
            return;
        }
        final boolean j = this.j;
        boolean b2;
        final boolean b = b2 = false;
        Label_0191: {
            if (j) {
                if (((fqo)this.i.c()).j >= 2) {
                    b2 = b;
                }
                else {
                    final String h = this.f.h();
                    if (h != null) {
                        final Iterator<Object> iterator = this.h.c.iterator();
                        while (iterator.hasNext()) {
                            if (h.equals(iterator.next())) {
                                b2 = b;
                                break Label_0191;
                            }
                        }
                        for (final ajng ajng : this.h.d) {
                            String d2;
                            if ((ajng.b & 0x2) != 0x0) {
                                d2 = ajng.d;
                            }
                            else {
                                d2 = null;
                            }
                            if (h.equals(d2)) {
                                b2 = b;
                                break Label_0191;
                            }
                        }
                    }
                    b2 = true;
                }
            }
        }
        d.c((Object)jbr.b(b2, this.g));
    }
    
    public final void oX(final boolean b) {
        if (this.j) {
            this.j = false;
            this.c();
        }
    }
    
    public final void pw(final utd utd) {
        this.c();
    }
    
    public final void y(final boolean b) {
        if (!this.j) {
            this.j = true;
            this.c();
        }
    }
}
