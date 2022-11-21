import com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achw implements arom
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    
    public achw(final atnb a, final atnb b, final atnb c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static achw c(final atnb atnb, final atnb atnb2, final atnb atnb3) {
        return new achw(atnb, atnb2, atnb3);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final achv b() {
        return new achv(((a)this.a).c(), ((aciq)this.b).c(), lpi.b(), (vbo)this.c.a());
    }
}
