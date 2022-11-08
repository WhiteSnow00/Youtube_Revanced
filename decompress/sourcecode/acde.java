import io.grpc.Status;
import com.google.protobuf.ExtensionRegistryLite;
import com.youtube.android.libraries.elements.StatusOr;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acde extends oih
{
    private final wvu a;
    
    public acde(final wvu a) {
        this.a = a;
    }
    
    public final agyr a() {
        return (agyr)altk.b;
    }
    
    public final StatusOr execute(final byte[] array) {
        try {
            final altk altk = (altk)agzi.parseFrom((agzi)altk.a, array, ExtensionRegistryLite.a);
            final wvu a = this.a;
            aklq aklq;
            if ((aklq = altk.c) == null) {
                aklq = aklq.h();
            }
            final boolean d = a.d(aklq);
            final agza builder = ((agzi)altl.a).createBuilder();
            builder.copyOnWrite();
            final altl altl = (altl)builder.instance;
            altl.b |= 0x1;
            altl.c = d;
            return StatusOr.fromValue((Object)((agxl)builder.build()).toByteArray());
        }
        catch (final ahab ahab) {
            return StatusOr.fromStatus(Status.d.c((Throwable)ahab));
        }
    }
}
