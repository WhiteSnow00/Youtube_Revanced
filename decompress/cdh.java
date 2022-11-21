import android.util.Log;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.Message;
import java.lang.ref.WeakReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class cdh extends Handler
{
    public final WeakReference a;
    
    public cdh(final cdf cdf) {
        this.a = new WeakReference((T)cdf);
    }
    
    public final void handleMessage(final Message message) {
        final cdf cdf = (cdf)this.a.get();
        if (cdf != null) {
            final int what = message.what;
            final int arg1 = message.arg1;
            final int arg2 = message.arg2;
            final Object obj = message.obj;
            final Bundle peekData = message.peekData();
            String string = null;
            int i = 0;
            if (what != 0) {
                switch (what) {
                    case 8: {
                        final cdl h = cdf.h;
                        if (h.d == cdf) {
                            final cdg e = h.e(arg2);
                            final oqz o = h.o;
                            if (o != null && e instanceof cck) {
                                final cck cck = (cck)e;
                                final ccs ccs = (ccs)((mwm)o.a).g;
                                if (ccs.q == cck) {
                                    ccs.k(ccs.c(), 2);
                                }
                            }
                            h.m(e);
                            return;
                        }
                        break;
                    }
                    case 7: {
                        if (obj != null && !(obj instanceof Bundle)) {
                            break;
                        }
                        final Bundle bundle = (Bundle)obj;
                        if (cdf.e == 0) {
                            break;
                        }
                        final Bundle bundle2 = (Bundle)bundle.getParcelable("groupRoute");
                        ccf l;
                        if (bundle2 != null) {
                            l = ccf.l(bundle2);
                        }
                        else {
                            l = null;
                        }
                        final ArrayList parcelableArrayList = bundle.getParcelableArrayList("dynamicRoutes");
                        final ArrayList list = new ArrayList();
                        for (int size = parcelableArrayList.size(), j = 0; j < size; ++j) {
                            final Bundle bundle3 = (Bundle)parcelableArrayList.get(j);
                            Object o2;
                            if (bundle3 == null) {
                                o2 = null;
                            }
                            else {
                                final ccf k = ccf.l(bundle3.getBundle("mrDescriptor"));
                                final int int1 = bundle3.getInt("selectionState", 1);
                                bundle3.getBoolean("isUnselectable", false);
                                bundle3.getBoolean("isGroupable", false);
                                bundle3.getBoolean("isTransferable", false);
                                o2 = new arjd(k, int1);
                            }
                            list.add(o2);
                        }
                        final cdl h2 = cdf.h;
                        if (h2.d != cdf) {
                            break;
                        }
                        final cdg e2 = h2.e(arg2);
                        if (e2 instanceof cdj) {
                            ((cch)e2).k(l, list);
                            return;
                        }
                        break;
                    }
                    case 6: {
                        if (!(obj instanceof Bundle)) {
                            Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                            return;
                        }
                        final Bundle bundle4 = (Bundle)obj;
                        final bky bky = (bky)cdf.g.get(arg1);
                        if (bundle4 != null && bundle4.containsKey("routeId")) {
                            cdf.g.remove(arg1);
                            bky.e(bundle4);
                            return;
                        }
                        bky.d("DynamicGroupRouteController is created without valid route id.", bundle4);
                        return;
                    }
                    case 5: {
                        if (obj != null && !(obj instanceof Bundle)) {
                            break;
                        }
                        final Bundle bundle5 = (Bundle)obj;
                        if (cdf.e != 0) {
                            cdf.h.l(cdf, ccm.a(bundle5));
                            return;
                        }
                        break;
                    }
                    case 4: {
                        if (obj != null && !(obj instanceof Bundle)) {
                            break;
                        }
                        if (peekData != null) {
                            string = peekData.getString("error");
                        }
                        final Bundle bundle6 = (Bundle)obj;
                        final bky bky2 = (bky)cdf.g.get(arg1);
                        if (bky2 != null) {
                            cdf.g.remove(arg1);
                            bky2.d(string, bundle6);
                            return;
                        }
                        break;
                    }
                    case 3: {
                        if (obj != null && !(obj instanceof Bundle)) {
                            break;
                        }
                        final Bundle bundle7 = (Bundle)obj;
                        final bky bky3 = (bky)cdf.g.get(arg1);
                        if (bky3 != null) {
                            cdf.g.remove(arg1);
                            bky3.e(bundle7);
                            return;
                        }
                        break;
                    }
                    case 2: {
                        if (obj != null && !(obj instanceof Bundle)) {
                            break;
                        }
                        final Bundle bundle8 = (Bundle)obj;
                        if (cdf.e != 0 || arg1 != cdf.f || arg2 <= 0) {
                            break;
                        }
                        cdf.f = 0;
                        cdf.e = arg2;
                        cdf.h.l(cdf, ccm.a(bundle8));
                        final cdl h3 = cdf.h;
                        if (h3.d != cdf) {
                            break;
                        }
                        h3.m = true;
                        while (i < h3.b.size()) {
                            ((cdg)h3.b.get(i)).e(h3.d);
                            ++i;
                        }
                        final ccg h4 = h3.h;
                        if (h4 != null) {
                            h3.d.c(h4);
                            return;
                        }
                        break;
                    }
                }
            }
            else {
                if (arg1 == cdf.f) {
                    cdf.f = 0;
                    final cdl h5 = cdf.h;
                    if (h5.d == cdf) {
                        h5.o();
                    }
                }
                final bky bky4 = (bky)cdf.g.get(arg1);
                if (bky4 != null) {
                    cdf.g.remove(arg1);
                    bky4.d(null, null);
                }
            }
        }
    }
}
