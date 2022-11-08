import java.util.regex.Matcher;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.Metadata;
import java.nio.charset.CharacterCodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvi extends bvf
{
    private static final Pattern a;
    private final CharsetDecoder b;
    private final CharsetDecoder c;
    
    static {
        a = Pattern.compile("(.+?)='(.*?)';", 32);
    }
    
    public bvi() {
        this.b = aexb.c.newDecoder();
        this.c = aexb.b.newDecoder();
    }
    
    private final String c(final ByteBuffer byteBuffer) {
        try {
            return this.b.decode(byteBuffer).toString();
        }
        catch (final CharacterCodingException ex) {
            this.b.reset();
            byteBuffer.rewind();
            try {
                return this.c.decode(byteBuffer).toString();
            }
            catch (final CharacterCodingException ex2) {
                return null;
            }
            finally {
                this.c.reset();
                byteBuffer.rewind();
            }
        }
        finally {
            this.b.reset();
            byteBuffer.rewind();
        }
    }
    
    protected final Metadata b(final bve bve, final ByteBuffer byteBuffer) {
        final String c = this.c(byteBuffer);
        final byte[] array = new byte[byteBuffer.limit()];
        byteBuffer.get(array);
        String s = null;
        if (c == null) {
            return new Metadata(new Metadata$Entry[] { (Metadata$Entry)new IcyInfo(array, (String)null, (String)null) });
        }
        final Matcher matcher = bvi.a.matcher(c);
        String s2 = null;
        String s3;
        String s4;
        for (int end = 0; matcher.find(end); end = matcher.end(), s = s3, s2 = s4) {
            final String group = matcher.group(1);
            final String group2 = matcher.group(2);
            s3 = s;
            s4 = s2;
            if (group != null) {
                final String w = aeda.w(group);
                final int hashCode = w.hashCode();
                int n = 0;
                Label_0167: {
                    if (hashCode != -315603473) {
                        if (hashCode == 1646559960) {
                            if (w.equals("streamtitle")) {
                                n = 0;
                                break Label_0167;
                            }
                        }
                    }
                    else if (w.equals("streamurl")) {
                        n = 1;
                        break Label_0167;
                    }
                    n = -1;
                }
                if (n != 0) {
                    if (n != 1) {
                        s3 = s;
                        s4 = s2;
                    }
                    else {
                        s3 = s;
                        s4 = group2;
                    }
                }
                else {
                    s4 = s2;
                    s3 = group2;
                }
            }
        }
        return new Metadata(new Metadata$Entry[] { (Metadata$Entry)new IcyInfo(array, s, s2) });
    }
}
