import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.List;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import android.content.Context;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwj
{
    public PlayerResponseModel a;
    public final skt b;
    private final TextView c;
    private final fos d;
    private final iwn e;
    private boolean f;
    private int g;
    private ControlsState h;
    private boolean i;
    private boolean j;
    private boolean k;
    
    public iwj(final Context context, final fos d, final iwn e, final ProgressBar progressBar, final TextView c) {
        this.f = false;
        this.h = ControlsState.b();
        this.c = c;
        this.d = d;
        this.e = e;
        this.b = new skt(progressBar);
        final Resources resources = context.getResources();
        final pee indeterminateDrawable = new pee(-1.0f, resources.getDimensionPixelSize(2131166935), resources.getDimensionPixelSize(2131165555), new int[] { resources.getColor(2131099753) });
        indeterminateDrawable.setAlpha(resources.getInteger(2131492881));
        progressBar.setIndeterminateDrawable((Drawable)indeterminateDrawable);
        this.g = 0;
    }
    
    private final void g(final int n, final int n2) {
        if ((n & 0x4) != 0x0) {
            final skt b = this.b;
            if (!b.a) {
                b.a = true;
                ((ProgressBar)b.b).setVisibility(0);
            }
        }
        if ((n2 & 0x4) != 0x0) {
            final skt b2 = this.b;
            b2.a = false;
            ((ProgressBar)b2.b).setVisibility(8);
        }
        if ((n & 0x1) != 0x0) {
            this.d.pt(true);
        }
        if ((n2 & 0x1) != 0x0) {
            this.d.b(false);
        }
        if ((n & 0x2) != 0x0) {
            this.e.f(false);
        }
        if ((n2 & 0x2) != 0x0) {
            this.e.a(false);
        }
    }
    
    private final void h() {
        final boolean i = this.i;
        final int n = 3;
        if (i) {
            final ControlsState h = this.h;
            final abbx a = h.a;
            final boolean b = a == abbx.b && !h.b;
            final boolean b2 = a == abbx.c || a == abbx.f;
            final int g = this.g;
            if (g == 2) {
                this.g(4, 1);
                return;
            }
            Label_0116: {
                int n2;
                if (g == 3) {
                    if (b) {
                        break Label_0116;
                    }
                    n2 = n;
                }
                else {
                    n2 = g;
                }
                if (!b2) {
                    if (n2 == 0) {
                        this.g(0, 7);
                    }
                    return;
                }
            }
            this.g(0, 5);
        }
        else {
            final int g2 = this.g;
            if (g2 != 0) {
                if (g2 != 2) {
                    if (g2 == 3) {
                        final ControlsState h2 = this.h;
                        final abbx a2 = h2.a;
                        final abbx c = abbx.c;
                        final boolean b3 = a2 == abbx.b;
                        final boolean b4 = b3 && h2.b;
                        final boolean b5 = b3 && !h2.b;
                        if (this.f) {
                            if (b4) {
                                this.g(4, 0);
                                return;
                            }
                            if (b5) {
                                this.g((this.j ? 1 : 0) | 0x2, 4);
                                return;
                            }
                            if (a2 == c) {
                                this.g(2, 5);
                            }
                        }
                        else if (this.k) {
                            if (b4) {
                                this.g(4, 3);
                                return;
                            }
                            this.g(0, 7);
                        }
                        else {
                            if (b4) {
                                this.g(6, 0);
                                return;
                            }
                            if (b5) {
                                this.g((this.j ? 1 : 0) | 0x2, 4);
                                return;
                            }
                            if (a2 == c) {
                                this.g(2, 1);
                            }
                        }
                    }
                }
                else {
                    final ControlsState h3 = this.h;
                    if (!this.f) {
                        this.g(6, 0);
                        return;
                    }
                    final abbx a3 = abbx.a;
                    final int ordinal = h3.a.ordinal();
                    if (ordinal == 0) {
                        this.g(2, 0);
                        return;
                    }
                    if (ordinal == 1 || ordinal == 2) {
                        if (h3.b) {
                            this.g(4, 0);
                        }
                    }
                }
                return;
            }
            this.g(0, 7);
        }
    }
    
    public final void a() {
        this.b();
        this.g = 0;
        this.h = ControlsState.b();
        this.h();
    }
    
    public final void b() {
        this.d.f();
    }
    
    public final void c(final iwh iwh) {
        this.g = iwh.a;
        this.k = iwh.f;
        final aezp b = aezp.j((Object)iwh.c).b((aezf)iny.l).b((aezf)iny.o);
        boolean j = false;
        final Boolean value = false;
        final boolean booleanValue = (boolean)b.e((Object)value);
        final PlayerResponseModel a = this.a;
        boolean b2 = false;
        Label_0115: {
            if (a != null) {
                akfs akfs;
                if ((akfs = a.m().c.K) == null) {
                    akfs = akfs.a;
                }
                if (akfs.c) {
                    b2 = true;
                    break Label_0115;
                }
            }
            b2 = false;
        }
        if (booleanValue || b2) {
            j = true;
        }
        this.j = j;
        this.h = iwh.b;
        this.f = (boolean)iwh.d().b((aezf)iny.p).e((Object)value);
        this.h();
    }
    
    public final void d(final ajut ajut, final List list) {
        final aotf x = ezt.x(list);
        int n = 0;
        int n2 = 0;
        Label_0140: {
            int al;
            if (x != null) {
                Label_0052: {
                    if ((x.b & 0x8) != 0x0) {
                        final int am = aqsx.aM(x.f);
                        if (am != 0) {
                            if (am != 1) {
                                break Label_0052;
                            }
                        }
                        this.i = true;
                        return;
                    }
                }
                ezt.A(this.c, x);
                if ((al = aqsx.aL(x.e)) == 0) {
                    al = 1;
                }
                final int am2 = aqsx.aM(x.f);
                n = al;
                if ((n2 = am2) != 0) {
                    break Label_0140;
                }
            }
            else if (!ezt.z(this.c, (CharSequence)acak.b(ajut), acak.i(ajut), list, (apfs)null)) {
                al = 2;
            }
            else {
                al = 3;
            }
            n2 = 1;
            n = al;
        }
        this.i = false;
        final abbx a = abbx.a;
        final int n3 = n - 1;
        if (n3 == 2 || n3 == 3) {
            this.e.h(this.c.getText());
            return;
        }
        if (n2 == 5) {
            this.e.h(this.c.getText());
            return;
        }
        final iwn e = this.e;
        e.a = false;
        e.d(true);
    }
    
    public final void e(final ControlsOverlayStyle controlsOverlayStyle) {
        this.d.j(controlsOverlayStyle);
    }
    
    public final void f(final long n, final long n2, final long n3, final long n4) {
        this.d.k(n, n2, n3, n4);
    }
}
