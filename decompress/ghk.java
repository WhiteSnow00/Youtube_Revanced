import android.content.res.Configuration;
import android.provider.Settings$Secure;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghk implements fxu, tpy
{
    public ghj a;
    public final ghi b;
    private final acql c;
    private int d;
    private int e;
    
    public ghk(final Activity activity, final acql c) {
        final ghi b = new ghi(activity);
        this.e = 0;
        this.b = b;
        this.c = c;
        this.j(activity.getResources().getConfiguration());
    }
    
    public final int a() {
        return this.b.a();
    }
    
    public final void d(int d) {
        final ghi b = this.b;
        final boolean b2 = b.b;
        final int n = 0;
        int n2 = d;
        Label_0098: {
            if (b2) {
                n2 = d;
                if (b.e()) {
                    n2 = d;
                    if (Settings$Secure.getInt(b.a.getContentResolver(), "show_rotation_suggestions", 1) == 1) {
                        while (true) {
                            int n3 = 0;
                            Label_0078: {
                                if ((n3 = d) != 2) {
                                    break Label_0078;
                                }
                                if (this.e != 1) {
                                    n3 = 2;
                                    break Label_0078;
                                }
                                n2 = 0;
                                break Label_0098;
                            }
                            if ((n2 = n3) == 4) {
                                n2 = n3;
                                if (this.e == 2) {
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }
        if (this.c.isInMultiWindowMode()) {
            n2 = 0;
        }
        Label_0276: {
            Label_0274: {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                this.b.d(-1);
                                break Label_0274;
                            }
                        }
                        else if (!this.b.e()) {
                            final ghi b3 = this.b;
                            d = b3.c;
                            if (ger.e(d) && d == b3.a()) {
                                this.b.d(-1);
                                d = n;
                                break Label_0276;
                            }
                        }
                        this.b.d(6);
                        break Label_0274;
                    }
                }
                else if (!this.b.e()) {
                    final ghi b4 = this.b;
                    d = b4.c;
                    if (ger.f(d) && d == b4.a()) {
                        this.b.d(-1);
                        d = n;
                        break Label_0276;
                    }
                }
                this.e = 1;
                this.b.d(7);
            }
            d = n2;
        }
        this.d = d;
    }
    
    @Override
    public final void j(final Configuration configuration) {
        if (this.b.a.getRequestedOrientation() == -1) {
            this.e = configuration.orientation;
        }
    }
    
    public final void mW(final boolean b, final int n) {
        this.b.mx(b, n);
        this.mx(b, n);
    }
    
    public final void mx(final boolean b, int n) {
        final ghi b2 = this.b;
        final int c = b2.c;
        b2.mx(b, n);
        if (this.b.e()) {
            return;
        }
        n = this.b.c;
        if (c == 2) {
            if (n == 1) {
                n = this.d;
                if (n == 4) {
                    this.d(0);
                    return;
                }
                if (n == 5) {
                    final ghj a = this.a;
                    if (a != null) {
                        a.g(1);
                    }
                }
            }
        }
        else if (c == 1 && n == 2) {
            n = this.d;
            if (n == 2) {
                this.d(0);
                return;
            }
            if (n == 3) {
                final ghj a2 = this.a;
                if (a2 != null) {
                    a2.g(2);
                }
            }
        }
    }
}
