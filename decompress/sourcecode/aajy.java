import j$.util.Objects;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aajy
{
    private final PlayerResponseModel a;
    private final aiwa b;
    
    public aajy(final PlayerResponseModel a, final aiwa b) {
        this.a = a;
        this.b = b;
    }
    
    public PlayerResponseModel a() {
        return this.a;
    }
    
    public aiwa b() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof aajy)) {
            return false;
        }
        final aajy aajy = (aajy)o;
        return Objects.equals((Object)this.b, (Object)aajy.b) && Objects.equals((Object)this.a, (Object)aajy.a);
    }
    
    @Override
    public int hashCode() {
        return ((agzi)this.b).hashCode() * 31 + this.a.hashCode();
    }
}
