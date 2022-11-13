// 
// Decompiled by Procyon v0.6.0
// 

public enum ajgj implements ahbl
{
    a("DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_UNKNOWN", 0, 0), 
    b("DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_CANCEL", 1, 1), 
    c("DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_CONFIRM", 2, 2), 
    d("DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_GET_PREMIUM", 3, 3);
    
    private static final ajgj[] e;
    private final int f;
    
    private ajgj(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return ajek.h;
    }
    
    public static ajgj b(final int n) {
        if (n == 0) {
            return ajgj.a;
        }
        if (n == 1) {
            return ajgj.b;
        }
        if (n == 2) {
            return ajgj.c;
        }
        if (n != 3) {
            return null;
        }
        return ajgj.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
