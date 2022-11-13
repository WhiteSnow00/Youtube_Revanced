import java.util.function.Function;
import j$.util.Optional;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aayd
{
    public final aawy a;
    public final abzl b;
    public final ashi c;
    public final ashi d;
    public final ashi e;
    public aayc f;
    
    public aayd(final aawy a, final abzl b) {
        this.a = a;
        this.b = b;
        this.f = new aaya(null);
        this.c = ashi.N((auke)b.M().B((asjs)aada.e).L((asjr)new zgy(this, 8)), (auke)b.U().B((asjs)aada.f).L((asjr)new zgy(this, 9))).V();
        this.d = b.J().L((asjr)aaxs.f).L((asjr)new zgy(this, 10)).B((asjs)aada.g).L((asjr)aaxs.g).V();
        this.e = b.W().L((asjr)new zgy(this, 11)).B((asjs)aada.g).L((asjr)aaxs.e).V();
    }
    
    public final Optional a(final PlayerResponseModel playerResponseModel) {
        final aezq c = this.f.c(playerResponseModel, this.b());
        this.f = (aayc)c.a;
        return ((Optional)c.b).map((Function)new yud(playerResponseModel, 13));
    }
    
    public final String b() {
        return this.b.aa();
    }
    
    public final void c() {
        this.f = this.f.a();
    }
}
