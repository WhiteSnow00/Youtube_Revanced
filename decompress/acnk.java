// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acnk extends acni implements acnc
{
    public acnb a;
    
    protected abstract boolean c();
    
    protected abstract boolean d(final acmz p0);
    
    @Override
    public final boolean e(final acnb a) {
        this.a = a;
        return this.c();
    }
    
    @Override
    public final boolean f(final acmz acmz) {
        final boolean d = this.d(acmz);
        if (d) {
            this.a = this.a.b(acmz);
        }
        return d;
    }
}
