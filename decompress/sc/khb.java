import android.text.Spanned;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import android.text.SpannedString;
import android.text.TextUtils;
import android.widget.ImageView$ScaleType;
import android.util.TypedValue;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.ProgressBar;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khb implements acko
{
    public final vcy a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final ImageView f;
    private final ProgressBar g;
    private final ProgressBar h;
    private final ProgressBar i;
    private final ProgressBar j;
    private final RelativeLayout k;
    private final View l;
    private final knd m;
    private final Context n;
    private final acgs o;
    private final ackr p;
    private final acpn q;
    private final vai r;
    
    public khb(final Context n, final vcy a, final acgs o, final gjh p6, final acpn q, final vai r) {
        this.n = n;
        this.o = o;
        this.a = a;
        this.r = r;
        final View inflate = View.inflate(n, 2131624975, (ViewGroup)null);
        this.b = inflate;
        this.c = (TextView)inflate.findViewById(2131432095);
        this.d = (TextView)inflate.findViewById(2131432249);
        this.e = (TextView)inflate.findViewById(2131432248);
        this.f = (ImageView)inflate.findViewById(2131432009);
        this.g = (ProgressBar)inflate.findViewById(2131432174);
        this.h = (ProgressBar)inflate.findViewById(2131428490);
        this.i = (ProgressBar)inflate.findViewById(2131432247);
        this.j = (ProgressBar)inflate.findViewById(2131430628);
        this.k = (RelativeLayout)inflate.findViewById(2131432029);
        this.l = inflate.findViewById(2131428448);
        this.m = new knd((ViewStub)inflate.findViewById(2131430606), n);
        p6.getClass();
        this.p = (ackr)p6;
        q.getClass();
        this.q = q;
        p6.c(inflate);
    }
    
    private final String d(final glk glk) {
        final double k = glk.k;
        if (Double.isNaN(k)) {
            return null;
        }
        if (Double.isInfinite(k)) {
            if (glk.f()) {
                return this.n.getResources().getString(2132020099);
            }
            if (glk.e()) {
                return this.n.getResources().getString(2132020098);
            }
            return this.n.getResources().getString(2132020097);
        }
        else {
            final int n = (int)k;
            if (n <= 1) {
                return null;
            }
            if (n <= 90) {
                return this.n.getResources().getQuantityString(2131886169, n, new Object[] { n });
            }
            final int n2 = n / 60;
            if (n2 <= 90) {
                return this.n.getResources().getQuantityString(2131886166, n2, new Object[] { n2 });
            }
            final int n3 = n2 / 60;
            if (n3 <= 3) {
                return this.n.getResources().getQuantityString(2131886159, n3, new Object[] { n3 });
            }
            return null;
        }
    }
    
    @Override
    public final View a() {
        return ((gjh)this.p).a;
    }
    
    final int b(final int n) {
        return (int)TypedValue.applyDimension(1, (float)n, this.n.getResources().getDisplayMetrics());
    }
    
    @Override
    public final void c(final acku acku) {
    }
    
    @Override
    public final void mN(final ackm ackm, Object o) {
        final glk glk = (glk)o;
        final ViewGroup$LayoutParams layoutParams = this.k.getLayoutParams();
        if (this.r.l(45357191L).aM()) {
            this.b.setPadding(this.b(12), this.b.getPaddingTop(), this.b.getPaddingRight(), this.b.getPaddingBottom());
            layoutParams.width = this.b(160);
        }
        else {
            layoutParams.width = this.n.getResources().getDimensionPixelSize(2131167259);
        }
        this.c.setText(glk.c);
        final aotp e = glk.e;
        if (e != null) {
            this.o.g(this.f, e);
            this.f.setScaleType(ImageView$ScaleType.CENTER_CROP);
        }
        else if (glk.f != null) {
            this.o.d(this.f);
            this.f.setImageBitmap(glk.f);
            this.f.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
        }
        else {
            this.o.d(this.f);
            this.f.setImageResource(2131232010);
            this.f.setScaleType(ImageView$ScaleType.CENTER_CROP);
        }
        if (glk.b) {
            final ahaz builder = ((ahbh)aian.a).createBuilder();
            final int y = glk.y;
            builder.copyOnWrite();
            final aian aian = (aian)builder.instance;
            if (y == 0) {
                throw null;
            }
            aian.c = y - 1;
            aian.b |= 0x1;
            this.m.a((aian)builder.build());
        }
        final amgs d = glk.d;
        if (d != null) {
            this.q.f(((gjh)this.p).a, this.l, d, (Object)glk, ackm.a);
            this.l.setVisibility(0);
        }
        else {
            this.l.setVisibility(8);
        }
        final double h = glk.h;
        final double i = glk.i;
        final boolean b = glk.j > -1.0;
        final boolean b2 = Double.isInfinite(glk.k) && (glk.f() || glk.e());
        int n;
        if (b) {
            n = (int)(glk.j * 100.0);
        }
        else {
            n = 0;
        }
        final int progress = (int)(i * 100.0);
        final int progress2 = (int)(h * 100.0);
        int n2;
        if ((n2 = (int)(glk.n * 100.0)) > n) {
            n2 = n;
        }
        int progress3;
        if ((progress3 = n2) < 0) {
            progress3 = 0;
        }
        int progress4;
        if ((progress4 = n) < 0) {
            progress4 = 0;
        }
        this.g.setProgress(progress2);
        this.h.setProgress(progress);
        this.i.setProgress(progress4);
        this.j.setProgress(progress3);
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        Label_1210: {
            if (glk.w) {
                this.d.setText(2132017846);
                this.e.setText((CharSequence)null);
            }
            else if (glk.v) {
                this.d.setText(2132020033);
                this.e.setText((CharSequence)null);
            }
            else {
                final Spanned q = glk.q;
                if (q != null) {
                    this.d.setText((CharSequence)q);
                    this.e.setText((CharSequence)glk.r);
                }
                else if (glk.u) {
                    this.d.setText(2132020094);
                    this.e.setText((CharSequence)null);
                }
                else if (glk.l) {
                    this.d.setText(2132020095);
                    this.e.setText(2132020096);
                }
                else if (glk.m) {
                    this.d.setText(2132020065);
                    this.e.setText(2132020066);
                }
                else if (glk.x) {
                    this.d.setText(2132020063);
                    this.e.setText((CharSequence)null);
                }
                else {
                    Label_0955: {
                        if (h > -1.0) {
                            if (i == -1.0) {
                                if (!b) {
                                    this.g.setVisibility(0);
                                    this.d.setText((CharSequence)this.n.getResources().getQuantityString(2131886157, progress2, new Object[] { progress2 }));
                                    this.e.setText((CharSequence)null);
                                    break Label_1210;
                                }
                                break Label_0955;
                            }
                        }
                        else if (i == -1.0) {
                            break Label_0955;
                        }
                        if (!b) {
                            this.h.setVisibility(0);
                            this.d.setText((CharSequence)this.n.getResources().getQuantityString(2131886157, progress, new Object[] { progress }));
                            this.e.setText((CharSequence)null);
                            break Label_1210;
                        }
                    }
                    if (b && glk.j < 1.0) {
                        this.i.setVisibility(0);
                        this.j.setVisibility(0);
                        this.d.setText((CharSequence)this.n.getResources().getQuantityString(2131886168, progress4, new Object[] { progress4 }));
                        this.e.setText((CharSequence)this.d(glk));
                    }
                    else if (glk.j == 1.0) {
                        this.i.setVisibility(0);
                        this.j.setVisibility(0);
                        if (TextUtils.isEmpty((CharSequence)(o = glk.o))) {
                            o = new SpannedString((CharSequence)this.n.getString(2132020093));
                        }
                        this.d.setText((CharSequence)o);
                        this.e.setText((CharSequence)glk.p);
                    }
                    else if (b2) {
                        this.i.setVisibility(0);
                        this.j.setVisibility(0);
                        this.d.setText((CharSequence)this.n.getResources().getQuantityString(2131886168, progress4, new Object[] { progress4 }));
                        this.e.setText((CharSequence)this.d(glk));
                    }
                    else {
                        this.d.setText(2132018179);
                        this.e.setText((CharSequence)null);
                    }
                }
            }
        }
        if (glk.x) {
            this.k.setAlpha(0.4f);
            this.c.setTextColor(tpe.cr(this.n, 2130970922));
        }
        else {
            this.k.setAlpha(1.0f);
            this.c.setTextColor(tpe.cr(this.n, 2130970924));
        }
        final aiqj t = glk.t;
        if (t != null) {
            this.b.setOnClickListener((View$OnClickListener)new keq(this, t, 10));
        }
        else {
            final aiqj s = glk.s;
            if (s != null) {
                this.b.setOnClickListener((View$OnClickListener)new keq(this, s, 11));
            }
            else {
                this.b.setOnClickListener((View$OnClickListener)null);
                this.b.setClickable(false);
                this.b.setFocusable(true);
            }
        }
        this.p.e(ackm);
    }
}
