import j$.util.Objects;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aanp
{
    private final PlayerResponseModel a;
    private final ajad b;
    
    public aanp(final PlayerResponseModel a, final ajad b) {
        this.a = a;
        this.b = b;
    }
    
    public PlayerResponseModel a() {
        return this.a;
    }
    
    public ajad b() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof aanp)) {
            return false;
        }
        final aanp aanp = (aanp)o;
        return Objects.equals((Object)this.b, (Object)aanp.b) && Objects.equals((Object)this.a, (Object)aanp.a);
    }
    
    @Override
    public int hashCode() {
        return ((ahcz)this.b).hashCode() * 31 + this.a.hashCode();
    }
}
