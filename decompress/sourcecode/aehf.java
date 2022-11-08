import java.lang.reflect.Method;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aehf implements aehe
{
    public static final afik a;
    public final List b;
    private final aegs c;
    private final atjj d;
    private final aftr e;
    
    static {
        a = afik.m("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl");
    }
    
    public aehf(final aegs c, final aexq aexq, final aftr e) {
        this.b = new ArrayList();
        this.c = c;
        this.d = (atjj)((aexw)aexq).a;
        this.e = e;
    }
    
    public final void a(final aehd aehd) {
        qcj.s();
        synchronized (this.b) {
            this.b.add(aehd);
        }
    }
    
    public final void b(final aehd aehd) {
        qcj.s();
        synchronized (this.b) {
            this.b.remove(aehd);
        }
    }
    
    public final afcr c() {
        return (afcr)this.d.a();
    }
    
    public final void d() {
        afva.r(aesm.c((afrx)new qpp(this, 19)), (Executor)this.e);
    }
    
    public final ListenableFuture e(final AccountId accountId, final List list, Intent o) {
        o = (Intent)aesw.o("Validate Requirements");
        try {
            final ListenableFuture f = afrp.f(this.c.a(accountId), aesm.d((afry)new xpu(list, accountId, 13)), (Executor)afsl.a);
            ((aere)o).a(f);
            ((aere)o).close();
            return f;
        }
        finally {
            Label_0093: {
                final Throwable t2;
                try {
                    ((aere)o).close();
                    break Label_0093;
                }
                finally {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s, (Class[])array);
                    final AccountId accountId2 = accountId;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(accountId2, array2);
                }
                try {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s, (Class[])array);
                    final AccountId accountId2 = accountId;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(accountId2, array2);
                }
                catch (final Exception ex) {}
            }
        }
    }
}
