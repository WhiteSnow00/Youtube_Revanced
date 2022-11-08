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

public final class iul extends tpt
{
    public final Rect a;
    private final iuk b;
    private final int c;
    private final int d;
    private final Rect e;
    private boolean g;
    private boolean h;
    private float i;
    private float j;
    private final jdj k;
    private final aatb l;
    private final jak m;
    
    public iul(final Context context, final iuj b, final asgt asgt, final jdj k, final aatb l, final aja aja, final byte[] array, final byte[] array2) {
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.d = context.getResources().getDimensionPixelSize(2131169498);
        this.b = (iuk)b;
        this.l = l;
        this.h = true;
        this.a = new Rect();
        this.e = new Rect();
        asgt.al((asix)new iva(this, 1));
        this.k = k;
        this.m = aja.m(3);
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
            final iuj iuj = (iuj)this.b;
            if (!iuj.C()) {
                final wwv g = iuj.g;
                final wws wws = new wws(wya.c(124587));
                final long l = iuj.l;
                final long d = iuj.a.d();
                Object o;
                if (!gkt.K(iuj.n)) {
                    o = aewp.a;
                }
                else {
                    final agza builder = ((agzi)alfq.a).createBuilder();
                    final anwx i = anwx.i;
                    builder.copyOnWrite();
                    final alfq alfq = (alfq)builder.instance;
                    alfq.c = i.H;
                    alfq.b |= 0x1;
                    builder.copyOnWrite();
                    final alfq alfq2 = (alfq)builder.instance;
                    alfq2.b |= 0x2;
                    alfq2.d = (int)l;
                    builder.copyOnWrite();
                    final alfq alfq3 = (alfq)builder.instance;
                    alfq3.b |= 0x4;
                    alfq3.e = (int)d;
                    final alfq j = (alfq)builder.build();
                    final agza builder2 = ((agzi)alff.a).createBuilder();
                    builder2.copyOnWrite();
                    final alff alff = (alff)builder2.instance;
                    j.getClass();
                    alff.I = j;
                    alff.c |= 0x4000000;
                    o = aexq.k(builder2.build());
                }
                g.J(3, (wxz)wws, (alff)((aexq)o).f());
                iuj.i.a = anwx.i;
                iuj.a.j();
                iuj.D();
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
                    final int bb = tmy.bb(view.getContext());
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
                                                final iuk b = this.b;
                                                motionEvent.getX();
                                                final float x2 = motionEvent.getX();
                                                final float i = this.i;
                                                final iuj iuj = (iuj)b;
                                                if (!iuj.C()) {
                                                    iuj.a.g(iuj.h);
                                                    iuj.a();
                                                    final int x3 = iuj.d.x;
                                                    iuj.B();
                                                    iuj.l = iuj.a.d();
                                                    iuj.a.l((int)(x3 + (x2 - i)));
                                                }
                                            }
                                            else {
                                                final iuk b2 = this.b;
                                                final float x4 = motionEvent.getX();
                                                final float j = this.i;
                                                final iuj iuj2 = (iuj)b2;
                                                if (iuj2.o.bl()) {
                                                    iuj2.a.g(iuj2.h);
                                                    final float n4 = iuj2.d.x + (x4 - j);
                                                    if (n4 >= iuj2.h.right || n4 <= 0.0f) {
                                                        iuj2.a();
                                                        this.i = motionEvent.getX();
                                                    }
                                                }
                                                final iuk b3 = this.b;
                                                motionEvent.getX();
                                                final float x5 = motionEvent.getX();
                                                final float k = this.i;
                                                final iuj iuj3 = (iuj)b3;
                                                if (!iuj3.C()) {
                                                    iuj3.a.k((int)(iuj3.d.x + (x5 - k)));
                                                }
                                            }
                                            this.h = false;
                                        }
                                        final float n5 = (float)this.c;
                                        if (abs2 > n5 || abs > n5) {
                                            final iuj iuj4 = (iuj)this.b;
                                            iuj4.b.removeCallbacks(iuj4.c);
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
                            final iuj iuj5 = (iuj)this.b;
                            iuj5.k = false;
                            iuj5.m = false;
                            if (!iuj5.C()) {
                                iuj5.b.postDelayed(iuj5.c, 500L);
                                final e p2 = iuj5.p;
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
