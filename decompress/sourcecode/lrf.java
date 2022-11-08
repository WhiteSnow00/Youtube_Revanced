import android.media.MediaCodec$CodecException;
import com.google.android.exoplayer.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrf extends Exception
{
    public lrf(final MediaFormat mediaFormat, final Throwable t, final int n) {
        final String value = String.valueOf(mediaFormat);
        final StringBuilder sb = new StringBuilder("Decoder init failed: [");
        sb.append(n);
        sb.append("], ");
        sb.append(value);
        super(sb.toString(), t);
        final String b = mediaFormat.b;
        Math.abs(n);
    }
    
    public lrf(final MediaFormat mediaFormat, final Throwable t, final String s) {
        final String value = String.valueOf(mediaFormat);
        final StringBuilder sb = new StringBuilder("Decoder init failed: ");
        sb.append(s);
        sb.append(", ");
        sb.append(value);
        super(sb.toString(), t);
        final String b = mediaFormat.b;
        final int a = lwj.a;
        if (t instanceof MediaCodec$CodecException) {
            ((MediaCodec$CodecException)t).getDiagnosticInfo();
        }
    }
}
