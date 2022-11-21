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

public final class abjc implements yrz
{
    public volatile acbc b;
    public final Map c;
    public volatile abjh d;
    
    public abjc(final aske aske) {
        this.c = new HashMap();
        final aslm aslm = new aslm();
        aslm.c(aske.j(aana.q(1)).am((asmi)new abgi(this, 15)));
        aslm.c(aana.o(aske, (afax)abej.j).am((asmi)new abgi(this, 16)));
    }
    
    public final Uri a(final FormatStreamModel formatStreamModel, final long n, final long n2) {
        monitorenter(this);
        try {
            if (this.b == null || n < 0L || n2 < 0L) {
                monitorexit(this);
                return null;
            }
            acbb acbb;
            if ((acbb = this.b.n(n2)) == null) {
                acbb = this.b.n(n2 + 3000L);
                if (acbb == null) {
                    monitorexit(this);
                    return null;
                }
            }
            final String i = acbb.c.i;
            if (i != null && this.d.c(i)) {
                monitorexit(this);
                return null;
            }
            final PlayerResponseModel f = acbb.f;
            if (f != null && f.n() != null) {
                final List q = f.n().q;
                final int e = formatStreamModel.e();
                for (FormatStreamModel formatStreamModel2 : q) {
                    if (formatStreamModel2.e() == e) {
                        final twk b = twk.b(formatStreamModel2.d);
                        final asdz asdz = this.c.get(n - 1L);
                        Object o = null;
                        Label_0329: {
                            if (asdz != null) {
                                if (formatStreamModel.P() && !((String)asdz.c).isEmpty()) {
                                    o = asdz.c;
                                    break Label_0329;
                                }
                                if (formatStreamModel.z() && !((String)asdz.a).isEmpty()) {
                                    o = asdz.a;
                                    break Label_0329;
                                }
                                if (!formatStreamModel.z() && !formatStreamModel.P() && !((String)asdz.b).isEmpty()) {
                                    o = asdz.b;
                                    break Label_0329;
                                }
                            }
                            o = "";
                        }
                        if (!((String)o).isEmpty()) {
                            b.g("daistate", (String)o);
                        }
                        final afgh o2 = afgh.o(acbb.c.b);
                        String join;
                        if (o2.isEmpty()) {
                            join = "";
                        }
                        else {
                            final ArrayList list = new ArrayList();
                            for (int size = o2.size(), j = 0; j < size; ++j) {
                                list.add(((acbb)o2.get(j)).e);
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
    
    public final void b(final aans aans) {
        monitorenter(this);
        if (aans == null) {
            monitorexit(this);
            return;
        }
        try {
            final aanr e = aans.e();
            String d;
            if (e != null) {
                d = e.a.d("Serialized-State");
            }
            else {
                d = null;
            }
            if (d == null || aans.b() <= 0L) {
                return;
            }
            final asdz asdz = (asdz)Map$_EL.computeIfAbsent(this.c, (Object)aans.b(), (Function)zzl.l);
            if (aans.h()) {
                asdz.c = d;
                return;
            }
            if (aans.g()) {
                asdz.a = d;
                return;
            }
            asdz.b = d;
        }
        finally {
            monitorexit(this);
        }
    }
}
