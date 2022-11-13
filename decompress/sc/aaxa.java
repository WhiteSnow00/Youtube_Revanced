import android.content.Context;
import android.accounts.Account;
import android.net.Uri;
import android.util.Pair;
import io.grpc.Status;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Callable;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.app.Activity;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaxa implements Runnable
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;
    
    public aaxa(final aaxc b, final MessageLite d, final ahab a, final alhi c, final int e) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public aaxa(final aaxc a, final wzz b, final aqss c, final alhi d, final int e) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public aaxa(final abko b, final String c, final aezp a, final afaq d, final int e) {
        this.e = e;
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public aaxa(final abnf a, final String d, final String c, final Activity b, final int e) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public aaxa(final abqm d, final PlayerResponseModel b, final abnm a, final abvb c, final int e) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public aaxa(final acqb c, final Callable b, final acqb d, final CountDownLatch a, final int e, final byte[] array, final byte[] array2) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public aaxa(final arfi a, final Callable d, final acqb b, final CountDownLatch c, final int e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public aaxa(final arzg d, final Status a, final asad c, final arwk b, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aaxa(final asbb c, final Status a, final asad d, final arwk b, final int e) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public aaxa(final asfb c, final Status a, final asad d, final arwk b, final int e) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public aaxa(final asfp d, final atib b, final asfo a, final Object c, final int e, final byte[] array) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void run() {
    Label_0783_Outer:
        while (true) {
            Label_0985: {
                switch (this.e) {
                    default: {
                        break Label_0783_Outer;
                    }
                    case 11: {
                        break Label_0783_Outer;
                    }
                    case 10: {
                        break Label_0243;
                    }
                    case 9: {
                        break Label_0985;
                    }
                    case 8: {
                        break Label_0985;
                    }
                    case 7: {
                        break Label_0985;
                    }
                    case 6: {
                        break Label_0985;
                    }
                    case 5: {
                        break Label_0985;
                    }
                    case 4: {
                        break Label_0985;
                    }
                    case 3: {
                        break Label_0985;
                    }
                    case 2: {
                        break Label_0985;
                    }
                    case 1: {
                        break Label_0985;
                    }
                    case 0: {
                        Label_1039: {
                            break Label_1039;
                            try {
                                ((acqb)this.c).a = ((Callable<Object>)this.b).call();
                                break Label_1039;
                                asfe.w(((asfb)this.c).b);
                                ((asfb)this.c).b.u.a((Status)this.a, (asad)this.d, (arwk)this.b);
                                return;
                                ((arzg)this.d).d((Status)this.a, (asad)this.c, (arwk)this.b);
                                return;
                                final Object a = this.a;
                                final Object d = this.d;
                                final Object b = this.b;
                                final Object c = this.c;
                                try {
                                    ((arfi)a).a = ((Callable<Object>)d).call();
                                }
                                catch (final Exception a2) {
                                    ((acqb)b).a = a2;
                                }
                                tca c4 = null;
                            Block_5:
                                while (true) {
                                    Label_0781: {
                                        Label_0610: {
                                            break Label_0610;
                                            final Object b2 = this.b;
                                            final Object c2 = this.c;
                                            final Object a3 = this.a;
                                            final Object d2 = this.d;
                                            synchronized (((abko)b2).b) {
                                                if (((abko)b2).c((Pair)((abko)b2).b.get(c2))) {
                                                    return;
                                                }
                                                ((abko)b2).d.d((Object)new aami());
                                                if (((aezp)a3).h()) {
                                                    ((xan)((aezp)a3).c()).c("pl_efa");
                                                }
                                                ((abko)b2).b.put(c2, (Object)Pair.create(((afaq)d2).a(), (Object)(((abko)b2).c.d() + abko.a)));
                                                return;
                                            }
                                            break Label_0985;
                                            final Object a4 = this.a;
                                            final Object d3 = this.d;
                                            final Object c3 = this.c;
                                            c4 = tca.c((Activity)this.b, (tcc)((abnf)a4).f);
                                            final String concat = "weblogin:continue=".concat(String.valueOf(Uri.encode((String)d3)));
                                            try {
                                                final Activity activity = (Activity)((abnf)a4).a.get();
                                                if (activity != null) {
                                                    final String e = mia.e((Context)activity, new Account((String)c3, "com.mgoogle"), concat);
                                                    break Label_0783;
                                                }
                                            }
                                            catch (final Exception ex) {
                                                ((tcc)c4).sd((Object)null, ex);
                                            }
                                            break Label_0781;
                                            asfe.w(((asfb)this.c).b);
                                            ((asfb)this.c).b.u.a((Status)this.a, (asad)this.d, (arwk)this.b);
                                            return;
                                            String e = null;
                                            iftrue(Label_0802:)(e != null);
                                            break Block_5;
                                            ((abqm)this.d).e.c((PlayerResponseModel)this.b, ((abnm)this.a).b, (abvb)this.c);
                                            return;
                                            ((asbb)this.c).a.a((Status)this.a, (asad)this.d, (arwk)this.b);
                                            return;
                                        }
                                        ((CountDownLatch)c).countDown();
                                        return;
                                        asfe.w(((asfb)this.c).b);
                                        ((asfb)this.c).b.u.a((Status)this.a, (asad)this.d, (arwk)this.b);
                                        return;
                                        Label_0802: {
                                            final String e;
                                            ((tcc)c4).b((Object)null, (Object)e);
                                        }
                                        return;
                                        ((aaxc)this.a).a.u((wzz)this.b, (aqss)this.c, (alhi)this.d);
                                        return;
                                        synchronized (this.d) {
                                            if (((atib)this.b).a == 0) {
                                                try {
                                                    ((asfo)this.a).b(this.c);
                                                }
                                                finally {
                                                    ((asfp)this.d).a.remove(this.a);
                                                    if (((asfp)this.d).a.isEmpty()) {
                                                        ((asfp)this.d).b.shutdown();
                                                        asfp.c((asfp)this.d);
                                                    }
                                                }
                                            }
                                            return;
                                        }
                                        continue Label_0783_Outer;
                                        ((aaxc)this.b).a.v((MessageLite)this.d, (ahab)this.a, (alhi)this.c);
                                        return;
                                    }
                                    final String e = null;
                                    continue;
                                }
                                ((tcc)c4).sd((Object)null, new Exception());
                                return;
                            }
                            catch (final Exception a5) {
                                ((acqb)this.d).a = a5;
                            }
                        }
                        ((CountDownLatch)this.a).countDown();
                    }
                }
            }
            break;
        }
    }
}
