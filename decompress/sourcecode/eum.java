import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class eum
{
    public final wwv a;
    private final abzk b;
    private final arhr c;
    
    public eum(final abzk b, final wwv a, final arhr c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final View a() {
        return this.b.a();
    }
    
    public final void b() {
        this.b.c((acir)null);
    }
    
    public final void c(final aexq aexq, final acij acij, final ajkj ajkj) {
        if (aexq.h()) {
            final agza builder = ((agzi)alff.a).createBuilder();
            final alek v = (alek)aexq.c();
            builder.copyOnWrite();
            final alff alff = (alff)builder.instance;
            alff.v = v;
            alff.c |= 0x400;
            ((wwx)acij).e = (alff)builder.build();
        }
        ((wwx)acij).a(this.a);
        this.b.b(acij, ((acae)this.c.a()).d(ajkj));
    }
}
