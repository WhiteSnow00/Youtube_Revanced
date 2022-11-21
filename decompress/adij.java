// 
// Decompiled by Procyon v0.6.0
// 

public final class adij implements arom
{
    private final atnb a;
    private final atnb b;
    
    public adij(final atnb a, final atnb b) {
        this.a = a;
        this.b = b;
    }
    
    public static adij c(final atnb atnb, final atnb atnb2) {
        return new adij(atnb, atnb2);
    }
    
    public static adii d(final afcb afcb, final vbs vbs, final adit adit) {
        return new adii(afcb, vbs, adit, null);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final adii b() {
        return d((afcb)this.a.a(), ((arvr)this.b).c(), adip.d());
    }
}
