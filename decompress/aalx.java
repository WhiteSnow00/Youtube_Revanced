import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aalx implements arom
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    private final atnb d;
    private final atnb e;
    
    public aalx(final atnb a, final atnb b, final atnb c, final atnb d, final atnb e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static aalx b(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5) {
        return new aalx(atnb, atnb2, atnb3, atnb4, atnb5);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final abog c() {
        return aamn.e((Context)((aron)this.a).a, this.b, (abvv)this.c.a(), (aamy)((aron)this.d).a, this.e);
    }
}
