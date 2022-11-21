import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adsc
{
    public int a;
    private String b;
    private Duration c;
    private double d;
    private byte e;
    
    public final adsd a() {
        if (this.e == 1) {
            final String b = this.b;
            if (b != null) {
                final Duration c = this.c;
                if (c != null) {
                    final int a = this.a;
                    if (a != 0) {
                        return new adsd(b, c, this.d, a);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" mediaId");
        }
        if (this.c == null) {
            sb.append(" mediaPlayoutPosition");
        }
        if (this.e == 0) {
            sb.append(" mediaPlayoutRate");
        }
        if (this.a == 0) {
            sb.append(" playbackState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final String b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null mediaId");
    }
    
    public final void c(final Duration c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null mediaPlayoutPosition");
    }
    
    public final void d(final double d) {
        this.d = d;
        this.e = 1;
    }
}
