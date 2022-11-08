import java.util.Map;
import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import android.view.LayoutInflater;
import android.content.ContextWrapper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class aenz implements arix
{
    private volatile Object a;
    private final Object b;
    private final br c;
    private final boolean d;
    
    public aenz(final br c, final boolean d) {
        this.b = new Object();
        this.c = c;
        this.d = d;
    }
    
    public static ContextWrapper c(final Context context, final br br) {
        return new aeoa(context, br);
    }
    
    public static ContextWrapper d(final LayoutInflater layoutInflater, final br br) {
        return new aeoa(layoutInflater, br);
    }
    
    public static final void e(final br br, final AccountId accountId) {
        accountId.getClass();
        final int a = accountId.a();
        agot.F(a >= 0, "AccountId is invalid: %s", a);
        arin.g(br);
        br.m.putInt("TIKTOK_FRAGMENT_ACCOUNT_ID", a);
    }
    
    protected void a(final br br) {
        final Bundle m = br.m;
        if (m != null) {
            agot.v(m.getBoolean("TIKTOK_FRAGMENT_NO_ACCOUNT_ONLY") ^ true, (Object)"Account-scoped Fragment cannot be instantiated with an argument bundle marking it as no-Account only. If you are using NoAccountNavigation, you must switch to AccountNavigation to navigate to this fragment.");
        }
    }
    
    @Override
    public final Object aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    final br c = this.c;
                    c.O().getClass();
                    agot.G(c.O() instanceof arix, "Sting Fragments must be attached to an @Sting Activity. Found: %s", (Object)c.O().getClass());
                    this.a(this.c);
                    final Bundle m = this.c.m;
                    AccountId b;
                    final AccountId accountId = b = null;
                    if (m != null) {
                        b = accountId;
                        if (m.containsKey("TIKTOK_FRAGMENT_ACCOUNT_ID")) {
                            b = AccountId.b(m.getInt("TIKTOK_FRAGMENT_ACCOUNT_ID"));
                        }
                    }
                    if (this.d) {
                        b.getClass();
                    }
                    AccountId accountId2 = b;
                    if (((aexq)((aenx)aqqm.k(this.c.O(), (Class)aenx.class)).xF().a).h()) {
                        final aexq at = ((aeny)aqqm.k(this.c.O(), (Class)aeny.class)).aT();
                        if (b == null) {
                            final AccountId accountId3 = (AccountId)at.f();
                            if ((accountId2 = accountId3) != null) {
                                accountId2 = accountId3;
                                if (accountId3.a() != -1) {
                                    e(this.c, accountId3);
                                    accountId2 = accountId3;
                                }
                            }
                        }
                        else {
                            agot.E(at.h(), (Object)"There is no propagated account id. Did you forget to add one of the account modules:\n\t\"//java/com/google/apps/tiktok/account:module\",\n\t\"//java/com/google/apps/tiktok/account/testing:module\",");
                            accountId2 = b;
                            if (((AccountId)at.c()).a() != -1) {
                                agot.J(at.c().equals(b), "The given account id does not match the propagated account id.\n\tPropagated AccountId: %s\n\tGiven AccountId: %s", at.c(), (Object)b);
                                accountId2 = b;
                            }
                        }
                    }
                    final agp xl = ((aenv)aqqm.k(this.c.O(), (Class)aenv.class)).xL();
                    Object o = xl.b;
                    synchronized (o) {
                        if (!((Map)xl.e).containsKey(accountId2)) {
                            ((Map<AccountId, Object>)xl.e).put(accountId2, xl.f(accountId2));
                        }
                        final Object value = ((Map<K, Object>)xl.e).get(accountId2);
                        monitorexit(o);
                        final tyh bi = ((aenw)aqqm.k(value, (Class)aenw.class)).bi();
                        aqzg.z(bi.e = this.c, (Class)br.class);
                        o = bi.c;
                        this.a = new eso((eqv)o, (esr)bi.b, (esl)bi.a, (esk)bi.d, (br)bi.e);
                    }
                }
            }
        }
        return this.a;
    }
}
