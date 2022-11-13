import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.Metadata;
import java.nio.ByteBuffer;
import java.util.Arrays;
import androidx.media3.extractor.metadata.emsg.EventMessage;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvi extends bvg
{
    public static final EventMessage c(final bas bas) {
        final String u = bas.u();
        dk.d((Object)u);
        final String u2 = bas.u();
        dk.d((Object)u2);
        return new EventMessage(u, u2, bas.p(), bas.p(), Arrays.copyOfRange(bas.a, bas.b, bas.c));
    }
    
    @Override
    protected final Metadata b(final bvf bvf, final ByteBuffer byteBuffer) {
        return new Metadata(new Metadata$Entry[] { (Metadata$Entry)c(new bas(byteBuffer.array(), byteBuffer.limit())) });
    }
}
