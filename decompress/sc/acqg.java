// 
// Decompiled by Procyon v0.6.0
// 

public final class acqg extends acle
{
    public final void q(final acqe acqe) {
        if (acqe == null) {
            if (!((tfz)this).isEmpty()) {
                ((tfz)this).clear();
            }
            return;
        }
        if (((tfz)this).isEmpty()) {
            this.add((Object)acqe);
            return;
        }
        if (((tfz)this).get(0) == acqe) {
            return;
        }
        this.n(0, (Object)acqe);
    }
    
    public final /* bridge */ void qP(final acjm acjm) {
        super.j((tfw)acjm);
    }
}
