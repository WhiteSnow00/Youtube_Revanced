import com.google.vr.sdk.base.HeadsetSelector$HeadsetInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaww implements aawv
{
    private static final String d = "aaww";
    public final aawx a;
    public aawr b;
    public bu c;
    private final aawt e;
    private final tmx f;
    private boolean g;
    
    public aaww(final tmx f) {
        this.e = new aawt();
        this.a = new aawx();
        this.f = f;
    }
    
    public final boolean a() {
        final bu c = this.c;
        if (c == null) {
            return false;
        }
        final HeadsetSelector$HeadsetInfo a = aaws.a((Context)c, this.f);
        ttr.h(aaww.d, "Current viewer: ".concat(String.valueOf(a.getDisplayName())));
        final int e = aaws.e(a);
        if (e == 0) {
            return false;
        }
        final int n = e - 1;
        if (n != 1 && n != 2) {
            this.g = true;
            final aawr b = this.b;
            if (b != null) {
                b.f();
            }
        }
        else {
            this.g = true;
            final aawr b2 = this.b;
            if (b2 != null) {
                b2.j(e);
            }
        }
        return true;
    }
    
    public final boolean b() {
        tbi.f();
        final bu c = this.c;
        if (c == null) {
            return false;
        }
        if (this.g) {
            return this.g = false;
        }
        if (aaws.b((Context)c, this.f).size() < 2) {
            ttr.h(aaww.d, "Less than 2 viewers available. Skipping showing the speed bump.");
            return this.a();
        }
        final aawt e = this.e;
        final bu c2 = this.c;
        if (!e.ar() && !e.aw()) {
            e.ag = (aawv)this;
            e.rJ(c2.getSupportFragmentManager(), aawt.ae);
        }
        return true;
    }
}
