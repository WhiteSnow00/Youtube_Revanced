// 
// Decompiled by Procyon v0.6.0
// 

public final class ihn
{
    public final String a;
    public final iix b;
    public final asjm c;
    
    public ihn() {
    }
    
    public ihn(final String a, final iix b, final asjm c) {
        if (a != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null outputEntityKey");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ihn) {
            final ihn ihn = (ihn)o;
            if (this.a.equals(ihn.a) && this.b.equals(ihn.b) && this.c.equals(ihn.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String string = this.b.toString();
        final String string2 = this.c.toString();
        final StringBuilder sb = new StringBuilder("TransformationWrapper{outputEntityKey=");
        sb.append(a);
        sb.append(", transformer=");
        sb.append(string);
        sb.append(", transformationFunction=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
