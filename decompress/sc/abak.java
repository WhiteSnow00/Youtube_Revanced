// 
// Decompiled by Procyon v0.6.0
// 

public final class abak
{
    private long a;
    private long b;
    private long c;
    private CharSequence d;
    private akdh e;
    private byte f;
    
    public final abal a() {
        if (this.f == 7) {
            final CharSequence d = this.d;
            if (d != null) {
                final akdh e = this.e;
                if (e != null) {
                    return new abal(this.a, this.b, this.c, d, e);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if ((this.f & 0x1) == 0x0) {
            sb.append(" decorationVisibilityStartMillis");
        }
        if ((this.f & 0x2) == 0x0) {
            sb.append(" decorationVisibilityEndMillis");
        }
        if ((this.f & 0x4) == 0x0) {
            sb.append(" decorationTimeMillis");
        }
        if (this.d == null) {
            sb.append(" label");
        }
        if (this.e == null) {
            sb.append(" icon");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final long c) {
        this.c = c;
        this.f |= 0x4;
    }
    
    public final void c(final long b) {
        this.b = b;
        this.f |= 0x2;
    }
    
    public final void d(final long a) {
        this.a = a;
        this.f |= 0x1;
    }
    
    public final void e(final akdh e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null icon");
    }
    
    public final void f(final CharSequence d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null label");
    }
}
