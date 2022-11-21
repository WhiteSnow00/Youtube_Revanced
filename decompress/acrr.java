// 
// Decompiled by Procyon v0.6.0
// 

public final class acrr extends acmr
{
    public final void q(final acrp acrp) {
        if (acrp == null) {
            if (!this.isEmpty()) {
                this.clear();
            }
            return;
        }
        if (this.isEmpty()) {
            this.add((Object)acrp);
            return;
        }
        if (this.get(0) == acrp) {
            return;
        }
        this.n(0, acrp);
    }
    
    public final /* bridge */ void qO(final ackz ackz) {
        super.j((tgz)ackz);
    }
}
