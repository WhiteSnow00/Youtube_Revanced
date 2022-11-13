import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyr implements vve
{
    private final vwa a;
    
    public hyr(final vwa a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public final void b(final vvd vvd) {
        final afeq c = this.a.c();
        for (int c2 = ((afih)c).c, i = 0; i < c2; ++i) {
            vvd.g.add((int)((List<Integer>)c).get(i));
        }
    }
}
