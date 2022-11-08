import com.google.android.gms.googlehelp.internal.common.TogglingData;
import android.os.Parcel;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.GoogleHelp;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class mzh extends enz implements IInterface
{
    public mzh() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }
    
    public void a() {
        throw new UnsupportedOperationException();
    }
    
    public void b() {
        throw new UnsupportedOperationException();
    }
    
    public void c(final GoogleHelp googleHelp) {
        throw new UnsupportedOperationException();
    }
    
    public void d(final InProductHelp inProductHelp) {
        throw new UnsupportedOperationException();
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return false;
            }
            case 19: {
                throw new UnsupportedOperationException();
            }
            case 18: {
                parcel.createByteArray();
                this.enforceNoDataAvail(parcel);
                throw new UnsupportedOperationException();
            }
            case 17: {
                final InProductHelp inProductHelp = (InProductHelp)eoa.a(parcel, InProductHelp.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.d(inProductHelp);
                parcel2.writeNoException();
                break;
            }
            case 16: {
                throw new UnsupportedOperationException();
            }
            case 15: {
                parcel.createByteArray();
                this.enforceNoDataAvail(parcel);
                throw new UnsupportedOperationException();
            }
            case 14: {
                throw new UnsupportedOperationException();
            }
            case 13: {
                parcel.createByteArray();
                this.enforceNoDataAvail(parcel);
                throw new UnsupportedOperationException();
            }
            case 12: {
                throw new UnsupportedOperationException();
            }
            case 11: {
                throw new UnsupportedOperationException();
            }
            case 10: {
                throw new UnsupportedOperationException();
            }
            case 9: {
                parcel.readInt();
                this.enforceNoDataAvail(parcel);
                throw new UnsupportedOperationException();
            }
            case 8: {
                this.b();
                break;
            }
            case 7: {
                this.a();
                break;
            }
            case 6: {
                throw new UnsupportedOperationException();
            }
            case 5: {
                throw new UnsupportedOperationException();
            }
            case 4: {
                throw new UnsupportedOperationException();
            }
            case 3: {
                throw new UnsupportedOperationException();
            }
            case 2: {
                final TogglingData togglingData = (TogglingData)eoa.a(parcel, TogglingData.CREATOR);
                this.enforceNoDataAvail(parcel);
                throw new UnsupportedOperationException();
            }
            case 1: {
                final GoogleHelp googleHelp = (GoogleHelp)eoa.a(parcel, GoogleHelp.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.c(googleHelp);
                parcel2.writeNoException();
                break;
            }
        }
        return true;
    }
}
