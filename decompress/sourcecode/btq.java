import androidx.media3.common.Metadata$Entry;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.common.Metadata;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btq
{
    private static final Pattern c;
    public int a;
    public int b;
    
    static {
        c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    }
    
    public btq() {
        this.a = -1;
        this.b = -1;
    }
    
    private final boolean c(String group) {
        final Matcher matcher = btq.c.matcher(group);
        if (!matcher.find()) {
            return false;
        }
        try {
            group = matcher.group(1);
            final int a = baw.a;
            final int int1 = Integer.parseInt(group, 16);
            final int int2 = Integer.parseInt(matcher.group(2), 16);
            if (int1 > 0 || int2 > 0) {
                this.a = int1;
                this.b = int2;
                return true;
            }
            return false;
        }
        catch (final NumberFormatException ex) {
            return false;
        }
    }
    
    public final boolean a() {
        return this.a != -1 && this.b != -1;
    }
    
    public final void b(final Metadata metadata) {
        for (int i = 0; i < metadata.a(); ++i) {
            final Metadata$Entry b = metadata.b(i);
            if (b instanceof CommentFrame) {
                final CommentFrame commentFrame = (CommentFrame)b;
                if ("iTunSMPB".equals(commentFrame.b)) {
                    if (this.c(commentFrame.c)) {
                        return;
                    }
                }
            }
            else if (b instanceof InternalFrame) {
                final InternalFrame internalFrame = (InternalFrame)b;
                if ("com.apple.iTunes".equals(internalFrame.a) && "iTunSMPB".equals(internalFrame.b) && this.c(internalFrame.c)) {
                    return;
                }
            }
        }
    }
}
