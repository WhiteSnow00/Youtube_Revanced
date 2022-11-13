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

final class cdd extends Handler
{
    public final WeakReference a;
    
    public cdd(final cdb cdb) {
        this.a = new WeakReference((T)cdb);
    }
    
    public final void handleMessage(final Message message) {
        final cdb cdb = (cdb)this.a.get();
        if (cdb != null) {
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
                        final cdh h = cdb.h;
                        if (h.d == cdb) {
                            final cdc e = h.e(arg2);
                            final pvh o = h.o;
                            if (o != null && e instanceof cch) {
                                final cch cch = (cch)e;
                                final ccp ccp = (ccp)((mvx)o.a).g;
                                if (ccp.q == cch) {
                                    ccp.k(ccp.c(), 2);
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
                        if (cdb.e == 0) {
                            break;
                        }
                        final Bundle bundle2 = (Bundle)bundle.getParcelable("groupRoute");
                        ccc l;
                        if (bundle2 != null) {
                            l = ccc.l(bundle2);
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
                                final ccc k = ccc.l(bundle3.getBundle("mrDescriptor"));
                                final int int1 = bundle3.getInt("selectionState", 1);
                                bundle3.getBoolean("isUnselectable", false);
                                bundle3.getBoolean("isGroupable", false);
                                bundle3.getBoolean("isTransferable", false);
                                o2 = new argj(k, int1);
                            }
                            list.add(o2);
                        }
                        final cdh h2 = cdb.h;
                        if (h2.d != cdb) {
                            break;
                        }
                        final cdc e2 = h2.e(arg2);
                        if (e2 instanceof cdf) {
                            ((cce)e2).k(l, (Collection)list);
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
                        final bku bku = (bku)cdb.g.get(arg1);
                        if (bundle4 != null && bundle4.containsKey("routeId")) {
                            cdb.g.remove(arg1);
                            bku.e(bundle4);
                            return;
                        }
                        bku.d("DynamicGroupRouteController is created without valid route id.", bundle4);
                        return;
                    }
                    case 5: {
                        if (obj != null && !(obj instanceof Bundle)) {
                            break;
                        }
                        final Bundle bundle5 = (Bundle)obj;
                        if (cdb.e != 0) {
                            cdb.h.l(cdb, ccj.a(bundle5));
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
                        final bku bku2 = (bku)cdb.g.get(arg1);
                        if (bku2 != null) {
                            cdb.g.remove(arg1);
                            bku2.d(string, bundle6);
                            return;
                        }
                        break;
                    }
                    case 3: {
                        if (obj != null && !(obj instanceof Bundle)) {
                            break;
                        }
                        final Bundle bundle7 = (Bundle)obj;
                        final bku bku3 = (bku)cdb.g.get(arg1);
                        if (bku3 != null) {
                            cdb.g.remove(arg1);
                            bku3.e(bundle7);
                            return;
                        }
                        break;
                    }
                    case 2: {
                        if (obj != null && !(obj instanceof Bundle)) {
                            break;
                        }
                        final Bundle bundle8 = (Bundle)obj;
                        if (cdb.e != 0 || arg1 != cdb.f || arg2 <= 0) {
                            break;
                        }
                        cdb.f = 0;
                        cdb.e = arg2;
                        cdb.h.l(cdb, ccj.a(bundle8));
                        final cdh h3 = cdb.h;
                        if (h3.d != cdb) {
                            break;
                        }
                        h3.m = true;
                        while (i < h3.b.size()) {
                            ((cdc)h3.b.get(i)).e(h3.d);
                            ++i;
                        }
                        final ccd h4 = ((cci)h3).h;
                        if (h4 != null) {
                            h3.d.c(h4);
                            return;
                        }
                        break;
                    }
                }
            }
            else {
                if (arg1 == cdb.f) {
                    cdb.f = 0;
                    final cdh h5 = cdb.h;
                    if (h5.d == cdb) {
                        h5.o();
                    }
                }
                final bku bku4 = (bku)cdb.g.get(arg1);
                if (bku4 != null) {
                    cdb.g.remove(arg1);
                    bku4.d(null, null);
                }
            }
        }
    }
}
