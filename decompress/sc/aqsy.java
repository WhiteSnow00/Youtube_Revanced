import android.app.Activity;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.Date;
import android.view.View;
import java.lang.annotation.Annotation;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.ProcessorBase$Callback;
import com.google.research.xeno.effect.ProcessorBase;

// 
// Decompiled by Procyon v0.6.0
// 

public class aqsy
{
    public static boolean e(final int n) {
        return n - 1 >= 19;
    }
    
    public static int f(final int n) {
        switch (n) {
            default: {
                return 0;
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
            case 122: {
                return 123;
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
            case 107: {
                return 108;
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
            case 102: {
                return 103;
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
            case 88: {
                return 89;
            }
            case 87: {
                return 88;
            }
            case 86: {
                return 87;
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
    
    public static void g(final long n, final ProcessorBase processorBase, final long n2, final ProcessorBase$Callback processorBase$Callback, final Effect effect) {
        if (n2 == 0L) {
            if (processorBase$Callback != null) {
                processorBase$Callback.onCompletion(false, "Processor has been released");
            }
            return;
        }
        ProcessorBase.nativeSetEffect(n2, n, (ProcessorBase$Callback)new aqvd(processorBase, effect, processorBase$Callback));
    }
    
    public static ListenableFuture h() {
        throw new UnsupportedOperationException();
    }
    
    public static int i(final int n) {
        switch (n) {
            default: {
                return 0;
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
            case 192: {
                return 193;
            }
            case 191: {
                return 192;
            }
            case 190: {
                return 191;
            }
            case 189: {
                return 190;
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
            case 184: {
                return 185;
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
            case 168: {
                return 169;
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
            case 159: {
                return 160;
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
            case 122: {
                return 123;
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
            case 107: {
                return 108;
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
            case 102: {
                return 103;
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
            case 88: {
                return 89;
            }
            case 87: {
                return 88;
            }
            case 86: {
                return 87;
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
    
    public static Object j(final Context context, final Class clazz) {
        context.getClass();
        return k(aqsz.r(context.getApplicationContext()), clazz);
    }
    
    public static Object k(final Object o, final Class clazz) {
        if (o instanceof arll) {
            if (o instanceof arlo) {
                final Annotation[] annotations = clazz.getAnnotations();
                while (true) {
                    for (int length = annotations.length, i = 0; i < length; ++i) {
                        if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                            final int n = 1;
                            aqsz.l((boolean)((n ^ 0x1) != 0x0), "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", clazz.getCanonicalName());
                            return clazz.cast(o);
                        }
                    }
                    final int n = 0;
                    continue;
                }
            }
            return clazz.cast(o);
        }
        if (o instanceof arlm) {
            return k(((arlm)o).aR(), clazz);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", o.getClass(), arll.class, arlm.class));
    }
    
    public static void l(final br br) {
        Object o = br;
        while (true) {
            br c;
            do {
                c = ((br)o).C;
                if (c == null) {
                    final bu od = br.od();
                    arkk arkk;
                    if (od instanceof arkk) {
                        arkk = (arkk)od;
                    }
                    else {
                        if (!(((Activity)od).getApplication() instanceof arkk)) {
                            throw new IllegalArgumentException(String.format("No injector was found for %s", br.getClass().getCanonicalName()));
                        }
                        arkk = (arkk)((Activity)od).getApplication();
                    }
                    final auch f = arkk.f();
                    arkk.getClass();
                    f.getClass();
                    f.s(br);
                    return;
                }
                o = c;
            } while (!(c instanceof arkk));
            arkk arkk = (arkk)c;
            continue;
        }
    }
    
    public static void m(final Object o, final arkk arkk) {
        final auch f = arkk.f();
        arkk.getClass();
        f.getClass();
        f.s(o);
    }
    
    public static asht n(final View view) {
        if (view != null) {
            return (asht)new arih(view);
        }
        throw new NullPointerException("view == null");
    }
    
    public static long o(final Date date) {
        return date.getTime() / 1000L + 2082844800L;
    }
    
    public static Date p(final long n) {
        return new Date((n - 2082844800L) * 1000L);
    }
    
    public static int q(final long n) {
        if (n <= 2147483647L && n >= -2147483648L) {
            return (int)n;
        }
        final StringBuilder sb = new StringBuilder(98);
        sb.append("A cast to int has gone wrong. Please contact the mp4parser discussion group (");
        sb.append(n);
        sb.append(")");
        throw new RuntimeException(sb.toString());
    }
    
    public static arei r(final String s) {
        int n = 0;
        Label_0153: {
            switch (s.hashCode()) {
                case 68036687: {
                    if (s.equals("H265X")) {
                        n = 3;
                        break Label_0153;
                    }
                    break;
                }
                case 2194728: {
                    if (s.equals("H264")) {
                        n = 2;
                        break Label_0153;
                    }
                    break;
                }
                case 2020668: {
                    if (s.equals("AV1X")) {
                        n = 5;
                        break Label_0153;
                    }
                    break;
                }
                case 85183: {
                    if (s.equals("VP9")) {
                        n = 1;
                        break Label_0153;
                    }
                    break;
                }
                case 85182: {
                    if (s.equals("VP8")) {
                        n = 0;
                        break Label_0153;
                    }
                    break;
                }
                case 65180: {
                    if (s.equals("AV1")) {
                        n = 4;
                        break Label_0153;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n == 0) {
            return arei.b;
        }
        if (n == 1) {
            return arei.c;
        }
        if (n == 2) {
            return arei.d;
        }
        if (n == 3) {
            return arei.e;
        }
        if (n != 4 && n != 5) {
            throw new IllegalArgumentException("VideoCodecType has no value named ".concat(String.valueOf(s)));
        }
        return arei.f;
    }
    
    public static atqp s(final Executor executor) {
        executor.getClass();
        if (executor instanceof atrf) {
            final atrf atrf = (atrf)executor;
        }
        return (atqp)new atro(executor);
    }
    
    public static atrn t(final ExecutorService executorService) {
        return (atrn)new atro((Executor)executorService);
    }
    
    public static CancellationException u(final String s, final Throwable t) {
        final CancellationException ex = new CancellationException(s);
        ex.initCause(t);
        return ex;
    }
    
    public static void v(final Throwable t, final Throwable t2) {
        t2.getClass();
        if (t != t2) {
            final int a = atmt.a;
            final Method a2 = atmr.a;
            if (a2 != null) {
                a2.invoke(t, t2);
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
    
    public static aeea x(final aqwn aqwn) {
        return new aeea(aqwn);
    }
    
    public void a(final aqxa aqxa) {
    }
    
    public void b(final aqxa aqxa) {
    }
    
    public void c(final aqxa aqxa) {
    }
    
    public void d() {
    }
}
