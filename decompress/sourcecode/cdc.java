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

final class cdc extends Handler
{
    public final WeakReference a;
    
    public cdc(final cda cda) {
        this.a = new WeakReference((T)cda);
    }
    
    public final void handleMessage(final Message message) {
        final cda cda = (cda)this.a.get();
        if (cda != null) {
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
                        final cdg h = cda.h;
                        if (h.d == cda) {
                            final cdb e = h.e(arg2);
                            final qpt o = h.o;
                            if (o != null && e instanceof ccg) {
                                final ccg ccg = (ccg)e;
                                final cco cco = (cco)((mus)o.a).g;
                                if (cco.q == ccg) {
                                    cco.k(cco.c(), 2);
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
                        if (cda.e == 0) {
                            break;
                        }
                        final Bundle bundle2 = (Bundle)bundle.getParcelable("groupRoute");
                        ccb l;
                        if (bundle2 != null) {
                            l = ccb.l(bundle2);
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
                                final ccb k = ccb.l(bundle3.getBundle("mrDescriptor"));
                                final int int1 = bundle3.getInt("selectionState", 1);
                                bundle3.getBoolean("isUnselectable", false);
                                bundle3.getBoolean("isGroupable", false);
                                bundle3.getBoolean("isTransferable", false);
                                o2 = new ardu(k, int1);
                            }
                            list.add(o2);
                        }
                        final cdg h2 = cda.h;
                        if (h2.d != cda) {
                            break;
                        }
                        final cdb e2 = h2.e(arg2);
                        if (e2 instanceof cde) {
                            ((ccd)e2).k(l, list);
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
                        final bkt bkt = (bkt)cda.g.get(arg1);
                        if (bundle4 != null && bundle4.containsKey("routeId")) {
                            cda.g.remove(arg1);
                            bkt.e(bundle4);
                            return;
                        }
                        bkt.d("DynamicGroupRouteController is created without valid route id.", bundle4);
                        return;
                    }
                    case 5: {
                        if (obj != null && !(obj instanceof Bundle)) {
                            break;
                        }
                        final Bundle bundle5 = (Bundle)obj;
                        if (cda.e != 0) {
                            cda.h.l(cda, cci.a(bundle5));
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
                        final bkt bkt2 = (bkt)cda.g.get(arg1);
                        if (bkt2 != null) {
                            cda.g.remove(arg1);
                            bkt2.d(string, bundle6);
                            return;
                        }
                        break;
                    }
                    case 3: {
                        if (obj != null && !(obj instanceof Bundle)) {
                            break;
                        }
                        final Bundle bundle7 = (Bundle)obj;
                        final bkt bkt3 = (bkt)cda.g.get(arg1);
                        if (bkt3 != null) {
                            cda.g.remove(arg1);
                            bkt3.e(bundle7);
                            return;
                        }
                        break;
                    }
                    case 2: {
                        if (obj != null && !(obj instanceof Bundle)) {
                            break;
                        }
                        final Bundle bundle8 = (Bundle)obj;
                        if (cda.e != 0 || arg1 != cda.f || arg2 <= 0) {
                            break;
                        }
                        cda.f = 0;
                        cda.e = arg2;
                        cda.h.l(cda, cci.a(bundle8));
                        final cdg h3 = cda.h;
                        if (h3.d != cda) {
                            break;
                        }
                        h3.m = true;
                        while (i < h3.b.size()) {
                            ((cdb)h3.b.get(i)).e(h3.d);
                            ++i;
                        }
                        final ccc h4 = h3.h;
                        if (h4 != null) {
                            h3.d.c(h4);
                            return;
                        }
                        break;
                    }
                }
            }
            else {
                if (arg1 == cda.f) {
                    cda.f = 0;
                    final cdg h5 = cda.h;
                    if (h5.d == cda) {
                        h5.o();
                    }
                }
                final bkt bkt4 = (bkt)cda.g.get(arg1);
                if (bkt4 != null) {
                    cda.g.remove(arg1);
                    bkt4.d((String)null, (Bundle)null);
                }
            }
        }
    }
}
