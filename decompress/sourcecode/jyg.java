import com.google.android.gms.cast.ApplicationMetadata;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import org.json.JSONObject;
import com.google.android.gms.cast.MediaQueueData;
import android.graphics.Bitmap;
import com.google.android.apps.youtube.embeddedplayer.service.model.AutoValue_RelatedVideoItem;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import java.util.ArrayList;
import android.view.View$OnTouchListener;
import android.widget.ListAdapter;
import java.util.Collection;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;
import android.widget.AdapterView$OnItemClickListener;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.f;
import j$.util.Optional;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c;
import android.view.ViewGroup;
import android.os.Handler;
import android.net.Uri;
import com.google.protobuf.MessageLite;
import android.text.Spanned;
import android.text.format.DateFormat;
import java.util.Locale;
import android.content.Context;
import com.google.protos.youtube.api.innertube.FeedFilterChipBarRendererOuterClass;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import java.util.List;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.StrictMode;
import com.google.android.libraries.backup.Backup;

// 
// Decompiled by Procyon v0.6.0
// 

public class jyg
{
    @Backup
    public static final String FEED_FILTER_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP = "feed_filter_bar_tutorial_last_shown_timestamp";
    @Backup
    public static final String FEED_FILTER_BAR_TUTORIAL_SHOWN_COUNT = "feed_filter_bar_tutorial_shown_count";
    
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
    
    public static int L(final int n) {
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
    
    public static int M(final int n) {
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
    
    public static Object N(final aeyr aeyr) {
        final StrictMode$ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode$ThreadPolicy$Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return aeyr.a();
        }
        finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
    
    public static lzj O(final int n, final int n2, final String s) {
        return new lzj(n, n2, s);
    }
    
    public static void P(final List list, final trg trg) {
        final String s = (String)trg.l();
        if (!TextUtils.isEmpty((CharSequence)s)) {
            list.add(s);
        }
    }
    
    public static fzk b(final jxj c, final acor acor, final frb d) {
        final RecyclerView n = acor.N;
        final fzk a = fzl.a();
        a.b = c.d();
        a.c(c.n());
        a.c = (fzm)c;
        a.d = d;
        a.e(n);
        a.b(tqt.e(n.getContext()));
        return a;
    }
    
    public static void c(final fyx fyx, final jxj jxj, final acor acor, final frb frb, final wwv wwv, final String s) {
        if (!g(s)) {
            ((ashe)frb.c).aB((asix)new jou(jxj, 18));
        }
        acor.z((acpc)new jxr(jxj, acor, frb, s, fyx, wwv));
    }
    
    public static void d(final boolean b, final fyx fyx, final fzl fzl) {
        if (b) {
            fyx.p(fzl);
            return;
        }
        fyx.j();
    }
    
    public static boolean e(final veu veu) {
        anwr anwr;
        if ((anwr = veu.a.g) == null) {
            anwr = anwr.a;
        }
        if (anwr.b == 256220752) {
            anwr anwr2;
            if ((anwr2 = veu.a.g) == null) {
                anwr2 = anwr.a;
            }
            amnw a;
            if (anwr2.b == 256220752) {
                a = (amnw)anwr2.c;
            }
            else {
                a = amnw.a;
            }
            if ((a.b & 0x2) != 0x0) {
                anwr anwr3;
                if ((anwr3 = veu.a.g) == null) {
                    anwr3 = anwr.a;
                }
                amnw a2;
                if (anwr3.b == 256220752) {
                    a2 = (amnw)anwr3.c;
                }
                else {
                    a2 = amnw.a;
                }
                anss anss;
                if ((anss = a2.d) == null) {
                    anss = anss.a;
                }
                if (((agzd)anss).rs((agyr)FeedFilterChipBarRendererOuterClass.feedFilterChipBarRenderer)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean f(final String s) {
        return "FEwhat_to_watch".equals(s);
    }
    
    public static boolean g(final String s) {
        return "FEsubscriptions".equals(s);
    }
    
    public static CharSequence h(final Context context, final oas oas, final apdo apdo) {
        if (apdo == null) {
            return "";
        }
        ajsq ajsq;
        if ((ajsq = apdo.c) == null) {
            ajsq = ajsq.a;
        }
        final Spanned b = abyh.b(ajsq);
        if (!TextUtils.isEmpty((CharSequence)b)) {
            return (CharSequence)b;
        }
        if (apdo.b * 1000L < oas.c()) {
            return "";
        }
        return context.getString(2132018386, new Object[] { DateFormat.format((CharSequence)DateFormat.getBestDateTimePattern(Locale.getDefault(), "M d yy h mm a"), apdo.b * 1000L) });
    }
    
    public static void j(final jsg jsg, final tdz tdz) {
        jsg.getClass();
        tdz.getClass();
        jsg.h(jsm.a(tdz));
        jsg.g(jsk.a(tdz));
        jsg.f(jsi.a(tdz));
    }
    
    public static Class[] k(final jvu jvu, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { hxz.class };
        }
        if (n == 0) {
            jvu.b((hxz)o);
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static tqa l(final tku tku, final aply aply) {
        return (tqa)new tqf(tku, (tad)new jre(aply, 0), (aexg)new joy(aply, 6), 0);
    }
    
    public static tqa m(final tku tku, final aply aply) {
        return (tqa)new tqf(tku, (tad)new jre(aply, 2), (aexg)new joy(aply, 7), 0);
    }
    
    public static aagm n(final Context context, final qbo qbo) {
        final qmr a = qms.a(context);
        a.e("settings");
        a.f("settings.pb");
        final Uri a2 = a.a();
        final qoq a3 = qor.a();
        a3.e((MessageLite)jqz.a);
        a3.f(a2);
        return qbo.D(a3.a());
    }
    
    public static c o(final Context context, final Handler handler, final vax vax, final ViewGroup viewGroup) {
        final b b = new b(context);
        ((aazp)b).ml((aazq)new d(viewGroup, b));
        return (c)new f(b, Optional.of((Object)handler), vax);
    }
    
    public static ashe p(final Context context, final Handler handler, final ashe ashe, final ViewGroup viewGroup) {
        return ashe.W((asjc)new flh(context, handler, viewGroup, 13));
    }
    
    public static void q(final a a, final View view, final TextView textView, final ImageView imageView, final TextView textView2, final TextView textView3) {
        textView.setText((CharSequence)a.b);
        final Drawable d = a.d;
        if (d == null) {
            imageView.setVisibility(8);
        }
        else {
            imageView.setImageDrawable(d);
            imageView.setVisibility(0);
        }
        final String e = a.e;
        if (e == null) {
            textView2.setVisibility(8);
            textView3.setVisibility(8);
        }
        else {
            textView2.setText((CharSequence)e);
            textView2.setVisibility(0);
            a.e.getClass();
            if (!a.c) {
                textView3.setText((CharSequence)"\u2022");
                textView3.setVisibility(0);
            }
        }
        final CharSequence f = a.f;
        if (f != null) {
            view.setContentDescription(f);
        }
    }
    
    public static com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.c r(final int text, final List list, final AdapterView$OnItemClickListener onItemClickListener, final Context context, final DialogInterface$OnShowListener onShowListener, final DialogInterface$OnDismissListener onDismissListener) {
        final View inflate = LayoutInflater.from(context).inflate(2131624385, (ViewGroup)null);
        final TextView textView = (TextView)inflate.findViewById(2131427877);
        if (text == 0) {
            textView.setVisibility(8);
        }
        else {
            textView.setText(text);
        }
        final ListView listView = (ListView)inflate.findViewById(2131427875);
        final com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.d adapter = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.d(context);
        adapter.addAll((Collection)list);
        listView.setAdapter((ListAdapter)adapter);
        listView.setOnItemClickListener(onItemClickListener);
        listView.setOnTouchListener((View$OnTouchListener)new gmg(7));
        final com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.c c = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.c(context);
        ((fy)c).e();
        c.a = (adrk)new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.a(c);
        c.setOnShowListener(onShowListener);
        c.setOnDismissListener(onDismissListener);
        ((qu)c).setContentView(inflate);
        return c;
    }
    
    public static SimplePlaybackDescriptor s(final int n, final String s, final String s2, final ArrayList list, final int n2, final int n3, final int n4) {
        return new SimplePlaybackDescriptor(n, s, s2, list, n2, n3, n4);
    }
    
    public static RelatedVideoItem t(final String s, final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, final BitmapKey bitmapKey, final SelectableItemKey selectableItemKey, final agyc agyc) {
        return (RelatedVideoItem)new AutoValue_RelatedVideoItem(s, charSequence, charSequence2, charSequence3, bitmapKey, selectableItemKey, agyc);
    }
    
    public static com.google.android.apps.youtube.embeddedplayer.service.model.d u(final boolean b) {
        return new com.google.android.apps.youtube.embeddedplayer.service.model.d(b);
    }
    
    public static com.google.android.apps.youtube.embeddedplayer.service.model.c v(final CharSequence charSequence, final CharSequence charSequence2, final Bitmap bitmap) {
        return new com.google.android.apps.youtube.embeddedplayer.service.model.c(charSequence, charSequence2, bitmap);
    }
    
    public static MediaQueueData w(final MediaQueueData mediaQueueData) {
        return new MediaQueueData(mediaQueueData);
    }
    
    public static void x(final JSONObject jsonObject, final MediaQueueData mediaQueueData) {
        mediaQueueData.a();
        if (jsonObject == null) {
            return;
        }
        mediaQueueData.a = mmt.f(jsonObject, "id");
        mediaQueueData.b = mmt.f(jsonObject, "entity");
        final String optString = jsonObject.optString("queueType");
        final int hashCode = optString.hashCode();
        final int n = -1;
        final int n2 = 0;
        int i = 0;
        Label_0275: {
            switch (hashCode) {
                case 902303413: {
                    if (optString.equals("LIVE_TV")) {
                        i = 7;
                        break Label_0275;
                    }
                    break;
                }
                case 393100598: {
                    if (optString.equals("VIDEO_PLAYLIST")) {
                        i = 6;
                        break Label_0275;
                    }
                    break;
                }
                case 73549584: {
                    if (optString.equals("MOVIE")) {
                        i = 8;
                        break Label_0275;
                    }
                    break;
                }
                case 62359119: {
                    if (optString.equals("ALBUM")) {
                        i = 0;
                        break Label_0275;
                    }
                    break;
                }
                case -1088524588: {
                    if (optString.equals("TV_SERIES")) {
                        i = 5;
                        break Label_0275;
                    }
                    break;
                }
                case -1319760993: {
                    if (optString.equals("AUDIOBOOK")) {
                        i = 2;
                        break Label_0275;
                    }
                    break;
                }
                case -1632865838: {
                    if (optString.equals("PLAYLIST")) {
                        i = 1;
                        break Label_0275;
                    }
                    break;
                }
                case -1758903120: {
                    if (optString.equals("RADIO_STATION")) {
                        i = 3;
                        break Label_0275;
                    }
                    break;
                }
                case -1803151310: {
                    if (optString.equals("PODCAST_SERIES")) {
                        i = 4;
                        break Label_0275;
                    }
                    break;
                }
            }
            i = -1;
        }
        switch (i) {
            case 8: {
                mediaQueueData.c = 9;
                break;
            }
            case 7: {
                mediaQueueData.c = 8;
                break;
            }
            case 6: {
                mediaQueueData.c = 7;
                break;
            }
            case 5: {
                mediaQueueData.c = 6;
                break;
            }
            case 4: {
                mediaQueueData.c = 5;
                break;
            }
            case 3: {
                mediaQueueData.c = 4;
                break;
            }
            case 2: {
                mediaQueueData.c = 3;
                break;
            }
            case 1: {
                mediaQueueData.c = 2;
                break;
            }
            case 0: {
                mediaQueueData.c = 1;
                break;
            }
        }
        mediaQueueData.d = mmt.f(jsonObject, "name");
        JSONObject optJSONObject;
        if (jsonObject.has("containerMetadata")) {
            optJSONObject = jsonObject.optJSONObject("containerMetadata");
        }
        else {
            optJSONObject = null;
        }
        if (optJSONObject != null) {
            final Object g = new MediaQueueContainerMetadata();
            ((MediaQueueContainerMetadata)g).a();
            final String optString2 = optJSONObject.optString("containerType", "");
            final int hashCode2 = optString2.hashCode();
            if (hashCode2 != 6924225) {
                if (hashCode2 != 828666841) {
                    i = n;
                }
                else {
                    i = n;
                    if (optString2.equals("GENERIC_CONTAINER")) {
                        i = 0;
                    }
                }
            }
            else {
                i = n;
                if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                    i = 1;
                }
            }
            if (i != 0) {
                if (i == 1) {
                    ((MediaQueueContainerMetadata)g).a = 1;
                }
            }
            else {
                ((MediaQueueContainerMetadata)g).a = 0;
            }
            ((MediaQueueContainerMetadata)g).b = mmt.f(optJSONObject, "title");
            final JSONArray optJSONArray = optJSONObject.optJSONArray("sections");
            if (optJSONArray != null) {
                ((MediaQueueContainerMetadata)g).c = new ArrayList();
                final List c = ((MediaQueueContainerMetadata)g).c;
                for (i = 0; i < optJSONArray.length(); ++i) {
                    final JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        final MediaMetadata mediaMetadata = new MediaMetadata(0);
                        mediaMetadata.b(optJSONObject2);
                        c.add(mediaMetadata);
                    }
                }
            }
            final JSONArray optJSONArray2 = optJSONObject.optJSONArray("containerImages");
            if (optJSONArray2 != null) {
                mni.b(((MediaQueueContainerMetadata)g).d = new ArrayList(), optJSONArray2);
            }
            ((MediaQueueContainerMetadata)g).e = optJSONObject.optDouble("containerDuration", ((MediaQueueContainerMetadata)g).e);
            mediaQueueData.e = new MediaQueueContainerMetadata((MediaQueueContainerMetadata)g);
        }
        final Integer t = mlc.t(jsonObject.optString("repeatMode"));
        if (t != null) {
            mediaQueueData.f = t;
        }
        final JSONArray optJSONArray3 = jsonObject.optJSONArray("items");
        Label_0826: {
            if (optJSONArray3 == null) {
                break Label_0826;
            }
            mediaQueueData.g = new ArrayList();
            final Object g = mediaQueueData.g;
            i = n2;
        Label_0820_Outer:
            while (true) {
                if (i >= optJSONArray3.length()) {
                    break Label_0826;
                }
                final JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i);
                while (true) {
                    if (optJSONObject3 == null) {
                        break Label_0820;
                    }
                    try {
                        ((List<MediaQueueItem>)g).add(new MediaQueueItem(optJSONObject3));
                        ++i;
                        continue Label_0820_Outer;
                        while (true) {
                            mediaQueueData.i = mmt.b(jsonObject.optDouble("startTime", (double)mediaQueueData.i));
                            Label_0870: {
                                mediaQueueData.j = jsonObject.optBoolean("shuffle");
                            }
                            return;
                            mediaQueueData.h = jsonObject.optInt("startIndex", mediaQueueData.h);
                            iftrue(Label_0870:)(!jsonObject.has("startTime"));
                            continue;
                        }
                    }
                    catch (final JSONException ex) {
                        continue;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    public static String y(final String s) {
        if (s != null) {
            return z("com.google.android.gms.cast.CATEGORY_CAST", s, null);
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }
    
    public static String z(String s, final String s2, final Collection collection) {
        final StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        s = s2.toUpperCase(Locale.ROOT);
        if (s.matches("[A-F0-9]+")) {
            sb.append("/");
            sb.append(s);
            if (collection != null) {
                if (collection.isEmpty()) {
                    throw new IllegalArgumentException("Must specify at least one namespace");
                }
                sb.append("/");
                final Iterator iterator = collection.iterator();
                int n = 1;
                while (iterator.hasNext()) {
                    s = (String)iterator.next();
                    mmt.j(s);
                    if (n == 0) {
                        sb.append(",");
                    }
                    if (!mmt.a.matcher(s).matches()) {
                        final StringBuilder sb2 = new StringBuilder(s.length());
                        for (int i = 0; i < s.length(); ++i) {
                            final char char1 = s.charAt(i);
                            if ((char1 < 'A' || char1 > 'Z') && (char1 < 'a' || char1 > 'z') && (char1 < '0' || char1 > '9') && char1 != '_') {
                                if (char1 != '-') {
                                    if (char1 != '.' && char1 != ':') {
                                        sb2.append(String.format("%%%04x", (int)char1));
                                        continue;
                                    }
                                }
                            }
                            sb2.append(char1);
                        }
                        s = sb2.toString();
                    }
                    sb.append(s);
                    n = 0;
                }
            }
            if (collection == null) {
                sb.append("/");
            }
            sb.append("//ALLOW_IPV6");
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid application ID: ".concat(s2));
    }
    
    public void A() {
        throw null;
    }
    
    public void B(final int n) {
        throw null;
    }
    
    public void C(final int n) {
        throw null;
    }
    
    public void D(final int n) {
        throw null;
    }
    
    public void E(final int n) {
    }
    
    public void F(final int n) {
    }
    
    public void G(final ApplicationMetadata applicationMetadata) {
    }
    
    public void H() {
    }
    
    public void I(final int n) {
    }
    
    public void J() {
    }
    
    public void a(final lzn lzn) {
        throw null;
    }
}
