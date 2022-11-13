import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.ByteArrayInputStream;
import com.google.protobuf.MessageLite;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asga extends InputStream implements InputStreamRetargetInterface, arvk
{
    public MessageLite a;
    public final ahdd b;
    public ByteArrayInputStream c;
    
    public asga(final MessageLite a, final ahdd b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int available() {
        final MessageLite a = this.a;
        if (a != null) {
            return a.getSerializedSize();
        }
        final ByteArrayInputStream c = this.c;
        if (c != null) {
            return c.available();
        }
        return 0;
    }
    
    @Override
    public final int read() {
        final MessageLite a = this.a;
        if (a != null) {
            this.c = new ByteArrayInputStream(a.toByteArray());
            this.a = null;
        }
        final ByteArrayInputStream c = this.c;
        if (c != null) {
            return c.read();
        }
        return -1;
    }
    
    @Override
    public final int read(final byte[] array, final int n, final int n2) {
        final MessageLite a = this.a;
        if (a != null) {
            final int serializedSize = a.getSerializedSize();
            if (serializedSize == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (n2 >= serializedSize) {
                final ahal am = ahal.am(array, n, serializedSize);
                this.a.writeTo(am);
                am.an();
                this.a = null;
                this.c = null;
                return serializedSize;
            }
            this.c = new ByteArrayInputStream(this.a.toByteArray());
            this.a = null;
        }
        final ByteArrayInputStream c = this.c;
        if (c != null) {
            return c.read(array, n, n2);
        }
        return -1;
    }
    
    public final long transferTo(final OutputStream outputStream) {
        return DesugarInputStream.transferTo((InputStream)this, outputStream);
    }
}
