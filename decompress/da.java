import android.view.ViewPropertyAnimator;
import android.view.View;
import android.support.v7.widget.RecyclerView;
import java.util.Collections;
import android.animation.Animator$AnimatorListener;
import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.List;
import android.graphics.SurfaceTexture;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class da implements Runnable
{
    final Object a;
    final Object b;
    private final int c;
    
    public da(final Surface b, final SurfaceTexture a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public da(final de b, final db a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public da(final gc a, final Runnable b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public da(final gki a, final gz b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public da(final List b, final dd a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public da(final lx a, final ArrayList b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public da(final ql b, final qi a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public da(final qp b, final me a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public da(final qp a, final qx b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public da(final sp a, final CharSequence b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public da(final ux b, final ut a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public da(final vp b, final CameraCaptureSession a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        int i = 0;
        switch (c) {
            default: {
                ((vp)this.b).a.onReady((CameraCaptureSession)this.a);
                return;
            }
            case 19: {
                ((vp)this.b).a.onConfigureFailed((CameraCaptureSession)this.a);
                return;
            }
            case 18: {
                ((vp)this.b).a.onActive((CameraCaptureSession)this.a);
                return;
            }
            case 17: {
                vj.b(((vp)this.b).a, (CameraCaptureSession)this.a);
                return;
            }
            case 16: {
                ((vp)this.b).a.onClosed((CameraCaptureSession)this.a);
                return;
            }
            case 15: {
                ((vp)this.b).a.onConfigured((CameraCaptureSession)this.a);
                return;
            }
            case 14: {
                final Object b = this.b;
                final Object a = this.a;
                final ux ux = (ux)b;
                final up b2 = ux.b;
                Object o = b2.b;
                synchronized (o) {
                    b2.c.remove(b);
                    b2.d.remove(b);
                    monitorexit(o);
                    ((ow)b).i((ut)a);
                    o = ux.h;
                    o.getClass();
                    ((ow)o).e((ut)a);
                }
            }
            case 13: {
                final Object b3 = this.b;
                final Object a2 = this.a;
                final ow h = ((ux)b3).h;
                h.getClass();
                h.i((ut)a2);
                return;
            }
            case 12: {
                final Object b4 = this.b;
                final Object a3 = this.a;
                ((Surface)b4).release();
                ((SurfaceTexture)a3).release();
                return;
            }
            case 11: {
                ((qp)this.b).d((me)this.a);
                return;
            }
            case 10: {
                ((qp)this.a).c((qx)this.b);
                return;
            }
            case 9: {
                ((sp)this.a).a.o().e((CharSequence)this.b);
                return;
            }
            case 8: {
                final RecyclerView m = ((ql)this.b).m;
                if (m != null && m.r) {
                    final qi qi = (qi)this.a;
                    if (!qi.n && qi.h.a() != -1) {
                        final nt e = ((ql)this.b).m.E;
                        Label_0664: {
                            if (e == null || !e.w((afhd)null)) {
                                for (ql ql = (ql)this.b; i < ql.l.size(); ++i) {
                                    if (!((qi)ql.l.get(i)).o) {
                                        break Label_0664;
                                    }
                                }
                                ((ql)this.b).j.p();
                                return;
                            }
                        }
                        ((ql)this.b).m.post((Runnable)this);
                    }
                }
                return;
            }
            case 7: {
                final Object b5 = this.b;
                for (int size = ((List)b5).size(), j = n; j < size; ++j) {
                    final on on = (on)((List)b5).get(j);
                    final Object a4 = this.a;
                    final View a5 = on.a;
                    final ViewPropertyAnimator animate = a5.animate();
                    final lx lx = (lx)a4;
                    lx.d.add(on);
                    animate.alpha(1.0f).setDuration(((nt)a4).h).setListener((Animator$AnimatorListener)new ls(lx, on, a5, animate)).start();
                }
                ((ArrayList)this.b).clear();
                ((lx)this.a).a.remove(this.b);
                return;
            }
            case 6: {
                final Object b6 = this.b;
                for (int size2 = ((List)b6).size(), k = n2; k < size2; ++k) {
                    final lw lw = (lw)((List)b6).get(k);
                    final Object a6 = this.a;
                    final on a7 = lw.a;
                    View a8;
                    if (a7 == null) {
                        a8 = null;
                    }
                    else {
                        a8 = a7.a;
                    }
                    final on b7 = lw.b;
                    View a9;
                    if (b7 != null) {
                        a9 = b7.a;
                    }
                    else {
                        a9 = null;
                    }
                    if (a8 != null) {
                        final ViewPropertyAnimator setDuration = a8.animate().setDuration(250L);
                        final lx lx2 = (lx)a6;
                        lx2.g.add(lw.a);
                        setDuration.translationX((float)(lw.e - lw.c));
                        setDuration.translationY((float)(lw.f - lw.d));
                        setDuration.alpha(0.0f).setListener((Animator$AnimatorListener)new lu(lx2, lw, setDuration, a8)).start();
                    }
                    if (a9 != null) {
                        final ViewPropertyAnimator animate2 = a9.animate();
                        final lx lx3 = (lx)a6;
                        lx3.g.add(lw.b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener((Animator$AnimatorListener)new lv(lx3, lw, animate2, a9)).start();
                    }
                }
                ((ArrayList)this.b).clear();
                ((lx)this.a).c.remove(this.b);
                return;
            }
            case 5: {
                final Object b8 = this.b;
                for (int size3 = ((List)b8).size(), l = n3; l < size3; ++l) {
                    final iyx iyx = (iyx)((List)b8).get(l);
                    final Object a10 = this.a;
                    final Object e2 = iyx.e;
                    final int b9 = iyx.b;
                    final int a11 = iyx.a;
                    final int c2 = iyx.c;
                    final int d = iyx.d;
                    final on on2 = (on)e2;
                    final View a12 = on2.a;
                    final int n4 = c2 - b9;
                    final int n5 = d - a11;
                    if (n4 != 0) {
                        a12.animate().translationX(0.0f);
                    }
                    if (n5 != 0) {
                        a12.animate().translationY(0.0f);
                    }
                    final ViewPropertyAnimator animate3 = a12.animate();
                    final lx lx4 = (lx)a10;
                    lx4.e.add(e2);
                    animate3.setDuration(((nt)a10).i).setListener((Animator$AnimatorListener)new lt(lx4, on2, n4, a12, n5, animate3)).start();
                }
                ((ArrayList)this.b).clear();
                ((lx)this.a).b.remove(this.b);
                return;
            }
            case 4: {
                final gki gki = (gki)this.a;
                final gq gq = (gq)gki.d;
                if (gq.f == gki.a) {
                    final Object c3 = gki.c;
                    final Object b10 = this.b;
                    gq.d = (List)c3;
                    gq.e = Collections.unmodifiableList((List<?>)c3);
                    ((gz)b10).a(gq.a);
                    gq.a();
                }
                return;
            }
            case 3: {
                final Object a13 = this.a;
                final Object b11 = this.b;
                try {
                    ((Runnable)b11).run();
                }
                finally {
                    ((gc)a13).a();
                }
            }
            case 2: {
                ((de)this.b).b.remove(this.a);
                ((de)this.b).c.remove(this.a);
                return;
            }
            case 1: {
                if (((List)this.b).contains(this.a)) {
                    ((List)this.b).remove(this.a);
                    de.e((dd)this.a);
                }
                return;
            }
            case 0: {
                if (((de)this.b).b.contains(this.a)) {
                    final dd dd = (dd)this.a;
                    di.d(dd.e, dd.a.O);
                }
            }
        }
    }
}
