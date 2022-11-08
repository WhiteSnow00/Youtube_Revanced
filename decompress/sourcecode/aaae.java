// 
// Decompiled by Procyon v0.6.0
// 

public final class aaae
{
    public int a;
    public int b;
    public Object c;
    private boolean d;
    private byte e;
    
    public aaae() {
    }
    
    public aaae(final aaaf aaaf) {
        this.a = aaaf.f;
        this.b = aaaf.g;
        this.d = aaaf.d;
        this.c = aaaf.e;
        this.e = 1;
    }
    
    public final aaaf a() {
        final byte e = this.e;
        boolean b = true;
        if (e == 1 && this.a != 0 && this.b != 0 && this.c != null) {
            final aaaf aaaf = new aaaf(this.a, this.b, this.d, (afcr)this.c);
            if (aaaf.f == 1) {
                b = false;
            }
            agot.u(b);
            return aaaf;
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" orchestrationActionResult");
        }
        if (this.b == 0) {
            sb.append(" orchestrationFailureReason");
        }
        if (this.e == 0) {
            sb.append(" retryable");
        }
        if (this.c == null) {
            sb.append(" additionalActions");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final afcr c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null additionalActions");
    }
    
    public final void c(final boolean d) {
        this.d = d;
        this.e = 1;
    }
    
    public final zow d() {
        if (this.e != 7) {
            final StringBuilder sb = new StringBuilder();
            if ((this.e & 0x1) == 0x0) {
                sb.append(" newContent");
            }
            if ((this.e & 0x2) == 0x0) {
                sb.append(" deliveryTimestamp");
            }
            if ((this.e & 0x4) == 0x0) {
                sb.append(" unseenItemCount");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new zow((String)this.c, this.d, this.a, this.b);
    }
    
    public final void e(final int a) {
        this.a = a;
        this.e |= 0x2;
    }
    
    public final void f(final boolean d) {
        this.d = d;
        this.e |= 0x1;
    }
    
    public final void g(final int b) {
        this.b = b;
        this.e |= 0x4;
    }
}
