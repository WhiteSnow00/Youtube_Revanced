import java.util.List;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aekr extends qpp
{
    private static final afkk b;
    public final ahdc a;
    private final aezp c;
    private final atke d;
    private final afvs e;
    
    static {
        b = afkk.m("com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler");
    }
    
    public aekr(final ahdc a, final aezp c, final atke d, final afvs e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final ListenableFuture a(final IOException ex, final qpq qpq) {
        if (!(boolean)((aezv)this.c).a) {
            return afwm.l((Throwable)ex);
        }
        if (!(ex instanceof FileNotFoundException) && !(ex.getCause() instanceof FileNotFoundException) && !(ex instanceof ahca) && !(ex.getCause() instanceof ahca)) {
            return afwm.l((Throwable)ex);
        }
        c.i(((afkg)aekr.b).g(), "AccountDataStore read failed. Trying to recover by resetting the store and wiping out all the account data.", "com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler", "handleReadException", '\u0080', "AccountDataStoreIOExceptionHandler.java", (Throwable)ex);
        final ahdc a = this.a;
        int i = 0;
        final afeq k = a.k(false);
        final int c = ((afih)k).c;
        int n = -1;
        while (i < c) {
            final int int1 = Integer.parseInt(((File)((List)k).get(i)).getName());
            int n2;
            if (int1 > (n2 = n)) {
                n2 = int1;
            }
            ++i;
            n = n2;
        }
        final Set set = (Set)((arlt)this.d).a;
        final ArrayList list = new ArrayList(set.size());
        for (final aekq aekq : set) {
            aekq.getClass();
            list.add((Object)afwm.r(aeun.c((afty)new aekt(aekq, 1)), (Executor)afum.a));
        }
        return afsw.f(aftq.f(aftq.f((ListenableFuture)afvk.m(afwm.K((Iterable)list).j(afwm.y(), (Executor)this.e)), aeun.d((aftz)new zuc(this, 12)), (Executor)this.e), aeun.d((aftz)new xof(qpq, n, 2)), (Executor)this.e), (Class)IOException.class, aeun.d((aftz)new zuc(ex, 13)), (Executor)afum.a);
    }
}
