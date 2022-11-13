import io.grpc.Status;
import com.google.protobuf.ExtensionRegistryLite;
import com.youtube.android.libraries.elements.StatusOr;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfh extends ojn
{
    private final wxx a;
    
    public acfh(final wxx a) {
        this.a = a;
    }
    
    public final ahaq a() {
        return (ahaq)alvo.b;
    }
    
    public final StatusOr execute(final byte[] array) {
        try {
            final alvo alvo = (alvo)ahbh.parseFrom((ahbh)alvo.a, array, ExtensionRegistryLite.a);
            final wxx a = this.a;
            aknt aknt;
            if ((aknt = alvo.c) == null) {
                aknt = aknt.h();
            }
            final boolean d = a.d(aknt);
            final ahaz builder = ((ahbh)alvp.a).createBuilder();
            builder.copyOnWrite();
            final alvp alvp = (alvp)builder.instance;
            alvp.b |= 0x1;
            alvp.c = d;
            return StatusOr.fromValue(((agzk)builder.build()).toByteArray());
        }
        catch (final ahca ahca) {
            return StatusOr.fromStatus(Status.d.c((Throwable)ahca));
        }
    }
}
