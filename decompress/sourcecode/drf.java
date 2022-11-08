import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drf extends arde
{
    private dqt a;
    
    public drf() {
        super("trak");
    }
    
    public final dqj l() {
        for (final dpu dpu : ((ardh)this).i()) {
            if (dpu instanceof dqj) {
                return (dqj)dpu;
            }
        }
        return null;
    }
    
    public final dqt m() {
        final dqt a = this.a;
        if (a != null) {
            return a;
        }
        final dqj l = this.l();
        if (l != null) {
            final dql n = l.n();
            if (n != null) {
                return this.a = n.l();
            }
        }
        return null;
    }
    
    public final drg n() {
        for (final dpu dpu : ((ardh)this).i()) {
            if (dpu instanceof drg) {
                return (drg)dpu;
            }
        }
        return null;
    }
}
