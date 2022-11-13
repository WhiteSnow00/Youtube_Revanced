// 
// Decompiled by Procyon v0.6.0
// 

public abstract class asje extends ashi
{
    public final ashi aE() {
        Object o;
        if (this instanceof asrt) {
            final asrt asrt = (asrt)this;
            o = new asrw((auke)asrt.b, asrt.d);
            final asjr k = atqx.k;
        }
        else {
            o = this;
        }
        final asrz asrz = new asrz((asje)o);
        final asjr j = atqx.j;
        return (ashi)asrz;
    }
    
    public abstract void aF(final asjm p0);
    
    public final ashi b(final int n) {
        return this.c(n, askj.d);
    }
    
    public final ashi c(final int n, final asjm asjm) {
        if (n <= 0) {
            this.aF(asjm);
            final asjr k = atqx.k;
            return this;
        }
        final asnh asnh = new asnh(this, asjm);
        final asjr j = atqx.j;
        return (ashi)asnh;
    }
    
    public final ashi tz() {
        return this.b(1);
    }
}
