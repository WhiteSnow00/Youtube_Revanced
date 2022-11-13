// 
// Decompiled by Procyon v0.6.0
// 

public final class dub
{
    public final Object a;
    public Object b;
    
    public dub(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("Diff{mPrevious=");
        sb.append(value);
        sb.append(", mNext=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
