// 
// Decompiled by Procyon v0.6.0
// 

public enum ahxl implements ahdd
{
    a("ASSET_ITEM_SELECTED_STATE_UNKNOWN", 0, 0), 
    b("ASSET_ITEM_SELECTED_STATE_UNSELECTED", 1, 1), 
    c("ASSET_ITEM_SELECTED_STATE_SELECTED", 2, 2), 
    d("ASSET_ITEM_SELECTED_STATE_LOADING", 3, 3);
    
    private static final ahxl[] f;
    public final int e;
    
    private ahxl(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return ahvv.e;
    }
    
    public static ahxl b(final int n) {
        if (n == 0) {
            return ahxl.a;
        }
        if (n == 1) {
            return ahxl.b;
        }
        if (n == 2) {
            return ahxl.c;
        }
        if (n != 3) {
            return null;
        }
        return ahxl.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
