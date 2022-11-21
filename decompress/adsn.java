import j$.time.Duration;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adsn
{
    public Object a;
    public Object b;
    private boolean c;
    private boolean d;
    private byte e;
    
    public adsn() {
    }
    
    public adsn(final byte[] array) {
        this.b = Optional.empty();
        this.a = Optional.empty();
    }
    
    public final adso a() {
        if (this.e == 3 && this.a != null && this.b != null) {
            return new adso(this.c, (Duration)this.a, (Duration)this.b, this.d);
        }
        final StringBuilder sb = new StringBuilder();
        if ((this.e & 0x1) == 0x0) {
            sb.append(" disableHeartbeating");
        }
        if (this.a == null) {
            sb.append(" heartbeatFrequency");
        }
        if (this.b == null) {
            sb.append(" seekDeterminationThreshold");
        }
        if ((this.e & 0x2) == 0x0) {
            sb.append(" alwaysOverride");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final boolean d) {
        this.d = d;
        this.e |= 0x2;
    }
    
    public final void c(final boolean c) {
        this.c = c;
        this.e |= 0x1;
    }
    
    public final void d(final Duration a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null heartbeatFrequency");
    }
    
    public final void e(final Duration b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null seekDeterminationThreshold");
    }
    
    public final gao f() {
        if (this.e != 3) {
            final StringBuilder sb = new StringBuilder();
            if ((this.e & 0x1) == 0x0) {
                sb.append(" shouldShowPivotBar");
            }
            if ((this.e & 0x2) == 0x0) {
                sb.append(" shouldShowPivotBarBorder");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new gao((Optional)this.b, this.d, this.c, (Optional)this.a);
    }
    
    public final void g(final boolean d) {
        this.d = d;
        this.e |= 0x1;
    }
    
    public final void h(final boolean c) {
        this.c = c;
        this.e |= 0x2;
    }
    
    public final void i(final gap gap) {
        this.a = Optional.of((Object)gap);
    }
    
    public final void j(final gaq gaq) {
        this.b = Optional.of((Object)gaq);
    }
}
