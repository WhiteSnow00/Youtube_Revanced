import j$.util.Objects;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aals
{
    private final PlayerResponseModel a;
    private final aiyf b;
    
    public aals(final PlayerResponseModel a, final aiyf b) {
        this.a = a;
        this.b = b;
    }
    
    public PlayerResponseModel a() {
        return this.a;
    }
    
    public aiyf b() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof aals)) {
            return false;
        }
        final aals aals = (aals)o;
        return Objects.equals((Object)this.b, (Object)aals.b) && Objects.equals((Object)this.a, (Object)aals.a);
    }
    
    @Override
    public int hashCode() {
        return ((ahbh)this.b).hashCode() * 31 + this.a.hashCode();
    }
}
