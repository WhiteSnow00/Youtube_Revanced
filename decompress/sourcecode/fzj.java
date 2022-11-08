// 
// Decompiled by Procyon v0.6.0
// 

public final class fzj
{
    public static final fzj a;
    public static final fzj b;
    public static final fzj c;
    public static final fzj d;
    private final int e;
    
    static {
        a = new fzj(0);
        b = new fzj(2);
        c = new fzj(1);
        d = new fzj(3);
    }
    
    private fzj(final int e) {
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
