// 
// Decompiled by Procyon v0.6.0
// 

public enum aqvm implements agzm
{
    a("CHANNEL_MENTION_STYLE_UNSPECIFIED", 0, 0), 
    b("CHANNEL_MENTION_NORMAL", 1, 1), 
    c("CHANNEL_MENTION_LIGHT", 2, 2);
    
    public final int d;
    
    private aqvm(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return aqtg.f;
    }
    
    public static aqvm b(final int n) {
        if (n == 0) {
            return aqvm.a;
        }
        if (n == 1) {
            return aqvm.b;
        }
        if (n != 2) {
            return null;
        }
        return aqvm.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
