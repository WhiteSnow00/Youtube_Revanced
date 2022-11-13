import com.google.android.apps.youtube.app.watch.playback.WatchResponseCoordinator;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hva implements ashm
{
    public final Object a;
    private final int b;
    
    public hva(final ashc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hva(final ashi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hva(final asjm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hva(final SubtitleButtonController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hva(final WatchResponseCoordinator a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hva(final eg a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
    }
    
    public hva(final hvi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hva(final uya a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final auke a(ashi r) {
        switch (this.b) {
            default: {
                return (auke)((ashi)this.a).Y((asjr)new uxe(r, 6));
            }
            case 6: {
                return (auke)r.V().ay().c(0, (asjm)this.a);
            }
            case 5: {
                return (auke)((uya)this.a).g.L(tht.a).i(ashb.e).Y((asjr)new uxe(r, 3));
            }
            case 4: {
                return (auke)r.ab((auke)((ashc)this.a).T(new Object()).f());
            }
            case 3: {
                final WatchResponseCoordinator watchResponseCoordinator = (WatchResponseCoordinator)this.a;
                ashi p = r;
                if (watchResponseCoordinator.e) {
                    p = r.R().P(watchResponseCoordinator.c);
                }
                return (auke)p;
            }
            case 2: {
                ashi p2 = r;
                if (((SubtitleButtonController)this.a).b) {
                    p2 = r.R().P(asil.a());
                }
                return (auke)p2;
            }
            case 1: {
                final Object a = this.a;
                r = r.R();
                final eg eg = (eg)a;
                return (auke)r.P((asid)eg.c).Y((asjr)new fdg(eg, 20, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
            }
            case 0: {
                return (auke)ashi.e((auke)r, (auke)((hvi)this.a).a, (asji)exl.l);
            }
        }
    }
}
