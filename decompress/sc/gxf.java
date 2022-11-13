import android.view.MotionEvent;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxf extends hjx
{
    public final gxd a;
    public final Context b;
    private final gwd e;
    
    public gxf(final Context b, final gxd a, final ukj ukj) {
        super(b, (ukt)a, ukj);
        this.a = a;
        this.b = b;
        this.e = new gwd((gwc)a);
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 0xFF) == 0x1) {
            this.a.d();
        }
        final gwd e = this.e;
        boolean b;
        try {
            final int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    e.f = -1;
                                }
                            }
                            else {
                                final int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                                e.f = pointerId;
                                final int pointerIndex = motionEvent.findPointerIndex(pointerId);
                                if (pointerIndex != -1) {
                                    e.c = motionEvent.getX(pointerIndex);
                                    e.d = motionEvent.getY(pointerIndex);
                                }
                            }
                        }
                        else {
                            e.e = -1;
                            e.f = -1;
                        }
                    }
                    else {
                        final int pointerIndex2 = motionEvent.findPointerIndex(e.e);
                        final int pointerIndex3 = motionEvent.findPointerIndex(e.f);
                        if (pointerIndex2 != -1 && pointerIndex3 != -1) {
                            final float x = motionEvent.getX(pointerIndex2);
                            final float y = motionEvent.getY(pointerIndex2);
                            final float x2 = motionEvent.getX(pointerIndex3);
                            final float y2 = motionEvent.getY(pointerIndex3);
                            final float n = (float)Math.atan2(e.d - e.b, e.c - e.a);
                            final float n2 = (float)Math.atan2(y2 - y, x2 - x);
                            e.a = x;
                            e.b = y;
                            e.c = x2;
                            e.d = y2;
                            final gwc g = e.g;
                            if (g != null) {
                                g.a(n - n2);
                            }
                        }
                    }
                }
                else {
                    e.e = -1;
                }
            }
            else {
                final int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                e.e = pointerId2;
                final int pointerIndex4 = motionEvent.findPointerIndex(pointerId2);
                if (pointerIndex4 != -1) {
                    e.a = motionEvent.getX(pointerIndex4);
                    e.b = motionEvent.getY(pointerIndex4);
                }
            }
            b = true;
        }
        catch (final IllegalArgumentException ex) {
            zlm.c(zll.b, zlk.f, "[ShortsCreation][Android][Camera]Unhandled exception when handling touch event", (Throwable)ex);
            b = false;
        }
        return super.onTouch(view, motionEvent) || b;
    }
}
