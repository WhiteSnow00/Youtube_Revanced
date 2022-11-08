// 
// Decompiled by Procyon v0.6.0
// 

final class atvf
{
    public final atuz a;
    
    public atvf(final atuz a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final atuz a = this.a;
        final StringBuilder sb = new StringBuilder("Removed[");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }
}
