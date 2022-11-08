// 
// Decompiled by Procyon v0.6.0
// 

public final class dou extends abg
{
    private int e;
    
    public final void clear() {
        this.e = 0;
        super.clear();
    }
    
    public final Object d(final int n) {
        this.e = 0;
        return super.d(n);
    }
    
    public final Object e(final int n, final Object o) {
        this.e = 0;
        return super.e(n, o);
    }
    
    public final void h(final abn abn) {
        this.e = 0;
        super.h(abn);
    }
    
    public final int hashCode() {
        int e;
        if ((e = this.e) == 0) {
            e = super.hashCode();
            this.e = e;
        }
        return e;
    }
    
    public final Object put(final Object o, final Object o2) {
        this.e = 0;
        return super.put(o, o2);
    }
}
