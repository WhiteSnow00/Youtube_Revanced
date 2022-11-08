import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.i;
import android.os.Parcel;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefp extends enz implements aefq
{
    public final e a;
    public final elw b;
    private final Handler c;
    
    public aefp() {
        super("com.google.android.youtube.player.internal.IThumbnailLoaderService");
    }
    
    public aefp(final Handler c, final addp addp, final aceo aceo, final thh thh, final aefo aefo, final byte[] array, final byte[] array2) {
        super("com.google.android.youtube.player.internal.IThumbnailLoaderService");
        aefo.getClass();
        c.getClass();
        this.c = c;
        final elw b = new elw(aefo);
        this.b = b;
        this.a = new e(b, addp, aceo, thh, null, null, null, null);
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        switch (int1) {
            default: {
                return false;
            }
            case 6: {
                this.c.post((Runnable)new i(this, 5));
                break;
            }
            case 5: {
                final Handler c = this.c;
                final e a = this.a;
                a.getClass();
                c.post((Runnable)new i(a, 4));
                break;
            }
            case 4: {
                final Handler c2 = this.c;
                final e a2 = this.a;
                a2.getClass();
                c2.post((Runnable)new i(a2, 3));
                break;
            }
            case 3: {
                final Handler c3 = this.c;
                final e a3 = this.a;
                a3.getClass();
                c3.post((Runnable)new i(a3, 2));
                break;
            }
            case 2: {
                final String string = parcel.readString();
                int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.c.post((Runnable)new qo(this, string, int1, 20));
                break;
            }
            case 1: {
                final String string2 = parcel.readString();
                this.enforceNoDataAvail(parcel);
                this.c.post((Runnable)new a(this, string2, 9));
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
