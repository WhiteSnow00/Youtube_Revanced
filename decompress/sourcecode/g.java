import java.text.Format;

// 
// Decompiled by Procyon v0.6.0
// 

final class g
{
    final int a;
    final String b;
    final Number c;
    final double d;
    int e;
    Format f;
    String g;
    boolean h;
    
    public g(final int a, final String b, final Number c, final double d) {
        this.a = a;
        this.b = b;
        if (d == 0.0) {
            this.c = c;
        }
        else {
            this.c = c.doubleValue() - d;
        }
        this.d = d;
    }
    
    @Override
    public final String toString() {
        throw new AssertionError((Object)"PluralSelectorContext being formatted, rather than its number");
    }
}
