import android.os.Parcel;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeff extends enz implements aefg
{
    public aeff() {
        super("com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
    }
    
    public final String a(final String s) {
        afqg.r("Cannot get embed config, client disconnected.");
        return "";
    }
    
    public final void b(final Bundle bundle) {
        afqg.r("Cannot set fullscreen, client disconnected.");
    }
    
    protected final boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, int int1) {
        switch (n) {
            default: {
                return false;
            }
            case 10: {
                final boolean k = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.i(k);
                parcel2.writeNoException();
                break;
            }
            case 9: {
                n = parcel.readInt();
                int1 = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.h(n, int1);
                parcel2.writeNoException();
                break;
            }
            case 8: {
                final String string = parcel.readString();
                this.enforceNoDataAvail(parcel);
                final String a = this.a(string);
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            }
            case 7: {
                final boolean i = eoa.k(parcel);
                this.enforceNoDataAvail(parcel);
                this.k(i);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                n = parcel.readInt();
                this.enforceNoDataAvail(parcel);
                this.j(n);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                final long long1 = parcel.readLong();
                this.enforceNoDataAvail(parcel);
                this.m(long1);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                n = parcel.readInt();
                final String string2 = parcel.readString();
                final long long2 = parcel.readLong();
                this.enforceNoDataAvail(parcel);
                this.l(n, string2, long2);
                parcel2.writeNoException();
                break;
            }
            case 3: {
                this.g();
                parcel2.writeNoException();
                break;
            }
            case 2: {
                final Bundle bundle = (Bundle)eoa.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.b(bundle);
                parcel2.writeNoException();
                break;
            }
        }
        return true;
    }
    
    public final void g() {
        afqg.r("Cannot dismiss fullscreen, client disconnected.");
    }
    
    public final void h(final int n, final int n2) {
        afqg.r("Cannot send ad event, client disconnected.");
    }
    
    public final void i(final boolean b) {
        afqg.r("Cannot handle ad authorization, client disconnected.");
    }
    
    public final void j(final int n) {
        afqg.r("Cannot send error, client disconnected.");
    }
    
    public final void k(final boolean b) {
        afqg.r("Cannot send fullscreen event, client disconnected.");
    }
    
    public final void l(final int n, final String s, final long n2) {
        afqg.r("Cannot send playback event, client disconnected.");
    }
    
    public final void m(final long n) {
        afqg.r("Cannot update duration, client disconnected.");
    }
}
