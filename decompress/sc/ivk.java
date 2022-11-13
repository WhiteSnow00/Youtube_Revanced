import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.os.Handler;
import android.os.Build$VERSION;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.content.Context;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivk extends try
{
    public final Rect a;
    private final ivj b;
    private final int c;
    private final int d;
    private final Rect e;
    private boolean g;
    private boolean h;
    private float i;
    private float j;
    private final jej k;
    private final aauw l;
    private final jbj m;
    
    public ivk(final Context context, final ivi b, final ashi ashi, final jej k, final aauw l, final ajb ajb, final byte[] array, final byte[] array2) {
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.d = context.getResources().getDimensionPixelSize(2131169497);
        this.b = b;
        this.l = l;
        this.h = true;
        this.a = new Rect();
        this.e = new Rect();
        ashi.am((asjm)new ivz(this, 1));
        this.k = k;
        this.m = ajb.m(3);
    }
    
    private final void b(final View view, final boolean g) {
        if (this.g == g) {
            return;
        }
        this.g = g;
        if (view != null) {
            if (view.getParent() != null) {
                view.getParent().requestDisallowInterceptTouchEvent(this.g);
            }
        }
    }
    
    private final void e(final View view) {
        if (this.g) {
            final ivi ivi = (ivi)this.b;
            if (!ivi.C()) {
                final wyw g = ivi.g;
                final wyt wyt = new wyt(xaa.c(124587));
                final long l = ivi.l;
                final long d = ivi.a.d();
                Object o;
                if (!fbu.am(ivi.n)) {
                    o = aeyo.a;
                }
                else {
                    final ahaz builder = ((ahbh)alht.a).createBuilder();
                    final anza i = anza.i;
                    builder.copyOnWrite();
                    final alht alht = (alht)builder.instance;
                    alht.c = i.I;
                    alht.b |= 0x1;
                    final int d2 = (int)l;
                    builder.copyOnWrite();
                    final alht alht2 = (alht)builder.instance;
                    alht2.b |= 0x2;
                    alht2.d = d2;
                    final int e = (int)d;
                    builder.copyOnWrite();
                    final alht alht3 = (alht)builder.instance;
                    alht3.b |= 0x4;
                    alht3.e = e;
                    final alht j = (alht)builder.build();
                    final ahaz builder2 = ((ahbh)alhi.a).createBuilder();
                    builder2.copyOnWrite();
                    final alhi alhi = (alhi)builder2.instance;
                    j.getClass();
                    alhi.I = j;
                    alhi.c |= 0x4000000;
                    o = aezp.k((Object)builder2.build());
                }
                g.J(3, (wzz)wyt, (alhi)((aezp)o).f());
                ivi.i.a = anza.i;
                ivi.a.j();
                ivi.D();
            }
        }
        this.b(view, false);
        this.h = true;
    }
    
    public final void c() {
        this.b(null, false);
        this.h = true;
    }
    
    public final boolean d(final View view, final MotionEvent motionEvent) {
        final float abs = Math.abs(motionEvent.getX() - this.i);
        final float abs2 = Math.abs(motionEvent.getY() - this.j);
        Label_0857: {
            if (motionEvent.getPointerCount() <= 1) {
                if (!this.g) {
                    final float x = motionEvent.getX();
                    final float y = motionEvent.getY();
                    view.getGlobalVisibleRect(this.e);
                    final float n = x + this.e.left;
                    final float n2 = y + this.e.top;
                    final int bb = tpe.bb(view.getContext());
                    if (n <= this.a.left || n2 <= this.a.top || n >= this.e.width() - this.a.right || n2 >= bb - this.a.bottom) {
                        break Label_0857;
                    }
                }
                if (!this.k.c()) {
                    if (!this.l.b) {
                        final int action = motionEvent.getAction();
                        if (action != 0) {
                            if (action != 1) {
                                if (action != 2) {
                                    if (action == 3) {
                                        this.m.d();
                                        motionEvent.getX();
                                        this.e(view);
                                        this.b.f();
                                    }
                                }
                                else {
                                    if (!this.g && abs2 <= this.c && abs >= this.d && abs > abs2) {
                                        this.b(view, true);
                                    }
                                    if (motionEvent.getEventTime() - motionEvent.getDownTime() < 500L) {
                                        final float n3 = (float)this.c;
                                        if (abs2 > n3 || abs > n3) {
                                            this.b.c();
                                        }
                                    }
                                    else {
                                        if (this.m.b(motionEvent, 0L)) {
                                            motionEvent.getX();
                                            this.e(view);
                                            this.b.f();
                                            return true;
                                        }
                                        if (this.g) {
                                            if (this.h) {
                                                final ivj b = this.b;
                                                motionEvent.getX();
                                                final float x2 = motionEvent.getX();
                                                final float i = this.i;
                                                final ivi ivi = (ivi)b;
                                                if (!ivi.C()) {
                                                    ivi.a.g(ivi.h);
                                                    ivi.a();
                                                    final float n4 = (float)ivi.d.x;
                                                    ivi.B();
                                                    ivi.l = ivi.a.d();
                                                    ivi.a.l((int)(n4 + (x2 - i)));
                                                }
                                            }
                                            else {
                                                final ivj b2 = this.b;
                                                final float x3 = motionEvent.getX();
                                                final float j = this.i;
                                                final ivi ivi2 = (ivi)b2;
                                                if (ivi2.o.bl()) {
                                                    ivi2.a.g(ivi2.h);
                                                    final float n5 = ivi2.d.x + (x3 - j);
                                                    if (n5 >= ivi2.h.right || n5 <= 0.0f) {
                                                        ivi2.a();
                                                        this.i = motionEvent.getX();
                                                    }
                                                }
                                                final ivj b3 = this.b;
                                                motionEvent.getX();
                                                final float x4 = motionEvent.getX();
                                                final float k = this.i;
                                                final ivi ivi3 = (ivi)b3;
                                                if (!ivi3.C()) {
                                                    ivi3.a.k((int)(ivi3.d.x + (x4 - k)));
                                                }
                                            }
                                            this.h = false;
                                        }
                                        final float n6 = (float)this.c;
                                        if (abs2 > n6 || abs > n6) {
                                            final ivi ivi4 = (ivi)this.b;
                                            ivi4.b.removeCallbacks(ivi4.c);
                                        }
                                    }
                                }
                            }
                            else {
                                this.m.c(motionEvent);
                                motionEvent.getX();
                                this.e(view);
                                this.b.f();
                            }
                        }
                        else {
                            this.i = motionEvent.getX();
                            this.j = motionEvent.getY();
                            final ivi ivi5 = (ivi)this.b;
                            ivi5.k = false;
                            ivi5.m = false;
                            if (!ivi5.C()) {
                                ivi5.b.postDelayed(ivi5.c, 500L);
                                final e p2 = ivi5.p;
                                final Object b4 = p2.b;
                                if (b4 != null && ((Vibrator)b4).hasVibrator() && Build$VERSION.SDK_INT != 26) {
                                    ((Handler)p2.d).postDelayed((Runnable)p2.c, 500L);
                                }
                            }
                            this.m.a(motionEvent, false);
                        }
                        return this.g;
                    }
                }
            }
        }
        motionEvent.getX();
        this.e(view);
        this.b.c();
        return false;
    }
}
