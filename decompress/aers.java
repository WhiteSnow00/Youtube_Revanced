import java.util.Map;
import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import android.view.LayoutInflater;
import android.content.ContextWrapper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class aers implements arog
{
    private volatile Object a;
    private final Object b;
    private final br c;
    private final boolean d;
    
    public aers(final br c, final boolean d) {
        this.b = new Object();
        this.c = c;
        this.d = d;
    }
    
    public static ContextWrapper c(final Context context, final br br) {
        return new aert(context, br);
    }
    
    public static ContextWrapper d(final LayoutInflater layoutInflater, final br br) {
        return new aert(layoutInflater, br);
    }
    
    public static final void e(final br br, final AccountId accountId) {
        accountId.getClass();
        final int a = accountId.a();
        adme.V(a >= 0, "AccountId is invalid: %s", a);
        arnw.g(br);
        br.m.putInt("TIKTOK_FRAGMENT_ACCOUNT_ID", a);
    }
    
    protected void a(final br br) {
        final Bundle m = br.m;
        if (m != null) {
            adme.L(m.getBoolean("TIKTOK_FRAGMENT_NO_ACCOUNT_ONLY") ^ true, "Account-scoped Fragment cannot be instantiated with an argument bundle marking it as no-Account only. If you are using NoAccountNavigation, you must switch to AccountNavigation to navigate to this fragment.");
        }
    }
    
    @Override
    public final Object aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    final br c = this.c;
                    c.mH().getClass();
                    adme.W(c.mH() instanceof arog, "Sting Fragments must be attached to an @Sting Activity. Found: %s", c.mH().getClass());
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
                    if (((afbh)((aerq)aqvs.i(this.c.mH(), (Class)aerq.class)).xQ().b).h()) {
                        final afbh au = ((aerr)aqvs.i(this.c.mH(), (Class)aerr.class)).aU();
                        if (b == null) {
                            final AccountId accountId3 = (AccountId)au.f();
                            if ((accountId2 = accountId3) != null) {
                                accountId2 = accountId3;
                                if (accountId3.a() != -1) {
                                    e(this.c, accountId3);
                                    accountId2 = accountId3;
                                }
                            }
                        }
                        else {
                            adme.U(au.h(), "There is no propagated account id. Did you forget to add one of the account modules:\n\t\"//java/com/google/apps/tiktok/account:module\",\n\t\"//java/com/google/apps/tiktok/account/testing:module\",");
                            accountId2 = b;
                            if (((AccountId)au.c()).a() != -1) {
                                adme.Z(au.c().equals(b), "The given account id does not match the propagated account id.\n\tPropagated AccountId: %s\n\tGiven AccountId: %s", au.c(), b);
                                accountId2 = b;
                            }
                        }
                    }
                    final agr xs = ((aero)aqvs.i(this.c.mH(), (Class)aero.class)).xS();
                    Object b2 = xs.b;
                    synchronized (b2) {
                        if (!((Map)xs.e).containsKey(accountId2)) {
                            ((Map<AccountId, Object>)xs.e).put(accountId2, xs.f(accountId2));
                        }
                        final Object value = ((Map<K, Object>)xs.e).get(accountId2);
                        monitorexit(b2);
                        final ubo bg = ((aerp)aqvs.i(value, (Class)aerp.class)).bg();
                        arxu.o(bg.e = this.c, br.class);
                        b2 = new est((era)bg.c, (esw)bg.b, (esq)bg.a, (esp)bg.d, (br)bg.e);
                        this.a = b2;
                    }
                }
            }
        }
        return this.a;
    }
}
