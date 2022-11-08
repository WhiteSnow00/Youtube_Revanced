import android.content.res.Resources$NotFoundException;
import android.content.res.TypedArray;
import android.content.Context;
import android.graphics.Typeface;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advw
{
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final ColorStateList i;
    public final float j;
    public Typeface k;
    private final int l;
    private boolean m;
    
    public advw(final Context context, final int n) {
        this.m = false;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, advu.b);
        this.j = obtainStyledAttributes.getDimension(0, 0.0f);
        this.i = adwd.f(context, obtainStyledAttributes, 3);
        adwd.f(context, obtainStyledAttributes, 4);
        adwd.f(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int n2 = 12;
        if (!obtainStyledAttributes.hasValue(12)) {
            n2 = 10;
        }
        this.l = obtainStyledAttributes.getResourceId(n2, 0);
        this.b = obtainStyledAttributes.getString(n2);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = adwd.f(context, obtainStyledAttributes, 6);
        this.e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(n, advu.a);
        obtainStyledAttributes2.hasValue(0);
        this.h = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }
    
    private final void e() {
        if (this.k == null) {
            final String b = this.b;
            if (b != null) {
                this.k = Typeface.create(b, this.c);
            }
        }
        if (this.k == null) {
            final int d = this.d;
            Label_0088: {
                Typeface k;
                if (d != 1) {
                    if (d != 2) {
                        if (d != 3) {
                            this.k = Typeface.DEFAULT;
                            break Label_0088;
                        }
                        k = Typeface.MONOSPACE;
                    }
                    else {
                        k = Typeface.SERIF;
                    }
                }
                else {
                    k = Typeface.SANS_SERIF;
                }
                this.k = k;
            }
            this.k = Typeface.create(this.k, this.c);
        }
    }
    
    public final Typeface a() {
        this.e();
        return this.k;
    }
    
    public final void c(final Context context) {
        if (this.m) {
            return;
        }
        while (true) {
            if (context.isRestricted()) {
                break Label_0045;
            }
            try {
                final Typeface d = ahu.d(context, this.l);
                this.k = d;
                if (d != null) {
                    this.k = Typeface.create(d, this.c);
                }
                this.e();
                this.m = true;
            }
            catch (final UnsupportedOperationException | Resources$NotFoundException | Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public final void d(final Context context, final cgi cgi) {
        final int l = this.l;
        Typeface c;
        if (l != 0) {
            c = ahu.c(context, l);
        }
        else {
            c = null;
        }
        if (c != null) {
            this.c(context);
        }
        else {
            this.e();
        }
        int i;
        if ((i = this.l) == 0) {
            this.m = true;
            i = 0;
        }
        if (!this.m) {
            try {
                ahu.h(context, i, (ahr)new advv(this, cgi, (byte[])null, (byte[])null));
                return;
            }
            catch (final Exception ex) {
                this.m = true;
                cgi.l();
                return;
            }
            catch (final Resources$NotFoundException ex2) {
                this.m = true;
                cgi.l();
                return;
            }
        }
        cgi.k(this.k);
    }
}
