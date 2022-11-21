import java.util.concurrent.Executor;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acql extends acqh
{
    public final Object I;
    public final acqb J;
    public acqh K;
    public acqh L;
    
    public acql(final acsx acsx, final vnq vnq, final thg thg, final Object i, final tre tre, final xab xab, final Queue queue) {
        super(acsx, vnq, thg, i, tre, xab, afwd.a, queue);
        this.I = i;
        this.J = (acqb)new hwo(this, 3);
    }
    
    public static final boolean ao(final acqh acqh) {
        return acqh.al(acbj.b) || acqh.al(acbj.c);
    }
    
    protected static final boolean ap(final acqh acqh) {
        return acqh != null && ao(acqh) && acqh.lN();
    }
    
    private static final boolean j(final acbj acbj) {
        return acbj == acbj.b || acbj == acbj.c;
    }
    
    @Override
    public final acbk X(final acbj acbj) {
        if (this.L != null && j(acbj) && this.L.al(acbj)) {
            return this.L.X(acbj);
        }
        if (this.K != null && j(acbj)) {
            return this.K.X(acbj);
        }
        return super.X(acbj);
    }
    
    @Override
    public final Object Z() {
        return this.I;
    }
    
    @Override
    public final boolean al(final acbj acbj) {
        if (j(acbj)) {
            final acqh l = this.L;
            if (l != null && l.al(acbj)) {
                return true;
            }
            final acqh k = this.K;
            if (k != null) {
                return k.al(acbj);
            }
        }
        return super.al(acbj);
    }
    
    protected final boolean an(final acqh acqh) {
        final acqh l = this.L;
        if (l != null && ao(l)) {
            return false;
        }
        final acqh k = this.K;
        if (k != null) {
            return !ao(k);
        }
        return (!super.al(acbj.b) && !super.al(acbj.c)) || ap(acqh);
    }
    
    @Override
    public final void lL(final acbj acbj) {
        if (acbj != null && j(acbj)) {
            final acqh l = this.L;
            if (l != null && l.al(acbj)) {
                this.L.lL(acbj);
            }
        }
        if (acbj != null && j(acbj)) {
            final acqh k = this.K;
            if (k != null && k.X(acbj) != null) {
                this.K.lL(acbj);
                if (!this.K.lN()) {
                    return;
                }
            }
        }
        super.lL(acbj);
    }
}
