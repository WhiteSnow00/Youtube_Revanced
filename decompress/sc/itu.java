import app.revanced.integrations.patches.HideInfocardsPatch;
import java.util.concurrent.Callable;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Vibrator;
import android.view.animation.Animation;
import android.os.Handler;
import android.content.res.Resources;
import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itu implements uyw, abbm
{
    private static final Interpolator f;
    public final atke a;
    public final jbi b;
    public View c;
    public boolean d;
    public xra e;
    private final Context g;
    private final Resources h;
    private final acgs i;
    private final atke j;
    private final Handler k;
    private final int l;
    private Animation m;
    private Animation n;
    private Runnable o;
    private Vibrator p;
    private abbl q;
    private TextView r;
    private ImageView s;
    private Drawable t;
    private boolean u;
    private final msr v;
    
    static {
        f = (Interpolator)apc.c(0.05f, 0.0f, 0.0f, 1.0f);
    }
    
    public itu(final Context g, final Handler k, final acgs i, final atke a, final atke j, final msr v, final jbi b, final byte[] array, final byte[] array2) {
        g.getClass();
        this.g = g;
        final Resources resources = g.getResources();
        resources.getClass();
        this.h = resources;
        k.getClass();
        this.k = k;
        i.getClass();
        this.i = i;
        a.getClass();
        this.a = a;
        this.j = j;
        this.v = v;
        this.b = b;
        this.l = resources.getInteger(2131492959);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void c(final boolean b) {
        if (this.mn()) {
            if (this.n != null) {
                final Runnable o = this.o;
                if (o != null) {
                    this.k.removeCallbacks(o);
                }
                final Animation n = this.n;
                if (n != null) {
                    if (b) {
                        n.setDuration(360L);
                    }
                    else {
                        n.setDuration(0L);
                    }
                    final View c = this.c;
                    if (c != null) {
                        c.startAnimation(this.n);
                    }
                }
            }
        }
    }
    
    final void e() {
        if (this.mn()) {
            return;
        }
        final View inflate = LayoutInflater.from(this.g).inflate(2131625800, (ViewGroup)new FrameLayout(this.g));
        this.c = inflate;
        final View viewById = inflate.findViewById(2131432437);
        viewById.getClass();
        final View viewById2 = this.c.findViewById(2131432438);
        viewById2.getClass();
        final TextView r = (TextView)viewById.findViewById(2131432440);
        r.getClass();
        this.r = r;
        final View viewById3 = this.c.findViewById(2131432436);
        viewById3.getClass();
        final ImageView s = (ImageView)this.c.findViewById(2131432439);
        s.getClass();
        this.s = s;
        this.t = s.getDrawable();
        this.c.setVisibility(8);
        viewById2.setOnClickListener((View$OnClickListener)new iob(this, 13));
        viewById2.setOnTouchListener((View$OnTouchListener)new aego(viewById, new pvh(this), (byte[])null, (byte[])null));
        final Animation loadAnimation = AnimationUtils.loadAnimation(this.g, 2130772037);
        this.m = loadAnimation;
        final Interpolator f = itu.f;
        loadAnimation.setInterpolator(f);
        this.m.setDuration(360L);
        (this.n = AnimationUtils.loadAnimation(this.g, 2130772040)).setInterpolator(f);
        this.n.setAnimationListener((Animation$AnimationListener)new cbi(this, 8));
        final wyt wyt = new wyt(xaa.c(123225));
        ((wyw)this.a.a()).D((wzz)wyt);
        viewById3.setOnClickListener((View$OnClickListener)new ivc(this, (wzz)wyt, 1));
        this.o = (Runnable)new inm(this, 8);
        final abbl q = this.q;
        if (q != null) {
            q.d((abbm)this, this.c);
        }
        this.v.Q((Callable)new ikw(this, 6));
    }
    
    public final void f() {
        final Runnable o = this.o;
        if (o != null) {
            this.k.removeCallbacks(o);
        }
        this.u = false;
        final View c = this.c;
        if (c != null) {
            c.setVisibility(8);
        }
    }
    
    public final Boolean i(final akfb akfb, final long n) {
        final boolean u = this.u;
        final Boolean value = false;
        if (!u) {
            return value;
        }
        if (((uwb)this.j.a()).F()) {
            return value;
        }
        if (this.b.j()) {
            return value;
        }
        this.e();
        final TextView r = this.r;
        if (r != null) {
            ajut ajut;
            if ((ajut = akfb.c) == null) {
                ajut = ajut.a;
            }
            r.setText((CharSequence)acak.b(ajut));
        }
        final ImageView s = this.s;
        if (s != null) {
            final int n2 = akfb.b & 0x80;
            if (n2 != 0) {
                final acgs i = this.i;
                aotp aotp;
                if ((aotp = akfb.j) == null) {
                    aotp = aotp.a;
                }
                i.g(s, aotp);
            }
            else if (n2 == 0) {
                s.setImageDrawable(this.t);
            }
            if ((akfb.b & 0x100) != 0x0) {
                final ImageView s2 = this.s;
                ahik ahik;
                if ((ahik = akfb.k) == null) {
                    ahik = ahik.a;
                }
                s2.setContentDescription((CharSequence)ahik.c);
            }
        }
        final View c = this.c;
        if (c != null) {
            final int hideInfoCard = HideInfocardsPatch.hideInfoCard();
            c.setVisibility(hideInfoCard);
            c.setVisibility(hideInfoCard);
            final Animation m = this.m;
            if (m != null) {
                this.c.startAnimation(m);
            }
        }
        final Runnable o = this.o;
        if (o != null) {
            this.k.removeCallbacks(o);
            this.k.postDelayed(o, n);
        }
        if (tsy.e(this.g)) {
            if (this.p == null) {
                final Object systemService = this.g.getSystemService("vibrator");
                systemService.getClass();
                this.p = (Vibrator)systemService;
            }
            this.p.vibrate((long)this.l);
        }
        return true;
    }
    
    public final void j() {
        this.u = true;
    }
    
    public final void k(final xra e) {
        this.e = e;
    }
    
    public final View md() {
        this.e();
        final View c = this.c;
        if (c != null) {
            return c;
        }
        return new View(this.g);
    }
    
    public final void ml(final abbl q) {
        this.q = q;
    }
    
    public final boolean mn() {
        return this.c != null;
    }
    
    public final String mr() {
        return "player_overlay_info_card_teaser";
    }
}
