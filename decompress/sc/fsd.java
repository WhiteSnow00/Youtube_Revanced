import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.animation.Animator$AnimatorListener;
import java.util.Collection;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import android.view.View;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;
import android.view.ScaleGestureDetector;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.app.Dialog;
import android.graphics.PointF;
import android.view.View$OnTouchListener;
import android.support.v7.widget.AppCompatImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsd extends AppCompatImageView implements View$OnTouchListener
{
    public int a;
    public boolean b;
    public float c;
    boolean d;
    final PointF e;
    Dialog f;
    public AppCompatImageView g;
    public AppCompatImageView h;
    public AppCompatImageView i;
    public oti j;
    public otc k;
    public CommandOuterClass$Command l;
    public CommandOuterClass$Command m;
    public boolean n;
    public boolean o;
    public boolean p;
    public zjp q;
    public ovw r;
    public byte[] s;
    public int t;
    public int u;
    public int v;
    private final ScaleGestureDetector w;
    private PointF x;
    private final int[] y;
    private final int[] z;
    
    public fsd(final Context context) {
        super(context);
        this.n = true;
        this.o = false;
        this.a = 0;
        this.t = 1;
        this.b = false;
        this.getContext().registerReceiver((BroadcastReceiver)new fsc(this, this), new IntentFilter("android.intent.action.SCREEN_OFF"));
        this.w = new ScaleGestureDetector(this.getContext(), (ScaleGestureDetector$OnScaleGestureListener)new fsb(this));
        this.setOnTouchListener((View$OnTouchListener)this);
        this.y = new int[2];
        this.z = new int[2];
        this.e = new PointF(0.0f, 0.0f);
        this.x = new PointF(0.0f, 0.0f);
        this.u = 1;
        this.v = 1;
    }
    
    private static PointF d(final MotionEvent motionEvent) {
        final int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        float n = 0.0f;
        float n2 = 0.0f;
        while (i < pointerCount) {
            n2 += motionEvent.getX(i);
            n += motionEvent.getY(i);
            ++i;
        }
        final float n3 = (float)pointerCount;
        return new PointF(n2 / n3, n / n3);
    }
    
    private final int[] e(final int[] array) {
        return new int[] { array[0] - tpe.m(this.getRootView()).b(), array[1] - tpe.m(this.getRootView()).d() };
    }
    
    public final AppCompatImageView a() {
        final AppCompatImageView appCompatImageView = new AppCompatImageView(this.getContext());
        appCompatImageView.setMaxWidth(this.getWidth());
        appCompatImageView.setMinimumWidth(this.getWidth());
        appCompatImageView.setMinimumHeight(this.getHeight());
        appCompatImageView.setMaxHeight(this.getHeight());
        return appCompatImageView;
    }
    
    protected final void b() {
        this.o = true;
    }
    
    public final void c(final View view) {
        if (this.i != null && view != null) {
            final int[] array = new int[2];
            view.getLocationInWindow(array);
            final ArrayList list = new ArrayList();
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.i, "scaleX", new float[] { 1.0f });
            ofFloat.setDuration(200L);
            list.add(ofFloat);
            final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)this.i, "scaleY", new float[] { 1.0f });
            ofFloat2.setDuration(200L);
            list.add(ofFloat2);
            final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)this.i, "translationX", new float[] { (float)array[0] });
            ofFloat3.setDuration(200L);
            list.add(ofFloat3);
            final ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object)this.i, "translationY", new float[] { (float)array[1] });
            ofFloat4.setDuration(200L);
            list.add(ofFloat4);
            final AnimatorSet set = new AnimatorSet();
            set.playTogether((Collection)list);
            set.addListener((Animator$AnimatorListener)new fsa(this));
            set.start();
        }
        final PointF e = this.e;
        if (e != null) {
            e.x = 0.0f;
            this.e.y = 0.0f;
        }
        this.d = false;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        this.w.onTouchEvent(motionEvent);
        final int pointerCount = motionEvent.getPointerCount();
        if (pointerCount >= 2) {
            this.getParent().requestDisallowInterceptTouchEvent(true);
        }
        view.getLocationInWindow(this.y);
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (pointerCount > 1) {
                        final PointF d = d(motionEvent);
                        final float x = d.x;
                        final float x2 = this.x.x;
                        final float y = d.y;
                        final float y2 = this.x.y;
                        if (this.d) {
                            this.e.offset(x - x2, y - y2);
                        }
                        this.x = d;
                    }
                }
            }
            else {
                if (this.n) {
                    final int v = this.v;
                    final int n = v - 1;
                    if (v == 0) {
                        throw null;
                    }
                    if (n != 1) {
                        if (n == 2) {
                            final boolean hapticFeedbackEnabled = this.isHapticFeedbackEnabled();
                            if (!hapticFeedbackEnabled) {
                                this.setHapticFeedbackEnabled(true);
                            }
                            this.performHapticFeedback(0);
                            if (!hapticFeedbackEnabled) {
                                this.setHapticFeedbackEnabled(false);
                            }
                        }
                    }
                    else {
                        ObjectAnimator.ofFloat((Object)this, "translationX", new float[] { 0.0f, 8.0f, -8.0f, 8.0f, -8.0f, 0.0f }).setDuration(250L).start();
                    }
                    if (this.k != null && this.m != null) {
                        final vgs a = ota.a();
                        final oti j = this.j;
                        if (j != null) {
                            a.h = j.q;
                        }
                        this.k.a(this.m, a.f()).U();
                    }
                }
                if (!this.n && pointerCount == 1) {
                    this.n = true;
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        }
        else {
            final PointF d2 = d(motionEvent);
            this.x = d2;
            this.z[0] = view.getWidth() / 2 - (int)d2.x;
            this.z[1] = view.getHeight() / 2 - (int)d2.y;
        }
        if (!this.d) {
            return true;
        }
        final int[] e = this.e(this.y);
        final AppCompatImageView g = this.g;
        if (g != null) {
            g.setX((float)e[0]);
            this.g.setY((float)e[1]);
        }
        final AppCompatImageView h = this.h;
        if (h != null) {
            h.setX((float)e[0]);
            this.h.setY((float)e[1]);
        }
        if (this.i != null) {
            final int[] e2 = this.e(this.y);
            e2[0] += (int)this.e.x + (int)((this.c - 1.0f) * this.z[0]);
            e2[1] += (int)this.e.y + (int)((this.c - 1.0f) * this.z[1]);
            this.i.setX((float)e2[0]);
            this.i.setY((float)e2[1]);
            this.i.setScaleX(this.c);
            this.i.setScaleY(this.c);
        }
        if (pointerCount == 1) {
            this.c(view);
        }
        this.invalidate();
        return true;
    }
    
    public final void setImageBitmap(final Bitmap bitmap) {
        this.setImageDrawable((Drawable)new BitmapDrawable(this.getResources(), bitmap));
    }
    
    public final void setImageDrawable(final Drawable imageDrawable) {
        if (imageDrawable == null) {
            super.setImageDrawable((Drawable)null);
            return;
        }
        this.setScaleType(aakv.w(this.t));
        aip.d(imageDrawable, this.b);
        if (this.a != 0) {
            imageDrawable.mutate().setColorFilter(this.a, PorterDuff$Mode.SRC_IN);
        }
        super.setImageDrawable(imageDrawable);
    }
}
