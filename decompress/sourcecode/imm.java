import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.Map;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imm
{
    public static final long a;
    public final Handler b;
    public final Map c;
    public ihc d;
    public final lfy e;
    
    static {
        a = TimeUnit.SECONDS.toMillis(10L);
    }
    
    public imm(final lfy e, final Handler b, final byte[] array, final byte[] array2) {
        this.e = e;
        this.b = b;
        this.c = new HashMap();
    }
}
