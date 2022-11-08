import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hkp implements ftd
{
    private final abno a;
    private final ftc b;
    private final ftb c;
    
    public hkp(final ftc b, final abno a) {
        this.c = new ftb();
        this.b = b;
        this.a = a;
    }
    
    public final ftc a() {
        final abtt q = this.a.q();
        if (q != null) {
            final PlayerResponseModel d = q.d();
            if (d != null && d.T()) {
                return this.b;
            }
        }
        return (ftc)this.c;
    }
}
