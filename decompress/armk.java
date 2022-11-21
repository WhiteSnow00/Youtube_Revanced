import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class armk extends agpm
{
    public final int as() {
        final int b = this.b(10);
        if (b != 0) {
            return this.d(b);
        }
        return 0;
    }
    
    public final ByteBuffer at() {
        return this.i(14);
    }
    
    public final ByteBuffer au() {
        return this.i(10);
    }
    
    public final boolean av() {
        final int b = this.b(16);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
    
    public final agpm aw() {
        final agpm agpm = new agpm();
        final int b = this.b(12);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm ax() {
        final agpm agpm = new agpm();
        final int b = this.b(8);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
}
