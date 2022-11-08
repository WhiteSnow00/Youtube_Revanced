import java.util.Iterator;
import android.util.Log;
import java.util.function.Consumer;
import java.util.Collection;
import j$.util.Collection$_EL;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grq implements asgb
{
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public grq(final acxg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public grq(final eou a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public grq(final grr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public grq(final nzb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        final int b = this.b;
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    ((acxg)this.a).c.post((Runnable)new abxb(this, 17, (byte[])null));
                    return;
                }
                ((afii)((afii)((afig)nzb.a).b()).j("com/google/android/libraries/assistant/appintegration/GrpcConnector$1", "onCompleted", 73, "GrpcConnector.java")).r("onCompleted()");
            }
            else {
                ((afii)((afii)((afig)eou.a).f()).j("com/google/android/apps/search/assistant/platform/appintegration/api/impl/EmbeddedAssistantInteractionImpl$ResponseStreamObserver", "onCompleted", 168, "EmbeddedAssistantInteractionImpl.java")).s("[%d] onCompleted", ((eou)this.a).b);
            }
        }
    }
    
    public final void b(final Throwable t) {
        final int b = this.b;
        if (b == 0) {
            ((maw)((grr)this.a).a.a()).c = gro.a;
            return;
        }
        if (b == 1) {
            ((afii)((afii)((afii)((afig)eou.a).g()).i(t)).j("com/google/android/apps/search/assistant/platform/appintegration/api/impl/EmbeddedAssistantInteractionImpl$ResponseStreamObserver", "onError", 162, "EmbeddedAssistantInteractionImpl.java")).v("[%d] onError: %s", ((eou)this.a).b, (Object)t.getMessage());
            Collection$_EL.stream((Collection)((eou)this.a).e).forEach((Consumer)new fgo(1));
            return;
        }
        if (b != 2) {
            ((acxg)this.a).c.post((Runnable)new abwg(this, t, 18, (byte[])null));
            return;
        }
        c.i(((afig)nzb.a).h(), "onError()", "com/google/android/libraries/assistant/appintegration/GrpcConnector$1", "onError", 'C', "GrpcConnector.java", t);
        final nza f = ((nzg)((nzb)this.a).b).f;
        ((afii)((afii)((afig)gqz.a).c().h(afjj.a, (Object)"AQCResolver")).j("com/google/android/apps/youtube/app/extensions/assistant/connection/classic/AssistantConnectionCallback", "onServiceDisconnected", 92, "AssistantConnectionCallback.java")).r("#onServiceDisconnected");
        ((cya)((gqz)f).b.a()).p(false);
    }
}
