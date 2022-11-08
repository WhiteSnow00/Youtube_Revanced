// 
// Decompiled by Procyon v0.6.0
// 

public final class acoc extends acjb
{
    public final void q(final acoa acoa) {
        if (acoa == null) {
            if (!((tdv)this).isEmpty()) {
                ((tdv)this).clear();
            }
            return;
        }
        if (((tdv)this).isEmpty()) {
            this.add((Object)acoa);
            return;
        }
        if (((tdv)this).get(0) == acoa) {
            return;
        }
        this.n(0, (Object)acoa);
    }
}
