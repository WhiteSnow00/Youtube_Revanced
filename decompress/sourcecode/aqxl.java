// 
// Decompiled by Procyon v0.6.0
// 

public enum aqxl implements agzm
{
    a("KEYFRAME_LABEL_UNSPECIFIED", 0, 0), 
    b("KEYFRAME_LABEL_START", 1, 1), 
    c("KEYFRAME_LABEL_END", 2, 2);
    
    public final int d;
    
    private aqxl(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return aqtg.p;
    }
    
    public static aqxl b(final int n) {
        if (n == 0) {
            return aqxl.a;
        }
        if (n == 1) {
            return aqxl.b;
        }
        if (n != 2) {
            return null;
        }
        return aqxl.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
