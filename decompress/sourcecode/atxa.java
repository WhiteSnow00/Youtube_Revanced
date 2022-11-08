// 
// Decompiled by Procyon v0.6.0
// 

public enum atxa implements agzm
{
    a("UNKNOWN", 0, 0), 
    b("CRONET", 1, 1);
    
    public final int c;
    
    private atxa(final String s, final int n, final int c) {
        this.c = c;
    }
    
    public static agzo a() {
        return arbt.i;
    }
    
    public static atxa b(final int n) {
        if (n == 0) {
            return atxa.a;
        }
        if (n != 1) {
            return null;
        }
        return atxa.b;
    }
    
    public final int getNumber() {
        return this.c;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.c);
    }
}
