import android.util.Base64;
import java.util.function.Consumer;
import java.util.concurrent.Callable;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.widget.ImageView;
import com.google.apps.tiktok.account.AccountId;
import com.google.android.libraries.blocks.runtime.JavaRuntime;
import com.google.protobuf.MessageLite;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Pattern;
import androidx.mediarouter.app.MediaRouteButton;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.video.state.PlaybackListenerStateRestorerState;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.libraries.blocks.Container;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import java.util.Iterator;
import java.io.File;
import java.util.Arrays;
import android.view.View;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import android.text.Spanned;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import java.util.IllegalFormatException;
import android.util.Log;
import java.util.Locale;
import java.nio.charset.Charset;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import android.text.TextUtils;
import android.widget.Button;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.Cipher;
import j$.util.DesugarCollections;
import java.util.WeakHashMap;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Collection;
import java.security.SecureRandom;
import android.os.Process;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.mdx.blocks.CastErrorMapperProdContainerRegistrar;
import java.util.function.Function;
import j$.util.Optional;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import android.net.Uri;
import android.media.AudioDeviceInfo;
import android.content.SharedPreferences;
import android.content.Context;
import android.app.Activity;
import java.util.Collections;
import java.util.ArrayList;
import android.opengl.GLES20;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefs
{
    public static aefs b;
    public final Object a;
    
    public aefs() {
        this.a = new HashMap();
    }
    
    public aefs(final int n, int n2, final rbd rbd) {
        final int[] array = { 0 };
        GLES20.glGetProgramiv(n, 35719, array, 0);
        final int[] array2 = { 0 };
        final int[] array3 = { 0 };
        final int n3 = array[0];
        final byte[] array4 = new byte[n3];
        GLES20.glGetActiveUniform(n, n2, n3, new int[1], 0, array3, 0, array2, 0, array4, 0);
        n2 = 0;
        int n4;
        while (true) {
            n4 = n3;
            if (n2 >= n3) {
                break;
            }
            if (array4[n2] == 0) {
                n4 = n2;
                break;
            }
            ++n2;
        }
        final String a = new String(array4, 0, n4);
        this.a = a;
        final String s = a;
        GLES20.glGetUniformLocation(n, a);
        vfw.ah("Initializing uniform", rbd);
    }
    
    public aefs(final aapu a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
    }
    
    public aefs(final abqz a) {
        this.a = a;
    }
    
    public aefs(final abtj a) {
        this.a = a;
    }
    
    public aefs(final acig a) {
        this.a = a;
    }
    
    public aefs(final acoe a, final byte[] array) {
        this.a = a;
    }
    
    public aefs(final adgg a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
    }
    
    public aefs(final adgg a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
    }
    
    public aefs(final adiy a) {
        this.a = a;
    }
    
    public aefs(final adzx a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public aefs(final aedw a) {
        this.a = a;
    }
    
    public aefs(final aeeg a) {
        this.a = a;
    }
    
    public aefs(final aefs aefs, final byte[] array, final byte[] array2) {
        this.a = aefs.a;
    }
    
    public aefs(final aefs a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
    }
    
    public aefs(final aefs a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
    }
    
    public aefs(final aefs a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.a = a;
    }
    
    public aefs(final aefs a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final afxj a) {
        this.a = a;
    }
    
    public aefs(final afxk a) {
        this.a = a;
    }
    
    public aefs(final ahcr a) {
        this.a = a;
    }
    
    public aefs(final ahct a) {
        this.a = a;
    }
    
    public aefs(final akgo akgo) {
        if (akgo != null && akgo.c.size() != 0 && akgo.c.size() != 0) {
            final int size = akgo.c.size();
            this.a = new ArrayList(size);
            for (int i = 0; i < size; ++i) {
                ((List<Boolean>)this.a).add(Boolean.valueOf(false));
            }
            return;
        }
        this.a = Collections.emptyList();
    }
    
    public aefs(final aklb a) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final akti akti) {
        this.a = new vsd(akti);
    }
    
    public aefs(final Activity a) {
        this.a = a;
    }
    
    public aefs(final Context a) {
        this.a = a;
    }
    
    public aefs(final Context a, final byte[] array) {
        this.a = a;
    }
    
    public aefs(final Context a, final char[] array) {
        this.a = a;
    }
    
    public aefs(final Context a, final short[] array) {
        this.a = a;
    }
    
    public aefs(final SharedPreferences a) {
        this.a = a;
    }
    
    public aefs(final SharedPreferences a, final byte[] array) {
        tcl.l();
        this.a = a;
    }
    
    public aefs(final AudioDeviceInfo a) {
        this.a = a;
    }
    
    private aefs(final Uri uri) {
        this.a = twk.b(uri);
    }
    
    public aefs(final arzb a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public aefs(final askz a) {
        this.a = a;
    }
    
    public aefs(final atnb a) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final atnb atnb, final xjl xjl, final byte[] array, final byte[] array2, final byte[] array3) {
        final qrk a = (qrk)atnb.a();
        this.a = a;
        if (xjl.z()) {
            final qrk qrk = a;
            a.a();
        }
    }
    
    public aefs(final atnb a, final byte[] array) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final atnb a, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final atnb a, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final atnb a, final byte[] array, final char[] array2) {
        this.a = a;
    }
    
    public aefs(final atnb a, final byte[] array, final short[] array2) {
        this.a = a;
    }
    
    public aefs(final atnb a, final char[] array) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final atnb a, final char[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final atnb a, final char[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final atnb a, final char[] array, final char[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final atnb a, final int[] array) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final atnb a, final short[] array) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final atnb a, final short[] array, final byte[] array2) {
        this.a = a;
    }
    
    public aefs(final atnb a, final short[] array, final char[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final atnb a, final boolean[] array) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final SubtitleTrack a) {
        this.a = a;
        new WeakReference(null);
    }
    
    public aefs(final ListenableFuture listenableFuture, final afbh afbh) {
        this.a = Pair.create((Object)listenableFuture, (Object)afbh);
    }
    
    public aefs(final Optional optional) {
        this.a = optional.map((Function)tip.s).orElse((Object)afkg.a);
    }
    
    public aefs(final Optional optional, final afxj afxj, final CastErrorMapperProdContainerRegistrar castErrorMapperProdContainerRegistrar) {
        if (optional.isPresent()) {
            synchronized (castErrorMapperProdContainerRegistrar) {
                if (castErrorMapperProdContainerRegistrar.a) {
                    monitorexit(castErrorMapperProdContainerRegistrar);
                }
                else {
                    castErrorMapperProdContainerRegistrar.a = true;
                    monitorexit(castErrorMapperProdContainerRegistrar);
                }
                this.a = Optional.of((Object)new aenv((afvp)new qrs(optional, 8), (Executor)afxj));
                return;
            }
        }
        this.a = Optional.empty();
    }
    
    public aefs(final Optional optional, Optional empty) {
        if (!(boolean)optional.orElse((Object)false)) {
            empty = Optional.empty();
        }
        this.a = empty;
    }
    
    public aefs(final String s) {
        final StringBuilder sb = new StringBuilder("[");
        sb.append(s);
        sb.append("] ");
        this.a = sb.toString();
    }
    
    public aefs(final String s, final byte[] array) {
        final int myUid = Process.myUid();
        final int myPid = Process.myPid();
        final StringBuilder sb = new StringBuilder("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        this.a = sb.toString().concat(String.valueOf(s));
    }
    
    public aefs(final SecureRandom a) {
        this.a = a;
    }
    
    public aefs(final ArrayList a) {
        this.a = a;
    }
    
    public aefs(final Collection collection) {
        final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
        this.a = a;
        collection.getClass();
        adme.K(collection.contains(null) ^ true);
        a.addAll(collection);
    }
    
    public aefs(final List a) {
        this.a = a;
    }
    
    public aefs(final Map a) {
        this.a = a;
    }
    
    public aefs(final Map map, final byte[] array) {
        this.a = Collections.unmodifiableMap((Map<?, ?>)map);
    }
    
    public aefs(final Set a) {
        this.a = a;
    }
    
    public aefs(final Set a, final byte[] array) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final Set a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public aefs(final Executor a) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final ouc a) {
        this.a = a;
    }
    
    public aefs(final ove a) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final qrk a) {
        this.a = a;
    }
    
    public aefs(final thg a, final aske aske, final abnd abnd, final abqb abqb, final aske aske2, final aske aske3, final byte[] array) {
        this.a = a;
        final aslm aslm = new aslm();
        aslm.c(aske.p().an(new abje(this, 20, null, null, null, null), (asmi)abgj.h));
        aslm.c(aske2.an(new abkg(this, 2, null, null, null, null), (asmi)abgj.h));
        aslm.c(aske3.an(new abkg(this, 4, null, null, null, null), (asmi)abgj.h));
        aslm.c(((aske)abnd.j).p().an(new abkg(this, 5, null, null, null, null), (asmi)abgj.h));
        aslm.c(abnd.c().p().an(new abkg(this, 6, null, null, null, null), (asmi)abgj.h));
        aslm.c(((aske)abnd.h).p().an(new abkg(this, 10, null, null, null, null), (asmi)abgj.h));
        aslm.c(abqb.I().p().an(new abkh(this, 4, null, null, null, null), (asmi)abgj.h));
        aslm.c(abqb.J().p().an(new abkh(this, 5, null, null, null, null), (asmi)abgj.h));
        aslm.c(abqb.L().p().an(new abkh(this, 6, null, null, null, null), (asmi)abgj.h));
        aslm.c(abqb.K().p().an(new abkh(this, 7, null, null, null, null), (asmi)abgj.h));
        aslm.c(abqb.M().p().an(new abkh(this, 8, null, null, null, null), (asmi)abgj.h));
        aslm.c(abqb.N().p().an(new abkh(this, 9, null, null, null, null), (asmi)abgj.h));
        aslm.c(abqb.O().p().an(new abkh(this, 10, null, null, null, null), (asmi)abgj.h));
        aslm.c(abqb.P().p().an(new abkg(this, 1, null, null, null, null), (asmi)abgj.h));
        aslm.c(abqb.R().p().an(new abkg(this, 0, null, null, null, null), (asmi)abgj.h));
        aslm.c(abqb.S().p().an(new abkg(this, 3, null, null, null, null), (asmi)abgj.h));
    }
    
    public aefs(final tnz a) {
        this.a = a;
    }
    
    public aefs(final tpw a) {
        this.a = a;
    }
    
    public aefs(final umg a) {
        this.a = a;
    }
    
    public aefs(final vbo vbo, final atnb atnb, final atnb atnb2) {
        Object a;
        if (vbo == null) {
            a = null;
        }
        else {
            alzp alzp;
            if ((alzp = vbo.b().e) == null) {
                alzp = alzp.a;
            }
            Object o;
            if (alzp.al) {
                o = atnb.a();
            }
            else {
                o = atnb2.a();
            }
            a = o;
        }
        this.a = a;
    }
    
    public aefs(final vbs a) {
        this.a = a;
    }
    
    public aefs(final vdc a) {
        this.a = a;
    }
    
    public aefs(final vfm a) {
        this.a = a;
    }
    
    public aefs(final vln a) {
        this.a = a;
    }
    
    public aefs(final vpb a) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final vxu a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public aefs(final vzb a) {
        this.a = a;
    }
    
    public aefs(final wza a) {
        this.a = a;
    }
    
    public aefs(final xaa a) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final xab a) {
        this.a = a;
    }
    
    public aefs(final xab a, final byte[] array) {
        this.a = a;
    }
    
    public aefs(final xeg a) {
        this.a = a;
    }
    
    public aefs(final xig a) {
        this.a = a;
    }
    
    public aefs(final xtz a, final abnd abnd, final byte[] array) {
        this.a = a;
        new aslm().c(abnd.c().P(aslh.a()).an((asmi)new acbf(this, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (asmi)abgj.t));
    }
    
    public aefs(final yok a) {
        this.a = a;
    }
    
    public aefs(final zfc a) {
        this.a = a;
    }
    
    public aefs(final zks a) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final zoa a) {
        this.a = a;
    }
    
    public aefs(final zvk a) {
        this.a = a;
    }
    
    public aefs(final zxl a) {
        a.getClass();
        this.a = a;
    }
    
    public aefs(final byte[] array) {
        this.a = new ArrayList();
    }
    
    public aefs(final byte[] array, final byte[] array2) {
        this.a = new HashSet();
    }
    
    public aefs(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new ArrayList();
    }
    
    public aefs(final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = ajjz.a.createBuilder();
    }
    
    public aefs(final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final char[] array5) {
        this.a = ((ahcz)ajsa.a).createBuilder();
    }
    
    public aefs(final byte[] array, final byte[] array2, final byte[] array3, final char[] array4) {
        this.a = new HashMap();
    }
    
    public aefs(final byte[] array, final byte[] array2, final char[] array3, final byte[] array4, final byte[] array5) {
        this.a = new AtomicReference();
    }
    
    public aefs(final byte[] array, final byte[] array2, final char[] array3, final char[] array4) {
        this.a = new ConcurrentHashMap();
    }
    
    public aefs(final byte[] array, final byte[] array2, final short[] array3) {
        this.a = new HashSet();
    }
    
    public aefs(final byte[] array, final char[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = new AtomicReference();
    }
    
    public aefs(final byte[] array, final char[] array2, final byte[] array3, final char[] array4) {
        this.a = atlv.aE();
    }
    
    public aefs(final byte[] array, final char[] array2, final char[] array3) {
        this.a = afds.y();
    }
    
    public aefs(final byte[] array, final int[] array2) {
        this.a = DesugarCollections.synchronizedMap((Map)new WeakHashMap());
    }
    
    public aefs(final byte[] array, final int[] array2, final byte[] array3) {
        this.a = new tgy();
    }
    
    public aefs(byte[] ex, final short[] array, final byte[] array2) {
        try {
            final Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            this.a = instance;
            final IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[ex.length]);
            final SecretKeySpec secretKeySpec = new SecretKeySpec((byte[])(Object)ex, "AES");
            ex = (NoSuchPaddingException)instance;
            instance.init(2, secretKeySpec, ivParameterSpec);
            return;
        }
        catch (final NoSuchPaddingException ex) {}
        catch (final NoSuchAlgorithmException ex) {}
        catch (final InvalidAlgorithmParameterException ex) {}
        catch (final InvalidKeyException ex2) {}
        throw new yns((Exception)ex);
    }
    
    public aefs(final byte[] array, final short[] array2, final byte[] array3, final byte[] array4) {
        this.a = new HashSet();
    }
    
    public aefs(final char[] array, final byte[] array2, final byte[] array3, final char[] array4) {
        this.a = new xjo();
    }
    
    public aefs(final char[] array, final byte[] array2, final char[] array3) {
        this.a = atmj.aW((Object)amgv.a);
    }
    
    public aefs(final char[] array, final byte[] array2, final char[] array3, final byte[] array4) {
        this.a = new ConcurrentHashMap();
    }
    
    public aefs(final char[] array, final char[] array2, final byte[] array3) {
        this.a = DesugarCollections.synchronizedMap((Map)new WeakHashMap());
    }
    
    public aefs(final char[] array, final char[] array2, final byte[] array3, final byte[] array4) {
        this.a = new AtomicReference();
    }
    
    public aefs(final char[] array, final short[] array2) {
        final acpn a = new acpn();
        a.b();
        this.a = a;
    }
    
    public aefs(final float[] array) {
        this.a = agra.N();
    }
    
    public aefs(final int[] array, final byte[] array2) {
        this.a = new HashSet();
    }
    
    public aefs(final int[] array, final byte[] array2, final byte[] array3) {
        this.a = atmv.ag();
    }
    
    public aefs(final short[] array, final byte[] array2, final byte[] array3) {
        this.a = new LinkedList();
    }
    
    public aefs(final short[] array, final char[] array2) {
        this.a = new HashMap();
    }
    
    public aefs(final boolean[] array) {
        this.a = new WeakHashMap();
    }
    
    public aefs(final boolean[] array, final byte[] array2) {
        this.a = new ArrayDeque();
    }
    
    public static void X(final Button button) {
        if (button != null) {
            button.setAllCaps(false);
        }
    }
    
    public static String ai(final znz znz, final String s) {
        final String d = znz.d();
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(":");
        sb.append(d);
        return sb.toString();
    }
    
    public static void aj(final Throwable t) {
        tut.d("Failed to store adult playability.", t);
    }
    
    public static void ak(final Throwable t) {
        tut.d("Failed to save playability adult timestamp.", t);
    }
    
    public static boolean am(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && s.startsWith("playability_adult_confirmations:");
    }
    
    public static boolean as(final anfs anfs) {
        anfs.getClass();
        return anfs.d < 0 || anfs.e < 0;
    }
    
    public static final anfs at(final aisc aisc) {
        if (aisc != null) {
            if (((ahcu)aisc).ry((ahci)WatchEndpointOuterClass.watchEndpoint)) {
                final apuw apuw = (apuw)((ahcu)aisc).rx((ahci)WatchEndpointOuterClass.watchEndpoint);
                apux apux;
                if ((apux = apuw.o) == null) {
                    apux = apux.a;
                }
                if ((apux.b & 0x1) != 0x0) {
                    apux apux2;
                    if ((apux2 = apuw.o) == null) {
                        apux2 = apux.a;
                    }
                    anfs anfs;
                    if ((anfs = apux2.c) == null) {
                        anfs = anfs.a;
                    }
                    return anfs;
                }
            }
        }
        return null;
    }
    
    public static String bm(final aisc aisc) {
        if (aisc.c.d() > 0) {
            return aisc.c.D(Charset.defaultCharset());
        }
        if (!((ahcu)aisc).ry((ahci)amsk.b)) {
            return null;
        }
        final amsl amsl = (amsl)((ahcu)aisc).rx((ahci)amsk.b);
        if ((amsl.b & 0x2) != 0x0) {
            final int e = amsl.e;
            final int d = amsl.d;
            final StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(":");
            sb.append(e);
            return sb.toString();
        }
        return null;
    }
    
    public static aefs cA(final Uri uri) {
        return new aefs(uri);
    }
    
    public static aefs cB() {
        return new aefs((Collection)afkg.a);
    }
    
    private static String cC(final String s, final String s2, final Object... array) {
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
    
    private static ahze cD(final String s, int intValue, int n, int intValue2, final List list, final boolean b, final boolean b2, final boolean b3, final List list2) {
        final boolean b4 = b3 && !list2.isEmpty();
        final ahcr builder = ((ahcz)ahze.a).createBuilder();
        if (b && b4) {
            builder.copyOnWrite();
            final ahze ahze = (ahze)builder.instance;
            ahze.c = 4;
            ahze.b |= 0x1;
        }
        else if (b4) {
            builder.copyOnWrite();
            final ahze ahze2 = (ahze)builder.instance;
            ahze2.c = 2;
            ahze2.b |= 0x1;
        }
        else if (b) {
            builder.copyOnWrite();
            final ahze ahze3 = (ahze)builder.instance;
            ahze3.c = 3;
            ahze3.b |= 0x1;
        }
        else if (b2) {
            builder.copyOnWrite();
            final ahze ahze4 = (ahze)builder.instance;
            ahze4.c = 6;
            ahze4.b |= 0x1;
        }
        else {
            builder.copyOnWrite();
            final ahze ahze5 = (ahze)builder.instance;
            ahze5.c = 1;
            ahze5.b |= 0x1;
        }
        if (b4) {
            n = intValue2;
        }
        if (n > 0 || b) {
            final int n2 = intValue2 = (n + intValue - 1) % intValue;
            if (b4) {
                intValue2 = (int)list2.get(n2);
            }
            final aisc ce = cE(list.get(intValue2), s, intValue2, false);
            builder.copyOnWrite();
            final ahze ahze6 = (ahze)builder.instance;
            ce.getClass();
            ahze6.h = ce;
            ahze6.b |= 0x20;
        }
        if (n < intValue - 1 || b) {
            intValue2 = (intValue = (n + 1) % intValue);
            if (b4) {
                intValue = list2.get(intValue2);
            }
            final aisc ce2 = cE(list.get(intValue), s, intValue, false);
            builder.copyOnWrite();
            final ahze ahze7 = (ahze)builder.instance;
            ce2.getClass();
            ahze7.f = ce2;
            ahze7.b |= 0x8;
            builder.copyOnWrite();
            final ahze ahze8 = (ahze)builder.instance;
            ce2.getClass();
            ahze8.d = ce2;
            ahze8.b |= 0x2;
        }
        if (b2) {
            final aisc ce3 = cE(list.get(n), s, n, true);
            builder.copyOnWrite();
            final ahze ahze9 = (ahze)builder.instance;
            ce3.getClass();
            ahze9.d = ce3;
            ahze9.b |= 0x2;
        }
        return (ahze)builder.build();
    }
    
    private static aisc cE(final String c, final String d, final int e, final boolean g) {
        final ahcr builder = ((ahcz)amyt.a).createBuilder();
        if (!TextUtils.isEmpty((CharSequence)c)) {
            builder.copyOnWrite();
            final amyt amyt = (amyt)builder.instance;
            c.getClass();
            amyt.b |= 0x1;
            amyt.c = c;
        }
        if (!TextUtils.isEmpty((CharSequence)d)) {
            builder.copyOnWrite();
            final amyt amyt2 = (amyt)builder.instance;
            d.getClass();
            amyt2.b |= 0x2;
            amyt2.d = d;
        }
        if (e >= 0) {
            builder.copyOnWrite();
            final amyt amyt3 = (amyt)builder.instance;
            amyt3.b |= 0x4;
            amyt3.e = e;
        }
        builder.copyOnWrite();
        final amyt amyt4 = (amyt)builder.instance;
        amyt4.b |= 0x20;
        amyt4.g = g;
        final ahct ahct = (ahct)((ahcz)aisc.a).createBuilder();
        ahct.e((ahci)OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (Object)builder.build());
        return (aisc)((ahcr)ahct).build();
    }
    
    private static ahze cF(final String s, final int n, final int n2, final int n3, final List list, final boolean b, final boolean b2) {
        return cD(s, n, n2, n3, list, b, b2, false, new ArrayList());
    }
    
    private final void cG(final int n) {
        ((acoe)this.a).d(new wzh(n - 1, 10), ajvy.j);
    }
    
    private final xab cH() {
        return ((xaa)this.a).pE();
    }
    
    public static Track cb(final ahye ahye) {
        final int b = ahye.b;
        final ajws ajws = null;
        ajws ajws2;
        if ((b & 0x1) != 0x0) {
            if ((ajws2 = ahye.c) == null) {
                ajws2 = ajws.a;
            }
        }
        else {
            ajws2 = null;
        }
        final Spanned b2 = acbu.b(ajws2);
        ajws ajws3;
        if ((ahye.b & 0x2) != 0x0) {
            if ((ajws3 = ahye.d) == null) {
                ajws3 = ajws.a;
            }
        }
        else {
            ajws3 = null;
        }
        final Spanned b3 = acbu.b(ajws3);
        final int e = ahye.e;
        aple aple;
        if ((aple = ahye.g) == null) {
            aple = aple.a;
        }
        Uri parse;
        if ((aple.b & 0x1) != 0x0) {
            aple aple2;
            if ((aple2 = ahye.g) == null) {
                aple2 = aple.a;
            }
            parse = Uri.parse(aple2.c);
        }
        else {
            parse = null;
        }
        aowb aowb2;
        if ((ahye.b & 0x8) != 0x0) {
            aowb aowb;
            if ((aowb = ahye.f) == null) {
                aowb = aowb.a;
            }
            aowb2 = aowb;
        }
        else {
            aowb2 = null;
        }
        ajws ajws4;
        if ((ahye.b & 0x20) != 0x0) {
            if ((ajws4 = ahye.h) == null) {
                ajws4 = ajws.a;
            }
        }
        else {
            ajws4 = null;
        }
        final Spanned b4 = acbu.b(ajws4);
        ajws ajws5 = ajws;
        if ((ahye.b & 0x40) != 0x0 && (ajws5 = ahye.i) == null) {
            ajws5 = ajws.a;
        }
        return new Track(b2, b3, e, parse, aowb2, b4, acbu.b(ajws5));
    }
    
    public static void ch() {
        tut.b("Error saving recent stickers to PDS");
    }
    
    public static aisc cn(final xab xab, aisc aisc, final int d) {
        if (xab != null && xab.a() != null) {
            final ahcr builder = ((ahcz)amsl.a).createBuilder();
            builder.copyOnWrite();
            final amsl amsl = (amsl)builder.instance;
            amsl.b |= 0x2;
            amsl.d = d;
            final InteractionLoggingScreen a = xab.a();
            if (a != null) {
                final String a2 = a.a;
                builder.copyOnWrite();
                final amsl amsl2 = (amsl)builder.instance;
                a2.getClass();
                amsl2.b |= 0x1;
                amsl2.c = a2;
            }
            final ahct ahct = (ahct)((ahcz)aisc).toBuilder();
            ahct.e((ahci)amsk.b, (Object)builder.build());
            ((ahcr)ahct).copyOnWrite();
            aisc = (aisc)ahct.instance;
            aisc.b &= 0xFFFFFFFE;
            aisc.c = aisc.a.c;
            return (aisc)((ahcr)ahct).build();
        }
        return aisc;
    }
    
    public static boolean co(final View view, final boolean b) {
        final int visibility = view.getVisibility();
        final boolean b2 = true;
        boolean b3 = b;
        if (visibility == 0) {
            final boolean b4 = b2;
            if (!b) {
                return b4;
            }
            b3 = true;
        }
        boolean b4;
        if (view.getVisibility() != 0) {
            if (!b3) {
                return false;
            }
            b4 = b2;
        }
        else {
            b4 = false;
        }
        return b4;
    }
    
    public static aefs cy(String s, final long n, final vbs vbs) {
        if (s == null || n <= 0L) {
            return null;
        }
        final String[] split = s.split("\\|");
        final int length = split.length;
        boolean b = true;
        if (length <= 1) {
            return null;
        }
        int i = 0;
        s = split[0];
        final String[] array = Arrays.copyOfRange(split, 1, length);
        if (vbs == null || !vbs.f(45383693L)) {
            b = false;
        }
        final ArrayList list = new ArrayList();
    Label_0127_Outer:
        while (i < array.length) {
            final String s2 = array[i];
            while (true) {
                if (b) {
                    try {
                        if (afbj.f(s2)) {
                            list.add(i, null);
                        }
                        else {
                            list.add(i, new abjs(s, i, s2, n));
                        }
                        ++i;
                        continue Label_0127_Outer;
                    }
                    catch (final IllegalArgumentException ex) {
                        return null;
                    }
                    break;
                }
                continue;
            }
        }
        return new aefs((List)list);
    }
    
    public static aefs cz(final adgg adgg) {
        if (adgg != null) {
            return new aefs(adgg, null, null, null, null, null, null);
        }
        return null;
    }
    
    public static long m(final File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        final File[] listFiles = file.listFiles();
        long n2;
        long n = n2 = 0L;
        if (listFiles != null) {
            int n3 = 0;
            while (true) {
                n2 = n;
                if (n3 >= listFiles.length) {
                    break;
                }
                n += m(listFiles[n3]);
                ++n3;
            }
        }
        return n2;
    }
    
    public final ajqo A(final vgx vgx) {
        return new ajqo((ajqp)((ahcr)this.a).build(), vgx);
    }
    
    public final ajqf B(final vgx vgx) {
        return new ajqf((ajqh)((ahcr)this.a).build(), vgx);
    }
    
    public final ajjv C(final vgx vgx) {
        return new ajjv((ajjz)((ahcr)this.a).build(), vgx);
    }
    
    public final void D(final List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    ((ahcr)this.a).aJ((aowb)iterator.next());
                }
            }
        }
    }
    
    public final void E(final aowb... array) {
        for (int i = 0; i <= 0; ++i) {
            ((ahcr)this.a).aI(array[i]);
        }
    }
    
    public final void F(final aqbo aqbo) {
        final ahcr ahcr = (ahcr)this.a;
        ahcr.copyOnWrite();
        final ajjz ajjz = (ajjz)ahcr.instance;
        final ajjz a = ajjz.a;
        ajjz.e = aqbo.f;
        ajjz.b |= 0x1;
    }
    
    public final akeg G(final akeg akeg) {
        akeg akeg2 = akeg;
        if (((Map)this.a).containsKey(akeg)) {
            akeg2 = ((Map<K, akeg>)this.a).get(akeg);
        }
        return akeg2;
    }
    
    public final List H(final akeg akeg) {
        return (List)this.G(akeg).d;
    }
    
    public final void I(final Object o, final View view) {
        if (((Set)this.a).isEmpty()) {
            return;
        }
        final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().a(o, view);
        }
    }
    
    public final acmm J(final acmh acmh) {
        final aefs aefs = (aefs)((atnb)this.a).a();
        aefs.getClass();
        acmh.getClass();
        return new acmm(aefs, acmh, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final acmm K(final acmh acmh, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final aefs aefs = (aefs)((atnb)this.a).a();
        aefs.getClass();
        acmh.getClass();
        return new acmm(aefs, acmh, viewGroup$LayoutParams, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final aclx L(final acme acme) {
        final veh veh = (veh)((atnb)this.a).a();
        veh.getClass();
        acme.getClass();
        return new aclx(veh, acme);
    }
    
    public final aclx M(final acme acme, final aclu aclu) {
        final veh veh = (veh)((atnb)this.a).a();
        veh.getClass();
        acme.getClass();
        return new aclx(veh, acme, aclu);
    }
    
    public final aclp N(final acmh acmh) {
        final aefs aefs = (aefs)((atnb)this.a).a();
        aefs.getClass();
        acmh.getClass();
        return new aclp(aefs, acmh, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void O(final RecyclerView recyclerView, final xab b) {
        final Object a = this.a;
        final adiy adiy = (adiy)a;
        if (adiy.a && b != null && !adiy.d) {
            adiy.b = b;
            final InteractionLoggingScreen a2 = b.a();
            adjm bj = null;
            if (a2 != null) {
                bj = bj;
                if (a2.f == 3854) {
                    bj = adiy.e.bJ(ajhi.c);
                }
            }
            adiy.c = bj;
            recyclerView.aE((hz)a);
            adiy.d = true;
            recyclerView.getContext();
        }
    }
    
    public final void P(final RecyclerView recyclerView) {
        final Object a = this.a;
        final adiy adiy = (adiy)a;
        if (adiy.a && adiy.d) {
            recyclerView.aH((hz)a);
            final adjm c = adiy.c;
            if (c != null) {
                c.a();
                adiy.c = null;
            }
            recyclerView.getContext();
            adiy.d = false;
        }
    }
    
    public final oor Q(Object o, final ots ots) {
        final ajxw ajxw = (ajxw)o;
        final ouu f = ots.f;
        if (f instanceof acet) {
            final acet acet = (acet)f;
            final xab a = acet.a;
            alxw alxw;
            if ((alxw = ajxw.d) == null) {
                alxw = alxw.b;
            }
            o = new acha(a, alxw, acet.b, ots, (ove)this.a);
        }
        else {
            o = null;
        }
        return (oor)o;
    }
    
    public final asjy R() {
        return ((asjy)((tpw)this.a).c).x();
    }
    
    public final void S(int an) {
        an = aqvq.an(an);
        final tpw tpw = (tpw)this.a;
        if (an == 0) {
            tpw.f = 2;
            return;
        }
        tpw.f = an;
    }
    
    public final void T(final boolean b) {
        ((tpw)this.a).d(b);
    }
    
    public final accu U(final ajon ajon) {
        ajon ajon2 = ajon;
        if (((Optional)this.a).isPresent()) {
            ajon2 = ajon;
            if (!((ahcu)ajon).ry((ahci)aqco.a)) {
                ajon2 = ajon;
                if (((ahcu)ajon).ry((ahci)ainp.a)) {
                    final aqfh aqfh = (aqfh)((ahcu)ajon).rx((ahci)ainp.a);
                    final ahct ahct = (ahct)((ahcz)ajon).toBuilder();
                    accy.e(ahct, ocg.l((Container)((atnb)((Optional)this.a).get()).a(), aqfh));
                    ajon2 = (ajon)((ahcr)ahct).build();
                }
            }
        }
        return new accu(ajon2);
    }
    
    public final accl V(final Context context) {
        return new accl(context, ((vbs)this.a).aR(), ((vbs)this.a).aU());
    }
    
    public final accl W(final Context context, final int n) {
        return new accl(context, n, ((vbs)this.a).aR(), ((vbs)this.a).aU());
    }
    
    public final boolean Y() {
        return ((vbs)this.a).aR();
    }
    
    public final void Z(final acci acci) {
        this.aa(acci, "");
    }
    
    public final SharedPreferences a() {
        return ((Context)this.a).getSharedPreferences("playcore_split_install_internal", 0);
    }
    
    public final boolean aA() {
        return ((Activity)this.a).shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
    }
    
    public final boolean aB() {
        return ((zsk)this.a).b();
    }
    
    public final void aC(final Throwable t) {
        this.cG(6);
        znh.c(zng.b, znf.g, "Chime registration error", t);
    }
    
    public final void aD() {
        this.cG(5);
    }
    
    public final void aE(final Throwable t) {
        this.cG(8);
        znh.c(zng.b, znf.g, "Chime unregistration error", t);
    }
    
    public final void aF() {
        this.cG(7);
    }
    
    public final zqi aG(final ajtp ajtp) {
        final SecureRandom secureRandom = (SecureRandom)((atnb)this.a).a();
        secureRandom.getClass();
        ajtp.getClass();
        return new zqi(secureRandom, ajtp);
    }
    
    public final yof aH(final bch bch, final ScheduledExecutorService scheduledExecutorService, final yoa yoa, final yow yow) {
        zfa.a((Object)scheduledExecutorService);
        final yof yof = new yof(yoa, yow);
        final Object a = this.a;
        if (bch == null) {
            yof.a = (yos)((yok)a).a((yor)yof);
        }
        else {
            yof.a = (yos)new yoq(bch, scheduledExecutorService, (yor)yof);
        }
        return yof;
    }
    
    public final byte[] aI() {
        try {
            return ((Cipher)this.a).doFinal();
        }
        catch (final BadPaddingException | IllegalBlockSizeException ex) {
            return null;
        }
    }
    
    public final int aJ(final long n) {
        final adgg adgg = (adgg)this.a;
        final long[] au = adgg.au();
        final boolean b = false;
        if (n < au[0]) {
            return 0;
        }
        final int av = baz.av(adgg.au(), n, true);
        boolean b2 = b;
        if (av >= 0) {
            b2 = b;
            if (av < ((adgg)this.a).aq()) {
                b2 = true;
            }
        }
        zfa.d(b2);
        return av + 1;
    }
    
    public final int aK(final long n) {
        final int ap = ((adgg)this.a).ap(n);
        boolean b = false;
        if (ap >= 0) {
            b = b;
            if (ap < ((adgg)this.a).aq()) {
                b = true;
            }
        }
        zfa.d(b);
        return ap + 1;
    }
    
    public final int aL() {
        return ((adgg)this.a).aq();
    }
    
    public final int aM(final int n) {
        boolean b = false;
        if (n > 0) {
            b = b;
            if (n <= this.aL()) {
                b = true;
            }
        }
        zfa.b(b);
        return ((adgg)this.a).as()[n - 1];
    }
    
    public final long aN(final int n) {
        boolean b = false;
        if (n > 0) {
            b = b;
            if (n <= this.aL()) {
                b = true;
            }
        }
        zfa.b(b);
        return ((adgg)this.a).at()[n - 1];
    }
    
    public final long aO(final int n) {
        boolean b = false;
        if (n > 0) {
            b = b;
            if (n <= this.aL()) {
                b = true;
            }
        }
        zfa.b(b);
        return ((adgg)this.a).au()[n - 1];
    }
    
    public final long aP(final int n) {
        boolean b = false;
        if (n > 0) {
            b = b;
            if (n <= this.aL()) {
                b = true;
            }
        }
        zfa.b(b);
        return ((adgg)this.a).av()[n - 1];
    }
    
    public final long aQ() {
        return ((adgg)this.a).ar();
    }
    
    public final void aR(final int n) {
        final xtu xtu = (xtu)((atnb)this.a).a();
        final xtq f = xtu.f;
        if (f.a == 2) {
            final xtl b = f.f.b();
            b.c(n);
            xtu.i(b);
            xtu.b(0);
        }
    }
    
    public final void aS(final xbg xbg) {
        this.cH().J(3, (xbe)new wzy(xbg), (alji)null);
    }
    
    public final void aT(final xbg xbg) {
        if (this.cH() != null) {
            this.cH().l((xbe)new wzy(xbg));
        }
    }
    
    public final ListenableFuture aU() {
        return afvh.e(((qrk)((atnb)this.a).a()).a(), (afax)wrb.q, (Executor)afwd.a);
    }
    
    public final ListenableFuture aV() {
        return afvh.e(((qrk)((atnb)this.a).a()).a(), (afax)wrb.r, (Executor)afwd.a);
    }
    
    public final ListenableFuture aW() {
        return ((qrk)((atnb)this.a).a()).b((afax)wrb.o, (Executor)afwd.a);
    }
    
    public final int aX() {
        return ((SharedPreferences)this.a).getInt("mdx.last_lr_notification_shown_id", -1);
    }
    
    public final long aY() {
        return ((SharedPreferences)this.a).getLong("mdx.lr_notification_last_notif_shown_time_ms", 0L);
    }
    
    public final String aZ() {
        return ((SharedPreferences)this.a).getString("mdx.last_lr_notification_shown_tag", "");
    }
    
    public final void aa(final acci acci, final String s) {
        tcl.l();
        ((afcs)this.a).p(s, acci);
    }
    
    public final void ab() {
        tcl.l();
        final Iterator iterator = ((afcs)this.a).u().iterator();
        while (iterator.hasNext()) {
            ((acci)iterator.next()).nr();
        }
    }
    
    public final void ac(final acci acci) {
        this.ad(acci, "");
    }
    
    public final void ad(final acci acci, final String s) {
        tcl.l();
        final Collection collection = ((afdp)this.a).v().get(s);
        if (collection != null) {
            collection.remove(acci);
        }
    }
    
    public final PlaybackListenerStateRestorerState ae() {
        final HashMap hashMap = new HashMap();
        for (final acat acat : this.a) {
            final Parcelable n = acat.N();
            if (n != null) {
                hashMap.put(acat.getClass().toString(), n);
            }
        }
        return new PlaybackListenerStateRestorerState((Map)hashMap);
    }
    
    public final /* bridge */ ysb af(final String s) {
        return (ysb)new abth((abtj)this.a, s);
    }
    
    public final void ag(final PlaybackListenerStateRestorerState playbackListenerStateRestorerState, final agjn agjn) {
        final Map a = playbackListenerStateRestorerState.a;
        for (final acat acat : this.a) {
            final Parcelable parcelable = a.get(acat.getClass().toString());
            if (parcelable != null) {
                acat.f(parcelable, agjn);
            }
        }
    }
    
    public final ListenableFuture ah(final znz znz) {
        return afvh.e(((tnz)this.a).a(), (afax)new ablz(ai(znz, "playability_adult_confirmations"), 3), (Executor)afwd.a);
    }
    
    public final void al(final znz znz, final boolean b) {
        tfx.m(((tnz)this.a).b((afax)new fmw(ai(znz, "playability_adult_confirmations"), b, 11)), (tfv)zvv.n);
    }
    
    public final afbh an() {
        return (afbh)((Pair)this.a).second;
    }
    
    public final ListenableFuture ao() {
        return (ListenableFuture)((Pair)this.a).first;
    }
    
    public final void ap(final Object o) {
        ((thg)this.a).d(o);
    }
    
    public final void aq(final Object o) {
        ((thg)this.a).f(o);
    }
    
    public final abjs ar(final int n) {
        if (n >= 0 && n < ((List)this.a).size()) {
            return ((List<abjs>)this.a).get(n);
        }
        return null;
    }
    
    public final ahzf au(final PlaybackStartDescriptor playbackStartDescriptor, final List list) {
        monitorenter(this);
        try {
            if (list.isEmpty()) {
                final ahzf a = ahzf.a;
                monitorexit(this);
                return a;
            }
            final int size = list.size();
            final int max = Math.max(playbackStartDescriptor.a(), 0);
            aaei aaei;
            if (size > 1) {
                final ArrayList<Integer> list2 = new ArrayList<Integer>();
                for (int i = 0; i < size; ++i) {
                    list2.add(i);
                }
                list2.set(0, max);
                list2.set(max, 0);
                ((aefs)this.a).cv(list2, size);
                aaei = aaei.a(afgh.o(list2), Integer.valueOf(0), Integer.valueOf(7));
            }
            else {
                int n;
                if (!TextUtils.isEmpty((CharSequence)playbackStartDescriptor.i())) {
                    n = 5;
                }
                else {
                    n = 4;
                }
                aaei = aaei.a(afgh.q(), Integer.valueOf(max), Integer.valueOf(n));
            }
            final String j = playbackStartDescriptor.i();
            final int size2 = list.size();
            final int max2 = Math.max(playbackStartDescriptor.a(), 0);
            final int intValue = aaei.b;
            final int intValue2 = aaei.c;
            final int n2 = intValue2 & 0x2;
            final afgh a2 = aaei.a;
            final ArrayList<ahze> list3 = new ArrayList<ahze>(4);
            list3.add(cF(j, size2, max2, intValue, list, false, false));
            Label_0335: {
                if ((intValue2 & 0x1) != 0x0) {
                    list3.add(cF(j, size2, max2, intValue, list, true, false));
                    if (n2 == 0) {
                        break Label_0335;
                    }
                    list3.add(cD(j, size2, max2, intValue, list, true, false, true, a2));
                }
                else if (n2 == 0) {
                    break Label_0335;
                }
                list3.add(cD(j, size2, max2, intValue, list, false, false, true, a2));
            }
            if ((intValue2 & 0x4) != 0x0) {
                list3.add(cF(j, size2, max2, intValue, list, false, true));
            }
            final ahct ahct = (ahct)((ahcz)ahzf.a).createBuilder();
            ahct.h((Iterable)list3);
            ahct.g((Iterable)list3);
            final ahzf ahzf = (ahzf)((ahcr)ahct).build();
            monitorexit(this);
            return ahzf;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void av(final aacx aacx) {
        final agr e = aacx.e;
        if (e != null) {
            this.az(e);
        }
    }
    
    public final void aw(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.av((aacx)iterator.next());
        }
    }
    
    public final aaga ax() {
        return this.ay().g();
    }
    
    public final aage ay() {
        return ((aadl)((atnb)this.a).a()).a();
    }
    
    public final void az(final agr agr) {
        tcl.k();
        final zxm zxm = (zxm)((atnb)this.a).a();
        if (zxm.aq((String)agr.e) == null) {
            zxm.ar(agr);
            return;
        }
        zxm.as(agr);
    }
    
    public final Set b() {
        monitorenter(aefs.class);
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
                    monitorexit(aefs.class);
                    monitorexit(aefs.class);
                    return;
                }
            }
        }
        catch (final Exception ex) {}
    }
    
    public final boolean bA() {
        final akeo f = ((arzb)this.a).f();
        anbn anbn;
        if (f != null) {
            if ((anbn = f.w) == null) {
                anbn = anbn.a;
            }
        }
        else {
            anbn = anbn.a;
        }
        return anbn.b;
    }
    
    public final void bB(final int n, final int n2) {
        final akps d = akpu.d();
        final ahcr builder = ((ahcz)alry.a).createBuilder();
        builder.copyOnWrite();
        final alry alry = (alry)builder.instance;
        alry.c = n - 1;
        alry.b |= 0x1;
        builder.copyOnWrite();
        final alry alry2 = (alry)builder.instance;
        alry2.d = n2 - 1;
        alry2.b |= 0x2;
        final alry alry3 = (alry)builder.build();
        ((ahcr)d).copyOnWrite();
        akpu.ax((akpu)d.instance, alry3);
        ((wza)this.a).d((akpu)((ahcr)d).build());
    }
    
    public final vzf bC(final aoue aoue) {
        final aoue a = aoue.a;
        if (aoue.ordinal() != 0) {
            return vzf.j;
        }
        return (vzf)this.a;
    }
    
    public final byte[] bD() {
        final aklb aklb = (aklb)this.a;
        if ((aklb.b & 0x10) != 0x0) {
            return aklb.f.I();
        }
        return null;
    }
    
    public final ahcr bE() {
        tcl.k();
        final ahcr builder = ((ahcz)aknh.a).createBuilder();
        final Set set = (Set)((atnb)this.a).a();
        if (set != null) {
            final Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                ((vne)iterator.next()).b(builder);
            }
        }
        return builder;
    }
    
    public final boolean bF(final vls vls) {
        if (vls.o()) {
            return false;
        }
        final String d = ((zoa)this.a).c().d();
        final String d2 = vls.s.d();
        return vls.p() && !d.equals(d2);
    }
    
    public final void bG(final String s) {
        ((Map<Object, Object>)this.a).remove(s);
    }
    
    public final boolean bH(final int n) {
        return n >= 0 && n < ((List)this.a).size();
    }
    
    public final Uri bI() {
        return ((twk)this.a).a();
    }
    
    public final void bJ(final String s) {
        if (s == null) {
            ((twk)this.a).j("cpn");
            return;
        }
        ((twk)this.a).g("cpn", s);
    }
    
    public final void bK(final long n) {
        if (n > 0L) {
            ((twk)this.a).g("mpr", Long.toString(n));
            return;
        }
        ((twk)this.a).j("mpr");
    }
    
    public final void bL(final long n) {
        ((twk)this.a).g("sq", Long.toString(n));
    }
    
    public final boolean bM() {
        final ListenableFuture f = ((vzb)this.a).f();
        try {
            return (boolean)f.get(1L, TimeUnit.SECONDS);
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            return false;
        }
        catch (final TimeoutException f) {}
        catch (final ExecutionException ex2) {}
        tut.d("Failed to read safemode", (Throwable)f);
        return false;
    }
    
    public final vgw bN() {
        return new vgw((ajsa)((ahcr)this.a).build());
    }
    
    public final void bO(final String s, final String s2) {
        s.getClass();
        s2.getClass();
        ((ahcr)this.a).aL(s, ahbt.A(s2));
    }
    
    public final boolean bP(final aisc aisc, final aisc aisc2) {
        if (aexq.c(aisc, aisc2)) {
            return true;
        }
        if (aisc != null) {
            if (aisc2 != null) {
                final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().a(aisc, aisc2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final vdd bQ(final vde vde, final int n) {
        vde.getClass();
        return new vdd(vde, n, (atnb)this.a);
    }
    
    public final void bR(final ajdx ajdx, final String s) {
        final akps d = akpu.d();
        final ajdy a = ajdz.a();
        ((ahcr)a).copyOnWrite();
        ajdz.d((ajdz)a.instance, ajdx);
        ((ahcr)a).copyOnWrite();
        ajdz.g((ajdz)a.instance, s);
        ((ahcr)d).copyOnWrite();
        akpu.F((akpu)d.instance, (ajdz)((ahcr)a).build());
        ((aefs)this.a).bn((akpu)((ahcr)d).build());
    }
    
    public final void bS(final ajdx ajdx, final String s, final String s2) {
        final akps d = akpu.d();
        final ajdy a = ajdz.a();
        ((ahcr)a).copyOnWrite();
        ajdz.d((ajdz)a.instance, ajdx);
        ((ahcr)a).copyOnWrite();
        ajdz.g((ajdz)a.instance, s);
        ((ahcr)a).copyOnWrite();
        ajdz.c((ajdz)a.instance, s2);
        ((ahcr)d).copyOnWrite();
        akpu.F((akpu)d.instance, (ajdz)((ahcr)a).build());
        ((aefs)this.a).bn((akpu)((ahcr)d).build());
    }
    
    public final asla bT() {
        return ((asla)this.a).H();
    }
    
    public final void bU(final tmy tmy, final alo alo) {
        if (tmy instanceof vmv && ((vmv)tmy).E()) {
            final zqh zqh = (zqh)tmy;
            tfx.i(((zks)this.a).c(), (tfw)new ubx(zqh, 5));
            if (alo.b != null) {
                tfx.i(((zks)this.a).e(), (tfw)new jno(alo, zqh, 14, (byte[])null, (byte[])null, (byte[])null));
            }
        }
    }
    
    public final boolean bV(final String s) {
        return ((Set)this.a).contains(s);
    }
    
    public final void bW(final uwk uwk) {
        ((AtomicReference<WeakReference>)this.a).set(new WeakReference(uwk));
    }
    
    public final boolean bX(final apnv apnv) {
        final Object a = this.a;
        return a != null && apnv != null && ((Set)a).contains(apnv);
    }
    
    public final umh bY() {
        return ((umg)this.a).a(1, umo.f, umo.j);
    }
    
    public final void bZ(final Bitmap bitmap, final unq unq) {
        final int n = bitmap.getHeight() + 2;
        final double n2 = bitmap.getWidth() + 2;
        Double.isNaN(n2);
        final int n3 = (int)Math.ceil(n2 / 4.0);
        final Bitmap$Config argb_8888 = Bitmap$Config.ARGB_8888;
        final int n4 = n3 * 4;
        final Bitmap bitmap2 = Bitmap.createBitmap(n4, n, argb_8888);
        new Canvas(bitmap2).drawBitmap(bitmap, (float)((n4 - bitmap.getWidth()) / 2), (float)((n - bitmap.getHeight()) / 2), new Paint(2));
        new uns(this.bY(), unq).execute((Object[])new Bitmap[] { bitmap2 });
    }
    
    public final void ba() {
        ((SharedPreferences)this.a).edit().putInt("mdx.last_lr_notification_shown_id", -1).apply();
        ((SharedPreferences)this.a).edit().putString("mdx.last_lr_notification_shown_tag", "").apply();
    }
    
    public final asln bb(final MediaRouteButton mediaRouteButton) {
        final xiw xiw = new xiw(mediaRouteButton, (adzx)this.a, (byte[])null, (byte[])null);
        final MediaRouteButton a = xiw.a;
        if (a instanceof xja) {
            final xja xja = (xja)a;
            xiw.b = xja.h().D((asmc)new sqx(xiw, xja, 12)).aH((asmi)new vms(xiw, 18));
        }
        return (asln)xiw;
    }
    
    public final boolean bc(final String s, final String s2) {
        if ((s != null && s.length() > 100) || (s2 != null && s2.length() > 200)) {
            return false;
        }
        if (s2 == null || s2.length() == 0 || s2.equals(".*")) {
            return true;
        }
        if (s == null) {
            return false;
        }
        if (s.equals(s2)) {
            return true;
        }
        Pattern compile;
        if ((compile = ((HashMap)this.a).get(s2)) == null) {
            try {
                compile = Pattern.compile(s2);
                ((HashMap)this.a).put(s2, compile);
            }
            catch (final PatternSyntaxException ex) {
                return false;
            }
        }
        return compile.matcher(s).matches();
    }
    
    public final afhk bd() {
        return afhk.p((Collection)this.a);
    }
    
    public final void be(final xdt xdt) {
        ((Set<xdt>)this.a).add(xdt);
        xdt.k();
    }
    
    public final xbl bf(final InteractionLoggingScreen interactionLoggingScreen) {
        final xah xah = (xah)((atnb)this.a).a();
        xah.getClass();
        return new xbl(xah, interactionLoggingScreen);
    }
    
    public final void bg(final xab xab, final MessageLite messageLite, final MessageLite messageLite2) {
        adme.K(this.bh(messageLite));
        adme.K(this.bh(messageLite2));
        xab.F(xny.P(this.bi(messageLite)), xny.P(this.bi(messageLite2)));
    }
    
    public final boolean bh(final MessageLite messageLite) {
        return ((tgy)this.a).containsKey((Object)messageLite);
    }
    
    public final apry bi(final MessageLite messageLite) {
        messageLite.getClass();
        adme.T(this.bh(messageLite));
        final Object a = ((xjl)((tgy)this.a).get((Object)messageLite)).a;
        throw null;
    }
    
    public final void bj(final xab xab, final MessageLite messageLite) {
        adme.K(this.bh(messageLite));
        xab.t(xny.P(this.bi(messageLite)), (alji)null);
    }
    
    public final void bk(final MessageLite messageLite) {
        ((Map<MessageLite, Boolean>)this.a).put(messageLite, Boolean.valueOf(true));
    }
    
    public final boolean bl(final MessageLite messageLite) {
        return ((Map)this.a).containsKey(messageLite);
    }
    
    public final void bn(final akpu akpu) {
        ((wza)this.a).d(akpu);
    }
    
    public final void bo(final akpu akpu, final long n) {
        ((wza)this.a).e(akpu, n);
    }
    
    public final void bp(final akpu akpu, final znz znz) {
        ((wza)this.a).n(akpu, znz);
    }
    
    public final void bq(final int n) {
        JavaRuntime.a.a(n, 464566978, (oci)new ten(this, 9, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final int br() {
        try {
            synchronized (this.a) {
                return (int)afvh.e(((qrk)this.a).a(), (afax)wrb.c, (Executor)afwd.a).get(5000L, TimeUnit.MILLISECONDS);
            }
        }
        catch (final TimeoutException | InterruptedException | ExecutionException ex) {
            return 0;
        }
    }
    
    public final long bs() {
        try {
            synchronized (this.a) {
                return (long)afvh.e(((qrk)this.a).a(), (afax)vgd.q, (Executor)afwd.a).get(5000L, TimeUnit.MILLISECONDS);
            }
        }
        catch (final TimeoutException | InterruptedException | ExecutionException ex) {
            return -1L;
        }
    }
    
    public final String bt() {
        try {
            synchronized (this.a) {
                return (String)afvh.e(((qrk)this.a).a(), (afax)vgd.s, (Executor)afwd.a).get(5000L, TimeUnit.MILLISECONDS);
            }
        }
        catch (final TimeoutException | InterruptedException | ExecutionException ex) {
            return "";
        }
    }
    
    public final boolean bu() {
        try {
            synchronized (this.a) {
                return (boolean)afvh.e(((qrk)this.a).a(), (afax)wrb.a, (Executor)afwd.a).get(5000L, TimeUnit.MILLISECONDS);
            }
        }
        catch (final TimeoutException | InterruptedException | ExecutionException ex) {
            return false;
        }
    }
    
    public final boolean bv() {
        try {
            synchronized (this.a) {
                return (boolean)afvh.e(((qrk)this.a).a(), (afax)vgd.t, (Executor)afwd.a).get(5000L, TimeUnit.MILLISECONDS);
            }
        }
        catch (final TimeoutException | InterruptedException | ExecutionException ex) {
            return false;
        }
    }
    
    public final boolean bw() {
        try {
            synchronized (this.a) {
                return (boolean)afvh.e(((qrk)this.a).a(), (afax)vgd.r, (Executor)afwd.a).get(5000L, TimeUnit.MILLISECONDS);
            }
        }
        catch (final TimeoutException | InterruptedException | ExecutionException ex) {
            return false;
        }
    }
    
    public final void bx(final String c) {
        tut.c("PeerConnectionClient", c);
        final ahcr builder = alws.a.createBuilder();
        final ahcr builder2 = alwt.a.createBuilder();
        final ahcr builder3 = apxb.a.createBuilder();
        builder3.copyOnWrite();
        final apxb apxb = (apxb)builder3.instance;
        c.getClass();
        apxb.b |= 0x1;
        apxb.c = c;
        builder2.copyOnWrite();
        final alwt alwt = (alwt)builder2.instance;
        final apxb d = (apxb)builder3.build();
        d.getClass();
        alwt.d = d;
        alwt.b |= 0x4;
        builder.copyOnWrite();
        final alws alws = (alws)builder.instance;
        final alwt e = (alwt)builder2.build();
        e.getClass();
        alws.e = e;
        alws.b |= 0x10;
        this.bz(4, (alws)builder.build());
    }
    
    public final void by(final int n) {
        ((acoe)this.a).d(new wzh(n - 1, 34), ajvy.n);
    }
    
    public final void bz(final int n, final alws i) {
        final Object a = this.a;
        final wzh wzh = new wzh(n - 1, 34);
        final ahcr builder = ((ahcz)ajve.a).createBuilder();
        builder.copyOnWrite();
        final ajve ajve = (ajve)builder.instance;
        i.getClass();
        ajve.i = i;
        ajve.b |= 0x200;
        wzh.a = (ajve)builder.build();
        ((acoe)a).d(wzh, ajvy.n);
    }
    
    public final AccountId c() {
        return (AccountId)((adgg)this.a).a;
    }
    
    public final umj ca(final List list) {
        final umn umn = new umn(list, (qrk)this.a);
        afvh.e(umn.d(), (afax)new ujj(umn, 3), (Executor)afwd.a);
        return (umj)umn;
    }
    
    public final boolean cc() {
        apok apok;
        if ((apok = ((arzb)this.a).f().s) == null) {
            apok = apok.a;
        }
        return apok.i;
    }
    
    public final boolean cd() {
        apok apok;
        if ((apok = ((arzb)this.a).f().s) == null) {
            apok = apok.a;
        }
        return apok.f;
    }
    
    public final boolean ce() {
        apok apok;
        if ((apok = ((arzb)this.a).f().s) == null) {
            apok = apok.a;
        }
        return apok.j;
    }
    
    public final ListenableFuture cf(final aup aup) {
        return tfx.b(aup, ((qrk)this.a).a(), (afax)uio.b);
    }
    
    public final void cg(final anxb anxb, final aup aup) {
        anxb.getClass();
        tfx.n(aup, this.cf(aup), (tui)sus.k, (tui)new tzd(this, anxb, 2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final void ci(final Exception ex) {
        final acd acd = ((AtomicReference)this.a).get();
        if (acd != null) {
            tut.n("VoiceoverRecordCtrl.onRecordError of AudioRecordingEventListener", (Throwable)ex);
            acd.d((Throwable)ex);
        }
    }
    
    public final uae cj(final ImageView imageView, final int n, final int n2) {
        return new uae(imageView, n, n2, (xab)this.a);
    }
    
    public final ListenableFuture ck(final Context context, final udj udj, final Uri uri) {
        long n2;
        final long n = n2 = 0L;
        if (udj != null) {
            final EditableVideo b = udj.b();
            n2 = n;
            if (udj.ah(udj)) {
                n2 = n;
                if (b != null) {
                    n2 = b.n();
                }
            }
        }
        return this.cl(context, uri, n2, 2);
    }
    
    public final ListenableFuture cl(final Context context, final Uri uri, final long n, final int n2) {
        return afxr.p(aewf.i((Callable)new zwf(context, uri, n, n2, 1)), (Executor)this.a);
    }
    
    public final txz cm(final xbg xbg) {
        return new txz(this, xbg, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final txz cp(final xbg xbg) {
        return new txz(this, xbg, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void cq(final Consumer consumer) {
        consumer.getClass();
        final Iterator<Object> iterator = ((Set<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            consumer.accept(iterator.next());
        }
    }
    
    public final void cr(final Object o) {
        ((Set<Object>)this.a).add(o);
    }
    
    public final void cs(final Object o) {
        ((Set)this.a).remove(o);
    }
    
    public final double ct(final double n, final double n2) {
        adme.K(n <= n2);
        return n + ((SecureRandom)this.a).nextDouble() * (n2 - n);
    }
    
    public final String cu(final int n) {
        final byte[] array = new byte[n];
        ((SecureRandom)this.a).nextBytes(array);
        return Base64.encodeToString(array, 10);
    }
    
    public final void cv(final ArrayList list, int n) {
        if (this.a == null) {
            return;
        }
        final int max = Math.max(1, 0);
        if (max >= n) {
            return;
        }
        final int size = list.size();
        if (size != 0) {
            if (max < size) {
                n = Math.min(n, size) - max;
                while (--n >= 0) {
                    final int n2 = n + max;
                    final int n3 = ((SecureRandom)this.a).nextInt(n + 1) + max;
                    final int intValue = list.get(n2);
                    list.set(n2, list.get(n3));
                    list.set(n3, intValue);
                }
            }
        }
    }
    
    public final String cw() {
        return ((aefs)this.a).cu(12);
    }
    
    public final ume cx(final String s) {
        return ((Map<K, ume>)this.a).get(s);
    }
    
    public final void d(final String s) {
        Log.e("SetupLibrary", ((String)this.a).concat(s));
    }
    
    public final void e(final String s, final Throwable t) {
        Log.e("SetupLibrary", ((String)this.a).concat(s), t);
    }
    
    public final void f(final String s) {
        Log.w("SetupLibrary", ((String)this.a).concat(s));
    }
    
    public final Map g(final Collection collection) {
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
    
    public final void h(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", cC((String)this.a, s, array));
        }
    }
    
    public final void i(final Throwable t, final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", cC((String)this.a, s, array), t);
        }
    }
    
    public final void j(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", cC((String)this.a, s, array));
        }
    }
    
    public final void k(final Object o) {
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
    
    public final void l(final int n) {
        ((List<aedh>)this.a).add(new aedh(n, System.currentTimeMillis()));
    }
    
    public final aqgm n(final vgx vgx) {
        return new aqgm((aqgs)((ahcr)this.a).build(), vgx);
    }
    
    public final aqbw o() {
        return new aqbw((aqbx)((ahcr)this.a).build());
    }
    
    public final aowd p(final vgx vgx) {
        return new aowd((aowb)((ahcr)this.a).build(), vgx);
    }
    
    public final aonw q() {
        return new aonw((aonx)((ahcr)this.a).build());
    }
    
    public final anmk r(final vgx vgx) {
        return new anmk((anmm)((ahcr)this.a).build(), vgx);
    }
    
    public final amwp s(final vgx vgx) {
        return new amwp((amwq)((ahcr)this.a).build(), vgx);
    }
    
    public final amwf t(final vgx vgx) {
        return new amwf((amwh)((ahcr)this.a).build());
    }
    
    public final amwe u() {
        return new amwe((amwg)((ahcr)this.a).build());
    }
    
    public final alyp v(final vgx vgx) {
        return new alyp((alyk)((ahcr)this.a).build(), vgx);
    }
    
    public final alxu w(final vgx vgx) {
        return new alxu((alxw)((ahcr)this.a).build(), vgx);
    }
    
    public final void x() {
        final alpx alpx = (alpx)((ahcr)this.a).build();
    }
    
    public final akfh y() {
        return new akfh((akfj)((ahcr)this.a).build());
    }
    
    public final ajwp z(final vgx vgx) {
        return new ajwp((ajws)((ahcr)this.a).build(), vgx);
    }
}
