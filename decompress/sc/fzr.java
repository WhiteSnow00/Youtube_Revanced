// 
// Decompiled by Procyon v0.6.0
// 

public final class fzr
{
    public static final fzr a;
    public static final fzr b;
    public static final fzr c;
    public static final fzr d;
    private final int e;
    
    static {
        a = new fzr(0);
        b = new fzr(2);
        c = new fzr(1);
        d = new fzr(3);
    }
    
    private fzr(final int e) {
        this.e = e;
    }
    
    public final boolean a() {
        return this.e == 1;
    }
    
    public final boolean b() {
        return this.e == 2;
    }
    
    @Override
    public final String toString() {
        final int e = this.e;
        if (e == 0) {
            return "ALWAYS_SHOWN";
        }
        if (e == 1) {
            return "HIDDEN_REVEAL_ON_ANY_PULL_ACTION";
        }
        if (e != 2) {
            return "GHOST_CARD_SHOWN";
        }
        return "HIDE_AFTER_DELAY_THEN_REVEAL_ON_ANY_PULL";
    }
}
