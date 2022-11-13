// 
// Decompiled by Procyon v0.6.0
// 

public final class fzy
{
    public static final fzy a;
    public static final fzy b;
    public static final fzy c;
    public final int d;
    
    static {
        a = new fzy(0);
        b = new fzy(2);
        c = new fzy(1);
    }
    
    private fzy(final int d) {
        this.d = d;
    }
    
    public final boolean a() {
        return this.d == 1;
    }
    
    @Override
    public final String toString() {
        final int d = this.d;
        if (d == 0) {
            return "ALWAYS_SHOWN";
        }
        if (d != 1) {
            return "HIDE_AFTER_DELAY_THEN_REVEAL_ON_ANY_PULL";
        }
        return "HIDDEN_REVEAL_ON_ANY_PULL_ACTION";
    }
}
