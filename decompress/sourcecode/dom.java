// 
// Decompiled by Procyon v0.6.0
// 

public final class dom implements dol
{
    private final /* synthetic */ int a;
    private dok b;
    
    public dom(final int a) {
        this.a = a;
    }
    
    public final dok a(final int n, final boolean b) {
        if (this.a != 0) {
            Object o;
            if (n != 5 && b) {
                if (this.b == null) {
                    this.b = (dok)new don(0);
                }
                o = this.b;
            }
            else {
                o = doi.a;
            }
            return (dok)o;
        }
        Object o2;
        if (n != 5 && b) {
            if (this.b == null) {
                this.b = (dok)new don(1);
            }
            o2 = this.b;
        }
        else {
            o2 = doi.a;
        }
        return (dok)o2;
    }
}
