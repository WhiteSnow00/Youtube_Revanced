import android.os.Handler;
import android.os.Looper;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGL10;
import com.google.cardboard.sdk.CardboardView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aara implements Runnable
{
    public final Object a;
    private final int b;
    
    public aara(final aapu a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final aaqi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final aark a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final aarv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final aasp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final aatc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final aatg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final aatm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final aaud a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final aawc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final aawm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final abqv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final adzx a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final View a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aara(final CardboardView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                ((aawm)this.a).k.f();
                return;
            }
            case 19: {
                ((aawm)this.a).k.e();
                return;
            }
            case 18: {
                final aawc aawc = (aawc)this.a;
                final abed i = aawc.i;
                if (i != null && aawc.g != null) {
                    i.a();
                    aawc.g.f();
                }
                return;
            }
            case 17: {
                final abcx g = ((aawc)this.a).g;
                if (g != null) {
                    g.e();
                }
                return;
            }
            case 16: {
                final aawc aawc2 = (aawc)this.a;
                final abed j = aawc2.i;
                if (j != null && aawc2.g != null) {
                    j.b();
                    aawc2.g.f();
                }
                return;
            }
            case 15: {
                final abcx g2 = ((aawc)this.a).g;
                if (g2 != null) {
                    g2.f();
                }
                return;
            }
            case 14: {
                final aaud aaud = (aaud)this.a;
                aaud.i.removeView((View)aaud.j);
                return;
            }
            case 13: {
                ((aaud)this.a).j.invalidate();
                return;
            }
            case 12: {
                final EGL10 egl10 = (EGL10)EGLContext.getEGL();
                if (((aatm)this.a).c != null && !egl10.eglGetCurrentContext().equals(EGL10.EGL_NO_CONTEXT)) {
                    try {
                        ((aatm)this.a).c.updateTexImage();
                        final Object a = this.a;
                        ((aatm)a).c.getTransformMatrix(((aatm)a).b);
                        final Object a2 = this.a;
                        ((aatm)a2).e = ((aatm)a2).c.getTimestamp() / 1000L;
                        return;
                    }
                    catch (final RuntimeException ex) {
                        tut.b(ex.getMessage());
                        return;
                    }
                }
                ((aatm)this.a).d = true;
                return;
            }
            case 11: {
                synchronized (((aatg)this.a).a) {
                    if (!((aatg)this.a).c) {
                        return;
                    }
                    Looper.prepare();
                    ((aatg)this.a).d = new Handler();
                    Looper.loop();
                }
            }
            case 10: {
                final aatc aatc = (aatc)this.a;
                aatc.i.removeView((View)aatc.k);
                return;
            }
            case 9: {
                ((View)this.a).callOnClick();
                return;
            }
            case 8: {
                ((aatr)((aapu)this.a).a).l = true;
                return;
            }
            case 7: {
                final aasp aasp = (aasp)this.a;
                if (aasp.g != null) {
                    if (aasp.p) {
                        aasp.d();
                    }
                    final aaut k = aasp.i;
                    if (k != null) {
                        k.i(aasp.p);
                    }
                    final aaux g3 = aasp.g;
                    final boolean p = aasp.p;
                    final aatx b = g3.b;
                    if (b.n != p) {
                        b.n = p;
                        if (b.h == vkr.d || b.h == vkr.a) {
                            b.g();
                        }
                        b.h();
                    }
                    g3.j = true;
                }
                final aasb d = aasp.d;
                if (d != null) {
                    d.j(aasp.p);
                }
                return;
            }
            case 6: {
                final bu g4 = ((aaya)((adzx)this.a).a).g;
                if (g4 != null) {
                    ((qu)g4).onBackPressed();
                }
                return;
            }
            case 5: {
                ((aasp)this.a).h();
                return;
            }
            case 4: {
                ((aarv)this.a).k();
                return;
            }
            case 3: {
                ((CardboardView)this.a).onSettingsButtonClick();
                return;
            }
            case 2: {
                final aark aark = (aark)this.a;
                aark.i.removeView((View)aark.k);
                return;
            }
            case 1: {
                ((aaqi)this.a).i.start();
                return;
            }
            case 0: {
                ((abqv)this.a).a();
            }
        }
    }
}
