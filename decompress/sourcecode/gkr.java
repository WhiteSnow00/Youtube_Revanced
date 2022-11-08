import android.os.Build$VERSION;
import app.revanced.integrations.utils.ThemeHelper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkr implements gko
{
    private final Context a;
    private final tku b;
    
    public gkr(final Context a, final tku b) {
        this.a = a;
        this.b = b;
    }
    
    public final gkm a() {
        if (this.f()) {
            String s;
            if ((((gkn)this.b.c()).b & 0x8) != 0x0) {
                s = ((gkn)this.b.c()).f;
            }
            else {
                if (this.b() == gkm.b) {
                    s = this.a.getString(2132017497);
                }
                else {
                    s = this.a.getString(2132017503);
                }
                tcp.m(this.b.b((aexg)new gkq(s, 2)), (tcn)etg.q);
            }
            gkm theme;
            if (aeda.v((Object)s, (Object)this.a.getString(2132017501))) {
                theme = gkm.a;
            }
            else if (aeda.v((Object)s, (Object)this.a.getString(2132017497))) {
                theme = gkm.b;
            }
            else {
                theme = this.c();
                ThemeHelper.setTheme((Object)theme);
            }
            return theme;
        }
        final gkm b = this.b();
        ThemeHelper.setTheme((Object)b);
        return b;
    }
    
    public final gkm b() {
        gkm gkm;
        if (((gkn)this.b.c()).e) {
            gkm = gkm.b;
        }
        else {
            gkm = gkm.a;
        }
        return gkm;
    }
    
    public final gkm c() {
        gkm gkm;
        if ((this.a.getResources().getConfiguration().uiMode & 0x30) == 0x20) {
            gkm = gkm.b;
        }
        else {
            gkm = gkm.a;
        }
        return gkm;
    }
    
    public final void d(final gkm gkm) {
        gkm.getClass();
        if (gkm == this.a()) {
            return;
        }
        if (this.f()) {
            String s;
            if (gkm == gkm.b) {
                s = this.a.getString(2132017497);
            }
            else {
                s = this.a.getString(2132017501);
            }
            tcp.m(this.b.b((aexg)new gkq(s, 3)), (tcn)etg.r);
            return;
        }
        tcp.m(this.b.b((aexg)new gkq(gkm, 4)), (tcn)etg.s);
    }
    
    public final void e() {
        if (this.f()) {
            tcp.m(this.b.b((aexg)new gkq(this.a.getString(2132017503), 0)), (tcn)etg.p);
        }
    }
    
    public final boolean f() {
        return Build$VERSION.SDK_INT > 28;
    }
}
