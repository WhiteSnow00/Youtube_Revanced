import io.grpc.Status;
import com.google.protobuf.ExtensionRegistryLite;
import com.youtube.android.libraries.elements.StatusOr;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgs extends okf
{
    private final wza a;
    
    public acgs(final wza a) {
        this.a = a;
    }
    
    public final ahci a() {
        return alxo.b;
    }
    
    public final StatusOr execute(final byte[] array) {
        try {
            final alxo alxo = (alxo)ahcz.parseFrom(alxo.a, array, ExtensionRegistryLite.a);
            final wza a = this.a;
            akpu akpu;
            if ((akpu = alxo.c) == null) {
                akpu = akpu.h();
            }
            final boolean d = a.d(akpu);
            final ahcr builder = alxp.a.createBuilder();
            builder.copyOnWrite();
            final alxp alxp = (alxp)builder.instance;
            alxp.b |= 0x1;
            alxp.c = d;
            return StatusOr.fromValue((Object)builder.build().toByteArray());
        }
        catch (final ahds ahds) {
            return StatusOr.fromStatus(Status.d.c((Throwable)ahds));
        }
    }
}
