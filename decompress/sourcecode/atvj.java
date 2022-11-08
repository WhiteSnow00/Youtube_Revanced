// 
// Decompiled by Procyon v0.6.0
// 

public final class atvj
{
    public final String a;
    
    public atvj(final String a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder("<");
        sb.append(a);
        sb.append(">");
        return sb.toString();
    }
}
