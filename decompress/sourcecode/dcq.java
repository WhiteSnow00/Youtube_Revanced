import java.io.UnsupportedEncodingException;
import java.io.ByteArrayOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class dcq extends ByteArrayOutputStream
{
    final /* synthetic */ dcr a;
    
    public dcq(final dcr a, final int n) {
        this.a = a;
        super(n);
    }
    
    @Override
    public final String toString() {
        int count;
        if (this.count > 0 && this.buf[this.count - 1] == 13) {
            count = this.count - 1;
        }
        else {
            count = this.count;
        }
        try {
            return new String(this.buf, 0, count, this.a.a.name());
        }
        catch (final UnsupportedEncodingException ex) {
            throw new AssertionError((Object)ex);
        }
    }
}
