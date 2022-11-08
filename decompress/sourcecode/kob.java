import android.text.Spanned;
import java.util.Map;
import com.google.protos.youtube.api.innertube.CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import android.graphics.PorterDuff$Mode;
import android.view.ViewStub;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.view.View;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kob implements acil
{
    private Drawable A;
    private Drawable B;
    private final uyi C;
    private final adcr D;
    private final qbo E;
    public final View a;
    public boolean b;
    private final Context c;
    private final View d;
    private final aceo e;
    private final TextView f;
    private final ImageView g;
    private final TextView h;
    private final ImageView i;
    private final View j;
    private final ImageView k;
    private final acnj l;
    private final acih m;
    private final acek n;
    private final fzz o;
    private final gil p;
    private TextView q;
    private ImageView r;
    private ike s;
    private gim t;
    private String u;
    private String v;
    private boolean w;
    private boolean x;
    private Drawable y;
    private Drawable z;
    
    public kob(final Context c, final aceo e, final vax vax, final acnj l, final qbo e2, final adcr d, final uyi c2, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3) {
        this.p = new kny(this, 0);
        this.c = c;
        this.e = e;
        final View inflate = LayoutInflater.from(c).inflate(2131625349, viewGroup, false);
        this.d = inflate;
        this.f = (TextView)inflate.findViewById(2131432092);
        this.i = (ImageView)inflate.findViewById(2131432006);
        this.j = inflate.findViewById(2131432008);
        this.g = (ImageView)inflate.findViewById(2131431364);
        this.h = (TextView)inflate.findViewById(2131428769);
        this.q = (TextView)inflate.findViewById(2131432229);
        this.r = (ImageView)inflate.findViewById(2131432227);
        final View viewById = inflate.findViewById(2131432026);
        this.a = viewById;
        this.k = (ImageView)inflate.findViewById(2131428448);
        this.l = l;
        this.E = e2;
        this.D = d;
        this.C = c2;
        final acej b = e.b().b();
        b.c = (acem)new koa(this);
        b.f = 1;
        this.n = b.a();
        this.m = new acih(vax, inflate);
        this.o = new fzz((ViewStub)inflate.findViewById(2131431680), 0);
        if (e2 != null) {
            final ViewStub viewStub = (ViewStub)viewById.findViewById(2131430137);
            ike q = null;
            if (viewStub != null) {
                q = e2.Q(viewStub, (ikn)null);
            }
            this.s = q;
        }
    }
    
    private final void f() {
        final ImageView r = this.r;
        if (r != null) {
            r.setVisibility(8);
        }
    }
    
    private final void g() {
        this.g.setVisibility(0);
        final Drawable drawable = this.g.getDrawable();
        drawable.setColorFilter(tmy.cn(this.c, 2130970864), PorterDuff$Mode.SRC_ATOP);
        this.g.setImageDrawable(drawable);
        tmy.E(this.i, (int)(this.c.getResources().getFraction(2131361821, 1, 1) * 255.0f));
        this.h.setTextColor(tmy.ct(this.c, 2130970884).orElse(0));
        tmy.v(this.j, true);
    }
    
    private final void h() {
        this.g.setVisibility(4);
        tmy.E(this.i, (int)(this.c.getResources().getFraction(2131361820, 1, 1) * 255.0f));
        this.h.setTextColor(tmy.ct(this.c, 2130970885).orElse(0));
        tmy.v(this.j, false);
    }
    
    private static final aioe i(final anhb anhb) {
        if (anhb != null && (anhb.b & 0x100) != 0x0) {
            aioe aioe;
            if ((aioe = anhb.n) == null) {
                aioe = aioe.a;
            }
            if (((agzd)aioe).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
                return aioe;
            }
            if (((agzd)aioe).rs((agyr)CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand.coWatchWatchEndpointWrapperCommand)) {
                final CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand = (CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand)((agzd)aioe).rr((agyr)CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand.coWatchWatchEndpointWrapperCommand);
                if ((coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand.b & 0x1) != 0x0) {
                    aioe aioe2;
                    if ((aioe2 = coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand.c) == null) {
                        aioe2 = aioe.a;
                    }
                    if (((agzd)aioe2).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
                        aioe aioe3;
                        if ((aioe3 = coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand.c) == null) {
                            aioe3 = aioe.a;
                        }
                        return aioe3;
                    }
                }
            }
        }
        return null;
    }
    
    public final View a() {
        return this.d;
    }
    
    public final void b() {
        if (this.x) {
            if (this.b) {
                this.d.setBackgroundColor(tmy.cn(this.c, 2130970859));
                if (this.D.d()) {
                    if (this.A == null) {
                        final acta a = acta.a(this.c);
                        a.b = this.d.getBackground();
                        this.A = (Drawable)a.b();
                    }
                    this.d.setBackground(this.A);
                }
                this.f.setTextColor(tmy.cn(this.c, 2130970924));
                this.g();
                return;
            }
            this.d.setBackgroundColor(tmy.cn(this.c, 2130970858));
            if (this.D.d()) {
                if (this.B == null) {
                    final acta a2 = acta.a(this.c);
                    a2.b = this.d.getBackground();
                    this.B = (Drawable)a2.b();
                }
                this.d.setBackground(this.B);
            }
            this.f.setTextColor(tmy.cn(this.c, 2130970926));
            this.h();
        }
        else {
            if (this.b) {
                this.d.setBackgroundResource(2131231028);
                if (this.D.d()) {
                    if (this.y == null) {
                        final acta a3 = acta.a(this.c);
                        a3.a = -1;
                        a3.b = this.d.getBackground();
                        this.y = (Drawable)a3.b();
                    }
                    this.d.setBackground(this.y);
                }
                this.f.setTextColor(agx.a(this.c, 2131102393));
                this.g();
                return;
            }
            if (this.D.d()) {
                if (this.z == null) {
                    final acta a4 = acta.a(this.c);
                    a4.a = -1;
                    this.z = (Drawable)a4.b();
                }
                this.d.setBackground(this.z);
            }
            else {
                this.d.setBackgroundResource(2131231027);
            }
            this.f.setTextColor(agx.a(this.c, 2131102355));
            this.h();
        }
    }
    
    public final void c(final acir acir) {
        final gim t = this.t;
        if (t != null) {
            t.qs(this.p);
        }
    }
    
    public final boolean d() {
        final gim t = this.t;
        if (t != null && t.d() != null) {
            final String u = this.u;
            if (u != null) {
                return t.qt(u, this.v);
            }
        }
        return this.w;
    }
}
