// 
// Decompiled by Procyon v0.6.0
// 

public final class oby
{
    public final aftr a;
    public final aftr b;
    
    public oby() {
    }
    
    public oby(final aftr a, final aftr b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof oby) {
            final oby oby = (oby)o;
            if (this.a.equals(oby.a) && this.b.equals(oby.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("IpcExecutors{outgoingIpcExecutor=");
        sb.append(this.a);
        sb.append(", incomingIpcExecutor=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
