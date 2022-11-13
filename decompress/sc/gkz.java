import android.os.Build$VERSION;
import app.revanced.integrations.utils.ThemeHelper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkz implements gkx
{
    private final Context a;
    private final tmx b;
    
    public gkz(final Context a, final tmx b) {
        this.a = a;
        this.b = b;
    }
    
    public static void g(final Throwable t) {
        ttr.d("Failed to update theme data to store.", t);
    }
    
    public static void h(final Throwable t) {
        ttr.d("Failed to update theme data to store.", t);
    }
    
    public static void i(final Throwable t) {
        ttr.d("Failed to update theme data to store.", t);
    }
    
    public static void j(final Throwable t) {
        ttr.d("Failed to update theme data to store.", t);
    }
    
    @Override
    public final gkv a() {
        if (this.f()) {
            String s;
            if ((((gkw)this.b.c()).b & 0x8) != 0x0) {
                s = ((gkw)this.b.c()).f;
            }
            else {
                if (this.b() == gkv.b) {
                    s = this.a.getString(2132017497);
                }
                else {
                    s = this.a.getString(2132017503);
                }
                teu.m(this.b.b((aezf)new ggp(s, 3)), (tes)etj.q);
            }
            gkv theme;
            if (adkp.ae(s, this.a.getString(2132017501))) {
                theme = gkv.a;
            }
            else if (adkp.ae(s, this.a.getString(2132017497))) {
                theme = gkv.b;
            }
            else {
                theme = this.c();
                ThemeHelper.setTheme((Object)theme);
            }
            return theme;
        }
        final gkv b = this.b();
        ThemeHelper.setTheme((Object)b);
        return b;
    }
    
    @Override
    public final gkv b() {
        gkv gkv;
        if (((gkw)this.b.c()).e) {
            gkv = gkv.b;
        }
        else {
            gkv = gkv.a;
        }
        return gkv;
    }
    
    @Override
    public final gkv c() {
        gkv gkv;
        if ((this.a.getResources().getConfiguration().uiMode & 0x30) == 0x20) {
            gkv = gkv.b;
        }
        else {
            gkv = gkv.a;
        }
        return gkv;
    }
    
    @Override
    public final void d(final gkv gkv) {
        gkv.getClass();
        if (gkv == this.a()) {
            return;
        }
        if (this.f()) {
            String s;
            if (gkv == gkv.b) {
                s = this.a.getString(2132017497);
            }
            else {
                s = this.a.getString(2132017501);
            }
            teu.m(this.b.b((aezf)new ggp(s, 4)), (tes)etj.r);
            return;
        }
        teu.m(this.b.b((aezf)new ggp(gkv, 5)), (tes)etj.s);
    }
    
    @Override
    public final void e() {
        if (this.f()) {
            teu.m(this.b.b((aezf)new ggp(this.a.getString(2132017503), 2)), (tes)etj.p);
        }
    }
    
    @Override
    public final boolean f() {
        return Build$VERSION.SDK_INT > 28;
    }
}
