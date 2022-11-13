import android.media.MediaCodec;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Queue;
import kotlinx.coroutines.CoroutineExceptionHandler;
import android.content.pm.ProviderInfo;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import android.content.ContentProviderClient;
import android.net.Uri$Builder;
import android.net.Uri;
import android.content.pm.Signature;
import android.os.IInterface;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import java.util.concurrent.TimeoutException;
import org.webrtc.Logging;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import org.webrtc.VideoCodecStatus;
import java.util.concurrent.Callable;
import android.os.Handler;
import android.os.IBinder;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsx
{
    public static int a;
    public static volatile Boolean b;
    private static Context c;
    private static area d;
    
    private aqsx() {
    }
    
    public static int A(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int B(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int C(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int D(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static int E(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int F(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int G(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int H(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int I(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int J(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int K(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int L(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int M(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static String N(final int n) {
        if (n == 12) {
            return "LOG_LEVEL_WARN";
        }
        if (n == 13) {
            return "LOG_LEVEL_ERROR_DEPRECATED";
        }
        switch (n) {
            default: {
                return "null";
            }
            case 35: {
                return "LOG_TYPE_PROPERTY_RESOLUTION_ERROR";
            }
            case 34: {
                return "LOG_TYPE_RESOURCE_WARNING";
            }
            case 33: {
                return "LOG_TYPE_INTERNAL_UTP_ERROR";
            }
            case 32: {
                return "LOG_TYPE_INTERNAL_RESOURCE_ERROR";
            }
            case 31: {
                return "LOG_TYPE_COMMAND_EXECUTION_ERROR";
            }
            case 30: {
                return "LOG_TYPE_INTERNAL_MISSING_RESOURCE_ERROR";
            }
            case 29: {
                return "LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR";
            }
            case 28: {
                return "LOG_TYPE_INTERNAL_ERROR";
            }
            case 27: {
                return "LOG_TYPE_CONFIGURATION_ERROR";
            }
            case 26: {
                return "LOG_TYPE_WIRE_FORMAT_ERROR";
            }
            case 25: {
                return "LOG_TYPE_MODEL_ERROR";
            }
            case 24: {
                return "LOG_TYPE_UNKNOWN_EXTENSION";
            }
            case 23: {
                return "LOG_TYPE_MISSING_FIELD";
            }
            case 22: {
                return "LOG_TYPE_INVALID_FIELD";
            }
            case 21: {
                return "ERROR_TYPE_ROOT_ELEMENT_CONVERTER_DEPRECATED";
            }
        }
    }
    
    public static int O(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static int P(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int Q(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int R(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int S(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int T(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static int U(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int V(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int W(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 37: {
                return 38;
            }
            case 36: {
                return 37;
            }
            case 35: {
                return 36;
            }
            case 34: {
                return 35;
            }
            case 33: {
                return 34;
            }
            case 32: {
                return 33;
            }
            case 31: {
                return 32;
            }
            case 30: {
                return 31;
            }
            case 29: {
                return 30;
            }
            case 28: {
                return 29;
            }
            case 27: {
                return 28;
            }
            case 26: {
                return 27;
            }
            case 25: {
                return 26;
            }
            case 24: {
                return 25;
            }
            case 23: {
                return 24;
            }
            case 22: {
                return 23;
            }
            case 21: {
                return 22;
            }
            case 20: {
                return 21;
            }
            case 19: {
                return 20;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int X(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int Y(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int Z(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int a(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aA(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int aB(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int aC(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int aD(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aE(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aF(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int aG(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aH(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int aI(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aJ(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 5) {
            return 6;
        }
        if (n == 6) {
            return 7;
        }
        if (n != 22) {
            return 0;
        }
        return 23;
    }
    
    public static int aK(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aL(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static int aM(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int aN(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aO(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int aP(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int aQ(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aR(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int aS(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aT(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aU(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aV(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aW(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aX(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int aY(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int aZ(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int aa(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int ab(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ac(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ad(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ae(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int af(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ag(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ah(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ai(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int aj(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ak(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        switch (n) {
            default: {
                return 0;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
        }
    }
    
    public static int al(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int am(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static String an(final int n) {
        return Integer.toString(n - 1);
    }
    
    public static void ao(final int n) {
        if (n != 0) {
            return;
        }
        throw null;
    }
    
    public static int ap(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int aq(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ar(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int as(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int at(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int au(final int n) {
        if (n != 1) {
            return n - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public static int av(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 34) {
            return 36;
        }
        if (n == 42) {
            return 44;
        }
        if (n == 48) {
            return 50;
        }
        if (n == 95) {
            return 97;
        }
        if (n == 104) {
            return 106;
        }
        if (n == 36) {
            return 38;
        }
        if (n != 37) {
            return 0;
        }
        return 39;
    }
    
    public static int aw(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ax(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ay(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static int az(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static void b(final File file) {
        if (file != null) {
            dU(file);
        }
    }
    
    public static int bA(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n == 5) {
            return 6;
        }
        if (n == 6) {
            return 7;
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                switch (n) {
                                                    default: {
                                                        switch (n) {
                                                            default: {
                                                                switch (n) {
                                                                    default: {
                                                                        return 0;
                                                                    }
                                                                    case 188: {
                                                                        return 189;
                                                                    }
                                                                    case 187: {
                                                                        return 188;
                                                                    }
                                                                    case 186: {
                                                                        return 187;
                                                                    }
                                                                    case 185: {
                                                                        return 186;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            case 183: {
                                                                return 184;
                                                            }
                                                            case 182: {
                                                                return 183;
                                                            }
                                                            case 181: {
                                                                return 182;
                                                            }
                                                            case 180: {
                                                                return 181;
                                                            }
                                                            case 179: {
                                                                return 180;
                                                            }
                                                            case 178: {
                                                                return 179;
                                                            }
                                                            case 177: {
                                                                return 178;
                                                            }
                                                            case 176: {
                                                                return 177;
                                                            }
                                                            case 175: {
                                                                return 176;
                                                            }
                                                            case 174: {
                                                                return 175;
                                                            }
                                                            case 173: {
                                                                return 174;
                                                            }
                                                            case 172: {
                                                                return 173;
                                                            }
                                                            case 171: {
                                                                return 172;
                                                            }
                                                            case 170: {
                                                                return 171;
                                                            }
                                                            case 169: {
                                                                return 170;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 167: {
                                                        return 168;
                                                    }
                                                    case 166: {
                                                        return 167;
                                                    }
                                                    case 165: {
                                                        return 166;
                                                    }
                                                    case 164: {
                                                        return 165;
                                                    }
                                                    case 163: {
                                                        return 164;
                                                    }
                                                    case 162: {
                                                        return 163;
                                                    }
                                                    case 161: {
                                                        return 162;
                                                    }
                                                    case 160: {
                                                        return 161;
                                                    }
                                                }
                                                break;
                                            }
                                            case 158: {
                                                return 159;
                                            }
                                            case 157: {
                                                return 158;
                                            }
                                            case 156: {
                                                return 157;
                                            }
                                            case 155: {
                                                return 156;
                                            }
                                            case 154: {
                                                return 155;
                                            }
                                            case 153: {
                                                return 154;
                                            }
                                            case 152: {
                                                return 153;
                                            }
                                            case 151: {
                                                return 152;
                                            }
                                            case 150: {
                                                return 151;
                                            }
                                            case 149: {
                                                return 150;
                                            }
                                            case 148: {
                                                return 149;
                                            }
                                            case 147: {
                                                return 148;
                                            }
                                            case 146: {
                                                return 147;
                                            }
                                            case 145: {
                                                return 146;
                                            }
                                            case 144: {
                                                return 145;
                                            }
                                            case 143: {
                                                return 144;
                                            }
                                            case 142: {
                                                return 143;
                                            }
                                            case 141: {
                                                return 142;
                                            }
                                            case 140: {
                                                return 141;
                                            }
                                            case 139: {
                                                return 140;
                                            }
                                            case 138: {
                                                return 139;
                                            }
                                            case 137: {
                                                return 138;
                                            }
                                            case 136: {
                                                return 137;
                                            }
                                            case 135: {
                                                return 136;
                                            }
                                            case 134: {
                                                return 135;
                                            }
                                            case 133: {
                                                return 134;
                                            }
                                            case 132: {
                                                return 133;
                                            }
                                            case 131: {
                                                return 132;
                                            }
                                            case 130: {
                                                return 131;
                                            }
                                            case 129: {
                                                return 130;
                                            }
                                            case 128: {
                                                return 129;
                                            }
                                            case 127: {
                                                return 128;
                                            }
                                            case 126: {
                                                return 127;
                                            }
                                            case 125: {
                                                return 126;
                                            }
                                            case 124: {
                                                return 125;
                                            }
                                            case 123: {
                                                return 124;
                                            }
                                        }
                                        break;
                                    }
                                    case 121: {
                                        return 122;
                                    }
                                    case 120: {
                                        return 121;
                                    }
                                    case 119: {
                                        return 120;
                                    }
                                    case 118: {
                                        return 119;
                                    }
                                    case 117: {
                                        return 118;
                                    }
                                    case 116: {
                                        return 117;
                                    }
                                    case 115: {
                                        return 116;
                                    }
                                    case 114: {
                                        return 115;
                                    }
                                    case 113: {
                                        return 114;
                                    }
                                    case 112: {
                                        return 113;
                                    }
                                    case 111: {
                                        return 112;
                                    }
                                    case 110: {
                                        return 111;
                                    }
                                    case 109: {
                                        return 110;
                                    }
                                    case 108: {
                                        return 109;
                                    }
                                }
                                break;
                            }
                            case 106: {
                                return 107;
                            }
                            case 105: {
                                return 106;
                            }
                            case 104: {
                                return 105;
                            }
                            case 103: {
                                return 104;
                            }
                        }
                        break;
                    }
                    case 101: {
                        return 102;
                    }
                    case 100: {
                        return 101;
                    }
                    case 99: {
                        return 100;
                    }
                    case 98: {
                        return 99;
                    }
                    case 97: {
                        return 98;
                    }
                    case 96: {
                        return 97;
                    }
                    case 95: {
                        return 96;
                    }
                    case 94: {
                        return 95;
                    }
                    case 93: {
                        return 94;
                    }
                    case 92: {
                        return 93;
                    }
                    case 91: {
                        return 92;
                    }
                    case 90: {
                        return 91;
                    }
                    case 89: {
                        return 90;
                    }
                }
                break;
            }
            case 20033: {
                return 20034;
            }
            case 20032: {
                return 20033;
            }
            case 20031: {
                return 20032;
            }
            case 10125: {
                return 10126;
            }
            case 10124: {
                return 10125;
            }
            case 10123: {
                return 10124;
            }
            case 10111: {
                return 10112;
            }
            case 10070: {
                return 10071;
            }
            case 440: {
                return 441;
            }
            case 439: {
                return 440;
            }
            case 438: {
                return 439;
            }
            case 437: {
                return 438;
            }
            case 436: {
                return 437;
            }
            case 435: {
                return 436;
            }
            case 434: {
                return 435;
            }
            case 433: {
                return 434;
            }
            case 432: {
                return 433;
            }
            case 431: {
                return 432;
            }
            case 430: {
                return 431;
            }
            case 429: {
                return 430;
            }
            case 428: {
                return 429;
            }
            case 427: {
                return 428;
            }
            case 426: {
                return 427;
            }
            case 425: {
                return 426;
            }
            case 424: {
                return 425;
            }
            case 423: {
                return 424;
            }
            case 422: {
                return 423;
            }
            case 421: {
                return 422;
            }
            case 420: {
                return 421;
            }
            case 419: {
                return 420;
            }
            case 418: {
                return 419;
            }
            case 417: {
                return 418;
            }
            case 416: {
                return 417;
            }
            case 415: {
                return 416;
            }
            case 414: {
                return 415;
            }
            case 413: {
                return 414;
            }
            case 412: {
                return 413;
            }
            case 411: {
                return 412;
            }
            case 410: {
                return 411;
            }
            case 409: {
                return 410;
            }
            case 408: {
                return 409;
            }
            case 407: {
                return 408;
            }
            case 406: {
                return 407;
            }
            case 405: {
                return 406;
            }
            case 404: {
                return 405;
            }
            case 403: {
                return 404;
            }
            case 402: {
                return 403;
            }
            case 401: {
                return 402;
            }
            case 400: {
                return 401;
            }
            case 399: {
                return 400;
            }
            case 398: {
                return 399;
            }
            case 397: {
                return 398;
            }
            case 396: {
                return 397;
            }
            case 395: {
                return 396;
            }
            case 394: {
                return 395;
            }
            case 393: {
                return 394;
            }
            case 392: {
                return 393;
            }
            case 391: {
                return 392;
            }
            case 390: {
                return 391;
            }
            case 389: {
                return 390;
            }
            case 388: {
                return 389;
            }
            case 387: {
                return 388;
            }
            case 386: {
                return 387;
            }
            case 385: {
                return 386;
            }
            case 384: {
                return 385;
            }
            case 383: {
                return 384;
            }
            case 382: {
                return 383;
            }
            case 381: {
                return 382;
            }
            case 380: {
                return 381;
            }
            case 379: {
                return 380;
            }
            case 378: {
                return 379;
            }
            case 377: {
                return 378;
            }
            case 376: {
                return 377;
            }
            case 375: {
                return 376;
            }
            case 374: {
                return 375;
            }
            case 373: {
                return 374;
            }
            case 372: {
                return 373;
            }
            case 371: {
                return 372;
            }
            case 370: {
                return 371;
            }
            case 369: {
                return 370;
            }
            case 368: {
                return 369;
            }
            case 367: {
                return 368;
            }
            case 366: {
                return 367;
            }
            case 365: {
                return 366;
            }
            case 364: {
                return 365;
            }
            case 363: {
                return 364;
            }
            case 362: {
                return 363;
            }
            case 361: {
                return 362;
            }
            case 360: {
                return 361;
            }
            case 359: {
                return 360;
            }
            case 358: {
                return 359;
            }
            case 357: {
                return 358;
            }
            case 356: {
                return 357;
            }
            case 355: {
                return 356;
            }
            case 354: {
                return 355;
            }
            case 353: {
                return 354;
            }
            case 352: {
                return 353;
            }
            case 351: {
                return 352;
            }
            case 350: {
                return 351;
            }
            case 349: {
                return 350;
            }
            case 348: {
                return 349;
            }
            case 347: {
                return 348;
            }
            case 346: {
                return 347;
            }
            case 345: {
                return 346;
            }
            case 344: {
                return 345;
            }
            case 343: {
                return 344;
            }
            case 342: {
                return 343;
            }
            case 341: {
                return 342;
            }
            case 340: {
                return 341;
            }
            case 339: {
                return 340;
            }
            case 338: {
                return 339;
            }
            case 337: {
                return 338;
            }
            case 336: {
                return 337;
            }
            case 335: {
                return 336;
            }
            case 334: {
                return 335;
            }
            case 333: {
                return 334;
            }
            case 332: {
                return 333;
            }
            case 330: {
                return 331;
            }
            case 329: {
                return 330;
            }
            case 328: {
                return 329;
            }
            case 327: {
                return 328;
            }
            case 326: {
                return 327;
            }
            case 325: {
                return 326;
            }
            case 324: {
                return 325;
            }
            case 323: {
                return 324;
            }
            case 322: {
                return 323;
            }
            case 321: {
                return 322;
            }
            case 320: {
                return 321;
            }
            case 319: {
                return 320;
            }
            case 318: {
                return 319;
            }
            case 317: {
                return 318;
            }
            case 316: {
                return 317;
            }
            case 315: {
                return 316;
            }
            case 314: {
                return 315;
            }
            case 313: {
                return 314;
            }
            case 312: {
                return 313;
            }
            case 311: {
                return 312;
            }
            case 310: {
                return 311;
            }
            case 309: {
                return 310;
            }
            case 308: {
                return 309;
            }
            case 307: {
                return 308;
            }
            case 306: {
                return 307;
            }
            case 305: {
                return 306;
            }
            case 304: {
                return 305;
            }
            case 302: {
                return 303;
            }
            case 301: {
                return 302;
            }
            case 300: {
                return 301;
            }
            case 299: {
                return 300;
            }
            case 298: {
                return 299;
            }
            case 297: {
                return 298;
            }
            case 296: {
                return 297;
            }
            case 295: {
                return 296;
            }
            case 294: {
                return 295;
            }
            case 293: {
                return 294;
            }
            case 292: {
                return 293;
            }
            case 291: {
                return 292;
            }
            case 290: {
                return 291;
            }
            case 289: {
                return 290;
            }
            case 288: {
                return 289;
            }
            case 287: {
                return 288;
            }
            case 286: {
                return 287;
            }
            case 285: {
                return 286;
            }
            case 284: {
                return 285;
            }
            case 283: {
                return 284;
            }
            case 282: {
                return 283;
            }
            case 281: {
                return 282;
            }
            case 280: {
                return 281;
            }
            case 279: {
                return 280;
            }
            case 278: {
                return 279;
            }
            case 277: {
                return 278;
            }
            case 276: {
                return 277;
            }
            case 275: {
                return 276;
            }
            case 274: {
                return 275;
            }
            case 273: {
                return 274;
            }
            case 272: {
                return 273;
            }
            case 271: {
                return 272;
            }
            case 270: {
                return 271;
            }
            case 269: {
                return 270;
            }
            case 268: {
                return 269;
            }
            case 267: {
                return 268;
            }
            case 265: {
                return 266;
            }
            case 264: {
                return 265;
            }
            case 263: {
                return 264;
            }
            case 262: {
                return 263;
            }
            case 261: {
                return 262;
            }
            case 260: {
                return 261;
            }
            case 259: {
                return 260;
            }
            case 258: {
                return 259;
            }
            case 257: {
                return 258;
            }
            case 256: {
                return 257;
            }
            case 255: {
                return 256;
            }
            case 254: {
                return 255;
            }
            case 253: {
                return 254;
            }
            case 252: {
                return 253;
            }
            case 251: {
                return 252;
            }
            case 250: {
                return 251;
            }
            case 249: {
                return 250;
            }
            case 248: {
                return 249;
            }
            case 247: {
                return 248;
            }
            case 246: {
                return 247;
            }
            case 245: {
                return 246;
            }
            case 244: {
                return 245;
            }
            case 243: {
                return 244;
            }
            case 242: {
                return 243;
            }
            case 241: {
                return 242;
            }
            case 240: {
                return 241;
            }
            case 239: {
                return 240;
            }
            case 238: {
                return 239;
            }
            case 237: {
                return 238;
            }
            case 236: {
                return 237;
            }
            case 235: {
                return 236;
            }
            case 234: {
                return 235;
            }
            case 233: {
                return 234;
            }
            case 232: {
                return 233;
            }
            case 231: {
                return 232;
            }
            case 230: {
                return 231;
            }
            case 229: {
                return 230;
            }
            case 228: {
                return 229;
            }
            case 227: {
                return 228;
            }
            case 226: {
                return 227;
            }
            case 225: {
                return 226;
            }
            case 224: {
                return 225;
            }
            case 223: {
                return 224;
            }
            case 222: {
                return 223;
            }
            case 221: {
                return 222;
            }
            case 220: {
                return 221;
            }
            case 219: {
                return 220;
            }
            case 218: {
                return 219;
            }
            case 217: {
                return 218;
            }
            case 216: {
                return 217;
            }
            case 215: {
                return 216;
            }
            case 214: {
                return 215;
            }
            case 213: {
                return 214;
            }
            case 212: {
                return 213;
            }
            case 211: {
                return 212;
            }
            case 210: {
                return 211;
            }
            case 209: {
                return 210;
            }
            case 208: {
                return 209;
            }
            case 207: {
                return 208;
            }
            case 206: {
                return 207;
            }
            case 205: {
                return 206;
            }
            case 204: {
                return 205;
            }
            case 203: {
                return 204;
            }
            case 202: {
                return 203;
            }
            case 201: {
                return 202;
            }
            case 200: {
                return 201;
            }
            case 199: {
                return 200;
            }
            case 198: {
                return 199;
            }
            case 197: {
                return 198;
            }
            case 196: {
                return 197;
            }
            case 195: {
                return 196;
            }
            case 194: {
                return 195;
            }
            case 193: {
                return 194;
            }
            case 191: {
                return 192;
            }
            case 190: {
                return 191;
            }
            case 87: {
                return 88;
            }
            case 85: {
                return 86;
            }
            case 84: {
                return 85;
            }
            case 83: {
                return 84;
            }
            case 82: {
                return 83;
            }
            case 81: {
                return 82;
            }
            case 80: {
                return 81;
            }
            case 79: {
                return 80;
            }
            case 78: {
                return 79;
            }
            case 77: {
                return 78;
            }
            case 76: {
                return 77;
            }
            case 75: {
                return 76;
            }
            case 74: {
                return 75;
            }
            case 73: {
                return 74;
            }
            case 72: {
                return 73;
            }
            case 71: {
                return 72;
            }
            case 70: {
                return 71;
            }
            case 69: {
                return 70;
            }
            case 68: {
                return 69;
            }
            case 67: {
                return 68;
            }
            case 66: {
                return 67;
            }
            case 65: {
                return 66;
            }
            case 64: {
                return 65;
            }
            case 63: {
                return 64;
            }
            case 62: {
                return 63;
            }
            case 61: {
                return 62;
            }
            case 60: {
                return 61;
            }
            case 59: {
                return 60;
            }
            case 58: {
                return 59;
            }
            case 57: {
                return 58;
            }
            case 56: {
                return 57;
            }
            case 55: {
                return 56;
            }
            case 54: {
                return 55;
            }
            case 53: {
                return 54;
            }
            case 52: {
                return 53;
            }
            case 51: {
                return 52;
            }
            case 50: {
                return 51;
            }
            case 49: {
                return 50;
            }
            case 48: {
                return 49;
            }
            case 47: {
                return 48;
            }
            case 46: {
                return 47;
            }
            case 45: {
                return 46;
            }
            case 44: {
                return 45;
            }
            case 43: {
                return 44;
            }
            case 42: {
                return 43;
            }
            case 41: {
                return 42;
            }
            case 40: {
                return 41;
            }
            case 39: {
                return 40;
            }
            case 38: {
                return 39;
            }
            case 37: {
                return 38;
            }
            case 36: {
                return 37;
            }
            case 35: {
                return 36;
            }
            case 34: {
                return 35;
            }
            case 33: {
                return 34;
            }
            case 32: {
                return 33;
            }
            case 31: {
                return 32;
            }
            case 30: {
                return 31;
            }
            case 29: {
                return 30;
            }
            case 28: {
                return 29;
            }
            case 27: {
                return 28;
            }
            case 26: {
                return 27;
            }
            case 25: {
                return 26;
            }
            case 24: {
                return 25;
            }
            case 23: {
                return 24;
            }
            case 22: {
                return 23;
            }
            case 21: {
                return 22;
            }
            case 20: {
                return 21;
            }
            case 19: {
                return 20;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
        }
    }
    
    public static int bB(final int n) {
        if (n == 0) {
            return 1;
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        return 0;
                    }
                    case 20030: {
                        return 20031;
                    }
                    case 20029: {
                        return 20030;
                    }
                    case 20028: {
                        return 20029;
                    }
                    case 20027: {
                        return 20028;
                    }
                    case 20026: {
                        return 20027;
                    }
                    case 20025: {
                        return 20026;
                    }
                    case 20024: {
                        return 20025;
                    }
                }
                break;
            }
            case 20019: {
                return 20020;
            }
            case 20018: {
                return 20019;
            }
            case 20017: {
                return 20018;
            }
            case 20016: {
                return 20017;
            }
            case 20015: {
                return 20016;
            }
            case 20014: {
                return 20015;
            }
            case 20013: {
                return 20014;
            }
            case 20012: {
                return 20013;
            }
            case 20011: {
                return 20012;
            }
            case 20010: {
                return 20011;
            }
            case 20009: {
                return 20010;
            }
            case 20008: {
                return 20009;
            }
            case 20007: {
                return 20008;
            }
            case 20006: {
                return 20007;
            }
            case 20005: {
                return 20006;
            }
            case 20004: {
                return 20005;
            }
            case 20003: {
                return 20004;
            }
            case 20002: {
                return 20003;
            }
            case 20001: {
                return 20002;
            }
            case 20000: {
                return 20001;
            }
        }
    }
    
    public static int bC(final int n) {
        if (n == 0) {
            return 1;
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        return 0;
                                    }
                                    case 10122: {
                                        return 10123;
                                    }
                                    case 10121: {
                                        return 10122;
                                    }
                                    case 10120: {
                                        return 10121;
                                    }
                                    case 10119: {
                                        return 10120;
                                    }
                                    case 10118: {
                                        return 10119;
                                    }
                                    case 10117: {
                                        return 10118;
                                    }
                                    case 10116: {
                                        return 10117;
                                    }
                                    case 10115: {
                                        return 10116;
                                    }
                                    case 10114: {
                                        return 10115;
                                    }
                                    case 10113: {
                                        return 10114;
                                    }
                                    case 10112: {
                                        return 10113;
                                    }
                                }
                                break;
                            }
                            case 10110: {
                                return 10111;
                            }
                            case 10109: {
                                return 10110;
                            }
                            case 10108: {
                                return 10109;
                            }
                            case 10107: {
                                return 10108;
                            }
                            case 10106: {
                                return 10107;
                            }
                            case 10105: {
                                return 10106;
                            }
                            case 10104: {
                                return 10105;
                            }
                            case 10103: {
                                return 10104;
                            }
                            case 10102: {
                                return 10103;
                            }
                            case 10101: {
                                return 10102;
                            }
                            case 10100: {
                                return 10101;
                            }
                            case 10099: {
                                return 10100;
                            }
                            case 10098: {
                                return 10099;
                            }
                            case 10097: {
                                return 10098;
                            }
                            case 10096: {
                                return 10097;
                            }
                            case 10095: {
                                return 10096;
                            }
                            case 10094: {
                                return 10095;
                            }
                            case 10093: {
                                return 10094;
                            }
                            case 10092: {
                                return 10093;
                            }
                            case 10091: {
                                return 10092;
                            }
                            case 10090: {
                                return 10091;
                            }
                            case 10089: {
                                return 10090;
                            }
                            case 10088: {
                                return 10089;
                            }
                            case 10087: {
                                return 10088;
                            }
                            case 10086: {
                                return 10087;
                            }
                            case 10085: {
                                return 10086;
                            }
                            case 10084: {
                                return 10085;
                            }
                            case 10083: {
                                return 10084;
                            }
                            case 10082: {
                                return 10083;
                            }
                            case 10081: {
                                return 10082;
                            }
                            case 10080: {
                                return 10081;
                            }
                            case 10079: {
                                return 10080;
                            }
                            case 10078: {
                                return 10079;
                            }
                            case 10077: {
                                return 10078;
                            }
                        }
                        break;
                    }
                    case 10075: {
                        return 10076;
                    }
                    case 10074: {
                        return 10075;
                    }
                    case 10073: {
                        return 10074;
                    }
                    case 10072: {
                        return 10073;
                    }
                    case 10071: {
                        return 10072;
                    }
                    case 10070: {
                        return 10071;
                    }
                    case 10069: {
                        return 10070;
                    }
                    case 10068: {
                        return 10069;
                    }
                    case 10067: {
                        return 10068;
                    }
                    case 10066: {
                        return 10067;
                    }
                    case 10065: {
                        return 10066;
                    }
                    case 10064: {
                        return 10065;
                    }
                    case 10063: {
                        return 10064;
                    }
                    case 10062: {
                        return 10063;
                    }
                    case 10061: {
                        return 10062;
                    }
                    case 10060: {
                        return 10061;
                    }
                    case 10059: {
                        return 10060;
                    }
                    case 10058: {
                        return 10059;
                    }
                    case 10057: {
                        return 10058;
                    }
                    case 10056: {
                        return 10057;
                    }
                    case 10055: {
                        return 10056;
                    }
                    case 10054: {
                        return 10055;
                    }
                    case 10053: {
                        return 10054;
                    }
                    case 10052: {
                        return 10053;
                    }
                    case 10051: {
                        return 10052;
                    }
                    case 10050: {
                        return 10051;
                    }
                    case 10049: {
                        return 10050;
                    }
                    case 10048: {
                        return 10049;
                    }
                    case 10047: {
                        return 10048;
                    }
                    case 10046: {
                        return 10047;
                    }
                    case 10045: {
                        return 10046;
                    }
                    case 10044: {
                        return 10045;
                    }
                    case 10043: {
                        return 10044;
                    }
                    case 10042: {
                        return 10043;
                    }
                    case 10041: {
                        return 10042;
                    }
                    case 10040: {
                        return 10041;
                    }
                    case 10039: {
                        return 10040;
                    }
                    case 10038: {
                        return 10039;
                    }
                }
                break;
            }
            case 10036: {
                return 10037;
            }
            case 10035: {
                return 10036;
            }
            case 10034: {
                return 10035;
            }
            case 10033: {
                return 10034;
            }
            case 10032: {
                return 10033;
            }
            case 10031: {
                return 10032;
            }
            case 10030: {
                return 10031;
            }
            case 10029: {
                return 10030;
            }
            case 10028: {
                return 10029;
            }
            case 10027: {
                return 10028;
            }
            case 10026: {
                return 10027;
            }
            case 10025: {
                return 10026;
            }
            case 10024: {
                return 10025;
            }
            case 10023: {
                return 10024;
            }
            case 10022: {
                return 10023;
            }
            case 10021: {
                return 10022;
            }
            case 10020: {
                return 10021;
            }
            case 10019: {
                return 10020;
            }
            case 10018: {
                return 10019;
            }
            case 10017: {
                return 10018;
            }
            case 10016: {
                return 10017;
            }
            case 10015: {
                return 10016;
            }
            case 10014: {
                return 10015;
            }
            case 10013: {
                return 10014;
            }
            case 10012: {
                return 10013;
            }
            case 10011: {
                return 10012;
            }
            case 10010: {
                return 10011;
            }
            case 10009: {
                return 10010;
            }
            case 10008: {
                return 10009;
            }
            case 10007: {
                return 10008;
            }
            case 10006: {
                return 10007;
            }
            case 10005: {
                return 10006;
            }
            case 10004: {
                return 10005;
            }
            case 10003: {
                return 10004;
            }
            case 10002: {
                return 10003;
            }
            case 10001: {
                return 10002;
            }
            case 10000: {
                return 10001;
            }
        }
    }
    
    public static int bD(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int bE(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int bF(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bG(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bH(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bI(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int bJ(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int bK(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int bL(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int bM(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bN(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bO(final int n) {
        return n - 2;
    }
    
    public static int bP(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static int bQ(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bR(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bS(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bT(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bU(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int bV(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bW(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bX(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int bY(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bZ(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ba(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bb(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int bc(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int bd(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int be(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bf(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int bg(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bh(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bi(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int bj(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int bk(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int bl(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int bm(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int bn(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int bo(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int bp(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int bq(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int br(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int bs(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int bt(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int bu(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int bv(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int bw(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int bx(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int by(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int bz(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int c(final int n) {
        final int length = aqtm.a.length;
        if (n < 8492) {
            final char c = aqtm.a[n];
            if (c != '\0') {
                return c;
            }
        }
        final int lowerCase = Character.toLowerCase(n);
        if (lowerCase != n) {
            return lowerCase;
        }
        return Character.toUpperCase(n);
    }
    
    public static int cA(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int cB(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int cC(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 42: {
                return 43;
            }
            case 41: {
                return 42;
            }
            case 40: {
                return 41;
            }
            case 39: {
                return 40;
            }
            case 38: {
                return 39;
            }
            case 37: {
                return 38;
            }
            case 36: {
                return 37;
            }
            case 35: {
                return 36;
            }
            case 34: {
                return 35;
            }
            case 33: {
                return 34;
            }
            case 32: {
                return 33;
            }
            case 31: {
                return 32;
            }
            case 29: {
                return 30;
            }
            case 28: {
                return 29;
            }
            case 27: {
                return 28;
            }
            case 26: {
                return 27;
            }
            case 25: {
                return 26;
            }
            case 22: {
                return 23;
            }
            case 21: {
                return 22;
            }
            case 20: {
                return 21;
            }
            case 19: {
                return 20;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cD(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int cE(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int cF(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 4) {
            return 5;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static int cG(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cH(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int cI(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int cJ(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int cK(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int cL(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cM(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cN(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cO(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cP(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int cQ(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int cR(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cS(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static String cT(final int n) {
        if (n == 1) {
            return "OFFLINE_ORCHESTRATION_ACTION_TYPE_UNKNOWN";
        }
        if (n == 2) {
            return "OFFLINE_ORCHESTRATION_ACTION_TYPE_ADD";
        }
        if (n == 3) {
            return "OFFLINE_ORCHESTRATION_ACTION_TYPE_DELETE";
        }
        if (n != 4) {
            return "OFFLINE_ORCHESTRATION_ACTION_TYPE_UPDATE";
        }
        return "OFFLINE_ORCHESTRATION_ACTION_TYPE_REFRESH";
    }
    
    public static int cU(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int cV(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cW(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int cX(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int cY(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cZ(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int ca(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int cb(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int cc(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 52: {
                return 53;
            }
            case 51: {
                return 52;
            }
            case 50: {
                return 51;
            }
            case 49: {
                return 50;
            }
            case 48: {
                return 49;
            }
            case 47: {
                return 48;
            }
            case 46: {
                return 47;
            }
            case 45: {
                return 46;
            }
            case 43: {
                return 44;
            }
            case 42: {
                return 43;
            }
            case 41: {
                return 42;
            }
            case 40: {
                return 41;
            }
            case 39: {
                return 40;
            }
            case 38: {
                return 39;
            }
            case 37: {
                return 38;
            }
            case 36: {
                return 37;
            }
            case 35: {
                return 36;
            }
            case 34: {
                return 35;
            }
            case 33: {
                return 34;
            }
            case 32: {
                return 33;
            }
            case 31: {
                return 32;
            }
            case 30: {
                return 31;
            }
            case 29: {
                return 30;
            }
            case 28: {
                return 29;
            }
            case 27: {
                return 28;
            }
            case 26: {
                return 27;
            }
            case 25: {
                return 26;
            }
            case 24: {
                return 25;
            }
            case 23: {
                return 24;
            }
            case 22: {
                return 23;
            }
            case 21: {
                return 22;
            }
            case 20: {
                return 21;
            }
            case 19: {
                return 20;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cd(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ce(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cf(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int cg(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int ch(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ci(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cj(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ck(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int cl(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cm(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int cn(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int co(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int cp(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int cq(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int cr(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int cs(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ct(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int cu(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int cv(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cw(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int cx(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int cy(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static int cz(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static boolean d(final int[][] array, final int n) {
        if (n >= array[0][0]) {
            int length = array.length;
            int i = 0;
            while (i < length) {
                final int n2 = (length - i) / 2 + i;
                final int[] array2 = array[n2];
                final int n3 = array2[0];
                if (n3 <= n && n <= array2[1]) {
                    if ((n - n3) % array2[2] == 0) {
                        return true;
                    }
                    break;
                }
                else if (n < n3) {
                    length = n2;
                }
                else {
                    i = n2 + 1;
                }
            }
        }
        return false;
    }
    
    public static int dA(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int dB(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int dC(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int dD(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int dE(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int dF(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int dG(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int dH(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int dI(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int dJ(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int dK(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int dL(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int dM(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int dN(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 29: {
                return 30;
            }
            case 28: {
                return 29;
            }
            case 27: {
                return 28;
            }
            case 26: {
                return 27;
            }
            case 25: {
                return 26;
            }
            case 24: {
                return 25;
            }
            case 23: {
                return 24;
            }
            case 22: {
                return 23;
            }
            case 21: {
                return 22;
            }
            case 20: {
                return 21;
            }
            case 19: {
                return 20;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int dO(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int dP(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int dQ(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int dR(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int dS(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int dT(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    private static void dU(final File file) {
        if (file.isDirectory()) {
            final FileSystem default1 = FileSystems.getDefault();
            final String path = file.getPath();
            int i = 0;
            if (!Files.isSymbolicLink(default1.getPath(path, new String[0]))) {
                final File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    while (i < listFiles.length) {
                        dU(listFiles[i]);
                        ++i;
                    }
                }
            }
        }
        file.delete();
    }
    
    private static IBinder dV(final ClassLoader classLoader) {
        try {
            return (IBinder)classLoader.loadClass("com.google.vr.vrcore.library.VrCreator").newInstance();
        }
        catch (final IllegalAccessException ex) {
            throw new IllegalStateException("Unable to call the default constructor of com.google.vr.vrcore.library.VrCreator");
        }
        catch (final InstantiationException ex2) {
            throw new IllegalStateException("Unable to instantiate the remote class com.google.vr.vrcore.library.VrCreator");
        }
        catch (final ClassNotFoundException ex3) {
            throw new IllegalStateException("Unable to find dynamic class com.google.vr.vrcore.library.VrCreator");
        }
    }
    
    public static int da(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int db(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int dc(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int dd(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int de(final int n) {
        if (n == 90) {
            return 91;
        }
        if (n == 91) {
            return 92;
        }
        switch (n) {
            default: {
                return 0;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int df(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int dg(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int dh(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int di(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int dj(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int dk(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int dl(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int dm(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int dn(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 32: {
                return 33;
            }
            case 31: {
                return 32;
            }
            case 30: {
                return 31;
            }
            case 29: {
                return 30;
            }
            case 28: {
                return 29;
            }
            case 27: {
                return 28;
            }
            case 26: {
                return 27;
            }
            case 25: {
                return 26;
            }
            case 24: {
                return 25;
            }
            case 23: {
                return 24;
            }
            case 22: {
                return 23;
            }
            case 21: {
                return 22;
            }
            case 20: {
                return 21;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int do(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int dp(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int dq(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int dr(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int ds(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int dt(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int du(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int dv(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int dw(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int dx(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static String dy(final int n) {
        return Integer.toString(n - 1);
    }
    
    public static void dz(final int n) {
        if (n != 0) {
            return;
        }
        throw null;
    }
    
    public static int e(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int f(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int g(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int h(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static final VideoCodecStatus i(final Handler ex, Callable o, final String s) {
        Label_0278: {
            try {
                try {
                    final acqb acqb;
                    Label_0198: {
                        if (((Handler)ex).getLooper().getThread() == Thread.currentThread()) {
                            try {
                                o = ((Callable<TimeoutException>)o).call();
                                break Label_0198;
                            }
                            catch (final Exception ex2) {
                                o = new ExecutionException(ex2);
                                throw o;
                            }
                        }
                        final arfi arfi = new arfi();
                        acqb = new acqb();
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        final aaxa aaxa = new aaxa(arfi, (Callable)o, acqb, countDownLatch, 5, (byte[])null, (byte[])null, (byte[])null);
                        try {
                            if (!((Handler)ex).post((Runnable)aaxa)) {
                                throw new IllegalStateException("Posting on the handler failed. (Thread is not alive.)");
                            }
                            while (!countDownLatch.await(3000L, TimeUnit.MILLISECONDS)) {
                                final Thread thread = ((Handler)ex).getLooper().getThread();
                                if (!thread.isAlive()) {
                                    throw new IllegalStateException("Underlying thread died while waiting for the operation to complete.");
                                }
                                o = new Throwable();
                                ((Throwable)o).setStackTrace(thread.getStackTrace());
                                Logging.e("ThreadUtils", "Invoke waiting to complete.", new Throwable((Throwable)o));
                            }
                            if (acqb.a == null) {
                                o = arfi.a;
                                return (VideoCodecStatus)o;
                            }
                        }
                        catch (final TimeoutException o) {
                            break Label_0278;
                        }
                    }
                    o = new ExecutionException((Throwable)acqb.a);
                    throw o;
                    o = new IllegalStateException("Posting on the handler failed. (Thread is not alive.)");
                    throw o;
                }
                catch (final InterruptedException ex) {
                    Logging.c("ThreadUtils", "Interrupted", (Throwable)ex);
                    Thread.currentThread().interrupt();
                    return VideoCodecStatus.e;
                }
                catch (final IllegalStateException ex) {}
                catch (final ExecutionException ex3) {}
                Logging.c("ThreadUtils", "Exception", (Throwable)ex);
                return VideoCodecStatus.e;
            }
            catch (final TimeoutException ex4) {}
        }
        final Thread thread2 = ((Handler)ex).getLooper().getThread();
        if (thread2.isAlive()) {
            final Throwable t = new Throwable();
            t.setStackTrace(thread2.getStackTrace());
            final StringBuilder sb = new StringBuilder("Timeout waiting for ");
            sb.append(s);
            sb.append(". Thread is busy");
            Logging.c("ThreadUtils", sb.toString(), new Throwable(t));
        }
        else {
            Logging.c("ThreadUtils", "Thread died while waiting for ".concat(s), (Throwable)o);
        }
        return VideoCodecStatus.e;
    }
    
    public static final void j(final arek arek, final afhl afhl) {
        final int b = arek.b;
        final boolean b2 = true;
        adkp.H(0x1 == (b & 0x1));
        adkp.H((arek.b & 0x2) != 0x0);
        adkp.H((arek.b & 0x20) != 0x0);
        adkp.H((arek.b & 0x40) != 0x0);
        adkp.H((arek.b & 0x80) != 0x0 && b2);
        arei arei;
        if ((arei = arei.b(arek.c)) == null) {
            arei = arei.a;
        }
        afhl.p(arei, arek);
    }
    
    public static final void k(final arej arej, final afhl afhl) {
        final int b = arej.b;
        final boolean b2 = true;
        adkp.H(0x1 == (b & 0x1));
        adkp.H((arej.b & 0x2) != 0x0 && b2);
        arei arei;
        if ((arei = arei.b(arej.c)) == null) {
            arei = arei.a;
        }
        afhl.p(arei, arej);
    }
    
    public static Context l(final Context context) {
        if (aqsx.c == null) {
            final int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
            if (vrCoreClientApiVersion >= 9) {
                try {
                    aqsx.c = context.createPackageContext("com.google.vr.vrcore", 3);
                    aqsx.a = vrCoreClientApiVersion;
                    return aqsx.c;
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    throw new ardc(1);
                }
            }
            throw new ardc(4);
        }
        return aqsx.c;
    }
    
    public static area m(final Context context) {
        if (aqsx.d == null) {
            final IBinder dv = dV(l(context).getClassLoader());
            area d;
            if (dv == null) {
                d = null;
            }
            else {
                final IInterface queryLocalInterface = dv.queryLocalInterface("com.google.vr.vrcore.library.api.IVrCreator");
                if (queryLocalInterface instanceof area) {
                    d = (area)queryLocalInterface;
                }
                else {
                    d = new area(dv);
                }
            }
            aqsx.d = d;
        }
        return aqsx.d;
    }
    
    public static boolean n(final Context context) {
        synchronized (aqsx.class) {
            if (aqsx.b == null) {
                try {
                    aqsx.b = ardb.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64), new Signature[] { ardb.c, ardb.d, ardb.b });
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    throw new IllegalStateException("Unable to find self package info", (Throwable)ex);
                }
            }
            return aqsx.b;
        }
    }
    
    public static Uri o(final String s, final String s2) {
        return new Uri$Builder().scheme("content").authority(s).path(s2).build();
    }
    
    public static arda p(final Context context) {
        final arzp y = y(context);
        if (y != null) {
            return (arda)new arby((ContentProviderClient)y.a, (String)y.b);
        }
        return (arda)new arck(context);
    }
    
    public static List q(final Context context) {
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            final ArrayList list = new ArrayList();
            list.add("com.google.vr.vrcore.settings");
            return list;
        }
        final List queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("android.content.action.VR_SETTINGS_PROVIDER"), 0);
        if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
            final ArrayList list2 = new ArrayList();
            final Iterator iterator = queryIntentContentProviders.iterator();
            while (iterator.hasNext()) {
                final ProviderInfo providerInfo = ((ResolveInfo)iterator.next()).providerInfo;
                if (arbu.l(providerInfo.packageName)) {
                    list2.add(providerInfo.authority);
                }
            }
            return list2;
        }
        return null;
    }
    
    public static final atqu r(final atmd atmd) {
        atmd.getClass();
        atmd plus = atmd;
        if (atmd.get((atmb)atrw.c) == null) {
            plus = atmd.plus((atmd)aqsz.u());
        }
        return (atqu)new atvk(plus);
    }
    
    public static final Throwable s(final Throwable t, final Throwable t2) {
        if (t == t2) {
            return t;
        }
        final RuntimeException ex = new RuntimeException("Exception while trying to handle coroutine exception", t2);
        aqsy.v(ex, t);
        return ex;
    }
    
    public static final void t(final atmd atmd, final Throwable t) {
        atmd.getClass();
        try {
            final CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler)atmd.get((atmb)CoroutineExceptionHandler.a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(atmd, t);
                return;
            }
            atqr.a(atmd, t);
        }
        finally {
            final Throwable t2;
            atqr.a(atmd, s(t, t2));
        }
    }
    
    static boolean u(final asjk asjk) {
        try {
            return ((asnj)asjk).j;
        }
        finally {
            final Throwable t;
            asgz.c(t);
            return true;
        }
    }
    
    public static boolean v(long value, final aukf aukf, final Queue queue, final AtomicLong atomicLong, final asjk asjk) {
        long n = value & Long.MIN_VALUE;
        while (true) {
            if (n != value) {
                if (u(asjk)) {
                    return true;
                }
                final Object poll = queue.poll();
                if (poll == null) {
                    aukf.tx();
                    return true;
                }
                aukf.tu(poll);
                ++n;
            }
            else {
                if (u(asjk)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    aukf.tx();
                    return true;
                }
                if ((value = atomicLong.get()) != n) {
                    continue;
                }
                final long addAndGet = atomicLong.addAndGet(-(n & Long.MAX_VALUE));
                if ((Long.MAX_VALUE & addAndGet) == 0x0L) {
                    return false;
                }
                value = addAndGet;
                n = (addAndGet & Long.MIN_VALUE);
            }
        }
    }
    
    public static boolean w(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    public static final aeea x(final String s) {
        return new aeea(MediaCodec.createByCodecName(s));
    }
    
    public static arzp y(final Context context) {
        final List q = q(context);
        if (q != null) {
            for (final String s : q) {
                final ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(s);
                if (acquireContentProviderClient != null) {
                    return new arzp(acquireContentProviderClient, s);
                }
            }
        }
        return null;
    }
    
    public static int z(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
}
