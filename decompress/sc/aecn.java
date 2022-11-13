import android.os.Parcel;
import java.util.Iterator;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.List;
import android.os.Bundle;
import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aecn extends aecw
{
    final aeco a;
    final nns b;
    final aeea c;
    
    public aecn(final aeco a, final nns nns, final aeea c, final nns b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.c = c;
        this.b = b;
        super(nns, (byte[])null);
    }
    
    protected final void a() {
        try {
            final aeco a = this.a;
            final aecp aecp = (aecp)a.a.k;
            final String b = a.b;
            final aeea c = this.c;
            final ArrayList list = new ArrayList();
            for (final String s : new ArrayList((Collection)c.a)) {
                final Bundle bundle = new Bundle();
                bundle.putString("url", s);
                list.add(bundle);
            }
            final Bundle bundle2 = new Bundle();
            final mig mig = new mig(this.a, 12);
            final Parcel qw = ((enz)aecp).qW();
            qw.writeString(b);
            qw.writeTypedList((List)list);
            eob.h(qw, (Parcelable)bundle2);
            eob.j(qw, (IInterface)mig);
            ((enz)aecp).qZ(1, qw);
        }
        catch (final RemoteException ex) {
            aeco.c.k((Throwable)ex, "prewarm(%s)", this.a.b);
            this.b.c((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
