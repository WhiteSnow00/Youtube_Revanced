// 
// Decompiled by Procyon v0.6.0
// 

public final class gcw
{
    public boolean a;
    public boolean b;
    
    public gcw() {
        this.a = false;
        this.b = false;
    }
    
    public final void a() {
        this.a = false;
        this.b = false;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder("{entryInProgress=");
        sb.append(a);
        sb.append(", exitInProgress=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
