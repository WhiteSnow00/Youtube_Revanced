import java.util.concurrent.Executor;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acoz extends acov
{
    public final Object I;
    public final acop J;
    public acov K;
    public acov L;
    
    public acoz(final acrm acrm, final vmj vmj, final tgd tgd, final Object i, final tqd tqd, final wyw wyw, final Queue queue) {
        super(acrm, vmj, tgd, i, tqd, wyw, (Executor)afum.a, queue);
        this.I = i;
        this.J = (acop)new hwg(this, 3);
    }
    
    public static final boolean ao(final acov acov) {
        return acov.al(abzz.b) || acov.al(abzz.c);
    }
    
    protected static final boolean ap(final acov acov) {
        return acov != null && ao(acov) && acov.lN();
    }
    
    private static final boolean j(final abzz abzz) {
        return abzz == abzz.b || abzz == abzz.c;
    }
    
    public final acaa X(final abzz abzz) {
        if (this.L != null && j(abzz) && this.L.al(abzz)) {
            return this.L.X(abzz);
        }
        if (this.K != null && j(abzz)) {
            return this.K.X(abzz);
        }
        return super.X(abzz);
    }
    
    public final Object Z() {
        return this.I;
    }
    
    public final boolean al(final abzz abzz) {
        if (j(abzz)) {
            final acov l = this.L;
            if (l != null && l.al(abzz)) {
                return true;
            }
            final acov k = this.K;
            if (k != null) {
                return k.al(abzz);
            }
        }
        return super.al(abzz);
    }
    
    protected final boolean an(final acov acov) {
        final acov l = this.L;
        if (l != null && ao(l)) {
            return false;
        }
        final acov k = this.K;
        if (k != null) {
            return !ao(k);
        }
        return (!super.al(abzz.b) && !super.al(abzz.c)) || ap(acov);
    }
    
    public final void lL(final abzz abzz) {
        if (abzz != null && j(abzz)) {
            final acov l = this.L;
            if (l != null && l.al(abzz)) {
                this.L.lL(abzz);
            }
        }
        if (abzz != null && j(abzz)) {
            final acov k = this.K;
            if (k != null && k.X(abzz) != null) {
                this.K.lL(abzz);
                if (!this.K.lN()) {
                    return;
                }
            }
        }
        super.lL(abzz);
    }
}
