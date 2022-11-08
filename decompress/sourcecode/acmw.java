import java.util.concurrent.Executor;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acmw extends acms
{
    public final Object I;
    public final acmm J;
    public acms K;
    public acms L;
    
    public acmw(final acpi acpi, final vke vke, final tdz tdz, final Object i, final tny tny, final wwv wwv, final Queue queue) {
        super(acpi, vke, tdz, i, tny, wwv, (Executor)afsl.a, queue);
        this.I = i;
        this.J = (acmm)new hvk(this, 3);
    }
    
    public static final boolean ao(final acms acms) {
        return acms.al(abxw.b) || acms.al(abxw.c);
    }
    
    protected static final boolean ap(final acms acms) {
        return acms != null && ao(acms) && acms.lN();
    }
    
    private static final boolean j(final abxw abxw) {
        return abxw == abxw.b || abxw == abxw.c;
    }
    
    public final abxx X(final abxw abxw) {
        if (this.L != null && j(abxw) && this.L.al(abxw)) {
            return this.L.X(abxw);
        }
        if (this.K != null && j(abxw)) {
            return this.K.X(abxw);
        }
        return super.X(abxw);
    }
    
    public final Object Z() {
        return this.I;
    }
    
    public final boolean al(final abxw abxw) {
        if (j(abxw)) {
            final acms l = this.L;
            if (l != null && l.al(abxw)) {
                return true;
            }
            final acms k = this.K;
            if (k != null) {
                return k.al(abxw);
            }
        }
        return super.al(abxw);
    }
    
    protected final boolean an(final acms acms) {
        final acms l = this.L;
        if (l != null && ao(l)) {
            return false;
        }
        final acms k = this.K;
        if (k != null) {
            return !ao(k);
        }
        return (!super.al(abxw.b) && !super.al(abxw.c)) || ap(acms);
    }
    
    public final void lL(final abxw abxw) {
        if (abxw != null && j(abxw)) {
            final acms l = this.L;
            if (l != null && l.al(abxw)) {
                this.L.lL(abxw);
            }
        }
        if (abxw != null && j(abxw)) {
            final acms k = this.K;
            if (k != null && k.X(abxw) != null) {
                this.K.lL(abxw);
                if (!this.K.lN()) {
                    return;
                }
            }
        }
        super.lL(abxw);
    }
}
