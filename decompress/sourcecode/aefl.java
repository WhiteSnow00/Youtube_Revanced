import android.os.Parcel;
import com.google.android.youtube.api.StandalonePlayerActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefl extends enz implements aefm
{
    final /* synthetic */ StandalonePlayerActivity a;
    
    public aefl() {
        super("com.google.android.youtube.player.internal.IPlaylistEventListener");
    }
    
    public aefl(final StandalonePlayerActivity a) {
        this.a = a;
        super("com.google.android.youtube.player.internal.IPlaylistEventListener");
    }
    
    public final void a() {
    }
    
    public final void b() {
        this.a.finish();
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1 && n != 2) {
            if (n != 3) {
                return false;
            }
            this.b();
        }
        parcel2.writeNoException();
        return true;
    }
    
    public final void g() {
    }
}
