// 
// Decompiled by Procyon v0.6.0
// 

public final class armh extends agpm
{
    public final int as() {
        final int b = this.b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int at() {
        final int b = this.b(4);
        if (b != 0) {
            return this.d(b);
        }
        return 0;
    }
    
    public final int au() {
        final int b = this.b(28);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int av() {
        final int b = this.b(26);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final agpm aw() {
        final agpm agpm = new agpm();
        final int b = this.b(36);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
}
