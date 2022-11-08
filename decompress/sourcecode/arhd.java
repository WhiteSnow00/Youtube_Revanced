// 
// Decompiled by Procyon v0.6.0
// 

public final class arhd extends aglt
{
    public final aglt aA() {
        final aglt aglt = new aglt();
        final int b = this.b(10);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
    
    public final aglt aB() {
        final aglt aglt = new aglt();
        final int b = this.b(12);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
    
    public final aglt aC() {
        final aglt aglt = new aglt();
        final int b = this.b(8);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
    
    public final aglt aD() {
        final aglt aglt = new aglt();
        final int b = this.b(24);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
    
    public final int as() {
        final int b = this.b(22);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int at() {
        final int b = this.b(16);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int au() {
        final int b = this.b(20);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int av() {
        final int b = this.b(18);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final long aw() {
        final int b = this.b(26);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public final argt ax() {
        final argt argt = new argt();
        final int b = this.b(6);
        if (b != 0) {
            argt.f(this.a(b + this.a), this.b);
            return argt;
        }
        return null;
    }
    
    public final argt ay() {
        final argt argt = new argt();
        final int b = this.b(4);
        if (b != 0) {
            argt.f(this.a(b + this.a), this.b);
            return argt;
        }
        return null;
    }
    
    public final boolean az() {
        final int b = this.b(14);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
}
