// 
// Decompiled by Procyon v0.6.0
// 

public enum jpb implements agzm
{
    a("QUALITY_PICKER_UNSET", 0, 0), 
    b("QUALITY_PICKER_ON", 1, 1), 
    c("QUALITY_PICKER_OFF", 2, 2);
    
    public final int d;
    
    private jpb(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static jpb a(final int n) {
        if (n == 0) {
            return jpb.a;
        }
        if (n == 1) {
            return jpb.b;
        }
        if (n != 2) {
            return null;
        }
        return jpb.c;
    }
    
    public static agzo b() {
        return ehk.l;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
