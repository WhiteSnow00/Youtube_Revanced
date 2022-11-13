import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acoa
{
    public TextView a;
    public TextView b;
    public View c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    private int g;
    private int h;
    private int i;
    private byte j;
    
    public acoa() {
    }
    
    public acoa(final acob acob) {
        this.a = acob.a;
        this.b = acob.b;
        this.c = acob.c;
        this.g = acob.d;
        this.d = acob.e;
        this.h = acob.f;
        this.e = acob.g;
        this.i = acob.h;
        this.f = acob.i;
        this.j = 15;
    }
    
    public final acob a() {
        if (this.j != 15) {
            final StringBuilder sb = new StringBuilder();
            if ((this.j & 0x1) == 0x0) {
                sb.append(" fallbackBackgroundColor");
            }
            if ((this.j & 0x2) == 0x0) {
                sb.append(" fallbackTitleColor");
            }
            if ((this.j & 0x4) == 0x0) {
                sb.append(" fallbackBodyColor");
            }
            if ((this.j & 0x8) == 0x0) {
                sb.append(" fallbackLinkColor");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new acob(this.a, this.b, this.c, this.g, this.d, this.h, this.e, this.i, this.f);
    }
    
    public final void b() {
        this.a = null;
        this.f(0);
        this.f = null;
        this.b = null;
        this.e(0);
        this.e = null;
        this.d(0);
        this.f = null;
        this.c = null;
        this.c();
    }
    
    public final void c() {
        this.j |= 0x1;
    }
    
    public final void d(final int i) {
        this.i = i;
        this.j |= 0x8;
    }
    
    public final void e(final int h) {
        this.h = h;
        this.j |= 0x4;
    }
    
    public final void f(final int g) {
        this.g = g;
        this.j |= 0x2;
    }
}
