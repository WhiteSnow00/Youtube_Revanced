import android.media.AudioManager$OnAudioFocusChangeListener;
import android.os.Handler;
import android.os.Looper;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGL10;
import com.google.cardboard.sdk.CardboardView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaog implements Runnable
{
    public final Object a;
    private final int b;
    
    public aaog(final aakg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final aaon a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final aapl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final aapw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final aaqz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final aarm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final aarq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final aarw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final aast a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final aaus a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final aave a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final abpq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final afhd a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final View a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final aujg a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public aaog(final CardboardView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                ((abde)((aave)this.a).k).e();
                return;
            }
            case 19: {
                final aaus aaus = (aaus)this.a;
                final abcx i = aaus.i;
                if (i != null && aaus.g != null) {
                    i.a();
                    aaus.g.f();
                }
                return;
            }
            case 18: {
                final abbr g = ((aaus)this.a).g;
                if (g != null) {
                    g.e();
                }
                return;
            }
            case 17: {
                final aaus aaus2 = (aaus)this.a;
                final abcx j = aaus2.i;
                if (j != null && aaus2.g != null) {
                    j.b();
                    aaus2.g.f();
                }
                return;
            }
            case 16: {
                final abbr g2 = ((aaus)this.a).g;
                if (g2 != null) {
                    g2.f();
                }
                return;
            }
            case 15: {
                final aast aast = (aast)this.a;
                aast.i.removeView((View)aast.j);
                return;
            }
            case 14: {
                ((aast)this.a).j.invalidate();
                return;
            }
            case 13: {
                final EGL10 egl10 = (EGL10)EGLContext.getEGL();
                if (((aarw)this.a).c != null && !egl10.eglGetCurrentContext().equals(EGL10.EGL_NO_CONTEXT)) {
                    try {
                        ((aarw)this.a).c.updateTexImage();
                        final Object a = this.a;
                        ((aarw)a).c.getTransformMatrix(((aarw)a).b);
                        final Object a2 = this.a;
                        ((aarw)a2).e = ((aarw)a2).c.getTimestamp() / 1000L;
                        return;
                    }
                    catch (final RuntimeException ex) {
                        ttr.b(ex.getMessage());
                        return;
                    }
                }
                ((aarw)this.a).d = true;
                return;
            }
            case 12: {
                synchronized (((aarq)this.a).a) {
                    if (!((aarq)this.a).c) {
                        return;
                    }
                    Looper.prepare();
                    ((aarq)this.a).d = new Handler();
                    Looper.loop();
                }
            }
            case 11: {
                final aarm aarm = (aarm)this.a;
                aarm.i.removeView((View)aarm.k);
                return;
            }
            case 10: {
                ((View)this.a).callOnClick();
                return;
            }
            case 9: {
                ((aasb)((aujg)this.a).a).l = true;
                return;
            }
            case 8: {
                final bu g3 = ((aawr)((afhd)this.a).a).g;
                if (g3 != null) {
                    ((qt)g3).onBackPressed();
                }
                return;
            }
            case 7: {
                ((aaqz)this.a).i();
                return;
            }
            case 6: {
                final aaqz aaqz = (aaqz)this.a;
                if (aaqz.i != null) {
                    if (aaqz.r) {
                        aaqz.d();
                    }
                    final aatj k = aaqz.k;
                    if (k != null) {
                        k.i(aaqz.r);
                    }
                    final aatn l = aaqz.i;
                    final boolean r = aaqz.r;
                    final aasm b = l.b;
                    if (b.n != r) {
                        b.n = r;
                        if (b.h == vjj.d || b.h == vjj.a) {
                            b.g();
                        }
                        b.h();
                    }
                    l.j = true;
                }
                final aaqc f = aaqz.f;
                if (f != null) {
                    f.j(aaqz.r);
                }
                return;
            }
            case 5: {
                ((aapw)this.a).k();
                return;
            }
            case 4: {
                ((CardboardView)this.a).onSettingsButtonClick();
                return;
            }
            case 3: {
                final aapl aapl = (aapl)this.a;
                aapl.i.removeView((View)aapl.k);
                return;
            }
            case 2: {
                ((abpq)this.a).a();
                return;
            }
            case 1: {
                final aakg aakg = (aakg)this.a;
                if (aakg.b.k) {
                    return;
                }
                abjf.a(abje.b, "AudioFocus Requested", new Object[0]);
                if (aakg.d.requestAudioFocus((AudioManager$OnAudioFocusChangeListener)aakg.e, 3, 1) == 1) {
                    abjf.a(abje.b, "AudioFocus Granted", new Object[0]);
                    final aake e = aakg.e;
                    final int e2 = aake.e;
                    e.c.j = 1;
                    e.a = false;
                    return;
                }
                abjf.a(abje.b, "AudioFocus DENIED", new Object[0]);
                return;
            }
            case 0: {
                ((aaon)this.a).i.start();
            }
        }
    }
}
