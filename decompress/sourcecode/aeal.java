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

public final class aeal extends aeau
{
    final /* synthetic */ aeam a;
    final /* synthetic */ nmo b;
    final /* synthetic */ aeby c;
    
    public aeal(final aeam a, final nmo nmo, final aeby c, final nmo b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.c = c;
        this.b = b;
        super(nmo, (byte[])null);
    }
    
    protected final void a() {
        try {
            final aeam a = this.a;
            final aean aean = (aean)a.a.k;
            final String b = a.b;
            final aeby c = this.c;
            final ArrayList list = new ArrayList();
            for (final String s : new ArrayList((Collection)c.a)) {
                final Bundle bundle = new Bundle();
                bundle.putString("url", s);
                list.add(bundle);
            }
            final Bundle bundle2 = new Bundle();
            final mhb mhb = new mhb(this.a, 12);
            final Parcel qq = ((eny)aean).qQ();
            qq.writeString(b);
            qq.writeTypedList((List)list);
            eoa.h(qq, (Parcelable)bundle2);
            eoa.j(qq, (IInterface)mhb);
            ((eny)aean).qT(1, qq);
        }
        catch (final RemoteException ex) {
            aeam.c.l((Throwable)ex, "prewarm(%s)", new Object[] { this.a.b });
            this.b.d((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
