import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adev extends adel
{
    private boolean a;
    private final arhr b;
    
    public adev(final arhr b) {
        this.a = false;
        this.b = b;
    }
    
    public final void d(final aoox aoox) {
        aoow aoow;
        if ((aoow = aoox.e) == null) {
            aoow = aoow.a;
        }
        final boolean b = aoow.b;
        boolean a = false;
        Label_0096: {
            if (b) {
                if (!aoow.c && !aoow.e && !aoow.f && !aoow.g && !aoow.p && !aoow.n && !aoow.o) {
                    a = a;
                    if (!aoow.r) {
                        break Label_0096;
                    }
                }
                a = true;
            }
        }
        if (!(this.a = a)) {
            return;
        }
        final pzp pzp = (pzp)this.b.a();
        if (aoow.f) {
            pzp.a.c();
        }
        if (aoow.c) {
            aoop aoop;
            if ((aoop = aoox.j) == null) {
                aoop = aoop.a;
            }
            if (aoop.b == 0) {
                pzp.a.b();
            }
        }
    }
    
    public final boolean e() {
        return this.a;
    }
    
    public final boolean f(final Context context, final agza agza) {
        return false;
    }
}
