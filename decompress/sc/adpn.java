// 
// Decompiled by Procyon v0.6.0
// 

public final class adpn implements admb
{
    public final String a;
    public final admc b;
    public final adpp c;
    
    public adpn(final adpp c, final String a, final admc b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void tl(final admc admc) {
        if (admc.g().b) {
            admc.d((admb)this);
            this.c.b(this.a, true);
            this.c.c.execute((Runnable)new adme(this, 5));
        }
    }
}
