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

public final class aeef extends aeeo
{
    final aeeg a;
    final noj b;
    final aefs c;
    
    public aeef(final aeeg a, final noj noj, final aefs c, final noj b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.c = c;
        this.b = b;
        super(noj, null);
    }
    
    @Override
    protected final void a() {
        try {
            final aeeg a = this.a;
            final aeeh aeeh = (aeeh)a.a.k;
            final String b = a.b;
            final aefs c = this.c;
            final ArrayList list = new ArrayList();
            for (final String s : new ArrayList((Collection)c.a)) {
                final Bundle bundle = new Bundle();
                bundle.putString("url", s);
                list.add(bundle);
            }
            final Bundle bundle2 = new Bundle();
            final miu miu = new miu(this.a, 12);
            final Parcel qv = aeeh.qV();
            qv.writeString(b);
            qv.writeTypedList((List)list);
            eoe.h(qv, (Parcelable)bundle2);
            eoe.j(qv, (IInterface)miu);
            aeeh.qY(1, qv);
        }
        catch (final RemoteException ex) {
            aeeg.c.i((Throwable)ex, "prewarm(%s)", this.a.b);
            this.b.c((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
