// 
// Decompiled by Procyon v0.6.0
// 

public final class armm extends agpm
{
    public final agpm aA() {
        final agpm agpm = new agpm();
        final int b = this.b(10);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm aB() {
        final agpm agpm = new agpm();
        final int b = this.b(12);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm aC() {
        final agpm agpm = new agpm();
        final int b = this.b(8);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm aD() {
        final agpm agpm = new agpm();
        final int b = this.b(24);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
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
    
    public final armc ax() {
        final armc armc = new armc();
        final int b = this.b(6);
        if (b != 0) {
            armc.f(this.a(b + this.a), this.b);
            return armc;
        }
        return null;
    }
    
    public final armc ay() {
        final armc armc = new armc();
        final int b = this.b(4);
        if (b != 0) {
            armc.f(this.a(b + this.a), this.b);
            return armc;
        }
        return null;
    }
    
    public final boolean az() {
        final int b = this.b(14);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
}
