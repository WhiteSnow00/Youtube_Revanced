import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atop implements atoi
{
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;
    
    public atop(final atoi b, final atml a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public atop(final CharSequence a, final atmp b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Iterator a() {
        if (this.c != 0) {
            return new atom(this, null);
        }
        return new atoo(this);
    }
}
