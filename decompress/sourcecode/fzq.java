// 
// Decompiled by Procyon v0.6.0
// 

public final class fzq
{
    public static final fzq a;
    public static final fzq b;
    public static final fzq c;
    public final int d;
    
    static {
        a = new fzq(0);
        b = new fzq(2);
        c = new fzq(1);
    }
    
    private fzq(final int d) {
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
