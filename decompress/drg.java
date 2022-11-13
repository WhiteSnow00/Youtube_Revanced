import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drg extends arft
{
    private dqu a;
    
    public drg() {
        super("trak");
    }
    
    public final dqk l() {
        for (final dpv dpv : ((arfw)this).i()) {
            if (dpv instanceof dqk) {
                return (dqk)dpv;
            }
        }
        return null;
    }
    
    public final dqu m() {
        final dqu a = this.a;
        if (a != null) {
            return a;
        }
        final dqk l = this.l();
        if (l != null) {
            final dqm n = l.n();
            if (n != null) {
                return this.a = n.l();
            }
        }
        return null;
    }
    
    public final drh n() {
        for (final dpv dpv : ((arfw)this).i()) {
            if (dpv instanceof drh) {
                return (drh)dpv;
            }
        }
        return null;
    }
}
