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

final class aebu extends aeau
{
    final /* synthetic */ Collection a;
    final /* synthetic */ Collection b;
    final /* synthetic */ aebw c;
    final /* synthetic */ nmo d;
    final /* synthetic */ adcr e;
    
    public aebu(final aebw c, final nmo nmo, final Collection a, final Collection b, final adcr e, final nmo d, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.e = e;
        this.d = d;
        super(nmo, (byte[])null);
    }
    
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
            this.e.o(2);
            final aebw c = this.c;
            final aecb aecb = (aecb)c.b.k;
            final String a2 = c.a;
            final adcr e = this.e;
            final Bundle bundle3 = new Bundle();
            bundle3.putInt("playcore_version_code", 11004);
            final ArrayList<Bundle> list3 = new ArrayList<Bundle>();
            for (final adzn adzn : e.a) {
                final Bundle bundle4 = new Bundle();
                bundle4.putInt("event_type", adzn.a);
                bundle4.putLong("event_timestamp", adzn.b);
                list3.add(bundle4);
            }
            bundle3.putParcelableArrayList("event_timestamps", new ArrayList((Collection<? extends E>)list3));
            final aebv aebv = new aebv(this.c, this.d, null);
            final Parcel qq = ((eny)aecb).qQ();
            qq.writeString(a2);
            qq.writeTypedList((List)list);
            eoa.h(qq, (Parcelable)bundle3);
            eoa.j(qq, (IInterface)aebv);
            ((eny)aecb).qT(2, qq);
        }
        catch (final RemoteException ex) {
            aebw.c.l((Throwable)ex, "startInstall(%s,%s)", new Object[] { this.a, this.b });
            this.d.d((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
