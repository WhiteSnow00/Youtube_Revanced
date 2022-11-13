import android.text.Spanned;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvr implements View$OnClickListener
{
    public final View a;
    public ImageView b;
    public TextView c;
    public aidi d;
    public fvq e;
    private final vcy f;
    private final acpk g;
    private final tjm h;
    private final int i;
    private final int j;
    private final aeea k;
    
    public fvr(final vcy f, final acpk g, final tjm h, final aeea k, final View a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = f;
        this.g = g;
        this.a = a;
        this.h = h;
        this.k = k;
        this.b = (ImageView)a.findViewById(2131432115);
        this.c = (TextView)a.findViewById(2131432116);
        a.setOnClickListener((View$OnClickListener)this);
        this.i = a.getResources().getDimensionPixelSize(2131165567);
        this.j = a.getResources().getDimensionPixelSize(2131165568);
    }
    
    private final GradientDrawable f(final int color, final int n) {
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float)this.i);
        gradientDrawable.setStroke(this.j, n);
        return gradientDrawable;
    }
    
    private static int g(final aidi aidi) {
        final boolean e = aidi.e;
        final int n = 1;
        int n2;
        if (e) {
            aidj aidj;
            if ((aidj = aidi.q) == null) {
                aidj = aidj.a;
            }
            if ((n2 = aefb.Z(aidj.c)) == 0) {
                n2 = n;
            }
        }
        else {
            aidj a;
            if (aidi.c == 1) {
                a = (aidj)aidi.d;
            }
            else {
                a = aidj.a;
            }
            if ((n2 = aefb.Z(a.c)) == 0) {
                n2 = n;
            }
        }
        return n2;
    }
    
    public final void a() {
        this.a.setVisibility(8);
        final ImageView b = this.b;
        if (b != null) {
            b.setVisibility(8);
        }
        final TextView c = this.c;
        if (c != null) {
            c.setVisibility(8);
        }
    }
    
    public final void b(final aidi d) {
        this.d = d;
        this.d();
        this.k.Y((Object)this.d, this.a);
    }
    
    public final void c() {
        if (!this.e()) {
            final aidi d = this.d;
            if (d != null) {
                final ahaz builder = ((ahbh)d).toBuilder();
                final boolean e = this.d.e;
                builder.copyOnWrite();
                final aidi aidi = (aidi)builder.instance;
                aidi.b |= 0x8;
                aidi.e = (e ^ true);
                final aidi d2 = (aidi)builder.build();
                this.d = d2;
                final fvq e2 = this.e;
                if (e2 != null) {
                    e2.a(d2.e);
                }
                this.d();
            }
        }
    }
    
    public final void d() {
        if (!this.e()) {
            final TextView c = this.c;
            final Drawable drawable = null;
            if (c != null) {
                final aidi d = this.d;
                if (d != null) {
                    Spanned spanned;
                    if (d.e) {
                        ajut ajut;
                        if ((d.b & 0x2000) != 0x0) {
                            if ((ajut = d.n) == null) {
                                ajut = ajut.a;
                            }
                        }
                        else {
                            ajut = null;
                        }
                        spanned = acak.b(ajut);
                    }
                    else {
                        ajut ajut2;
                        if ((d.b & 0x40) != 0x0) {
                            if ((ajut2 = d.h) == null) {
                                ajut2 = ajut.a;
                            }
                        }
                        else {
                            ajut2 = null;
                        }
                        spanned = acak.b(ajut2);
                    }
                    tpe.t(this.c, (CharSequence)spanned);
                }
            }
            final aidi d2 = this.d;
            if (d2 != null) {
                final int n = g(d2) - 1;
                if (n != 12) {
                    if (n != 13) {
                        if (n == 15) {
                            this.c.setTextColor(tpe.cr(this.a.getContext(), 2130970884));
                        }
                    }
                    else {
                        this.c.setTextColor(tpe.cr(this.a.getContext(), 2130970926));
                    }
                }
                else {
                    this.c.setTextColor(tpe.cr(this.a.getContext(), 2130970852));
                }
            }
            final ImageView b = this.b;
            if (b != null) {
                final aidi d3 = this.d;
                if (d3 != null) {
                    final boolean e = d3.e;
                    boolean b2 = true;
                    Label_0295: {
                        if (e) {
                            if ((d3.b & 0x1000) != 0x0) {
                                break Label_0295;
                            }
                        }
                        else if ((d3.b & 0x20) != 0x0) {
                            break Label_0295;
                        }
                        b2 = false;
                    }
                    if (!b2) {
                        b.setVisibility(8);
                    }
                    else {
                        akdi akdi;
                        if (e) {
                            if ((akdi = d3.m) == null) {
                                akdi = akdi.a;
                            }
                        }
                        else if ((akdi = d3.g) == null) {
                            akdi = akdi.a;
                        }
                        final ImageView b3 = this.b;
                        final acpk g = this.g;
                        akdh akdh;
                        if ((akdh = akdh.b(akdi.c)) == null) {
                            akdh = akdh.a;
                        }
                        b3.setImageResource(g.a(akdh));
                        String contentDescription;
                        if (e) {
                            contentDescription = d3.o;
                        }
                        else {
                            contentDescription = d3.i;
                        }
                        this.b.setContentDescription((CharSequence)contentDescription);
                        if (this.c != null) {
                            final ImageView b4 = this.b;
                            final Drawable drawable2 = b4.getDrawable();
                            tqb.e(drawable2, this.c.getCurrentTextColor(), PorterDuff$Mode.SRC_IN);
                            b4.setImageDrawable(drawable2);
                        }
                        this.b.setVisibility(0);
                    }
                }
            }
            final aidi d4 = this.d;
            if (d4 != null) {
                final int n2 = g(d4) - 1;
                Object o;
                if (n2 != 12) {
                    if (n2 != 13) {
                        if (n2 != 15) {
                            o = drawable;
                        }
                        else {
                            o = this.f(tpe.cr(this.a.getContext(), 2130970878), 0);
                        }
                    }
                    else {
                        o = this.f(0, tpe.cr(this.a.getContext(), 2130970926));
                    }
                }
                else {
                    o = this.f(0, tpe.cr(this.a.getContext(), 2130970852));
                }
                if (o != null) {
                    tpe.s(this.a, (Drawable)o, 0);
                }
            }
            this.a.setVisibility(0);
            return;
        }
        this.a();
    }
    
    public final boolean e() {
        final aidi d = this.d;
        return d == null || d.f;
    }
    
    public final void onClick(final View view) {
        final aidi d = this.d;
        if (d == null) {
            return;
        }
        aiqj aiqj;
        if (d.e) {
            if ((aiqj = d.p) == null) {
                aiqj = aiqj.a;
            }
        }
        else if ((aiqj = d.k) == null) {
            aiqj = aiqj.a;
        }
        this.f.c(aiqj, wyx.g((Object)this.d));
        if (this.h.o()) {
            this.c();
        }
    }
}
