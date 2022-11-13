import android.widget.FrameLayout$LayoutParams;
import android.animation.AnimatorSet;
import android.widget.RelativeLayout$LayoutParams;
import android.text.TextUtils;
import java.util.ArrayDeque;
import android.animation.AnimatorInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.animation.Animator;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.os.Handler;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbz extends abbk implements View$OnClickListener, abcg
{
    private boolean A;
    private boolean B;
    private CharSequence C;
    private CharSequence D;
    private CharSequence E;
    private Bitmap F;
    private final Runnable a;
    private final Context b;
    private final Handler c;
    private View d;
    private View e;
    private View f;
    private TextView g;
    private TextView h;
    private TextView i;
    private View j;
    private ImageView k;
    private View l;
    private TextView m;
    private View n;
    private ImageView o;
    private abcf p;
    private final abck q;
    private final abch r;
    private Animator s;
    private Animator t;
    private long u;
    private int v;
    private int w;
    private CharSequence x;
    private CharSequence y;
    private boolean z;
    
    public jbz(final Context b, final abck q, final abch r, final Handler c) {
        super(b);
        this.q = q;
        this.r = r;
        this.b = b;
        this.c = c;
        this.a = (Runnable)new inm(this, 19);
    }
    
    private final void y() {
        final View e = this.e;
        if (e != null) {
            if (e.getVisibility() != 8) {
                this.c.removeCallbacks(this.a);
                this.c.postDelayed(this.a, this.u);
            }
        }
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final View c(final Context context) {
        final View inflate = LayoutInflater.from(context).inflate(2131624766, (ViewGroup)new FrameLayout(context), true);
        this.d = inflate;
        final View viewById = inflate.findViewById(2131429658);
        this.e = viewById;
        this.g = (TextView)viewById.findViewById(2131429653);
        this.h = (TextView)this.e.findViewById(2131429654);
        this.j = this.e.findViewById(2131429655);
        (this.k = (ImageView)this.e.findViewById(2131429656)).setImageAlpha(255);
        this.i = (TextView)this.e.findViewById(2131429657);
        this.j.setOnClickListener((View$OnClickListener)this);
        this.l = this.e.findViewById(2131429661);
        this.m = (TextView)this.e.findViewById(2131429662);
        this.l.setOnClickListener((View$OnClickListener)this);
        final View viewById2 = this.d.findViewById(2131429659);
        this.f = viewById2;
        (this.n = viewById2.findViewById(2131429660)).setOnClickListener((View$OnClickListener)this);
        final TextView target = (TextView)this.f.findViewById(2131429664);
        (this.s = AnimatorInflater.loadAnimator(context, 2130837528)).setTarget((Object)this.n);
        (this.t = AnimatorInflater.loadAnimator(context, 2130837528)).setTarget((Object)target);
        this.o = (ImageView)this.d.findViewById(2131429652);
        this.d.setClickable(false);
        this.d.setBackgroundColor(0);
        return this.d;
    }
    
    public final void e(final Context context, final View view) {
        boolean b = true;
        if (this.ab(1)) {
            final boolean b2 = this.B;
            int visibility = 8;
            if (b2) {
                this.g.setText(this.C);
                this.g.setContentDescription(this.C);
                this.h.setText(this.D);
                this.h.setContentDescription(this.D);
                this.m.setText(this.E);
                this.j.setVisibility(8);
                this.l.setVisibility(0);
            }
            else {
                this.g.setText(this.C);
                this.g.setContentDescription(this.C);
                this.h.setText(this.D);
                this.h.setContentDescription(this.D);
                final ArrayDeque arrayDeque = new ArrayDeque();
                if (TextUtils.isEmpty(this.D) && !TextUtils.isEmpty(this.C)) {
                    arrayDeque.add(tpe.az(2));
                    arrayDeque.add(tpe.ao(15));
                }
                else {
                    arrayDeque.add(tpe.ap(2, 2131429663));
                    arrayDeque.add(tpe.az(15));
                }
                tpe.aF((View)this.g, tpe.aK(arrayDeque), (Class)RelativeLayout$LayoutParams.class);
                this.l.setVisibility(8);
                final View j = this.j;
                if (this.w > 0) {
                    visibility = 0;
                }
                j.setVisibility(visibility);
            }
        }
        if (this.ab(2)) {
            this.j.setSelected(this.z);
            int v = this.v;
            if (v != 0) {
                final int w = this.w;
                if (w != 0) {
                    final ImageView k = this.k;
                    if (!this.z) {
                        v = w;
                    }
                    k.setImageResource(v);
                }
            }
            final TextView i = this.i;
            CharSequence text;
            if (this.z) {
                text = this.x;
            }
            else {
                text = this.y;
            }
            i.setText(text);
        }
        if (this.ab(4)) {
            final ImageView o = this.o;
            if (o != null) {
                o.setImageBitmap(this.F);
                if (this.F == null) {
                    b = false;
                }
                this.A = b;
                this.d.setClickable(b);
            }
            this.F = null;
        }
    }
    
    public final int getHeight() {
        final View d = this.d;
        if (d != null) {
            return d.getHeight();
        }
        return 0;
    }
    
    public final int getWidth() {
        final View d = this.d;
        if (d != null) {
            return d.getWidth();
        }
        return 0;
    }
    
    public final void l(final boolean b) {
        final View f = this.f;
        if (f != null) {
            if (this.e != null) {
                f.setVisibility(8);
                this.f.setAlpha(1.0f);
                this.e.setVisibility(0);
                this.g.requestFocus();
                this.g.sendAccessibilityEvent(8);
                final abch r = this.r;
                if (r != null) {
                    r.m(1, this.e.getHeight());
                }
                if (b) {
                    this.y();
                }
            }
        }
    }
    
    public final void m() {
        if (this.f != null) {
            final View e = this.e;
            if (e != null) {
                e.setVisibility(8);
                this.f.setVisibility(8);
            }
        }
    }
    
    public final void mk() {
        this.X();
    }
    
    public final String mr() {
        return "player_overlay_live";
    }
    
    public final void n() {
        this.c.removeCallbacks(this.a);
    }
    
    public final void o(final long u) {
        this.u = u;
        this.y();
    }
    
    public final boolean oV() {
        return true;
    }
    
    public final void onClick(final View view) {
        if (view == this.j) {
            this.z ^= true;
            this.Z(2);
            this.p.tc();
        }
        if (view == this.l) {
            this.p.a();
        }
        if (view == this.n) {
            this.l(true);
        }
    }
    
    public final void oy(final int n) {
        if (n != 3) {
            if (n != 1) {
                final abck q = this.q;
                if (q != null) {
                    q.I(n == 2);
                }
                final abch r = this.r;
                if (r != null) {
                    if (n == 0) {
                        r.m(0, 0);
                        return;
                    }
                    final View e = this.e;
                    if (e != null) {
                        if (this.f != null) {
                            if (e.getVisibility() == 0) {
                                this.r.m(1, this.e.getHeight());
                            }
                            if (this.f.getVisibility() == 0) {
                                this.r.m(2, this.f.getHeight());
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void p(final Bitmap f) {
        if (f == null && !this.A) {
            return;
        }
        this.F = f;
        this.Z(4);
    }
    
    public final void q(final abcf p) {
        this.p = p;
    }
    
    public final void r(final boolean b) {
        final abck q = this.q;
        if (q != null) {
            q.J(b);
        }
    }
    
    public final void s() {
        if (this.x() && this.f != null) {
            final View e = this.e;
            if (e != null) {
                e.setVisibility(8);
                this.f.setVisibility(0);
                final AnimatorSet set = new AnimatorSet();
                set.setStartDelay(400L);
                set.playTogether(new Animator[] { this.s, this.t });
                set.start();
                final abch r = this.r;
                if (r != null) {
                    r.m(2, this.f.getHeight());
                }
            }
        }
    }
    
    public final void t(final CharSequence c, final CharSequence d, final boolean z, final CharSequence y, final int w, final CharSequence x, final int v) {
        this.C = c;
        this.D = d;
        this.z = z;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.B = false;
        this.aa();
        this.Z(3);
    }
    
    public final void u(final boolean b) {
        if (this.f != null) {
            final View e = this.e;
            if (e != null) {
                if (b) {
                    this.s();
                    return;
                }
                e.setVisibility(0);
                this.f.setVisibility(8);
            }
        }
    }
    
    public final void v(final CharSequence c, final CharSequence d, final CharSequence e) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.B = true;
        this.aa();
        this.Z(1);
    }
    
    public final void w(final boolean b) {
        if (this.e == null) {
            return;
        }
        final ArrayDeque arrayDeque = new ArrayDeque();
        if (b) {
            arrayDeque.add(tpe.aD(this.b.getResources().getDimensionPixelSize(2131167546)));
            arrayDeque.add(tpe.as(83));
        }
        else {
            arrayDeque.add(tpe.aD(-1));
            arrayDeque.add(tpe.as(81));
        }
        tpe.aF(this.e, tpe.aK(arrayDeque), (Class)FrameLayout$LayoutParams.class);
    }
    
    public final boolean x() {
        return this.u != 0L;
    }
}
