import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atsh implements atsa
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public atsh(final atsa b, final atqd a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public atsh(final CharSequence a, final atqh b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Iterator a() {
        if (this.c != 0) {
            return new atse(this, null);
        }
        return new atsg(this);
    }
}
