import android.content.Context;
import android.text.TextUtils;
import android.graphics.PorterDuff$Mode;
import android.view.ViewGroup$LayoutParams;
import java.util.Map;
import android.view.View$OnLayoutChangeListener;
import android.graphics.drawable.GradientDrawable;
import android.view.View$OnTouchListener;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public class acuk extends acuj
{
    public final TextView f;
    public final boolean g;
    public boolean h;
    public boolean i;
    public int j;
    private final acqv k;
    private int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private int r;
    private boolean s;
    private int t;
    private final vbs u;
    
    public acuk(final veh veh, final acqv k, final aefs aefs, final vbo vbo, final vbs u, final TextView f, final byte[] array, final byte[] array2, final byte[] array3) {
        super(veh, aefs, (View)f, (vbs)null, (byte[])null, (byte[])null, (byte[])null);
        this.k = k;
        this.f = f;
        if (f.getLayoutParams() != null) {
            this.l = f.getLayoutParams().height;
        }
        this.m = f.getGravity();
        this.n = f.getPaddingTop();
        this.o = f.getPaddingStart();
        this.p = f.getResources().getDimensionPixelSize(2131165567);
        this.q = f.getResources().getDimensionPixelSize(2131165568);
        this.u = u;
        final airq b = vbo.b();
        boolean g = false;
        Label_0155: {
            if (b != null && (b.b & 0x10) != 0x0) {
                alzp alzp;
                if ((alzp = b.e) == null) {
                    alzp = alzp.a;
                }
                if (alzp.as) {
                    g = true;
                    break Label_0155;
                }
            }
            g = false;
        }
        this.g = g;
        this.j = 0;
        this.r = -1;
        this.t = -1;
        this.s = false;
    }
    
    public static void c(final TextView textView, final Drawable drawable, final boolean b) {
        if (b) {
            if (drawable != null) {
                tqf.d((View)textView, drawable);
            }
            textView.setOnTouchListener((View$OnTouchListener)acwo.c());
            return;
        }
        final int orElse = tqf.cx(textView.getContext(), 2130970944).orElse(0);
        Drawable background;
        if ((background = drawable) == null) {
            background = textView.getBackground();
        }
        acwo.e((View)textView, orElse, 0, background);
    }
    
    private final int i(final int n) {
        return ahw.a(this.f.getResources(), n, this.f.getContext().getTheme());
    }
    
    private final int j(final int n, final int n2) {
        return tqf.cx(this.f.getContext(), n).orElse(this.i(n2));
    }
    
    private final Drawable k(final int n, final boolean b) {
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.i(n));
        gradientDrawable.setShape(0);
        if (this.u.aS() && b) {
            final float n2 = (float)this.f.getHeight();
            if (n2 > 0.0f) {
                gradientDrawable.setCornerRadius(n2 / 2.0f);
            }
            this.f.addOnLayoutChangeListener(q(gradientDrawable));
        }
        return (Drawable)gradientDrawable;
    }
    
    private final Drawable l(final int n) {
        return fc.b(this.f.getContext(), n);
    }
    
    private final GradientDrawable m(final int n) {
        return this.n(n, true);
    }
    
    private final GradientDrawable n(final int color, final boolean b) {
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setShape(0);
        if (b) {
            float cornerRadius;
            float n = cornerRadius = (float)this.p;
            if (this.u.aS()) {
                final float n2 = (float)this.f.getHeight();
                if (n2 > 0.0f) {
                    n = n2 / 2.0f;
                }
                this.f.addOnLayoutChangeListener(q(gradientDrawable));
                cornerRadius = n;
            }
            gradientDrawable.setCornerRadius(cornerRadius);
        }
        return gradientDrawable;
    }
    
    private final GradientDrawable o(final int n, final int n2) {
        final GradientDrawable m = this.m(n);
        m.setStroke(this.q, n2);
        return m;
    }
    
    private final GradientDrawable p(final int n, final boolean b) {
        return this.n(tqf.cx(this.f.getContext(), n).orElse(0), b);
    }
    
    private static View$OnLayoutChangeListener q(final GradientDrawable gradientDrawable) {
        return (View$OnLayoutChangeListener)new zgy(gradientDrawable, 4);
    }
    
    private final void r(final aies aies, final Drawable drawable, final boolean b) {
        int w;
        if ((w = aegu.W(aies.v)) == 0) {
            w = 1;
        }
        if (b) {
            if (--w != 0 && w != 1) {
                this.f.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)null, (Drawable)null, drawable, (Drawable)null);
                return;
            }
            this.f.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable)null, (Drawable)null, (Drawable)null);
        }
        else {
            if (--w != 0 && w != 1) {
                this.f.setCompoundDrawablesRelative((Drawable)null, (Drawable)null, drawable, (Drawable)null);
                return;
            }
            this.f.setCompoundDrawablesRelative(drawable, (Drawable)null, (Drawable)null, (Drawable)null);
        }
    }
    
    public void a(final aies aies, final xab xab, final Map map) {
        super.a(aies, xab, map);
        final int n = 0;
        if (aies == null) {
            this.f.setText((CharSequence)null);
            this.f.setContentDescription((CharSequence)null);
            if (this.k != null) {
                this.f.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                this.f.setCompoundDrawablePadding(0);
            }
        }
        else {
            if (this.u.aR()) {
                this.f.setAllCaps(false);
            }
            ajws ajws;
            if ((aies.b & 0x200) != 0x0) {
                if ((ajws = aies.i) == null) {
                    ajws = ajws.a;
                }
            }
            else {
                ajws = null;
            }
            this.f.setText((CharSequence)acbu.b(ajws));
            ahkc ahkc;
            if ((ahkc = aies.t) == null) {
                ahkc = ahkc.a;
            }
            if ((ahkc.b & 0x1) != 0x0) {
                final TextView f = this.f;
                ahkc ahkc2;
                if ((ahkc2 = aies.t) == null) {
                    ahkc2 = ahkc.a;
                }
                ahkb ahkb;
                if ((ahkb = ahkc2.c) == null) {
                    ahkb = ahkb.a;
                }
                f.setContentDescription((CharSequence)ahkb.c);
            }
            else {
                this.f.setContentDescription((CharSequence)null);
            }
            int x;
            if ((x = aegu.X(aies.f)) == 0) {
                x = 1;
            }
            if (--x != 1 && x != 2) {
                final TextView f2 = this.f;
                final int o = this.o;
                final int n2 = this.n;
                f2.setPadding(o, n2, o, n2);
                this.f.setGravity(this.m);
            }
            else {
                final TextView f3 = this.f;
                final int o2 = this.o;
                f3.setPadding(o2, 0, o2, 0);
                this.f.setGravity(16);
            }
            int x2;
            if ((x2 = aegu.X(aies.f)) == 0) {
                x2 = 1;
            }
            afbh afbh;
            if (--x2 != 1) {
                if (x2 != 2) {
                    afbh = afag.a;
                }
                else {
                    afbh = afbh.k(32);
                }
            }
            else {
                afbh = afbh.k(36);
            }
            final int intValue = (int)afbh.b((afax)new ablz(this, 11)).e(this.l);
            if (intValue != 0) {
                tqf.aF((View)this.f, tqf.at(intValue), (Class)ViewGroup$LayoutParams.class);
            }
            aier a;
            if (aies.c == 17) {
                a = (aier)aies.d;
            }
            else {
                a = aier.a;
            }
            final int b = a.b;
            final int n3 = 2130970863;
            final int n4 = 2130970922;
            if (b == 118483990) {
                final TextView f4 = this.f;
                aier a2;
                if (aies.c == 17) {
                    a2 = (aier)aies.d;
                }
                else {
                    a2 = aier.a;
                }
                aicx a3;
                if (a2.b == 118483990) {
                    a3 = (aicx)a2.c;
                }
                else {
                    a3 = aicx.a;
                }
                f4.setTextColor(a3.d);
            }
            else {
                aout a4;
                if (aies.c == 20) {
                    a4 = (aout)aies.d;
                }
                else {
                    a4 = aout.a;
                }
                if ((a4.b & 0x1) != 0x0) {
                    final TextView f5 = this.f;
                    final Context context = f5.getContext();
                    aout a5;
                    if (aies.c == 20) {
                        a5 = (aout)aies.d;
                    }
                    else {
                        a5 = aout.a;
                    }
                    aouq aouq;
                    if ((aouq = aouq.b(a5.c)) == null) {
                        aouq = aouq.a;
                    }
                    f5.setTextColor(acww.a(context, aouq, 0));
                }
                else {
                    int textColor = 0;
                    boolean b2 = false;
                    Label_1293: {
                        Label_1290: {
                            if (aies.h) {
                                int u;
                                if (aies.c != 1 || (u = aegu.U((int)aies.d)) == 0) {
                                    u = 1;
                                }
                                if (--u != 35 && u != 42) {
                                    switch (u) {
                                        default: {
                                            textColor = this.j(2130970920, 2131102380);
                                            break;
                                        }
                                        case 21:
                                        case 22: {
                                            textColor = this.i(2131102382);
                                            break;
                                        }
                                        case 20: {
                                            textColor = this.j(2130970863, 2131102378);
                                            break;
                                        }
                                    }
                                }
                                else {
                                    textColor = this.j(2130970922, 2131102356);
                                    this.h();
                                }
                            }
                            else {
                                int u2;
                                if (aies.c != 1 || (u2 = aegu.U((int)aies.d)) == 0) {
                                    u2 = 1;
                                }
                                Label_1278: {
                                    if (--u2 != 1) {
                                        Label_1275: {
                                            Label_1170: {
                                                if (u2 != 2) {
                                                    Label_1085: {
                                                        if (u2 != 3) {
                                                            if (u2 == 6) {
                                                                break Label_1170;
                                                            }
                                                            if (u2 == 7) {
                                                                break Label_1278;
                                                            }
                                                            if (u2 == 28) {
                                                                textColor = tqf.cx(this.f.getContext(), 2130970922).orElse(0);
                                                                break Label_1290;
                                                            }
                                                            if (u2 != 30) {
                                                                Label_1192: {
                                                                    if (u2 != 34) {
                                                                        Label_1173: {
                                                                            if (u2 != 35) {
                                                                                switch (u2) {
                                                                                    default: {
                                                                                        Label_1167: {
                                                                                            switch (u2) {
                                                                                                default: {
                                                                                                    switch (u2) {
                                                                                                        default: {
                                                                                                            switch (u2) {
                                                                                                                default: {
                                                                                                                    textColor = 0;
                                                                                                                    b2 = false;
                                                                                                                    break Label_1293;
                                                                                                                }
                                                                                                                case 44: {
                                                                                                                    textColor = tqf.cr(this.f.getContext(), 2130970922);
                                                                                                                    break Label_1290;
                                                                                                                }
                                                                                                                case 41: {
                                                                                                                    textColor = this.j(2130970900, 2131102361);
                                                                                                                    this.h();
                                                                                                                    break Label_1290;
                                                                                                                }
                                                                                                                case 40: {
                                                                                                                    textColor = this.j(2130970882, 2131102417);
                                                                                                                    this.h();
                                                                                                                    break Label_1167;
                                                                                                                }
                                                                                                                case 42: {
                                                                                                                    break Label_1173;
                                                                                                                }
                                                                                                                case 39:
                                                                                                                case 43: {
                                                                                                                    break Label_1192;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        case 21:
                                                                                                        case 22: {
                                                                                                            break Label_1085;
                                                                                                        }
                                                                                                        case 20: {
                                                                                                            textColor = this.j(2130970850, 2131102374);
                                                                                                            break Label_1167;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                case 15: {
                                                                                                    break Label_1085;
                                                                                                }
                                                                                                case 17: {
                                                                                                    textColor = tqf.cr(this.f.getContext(), 2130970900);
                                                                                                    break;
                                                                                                }
                                                                                                case 16: {
                                                                                                    textColor = this.j(2130970847, 2131102395);
                                                                                                    break;
                                                                                                }
                                                                                                case 14: {
                                                                                                    textColor = this.j(2130970901, 2131102430);
                                                                                                    break;
                                                                                                }
                                                                                                case 13: {
                                                                                                    textColor = this.j(2130970850, 2131102374);
                                                                                                    this.h();
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break Label_1290;
                                                                                    }
                                                                                    case 9: {
                                                                                        break Label_1085;
                                                                                    }
                                                                                    case 10:
                                                                                    case 11: {
                                                                                        break Label_1170;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        textColor = this.j(2130970923, 2131102417);
                                                                        this.h();
                                                                        break Label_1290;
                                                                    }
                                                                }
                                                                textColor = this.j(2130970922, 2131102380);
                                                                this.h();
                                                                break Label_1290;
                                                            }
                                                            textColor = tqf.cr(this.f.getContext(), 2130970882);
                                                            break Label_1290;
                                                        }
                                                    }
                                                    textColor = this.i(2131102417);
                                                    break Label_1275;
                                                }
                                            }
                                            textColor = this.j(2130970923, 2131102417);
                                        }
                                        break Label_1290;
                                    }
                                }
                                textColor = this.j(2130970924, 2131102383);
                            }
                        }
                        b2 = true;
                    }
                    if (b2) {
                        this.f.setTextColor(textColor);
                    }
                }
            }
            if (!this.i) {
                this.h = false;
                boolean b3 = false;
                Label_1373: {
                    if (((ahcu)aies).ry((ahci)aieq.b)) {
                        final int v = aegu.V(((aieq)((ahcu)aies).rx((ahci)aieq.b)).d);
                        if (v != 0) {
                            if (v != 1) {
                                b3 = false;
                                break Label_1373;
                            }
                        }
                    }
                    b3 = true;
                }
                final int c = aies.c;
                aier a6;
                if (c == 17) {
                    a6 = (aier)aies.d;
                }
                else {
                    a6 = aier.a;
                }
                if (a6.b == 118483990) {
                    aier a7;
                    if (c == 17) {
                        a7 = (aier)aies.d;
                    }
                    else {
                        a7 = aier.a;
                    }
                    aicx a8;
                    if (a7.b == 118483990) {
                        a8 = (aicx)a7.c;
                    }
                    else {
                        a8 = aicx.a;
                    }
                    final GradientDrawable n5 = this.n(a8.c, b3);
                    if (this.g) {
                        final TextView f6 = this.f;
                        aier a9;
                        if (aies.c == 17) {
                            a9 = (aier)aies.d;
                        }
                        else {
                            a9 = aier.a;
                        }
                        aicx a10;
                        if (a9.b == 118483990) {
                            a10 = (aicx)a9.c;
                        }
                        else {
                            a10 = aicx.a;
                        }
                        c(f6, (Drawable)n5, a10.c != 0);
                    }
                    else {
                        tqf.s((View)this.f, (Drawable)n5, this.j);
                    }
                }
                else {
                    final boolean h = aies.h;
                    int u3;
                    if (c != 1 || (u3 = aegu.U((int)aies.d)) == 0) {
                        u3 = 1;
                    }
                    final int n6 = u3 - 1;
                    Object o3 = null;
                    boolean b4 = false;
                Label_2454:
                    while (true) {
                        Label_2419: {
                            if (n6 == 1) {
                                break Label_2419;
                            }
                            int n7 = 2131102363;
                            Label_2286: {
                                if (n6 != 2) {
                                    Label_2225: {
                                        if (n6 != 3) {
                                            if (n6 != 6) {
                                                Label_2189: {
                                                    if (n6 != 7 && n6 != 28) {
                                                        if (n6 != 30) {
                                                            Label_2081: {
                                                                if (n6 != 34) {
                                                                    if (n6 == 35) {
                                                                        o3 = this.p(2130970922, b3);
                                                                        break Label_1911;
                                                                    }
                                                                    switch (n6) {
                                                                        default: {
                                                                            switch (n6) {
                                                                                default: {
                                                                                    switch (n6) {
                                                                                        default: {
                                                                                            switch (n6) {
                                                                                                default: {
                                                                                                    o3 = null;
                                                                                                    break Label_1911;
                                                                                                }
                                                                                                case 42: {
                                                                                                    if (h) {
                                                                                                        o3 = this.p(2130970863, b3);
                                                                                                        break Label_1911;
                                                                                                    }
                                                                                                    o3 = this.p(2130970922, b3);
                                                                                                    break Label_1911;
                                                                                                }
                                                                                                case 41: {
                                                                                                    o3 = this.m(this.j(2130970882, 2131102417));
                                                                                                    break Label_1911;
                                                                                                }
                                                                                                case 40: {
                                                                                                    o3 = this.m(this.j(2130970877, 2131102418));
                                                                                                    break Label_1911;
                                                                                                }
                                                                                                case 39: {
                                                                                                    o3 = this.p(2130970836, b3);
                                                                                                    break Label_1911;
                                                                                                }
                                                                                                case 43: {
                                                                                                    break Label_2081;
                                                                                                }
                                                                                                case 44: {
                                                                                                    break Label_2189;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        case 22: {
                                                                                            o3 = this.p(2130970900, b3);
                                                                                            break Label_1911;
                                                                                        }
                                                                                        case 21: {
                                                                                            if (b3) {
                                                                                                int n8;
                                                                                                if (!h) {
                                                                                                    n8 = 2131231072;
                                                                                                }
                                                                                                else {
                                                                                                    n8 = 2131231276;
                                                                                                }
                                                                                                o3 = this.l(n8);
                                                                                                break Label_1911;
                                                                                            }
                                                                                            o3 = this.k(2131102418, false);
                                                                                            break Label_1911;
                                                                                        }
                                                                                        case 20: {
                                                                                            if (b3) {
                                                                                                int n10;
                                                                                                if (h) {
                                                                                                    int n9;
                                                                                                    if (!this.u.aS()) {
                                                                                                        n9 = n3;
                                                                                                    }
                                                                                                    else {
                                                                                                        n9 = 2130970836;
                                                                                                    }
                                                                                                    n10 = this.j(n9, 2131102378);
                                                                                                }
                                                                                                else {
                                                                                                    int n11;
                                                                                                    if (!this.u.aS()) {
                                                                                                        n11 = 2130970850;
                                                                                                    }
                                                                                                    else {
                                                                                                        n11 = 2130970867;
                                                                                                    }
                                                                                                    n10 = this.j(n11, 2131102374);
                                                                                                }
                                                                                                o3 = this.o(0, n10);
                                                                                                break Label_1911;
                                                                                            }
                                                                                            o3 = this.k(2131102398, false);
                                                                                            break Label_1911;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 13:
                                                                                case 15:
                                                                                case 16:
                                                                                case 17: {
                                                                                    break Label_2189;
                                                                                }
                                                                                case 14: {
                                                                                    break Label_2419;
                                                                                }
                                                                            }
                                                                            break;
                                                                        }
                                                                        case 9: {
                                                                            break Label_2225;
                                                                        }
                                                                        case 10:
                                                                        case 11: {
                                                                            break Label_2286;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (b3) {
                                                                int n12;
                                                                if (!this.u.aS()) {
                                                                    n12 = n4;
                                                                }
                                                                else {
                                                                    n12 = 2130970867;
                                                                }
                                                                o3 = this.o(0, this.j(n12, 2131102356));
                                                                break Label_1911;
                                                            }
                                                            o3 = this.k(17170445, false);
                                                            break Label_1911;
                                                        }
                                                        else {
                                                            if (b3 && !this.u.aS()) {
                                                                o3 = this.o(tqf.cr(this.f.getContext(), 2130970876), 0);
                                                                break Label_1911;
                                                            }
                                                            o3 = this.p(2130970876, b3);
                                                            break Label_1911;
                                                        }
                                                    }
                                                }
                                                this.h = true;
                                                if (b3) {
                                                    o3 = this.l(2131231068);
                                                }
                                                else {
                                                    o3 = this.k(17170445, false);
                                                }
                                                b4 = false;
                                                break Label_2454;
                                            }
                                            break Label_2286;
                                        }
                                    }
                                    if (!b3) {
                                        if (!h) {
                                            n7 = 2131102430;
                                        }
                                        o3 = this.k(n7, false);
                                        break Label_1911;
                                    }
                                    if (h) {
                                        o3 = this.m(this.j(2130970863, 2131102378));
                                        break Label_1911;
                                    }
                                    o3 = this.l(2131231067);
                                    break Label_1911;
                                }
                            }
                            if (b3) {
                                if (h) {
                                    o3 = this.k(2131102363, true);
                                }
                                else {
                                    o3 = this.m(this.j(2130970850, 2131102374));
                                }
                            }
                            else if (h) {
                                o3 = this.k(2131102363, false);
                            }
                            else {
                                o3 = new GradientDrawable();
                                ((GradientDrawable)o3).setColor(this.j(2130970850, 2131102374));
                                ((GradientDrawable)o3).setShape(0);
                                if (this.u.aS()) {
                                    final float n13 = (float)this.f.getHeight();
                                    if (n13 > 0.0f) {
                                        ((GradientDrawable)o3).setCornerRadius(n13 / 2.0f);
                                    }
                                    this.f.addOnLayoutChangeListener(q((GradientDrawable)o3));
                                }
                            }
                            b4 = true;
                            break Label_2454;
                        }
                        if (b3) {
                            o3 = this.m(this.j(2130970843, 2131102417));
                            continue;
                        }
                        o3 = this.k(2131102417, false);
                        continue;
                    }
                    if (this.g) {
                        c(this.f, (Drawable)o3, b4);
                    }
                    else {
                        final TextView f7 = this.f;
                        Drawable background;
                        if ((background = (Drawable)o3) == null) {
                            background = f7.getBackground();
                        }
                        tqf.s((View)f7, background, this.j);
                    }
                }
            }
            if (this.k != null) {
                akfi akfi;
                if ((aies.b & 0x20) != 0x0) {
                    akfj akfj;
                    if ((akfj = aies.g) == null) {
                        akfj = akfj.a;
                    }
                    if ((akfi = akfi.b(akfj.c)) == null) {
                        akfi = akfi.a;
                    }
                }
                else {
                    akfi = akfi.a;
                }
                final int a11 = this.k.a(akfi);
                if (a11 != 0) {
                    final Drawable b5 = fc.b(this.f.getContext(), a11);
                    aout a12;
                    if (aies.c == 20) {
                        a12 = (aout)aies.d;
                    }
                    else {
                        a12 = aout.a;
                    }
                    Integer n14;
                    if ((0x2 & a12.b) != 0x0) {
                        final Context context2 = this.f.getContext();
                        aout a13;
                        if (aies.c == 20) {
                            a13 = (aout)aies.d;
                        }
                        else {
                            a13 = aout.a;
                        }
                        aouq aouq2;
                        if ((aouq2 = aouq.b(a13.d)) == null) {
                            aouq2 = aouq.a;
                        }
                        n14 = acww.a(context2, aouq2, 0);
                    }
                    else if (this.s) {
                        n14 = this.f.getCurrentTextColor();
                    }
                    else {
                        n14 = null;
                    }
                    Drawable mutate = b5;
                    if (n14 != null) {
                        mutate = b5.mutate();
                        trc.e(mutate, (int)n14, PorterDuff$Mode.SRC_IN);
                    }
                    final int t = this.t;
                    if (t != -1) {
                        mutate.setBounds(0, 0, t, t);
                        this.r(aies, mutate, false);
                    }
                    else {
                        this.r(aies, mutate, true);
                    }
                }
                else {
                    this.f.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                }
                if (this.r != -1) {
                    final TextView f8 = this.f;
                    int r = n;
                    if (!TextUtils.isEmpty(f8.getText())) {
                        r = n;
                        if (akfi != akfi.a) {
                            r = this.r;
                        }
                    }
                    f8.setCompoundDrawablePadding(r);
                }
            }
        }
        if (this.u.f(45381771L)) {
            c(this.f, this.k(17170456, true), true);
        }
    }
    
    public final void d(final boolean b) {
        final aies b2 = super.b;
        if (b2 != null) {
            final ahct ahct = (ahct)((ahcz)b2).toBuilder();
            ((ahcr)ahct).copyOnWrite();
            final aies aies = (aies)ahct.instance;
            aies.b |= 0x40;
            aies.h = (b ^ true);
            super.b = (aies)((ahcr)ahct).build();
            super.a.setEnabled(b);
            super.a.setClickable(b);
        }
        final TextView f = this.f;
        float alpha;
        if (!b) {
            alpha = 0.5f;
        }
        else {
            alpha = 1.0f;
        }
        f.setAlpha(alpha);
    }
    
    public final void e(final int n) {
        this.r = this.f.getResources().getDimensionPixelOffset(n);
    }
    
    public final void f(final int t) {
        if (t >= 0) {
            this.t = t;
            return;
        }
        throw new IllegalArgumentException("Icon size cannot be negative.");
    }
    
    public final void g() {
        this.j = 1;
    }
    
    public final void h() {
        this.s = true;
    }
}
