// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aasb implements aarz
{
    private aarz a;
    public boolean l;
    
    @Override
    public void rS(final boolean l) {
        this.l = l;
    }
    
    @Override
    public final void u(final aarz a) {
        this.a = a;
    }
    
    @Override
    public boolean v() {
        final boolean l = this.l;
        boolean b = true;
        if (!l) {
            final aarz a = this.a;
            if (a != null) {
                if (!a.v()) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
}
