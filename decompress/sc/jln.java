import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jln
{
    public final Executor a;
    public final Handler b;
    public byte[] c;
    public String d;
    public boolean e;
    public final vlq f;
    
    public jln(final vlq f, final Executor a, final Handler b) {
        this.f = f;
        this.a = a;
        this.b = b;
    }
    
    public static final boolean a(final aiqj aiqj) {
        anxg anxg;
        if ((anxg = ((anxf)((ahbc)aiqj).rx((ahaq)SearchEndpointOuterClass.searchEndpoint)).g) == null) {
            anxg = anxg.a;
        }
        anxk a;
        if (anxg.b == 163011016) {
            a = (anxk)anxg.c;
        }
        else {
            a = anxk.a;
        }
        return (a.b & 0x2) != 0x0;
    }
}
