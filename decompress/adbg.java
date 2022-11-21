import java.util.List;
import java.util.Iterator;
import androidx.preference.Preference;
import java.util.Map;
import java.util.ArrayList;
import androidx.preference.ListPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adbg implements ttl
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public adbg(final adbk a, final aocm b, final ProtoDataStoreListPreference c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public adbg(final adbk a, final aocp b, final ListPreference c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public adbg(final xaa b, final ProtoDataStoreListPreference a, final jom c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final void a(final Object o) {
        final int d = this.d;
        if (d == 0) {
            final Object a = this.a;
            final Object b = this.b;
            final Object c = this.c;
            final String s = (String)o;
            final adbk adbk = (adbk)a;
            final aheu h = adbk.h;
            c.getClass();
            adfe.W((Object)s, (aocp)b, adbk, h, new adzx((ListPreference)c));
            return;
        }
        final int n = -1;
        if (d != 1) {
            final Object a2 = this.a;
            final Object b2 = this.b;
            final Object c2 = this.c;
            final String s2 = (String)o;
            final ArrayList list = new ArrayList();
            final Iterator<Object> iterator = ((List<Object>)((aocm)b2).e).iterator();
            while (iterator.hasNext()) {
                for (final aocl aocl : iterator.next().c) {
                    if (aocl.b == 64166933) {
                        list.add(aocl.c);
                    }
                }
            }
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= list.size()) {
                    break;
                }
                if (((aock)list.get(n2)).e.equals(((ListPreference)c2).i)) {
                    n3 = n2;
                    break;
                }
                ++n2;
            }
            final aock aock = (aock)list.get(n3);
            final adbk adbk2 = (adbk)a2;
            if (adbk2.f.t()) {
                final veh d2 = adbk2.d;
                aisc aisc;
                if ((aisc = aock.g) == null) {
                    aisc = aisc.a;
                }
                d2.c(aisc, (Map)afkc.b);
            }
            ((Preference)c2).n((CharSequence)aock.c);
            for (int i = 0; i < list.size(); ++i) {
                adbk2.h.G((aock)list.get(i), i == n3);
            }
            return;
        }
        final Object b3 = this.b;
        final Object a3 = this.a;
        final Object c3 = this.c;
        final String s3 = (String)o;
        final int a4 = jon.a;
        jon.a(twd.b(s3, -1), (xaa)b3);
        ((Preference)a3).n((CharSequence)((jom)c3).c.get(s3));
    }
}
