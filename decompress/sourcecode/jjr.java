import android.content.SharedPreferences;
import android.util.Log;
import com.google.protobuf.MessageLite;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.GestureDetector;
import android.view.View;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjr implements View$OnTouchListener
{
    final /* synthetic */ Object a = a;
    final /* synthetic */ Object b = b;
    private final /* synthetic */ int c;
    
    public jjr(final appn a, final acij b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jjr(final oov a, final View b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jjr(final wns a, final GestureDetector b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jjr(final wqi a, final ScaleGestureDetector b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final int c = this.c;
        boolean b = true;
        final boolean b2 = false;
        if (c == 0) {
            if (motionEvent.getAction() == 1) {
                final appn appn = (appn)this.a;
                if ((appn.b & 0x4) != 0x0) {
                    ((wwx)this.b).a.J(3, (wxz)new wws(appn.g.I()), (alff)null);
                }
            }
            return false;
        }
        if (c == 1) {
            final Object b3 = this.b;
            final Object a = this.a;
            if (motionEvent.getAction() == 1) {
                final acij e = ((fuv)b3).e;
                if (e != null) {
                    iji.a(e, (MessageLite)a);
                    view.performClick();
                }
            }
            return false;
        }
        if (c == 2) {
            final Object b4 = this.b;
            final Object a2 = this.a;
            if (motionEvent.getAction() == 1) {
                ((khm)b4).g.J(3, (wxz)new wws((agyc)a2), (alff)null);
            }
            return false;
        }
        if (c == 3) {
            if (motionEvent.getAction() == 0) {
                ((oov)this.a).e();
                ((View)this.b).setOnTouchListener((View$OnTouchListener)null);
            }
            return false;
        }
        if (c == 4) {
            final int u = ((wns)this.a).u;
            boolean onTouchEvent = b2;
            if (u != 1) {
                onTouchEvent = b2;
                if (u != 4) {
                    if (u == 7) {
                        onTouchEvent = b2;
                    }
                    else {
                        onTouchEvent = ((GestureDetector)this.b).onTouchEvent(motionEvent);
                        if (!onTouchEvent && motionEvent.getAction() == 1) {
                            final wnr s = ((wns)this.a).s;
                            if (!s.b) {
                                onTouchEvent = b2;
                            }
                            else if (s.c) {
                                s.c = false;
                                onTouchEvent = b2;
                            }
                            else {
                                final wns d = s.d;
                                final wnq p2 = d.p;
                                onTouchEvent = b2;
                                if (p2 != null) {
                                    final wnn wnn = (wnn)p2;
                                    if (d != wnn.b) {
                                        final String string = d.toString();
                                        final String string2 = wnn.b.toString();
                                        final StringBuilder sb = new StringBuilder("Unexpected self view window: ");
                                        sb.append(string);
                                        sb.append(" != ");
                                        sb.append(string2);
                                        Log.e("ScreencastControls", sb.toString());
                                        wnn.f.g();
                                        onTouchEvent = b2;
                                    }
                                    else {
                                        final int i = wnn.i;
                                        if (i != 4 && i != 7 && !wnn.c.t()) {
                                            wnn.c.r();
                                            d.i();
                                            wnn.f();
                                        }
                                        else {
                                            wnn.c.c();
                                            d.c();
                                            wnn.k();
                                        }
                                        ((SharedPreferences)wnn.j.a).edit().putBoolean("PREFS_SELF_VIEW_WINDOW_TOOLTIP_SEEN", true).apply();
                                        onTouchEvent = b2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return onTouchEvent;
        }
        final int n = 5;
        if (c != 5) {
            final Object b5 = this.b;
            final Object a3 = this.a;
            if (((acrc)b5).g && a3 != null) {
                ((acrf)a3).oz();
            }
            return false;
        }
        int n2 = motionEvent.getAction() & 0xFF;
        if (n2 == 5) {
            n2 = n;
            if (motionEvent.getPointerCount() >= 2) {
                ((wqi)this.a).an = true;
                n2 = n;
            }
        }
        if (n2 == 0) {
            ((wqi)this.a).ao = true;
        }
        if (n2 == 2) {
            float n3;
            if (motionEvent.getHistorySize() == 0) {
                n3 = 0.0f;
            }
            else {
                n3 = (float)Math.hypot(motionEvent.getX() - motionEvent.getHistoricalX(0), motionEvent.getY() - motionEvent.getHistoricalY(0));
            }
            if (n3 > 20.0f) {
                ((wqi)this.a).ao = false;
            }
        }
        if (n2 == 1) {
            final wqi wqi = (wqi)this.a;
            if (!wqi.an && wqi.ao) {
                wqi.ao = false;
                final wqf ah = wqi.ah;
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                final wqr wqr = (wqr)ah;
                if (!wqr.aZ.aY().B) {
                    return b;
                }
                wqr.ae.bN(x, y, new xpb(wqr));
                return true;
            }
            else {
                if (motionEvent.getPointerCount() < 2) {
                    ((wqi)this.a).an = false;
                }
                view.performClick();
            }
        }
        if (((wqi)this.a).an && n2 == 2) {
            return ((ScaleGestureDetector)this.b).onTouchEvent(motionEvent);
        }
        b = false;
        return b;
    }
}
