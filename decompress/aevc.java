// 
// Decompiled by Procyon v0.6.0
// 

public final class aevc
{
    public final int a;
    public final int b;
    public final int c;
    public final Object d;
    
    public aevc(final aevd d, final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public aevc(final String d, final int b, final int c) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = -1;
    }
    
    public aevc(final String d, final int b, final int c, final int a) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aevc(final yzz d, final int a, final int b, final int c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final yzy yzy) {
        yzy.c = (yzz)this.d;
        final int a = this.a;
        if (a != 0) {
            yzy.b = a;
        }
        yzy.a = this.c;
    }
}
