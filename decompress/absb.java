// 
// Decompiled by Procyon v0.6.0
// 

public final class absb implements aski
{
    public final int a;
    private final int b;
    
    public absb(final int a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final aumz a(final aske aske) {
        if (this.b != 0) {
            final int a = this.a;
            if (a == 1) {
                return aske.X(aslh.a());
            }
            if (a != 2) {
                return aske;
            }
            return aske.X(atmg.a());
        }
        else {
            if (this.a != 1) {
                return aske;
            }
            return aske.P(aslh.a());
        }
    }
}
