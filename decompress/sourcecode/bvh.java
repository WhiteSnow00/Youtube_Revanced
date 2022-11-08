import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.Metadata;
import java.nio.ByteBuffer;
import java.util.Arrays;
import androidx.media3.extractor.metadata.emsg.EventMessage;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvh extends bvf
{
    public static final EventMessage c(final bar bar) {
        final String u = bar.u();
        dk.d((Object)u);
        final String u2 = bar.u();
        dk.d((Object)u2);
        return new EventMessage(u, u2, bar.p(), bar.p(), Arrays.copyOfRange(bar.a, bar.b, bar.c));
    }
    
    protected final Metadata b(final bve bve, final ByteBuffer byteBuffer) {
        return new Metadata(new Metadata$Entry[] { (Metadata$Entry)c(new bar(byteBuffer.array(), byteBuffer.limit())) });
    }
}
