import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxk implements cxb
{
    public final String a;
    public final List b;
    public final boolean c;
    
    public cxk(final String a, final List b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final cuv a(final cui cui, final cxp cxp) {
        return (cuv)new cuw(cui, cxp, this);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String string = Arrays.toString(this.b.toArray());
        final StringBuilder sb = new StringBuilder("ShapeGroup{name='");
        sb.append(a);
        sb.append("' Shapes: ");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
