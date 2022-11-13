// 
// Decompiled by Procyon v0.6.0
// 

public final class daf
{
    public int a;
    public String b;
    
    @Override
    public final String toString() {
        final String e = dam.e(this.a);
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("Response Code: ");
        sb.append(e);
        sb.append(", Debug Message: ");
        sb.append(b);
        return sb.toString();
    }
}
