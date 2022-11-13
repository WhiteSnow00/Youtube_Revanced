import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class aaxd implements aaxf
{
    public final aiqj a;
    public final Object b;
    private final int c;
    private final Object d;
    
    public aaxd(final xag d, final aiqj a, final aiqj b, final int c) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public aaxd(final xag b, final WatchNextResponseModel d, final aiqj a, final int c) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public aaxd(final xag b, final PlayerResponseModel d, final aiqj a, final int c) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public final aaxg a(final aawy aawy) {
        final int c = this.c;
        if (c == 0) {
            return (aaxg)new aaxe(this, aawy.d((xag)this.b, (WatchNextResponseModel)this.d, aawy.g), this.a, 0);
        }
        if (c != 1) {
            final Object d = this.d;
            if (d != null) {
                aawy.n((xag)d, this.a, (aiqj)this.b);
            }
            aawy.r(aawy.x((aiqj)this.b));
            return (aaxg)new aaxi((xag)this.d, (aiqj)this.b, 1);
        }
        return (aaxg)new aaxe(this, aawy.c((xag)this.b, (PlayerResponseModel)this.d, aawy.g), this.a, 1, null);
    }
    
    public final aaxu b() {
        final int c = this.c;
        if (c == 0) {
            return aaxu.d;
        }
        if (c != 1) {
            return aaxu.a;
        }
        return aaxu.c;
    }
}
