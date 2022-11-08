import android.content.res.Configuration;
import android.provider.Settings$Secure;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghb implements fxm, tnt
{
    public gha a;
    public final ggz b;
    private final acoh c;
    private int d;
    private int e;
    
    public ghb(final Activity activity, final acoh c) {
        final ggz b = new ggz(activity);
        this.e = 0;
        this.b = b;
        this.c = c;
        this.j(activity.getResources().getConfiguration());
    }
    
    public final int a() {
        return this.b.a();
    }
    
    public final void d(int n) {
        final ggz b = this.b;
        final boolean b2 = b.b;
        final int n2 = 0;
        int d = n;
        Label_0103: {
            if (b2) {
                d = n;
                if (b.e()) {
                    d = n;
                    if (Settings$Secure.getInt(b.a.getContentResolver(), "show_rotation_suggestions", 1) == 1) {
                        while (true) {
                            int n3 = 0;
                            Label_0078: {
                                if ((n3 = n) != 2) {
                                    break Label_0078;
                                }
                                if (this.e != 1) {
                                    n3 = 2;
                                    break Label_0078;
                                }
                                d = 0;
                                break Label_0103;
                            }
                            if ((d = n3) == 4) {
                                d = n3;
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
            d = 0;
        }
        Label_0280: {
            if (d != 2) {
                if (d != 3) {
                    if (d != 4) {
                        if (d != 5) {
                            this.b.d(-1);
                            break Label_0280;
                        }
                    }
                    else if (!this.b.e()) {
                        final ggz b3 = this.b;
                        n = b3.c;
                        if (gej.e(n) && n == b3.a()) {
                            this.b.d(-1);
                            d = n2;
                            break Label_0280;
                        }
                    }
                    this.b.d(6);
                    break Label_0280;
                }
            }
            else if (!this.b.e()) {
                final ggz b4 = this.b;
                n = b4.c;
                if (gej.f(n) && n == b4.a()) {
                    this.b.d(-1);
                    d = n2;
                    break Label_0280;
                }
            }
            this.e = 1;
            this.b.d(7);
        }
        this.d = d;
    }
    
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
        final ggz b2 = this.b;
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
                    final gha a = this.a;
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
                final gha a2 = this.a;
                if (a2 != null) {
                    a2.g(2);
                }
            }
        }
    }
}
