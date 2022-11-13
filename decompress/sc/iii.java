import android.os.Parcel;
import j$.util.Optional;
import org.json.JSONException;
import com.android.billingclient.api.SkuDetails;
import android.os.Parcelable;
import android.os.Bundle;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.List;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.gms.cast.framework.CastOptions;
import android.content.Context;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iii implements Callable
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final int f;
    
    public iii(final adpx e, final String c, final adps b, final adpq a, final adpw d, final int f) {
        this.f = f;
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public iii(final Context a, final aln b, final zmf e, final gbu d, final asid c, final int f, final byte[] array, final byte[] array2, final byte[] array3) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.e = e;
        this.d = d;
        this.c = c;
    }
    
    public iii(final Context a, final CastOptions b, final mkq d, final mlr e, final mnq c, final int f) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.c = c;
    }
    
    public iii(final Context a, final ScheduledExecutorService c, final FirebaseMessaging b, final agmq e, final agmn d, final int f) {
        this.f = f;
        this.a = a;
        this.c = c;
        this.b = b;
        this.e = e;
        this.d = d;
    }
    
    public iii(final czz a, final String d, final List c, final String e, final dak b, final int f) {
        this.f = f;
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = e;
        this.b = b;
    }
    
    public iii(final iin a, final zme b, final String c, final amao d, final amuj e, final int f) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public iii(final ovp a, final ovr b, final byte[] c, final agnu d, final String e, final int f) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final Object call() {
        switch (this.f) {
            default: {
                final Object a = this.a;
                final Object c = this.c;
                final Object b = this.b;
                final Object e = this.e;
                final Object d = this.d;
                final Context context = (Context)a;
                return new agmy((FirebaseMessaging)b, (agmq)e, agmx.b(context, (Executor)c), (agmn)d, context, (ScheduledExecutorService)c);
            }
            case 6: {
                return ((adpx)this.e).d((String)this.c, (adps)this.b, (adpq)this.a, (adpw)this.d);
            }
            case 5: {
                final Object a2 = this.a;
                final Object b2 = this.b;
                final Object c2 = this.c;
                final Object d2 = this.d;
                final Object e2 = this.e;
                final int n = okt.n;
                ((ovp)a2).h();
                final ovq c3 = ((ovr)b2).c((byte[])c2, (agnu)d2, (String)e2);
                ((ovp)a2).b();
                return c3;
            }
            case 4: {
                final Object a3 = this.a;
                final Object b3 = this.b;
                final Object d3 = this.d;
                final Object e3 = this.e;
                final Object c4 = this.c;
                synchronized (mjt.b) {
                    if (mjt.c == null) {
                        mjt.c = new mjt((Context)a3, (CastOptions)b3, ((mkq)d3).getAdditionalSessionProviders((Context)a3), (mlr)e3, (mnq)c4);
                    }
                    return mjt.c;
                }
            }
            case 3: {
                return ((tmv)((atke)((aln)this.b).c).a()).b.L((asjr)new fdg(((zmf)this.e).c().b(), 17)).p().az().P((asid)this.c).am((asjm)new ink((gbu)this.d, (Context)this.a, 6));
            }
            case 2: {
                final Object a4 = this.a;
                final Object b4 = this.b;
                final Object c5 = this.c;
                final Object d4 = this.d;
                final Object e4 = this.e;
                final amao amao = (amao)d4;
                amas amas2;
                if ((amao.c & 0x400) != 0x0) {
                    amas amas;
                    if ((amas = amao.m) == null) {
                        amas = amas.a;
                    }
                    amas2 = amas;
                }
                else {
                    amas2 = null;
                }
                apyk apyk;
                if ((amao.c & 0x800) != 0x0) {
                    if ((apyk = amao.n) == null) {
                        apyk = apyk.a;
                    }
                }
                else {
                    apyk = null;
                }
                final String l = amao.l;
                amwz amwz;
                if ((amwz = amwz.b(amao.d)) == null) {
                    amwz = amwz.a;
                }
                return ((iin)a4).h((zme)b4, (String)c5, amas2, apyk, l, amwz, amao.i.I(), (amuj)e4);
            }
            case 1: {
                final Object a5 = this.a;
                final Object d5 = this.d;
                final Object c6 = this.c;
                final Object e5 = this.e;
                final Object b5 = this.b;
                final ArrayList list = new ArrayList();
                final int size = ((List)c6).size();
                int i = 0;
            Label_1405:
                while (true) {
                    while (i < size) {
                        final int n2 = i + 20;
                        int n3;
                        if (n2 > size) {
                            n3 = size;
                        }
                        else {
                            n3 = n2;
                        }
                        final ArrayList list2 = new ArrayList(((List)c6).subList(i, n3));
                        final ArrayList<Object> list3 = new ArrayList<Object>();
                        for (int size2 = list2.size(), j = 0; j < size2; ++j) {
                            list3.add(((cyb)list2.get(j)).a);
                        }
                        final Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", (ArrayList)list3);
                        bundle.putString("playBillingLibraryVersion", ((czz)a5).b);
                        String d6 = null;
                        int a6 = 0;
                        Label_1388: {
                            try {
                                Bundle bundle2;
                                if (((czz)a5).h) {
                                    final dau p = ((czz)a5).p;
                                    final String packageName = ((czz)a5).c.getPackageName();
                                    final Bundle b6 = dam.b(((czz)a5).e, ((czz)a5).n, ((czz)a5).b, (String)e5, list2);
                                    final Parcel qw = ((enz)p).qW();
                                    qw.writeInt(10);
                                    qw.writeString(packageName);
                                    qw.writeString((String)d5);
                                    eob.h(qw, (Parcelable)bundle);
                                    eob.h(qw, (Parcelable)b6);
                                    final Parcel qx = ((enz)p).qX(901, qw);
                                    bundle2 = (Bundle)eob.a(qx, Bundle.CREATOR);
                                    qx.recycle();
                                }
                                else {
                                    final dau p2 = ((czz)a5).p;
                                    final String packageName2 = ((czz)a5).c.getPackageName();
                                    final Parcel qw2 = ((enz)p2).qW();
                                    qw2.writeInt(3);
                                    qw2.writeString(packageName2);
                                    qw2.writeString((String)d5);
                                    eob.h(qw2, (Parcelable)bundle);
                                    final Parcel qx2 = ((enz)p2).qX(2, qw2);
                                    bundle2 = (Bundle)eob.a(qx2, Bundle.CREATOR);
                                    qx2.recycle();
                                }
                                final int n4 = 4;
                                if (bundle2 == null) {
                                    dam.f("BillingClient", "querySkuDetailsAsync got null sku details list");
                                    d6 = "Item is unavailable for purchase.";
                                    a6 = n4;
                                }
                                else if (!bundle2.containsKey("DETAILS_LIST")) {
                                    a6 = dam.a(bundle2, "BillingClient");
                                    d6 = dam.d(bundle2, "BillingClient");
                                    if (a6 != 0) {
                                        final StringBuilder sb = new StringBuilder("getSkuDetails() failed. Response code: ");
                                        sb.append(a6);
                                        dam.f("BillingClient", sb.toString());
                                        final ArrayList list4 = list;
                                        break Label_1405;
                                    }
                                    dam.f("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                                    a6 = 6;
                                    final ArrayList list4 = list;
                                    break Label_1405;
                                }
                                else {
                                    final ArrayList stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList != null) {
                                        int k = 0;
                                        while (k < stringArrayList.size()) {
                                            final String s = stringArrayList.get(k);
                                            try {
                                                final SkuDetails skuDetails = new SkuDetails(s);
                                                skuDetails.toString();
                                                final int a7 = dam.a;
                                                list.add(skuDetails);
                                                ++k;
                                                continue;
                                            }
                                            catch (final JSONException ex) {
                                                dam.g("BillingClient", "Got a JSON exception trying to decode SkuDetails.", (Throwable)ex);
                                                d6 = "Error trying to decode SkuDetails.";
                                                a6 = 6;
                                                break Label_1388;
                                            }
                                            break;
                                        }
                                        i = n2;
                                        continue;
                                    }
                                    dam.f("BillingClient", "querySkuDetailsAsync got null response list");
                                    d6 = "Item is unavailable for purchase.";
                                    a6 = n4;
                                }
                            }
                            catch (final Exception ex2) {
                                dam.g("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", (Throwable)ex2);
                                d6 = "Service connection is disconnected.";
                                a6 = -1;
                            }
                        }
                        final ArrayList list4 = null;
                        ((dak)b5).c(cjf.c(a6, d6), (List)list4);
                        return null;
                    }
                    String d6 = "";
                    int a6 = 0;
                    final ArrayList list4 = list;
                    continue Label_1405;
                }
            }
            case 0: {
                final Object a8 = this.a;
                final Object b7 = this.b;
                final Object c7 = this.c;
                final Object d7 = this.d;
                final Object e6 = this.e;
                final iin iin = (iin)a8;
                final aaeh aaeh = (aaeh)fex.k(iin.h, (zme)b7).orElse((Object)null);
                Optional optional;
                if (aaeh == null) {
                    final aaby b8 = aabz.c.b();
                    b8.b = 35;
                    optional = Optional.of((Object)b8.a());
                }
                else {
                    final zvo b9 = aaeh.B();
                    if (b9 == null) {
                        final aaby b10 = aabz.c.b();
                        b10.b = 15;
                        optional = Optional.of((Object)b10.a());
                    }
                    else {
                        final String s2 = (String)c7;
                        final aabf t = b9.t(s2);
                        if (t != null && !t.q()) {
                            final zaz zaz = (zaz)iin.g.a();
                            if (iin.q(t, zaz) && (!t.b() || iin.r(t, zaz) || t.r() || t.p())) {
                                aaeh.k().c(s2);
                                b9.ac(s2, aaaq.c);
                                b9.C(s2);
                                aaeh.l().v(s2, true);
                            }
                            else if (!t.e) {
                                b9.K(s2);
                                aaeh.l().v(s2, false);
                            }
                            aabz aabz;
                            if (iin.i.f(45379427L)) {
                                aabz = iin.e(s2, (amuj)e6);
                            }
                            else if (iin.i.f(45379765L)) {
                                aabz = aabz.a;
                            }
                            else {
                                final Optional empty = Optional.empty();
                                amwz amwz2;
                                if ((amwz2 = amwz.b(((amao)d7).d)) == null) {
                                    amwz2 = amwz.a;
                                }
                                aabz = iin.g(s2, empty, amwz2);
                            }
                            optional = Optional.of((Object)aabz);
                        }
                        else {
                            optional = Optional.empty();
                        }
                    }
                }
                return optional;
            }
        }
    }
}
