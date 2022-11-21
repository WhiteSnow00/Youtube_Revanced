import android.os.Parcel;
import java.util.Iterator;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.List;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class aefo extends aeeo
{
    final Collection a;
    final Collection b;
    final aefq c;
    final noj d;
    final aefs e;
    
    public aefo(final aefq c, final noj noj, final Collection a, final Collection b, final aefs e, final noj d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.e = e;
        this.d = d;
        super(noj, null);
    }
    
    @Override
    protected final void a() {
        final Collection a = this.a;
        final ArrayList list = new ArrayList<Object>(a.size());
        for (final String s : a) {
            final Bundle bundle = new Bundle();
            bundle.putString("module_name", s);
            list.add(bundle);
        }
        final Collection b = this.b;
        final ArrayList list2 = new ArrayList<Bundle>(b.size());
        for (final String s2 : b) {
            final Bundle bundle2 = new Bundle();
            bundle2.putString("language", s2);
            list2.add(bundle2);
        }
        list.addAll((Collection<?>)list2);
        try {
            this.e.l(2);
            final aefq c = this.c;
            final aefv aefv = (aefv)c.b.k;
            final String a2 = c.a;
            final aefs e = this.e;
            final Bundle bundle3 = new Bundle();
            bundle3.putInt("playcore_version_code", 11004);
            final ArrayList<Bundle> list3 = new ArrayList<Bundle>();
            for (final aedh aedh : e.a) {
                final Bundle bundle4 = new Bundle();
                bundle4.putInt("event_type", aedh.a);
                bundle4.putLong("event_timestamp", aedh.b);
                list3.add(bundle4);
            }
            bundle3.putParcelableArrayList("event_timestamps", new ArrayList((Collection<? extends E>)list3));
            final aefp aefp = new aefp(this.c, this.d, null);
            final Parcel qv = aefv.qV();
            qv.writeString(a2);
            qv.writeTypedList((List)list);
            eoe.h(qv, (Parcelable)bundle3);
            eoe.j(qv, (IInterface)aefp);
            aefv.qY(2, qv);
        }
        catch (final RemoteException ex) {
            aefq.c.i((Throwable)ex, "startInstall(%s,%s)", this.a, this.b);
            this.d.c((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
