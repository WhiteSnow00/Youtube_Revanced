import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.apps.tiktok.account.AccountId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegs implements aehc
{
    private final ahbd a;
    
    public aegs(final ahbd a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public final ListenableFuture a(final AccountId accountId) {
        return afrp.e(afqv.e(afrp.e(((aagm)((aeim)this.a.a).b).b(), (aexg)new abnf(accountId, 20), (Executor)afsl.a), IllegalArgumentException.class, aesm.a((aexg)acrp.j), (Executor)afsl.a), aesm.a((aexg)acrp.k), (Executor)afsl.a);
    }
}
