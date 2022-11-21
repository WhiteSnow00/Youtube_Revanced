import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaml implements aamm
{
    private final abpl a;
    
    public aaml(final abpl a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final PlayerResponseModel playerResponseModel, final int n) {
        final boolean c = this.a.c();
        boolean b = false;
        if (c) {
            if (!aamz.f(playerResponseModel)) {
                if (n == 3) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
}
