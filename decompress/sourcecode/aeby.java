import java.util.SortedMap;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import android.os.Bundle;
import android.media.MediaCodec$BufferInfo;
import java.util.concurrent.Executor;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.video.state.PlaybackListenerStateRestorerState;
import java.util.Collection;
import com.google.android.libraries.blocks.Container;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.blocks.runtime.BaseClient;
import android.util.Base64;
import android.content.SharedPreferences;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.CommandOuterClass$GestureOptions;
import java.util.IllegalFormatException;
import android.util.Log;
import java.util.Locale;
import java.util.Arrays;
import android.text.TextUtils;
import android.widget.Button;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.ArrayDeque;
import j$.util.DesugarCollections;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import android.os.Process;
import j$.util.Optional;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.apps.tiktok.account.AccountId;
import java.lang.ref.WeakReference;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.media.MediaCodec;
import android.content.Context;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeby
{
    public static aeby b;
    public final Object a;
    
    public aeby() {
        this.a = new HashMap();
    }
    
    public aeby(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9) {
        final float[] a = new float[9];
        this.a = a;
        final float[] array = a;
        array[0] = n;
        array[1] = n2;
        array[2] = n3;
        array[3] = n4;
        array[4] = n5;
        array[5] = n6;
        array[6] = n7;
        array[7] = n8;
        array[8] = n9;
    }
    
    public aeby(final int n, final aaso aaso) {
        this.a = new byte[n + n];
        final double n2 = n - 1;
        int n3 = 0;
        double n4 = 0.0;
        int n5 = 0;
        int n6;
        while (true) {
            n6 = n >> 2;
            if (n3 >= n6) {
                break;
            }
            n4 = aaso.a(n3, n2) * 65279.0;
            final Object a = this.a;
            final int n7 = n5 + 1;
            final byte[] array = (byte[])a;
            array[n5] = (byte)(n4 / 256.0);
            n5 = n7 + 1;
            array[n7] = (byte)(n4 % 256.0);
            ++n3;
        }
        int i = n6 + 3;
        double n8 = n4;
        final double n9 = n2;
        while (i < n) {
            final double n10 = (aaso.a(i, n9) * 65279.0 - n8) / 4.0;
            final double n11 = n8 + n10;
            final Object a2 = this.a;
            final int n12 = n5 + 1;
            final byte[] array2 = (byte[])a2;
            array2[n5] = (byte)(n11 / 256.0);
            final int n13 = n12 + 1;
            array2[n12] = (byte)(n11 % 256.0);
            final double n14 = n11 + n10;
            final int n15 = n13 + 1;
            array2[n13] = (byte)(n14 / 256.0);
            final int n16 = n15 + 1;
            array2[n15] = (byte)(n14 % 256.0);
            final double n17 = n14 + n10;
            final int n18 = n16 + 1;
            array2[n16] = (byte)(n17 / 256.0);
            final int n19 = n18 + 1;
            array2[n18] = (byte)(n17 % 256.0);
            n8 = n17 + n10;
            final int n20 = n19 + 1;
            array2[n19] = (byte)(n8 / 256.0);
            n5 = n20 + 1;
            array2[n20] = (byte)(n8 % 256.0);
            i += 4;
        }
        for (i -= 3; i < n; ++i) {
            final double n21 = aaso.a(i, n9) * 65279.0;
            final Object a3 = this.a;
            final int n22 = n5 + 1;
            final byte[] array3 = (byte[])a3;
            array3[n5] = (byte)(n21 / 256.0);
            n5 = n22 + 1;
            array3[n22] = (byte)(n21 % 256.0);
        }
    }
    
    public aeby(final aacw a) {
        this.a = a;
    }
    
    public aeby(final aaex a) {
        this.a = a;
    }
    
    public aeby(final aapf a) {
        a.getClass();
        this.a = a;
    }
    
    public aeby(final abnr abnr) {
        this.a = abnr.b();
    }
    
    public aeby(final abns a) {
        this.a = a;
    }
    
    public aeby(final abpx a) {
        this.a = a;
    }
    
    public aeby(final acb a) {
        this.a = a;
    }
    
    public aeby(final adfg a) {
        this.a = a;
    }
    
    public aeby(final aeac a) {
        this.a = a;
    }
    
    public aeby(final aeam a) {
        this.a = a;
    }
    
    public aeby(final aeby a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public aeby(final aeby a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
    }
    
    public aeby(final aeby aeby, final byte[] array, final char[] array2) {
        this.a = aeby.a;
    }
    
    public aeby(final aeim a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public aeby(final agza a) {
        this.a = a;
    }
    
    public aeby(final agzc a) {
        this.a = a;
    }
    
    public aeby(final Context a) {
        this.a = a;
    }
    
    public aeby(final Context a, final byte[] array) {
        this.a = a;
    }
    
    public aeby(final Context a, final char[] array) {
        this.a = a;
    }
    
    public aeby(final Context a, final short[] array) {
        this.a = a;
    }
    
    public aeby(final MediaCodec a) {
        this.a = a;
    }
    
    public aeby(final aqua a) {
        this.a = a;
    }
    
    public aeby(final atjj a) {
        a.getClass();
        this.a = a;
    }
    
    public aeby(final atjj a, final byte[] array) {
        a.getClass();
        this.a = a;
    }
    
    public aeby(final atjj a, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public aeby(final atjj a, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
    }
    
    public aeby(final atjj a, final byte[] array, final byte[] array2, final char[] array3) {
        this.a = a;
    }
    
    public aeby(final atjj a, final byte[] array, final char[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public aeby(final atjj a, final byte[] array, final short[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public aeby(final atjj a, final char[] array) {
        a.getClass();
        this.a = a;
    }
    
    public aeby(final atjj a, final char[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public aeby(final atjj a, final short[] array) {
        this.a = a;
    }
    
    public aeby(final atjj a, final short[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public aeby(final PlayerResponseModel a) {
        this.a = a;
    }
    
    public aeby(final SubtitleTrack a) {
        this.a = a;
        new WeakReference(null);
    }
    
    public aeby(final AccountId a) {
        this.a = a;
    }
    
    public aeby(final ListenableFuture listenableFuture, final aexq aexq) {
        this.a = Pair.create((Object)listenableFuture, (Object)aexq);
    }
    
    public aeby(final Optional optional, Optional empty) {
        if (!(boolean)optional.orElse((Object)false)) {
            empty = Optional.empty();
        }
        this.a = empty;
    }
    
    public aeby(final Object a) {
        this.a = a;
    }
    
    public aeby(final String s) {
        final StringBuilder sb = new StringBuilder("[");
        sb.append(s);
        sb.append("] ");
        this.a = sb.toString();
    }
    
    public aeby(final String a, final String s) {
        a.getClass();
        this.a = a;
        s.getClass();
    }
    
    public aeby(final String s, final byte[] array) {
        final int myUid = Process.myUid();
        final int myPid = Process.myPid();
        final StringBuilder sb = new StringBuilder("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        this.a = sb.toString().concat(String.valueOf(s));
    }
    
    public aeby(final List a) {
        this.a = a;
    }
    
    public aeby(final Map a) {
        this.a = a;
    }
    
    public aeby(final Map map, Map unmodifiableMap) {
        if (!map.isEmpty()) {
            final LinkedHashMap j = aqqn.j(((afgm)map).d + ((afgm)unmodifiableMap).d);
            j.putAll(unmodifiableMap);
            for (final Map.Entry<Class, V> entry : ((afcw)map).r()) {
                j.put(entry.getKey().getName(), entry.getValue());
            }
            unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)j);
        }
        this.a = unmodifiableMap;
    }
    
    public aeby(final Map a, final byte[] array) {
        this.a = a;
    }
    
    public aeby(final Set a) {
        this.a = a;
    }
    
    public aeby(final oak a) {
        this.a = a;
    }
    
    public aeby(final olq a) {
        this.a = a;
    }
    
    public aeby(final otd a) {
        a.getClass();
        this.a = a;
    }
    
    public aeby(final tdz a, final asgt asgt, final abhr abhr, final abmt abmt, final asgt asgt2, final asgt asgt3) {
        this.a = a;
        final asib asib = new asib();
        asib.c(asgt.p().am((asix)new abgn(this, 10, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(asgt2.am((asix)new abgn(this, 13, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(asgt3.am((asix)new abgn(this, 15, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(((asgt)abhr.a).p().am((asix)new abgn(this, 16, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(abhr.b().p().am((asix)new abgn(this, 17, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(((asgt)abhr.e).p().am((asix)new abhg(this, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(abmt.J().p().am((asix)new abhg(this, 15, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(abmt.K().p().am((asix)new abhg(this, 16, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(abmt.M().p().am((asix)new abhg(this, 17, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(abmt.L().p().am((asix)new abhg(this, 18, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(abmt.N().p().am((asix)new abhg(this, 19, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(abmt.O().p().am((asix)new abhg(this, 20, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(abmt.P().p().am((asix)new abhi(this, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(abmt.Q().p().am((asix)new abgn(this, 11, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(abmt.S().p().am((asix)new abgn(this, 12, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
        asib.c(abmt.T().p().am((asix)new abgn(this, 14, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asix)abdi.h));
    }
    
    public aeby(final tku a) {
        this.a = a;
    }
    
    public aeby(final tmp a) {
        this.a = a;
    }
    
    public aeby(final uyi a) {
        this.a = a;
    }
    
    public aeby(final vce a) {
        this.a = a;
    }
    
    public aeby(final xpb a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public aeby(final xqp a, final abhr abhr) {
        this.a = a;
        new asib().c(abhr.b().P(ashw.a()).am((asix)new abtm(this, 10, null, null, null), (asix)abdi.q));
    }
    
    public aeby(final xun a) {
        this.a = a;
    }
    
    public aeby(final yzf a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public aeby(final zba a) {
        this.a = a;
    }
    
    public aeby(final zbo a) {
        this.a = a;
    }
    
    public aeby(final zdl a) {
        this.a = a;
    }
    
    public aeby(final zhs a) {
        this.a = a;
    }
    
    public aeby(final byte[] array) {
        this.a = new ArrayList();
    }
    
    public aeby(final byte[] array, final byte[] array2) {
        this.a = new HashSet();
    }
    
    public aeby(final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final char[] array5) {
        this.a = new HashMap();
    }
    
    public aeby(final byte[] array, final byte[] array2, final byte[] array3, final char[] array4) {
        this.a = new ArrayList();
    }
    
    public aeby(final byte[] array, final byte[] array2, final short[] array3) {
        final aclx a = new aclx();
        a.b();
        this.a = a;
    }
    
    public aeby(final byte[] array, final char[] array2, final char[] array3) {
        this.a = new HashSet();
    }
    
    public aeby(final byte[] array, final short[] array2) {
        this.a = new WeakHashMap();
    }
    
    public aeby(final byte[] array, final short[] array2, final byte[] array3) {
        this.a = new TreeMap();
    }
    
    public aeby(final char[] array) {
        this.a = new float[] { 0.0f, 0.0f, 0.0f, 1.0f };
    }
    
    public aeby(final char[] array, final byte[] array2, final char[] array3) {
        this.a = new HashSet();
    }
    
    public aeby(final char[] array, final char[] array2) {
        this.a = DesugarCollections.synchronizedMap((Map)new WeakHashMap());
    }
    
    public aeby(final char[] array, final char[] array2, final byte[] array3) {
        this.a = new ArrayDeque();
    }
    
    public aeby(final int[] array) {
        this.a = new HashSet();
    }
    
    public aeby(final int[] array, final byte[] array2) {
        this.a = afab.y();
    }
    
    public aeby(final int[] array, final long[] array2, final long[] array3, final long[] array4) {
        this.a = new bta(array, array2, array3, array4);
    }
    
    public aeby(final short[] array, final byte[] array2) {
        this.a = new HashMap();
    }
    
    public aeby(final boolean[] array) {
        this.a = new float[9];
    }
    
    public static boolean aC(final anbh anbh) {
        anbh.getClass();
        return anbh.d < 0 || anbh.e < 0;
    }
    
    public static final anbh aD(final aioe aioe) {
        if (aioe != null) {
            if (((agzd)aioe).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
                final apqg apqg = (apqg)((agzd)aioe).rr((agyr)WatchEndpointOuterClass.watchEndpoint);
                apqh apqh;
                if ((apqh = apqg.o) == null) {
                    apqh = apqh.a;
                }
                if ((apqh.b & 0x1) != 0x0) {
                    apqh apqh2;
                    if ((apqh2 = apqg.o) == null) {
                        apqh2 = apqh.a;
                    }
                    anbh anbh;
                    if ((anbh = apqh2.c) == null) {
                        anbh = anbh.a;
                    }
                    return anbh;
                }
            }
        }
        return null;
    }
    
    public static final yeb aG(final int n) {
        final int n2 = n - 1;
        if (n == 0) {
            throw null;
        }
        if (n2 == 1) {
            return new yeb(2, 2);
        }
        if (n2 == 2) {
            return new yeb(3, 3);
        }
        if (n2 != 3) {
            return ydx.a;
        }
        return new yeb(4, 4);
    }
    
    public static void ah(final Button button) {
        if (button != null) {
            button.setAllCaps(false);
        }
    }
    
    public static String as(final zkh zkh, final String s) {
        final String d = zkh.d();
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(":");
        sb.append(d);
        return sb.toString();
    }
    
    public static boolean aw(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && s.startsWith("playability_adult_confirmations:");
    }
    
    public static aeby bj(String s, final long n) {
        if (s == null || n <= 0L) {
            return null;
        }
        final String[] split = s.split("\\|");
        final int length = split.length;
        if (length <= 1) {
            return null;
        }
        int i = 0;
        s = split[0];
        final String[] array = Arrays.copyOfRange(split, 1, length);
        final ArrayList list = new ArrayList();
        while (i < array.length) {
            try {
                list.add(i, new abgr(s, i, array[i], n));
                ++i;
                continue;
            }
            catch (final IllegalArgumentException ex) {
                return null;
            }
            break;
        }
        return new aeby(list);
    }
    
    public static void bk(final aeby aeby, final aeby aeby2, final aeby aeby3) {
        final float[] array = (float[])aeby.a;
        final float n = array[0];
        final float[] array2 = (float[])aeby2.a;
        final float n2 = array2[0];
        final float n3 = array[1];
        final float n4 = array2[3];
        final float n5 = array[2];
        final float n6 = array2[6];
        final float n7 = array2[1];
        final float n8 = array2[4];
        final float n9 = array2[7];
        final float n10 = array2[2];
        final float n11 = array2[5];
        final float n12 = array2[8];
        final float n13 = array[3];
        final float n14 = array[4];
        final float n15 = array[5];
        final float n16 = array[6];
        final float n17 = array[7];
        final float n18 = array[8];
        aeby3.aF(n * n2 + n3 * n4 + n5 * n6, n * n7 + n3 * n8 + n5 * n9, n * n10 + n3 * n11 + n5 * n12, n13 * n2 + n14 * n4 + n15 * n6, n13 * n7 + n14 * n8 + n15 * n9, n13 * n10 + n14 * n11 + n15 * n12, n2 * n16 + n4 * n17 + n6 * n18, n7 * n16 + n8 * n17 + n9 * n18, n16 * n10 + n17 * n11 + n18 * n12);
    }
    
    public static aeby bn(final bta bta) {
        if (bta != null) {
            return new aeby(bta.b, bta.c, bta.d, bta.e);
        }
        return null;
    }
    
    private static String bo(final String s, final String s2, final Object... array) {
        String s3 = s2;
        if (array.length > 0) {
            try {
                s3 = String.format(Locale.US, s2, array);
            }
            catch (final IllegalFormatException ex) {
                Log.e("PlayCore", "Unable to format ".concat(s2), (Throwable)ex);
                final String join = TextUtils.join((CharSequence)", ", array);
                final StringBuilder sb = new StringBuilder();
                sb.append(s2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                s3 = sb.toString();
            }
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append(" : ");
        sb2.append(s3);
        return sb2.toString();
    }
    
    private static final String bp(final zkh zkh) {
        if (!zkh.g()) {
            return "visitor_id";
        }
        return "incognito_visitor_id";
    }
    
    public final void A(final int n, final int n2, final long n3) {
        ((MediaCodec)this.a).queueInputBuffer(n, 0, n2, n3, 0);
    }
    
    public final void B(final float[] array) {
        synchronized (this) {
            System.arraycopy(this.a, 0, array, 0, 4);
        }
    }
    
    public final void C(final float[] array) {
        monitorenter(this);
        final boolean b = false;
        final double n = array[0];
        Double.isNaN(n);
        final double n2 = n + 1.0;
        final double n3 = array[5];
        final double n4 = array[10];
        Double.isNaN(n3);
        Double.isNaN(n4);
        try {
            final float n5 = (float)Math.sqrt(Math.max(0.0, n2 + n3 + n4));
            Double.isNaN(n3);
            Double.isNaN(n4);
            final float n6 = (float)Math.sqrt(Math.max(0.0, n2 - n3 - n4)) * 0.5f;
            Double.isNaN(n);
            final double n7 = 1.0 - n;
            Double.isNaN(n3);
            Double.isNaN(n4);
            final float n8 = (float)Math.sqrt(Math.max(0.0, n7 + n3 - n4)) * 0.5f;
            Double.isNaN(n3);
            Double.isNaN(n4);
            final float n9 = (float)Math.sqrt(Math.max(0.0, n7 - n3 + n4)) * 0.5f;
            final Object a = this.a;
            final boolean b2 = array[6] - array[9] < 0.0f;
            final boolean b3 = n6 < 0.0f;
            float n10 = n6;
            if (b2 != b3) {
                n10 = -n6;
            }
            ((float[])a)[0] = n10;
            final boolean b4 = array[8] - array[2] < 0.0f;
            final boolean b5 = n8 < 0.0f;
            float n11 = n8;
            if (b4 != b5) {
                n11 = -n8;
            }
            ((float[])a)[1] = n11;
            final boolean b6 = array[1] - array[4] < 0.0f;
            final boolean b7 = n9 < 0.0f || b;
            float n12 = n9;
            if (b6 != b7) {
                n12 = -n9;
            }
            ((float[])a)[2] = n12;
            ((float[])a)[3] = n5 * 0.5f;
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final aqum D(final String s, final aqub aqub, final aqty aqty, final String s2, final aqup aqup) {
        final boolean y = aeda.y("POST", "put");
        boolean b = true;
        if (!y) {
            b = (aeda.y("POST", "post") && b);
        }
        agot.u(b);
        if (aqty.a() != -1L && aqty.a() < 0L) {
            return new aquh(s, aqub, aqty, s2, (aqua)this.a, aqup);
        }
        return new aquk(s, "POST", aqub, aqty, s2, (aqua)this.a, aqup, false);
    }
    
    public final aqqf E(final vdo vdo) {
        return new aqqf((aqqg)((agza)this.a).build());
    }
    
    public final aqce F() {
        return new aqce((CommandOuterClass$GestureOptions)((agza)this.a).build());
    }
    
    public final aqcd G() {
        return new aqcd((CommandOuterClass$Command)((agza)this.a).build());
    }
    
    public final aqbg H(final vdo vdo) {
        return new aqbg((aqbm)((agza)this.a).build(), vdo);
    }
    
    public final apwy I() {
        return new apwy((apwz)((agza)this.a).build());
    }
    
    public final aoro J(final vdo vdo) {
        return new aoro((aorm)((agza)this.a).build(), vdo);
    }
    
    public final aojj K() {
        return new aojj((aojk)((agza)this.a).build());
    }
    
    public final anhz L(final vdo vdo) {
        return new anhz((anib)((agza)this.a).build(), vdo);
    }
    
    public final amsg M(final vdo vdo) {
        return new amsg((amsh)((agza)this.a).build(), vdo);
    }
    
    public final amrw N(final vdo vdo) {
        return new amrw((amry)((agza)this.a).build());
    }
    
    public final amrv O() {
        return new amrv((amrx)((agza)this.a).build());
    }
    
    public final actz P(final acty acty) {
        final acqq f = ((aeim)this.a).F(Optional.empty());
        final gbo gbo = (gbo)acty;
        gbo.a = (actk)f;
        return (actz)gbo.a();
    }
    
    public final akac Q(final akac akac) {
        akac akac2 = akac;
        if (((Map)this.a).containsKey(akac)) {
            akac2 = ((Map<K, akac>)this.a).get(akac);
        }
        return akac2;
    }
    
    public final List R(final akac akac) {
        return (List)this.Q(akac).d;
    }
    
    public final void S(final Object o, final View view) {
        if (((Set)this.a).isEmpty()) {
            return;
        }
        final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().a(o, view);
        }
    }
    
    public final aciw T(final acir acir) {
        final aeby aeby = (aeby)((atjj)this.a).a();
        aeby.getClass();
        acir.getClass();
        return new aciw(aeby, acir, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final aciw U(final acir acir, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final aeby aeby = (aeby)((atjj)this.a).a();
        aeby.getClass();
        acir.getClass();
        return new aciw(aeby, acir, viewGroup$LayoutParams, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final acih V(final acio acio) {
        final vax vax = (vax)((atjj)this.a).a();
        vax.getClass();
        acio.getClass();
        return new acih(vax, acio);
    }
    
    public final acih W(final acio acio, final acie acie) {
        final vax vax = (vax)((atjj)this.a).a();
        vax.getClass();
        acio.getClass();
        return new acih(vax, acio, acie);
    }
    
    public final achz X(final acir acir) {
        final aeby aeby = (aeby)((atjj)this.a).a();
        aeby.getClass();
        acir.getClass();
        return new achz(aeby, acir, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void Y(final RecyclerView recyclerView, final wwv b) {
        final Object a = this.a;
        final adfg adfg = (adfg)a;
        if (adfg.a && b != null && !adfg.d) {
            adfg.b = b;
            final InteractionLoggingScreen a2 = b.a();
            adft w = null;
            if (a2 != null) {
                w = w;
                if (a2.f == 3854) {
                    w = adfg.e.w(ajdf.c);
                }
            }
            adfg.c = w;
            recyclerView.aE((iw)a);
            adfg.d = true;
            recyclerView.getContext();
        }
    }
    
    public final void Z(final RecyclerView recyclerView) {
        final Object a = this.a;
        final adfg adfg = (adfg)a;
        if (adfg.a && adfg.d) {
            recyclerView.aH((iw)a);
            final adft c = adfg.c;
            if (c != null) {
                c.a();
                adfg.c = null;
            }
            recyclerView.getContext();
            adfg.d = false;
        }
    }
    
    public final SharedPreferences a() {
        return ((Context)this.a).getSharedPreferences("playcore_split_install_internal", 0);
    }
    
    public final void aA(final Object o) {
        ((tdz)this.a).f(o);
    }
    
    public final abgr aB(final int n) {
        if (n >= 0 && n < ((List)this.a).size()) {
            return ((List<abgr>)this.a).get(n);
        }
        return null;
    }
    
    public final float aE(final int n, final int n2) {
        return ((float[])this.a)[n * 3 + n2];
    }
    
    public final void aF(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9) {
        final float[] array = (float[])this.a;
        array[0] = n;
        array[1] = n2;
        array[2] = n3;
        array[3] = n4;
        array[4] = n5;
        array[5] = n6;
        array[6] = n7;
        array[7] = n8;
        array[8] = n9;
    }
    
    public final aexq aH() {
        return aexq.j((Object)((zys)((aaex)this.a).a).a);
    }
    
    public final aacv aI(final zzd zzd) {
        final ArrayList list = new ArrayList();
        if (vha.x().contains(zzd.a())) {
            return aaiw.x(zzd, 0, list, 2);
        }
        if (!((xun)this.a).i(zzd.g(), zzd.a(), zzd.h(), 0L, 1)) {
            aaiw.y(0L, zzd, list);
        }
        return aaiw.x(zzd, 0, list, 2);
    }
    
    public final String aJ(final zkh zkh) {
        return ((SharedPreferences)((xpb)this.a).a).getString(bp(zkh), (String)null);
    }
    
    public final void aK(final zkh zkh, final String s) {
        ((SharedPreferences)((xpb)this.a).a).edit().putString(bp(zkh), s).apply();
    }
    
    public final String aL() {
        final Set<Map.Entry<Object, Object>> entrySet = ((SortedMap<Object, Object>)this.a).entrySet();
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<String, V> entry : entrySet) {
            sb.append(entry.getKey());
            sb.append(":");
            sb.append((String)entry.getValue());
            sb.append("/");
        }
        return sb.toString();
    }
    
    public final void aM(final String s, final long n) {
        ((Map<String, String>)this.a).put(s, String.format("%d", n));
    }
    
    public final void aN(final String s, final String s2) {
        ((Map<String, String>)this.a).put(s, s2);
    }
    
    public final void aO(final String s, final boolean b) {
        ((Map<String, String>)this.a).put(s, String.format("%b", b));
    }
    
    public final void aP(final String s, final byte[] array) {
        array.getClass();
        ((Map<String, String>)this.a).put(s, Base64.encodeToString(array, 0));
    }
    
    public final aeru aQ() {
        return ((List<aeru>)this.a).get(0);
    }
    
    public final Long aR(String as) {
        as = this.aS(as);
        Label_0020: {
            if (as == null) {
                break Label_0020;
            }
            try {
                return Long.parseLong(as);
                return null;
            }
            catch (final NumberFormatException ex) {
                return null;
            }
        }
    }
    
    public final String aS(final String s) {
        final List list = ((Map<K, List>)this.a).get(s);
        if (list != null && !list.isEmpty()) {
            return (String)list.get(0);
        }
        return null;
    }
    
    public final double aT() {
        if (((ArrayDeque)this.a).size() >= 4) {
            final long n = ((ArrayDeque)this.a).getLast().a - ((ArrayDeque)this.a).getFirst().a;
            final long b = ((ArrayDeque)this.a).getLast().b;
            final long b2 = ((ArrayDeque)this.a).getFirst().b;
            if (n >= 5000L) {
                return (double)((b - b2) * 1000L / n);
            }
        }
        return 0.0;
    }
    
    public final Set aU() {
        return ((Map<Object, Object>)this.a).entrySet();
    }
    
    public final void aV(final String s, final String s2) {
        final List list = ((Map<K, List>)this.a).get(s);
        if (list == null) {
            ((Map<String, ArrayList>)this.a).put(s, adwd.an((Object[])new String[] { s2 }));
            return;
        }
        list.clear();
        list.add(s2);
    }
    
    public final void aW(final String s, final String s2) {
        final List list = ((Map<K, List>)this.a).get(s);
        if (list == null) {
            ((Map<String, ArrayList>)this.a).put(s, adwd.an((Object[])new String[] { s2 }));
            return;
        }
        list.add(s2);
    }
    
    public final void aX(final String s, final String s2) {
        if (!((Map)this.a).containsKey(s)) {
            this.aW(s, s2);
        }
    }
    
    public final void aY(final abxu c, final yxb yxb) {
        final Object a = this.a;
        final agza builder = ((agzi)yeu.a).createBuilder();
        builder.copyOnWrite();
        final yeu yeu = (yeu)builder.instance;
        c.getClass();
        yeu.c = c;
        yeu.b |= 0x1;
        final xtn c2 = yxb.a().c();
        builder.copyOnWrite();
        final yeu yeu2 = (yeu)builder.instance;
        c2.getClass();
        yeu2.d = c2;
        yeu2.b |= 0x2;
        final yeu yeu3 = (yeu)builder.build();
        final yen i = ((oak)a).i();
        if (i != null) {
            i.c();
            return;
        }
        final agyp agyp = (agyp)((BaseClient)a).c(-1400830973, (MessageLite)yeu3, ((agzi)agyp.a).getParserForType());
    }
    
    public final void aZ(final boolean b) {
        ((zba)this.a).bi(b);
    }
    
    public final asgn ab() {
        return ((asgn)((tmp)this.a).c).x();
    }
    
    public final void ac(int au) {
        final Object a = this.a;
        au = aqql.au(au);
        final tmp tmp = (tmp)a;
        if (au == 0) {
            tmp.f = 2;
            return;
        }
        tmp.f = au;
    }
    
    public final void ad(final boolean b) {
        ((tmp)this.a).b(b);
    }
    
    public final abzh ae(final ajkj ajkj) {
        ajkj ajkj2 = ajkj;
        if (((Optional)this.a).isPresent()) {
            ajkj2 = ajkj;
            if (!((agzd)ajkj).rs((agyr)apxq.a)) {
                ajkj2 = ajkj;
                if (((agzd)ajkj).rs((agyr)aijy.a)) {
                    final aqaa aqaa = (aqaa)((agzd)ajkj).rr((agyr)aijy.a);
                    final agzc agzc = (agzc)((agzi)ajkj).toBuilder();
                    abzl.e(agzc, oak.l((Container)((atjj)((Optional)this.a).get()).a(), aqaa));
                    ajkj2 = (ajkj)((agza)agzc).build();
                }
            }
        }
        return new abzh(ajkj2);
    }
    
    public final abyy af(final Context context) {
        return new abyy(context, ((uyi)this.a).aO());
    }
    
    public final abyy ag(final Context context, final int n) {
        return new abyy(context, n, ((uyi)this.a).aO());
    }
    
    public final boolean ai() {
        return ((uyi)this.a).aO();
    }
    
    public final void aj(final abyw abyw) {
        this.ak(abyw, "");
    }
    
    public final void ak(final abyw abyw, final String s) {
        szc.f();
        ((aezb)this.a).p((Object)s, (Object)abyw);
    }
    
    public final void al() {
        szc.f();
        final Iterator iterator = ((aezb)this.a).u().iterator();
        while (iterator.hasNext()) {
            ((abyw)iterator.next()).nu();
        }
    }
    
    public final void am(final abyw abyw) {
        this.an(abyw, "");
    }
    
    public final void an(final abyw abyw, final String s) {
        szc.f();
        final Collection collection = ((aezy)this.a).v().get(s);
        if (collection != null) {
            collection.remove(abyw);
        }
    }
    
    public final PlaybackListenerStateRestorerState ao() {
        final HashMap hashMap = new HashMap();
        for (final abxh abxh : this.a) {
            final Parcelable n = abxh.N();
            if (n != null) {
                hashMap.put(abxh.getClass().toString(), n);
            }
        }
        return new PlaybackListenerStateRestorerState((Map)hashMap);
    }
    
    public final void ap(final PlaybackListenerStateRestorerState playbackListenerStateRestorerState, final agfu agfu) {
        final Map a = playbackListenerStateRestorerState.a;
        for (final abxh abxh : this.a) {
            final Parcelable parcelable = a.get(abxh.getClass().toString());
            if (parcelable != null) {
                abxh.f(parcelable, agfu);
            }
        }
    }
    
    public final ListenableFuture ar(final zkh zkh) {
        return afrp.e(((tku)this.a).a(), (aexg)new abnf(as(zkh, "playability_adult_confirmations"), 1), (Executor)afsl.a);
    }
    
    public final void av(final zkh zkh, final boolean b) {
        tcp.m(((tku)this.a).b((aexg)new fmn(as(zkh, "playability_adult_confirmations"), b, 11)), (tcn)zqg.p);
    }
    
    public final aexq ax() {
        return (aexq)((Pair)this.a).second;
    }
    
    public final ListenableFuture ay() {
        return (ListenableFuture)((Pair)this.a).first;
    }
    
    public final void az(final Object o) {
        ((tdz)this.a).d(o);
    }
    
    public final Set b() {
        monitorenter(aeby.class);
        try {
            Label_0057: {
                try {
                    Set stringSet;
                    if ((stringSet = this.a().getStringSet("modules_to_uninstall_if_emulated", (Set)new HashSet())) == null) {
                        stringSet = new HashSet();
                    }
                    break Label_0057;
                }
                finally {
                    monitorexit(aeby.class);
                    monitorexit(aeby.class);
                    return;
                }
            }
        }
        catch (final Exception ex) {}
    }
    
    public final void ba() {
        monitorenter(this);
        monitorexit(this);
    }
    
    public final int bb(final long n) {
        return ((bta)this.a).d(n);
    }
    
    public final int bc() {
        return ((bta)this.a).a;
    }
    
    public final long bd() {
        return ((bta)this.a).f;
    }
    
    public final int[] be() {
        return ((bta)this.a).b;
    }
    
    public final long[] bf() {
        return ((bta)this.a).d;
    }
    
    public final long[] bg() {
        return ((bta)this.a).c;
    }
    
    public final long[] bh() {
        return ((bta)this.a).e;
    }
    
    public final yjv bi(final xgc xgc) {
        return (yjv)new yjr(xgc, (zba)this.a, (byte[])null, (byte[])null);
    }
    
    public final void bl(final aeby aeby) {
        final float n = this.aE(0, 0) * (this.aE(1, 1) * this.aE(2, 2) - this.aE(2, 1) * this.aE(1, 2)) - this.aE(0, 1) * (this.aE(1, 0) * this.aE(2, 2) - this.aE(1, 2) * this.aE(2, 0)) + this.aE(0, 2) * (this.aE(1, 0) * this.aE(2, 1) - this.aE(1, 1) * this.aE(2, 0));
        if (n == 0.0) {
            return;
        }
        final float n2 = 1.0f / n;
        final float[] array = (float[])this.a;
        final float n3 = array[4];
        final float n4 = array[8];
        final float n5 = array[7];
        final float n6 = array[5];
        final float n7 = array[1];
        final float n8 = array[2];
        final float n9 = array[3];
        final float n10 = array[6];
        final float n11 = array[0];
        aeby.aF((n3 * n4 - n5 * n6) * n2, -(n7 * n4 - n8 * n5) * n2, (n7 * n6 - n8 * n3) * n2, -(n9 * n4 - n6 * n10) * n2, (n4 * n11 - n8 * n10) * n2, -(n6 * n11 - n8 * n9) * n2, (n9 * n5 - n10 * n3) * n2, -(n5 * n11 - n10 * n7) * n2, (n11 * n3 - n9 * n7) * n2);
    }
    
    public final aeby bm() {
        return new aeby((aaex)this.a);
    }
    
    public final void c(final String s) {
        Log.e("SetupLibrary", ((String)this.a).concat(s));
    }
    
    public final void d(final String s, final Throwable t) {
        Log.e("SetupLibrary", ((String)this.a).concat(s), t);
    }
    
    public final void e(final String s) {
        Log.w("SetupLibrary", ((String)this.a).concat(s));
    }
    
    public final void f(final Runnable runnable, final Executor executor) {
        ((acb)this.a).a(runnable, executor);
    }
    
    public final void g(final Object o) {
        ((acb)this.a).c(o);
    }
    
    public final void h(final Throwable t) {
        ((acb)this.a).d(t);
    }
    
    public final AccountId i() {
        return (AccountId)((aeby)this.a).a;
    }
    
    public final Map j(final Collection collection) {
        final HashMap hashMap = new HashMap();
        for (final String s : ((Map<String, V>)this.a).keySet()) {
            Set<Object> set;
            if (!((Map)this.a).containsKey(s)) {
                set = Collections.emptySet();
            }
            else {
                final HashSet set2 = new HashSet();
                for (final Map.Entry<Object, V> entry : ((Map<K, Map>)this.a).get(s).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        set2.add(entry.getValue());
                    }
                }
                set = Collections.unmodifiableSet((Set<?>)set2);
            }
            hashMap.put(s, set);
        }
        return hashMap;
    }
    
    public final void k(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", bo((String)this.a, s, array));
        }
    }
    
    public final void l(final Throwable t, final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", bo((String)this.a, s, array), t);
        }
    }
    
    public final void m(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", bo((String)this.a, s, array));
        }
    }
    
    public final void n(final Object o) {
        monitorenter(this);
        try {
            final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
            while (iterator.hasNext()) {
                iterator.next().i(o);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void o(final Object o) {
        if (!this.p(o)) {
            final ArrayList list = new ArrayList();
            for (Class<?> clazz = o.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
                if (((Map)this.a).containsKey(clazz.getCanonicalName())) {
                    list.add(clazz.getCanonicalName());
                }
            }
            String s;
            if (list.isEmpty()) {
                s = String.format("No injector factory bound for Class<%s>", o.getClass().getCanonicalName());
            }
            else {
                s = String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", o.getClass().getCanonicalName(), list);
            }
            throw new IllegalArgumentException(s);
        }
    }
    
    public final boolean p(final Object o) {
        final atjj atjj = ((Map<K, atjj>)this.a).get(o.getClass().getName());
        if (atjj == null) {
            return false;
        }
        final arhs arhs = (arhs)atjj.a();
        try {
            final aeby a = arhs.a();
            arhs.getClass();
            a.getClass();
            a.o(o);
            return true;
        }
        catch (final ClassCastException ex) {
            throw new arhu(String.format("%s does not implement AndroidInjector.Factory<%s>", arhs.getClass().getCanonicalName(), o.getClass().getCanonicalName()), ex);
        }
    }
    
    public final int q(final long n) {
        return ((MediaCodec)this.a).dequeueInputBuffer(n);
    }
    
    public final int r(final MediaCodec$BufferInfo mediaCodec$BufferInfo, final long n) {
        return ((MediaCodec)this.a).dequeueOutputBuffer(mediaCodec$BufferInfo, n);
    }
    
    public final void s() {
        ((MediaCodec)this.a).release();
    }
    
    public final void t(final int n, final boolean b) {
        ((MediaCodec)this.a).releaseOutputBuffer(n, b);
    }
    
    public final void u(final Bundle parameters) {
        ((MediaCodec)this.a).setParameters(parameters);
    }
    
    public final void v() {
        ((MediaCodec)this.a).start();
    }
    
    public final void w() {
        ((MediaCodec)this.a).stop();
    }
    
    public final ByteBuffer[] x() {
        return ((MediaCodec)this.a).getInputBuffers();
    }
    
    public final ByteBuffer[] y() {
        return ((MediaCodec)this.a).getOutputBuffers();
    }
    
    public final void z(final MediaFormat mediaFormat, final Surface surface, final int n) {
        ((MediaCodec)this.a).configure(mediaFormat, surface, (MediaCrypto)null, n);
    }
}
