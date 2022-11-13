import com.google.protobuf.MessageLite;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agph extends asge
{
    public agph(final arty arty, final artx artx) {
        super(arty, artx);
    }
    
    @Override
    public final /* bridge */ asgg a(final arty arty, final artx artx) {
        return new agph(arty, artx);
    }
    
    public final ListenableFuture b(final agqk agqk) {
        final arty a = super.a;
        Object o;
        if ((o = agpi.f) == null) {
            synchronized (agpi.class) {
                if ((o = agpi.f) == null) {
                    o = arwo.a();
                    ((arwl)o).c = arwn.a;
                    ((arwl)o).d = arwo.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "StartLinkingSession");
                    ((arwl)o).b();
                    ((arwl)o).a = asgc.b((MessageLite)agqk.a);
                    ((arwl)o).b = asgc.b((MessageLite)agqe.a);
                    o = (agpi.f = ((arwl)o).a());
                }
            }
        }
        return asgn.a(a.a((arwo)o, super.b), agqk);
    }
}
