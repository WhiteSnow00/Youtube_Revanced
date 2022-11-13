// 
// Decompiled by Procyon v0.6.0
// 

public final class gkf implements Comparable
{
    public int a;
    int b;
    final long c;
    
    public gkf(final int a, final int b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return this.b - ((gkf)o).b;
    }
}
