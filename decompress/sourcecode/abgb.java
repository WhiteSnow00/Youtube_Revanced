import java.util.function.Function;
import j$.util.Map$_EL;
import java.util.Iterator;
import java.util.List;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abgb implements yof
{
    public volatile abxq b;
    public final Map c;
    public volatile abgf d;
    
    public abgb(final asgt asgt) {
        this.c = new HashMap();
        final asib asib = new asib();
        asib.c(asgt.j(aajj.r(1)).al((asix)new abfy(this, 5)));
        asib.c(aajj.p(asgt, (aexg)abbn.g).al((asix)new abfy(this, 6)));
    }
    
    public final Uri a(final FormatStreamModel formatStreamModel, final long n, final long n2) {
        monitorenter(this);
        try {
            if (this.b == null || n < 0L || n2 < 0L) {
                monitorexit(this);
                return null;
            }
            abxp abxp;
            if ((abxp = this.b.n(n2)) == null) {
                abxp = this.b.n(n2 + 3000L);
                if (abxp == null) {
                    monitorexit(this);
                    return null;
                }
            }
            final String i = abxp.c.i;
            if (i != null && this.d.c(i)) {
                monitorexit(this);
                return null;
            }
            final PlayerResponseModel f = abxp.f;
            if (f != null && f.n() != null) {
                final List q = f.n().q;
                final int e = formatStreamModel.e();
                for (FormatStreamModel formatStreamModel2 : q) {
                    if (formatStreamModel2.e() == e) {
                        final tte b = tte.b(formatStreamModel2.d);
                        final arzw arzw = this.c.get(n - 1L);
                        Object o = null;
                        Label_0329: {
                            if (arzw != null) {
                                if (formatStreamModel.P() && !((String)arzw.c).isEmpty()) {
                                    o = arzw.c;
                                    break Label_0329;
                                }
                                if (formatStreamModel.z() && !((String)arzw.a).isEmpty()) {
                                    o = arzw.a;
                                    break Label_0329;
                                }
                                if (!formatStreamModel.z() && !formatStreamModel.P() && !((String)arzw.b).isEmpty()) {
                                    o = arzw.b;
                                    break Label_0329;
                                }
                            }
                            o = "";
                        }
                        if (!((String)o).isEmpty()) {
                            b.g("daistate", (String)o);
                        }
                        final afcr o2 = afcr.o((Collection)abxp.c.b);
                        String join;
                        if (o2.isEmpty()) {
                            join = "";
                        }
                        else {
                            final ArrayList list = new ArrayList();
                            for (int size = ((List)o2).size(), j = 0; j < size; ++j) {
                                list.add(((abxp)((List)o2).get(j)).e);
                            }
                            join = TextUtils.join((CharSequence)",", (Iterable)list);
                        }
                        if (!join.isEmpty()) {
                            b.i("acpns", join, ",");
                        }
                        final Uri a = b.a();
                        monitorexit(this);
                        return a;
                    }
                }
                monitorexit(this);
                return null;
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b(final aakb aakb) {
        monitorenter(this);
        if (aakb == null) {
            monitorexit(this);
            return;
        }
        try {
            final aaka e = aakb.e();
            String d;
            if (e != null) {
                d = e.a.d("Serialized-State");
            }
            else {
                d = null;
            }
            if (d == null || aakb.b() <= 0L) {
                return;
            }
            final arzw arzw = (arzw)Map$_EL.computeIfAbsent(this.c, (Object)aakb.b(), (Function)zxk.i);
            if (aakb.h()) {
                arzw.c = d;
                return;
            }
            if (aakb.g()) {
                arzw.a = d;
                return;
            }
            arzw.b = d;
        }
        finally {
            monitorexit(this);
        }
    }
}
