import java.util.Arrays;
import java.util.Locale;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.nio.ByteBuffer;
import com.google.android.libraries.parenttools.youtube.AutoValue_ParentToolsResult;
import com.google.android.libraries.parenttools.youtube.ParentToolsResult;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnt
{
    public int a;
    public Object b;
    
    public agnt() {
    }
    
    public agnt(final abpu abpu, final asid asid) {
        this.b = Optional.empty();
        this.a = 1;
        abpu.H((aezf)abdc.g, (aezf)abdc.h).P(asid).am((asjm)new abgh(this, 0, (byte[])null, (byte[])null));
        abpu.M().P(asid).am((asjm)new abgh(this, 2, (byte[])null, (byte[])null));
    }
    
    public agnt(final ParentToolsResult parentToolsResult) {
        final AutoValue_ParentToolsResult autoValue_ParentToolsResult = (AutoValue_ParentToolsResult)parentToolsResult;
        this.b = autoValue_ParentToolsResult.a;
        this.a = autoValue_ParentToolsResult.b;
    }
    
    public agnt(final byte[] array) {
        this.a = 3;
    }
    
    public agnt(final byte[] array, final byte[] array2) {
        this.b = new long[32];
    }
    
    public final void a(final int a, final ByteBuffer b) {
        this.b = b;
        if (b != null) {
            this.a = a;
            return;
        }
        this.a = 0;
    }
    
    public final float b() {
        return ((ByteBuffer)this.b).getFloat(this.a);
    }
    
    public final int c() {
        return ((ByteBuffer)this.b).getInt(this.a + 4);
    }
    
    public final float d() {
        return ((ByteBuffer)this.b).getFloat(this.a);
    }
    
    public final float e() {
        return ((ByteBuffer)this.b).getFloat(this.a + 4);
    }
    
    public final float f() {
        return ((ByteBuffer)this.b).getFloat(this.a + 4);
    }
    
    public final float g() {
        return ((ByteBuffer)this.b).getFloat(this.a);
    }
    
    public final void h(final amqs b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null effectiveConnectionType");
    }
    
    public final void i(final WatchNextResponseModel watchNextResponseModel) {
        final alem a = watchNextResponseModel.a;
        Optional b;
        if ((a.b & Integer.MIN_VALUE) != 0x0) {
            b = Optional.of((Object)a.z);
        }
        else {
            b = Optional.empty();
        }
        this.b = b;
        this.a = watchNextResponseModel.e();
    }
    
    public final ParentToolsResult j() {
        final int a = this.a;
        if (a != 0) {
            return (ParentToolsResult)new AutoValue_ParentToolsResult((byte[])this.b, a);
        }
        throw new IllegalStateException("Missing required properties: exitStatus");
    }
    
    public final void k(final int a) {
        if (a != 0) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null exitStatus");
    }
    
    public final nog l() {
        return new nog(this, (byte[])null, (byte[])null);
    }
    
    public final void m(final int a) {
        if (a != 0 && a != 2 && a != 1 && a != 3) {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", 2));
        }
        this.a = a;
    }
    
    public final void n() {
        this.b = null;
        this.a = 0;
    }
    
    public final long o(final int n) {
        if (n >= 0 && n < this.a) {
            return ((long[])this.b)[n];
        }
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("Invalid index ");
        sb.append(n);
        sb.append(", size is ");
        sb.append(a);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public final void p(final long n) {
        final int a = this.a;
        final long[] array = (long[])this.b;
        if (a == array.length) {
            this.b = Arrays.copyOf(array, a + a);
        }
        ((long[])this.b)[this.a++] = n;
    }
}
