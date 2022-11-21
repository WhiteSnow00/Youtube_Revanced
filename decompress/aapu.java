import android.accounts.Account;
import j$.util.OptionalLong;
import java.util.concurrent.Future;
import android.database.SQLException;
import android.app.Notification;
import android.app.NotificationManager;
import android.util.Pair;
import android.content.SharedPreferences$Editor;
import android.os.RemoteException;
import java.util.function.LongConsumer;
import android.text.Spanned;
import android.view.View$OnClickListener;
import com.google.protobuf.MessageLite;
import java.lang.ref.WeakReference;
import android.app.Activity;
import android.view.ViewGroup;
import android.os.storage.StorageVolume;
import android.content.ContentResolver;
import android.provider.MediaStore$Files;
import android.content.ContentUris;
import android.database.Cursor;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import j$.util.Optional;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import org.chromium.net.QuicException;
import org.chromium.net.NetworkException;
import java.net.UnknownHostException;
import java.net.SocketTimeoutException;
import java.io.EOFException;
import java.util.concurrent.ScheduledExecutorService;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View$OnLayoutChangeListener;
import android.graphics.drawable.Drawable;
import android.content.ContentValues;
import j$.util.Objects;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.widget.TextView;
import android.text.TextUtils;
import android.os.Environment;
import android.os.Build$VERSION;
import android.net.Uri;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import android.media.ResourceBusyException;
import android.media.MediaDrm$MediaDrmStateException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.ArrayDeque;
import android.graphics.Rect;
import android.util.LruCache;
import java.util.Random;
import java.util.Set;
import java.lang.reflect.Method;
import com.google.common.android.concurrent.FutureCallbackRegistry$FutureListenerLifecycleObserver;
import android.content.SharedPreferences;
import java.io.IOException;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import android.widget.ImageView;
import android.content.res.Resources$NotFoundException;
import android.content.Context;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import com.google.apps.tiktok.account.AccountId;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.function.Consumer;
import java.io.File;
import java.util.HashSet;
import java.util.HashMap;
import java.util.concurrent.Executor;
import android.os.Handler;
import java.util.Arrays;
import java.util.Map;
import j$.util.DesugarCollections;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aapu
{
    public final Object a;
    public final Object b;
    public final Object c;
    
    public aapu() {
        this.a = DesugarCollections.synchronizedMap((Map)new WeakHashMap());
        this.b = DesugarCollections.synchronizedMap((Map)new WeakHashMap());
        this.c = DesugarCollections.synchronizedMap((Map)new WeakHashMap());
    }
    
    public aapu(final aaed a, final oco c, final aske b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aapu(final aapu aapu, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = Arrays.copyOf((long[])aapu.b, 10);
        this.c = Arrays.copyOf((long[])aapu.c, 10);
        this.a = Arrays.copyOf((long[])aapu.a, 10);
    }
    
    public aapu(final aass aass, final acjq acjq, final Handler c, aavf a, final aaux aaux, final String s, final byte[] array, final byte[] array2) {
        this.c = c;
        final aass a2 = new aass();
        this.a = a2;
        final aaud q = acjq.q(a, 0.0f, 0.0f);
        q.B(true, true);
        q.y(s);
        q.z(-1);
        ((aarh)q).n();
        final aave a3 = aave.a(1.0f, 1.0f, aave.c);
        a = a.a();
        final aarq aarq = new aarq(a3, a, aarq.s(new float[] { 0.0f, 0.0f, 0.0f, 0.5f }, a3.f), aaux.a.a());
        aarq.t();
        aarq.n();
        q.g((aauc)new aawa(aarq, 1));
        final aass aass2 = a2;
        a2.m((aatp)aarq);
        final aass aass3 = a2;
        a2.m((aatp)q);
        aass.m((aatp)a2);
        ((aatr)a2).l = true;
        this.b = new aara(this, 8, null);
    }
    
    public aapu(final accb a, final mbb c, final zoa b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aapu(final acig b, final Executor a) {
        this.c = new HashMap();
        this.b = b;
        this.a = a;
    }
    
    public aapu(final acre acre) {
        final Object o = null;
        acla a;
        if (acre != null) {
            a = acre.a();
        }
        else {
            a = null;
        }
        this.b = a;
        acpg c;
        if (acre instanceof acpg) {
            c = (acpg)acre;
        }
        else {
            c = null;
        }
        this.c = c;
        Object a2 = o;
        if (acre instanceof acsj) {
            a2 = acre;
        }
        this.a = a2;
    }
    
    public aapu(final acya c, final Executor a) {
        this.c = c;
        this.b = new HashSet();
        this.a = a;
    }
    
    public aapu(final adkp c, final tpl b, final atnb a) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aapu(final adod c, final adov a, final File b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aapu(final adtq a, final Consumer b, final adso c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aapu(final agkt b) {
        this.c = new HashSet();
        this.a = new HashSet();
        this.b = b;
    }
    
    public aapu(final agmq a, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        this.b = new aapp(abll.a, null, null, null, null, null, false);
        this.c = new aapt(4);
    }
    
    public aapu(final agnl c, final AccountId b, final afxj a, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = b;
        this.a = a;
        adme.U(b.a() != -1, "Account Id is invalid");
    }
    
    public aapu(final aheu aheu, final byte[] array) {
        this((byte[])null, null);
        ca(this, aheu);
    }
    
    public aapu(final amgx amgx, final String a) {
        this.a = a;
        final ArrayList list = new ArrayList();
        if (amgx != null && amgx.b) {
            Object c = amgx.c;
            if (((List)c).isEmpty()) {
                c = list;
            }
            this.b = Collections.unmodifiableList((List<?>)c);
        }
        else {
            final ahcr builder = ((ahcz)amgz.a).createBuilder();
            builder.copyOnWrite();
            final amgz amgz = (amgz)builder.instance;
            amgz.c = 2;
            amgz.b |= 0x1;
            builder.bo(cd("^(?i)microsoft.*", "^(?i)xbox.*"));
            final amgz amgz2 = (amgz)builder.build();
            final String s = a;
            afgh b;
            if (!xny.H(a)) {
                b = afgh.r(amgz2);
            }
            else {
                final ahcr builder2 = ((ahcz)amgz.a).createBuilder();
                builder2.copyOnWrite();
                final amgz amgz3 = (amgz)builder2.instance;
                amgz3.c = 1;
                amgz3.b |= 0x1;
                builder2.bo(cd("^lge$", "(^476700$|^\\d\\d(lm|ls|pa|pm).*|^global$|^mediabh.*|^mediabp530.*|^tm.*)"));
                builder2.bo(cd("^samsung$", "^(bd|ht)$"));
                builder2.bo(cd("^vizio$", "^e.*_a0$"));
                builder2.bo(cd("^sharp$", "^(le650u|le657e|le65xx|le747e|le757e|le757u|le857e)$"));
                builder2.bo(cd("^funai$", "^philips$"));
                builder2.bo(cd("^(tivo|tivo_comhem)$", "^series4$"));
                final ahcr builder3 = ((ahcz)amgz.a).createBuilder();
                builder3.copyOnWrite();
                final amgz amgz4 = (amgz)builder3.instance;
                amgz4.c = 3;
                amgz4.b |= 0x1;
                if ("m".equals(a)) {
                    builder2.bo(cd("\\s*", "^(TiVo_DCX960)$"));
                    builder2.bo(cd("\\s*", "^(Totalplay_DIW350 HD TP)$"));
                    builder2.bo(cd("\\s*", "^(NEOBOX)$"));
                }
                if ("k".equals(a)) {
                    builder2.bo(cd("^Amazon$", "^.*$"));
                    builder2.bo(cd("^Element$", "^(EL4KAMZ4317|EL4KAMZ5017|EL4KAMZ5517|EL4KAMZ6517|EL4KAMZ4317T|EL4KAMZ5017T|EL4KAMZ5517T|EL4KAMZ6517T)$"));
                    builder2.bo(cd("^Westinghouse$", "^(WA43UFA1001|WA50UFA1001|WA55UFA1001|WA65UFA1001|WA43UFT1001|WA50UFT1001|WA55UFT1001|WA65UFT1001)$"));
                    builder2.bo(cd("^Toshiba$", "^(49LF421U19|43LF421U19|32LF221U19|49LF421C19|43LF421C19|32LF221C19|43LF621U19|50LF621U19|55LF621U19|43LF621C19|50LF621C19|55LF621C19|43LF711U20|50LF711U20|55LF711U20|43LF711C20|50LF711C20|55LF711C20)$"));
                    builder2.bo(cd("^Insignia$", "^(NS-43DF710NA19|NS-50DF710NA19|NS-55DF710NA19|NS-43DF710CA19|NS-50DF710CA19|NS-55DF710CA19|NS-24DF310NA19|NS-32DF310NA19|NS-39DF510NA19|NS-24DF310CA19|NS-32DF310CA19|NS-39DF510CA19)$"));
                    builder2.bo(cd("^Grundig$", "^(43 GUW 7060|43 GUB 7060|43 GUT 7060|43 GUB 7062|43 GUB 7065|43 GUB 7066|43 GUT 7099|43 GUB 7067|43 GUT 7077|43 VLX 7020|43 VLX 7010|49 GUW 7060|49 GUT 7060|49 GUB 7060|49 GUB 7062|49 GUB 7065|49 GUB 7066|49 GUT 7099|49 GUB 7067|49 GUT 7077|49 VLX 7020|49 VLX 7010|55 GUW 7060|55 GUT 7060|55 GUB 7060|55 GUB 7062|55 GUB 7065|55 GUB 7066|55 GUT 7099|55 GUB 7067|55 GUT 7077|55 VLX 7020|55 VLX 7010|65 GUB 7066|65 GUB 7060|65 GUW 7060|65 GUT 7060|65 GUB 7062|65 GUB 7065|65 GUT 7077|65 VLX 7020|65 VLX 7010|55 GOB 9099 OLED|65 GOB 9099 OLED|55 GOB 9089 OLED|65 GOB 9089 OLED|32 GFB 6062|32 GFB 6065|32 GFB 6066|32 GFB 6067|32 GFB 6060|32 GFW 6060|32 VLE 6020|32 GFB 6064|32 VLE 6010|40 GFB 6065|40 GFB 6062|40 GFB 6066|40 GFB 6067|40 GFB 6060|40 GFW 6060|40 VLE 6020|40 GFB 6064|40 VLE 6010|43 GFB 6060|43 GFB 6065|43 GFB 6062|43 GFB 6066|43 GFB 6067|43 GFW 6060|43 VLE 6020|43 GFB 6064|43 VLE 6010|43UHDEGA|49UHDEGA|55UHDEGA|55UHDNGA|65UHDNGA|55UHDOGA|65UHDOGA|32FHDCGA|40FHDCGA|43FHDCGA)$"));
                    builder2.bo(cd("^(Onida)$", "^(32HIF|43FIF)$"));
                    builder2.bo(cd("^(Anker)$", "^AK-D3000111$"));
                    builder2.bo(cd("^(JVC)$", "^(LT-40CF890|LT-49CF890|LT-55CF890)$"));
                    builder2.bo(cd("\\s*", "^(TiVo_DCX960)$"));
                    builder2.bo(cd("\\s*", "^(Totalplay_DIW350 HD TP)$"));
                    builder2.bo(cd("\\s*", "^(NEOBOX)$"));
                }
                if ("up".equals(a)) {
                    builder2.bo(cd("^(?i)samsung.*", "(?i)(^(?!(UN32M4))(\\bU\\w{1}(\\d{2})[KM].*\\b))"));
                    builder2.bo(cd("^(?i)sony.*", "(?i)(blu-ray disc player|Sony_KD-.*)"));
                    builder2.bo(cd("^(?i)echostar.*", "(?i)(\\bXiP\\d{3}\\b)"));
                    builder3.bo(cd("^(?i)samsung.*", "(?i)(^(?!(UN32M4))(\\bQN.*M\\b|\\bU\\w{1}(\\d{2})[EKM].*\\b))"));
                    builder3.bo(cd("^(?i)vizio.*", "(?i)([DE].*-\\w{2}|\\b.*_A0\\b)"));
                    builder3.bo(cd("^(?i)google.*", "(?i)(\\beureka dongle\\b)"));
                    builder3.bo(cd("^(?i)compal.*", ".*"));
                    builder3.bo(cd("^(?i)makena.*", ".*"));
                    builder3.bo(cd("^(?i)mtc.*", ".*"));
                    builder3.bo(cd("^(?i)sony.*", "(?i)(ps3|bravia.*|internet tv)"));
                    builder3.bo(cd("^(?i)lge.*", "(?i)(LG Google TV.*)"));
                }
                b = afgh.t(builder2.build(), amgz2, builder3.build());
            }
            this.b = b;
        }
        this.c = new aefs((byte[])null, (byte[])null, (byte[])null, null);
    }
    
    public aapu(final Context a) {
        this.a = a;
        this.c = a.getSystemService("notification");
        this.b = new HashSet();
        try {
            tgj.n(a, "OfflineNotifications", a.getString(2132018882));
        }
        catch (final Resources$NotFoundException ex) {}
    }
    
    public aapu(final Context b, final aaec c, final afgh a, final byte[] array) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aapu(final Context context, final acig acig, final acqv acqv, final xjl xjl, final veh veh, final Executor executor, final aefs aefs, final wvq wvq, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = new HashMap();
        context.getClass();
        acig.getClass();
        acqv.getClass();
        xjl.getClass();
        veh.getClass();
        executor.getClass();
        aefs.getClass();
        final acli acli = new acli();
        ((acmh)acli).f(amkv.class, (acmf)new kfw(context, acig, acqv, xjl, veh, executor, wvq, 4, (byte[])null, (byte[])null, (byte[])null));
        final acmm j = aefs.J((acmh)acli);
        this.a = j;
        final acmr b = new acmr();
        this.b = b;
        final acmm acmm = j;
        j.h((acla)b);
    }
    
    public aapu(final Context c, final acxo a, final veh b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aapu(final Context c, final afxj b, final qrk a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aapu(final Context a, final ImageView b, final acig c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aapu(final Context b, final CreatorEndscreenOverlayPresenter a, final vbs c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public aapu(final Context b, final uza c, final uym a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aapu(final Context b, final vbs c, final znq a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aapu(final Context c, final byte[] array) {
        this.b = new abi();
        this.c = c;
        this.a = c.getSharedPreferences("com.google.android.gms.appid", 0);
        final Context context = c;
        final File file = new File(agy.c(c), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !this.bs()) {
                this.bq();
            }
        }
        catch (final IOException ex) {}
    }
    
    public aapu(final Context c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = c.getContentResolver();
        this.a = c.getSystemService("storage");
    }
    
    public aapu(final SharedPreferences a, final mtf c, final byte[] array, final byte[] array2) {
        this.a = a;
        this.c = c;
        this.b = new HashMap();
    }
    
    public aapu(final arwr c, final arze a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aapu(final arzb a, final vbs b, final vbs c, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aapu(final asdz asdz, final byte[] array) {
        this.b = asdz.c;
        this.c = asdz.a;
        this.a = asdz.b;
    }
    
    public aapu(final atnb a) {
        this.c = new Object();
        this.b = new HashMap();
        this.a = a;
    }
    
    public aapu(final atnb c, final atnb b, final atnb a) {
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public aapu(final atnb c, final atnb a, final atnb b, final byte[] array) {
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aapu(final atnb c, final atnb b, final atnb a, final byte[] array, final byte[] array2) {
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public aapu(final atnb c, final atnb a, final atnb b, final byte[] array, final byte[] array2, final byte[] array3) {
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aapu(final atnb c, final atnb a, final atnb b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aapu(final atnb b, final atnb c, final atnb a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        b.getClass();
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aapu(final atnb a, final atnb c, final atnb b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final char[] array5) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
    }
    
    public aapu(final atnb b, final atnb c, final atnb a, final byte[] array, final byte[] array2, final byte[] array3, final char[] array4) {
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
    }
    
    public aapu(final atnb b, final atnb a, final atnb c, final byte[] array, final byte[] array2, final char[] array3) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public aapu(final atnb b, final atnb a, final atnb c, final byte[] array, final byte[] array2, final char[] array3, final byte[] array4) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public aapu(final atnb c, final atnb b, final atnb a, final byte[] array, final byte[] array2, final char[] array3, final char[] array4) {
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public aapu(final atnb b, final atnb a, final atnb c, final byte[] array, final byte[] array2, final int[] array3) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public aapu(final atnb c, final atnb a, final atnb b, final byte[] array, final byte[] array2, final short[] array3) {
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aapu(final atnb c, final atnb a, final atnb b, final byte[] array, final char[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aapu(final atnb b, final atnb c, final atnb a, final byte[] array, final char[] array2, final byte[] array3) {
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.a = a;
    }
    
    public aapu(final atnb a, final atnb b, final atnb c, final byte[] array, final char[] array2, final char[] array3) {
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public aapu(final atnb a, final atnb c, final atnb b, final byte[] array, final int[] array2) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        this.b = b;
    }
    
    public aapu(final atnb c, final atnb b, final atnb a, final byte[] array, final short[] array2) {
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public aapu(final atnb c, final atnb a, final atnb b, final byte[] array, final short[] array2, final byte[] array3) {
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public aapu(final atnb b, final atnb c, final atnb a, final char[] array) {
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
    }
    
    public aapu(final atnb c, final atnb a, final atnb b, final char[] array, final byte[] array2) {
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aapu(final atnb c, final atnb b, final atnb a, final char[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public aapu(final atnb b, final atnb a, final atnb c, final char[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public aapu(final atnb b, final atnb c, final atnb a, final char[] array, final byte[] array2, final char[] array3) {
        b.getClass();
        this.b = b;
        this.c = c;
        a.getClass();
        this.a = a;
    }
    
    public aapu(final atnb b, final atnb c, final atnb a, final char[] array, final char[] array2) {
        b.getClass();
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aapu(final atnb b, final atnb a, final atnb c, final char[] array, final char[] array2, final byte[] array3) {
        b.getClass();
        this.b = b;
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public aapu(final atnb c, final atnb a, final atnb b, final char[] array, final short[] array2) {
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aapu(final atnb c, final atnb b, final atnb a, final int[] array) {
        c.getClass();
        this.c = c;
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public aapu(final atnb b, final atnb c, final atnb a, final short[] array) {
        b.getClass();
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aapu(final atnb c, final atnb a, final atnb b, final short[] array, final byte[] array2) {
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aapu(final atnb a, final atnb c, final atnb b, final boolean[] array) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
    }
    
    public aapu(final atnb c, final atnb a, final String b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aapu(final atnb c, final ypu b, final aapu a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aapu(final auk auk, final afci c, final afci afci, final aezw b) {
        adme.U(auk.a() == auj.b, "FutureCallbackRegistry must be created in onCreate of the Activity/Fragment.");
        this.c = c;
        this.b = b;
        this.a = adzw.M((afci)new bnl(this, afci, 20, null, null, null));
        auk.b((auo)new FutureCallbackRegistry$FutureListenerLifecycleObserver(this, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public aapu(final aumm a, final auml c) {
        this.a = a;
        this.c = c;
        this.b = null;
    }
    
    public aapu(final Object b, final Object c, final Object a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aapu(final String a) {
        this.a = a;
        this.b = new lcs(this, 4, (byte[])null, (byte[])null, (byte[])null);
        this.c = new HashMap();
    }
    
    public aapu(final Method c, final Method b, final Method a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aapu(final List b, final byte[] a, final aaki c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public aapu(final List c, final byte[] b, final aaki a, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aapu(final Map b, final Map a) {
        this.b = b;
        this.a = a;
        this.c = new abp();
    }
    
    public aapu(final Map c, final Map a, final agls b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aapu(final Set b) {
        this.a = new Random();
        this.b = b;
        this.c = new ArrayList(2);
    }
    
    public aapu(final Set c, final List b, final List a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aapu(final Executor b, final med c, final Runnable a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aapu(final oco a) {
        this.a = a;
        this.c = new HashMap();
        this.b = new LruCache(5);
    }
    
    public aapu(final tgi tgi, final afgm b, final tnz a) {
        this.a = a;
        this.b = b;
        aote c;
        if ((c = tgi.f().g) == null) {
            c = aote.a;
        }
        this.c = c;
    }
    
    public aapu(final thg b, final vyb c, final vyc a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aapu(final twp a, final abxj b, final twp c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aapu(final udj a, final ufy b, final aefs c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aapu(final ugh a, final Handler c, final xaa b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aapu(final unu b) {
        this.c = new int[2];
        this.b = b;
        this.a = new Rect();
    }
    
    public aapu(final uwh b, final vxu vxu, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.c = vxu.b;
        this.a = new ArrayDeque();
    }
    
    public aapu(final uwp b, final boolean b2) {
        this.c = new HashSet();
        this.a = new ArrayDeque();
        this.ao(b, b2);
        this.b = b;
    }
    
    public aapu(final vbo vbo, final oqz c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = new abi();
        airq airq;
        if ((airq = vbo.b()) == null) {
            airq = airq.a;
        }
        aosy aosy;
        if ((aosy = airq.s) == null) {
            aosy = aosy.a;
        }
        ajhh b;
        if ((b = aosy.F) == null) {
            b = ajhh.a;
        }
        this.b = b;
        this.c = c;
    }
    
    public aapu(final xaa c, final zkt b, final vbs a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aapu(final xbg a) {
        this.a = a;
        this.c = new HashSet();
        this.b = new HashSet();
    }
    
    public aapu(final xxy b, final abkq a) {
        this.b = b;
        this.a = a;
        this.c = new aamg(this, null);
    }
    
    public aapu(final zeo c, final tkq a, final oco b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aapu(final ztz b, final yhr a, final Executor c, final byte[] array) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public aapu(final zub a, final ztb c, final tkq b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aapu(final zxl a, final atnb b) {
        this.a = a;
        this.b = b;
        this.c = new ArrayList();
    }
    
    public aapu(final byte[] array) {
        this.a = new ReentrantReadWriteLock(false);
        this.b = new HashMap();
        this.c = new AtomicInteger();
        new ArrayList();
    }
    
    public aapu(final byte[] b, final String a, final List c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public aapu(final byte[] a, final String b, final List c, final byte[] array) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aapu(final byte[] array, final byte[] array2) {
        this(new long[10], new long[10], new long[10]);
    }
    
    public aapu(final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = new Random();
        this.c = new AtomicInteger();
        this.a = new AtomicInteger();
    }
    
    public aapu(final long[] b, final long[] c, final long[] a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public static zdk E(Throwable cause, final long n, String string) {
        Throwable c = cause;
        if (cause instanceof bln) {
            final Throwable t = cause.getCause();
            c = cause;
            if (t != null) {
                c = t;
            }
        }
        if (c instanceof yqz) {
            final yqz c2 = (yqz)c;
            final yra a = c2.a;
            final Throwable cause2 = c2.getCause();
            final boolean c3 = c2.c;
            final zdk zdk = new zdk(zdj.e, "", n, (Throwable)c2);
            zdk zdk2;
            if (a != null) {
                final zdi zdi = new zdi("auth", n);
                zdi.a = zdj.e;
                zdi.c = (Throwable)c2;
                zdi.b((Object)a);
                zdk2 = zdi.a();
            }
            else if (cause2 instanceof dbm) {
                zdk2 = ych.A(n, cause2, c3, zdk);
            }
            else {
                zdk2 = zdk;
                if (cause2 instanceof vnz) {
                    cause = cause2.getCause();
                    if (cause instanceof dbm) {
                        return ych.A(n, cause, c3, zdk);
                    }
                    zdk2 = zdk;
                }
            }
            return zdk2;
        }
        final boolean b = c instanceof MediaDrm$MediaDrmStateException;
        String s = "unavailable";
        if (b) {
            final String concat = "d.".concat(String.valueOf(((MediaDrm$MediaDrmStateException)c).getDiagnosticInfo()));
            if (string == null) {
                string = concat;
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(";");
                sb.append(concat);
                string = sb.toString();
            }
        }
        else if (!(c instanceof ResourceBusyException)) {
            s = "keyerror";
        }
        final zdi zdi2 = new zdi(s, n);
        zdi2.c = c;
        zdi2.a = zdj.e;
        zdi2.b = string;
        return zdi2.a();
    }
    
    public static zdk H(final zdj a, final yhv yhv, final VideoStreamingData videoStreamingData, final long n) {
        String b;
        final String s = b = zcs.c((Throwable)yhv, (boolean)(1 != 0), 6);
        if (videoStreamingData != null) {
            if (videoStreamingData.p.isEmpty() && videoStreamingData.q.isEmpty()) {
                b = String.valueOf(s).concat(";c.invalidStreamingData");
            }
            else {
                final String br = yhe.br(videoStreamingData.x());
                final String m = VideoStreamingData.m(videoStreamingData.p);
                final String i = VideoStreamingData.m(videoStreamingData.q);
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(";o.");
                sb.append(br);
                sb.append(";prog.");
                sb.append(m);
                sb.append(";adap.");
                sb.append(i);
                b = sb.toString();
            }
        }
        final zdi zdi = new zdi("fmt.noneavailable", n);
        zdi.b = b;
        zdi.a = a;
        return zdi.a();
    }
    
    public static zdk I(final blo blo, final long n) {
        final int a = blo.a;
        final Throwable cause = blo.getCause();
        final StringBuilder sb = new StringBuilder("widevine;exo.2;reason.");
        sb.append(a);
        if (cause != null) {
            sb.append(";exception.");
            sb.append(zcs.b(cause));
        }
        return new zdk(zdj.e, "unimplemented", n, sb.toString());
    }
    
    public static String J(final bnr bnr, final bnw bnw) {
        if (bnr != null) {
            final bbr b = bnr.b;
            if (b != null && bnw != null) {
                final ayh c = bnw.c;
                if (c != null) {
                    final long g = b.g;
                    final long h = b.h;
                    final long c2 = bnr.c;
                    final int b2 = bnw.b;
                    final String c3 = c.c;
                    final StringBuilder sb = new StringBuilder("pos.");
                    sb.append(g);
                    sb.append(";len.");
                    sb.append(h);
                    sb.append(";loaded.");
                    sb.append(c2);
                    sb.append(";trk.");
                    sb.append(b2);
                    sb.append(";fmt.");
                    sb.append(c3);
                    sb.append(";");
                    return sb.toString();
                }
            }
        }
        return "";
    }
    
    public static String R(final String s) {
        return String.format("INTERACTIONLOGGINGBUG->%s_MISSING_ATTACH", s);
    }
    
    public static uzf Y(final int n, final int n2, final int n3, uzf uzf) {
        if (n3 >= n / 2) {
            if (n3 > (n2 + n) / 2) {
                uzf = uzf.c;
            }
            else {
                uzf = uzf.b;
            }
        }
        return uzf;
    }
    
    public static final afbh Z(final boolean b, final afhk afhk) {
        if (!b) {
            return afbh.k(uzf.b);
        }
        if (afhk.size() == 1) {
            if (afhk.contains(ajri.c)) {
                return afbh.k(uzf.a);
            }
            if (afhk.contains(ajri.b)) {
                return afbh.k(uzf.b);
            }
        }
        return afag.a;
    }
    
    public static int af(final uwp uwp) {
        final uwd b = uwp.b;
        if (b.B() == null || (b.B().c & 0x40) == 0x0) {
            return 1;
        }
        ajrm ajrm;
        if ((ajrm = b.B().i) == null) {
            ajrm = ajrm.a;
        }
        int ab;
        if ((ab = aexq.ab(ajrm.c)) == 0) {
            ab = 1;
        }
        if (ab - 1 != 2) {
            return 1;
        }
        return 2;
    }
    
    public static float as(final EditableVideo editableVideo) {
        final VideoMetaData b = editableVideo.b;
        final float n = (float)b.f;
        float ck;
        if (n != 0.0f && n != 180.0f) {
            ck = ck(editableVideo);
        }
        else {
            ck = (float)b.e;
        }
        return ck;
    }
    
    public static float at(final EditableVideo editableVideo) {
        final VideoMetaData b = editableVideo.b;
        final float n = (float)b.f;
        float ck;
        if (n != 0.0f && n != 180.0f) {
            ck = (float)b.e;
        }
        else {
            ck = ck(editableVideo);
        }
        return ck;
    }
    
    public static aljw av(final EditableVideo editableVideo) {
        final ahcr builder = ((ahcz)aljw.a).createBuilder();
        final long c = editableVideo.b.k();
        builder.copyOnWrite();
        final aljw aljw = (aljw)builder.instance;
        aljw.b |= 0x1;
        aljw.c = c;
        final long d = editableVideo.b.j();
        builder.copyOnWrite();
        final aljw aljw2 = (aljw)builder.instance;
        aljw2.b |= 0x2;
        aljw2.d = d;
        if (editableVideo.a() != 0.0) {
            final float g = (float)editableVideo.a();
            builder.copyOnWrite();
            final aljw aljw3 = (aljw)builder.instance;
            aljw3.b |= 0x10;
            aljw3.g = g;
        }
        if (editableVideo.d() != 0.0) {
            final float e = (float)editableVideo.d();
            builder.copyOnWrite();
            final aljw aljw4 = (aljw)builder.instance;
            aljw4.b |= 0x4;
            aljw4.e = e;
        }
        if (editableVideo.b() != 0.0) {
            final float h = (float)editableVideo.b();
            builder.copyOnWrite();
            final aljw aljw5 = (aljw)builder.instance;
            aljw5.b |= 0x20;
            aljw5.h = h;
        }
        if (editableVideo.c() != 0.0) {
            final float f = (float)editableVideo.c();
            builder.copyOnWrite();
            final aljw aljw6 = (aljw)builder.instance;
            aljw6.b |= 0x8;
            aljw6.f = f;
        }
        return (aljw)builder.build();
    }
    
    public static final boolean aw(final EditableVideo editableVideo) {
        return editableVideo.b() != 0.0 || editableVideo.d() != 0.0 || editableVideo.c() != 0.0 || editableVideo.a() != 0.0;
    }
    
    public static boolean bF(final Uri uri) {
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
    
    public static boolean bG() {
        return Build$VERSION.SDK_INT >= 29 && !Environment.isExternalStorageLegacy();
    }
    
    public static int bH(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return 1;
        }
        if ("unknown".equals(s)) {
            return 4;
        }
        if (!"mounted".equals(s) && !"mounted_ro".equals(s)) {
            return 3;
        }
        return 2;
    }
    
    public static void bR(final TextView textView, final aies aies) {
        if (aies == null && TextUtils.isEmpty((CharSequence)null)) {
            textView.setVisibility(8);
        }
    }
    
    public static asdz bo() {
        return new asdz((byte[])null);
    }
    
    static String bt(final String s) {
        return s.concat("|S|cre");
    }
    
    public static String by(final AccountId accountId) {
        final String separator = File.separator;
        final int a = accountId.a();
        final StringBuilder sb = new StringBuilder("accounts");
        sb.append(separator);
        sb.append(a);
        return sb.toString();
    }
    
    public static void ca(final aapu aapu, final aheu aheu) {
        aghv.b((long[])aapu.b, (long[])((aapu)aheu.b).b, (long[])aheu.a);
        final Object c = aapu.c;
        final aapu aapu2 = (aapu)aheu.b;
        aghv.b((long[])c, (long[])aapu2.c, (long[])aapu2.a);
        aghv.b((long[])aapu.a, (long[])((aapu)aheu.b).a, (long[])aheu.a);
    }
    
    private final boolean cb(final VideoStreamingData videoStreamingData) {
        if (videoStreamingData == null) {
            return false;
        }
        final long d = ((oco)this.b).d();
        return !videoStreamingData.t(d) && d - videoStreamingData.g < TimeUnit.SECONDS.toMillis(((zcx)this.c).w().ab);
    }
    
    private final void cc() {
        final Iterator iterator = ((HashMap)this.c).entrySet().iterator();
        while (iterator.hasNext()) {
            if (((oco)this.a).d() - ((Map.Entry<K, aczv>)iterator.next()).getValue().a > 3600000L) {
                iterator.remove();
            }
        }
    }
    
    private static final amgy cd(final String d, final String e) {
        final ahcr builder = ((ahcz)amgy.a).createBuilder();
        builder.copyOnWrite();
        final amgy amgy = (amgy)builder.instance;
        amgy.c = 2;
        amgy.b |= 0x1;
        builder.copyOnWrite();
        final amgy amgy2 = (amgy)builder.instance;
        amgy2.b |= 0x2;
        amgy2.d = d;
        builder.copyOnWrite();
        final amgy amgy3 = (amgy)builder.instance;
        amgy3.b |= 0x4;
        amgy3.e = e;
        return (amgy)builder.build();
    }
    
    private final boolean ce(final lrn lrn) {
        return ((Set)this.c).contains(ci(lrn));
    }
    
    private static final xai cf(final apry apry) {
        return new xai(apry.d, apry.f);
    }
    
    private static final boolean cg(final apry apry) {
        return apry.c.d() > 0;
    }
    
    private static final lrn ch(final apry apry) {
        lrn a;
        try {
            a = (lrn)ahcz.parseFrom((ahcz)lrn.a, apry.c, ExtensionRegistryLite.getGeneratedRegistry());
        }
        catch (final ahds ahds) {
            a = lrn.a;
        }
        return a;
    }
    
    private static final String ci(final lrn lrn) {
        lrm lrm;
        if ((lrm = lrn.d) == null) {
            lrm = lrm.a;
        }
        final long c = lrm.c;
        lrm lrm2;
        if ((lrm2 = lrn.d) == null) {
            lrm2 = lrm.a;
        }
        final int d = lrm2.d;
        lrm lrm3;
        if ((lrm3 = lrn.d) == null) {
            lrm3 = lrm.a;
        }
        return Integer.toString(Objects.hash(new Object[] { c, d, lrm3.e }));
    }
    
    private final void cj(final String s, final apry apry) {
        R(s);
        xaj.j((xbg)this.a);
        xaj.k(apry);
    }
    
    private static float ck(final EditableVideo editableVideo) {
        final VideoMetaData b = editableVideo.b;
        return b.d * b.g;
    }
    
    private final void cl(final aibs aibs) {
        if (aibs != null) {
            final Object a = this.a;
            if (a != null) {
                ((acsj)a).J((Object)aibs);
            }
        }
    }
    
    private static int cm(final Object o) {
        if (o instanceof aiuz) {
            final int y = aewr.Y(((aiuz)o).k);
            if (y == 0) {
                return 1;
            }
            return y;
        }
        else {
            if (o instanceof accu) {
                return cn(((accu)o).a);
            }
            if (o instanceof ajon) {
                return cn((ajon)o);
            }
            return 1;
        }
    }
    
    private static int cn(final ajon ajon) {
        ajoo ajoo;
        if ((ajoo = ajon.d) == null) {
            ajoo = ajoo.a;
        }
        int y;
        if ((y = aewr.Y(((ajom)((ahcu)ajoo).rx((ahci)ajom.b)).c)) == 0) {
            y = 1;
        }
        return y;
    }
    
    private final void co(final int n) {
        final acxp j = ((acxo)this.a).j();
        j.k(((Context)this.c).getString(n));
        j.i(-1);
        j.h(false);
        ((acxo)this.a).n(j.b());
    }
    
    private static final String cp(final String s, final String s2, final String s3) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("|T|");
        sb.append(s2);
        sb.append("|");
        sb.append(s3);
        return sb.toString();
    }
    
    public static ContentValues l(final agr agr) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("id", (String)agr.e);
        contentValues.put("offline_channel_data_proto", ((ahbc)agr.d).toByteArray());
        return contentValues;
    }
    
    public static void s(final Throwable t) {
        tut.d("Failed to clear delayedEventSchema.", t);
    }
    
    public static void t(final Throwable t) {
        tut.d("Failed to update delayed event PDS", t);
    }
    
    public static void u(final Throwable t) {
        tut.d("Failed to update last capture time in PDS", t);
    }
    
    public static void v(final Throwable t) {
        tut.d("Failed to update DelayedEventMetricsStore", t);
    }
    
    public final void A(final aowb aowb) {
        ((ImageView)this.b).setImageDrawable((Drawable)null);
        if (((ImageView)this.b).getWidth() == 0) {
            ((ImageView)this.b).addOnLayoutChangeListener((View$OnLayoutChangeListener)new zjh(this, aowb, 0, (byte[])null, (byte[])null, (byte[])null));
            return;
        }
        final Uri o = aamz.O(aowb, ((ImageView)this.b).getWidth(), ((ImageView)this.b).getHeight());
        if (o != null) {
            ((acig)this.c).f((ImageView)this.b, o);
            return;
        }
        ((ImageView)this.b).setImageDrawable((Drawable)new ColorDrawable(tqf.cx((Context)this.a, 2130970860).orElse(0)));
    }
    
    public final void B(final afbh afbh) {
        if (!afbh.h()) {
            return;
        }
        ((ImageView)this.b).setImageBitmap((Bitmap)afbh.c());
    }
    
    public final zhv C(final zhu zhu, final zhs zhs, final boolean b) {
        final xab xab = (xab)((atnb)this.c).a();
        xab.getClass();
        final zia zia = (zia)((atnb)this.a).a();
        zia.getClass();
        final adhd adhd = (adhd)((atnb)this.b).a();
        adhd.getClass();
        zhu.getClass();
        zhs.getClass();
        return new zhv(xab, zia, adhd, zhu, zhs, b, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final zei D(final xbt xbt) {
        final oco oco = (oco)((atnb)this.c).a();
        oco.getClass();
        final zeo zeo = (zeo)((atnb)this.a).a();
        zeo.getClass();
        final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)((atnb)this.b).a();
        scheduledExecutorService.getClass();
        return new zei(xbt, oco, zeo, scheduledExecutorService);
    }
    
    public final zdk F(final IOException ex) {
        return this.G(zdj.a, ex, null, null, null, 0L, false, false);
    }
    
    public final zdk G(final zdj a, final IOException c, final bnr bnr, final bnw bnw, final VideoStreamingData videoStreamingData, final long n, final boolean b, final boolean b2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(J(bnr, bnw));
        final Throwable cause = c.getCause();
        final boolean b3 = c instanceof zep;
        final boolean b4 = false;
        int n2 = 0;
        String s = null;
        Label_0933: {
            if (b3) {
                final zep zep = (zep)c;
                final String a2 = zep.a(this.cb(videoStreamingData));
                n2 = (b4 ? 1 : 0);
                s = a2;
                if (!zep.b().isEmpty()) {
                    sb.append(zep.b());
                    sb.append(";");
                    n2 = (b4 ? 1 : 0);
                    s = a2;
                }
            }
            else if (c instanceof EOFException) {
                final boolean at = ((zcx)this.c).at(ajta.e);
                final String s2 = "player.eof";
                n2 = (b4 ? 1 : 0);
                s = s2;
                if (at) {
                    n2 = 1;
                    s = s2;
                }
            }
            else if (c instanceof zdo) {
                if (b) {
                    s = "offline.partial.nocontent";
                    n2 = (b4 ? 1 : 0);
                }
                else {
                    s = "offline.nocontent";
                    n2 = (b4 ? 1 : 0);
                }
            }
            else if (c instanceof zdn) {
                s = "net.accessdisallowed";
                n2 = (b4 ? 1 : 0);
            }
            else if (c instanceof bca) {
                final String s3 = "file";
                n2 = (b4 ? 1 : 0);
                s = s3;
                if (cause != null) {
                    sb.append("c.");
                    sb.append(cause.getClass().getSimpleName());
                    sb.append(";m.");
                    sb.append(cause.getMessage());
                    sb.append(";");
                    n2 = (b4 ? 1 : 0);
                    s = s3;
                }
            }
            else {
                Label_0362: {
                    if (b2) {
                        if (c instanceof bcf) {
                            sb.append(((bcf)c).d);
                            sb.append(";");
                        }
                        else if (!(c instanceof azb)) {
                            break Label_0362;
                        }
                        s = "fmt.unparseable";
                        n2 = (b4 ? 1 : 0);
                        break Label_0933;
                    }
                }
                if (c instanceof bce) {
                    final bce bce = (bce)c;
                    final Object a3 = this.a;
                    String s4 = null;
                    Label_0716: {
                        if (a3 != null && !((tkq)a3).o()) {
                            s4 = "net.unavailable";
                        }
                        else if (bce instanceof mao) {
                            sb.append("type.loadtimeout;");
                            s4 = "net.timeout";
                        }
                        else {
                            if (bce instanceof bcg) {
                                final bcg bcg = (bcg)bce;
                                final int d = bcg.d;
                                sb.append("rc.");
                                sb.append(d);
                                sb.append(";");
                                if (this.K(bcg, videoStreamingData)) {
                                    s4 = "staleconfig";
                                    break Label_0716;
                                }
                            }
                            else if (bce instanceof zcy) {
                                final int e = ((zcy)bce).e;
                                sb.append("rc.");
                                sb.append(e);
                                sb.append(";");
                                if (e == 204) {
                                    s4 = "net.nocontent";
                                    break Label_0716;
                                }
                            }
                            else if (bce instanceof ylp) {
                                final int d2 = ((ylp)bce).d;
                                if (d2 == 1) {
                                    s4 = "ump.badmediaheader";
                                    break Label_0716;
                                }
                                if (d2 == 2) {
                                    s4 = "ump.badmediaheaderid";
                                    break Label_0716;
                                }
                                if (d2 == 3) {
                                    s4 = "ump.badpointer";
                                    break Label_0716;
                                }
                                if (d2 != 4) {
                                    s4 = "ump.unknown";
                                    break Label_0716;
                                }
                                s4 = "ump.extratrailingdata";
                                break Label_0716;
                            }
                            else {
                                final Throwable cause2 = bce.getCause();
                                final int c2 = bce.c;
                                if (c2 != 1) {
                                    if (c2 != 2) {
                                        s4 = "net.closed";
                                        break Label_0716;
                                    }
                                    if (cause2 instanceof SocketTimeoutException) {
                                        s4 = "net.read.timeout";
                                        break Label_0716;
                                    }
                                    s4 = "net.read";
                                    break Label_0716;
                                }
                                else {
                                    if (cause2 instanceof UnknownHostException) {
                                        s4 = "net.dns";
                                        break Label_0716;
                                    }
                                    if (cause2 instanceof SocketTimeoutException) {
                                        s4 = "net.connect.timeout";
                                        break Label_0716;
                                    }
                                    s4 = "net.connect";
                                    break Label_0716;
                                }
                            }
                            s4 = "net.badstatus";
                        }
                    }
                    final bbr b5 = bce.b;
                    if (b5 != null) {
                        final Uri a4 = b5.a;
                        if (a4 != null) {
                            final String queryParameter = a4.getQueryParameter("rn");
                            if (queryParameter != null) {
                                sb.append("rn.");
                                sb.append(queryParameter);
                                sb.append(";");
                            }
                            sb.append("shost.");
                            sb.append(b5.a.getHost());
                            sb.append(";");
                        }
                    }
                    n2 = (b4 ? 1 : 0);
                    s = s4;
                    if (bce instanceof bcv) {
                        final int d3 = ((bcv)bce).d;
                        n2 = (b4 ? 1 : 0);
                        s = s4;
                        if (d3 != 0) {
                            sb.append("cnconstat.");
                            sb.append(d3);
                            sb.append(";");
                            n2 = (b4 ? 1 : 0);
                            s = s4;
                        }
                    }
                }
                else if (c instanceof bmw) {
                    s = "qoe.livewindow";
                    n2 = (b4 ? 1 : 0);
                }
                else if (c instanceof zcn) {
                    s = "policy.app";
                    n2 = (b4 ? 1 : 0);
                }
                else {
                    s = "player.exception";
                    n2 = (b4 ? 1 : 0);
                }
            }
        }
        if (cause instanceof NetworkException) {
            final NetworkException ex = (NetworkException)cause;
            final StringBuilder sb2 = new StringBuilder("info.cronet;;nerrcode.");
            sb2.append(ex.getErrorCode());
            sb2.append(";cerrcode.");
            sb2.append(ex.getCronetInternalErrorCode());
            if (ex instanceof QuicException) {
                sb2.append(";qerrcode.");
                sb2.append(((QuicException)ex).getQuicDetailedErrorCode());
            }
            sb.append(sb2.toString());
            sb.append(";");
        }
        int length = sb.length();
        if (length > 0) {
            --length;
            if (sb.charAt(length) == ';') {
                sb.deleteCharAt(length);
            }
        }
        final zdi zdi = new zdi(s, n);
        zdi.a = a;
        zdi.c = c;
        String string;
        if (sb.length() > 0) {
            string = sb.toString();
        }
        else {
            string = null;
        }
        zdi.b = string;
        final zdk a5 = zdi.a();
        if (n2 != 0) {
            a5.h();
        }
        return a5;
    }
    
    public final boolean K(final bcg bcg, final VideoStreamingData videoStreamingData) {
        final int d = bcg.d;
        return (d == 400 || d == 410 || d == 416 || d == 403 || d == 404) && videoStreamingData != null && !this.cb(videoStreamingData);
    }
    
    public final ypb L() {
        monitorenter(this);
        try {
            this.cc();
            final Iterator iterator = ((HashMap)this.c).keySet().iterator();
            String s = null;
            aczv aczv = null;
            while (iterator.hasNext()) {
                final String s2 = (String)iterator.next();
                if (!TextUtils.equals((CharSequence)s2, (CharSequence)null)) {
                    final aczv aczv2 = ((HashMap)this.c).get(s2);
                    final Object a = this.a;
                    if (aczv2 == null && aczv == null) {
                        continue;
                    }
                    Label_0214: {
                        if (aczv2 == null || aczv != null) {
                            if (aczv2 == null) {
                                continue;
                            }
                            final boolean h = yhe.h(aczv2, (oco)a);
                            final boolean h2 = yhe.h(aczv, (oco)a);
                            double n;
                            double n2;
                            if (h && h2) {
                                n = ((ymr)aczv.b).a;
                                n2 = ((ymr)aczv2.b).a;
                            }
                            else {
                                if (h) {
                                    break Label_0214;
                                }
                                if (h2) {
                                    continue;
                                }
                                n = ((ymr)aczv.b).a;
                                n2 = ((ymr)aczv2.b).a;
                            }
                            if ((int)(n - n2) <= 0) {
                                continue;
                            }
                        }
                    }
                    aczv = (aczv)((HashMap)this.c).get(s2);
                    s = s2;
                }
            }
            if (s != null && aczv != null) {
                final ypb ypb = new ypb(s, (int)((ymr)aczv.b).a, (Uri)aczv.c);
                monitorexit(this);
                return ypb;
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void M() {
        synchronized (this) {
            ((HashMap)this.c).clear();
        }
    }
    
    public final void N(final String s, final double a) {
        monitorenter(this);
        if (s == null) {
            monitorexit(this);
            return;
        }
        try {
            this.cc();
            aczv aczv;
            if ((aczv = ((HashMap)this.c).get(s)) == null) {
                aczv = new aczv((Uri)((LruCache)this.b).get((Object)s));
                ((HashMap)this.c).put(s, aczv);
            }
            aczv.a = ((oco)this.a).d();
            final Object b = aczv.b;
            final double a2 = ((ymr)b).a;
            if (a2 < 0.0) {
                ((ymr)b).a = a;
                return;
            }
            ((ymr)b).a = a2 * 0.8500000238418579 + a * 0.1499999761581421;
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final yho O(final PlayerResponseModel playerResponseModel, final long n, final long n2, final yhp yhp) {
        if (playerResponseModel.n() != null && !playerResponseModel.n().u()) {
            if (n2 > 0L) {
                final ArrayList list = new ArrayList(2);
                try {
                    final yht b = ((yhr)this.a).b(playerResponseModel.n(), playerResponseModel.m(), playerResponseModel.m().aA(), (yhs)null, Integer.MAX_VALUE);
                    final FormatStreamModel[] c = b.c;
                    if (c.length > 0 && !c[0].J()) {
                        list.add(c[0]);
                    }
                    final FormatStreamModel d = b.d;
                    if (d != null && !d.J()) {
                        list.add(d);
                    }
                }
                catch (final yhv yhv) {}
                if (!list.isEmpty()) {
                    adme.K(list.isEmpty() ^ true);
                    final yho yho = new yho((ztz)this.b, playerResponseModel, (List)list, n, n2, yhp, (byte[])null);
                    ((Executor)this.c).execute(yho.g);
                    return yho;
                }
                yhp.j();
            }
        }
        return null;
    }
    
    public final ylg P(final bch bch, final asbu asbu) {
        return new ylg(bch, asbu, (oco)((atnb)this.c).a(), (ypu)this.b, (aapu)this.a, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final boolean Q(int n, final xgi xgi) {
        final Iterator<Object> iterator = ((List<Object>)this.b).iterator();
        while (true) {
            int i;
            do {
                final boolean hasNext = iterator.hasNext();
                boolean b = true;
                if (hasNext) {
                    final amgz amgz = iterator.next();
                    if ((i = aqvq.dn(amgz.c)) != 0) {
                        continue;
                    }
                    i = 1;
                }
                else {
                    final amgz amgz = null;
                    if (amgz != null && amgz.d.size() != 0) {
                        for (final amgy amgy : amgz.d) {
                            final Object c = this.c;
                            amgy.getClass();
                            n = amgy.c;
                            final int do1 = aqvq.do(n);
                            if (do1 != 0) {
                                if (do1 != 1) {
                                    final int d = xgi.d;
                                    if ((n = aqvq.do(n)) == 0) {
                                        n = 1;
                                    }
                                    if (d != n) {
                                        continue;
                                    }
                                }
                            }
                            final String a = xgi.a;
                            final String d2 = amgy.d;
                            final aefs aefs = (aefs)c;
                            if (aefs.bc(a, d2) && aefs.bc(xgi.b, amgy.e) && aefs.bc(xgi.c, amgy.f)) {
                                return b;
                            }
                        }
                        b = false;
                        return b;
                    }
                    return false;
                }
            } while (i != n);
            continue;
        }
    }
    
    public final boolean S(final apry apry) {
        if (cg(apry)) {
            final lrn ch = ch(apry);
            if ((ch.b & 0x4) == 0x0) {
                return false;
            }
            if (this.ce(ch)) {
                xaj.j((xbg)this.a);
                xaj.k(apry);
                return false;
            }
            ((Set<String>)this.c).add(ci(ch));
        }
        else {
            ((Set<xai>)this.b).add(cf(apry));
        }
        return true;
    }
    
    public final boolean T(final apry apry, final String s) {
        if (cg(apry)) {
            final lrn ch = ch(apry);
            if ((ch.b & 0x4) == 0x0) {
                return false;
            }
            if (!this.ce(ch)) {
                this.cj(s, apry);
                return false;
            }
            return true;
        }
        else {
            if (!((Set)this.b).contains(cf(apry))) {
                this.cj(s, apry);
                return false;
            }
            return true;
        }
    }
    
    public final wea U(final acrd acrd) {
        final Context context = (Context)((atnb)this.c).a();
        context.getClass();
        acrd.getClass();
        final veh veh = (veh)((atnb)this.b).a();
        veh.getClass();
        return new wea(context, acrd, veh, (atnb)this.a);
    }
    
    public final vna V(final znz znz) {
        if (((vbs)this.c).f(45382829L)) {
            return (vna)((vme)adme.ag((Context)this.b, vme.class, ((znq)this.a).a(znz))).b();
        }
        return (vna)((vmd)aegu.N((Context)this.b, vmd.class)).zs();
    }
    
    public final vda W(final pfb pfb) {
        pfb.getClass();
        final afxj afxj = (afxj)((atnb)this.c).a();
        afxj.getClass();
        return new vda(pfb, afxj, (atnb)this.a, (atnb)this.b);
    }
    
    public final oux X(final ahbt ahbt) {
        ((atnb)this.b).a().getClass();
        final mtf mtf = (mtf)((atnb)this.a).a();
        mtf.getClass();
        ((aron)this.c).a.getClass();
        return new oux(mtf, ahbt, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final ListenableFuture a(final PlaybackStartDescriptor playbackStartDescriptor, final abla abla) {
        xbt b;
        if (abla != null) {
            b = abla.b;
        }
        else {
            b = null;
        }
        return this.c(playbackStartDescriptor, b);
    }
    
    public final void aA(final EditableVideo editableVideo) {
        final ufu au = this.au();
        float b;
        if (au != null) {
            b = au.b();
        }
        else {
            b = 0.5f;
        }
        this.ax(editableVideo, b);
    }
    
    public final int aB() {
        aohe aohe;
        if ((aohe = ((arzb)this.a).f().z) == null) {
            aohe = aohe.a;
        }
        int m;
        if ((m = aohe.m) <= 0) {
            m = 60000;
        }
        return m;
    }
    
    public final int aC() {
        aohe aohe;
        if ((aohe = ((arzb)this.a).f().z) == null) {
            aohe = aohe.a;
        }
        int g;
        if ((g = aohe.g) <= 0) {
            g = 15000;
        }
        return g;
    }
    
    public final int aD() {
        aohe aohe;
        if ((aohe = ((arzb)this.a).f().z) == null) {
            aohe = aohe.a;
        }
        int f;
        if ((f = aohe.f) <= 0) {
            f = 1000;
        }
        return f;
    }
    
    public final boolean aE() {
        return (boolean)((vbs)this.b).l(45358962L).aM();
    }
    
    public final boolean aF() {
        return (boolean)((vbs)this.b).l(45357433L).aM();
    }
    
    public final boolean aG() {
        return (boolean)((vbs)this.c).l(45359847L).aM();
    }
    
    public final boolean aH() {
        return (boolean)((vbs)this.c).l(45377438L).aM();
    }
    
    public final boolean aI() {
        aohe aohe;
        if ((aohe = ((arzb)this.a).f().z) == null) {
            aohe = aohe.a;
        }
        return aohe.e;
    }
    
    public final boolean aJ() {
        return (boolean)((vbs)this.c).l(45378595L).aM();
    }
    
    public final boolean aK() {
        return (boolean)((vbs)this.c).l(45379404L).aM();
    }
    
    public final boolean aL() {
        return (boolean)((vbs)this.c).l(45375552L).aM();
    }
    
    public final boolean aM() {
        return (boolean)((vbs)this.c).l(45384864L).aM();
    }
    
    public final boolean aN() {
        return (boolean)((vbs)this.c).l(45376776L).aM();
    }
    
    public final boolean aO() {
        return (boolean)((vbs)this.b).l(45357030L).aM();
    }
    
    public final boolean aP() {
        aohe aohe;
        if ((aohe = ((arzb)this.a).f().z) == null) {
            aohe = aohe.a;
        }
        return aohe.r;
    }
    
    public final boolean aQ() {
        return (boolean)((vbs)this.c).l(45377077L).aM();
    }
    
    public final boolean aR() {
        aohe aohe;
        if ((aohe = ((arzb)this.a).f().z) == null) {
            aohe = aohe.a;
        }
        return aohe.h;
    }
    
    public final boolean aS() {
        return (boolean)((vbs)this.c).l(45366081L).aM();
    }
    
    public final boolean aT() {
        aohe aohe;
        if ((aohe = ((arzb)this.a).f().z) == null) {
            aohe = aohe.a;
        }
        return aohe.k;
    }
    
    public final boolean aU() {
        return (boolean)((vbs)this.c).l(45380713L).aM();
    }
    
    public final boolean aV() {
        aohe aohe;
        if ((aohe = ((arzb)this.a).f().z) == null) {
            aohe = aohe.a;
        }
        return aohe.t;
    }
    
    public final boolean aW() {
        return (boolean)((vbs)this.c).l(45365062L).aM();
    }
    
    public final boolean aX() {
        return (boolean)((vbs)this.c).l(45366001L).aM();
    }
    
    public final boolean aY() {
        if (!(boolean)((vbs)this.c).l(45367225L).aM()) {
            aohe aohe;
            if ((aohe = ((arzb)this.a).f().z) == null) {
                aohe = aohe.a;
            }
            if (!aohe.j) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean aZ() {
        return (boolean)((vbs)this.c).l(45384028L).aM();
    }
    
    public final int aa() {
        final Iterator iterator = ((ArrayDeque)this.a).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += ((aapu)iterator.next()).ai();
        }
        return n;
    }
    
    public final afbh ab() {
        return afbh.j(((ArrayDeque)this.a).peek()).b((afax)uio.p);
    }
    
    public final afbh ac() {
        final afbh ad = this.ad();
        afbh afbh;
        if (ad.h()) {
            afbh = afbh.k(ad.c()).b((afax)uio.p);
        }
        else {
            afbh = afag.a;
        }
        return afbh;
    }
    
    public final afbh ad() {
        if (((ArrayDeque)this.a).isEmpty()) {
            return afag.a;
        }
        final aapu aapu = ((ArrayDeque)this.a).pop();
        final aapu aapu2 = ((ArrayDeque)this.a).peek();
        ((ArrayDeque)this.a).push(aapu);
        return afbh.j(aapu2);
    }
    
    public final boolean ae() {
        final aapu aapu = ((ArrayDeque)this.a).peek();
        return aapu != null && aapu.ai() > 1;
    }
    
    public final boolean ag(final int n) {
        final aapu aapu = ((ArrayDeque)this.a).peek();
        if (aapu == null || (((ArrayDeque)this.a).size() == 1 && aapu.ai() <= 1)) {
            return false;
        }
        if (aapu.ai() == 0) {
            ((ArrayDeque)this.a).pop();
            return this.ag(n);
        }
        if (aapu.ai() == 1) {
            return this.ah(n);
        }
        final afbh ak = aapu.ak();
        final uwp aj = aapu.aj();
        ((uwh)this.b).c();
        if (n == 1 && ak.h()) {
            ((uwh)this.b).j((uwp)ak.c(), aj, 3);
        }
        else {
            ((uwh)this.b).h(aj);
        }
        aj.a(2);
        return true;
    }
    
    public final boolean ah(int af) {
        if (((ArrayDeque)this.a).size() <= 1) {
            return false;
        }
        final aapu aapu = ((ArrayDeque)this.a).pop();
        final aapu aapu2 = ((ArrayDeque)this.a).peek();
        uwd b3;
        if (aapu2 != null) {
            ((uwh)this.b).c();
            if (af == 1) {
                final Object b = this.b;
                final uwp aj = aapu.aj();
                final uwp aj2 = aapu2.aj();
                af = af((uwp)aapu.b);
                ((uwh)b).j(aj, aj2, af);
            }
            else {
                final Object b2 = this.b;
                final uwp aj3 = aapu2.aj();
                final uwh uwh = (uwh)b2;
                uwh.i();
                if (((FrameLayout)uwh.n.a).indexOfChild(aj3.b.a()) >= 0) {
                    uwh.d(false);
                }
                else if (((FrameLayout)uwh.l.a).indexOfChild(aj3.b.a()) >= 0) {
                    uwh.g(false);
                }
                else {
                    uwh.h(aj3);
                }
            }
            final uwp uwp = ((ArrayDeque)aapu2.a).peek();
            if (uwp != null) {
                uwp.a(2);
            }
            aapu.al();
            b3 = ((uwp)aapu2.b).b;
        }
        else {
            b3 = null;
        }
        ((auna)this.c).tt(afbh.j(b3));
        return true;
    }
    
    public final int ai() {
        return ((ArrayDeque)this.a).size();
    }
    
    public final uwp aj() {
        return ((ArrayDeque)this.a).peek();
    }
    
    public final afbh ak() {
        if (((ArrayDeque)this.a).size() <= 1) {
            return afag.a;
        }
        final uwp uwp = ((ArrayDeque)this.a).pop();
        ((Set)this.c).remove(uwp.a);
        uwp.a(4);
        return afbh.k(uwp);
    }
    
    public final void al() {
        final Iterator iterator = ((ArrayDeque)this.a).iterator();
        while (iterator.hasNext()) {
            ((uwp)iterator.next()).a(4);
        }
        ((ArrayDeque)this.a).clear();
        ((Set)this.c).clear();
    }
    
    public final void am() {
        final Iterator iterator = ((ArrayDeque)this.a).iterator();
        while (iterator.hasNext()) {
            ((uwp)iterator.next()).a(3);
        }
    }
    
    public final void an(final String s) {
        if (!this.ap(s)) {
            return;
        }
        int size = ((ArrayDeque)this.a).size();
        while (--size > 0) {
            final uwp uwp = ((ArrayDeque)this.a).peek();
            if (s.equals(uwp.a)) {
                break;
            }
            ((ArrayDeque)this.a).pop();
            ((Set)this.c).remove(uwp.a);
            uwp.a(4);
        }
    }
    
    public final void ao(final uwp uwp, final boolean b) {
        if (this.ap(uwp.a)) {
            this.an(uwp.a);
            return;
        }
        ((ArrayDeque)this.a).push(uwp);
        ((Set<String>)this.c).add(uwp.a);
        if (b) {
            uwp.a(2);
        }
    }
    
    public final boolean ap(final String s) {
        return ((Set)this.c).contains(s);
    }
    
    public final uwo aq(final xab xab, final alji alji, final ajon ajon) {
        final Context context = (Context)((atnb)this.b).a();
        context.getClass();
        final accx accx = (accx)((atnb)this.c).a();
        accx.getClass();
        final arna b = ((aroq)this.a).b();
        b.getClass();
        xab.getClass();
        ajon.getClass();
        return new uwo(context, accx, b, xab, alji, ajon);
    }
    
    public final void ar(final View view, final MotionEvent motionEvent, final View view2, final boolean b) {
        final int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        boolean contains;
        if (pointerCount == 1 && view2.getVisibility() == 0) {
            view2.getGlobalVisibleRect((Rect)this.a);
            view2.getLocationOnScreen((int[])this.c);
            final Object a = this.a;
            final int[] array = (int[])this.c;
            ((Rect)a).offsetTo(array[0], array[1]);
            view.getLocationOnScreen((int[])this.c);
            contains = ((Rect)this.a).contains((int)motionEvent.getX(0) + ((int[])this.c)[0], (int)motionEvent.getY(0) + ((int[])this.c)[1]);
        }
        else {
            contains = false;
        }
        final Object b2 = this.b;
        final int width = view.getWidth();
        final int height = view.getHeight();
        if (motionEvent.getActionMasked() != 6 && motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 2 && motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 1) {
            final int actionMasked = motionEvent.getActionMasked();
            final StringBuilder sb = new StringBuilder("Can't handle touch event: ");
            sb.append(actionMasked);
            tut.l(sb.toString());
            return;
        }
        int actionIndex;
        unu unu;
        if (motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 6 && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 0) {
            actionIndex = -1;
            unu = (unu)b2;
        }
        else {
            actionIndex = motionEvent.getActionIndex();
            unu = (unu)b2;
        }
        while (i < motionEvent.getPointerCount()) {
            final arde a2 = ardf.a();
            final int pointerId = motionEvent.getPointerId(i);
            a2.copyOnWrite();
            ardf.e((ardf)a2.instance, pointerId);
            final float n = motionEvent.getX(i) / width;
            final float n2 = motionEvent.getY(i) / height;
            final double max = Math.max(0.0, Math.min(n, 1.0));
            final double max2 = Math.max(0.0, Math.min(n2, 1.0));
            final ahcr builder = ((ahcz)ahhl.a).createBuilder();
            builder.copyOnWrite();
            final ahhl ahhl = (ahhl)builder.instance;
            ahhl.b |= 0x1;
            ahhl.c = max;
            builder.copyOnWrite();
            final ahhl ahhl2 = (ahhl)builder.instance;
            ahhl2.b |= 0x2;
            ahhl2.d = max2;
            final ahhl ahhl3 = (ahhl)builder.build();
            a2.copyOnWrite();
            ardf.f((ardf)a2.instance, ahhl3);
            if (actionIndex != -1) {
                if (i == actionIndex) {
                    if (motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 0) {
                        final ardg d = ardg.d;
                        a2.copyOnWrite();
                        ardf.c((ardf)a2.instance, d);
                    }
                    else {
                        final ardg b3 = ardg.b;
                        a2.copyOnWrite();
                        ardf.c((ardf)a2.instance, b3);
                    }
                }
                else {
                    final ardg c = ardg.c;
                    a2.copyOnWrite();
                    ardf.c((ardf)a2.instance, c);
                }
            }
            else {
                final ardg c2 = ardg.c;
                a2.copyOnWrite();
                ardf.c((ardf)a2.instance, c2);
            }
            if (motionEvent.getPointerCount() == 1) {
                a2.copyOnWrite();
                ardf.d((ardf)a2.instance, contains);
            }
            final arbp a3 = arbu.a();
            a3.copyOnWrite();
            arbu.d((arbu)a3.instance, (ardf)a2.build());
            final arbu arbu = (arbu)a3.build();
            final unu unu2 = unu;
            unu2.b.add(arbu);
            if (b) {
                final unt c3 = unu2.c;
                if (c3 != null) {
                    c3.b();
                }
            }
            ++i;
        }
    }
    
    public final ufu au() {
        return ((ufy)this.b).b;
    }
    
    public final void ax(final EditableVideo b, final float n) {
        if (b.b.a() < 0.5625f) {
            final float max = Math.max(0.0f, 1.0f - at(b) / 9.0f * 16.0f / as(b));
            b.A(0.0, 0.0);
            b.B((double)(max * n), (double)(max * (1.0f - n)));
        }
        else {
            final float max2 = Math.max(0.0f, 1.0f - as(b) / 16.0f * 9.0f / at(b));
            b.B(0.0, 0.0);
            b.A((double)(max2 * n), (double)(max2 * (1.0f - n)));
        }
        final Object a = this.a;
        if (a instanceof udk) {
            ((udk)a).b = b;
        }
    }
    
    public final void ay(final EditableVideo b) {
        final ufu au = this.au();
        if (au != null) {
            au.h(1);
            ((ufy)this.b).a(false);
            ((ufy)this.b).b(false);
        }
        b.B(0.0, 0.0);
        b.A(0.0, 0.0);
        final Object a = this.a;
        if (a instanceof udk) {
            ((udk)a).b = b;
        }
    }
    
    public final void az(final EditableVideo editableVideo, final boolean b) {
        final ufu au = this.au();
        au.getClass();
        if (au instanceof View) {
            au.h(2);
            ((View)au).getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ufs(this, au, b, editableVideo, (byte[])null, (byte[])null, (byte[])null));
        }
        if (aw(editableVideo)) {
            return;
        }
        this.ax(editableVideo, 0.5f);
    }
    
    public final void b(final String s, final String s2, final int n, final String s3, final byte[] array, final zrb zrb, final xbt xbt, final Optional l, final Optional m, final Optional optional) {
        ((thg)this.b).d((Object)new aaox());
        if (xbt != null) {
            xbt.c("wn_s");
        }
        final vyd a = ((vyc)this.a).a(s, s2, n, s3, array, (tkl)new abnf((thg)this.b, xbt));
        a.L = l;
        a.M = m;
        if (optional.isPresent()) {
            if (((abku)optional.get()).a.isPresent()) {
                a.K = (aieg)((abku)optional.get()).a.get();
            }
            if (((abku)optional.get()).b.isPresent()) {
                ((vls)a).v = (tmx)((abku)optional.get()).b.get();
            }
            if (((abku)optional.get()).c.isPresent()) {
                a.A = (algk)((abku)optional.get()).c.get();
            }
        }
        final Object c = this.c;
        final abne abne = new abne(this, zrb, xbt, (byte[])null);
        final vyb vyb = (vyb)c;
        ((vnw)vyb.d).k((vmz)a, vny.a, (zrb)abne, vyb.f(vyb.f));
    }
    
    public final void bA() {
        final aeux o = aewp.o("onBeforeAccountError");
        try {
            final aflu k = ((afkg)this.b).k();
            while (((Iterator)k).hasNext()) {
                final aeli aeli = (aeli)((Iterator)k).next();
                if (aeli instanceof aelj) {
                    ((aelj)aeli).e();
                }
            }
            for (final aeli aeli2 : (ArrayList)this.c) {
                if (aeli2 instanceof aelj) {
                    ((aelj)aeli2).e();
                }
            }
            o.close();
        }
        finally {
            Label_0124: {
                try {
                    o.close();
                    break Label_0124;
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    aftz.A(t, t2);
                }
            }
            while (true) {}
        }
    }
    
    public final void bB() {
        final aeux o = aewp.o("onBeforeAccountLoading");
        try {
            final aflu k = ((afkg)this.b).k();
            while (((Iterator)k).hasNext()) {
                final aeli aeli = (aeli)((Iterator)k).next();
                if (aeli instanceof aelj) {
                    ((aelj)aeli).f();
                }
            }
            for (final aeli aeli2 : (ArrayList)this.c) {
                if (aeli2 instanceof aelj) {
                    ((aelj)aeli2).f();
                }
            }
            o.close();
        }
        finally {
            Label_0124: {
                try {
                    o.close();
                    break Label_0124;
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    aftz.A(t, t2);
                }
            }
            while (true) {}
        }
    }
    
    public final void bC(final aels aels) {
        int i = 0;
        final boolean b = true;
        adme.T(aels != null);
        adme.T(((ahcz)aels).equals(aels.a) ^ true);
        adme.T((aels.b & 0x100) != 0x0 && b);
        final String j = aels.i;
        final aflu k = ((afkg)this.b).k();
        while (((Iterator)k).hasNext()) {
            ((aeli)((Iterator)k).next()).c();
        }
        for (Object c = this.c; i < ((List)c).size(); ++i) {
            ((aeli)((List)c).get(i)).c();
        }
    }
    
    public final adot bD() {
        final Object c = this.c;
        if (c != null) {
            final adod adod = (adod)c;
            final int a = adme.A(adod.c);
            if (a != 0) {
                if (a == 6) {
                    final int b = adod.b;
                    final boolean b2 = true;
                    adme.T((b & 0x2) != 0x0);
                    final File file = new File(((adod)this.c).d);
                    final int n = (int)file.length();
                    final byte[] array = new byte[n];
                    afqq.g((InputStream)new BufferedInputStream(new FileInputStream(file)), array, n);
                    final adot g = ((adov)this.a).g((File)this.b);
                    final adod adod2 = (adod)this.c;
                    final long g2 = adod2.g;
                    final long e = adod2.e;
                    adme.K(qcz.m(4, e) <= qcz.n(4, g2) && b2);
                    return new adot((InputStream)new rdb((InputStream)new rdc((InputStream)g, qcz.n(4, g2), (long)qcz.o(4, array).length), qcz.m(4, e), qcz.o(4, array)), g.a());
                }
            }
        }
        return ((adov)this.a).g((File)this.b);
    }
    
    public final Cursor bE(final Uri uri) {
        final long id = ContentUris.parseId(uri);
        final Object b = this.b;
        final Uri contentUri = MediaStore$Files.getContentUri("external");
        String s;
        if (Build$VERSION.SDK_INT >= 29) {
            s = "volume_name";
        }
        else {
            s = "_data";
        }
        final Cursor query = ((ContentResolver)b).query(contentUri, new String[] { s }, "_id = ?", new String[] { String.valueOf(id) }, (String)null);
        if (query == null) {
            return null;
        }
        if (!query.moveToFirst()) {
            query.close();
            return null;
        }
        return query;
    }
    
    public final void bI(final ahcr ahcr, final StorageVolume storageVolume) {
        final int bh = bH(storageVolume.getState());
        ahcr.copyOnWrite();
        final adok adok = (adok)ahcr.instance;
        final adok a = adok.a;
        adok.d = bh - 1;
        adok.b |= 0x2;
        if (bh != 2 && bh != 3) {
            return;
        }
        String e = storageVolume.getUuid();
        if (TextUtils.isEmpty((CharSequence)e)) {
            e = storageVolume.getDescription((Context)this.c);
        }
        ahcr.copyOnWrite();
        final adok adok2 = (adok)ahcr.instance;
        e.getClass();
        adok2.b |= 0x4;
        adok2.e = e;
        final boolean removable = storageVolume.isRemovable();
        ahcr.copyOnWrite();
        final adok adok3 = (adok)ahcr.instance;
        adok3.b |= 0x8;
        adok3.f = removable;
    }
    
    public final adjm bJ(final ajhi ajhi) {
        synchronized (this) {
            arjd arjd = ((Map<K, arjd>)this.a).get(ajhi);
            if (arjd == null) {
                Object o;
                if (ajhi == ajhi.b) {
                    o = ((ajhh)this.b).b;
                }
                else if (ajhi == ajhi.c) {
                    o = ((ajhh)this.b).c;
                }
                else {
                    o = afgh.q();
                }
                final arjd arjd2 = new arjd((List)o);
                ((Map<ajhi, arjd>)this.a).put(ajhi, arjd2);
                arjd = arjd2;
            }
            final Object c = this.c;
            final oco oco = (oco)((eqz)((oqz)c).a).a.e.a();
            final arjd arjd3 = new arjd((Context)((eqz)((oqz)c).a).a.py.a);
            final era a = ((eqz)((oqz)c).a).a;
            return new adjm(oco, arjd3, a.ax, (afxk)a.r.a(), ajhi, arjd, null, null, null, null);
        }
    }
    
    public final void bK(final aosv aosv) {
        this.bL(aosv, false);
    }
    
    public final void bL(final aosv aosv, final boolean b) {
        final Object c = this.c;
        monitorenter(c);
        try {
            final adiu adiu = (adiu)((atnb)this.a).a();
            final ahcr builder = ((ahcz)aosv).toBuilder();
            adiu.e(builder);
            adiu.d(builder);
            final aosv aosv2 = (aosv)builder.build();
            for (final adku adku : ((Map<K, adku>)this.b).values()) {
                if (adku.b()) {
                    if (b) {
                        adku.d(aosv2);
                    }
                    else {
                        adku.c(aosv2);
                    }
                }
            }
            monitorexit(c);
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    public final adhs bM(final List list) {
        final adhd adhd = (adhd)((atnb)this.a).a();
        adhd.getClass();
        final Executor executor = (Executor)((atnb)this.c).a();
        executor.getClass();
        final oco oco = (oco)((atnb)this.b).a();
        oco.getClass();
        list.getClass();
        return new adhs(adhd, executor, oco, list, 0, (byte[])null, (byte[])null);
    }
    
    public final adhs bN(final List list) {
        final adhd adhd = (adhd)((atnb)this.a).a();
        adhd.getClass();
        final Executor executor = (Executor)((atnb)this.c).a();
        executor.getClass();
        final oco oco = (oco)((atnb)this.b).a();
        oco.getClass();
        list.getClass();
        return new adhs(adhd, executor, oco, list, 4, (byte[])null, (byte[])null);
    }
    
    public final String bO() {
        return String.format("%04X", (int)(char)((AtomicInteger)this.c).get());
    }
    
    public final String bP() {
        return String.format("%04X+%02X", (int)(char)((AtomicInteger)this.c).get(), ((AtomicInteger)this.a).get() & 0xFF);
    }
    
    public final void bQ() {
        ((AtomicInteger)this.c).set(((Random)this.b).nextInt(65536));
    }
    
    public final void bS(final TextView textView, final acye acye, final aies aies, int u) {
        if (textView.getVisibility() == 8) {
            return;
        }
        if (aies == null && !TextUtils.isEmpty((CharSequence)null)) {
            final ahct ahct = (ahct)((ahcz)aies.a).createBuilder();
            throw null;
        }
        final acuk an = ((zkt)this.b).an(textView);
        an.b(aies, ((xaa)this.c).pE());
        an.c = (acui)new acxy(acye, u);
        if (an.h && aies.c == 1) {
            u = aegu.U((int)aies.d);
            if (u != 0) {
                if (u == 14) {
                    if (an.g) {
                        final TextView f = an.f;
                        acuk.c(f, fc.b(f.getContext(), 2131233380), true);
                    }
                    else {
                        final TextView f2 = an.f;
                        tqf.s((View)f2, fc.b(f2.getContext(), 2131233380), an.j);
                    }
                    an.i = true;
                    an.h = false;
                }
            }
        }
    }
    
    public final acwm bT(final xab xab, final alji alji) {
        ((atnb)this.a).a().getClass();
        final accx accx = (accx)((atnb)this.c).a();
        accx.getClass();
        final arna b = ((aroq)this.b).b();
        b.getClass();
        xab.getClass();
        return new acwm(accx, b, xab, alji);
    }
    
    public final acuw bU(final xab xab, final ViewGroup viewGroup) {
        final Context context = (Context)((atnb)this.b).a();
        context.getClass();
        xab.getClass();
        final Handler handler = (Handler)((atnb)this.a).a();
        handler.getClass();
        final agop agop = (agop)((atnb)this.c).a();
        agop.getClass();
        viewGroup.getClass();
        return new acuw(context, xab, handler, agop, viewGroup, null, null);
    }
    
    public final acuj bV(final View view) {
        final veh veh = (veh)((atnb)this.b).a();
        veh.getClass();
        final aefs aefs = (aefs)((atnb)this.c).a();
        view.getClass();
        return new acuj(veh, aefs, view, (vbs)((atnb)this.a).a(), (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final acqo bW(final aoft aoft, final acpr acpr) {
        final Activity activity = (Activity)((atnb)this.c).a();
        activity.getClass();
        final askz askz = (askz)((atnb)this.a).a();
        askz.getClass();
        final mtf mtf = (mtf)((atnb)this.b).a();
        mtf.getClass();
        acpr.getClass();
        return new acqo(activity, askz, mtf, aoft, acpr, null, null, null);
    }
    
    public final void bX(final acoq acoq, final aowb aowb, final int n, final acou acou) {
        final Uri p4 = aamz.P(aowb, n);
        final WeakReference weakReference = ((HashMap)this.c).get(p4);
        if (weakReference != null && weakReference.get() != null) {
            acou.d(acoq, (Bitmap)weakReference.get());
            return;
        }
        final acos acos = new acos(this, acou, acoq, null, null, null, null, null);
        if (p4 == null) {
            tut.b("Tried to load a null bitmap.");
            return;
        }
        ((acig)this.b).k(p4, (tdg)acos);
    }
    
    public final acmf bY(final Class clazz) {
        final int b = ((abp)this.c).b((Object)clazz);
        if (b >= 0) {
            return (acmf)((abp)this.c).f(b);
        }
        if (((Map)this.b).containsKey(clazz)) {
            final acmf acmf = (acmf)((Map<K, atnb>)this.b).get(clazz).a();
            ((abp)this.c).put((Object)clazz, (Object)acmf);
            return acmf;
        }
        return null;
    }
    
    public final acde bZ(final View view, final Optional optional, final Optional optional2, final Optional optional3) {
        final Context context = (Context)((atnb)this.b).a();
        context.getClass();
        final arna b = ((aroq)this.c).b();
        b.getClass();
        final aheu aheu = (aheu)((atnb)this.a).a();
        aheu.getClass();
        return new acde(context, b, aheu, view, optional, optional2, optional3, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final tel ba(final aenv aenv, final MessageLite messageLite) {
        return new tel((Executor)this.b, (med)this.c, (Runnable)this.a, aenv, messageLite, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final syj bb(final View view) {
        final Context context = (Context)((atnb)this.b).a();
        context.getClass();
        final acqv acqv = (acqv)((atnb)this.c).a();
        acqv.getClass();
        final acig acig = (acig)((atnb)this.a).a();
        acig.getClass();
        view.getClass();
        return new syj(context, acqv, acig, view);
    }
    
    public final aitx bc(aitx a) {
        if (((Map)this.c).containsKey(a)) {
            return ((Map<K, aitx>)this.c).get(a);
        }
        aitz aitz;
        if ((aitz = a.E) == null) {
            aitz = aitz.a;
        }
        if (aitz.b == 62285947) {
            aitz aitz2;
            if ((aitz2 = a.E) == null) {
                aitz2 = aitz.a;
            }
            if (aitz2.b == 62285947) {
                a = (aitx)aitz2.c;
            }
            else {
                a = aitx.a;
            }
            return a;
        }
        return null;
    }
    
    public final void bd(final aitx aitx) {
        ((Map<aitx, Boolean>)this.b).put(aitx, Boolean.valueOf(true));
    }
    
    public final void be(final aitx aitx, final aitx aitx2) {
        ((Map<aitx, aitx>)this.c).put(aitx, aitx2);
    }
    
    public final void bf(final aitx aitx, final boolean b) {
        ((Map<aitx, Boolean>)this.a).put(aitx, Boolean.valueOf(b));
    }
    
    public final boolean bg(final aitx aitx) {
        final Boolean b = ((Map<K, Boolean>)this.a).get(aitx);
        boolean b2;
        if (b == null) {
            b2 = aitx.N;
        }
        else {
            b2 = b;
        }
        return b2;
    }
    
    public final boolean bh(final aitx aitx) {
        return ((Map<Object, Object>)this.b).get(aitx) == null && aitx.G.size() > 0;
    }
    
    public final void bi(Object a, final boolean b) {
        a.getClass();
        final Object b2 = this.b;
        if (b2 != null) {
            if (this.c != null) {
                final int a2 = ((acla)b2).a();
                final int n = cm(a) - 1;
                int i = 0;
                aibs aibs = null;
                int n2 = 0;
                while (i < a2) {
                    final Object c = ((acla)this.b).c(i);
                    int n3;
                    aibs aibs2;
                    if (c instanceof aiva) {
                        n3 = -1;
                        aibs2 = aibs;
                    }
                    else if (c instanceof aibs) {
                        aibs2 = (aibs)c;
                        n3 = n2;
                    }
                    else {
                        final int n4 = cm(c) - 1;
                        n3 = n2;
                        aibs2 = aibs;
                        if (n >= n4) {
                            ((acpg)this.c).lG(a, i + n2);
                            if (b) {
                                a = this.a;
                                if (a != null && n == n4) {
                                    ((acsj)a).J(c);
                                }
                            }
                            this.cl(aibs);
                            return;
                        }
                    }
                    ++i;
                    n2 = n3;
                    aibs = aibs2;
                }
                ((acpg)this.c).D(a);
                this.cl(aibs);
            }
        }
    }
    
    public final void bj(final aklq aklq, final Map map) {
        if (aklq == null) {
            return;
        }
        ajws ajws;
        if ((ajws = aklq.e) == null) {
            ajws = ajws.a;
        }
        final Spanned b = acbu.b(ajws);
        if (b != null) {
            if (((CharSequence)b).length() != 0) {
                final acxp j = ((acxo)this.a).j();
                j.k((CharSequence)b);
                j.i(-1);
                j.h(false);
                aiet aiet;
                if ((aiet = aklq.h) == null) {
                    aiet = aiet.a;
                }
                if ((aiet.b & 0x1) != 0x0) {
                    aiet aiet2;
                    if ((aiet2 = aklq.h) == null) {
                        aiet2 = aiet.a;
                    }
                    aies aies;
                    if ((aies = aiet2.c) == null) {
                        aies = aies.a;
                    }
                    ajws ajws2;
                    if ((aies.b & 0x200) != 0x0) {
                        if ((ajws2 = aies.i) == null) {
                            ajws2 = ajws.a;
                        }
                    }
                    else {
                        ajws2 = null;
                    }
                    j.m((CharSequence)acbu.b(ajws2), (View$OnClickListener)new knc(this, aies, map, 13, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                }
                ((acxo)this.a).n(j.b());
            }
        }
    }
    
    public final void bk(final aklq aklq, final Map map, final int n) {
        if (aklq == null) {
            this.co(n);
            return;
        }
        ajws ajws;
        if ((ajws = aklq.e) == null) {
            ajws = ajws.a;
        }
        final Spanned b = acbu.b(ajws);
        if (b != null && ((CharSequence)b).length() != 0) {
            this.bj(aklq, map);
            return;
        }
        this.co(n);
    }
    
    public final Optional bl() {
        final ahcr builder = ((ahcz)ajdq.a).createBuilder();
        final String g = ((accb)this.a).g();
        if (g == null) {
            return Optional.empty();
        }
        builder.copyOnWrite();
        final ajdq ajdq = (ajdq)builder.instance;
        ajdq.b |= 0x1;
        ajdq.c = g;
        if (!((accb)this.a).f().isPresent()) {
            return Optional.empty();
        }
        Object o = ((accb)this.a).f();
        builder.getClass();
        ((OptionalLong)o).ifPresent((LongConsumer)new sno(builder));
        final Optional e = ((accb)this.a).e();
        Label_0180: {
            Label_0176: {
                try {
                    final Object c = this.c;
                    o = ((zoa)this.b).c();
                    o = ((mbb)c).p((znz)o);
                    if (o != null) {
                        o = Optional.of((Object)((Account)o).name);
                        break Label_0180;
                    }
                    break Label_0176;
                }
                catch (final RemoteException o) {}
                catch (final mqv o) {}
                catch (final mqu mqu) {}
                znh.c(zng.a, znf.a, "[InlineCustomTab]Could not get custom tabs account", (Throwable)o);
            }
            o = Optional.empty();
        }
        if (e.isPresent() && ((Optional)o).isPresent()) {
            final boolean equals = ((String)e.get()).equals(((Optional)o).get());
            builder.copyOnWrite();
            final ajdq ajdq2 = (ajdq)builder.instance;
            ajdq2.b |= 0x4;
            ajdq2.e = (equals ^ true);
        }
        else {
            builder.copyOnWrite();
            final ajdq ajdq3 = (ajdq)builder.instance;
            ajdq3.b |= 0x4;
            ajdq3.e = false;
        }
        ((accb)this.a).d().ifPresent((Consumer)new snm(builder, 3));
        return Optional.of((Object)builder.build());
    }
    
    public final vdz bm(final atnb atnb) {
        return new vdz((Executor)this.b, (med)this.c, (Runnable)this.a, atnb, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final String bn(final aujd aujd) {
        final Object a = this.a;
        if (a != null) {
            final StringBuffer sb = new StringBuffer(((aumm)a).a(aujd));
            ((aumm)a).c(sb, aujd);
            return sb.toString();
        }
        throw new UnsupportedOperationException("Printing not supported");
    }
    
    public final agmv bp(final String s, final String s2, final String s3) {
        synchronized (this) {
            return agmv.a(((SharedPreferences)this.a).getString(cp(s, s2, s3), (String)null));
        }
    }
    
    public final void bq() {
        synchronized (this) {
            ((Map)this.b).clear();
            ((SharedPreferences)this.a).edit().clear().commit();
        }
    }
    
    public final void br(final String s, final String s2, final String s3, String b, final String s4) {
        synchronized (this) {
            b = agmv.b(b, s4, System.currentTimeMillis());
            if (b == null) {
                return;
            }
            final SharedPreferences$Editor edit = ((SharedPreferences)this.a).edit();
            edit.putString(cp(s, s2, s3), b);
            edit.commit();
        }
    }
    
    public final boolean bs() {
        synchronized (this) {
            return ((SharedPreferences)this.a).getAll().isEmpty();
        }
    }
    
    public final void bu(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: invokestatic    java/lang/System.currentTimeMillis:()J
        //     5: lstore_2       
        //     6: aload_1        
        //     7: invokestatic    aapu.bt:(Ljava/lang/String;)Ljava/lang/String;
        //    10: astore          4
        //    12: aload_0        
        //    13: getfield        aapu.a:Ljava/lang/Object;
        //    16: aload           4
        //    18: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //    23: ifne            64
        //    26: aload_0        
        //    27: getfield        aapu.a:Ljava/lang/Object;
        //    30: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //    35: astore          4
        //    37: aload           4
        //    39: aload_1        
        //    40: invokestatic    aapu.bt:(Ljava/lang/String;)Ljava/lang/String;
        //    43: lload_2        
        //    44: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    47: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //    52: pop            
        //    53: aload           4
        //    55: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //    60: pop            
        //    61: goto            96
        //    64: aload_0        
        //    65: getfield        aapu.a:Ljava/lang/Object;
        //    68: aload_1        
        //    69: invokestatic    aapu.bt:(Ljava/lang/String;)Ljava/lang/String;
        //    72: aconst_null    
        //    73: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    78: astore          4
        //    80: aload           4
        //    82: ifnull          94
        //    85: aload           4
        //    87: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    90: lstore_2       
        //    91: goto            96
        //    94: lconst_0       
        //    95: lstore_2       
        //    96: aload_0        
        //    97: getfield        aapu.b:Ljava/lang/Object;
        //   100: aload_1        
        //   101: lload_2        
        //   102: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   105: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   110: pop            
        //   111: aload_0        
        //   112: monitorexit    
        //   113: return         
        //   114: astore_1       
        //   115: aload_0        
        //   116: monitorexit    
        //   117: aload_1        
        //   118: athrow         
        //   119: astore          4
        //   121: goto            94
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2      61     114    119    Any
        //  64     80     114    119    Any
        //  85     91     119    124    Ljava/lang/NumberFormatException;
        //  85     91     114    119    Any
        //  96     111    114    119    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0094:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final boolean bv() {
        return ((Set)this.a).isEmpty();
    }
    
    public final byte[] bw() {
        final long[] array = new long[10];
        final long[] array2 = new long[10];
        final long[] array3 = new long[10];
        aghv.a(array, (long[])this.a);
        aghv.b(array2, (long[])this.b, array);
        aghv.b(array3, (long[])this.c, array);
        final byte[] k = aghv.k(array3);
        k[31] ^= (byte)(aghl.a(array2) << 7);
        return k;
    }
    
    public final IllegalArgumentException bx() {
        final StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        sb.append(this.b);
        sb.append("=");
        sb.append(this.c);
        sb.append(" and ");
        sb.append(this.b);
        sb.append("=");
        sb.append(this.a);
        return new IllegalArgumentException(sb.toString());
    }
    
    public final void bz(final aels aels) {
        final aeux o = aewp.o("onBeforeActivityAccountReady");
        try {
            final String i = aels.i;
            final aflu k = ((afkg)this.b).k();
            while (((Iterator)k).hasNext()) {
                final aeli aeli = (aeli)((Iterator)k).next();
                if (aeli instanceof aelj) {
                    ((aelj)aeli).g();
                }
            }
            for (final aeli aeli2 : (ArrayList)this.c) {
                if (aeli2 instanceof aelj) {
                    ((aelj)aeli2).g();
                }
            }
            o.close();
        }
        finally {
            Label_0129: {
                try {
                    o.close();
                    break Label_0129;
                }
                finally {
                    final Throwable t;
                    aftz.A((Throwable)aels, t);
                }
            }
            while (true) {}
        }
    }
    
    public final ListenableFuture c(final PlaybackStartDescriptor playbackStartDescriptor, final xbt xbt) {
        final zra d = zra.d();
        String k;
        if (TextUtils.isEmpty((CharSequence)(k = playbackStartDescriptor.k()))) {
            if (playbackStartDescriptor.a.e.size() > 0) {
                k = (String)playbackStartDescriptor.a.e.get(playbackStartDescriptor.b());
            }
            else {
                k = "";
            }
        }
        final String i = playbackStartDescriptor.i();
        final int a = playbackStartDescriptor.a();
        final String g = playbackStartDescriptor.g();
        final byte[] x = playbackStartDescriptor.x();
        final lrt a2 = playbackStartDescriptor.a;
        Optional optional;
        if ((a2.b & Integer.MIN_VALUE) != 0x0) {
            optional = Optional.of((Object)a2.E);
        }
        else {
            optional = Optional.empty();
        }
        final lrt a3 = playbackStartDescriptor.a;
        Optional optional2;
        if ((a3.c & 0x1) != 0x0) {
            anxw anxw;
            if ((anxw = a3.F) == null) {
                anxw = anxw.a;
            }
            optional2 = Optional.of((Object)anxw);
        }
        else {
            optional2 = Optional.empty();
        }
        this.b(k, i, a, g, x, (zrb)d, xbt, optional, optional2, Optional.ofNullable((Object)playbackStartDescriptor.d));
        return (ListenableFuture)d;
    }
    
    public final abdf d(final abcy abcy, final abeo abeo) {
        final abqv abqv = (abqv)((atnb)this.c).a();
        abqv.getClass();
        final thg thg = (thg)((atnb)this.b).a();
        thg.getClass();
        final abvt abvt = (abvt)((atnb)this.a).a();
        abvt.getClass();
        abcy.getClass();
        abeo.getClass();
        return new abdf(abqv, thg, abvt, abcy, abeo, true);
    }
    
    public final void e(final Object o) {
        if (!((HashMap)this.c).containsKey(o)) {
            final Object c = this.c;
            final Object a = this.a;
            final boolean b = o instanceof aacx;
            Object o2 = "";
            String s;
            String s2;
            String s3;
            if (b) {
                final aacx aacx = (aacx)o;
                final agr e = aacx.e;
                s = aacx.j();
                if (e != null) {
                    o2 = e.b;
                }
                s2 = (String)o2;
                s3 = (String)a;
            }
            else {
                if (!(o instanceof aaco)) {
                    throw new IllegalArgumentException(String.format("Unsupported object to score: %s", o.getClass().getName()));
                }
                final aaco aaco = (aaco)o;
                final agr n = aaco.n;
                s = aaco.b;
                if (n != null) {
                    o2 = n.b;
                }
                s2 = (String)o2;
                s3 = (String)a;
            }
            ((HashMap<Object, Integer>)c).put(o, aamn.z(s3, s, s2) - 1);
        }
    }
    
    public final afr f() {
        final afr afr = new afr((Context)this.a);
        afr.D = "OfflineNotifications";
        return afr;
    }
    
    public final Set g() {
        synchronized (this.b) {
            return (Set)this.b;
        }
    }
    
    public final void h() {
        final Object b = this.b;
        monitorenter(b);
        try {
            for (final Pair pair : this.g()) {
                ((NotificationManager)this.c).cancel((String)pair.first, (int)pair.second);
            }
            ((Set)this.b).clear();
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    public final void i(final String s, final int n, final Notification notification) {
        synchronized (this.b) {
            ((Set<Pair>)this.b).add(new Pair((Object)twd.i(s), (Object)n));
            monitorexit(this.b);
            ((NotificationManager)this.c).notify(s, n, notification);
        }
    }
    
    public final lyf j(final File file) {
        synchronized (this) {
            final String absolutePath = file.getAbsolutePath();
            if (((Map)this.b).containsKey(absolutePath)) {
                return (lyf)((Map<Object, Object>)this.b).get(absolutePath);
            }
            final lyx lyx = new lyx(file, (lyj)new lyt(), ((mtf)this.c).i((SharedPreferences)this.a).getEncoded(), true);
            ((Map<String, lyf>)this.b).put(absolutePath, (lyf)lyx);
            return (lyf)lyx;
        }
    }
    
    public final void k() {
        monitorenter(this);
        try {
            final Iterator<Object> iterator = (Iterator<Object>)((Map<K, lyf>)this.b).values().iterator();
            while (iterator.hasNext()) {
                iterator.next().l();
            }
            ((Map)this.b).clear();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final agr m(String query) {
        query = (String)((zxl)this.a).a().query("channelsV13", zxi.a, "id = ?", new String[] { query }, (String)null, (String)null, (String)null, (String)null);
        try {
            if (((Cursor)query).moveToNext()) {
                return zxd.b((Cursor)query, (aabr)((atnb)this.b).a(), ((Cursor)query).getColumnIndexOrThrow("id"), ((Cursor)query).getColumnIndexOrThrow("offline_channel_data_proto"));
            }
            return null;
        }
        finally {
            ((Cursor)query).close();
        }
    }
    
    public final void n(final agr agr) {
        ((zxl)this.a).a().insertOrThrow("channelsV13", (String)null, l(agr));
    }
    
    public final void o(final agr agr) {
        final long n = ((zxl)this.a).a().update("channelsV13", l(agr), "id = ?", new String[] { (String)agr.e });
        if (n == 1L) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Update channel affected ");
        sb.append(n);
        sb.append(" rows");
        throw new SQLException(sb.toString());
    }
    
    public final long p(final String s) {
        final ListenableFuture a = ((tnz)this.a).a();
        if (!a.isDone()) {
            return -2L;
        }
        final aqtn aqtn = (aqtn)tfx.h((Future)a, (Object)aqtn.a);
        s.getClass();
        final ahej h = aqtn.h;
        if (((Map)h).containsKey(s)) {
            return (long)((Map)h).get(s);
        }
        return -1L;
    }
    
    public final ajfl q(final String s, final long n) {
        synchronized (this) {
            final long p2 = this.p(s);
            if (p2 != -2L) {
                final aqtn aqtn = (aqtn)((tnz)this.a).c();
                s.getClass();
                final ahej c = aqtn.c;
                if (((Map)c).containsKey(s)) {
                    if (((Map)c).get(s)) {
                        final ahcr builder = ((ahcz)ajfl.a).createBuilder();
                        final ajfm b = ajfm.b((int)((afgm)this.b).get(s));
                        builder.copyOnWrite();
                        final ajfl ajfl = (ajfl)builder.instance;
                        ajfl.c = b.h;
                        ajfl.b |= 0x1;
                        final aqtn aqtn2 = (aqtn)((tnz)this.a).c();
                        s.getClass();
                        final ahej d = aqtn2.d;
                        final boolean containsKey = ((Map)d).containsKey(s);
                        final int n2 = 0;
                        int intValue;
                        if (containsKey) {
                            intValue = (int)((Map)d).get(s);
                        }
                        else {
                            intValue = 0;
                        }
                        builder.copyOnWrite();
                        final ajfl ajfl2 = (ajfl)builder.instance;
                        ajfl2.b |= 0x2;
                        ajfl2.d = intValue;
                        s.getClass();
                        final ahej e = aqtn2.e;
                        int intValue2;
                        if (((Map)e).containsKey(s)) {
                            intValue2 = (int)((Map)e).get(s);
                        }
                        else {
                            intValue2 = 0;
                        }
                        builder.copyOnWrite();
                        final ajfl ajfl3 = (ajfl)builder.instance;
                        ajfl3.b |= 0x4;
                        ajfl3.e = intValue2;
                        s.getClass();
                        final ahej i = aqtn2.i;
                        int intValue3;
                        if (((Map)i).containsKey(s)) {
                            intValue3 = (int)((Map)i).get(s);
                        }
                        else {
                            intValue3 = 0;
                        }
                        builder.copyOnWrite();
                        final ajfl ajfl4 = (ajfl)builder.instance;
                        ajfl4.b |= 0x40;
                        ajfl4.h = intValue3;
                        s.getClass();
                        final ahej g = aqtn2.g;
                        int intValue4 = n2;
                        if (((Map)g).containsKey(s)) {
                            intValue4 = (int)((Map)g).get(s);
                        }
                        if (intValue4 != 0) {
                            s.getClass();
                            final ahej f = aqtn2.f;
                            long longValue;
                            if (((Map)f).containsKey(s)) {
                                longValue = (long)((Map)f).get(s);
                            }
                            else {
                                longValue = 0L;
                            }
                            final int f2 = (int)(longValue / intValue4);
                            builder.copyOnWrite();
                            final ajfl ajfl5 = (ajfl)builder.instance;
                            ajfl5.b |= 0x8;
                            ajfl5.f = f2;
                        }
                        if (p2 == -1L) {
                            builder.copyOnWrite();
                            final ajfl ajfl6 = (ajfl)builder.instance;
                            ajfl6.b |= 0x20;
                            ajfl6.g = -1;
                        }
                        else {
                            builder.copyOnWrite();
                            final ajfl ajfl7 = (ajfl)builder.instance;
                            ajfl7.b |= 0x20;
                            ajfl7.g = (int)(n - p2);
                        }
                        return (ajfl)builder.build();
                    }
                }
            }
            return null;
        }
    }
    
    public final void r(final String s) {
        tfx.m(((tnz)this.a).b((afax)new xgb(s, 16)), (tfv)zem.o);
    }
    
    public final void w(final String s, final int n, final long n2) {
        synchronized (this) {
            if (!((afgm)this.b).containsKey(s)) {
                return;
            }
            tfx.m(((tnz)this.a).b((afax)new zmb(s, n2, n, 0)), (tfv)zem.m);
        }
    }
    
    public final void x(final String s, final long n) {
        if (!((afgm)this.b).containsKey(s)) {
            return;
        }
        tfx.m(((tnz)this.a).b((afax)new fmx(s, n, 7)), (tfv)zem.p);
    }
    
    public final void y(final String s, final int n, final int n2) {
        synchronized (this) {
            if (!((afgm)this.b).containsKey(s)) {
                return;
            }
            tfx.m(((tnz)this.a).b((afax)new zmc(s, n, n2)), (tfv)zem.n);
        }
    }
    
    public final boolean z() {
        final Object c = this.c;
        return c != null && ((aote)c).b;
    }
}
