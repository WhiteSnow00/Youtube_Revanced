import com.google.apps.tiktok.account.api.controller.ActivityAccountState;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import android.content.Intent;
import java.util.ArrayList;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;
import com.google.apps.tiktok.account.api.controller.KeepStateCallbacksHandler;

// 
// Decompiled by Procyon v0.6.0
// 

class aegk implements aekh
{
    final /* synthetic */ aegq a;
    
    public aegk(final aegq a) {
        this.a = a;
    }
    
    private final void c(final aegr aegr, final Throwable t) {
        if (aegr.i) {
            final KeepStateCallbacksHandler e = this.a.e;
            t.getClass();
            qcj.s();
            final aehq b = e.b;
            b.getClass();
            final int a = b.a;
            final int b2 = b.b;
            final aehw aehw = (aehw)e.a.b(a);
            if (b2 == 1) {
                aehw.a();
            }
            aehw.c();
            e.b = null;
            return;
        }
        this.a.c.l(t);
    }
}
