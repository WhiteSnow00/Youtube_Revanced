import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aenc implements aelb, aelc
{
    private final agnv a;
    
    public aenc(final agnv a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    private static boolean c(final Intent intent) {
        return intent.hasExtra("viewerid");
    }
    
    public final ListenableFuture a(final aelf aelf) {
        final aeux o = aewp.o("Get Intent Account");
        try {
            final Intent a = aelf.a;
            final boolean hasExtra = a.hasExtra("account_id");
            Object b = null;
            if (hasExtra) {
                final int intExtra = a.getIntExtra("account_id", -1);
                if (intExtra != -1 && !a.getBooleanExtra("$tiktok$account_id_owned", false)) {
                    ((afly)((afly)((aflw)aekv.a).g()).j("com/google/apps/tiktok/account/api/controller/AccountIntents", "getAccount", 110, "AccountIntents.java")).r("AccountId was manually propagated. Use AccountIntents instead.");
                }
                if (intExtra != -1) {
                    b = AccountId.b(intExtra);
                }
                final ListenableFuture l = afxr.l(b);
                o.close();
                return l;
            }
            if (c(a)) {
                adme.T(c(a));
                String s = a.getStringExtra("viewerid");
                s.getClass();
                if (a.hasExtra("effectiveid")) {
                    s = a.getStringExtra("effectiveid");
                    s.getClass();
                }
                final ListenableFuture e = afun.e(this.a.p("google", s), (Class)IllegalArgumentException.class, (afax)aemh.e, (Executor)afwd.a);
                o.a(e);
                o.close();
                return e;
            }
            final ListenableFuture i = afxr.l(null);
            o.close();
            return i;
        }
        finally {
            Label_0246: {
                final Throwable t2;
                try {
                    o.close();
                    break Label_0246;
                }
                finally {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s2 = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s2, (Class[])array);
                    final aelf aelf2 = aelf;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(aelf2, array2);
                }
                try {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s2 = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s2, (Class[])array);
                    final aelf aelf2 = aelf;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(aelf2, array2);
                }
                catch (final Exception ex) {}
            }
        }
    }
    
    public final ListenableFuture b(final AccountId accountId) {
        return afxr.l(null);
    }
}
