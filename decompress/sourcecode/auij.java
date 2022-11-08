// 
// Decompiled by Procyon v0.6.0
// 

public final class auij implements auim
{
    public final auin a;
    
    private auij(final auin a) {
        this.a = a;
    }
    
    public static auim b(final auin auin) {
        if (auin instanceof auin) {
            return (auim)auin;
        }
        if (auin == null) {
            return null;
        }
        return (auim)new auij(auin);
    }
    
    public final int a() {
        return this.a.a();
    }
    
    public final int c(final auii auii, final CharSequence charSequence, final int n) {
        return this.a.a.c(auii, (CharSequence)charSequence.toString(), n);
    }
}
