// 
// Decompiled by Procyon v0.6.0
// 

public enum ahtu implements agzm
{
    a("ASSET_ITEM_SELECTED_STATE_UNKNOWN", 0, 0), 
    b("ASSET_ITEM_SELECTED_STATE_UNSELECTED", 1, 1), 
    c("ASSET_ITEM_SELECTED_STATE_SELECTED", 2, 2), 
    d("ASSET_ITEM_SELECTED_STATE_LOADING", 3, 3);
    
    public final int e;
    
    private ahtu(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return ahse.e;
    }
    
    public static ahtu b(final int n) {
        if (n == 0) {
            return ahtu.a;
        }
        if (n == 1) {
            return ahtu.b;
        }
        if (n == 2) {
            return ahtu.c;
        }
        if (n != 3) {
            return null;
        }
        return ahtu.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
