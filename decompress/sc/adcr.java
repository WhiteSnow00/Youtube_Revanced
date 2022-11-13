import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adcr implements acjb
{
    public final String a;
    public final aixi b;
    public final aixk c;
    public final aixl d;
    
    public adcr(final String a, final aixi b, final aixk c, final aixl d) {
        this.b = b;
        this.c = c;
        this.d = d;
        if (!TextUtils.isEmpty((CharSequence)a)) {
            this.a = a;
            return;
        }
        this.a = this.b();
    }
    
    final long a() {
        final aixi b = this.b;
        if (b != null) {
            return b.f;
        }
        final aixk c = this.c;
        if (c != null) {
            return c.e;
        }
        final aixl d = this.d;
        if (d != null) {
            return d.e;
        }
        return 0L;
    }
    
    public final String b() {
        if (!TextUtils.isEmpty((CharSequence)this.a)) {
            return this.a;
        }
        final aixi b = this.b;
        if (b != null) {
            if ((b.b & 0x200) != 0x0) {
                return b.h;
            }
            return null;
        }
        else {
            final aixk c = this.c;
            if (c != null) {
                return c.g;
            }
            final aixl d = this.d;
            if (d != null && (d.b & 0x1000) != 0x0) {
                return d.g;
            }
            return null;
        }
    }
    
    public final acjb e(final acjb acjb) {
        final adcr adcr = (adcr)acjb;
        if (adcr.a() < this.a()) {
            return (acjb)this;
        }
        if (adcr.a() > this.a()) {
            return (acjb)adcr;
        }
        return (acjb)new adcr(this.a, this.b, this.c, this.d);
    }
}
