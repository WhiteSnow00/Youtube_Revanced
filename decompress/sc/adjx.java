import android.os.Parcelable;
import android.os.Bundle;
import java.util.ArrayList;
import j$.util.Objects;
import android.database.Cursor;
import com.google.protobuf.ExtensionRegistryLite;
import android.net.Uri;
import android.content.Intent;
import java.util.regex.Pattern;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjx
{
    public static final String[] a;
    public final ContentResolver b;
    private final ziy c;
    
    static {
        a = new String[] { "_id", "mime_type", "duration", "latitude", "longitude", "_size" };
        Pattern.compile("^(\\p{Digit}+@)?media");
    }
    
    public adjx(final ContentResolver b, final ziy c, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = c;
    }
    
    public static Uri a(final Intent intent) {
        if (intent == null) {
            return Uri.EMPTY;
        }
        final String action = intent.getAction();
        if (action == null) {
            return Uri.EMPTY;
        }
        if (!action.equals("com.google.android.youtube.intent.action.INTERNAL_UPLOAD")) {
            return Uri.EMPTY;
        }
        Uri empty;
        if ((empty = (Uri)intent.getParcelableExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_edited_video_uri")) == null) {
            empty = Uri.EMPTY;
        }
        return empty;
    }
    
    public static aezp b(final Intent intent) {
        if (intent != null) {
            if (intent.hasExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_shorts_creation")) {
                final byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_shorts_creation");
                if (byteArrayExtra == null) {
                    return (aezp)aeyo.a;
                }
                try {
                    return aezp.j((Object)ahbh.parseFrom((ahbh)apos.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry()));
                }
                catch (final ahca ahca) {
                    return (aezp)aeyo.a;
                }
            }
        }
        return (aezp)aeyo.a;
    }
    
    public static aphs c(final Intent intent) {
        final String action = intent.getAction();
        if (action == null) {
            return aphs.a;
        }
        int n = 0;
        Label_0121: {
            switch (action.hashCode()) {
                case 1004674969: {
                    if (action.equals("com.google.android.youtube.intent.action.UPLOAD")) {
                        n = 1;
                        break Label_0121;
                    }
                    break;
                }
                case 895964971: {
                    if (action.equals("com.google.android.youtube.intent.action.INTERNAL_UPLOAD")) {
                        n = 0;
                        break Label_0121;
                    }
                    break;
                }
                case -58484670: {
                    if (action.equals("android.intent.action.SEND_MULTIPLE")) {
                        n = 3;
                        break Label_0121;
                    }
                    break;
                }
                case -1173264947: {
                    if (action.equals("android.intent.action.SEND")) {
                        n = 2;
                        break Label_0121;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n != 0) {
            if (n != 1 && n != 2 && n != 3) {
                return aphs.a;
            }
            final int intExtra = intent.getIntExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", 5);
            aphs aphs;
            if ((aphs = aphs.b(intExtra)) == null) {
                aphs = aphs.f;
            }
            if (intExtra >= 64 && intExtra <= 127) {
                return aphs;
            }
            return aphs.f;
        }
        else {
            final aphs b = aphs.b(intent.getIntExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", 4));
            if (b != null) {
                return b;
            }
            return aphs.e;
        }
    }
    
    public static Long d(final Cursor cursor, final String s) {
        final int columnIndex = cursor.getColumnIndex(s);
        if (columnIndex >= 0 && !cursor.isNull(columnIndex)) {
            return cursor.getLong(columnIndex);
        }
        return null;
    }
    
    public static Long e(final Intent intent) {
        Long value;
        final Long n = value = null;
        if (intent != null) {
            value = n;
            if (intent.hasExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_duration_ms")) {
                value = intent.getLongExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_duration_ms", 0L);
                if (value <= 0L) {
                    return null;
                }
            }
        }
        return value;
    }
    
    public static boolean f(final Intent intent) {
        return intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_uses_yt_audio_source", false);
    }
    
    public static boolean g(final aphs aphs) {
        final aphs a = aphs.a;
        final admt a2 = admt.a;
        switch (aphs.ordinal()) {
            default: {
                return true;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8: {
                return false;
            }
        }
    }
    
    public static boolean h(final Intent intent, final Intent intent2) {
        if (intent == null || !intent.filterEquals(intent2)) {
            return false;
        }
        if (intent.hasExtra("android.intent.extra.STREAM") != intent2.hasExtra("android.intent.extra.STREAM")) {
            return false;
        }
        if (!intent.hasExtra("android.intent.extra.STREAM")) {
            return true;
        }
        final Bundle extras = intent.getExtras();
        final Bundle extras2 = intent2.getExtras();
        if (extras == null || extras2 == null) {
            return Objects.equals((Object)extras, (Object)extras2);
        }
        final Parcelable parcelable = extras.getParcelable("android.intent.extra.STREAM");
        final Parcelable parcelable2 = extras2.getParcelable("android.intent.extra.STREAM");
        if (parcelable instanceof Uri && parcelable2 instanceof Uri) {
            return ((Uri)parcelable).equals((Object)parcelable2);
        }
        if (!Objects.equals((Object)parcelable, (Object)parcelable2)) {
            return false;
        }
        final Object value = extras.get("android.intent.extra.STREAM");
        final Object value2 = extras2.get("android.intent.extra.STREAM");
        if (value instanceof ArrayList && value2 instanceof ArrayList) {
            final ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            if (parcelableArrayListExtra != null) {
                return parcelableArrayListExtra.equals(intent2.getParcelableArrayListExtra("android.intent.extra.STREAM"));
            }
        }
        if (value instanceof String && value2 instanceof String) {
            final String stringExtra = intent.getStringExtra("android.intent.extra.STREAM");
            if (stringExtra != null) {
                return stringExtra.equals(intent2.getStringExtra("android.intent.extra.STREAM"));
            }
        }
        return Objects.equals(value, value2);
    }
    
    public static admt j(int n) {
        final aphs a = aphs.a;
        final admt a2 = admt.a;
        if (--n == 1) {
            return admt.b;
        }
        if (n == 2) {
            return admt.d;
        }
        if (n == 4) {
            return admt.c;
        }
        if (n == 5) {
            return admt.e;
        }
        if (n != 6) {
            ttr.b("Unsupported upload flow flavor.");
            return admt.a;
        }
        return admt.f;
    }
    
    public static int k(final Intent intent) {
        if (intent == null) {
            return 2;
        }
        final int ab = aqsx.aB(intent.getIntExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_flavor", 1));
        if (ab != 0) {
            return ab;
        }
        return 2;
    }
    
    public static int l(final admt admt) {
        if (admt == null) {
            return 1;
        }
        final aphs a = aphs.a;
        final int ordinal = admt.ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 5;
        }
        if (ordinal == 3) {
            return 3;
        }
        if (ordinal == 4) {
            return 6;
        }
        if (ordinal != 5) {
            ttr.b("Unsupported upload type.");
            return 1;
        }
        return 7;
    }
    
    public static ahaz m(final asji asji, final ahaz ahaz, final Object o, final String s) {
        if (o != null) {
            try {
                return (ahaz)asji.a(ahaz, o);
            }
            catch (final Exception ex) {
                ttr.l("Cannot apply media store video metadata.");
            }
        }
        ttr.l(s);
        return ahaz;
    }
    
    public final boolean i(final Intent intent) {
        return (boolean)(boolean)((vai)this.c.b).l(45365900L).aM() || (intent != null && intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_hide_preview", false));
    }
}
