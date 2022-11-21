// 
// Decompiled by Procyon v0.6.0
// 

public enum aibm implements ahdd
{
    a("BACKSTAGE_POST_DIALOG_STARTING_STATE_UNSPECIFIED", 0, 0), 
    b("BACKSTAGE_POST_DIALOG_STARTING_STATE_TEXT", 1, 1), 
    c("BACKSTAGE_POST_DIALOG_STARTING_STATE_TEXT_POLL", 2, 2), 
    d("BACKSTAGE_POST_DIALOG_STARTING_STATE_IMAGE", 3, 3), 
    e("BACKSTAGE_POST_DIALOG_STARTING_STATE_IMAGE_POLL", 4, 4), 
    f("BACKSTAGE_POST_DIALOG_STARTING_STATE_QUIZ", 5, 5), 
    g("UNRECOGNIZED", 6, -1);
    
    private static final aibm[] h;
    private final int i;
    
    private aibm(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static ahdf a() {
        return ahvv.t;
    }
    
    public static aibm b(final int n) {
        if (n == 0) {
            return aibm.a;
        }
        if (n == 1) {
            return aibm.b;
        }
        if (n == 2) {
            return aibm.c;
        }
        if (n == 3) {
            return aibm.d;
        }
        if (n == 4) {
            return aibm.e;
        }
        if (n != 5) {
            return null;
        }
        return aibm.f;
    }
    
    public final int getNumber() {
        if (this != aibm.g) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
