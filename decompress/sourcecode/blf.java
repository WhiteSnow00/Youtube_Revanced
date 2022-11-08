import android.media.MediaDrm$KeyRequest;
import android.text.TextUtils;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import androidx.media3.common.DrmInitData$SchemeData;
import java.util.HashMap;
import java.util.List;
import android.media.MediaDrm$ProvisionRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.media.MediaCryptoException;
import android.media.MediaCrypto;
import android.media.MediaDrm$OnEventListener;
import java.util.Map;
import androidx.media3.decoder.CryptoConfig;
import android.media.UnsupportedSchemeException;
import java.util.UUID;
import android.media.MediaDrm;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blf implements bkz
{
    public static final blc b;
    public final MediaDrm a;
    private final UUID c;
    private int d;
    
    static {
        b = blc.a;
    }
    
    private blf(final UUID c) {
        dk.d((Object)c);
        dk.g(axy.b.equals(c) ^ true, (Object)"Use C.CLEARKEY_UUID instead");
        this.c = c;
        final MediaDrm a = new MediaDrm(r(c));
        this.a = a;
        this.d = 1;
        if (axy.d.equals(c) && "ASUS_Z00AD".equals(baw.d)) {
            a.setPropertyString("securityLevel", "L3");
        }
    }
    
    public static blf q(final UUID uuid) {
        try {
            return new blf(uuid);
        }
        catch (final Exception ex) {
            throw new blk(2, ex);
        }
        catch (final UnsupportedSchemeException ex2) {
            throw new blk(1, (Exception)ex2);
        }
    }
    
    private static UUID r(final UUID uuid) {
        UUID b = uuid;
        if (baw.a < 27) {
            b = uuid;
            if (axy.c.equals(uuid)) {
                b = axy.b;
            }
        }
        return b;
    }
    
    public final int a() {
        return 2;
    }
    
    public final Map c(final byte[] array) {
        return this.a.queryKeyStatus(array);
    }
    
    public final void d(final byte[] array) {
        this.a.closeSession(array);
    }
    
    public final void e(final byte[] array) {
        this.a.provideProvisionResponse(array);
    }
    
    public final void f() {
        synchronized (this) {
            final int d = this.d - 1;
            this.d = d;
            if (d == 0) {
                this.a.release();
            }
        }
    }
    
    public final void g(final byte[] array, final byte[] array2) {
        this.a.restoreKeys(array, array2);
    }
    
    public final void h(final bky bky) {
        final MediaDrm a = this.a;
        Object onEventListener;
        if (bky == null) {
            onEventListener = null;
        }
        else {
            onEventListener = new bld(bky);
        }
        a.setOnEventListener((MediaDrm$OnEventListener)onEventListener);
    }
    
    public final void i(final byte[] array, final bgz bgz) {
        if (baw.a >= 31) {
            try {
                ble.a(this.a, array, bgz);
            }
            catch (final UnsupportedOperationException ex) {
                bao.c("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }
    
    public final void j(final String s, final String s2) {
        this.a.setPropertyString(s, s2);
    }
    
    public final boolean k(byte[] array, final String s) {
        if (baw.a >= 31) {
            return ble.b(this.a, s);
        }
        try {
            array = (byte[])(Object)new MediaCrypto(this.c, array);
            try {
                return ((MediaCrypto)(Object)array).requiresSecureDecoderComponent(s);
            }
            finally {
                ((MediaCrypto)(Object)array).release();
            }
        }
        catch (final MediaCryptoException ex) {
            return true;
        }
    }
    
    public final byte[] l() {
        return this.a.openSession();
    }
    
    public final byte[] m(final byte[] array, final byte[] array2) {
        byte[] aj = array2;
        if (axy.c.equals(this.c)) {
            aj = array2;
            if (baw.a < 27) {
                try {
                    final JSONObject jsonObject = new JSONObject(baw.N(array2));
                    final StringBuilder sb = new StringBuilder("{\"keys\":[");
                    final JSONArray jsonArray = jsonObject.getJSONArray("keys");
                    for (int i = 0; i < jsonArray.length(); ++i) {
                        if (i != 0) {
                            sb.append(",");
                        }
                        final JSONObject jsonObject2 = jsonArray.getJSONObject(i);
                        sb.append("{\"k\":\"");
                        sb.append(bhs.b(jsonObject2.getString("k")));
                        sb.append("\",\"kid\":\"");
                        sb.append(bhs.b(jsonObject2.getString("kid")));
                        sb.append("\",\"kty\":\"");
                        sb.append(jsonObject2.getString("kty"));
                        sb.append("\"}");
                    }
                    sb.append("]}");
                    aj = baw.aj(sb.toString());
                }
                catch (final JSONException ex) {
                    bao.b("ClearKeyUtil", "Failed to adjust response data: ".concat(baw.N(array2)), (Throwable)ex);
                    aj = array2;
                }
            }
        }
        return this.a.provideKeyResponse(array, aj);
    }
    
    public final String n() {
        return this.a.getPropertyString("securityLevel");
    }
    
    public final eaa o() {
        final MediaDrm$ProvisionRequest provisionRequest = this.a.getProvisionRequest();
        return new eaa(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }
    
    public final eaa p(byte[] array, final List list, int a, final HashMap hashMap) {
        DrmInitData$SchemeData drmInitData$SchemeData = null;
        Object o;
        String c3;
        if (list != null) {
            Label_0333: {
                if (!axy.d.equals(this.c)) {
                    drmInitData$SchemeData = list.get(0);
                }
                else {
                    Label_0265: {
                        if (baw.a >= 28 && list.size() > 1) {
                            final DrmInitData$SchemeData drmInitData$SchemeData2 = list.get(0);
                            int i = 0;
                            int n = 0;
                            while (i < list.size()) {
                                final DrmInitData$SchemeData drmInitData$SchemeData3 = list.get(i);
                                final byte[] array2 = (byte[])dk.d((Object)drmInitData$SchemeData3.d);
                                if (!baw.aa(drmInitData$SchemeData3.c, drmInitData$SchemeData2.c) || !baw.aa(drmInitData$SchemeData3.b, drmInitData$SchemeData2.b) || byl.i(array2) == null) {
                                    break Label_0265;
                                }
                                n += array2.length;
                                ++i;
                            }
                            final byte[] array3 = new byte[n];
                            int j = 0;
                            int n2 = 0;
                            while (j < list.size()) {
                                final byte[] array4 = (byte[])dk.d((Object)list.get(j).d);
                                final int length = array4.length;
                                System.arraycopy(array4, 0, array3, n2, length);
                                n2 += length;
                                ++j;
                            }
                            drmInitData$SchemeData = new DrmInitData$SchemeData(drmInitData$SchemeData2.a, drmInitData$SchemeData2.b, drmInitData$SchemeData2.c, array3);
                            break Label_0333;
                        }
                    }
                    for (int k = 0; k < list.size(); ++k) {
                        final DrmInitData$SchemeData drmInitData$SchemeData4 = list.get(k);
                        if (byl.a((byte[])dk.d((Object)drmInitData$SchemeData4.d)) == 1) {
                            drmInitData$SchemeData = drmInitData$SchemeData4;
                            break Label_0333;
                        }
                    }
                    drmInitData$SchemeData = list.get(0);
                }
            }
            final UUID c = this.c;
            byte[] c2;
            byte[] array5 = c2 = (byte[])dk.d((Object)drmInitData$SchemeData.d);
            if (axy.e.equals(c)) {
                final byte[] e = byl.e(array5, c);
                if (e != null) {
                    array5 = e;
                }
                final UUID e2 = axy.e;
                final bar bar = new bar(array5);
                final int e3 = bar.e();
                final short y = bar.y();
                final short y2 = bar.y();
                if (y == 1 && y2 == 1) {
                    final String x = bar.x(bar.y(), aexb.d);
                    if (!x.contains("<LA_URL>")) {
                        int index;
                        if ((index = x.indexOf("</DATA>")) == -1) {
                            bao.c("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                            index = -1;
                        }
                        final String substring = x.substring(0, index);
                        final String substring2 = x.substring(index);
                        final StringBuilder sb = new StringBuilder();
                        sb.append(substring);
                        sb.append("<LA_URL>https://x</LA_URL>");
                        sb.append(substring2);
                        final String string = sb.toString();
                        final int n3 = e3 + 52;
                        final ByteBuffer allocate = ByteBuffer.allocate(n3);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(n3);
                        allocate.putShort((short)1);
                        allocate.putShort((short)1);
                        final int length2 = string.length();
                        allocate.putShort((short)(length2 + length2));
                        allocate.put(string.getBytes(aexb.d));
                        array5 = allocate.array();
                    }
                }
                else {
                    bao.f();
                }
                c2 = byl.c(e2, array5);
            }
            final int a2 = baw.a;
            o = c2;
            Label_0763: {
                if (axy.e.equals(c)) {
                    o = c2;
                    if ("Amazon".equals(baw.c)) {
                        if (!"AFTB".equals(baw.d) && !"AFTS".equals(baw.d) && !"AFTM".equals(baw.d)) {
                            o = c2;
                            if (!"AFTT".equals(baw.d)) {
                                break Label_0763;
                            }
                        }
                        final byte[] e4 = byl.e(c2, c);
                        o = c2;
                        if (e4 != null) {
                            o = e4;
                        }
                    }
                }
            }
            c3 = drmInitData$SchemeData.c;
        }
        else {
            drmInitData$SchemeData = null;
            o = (c3 = null);
        }
        final MediaDrm$KeyRequest keyRequest = this.a.getKeyRequest(array, (byte[])o, c3, a, hashMap);
        final UUID c4 = this.c;
        byte[] array6;
        array = (array6 = keyRequest.getData());
        if (axy.c.equals(c4)) {
            if (baw.a >= 27) {
                array6 = array;
            }
            else {
                array6 = baw.aj(baw.N(array).replace('+', '-').replace('/', '_'));
            }
        }
        final String defaultUrl = keyRequest.getDefaultUrl();
        String s = null;
        Label_0914: {
            if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
                s = defaultUrl;
                if (baw.a != 33) {
                    break Label_0914;
                }
                s = defaultUrl;
                if (!"https://default.url".equals(defaultUrl)) {
                    break Label_0914;
                }
            }
            s = "";
        }
        String b = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            b = s;
            if (drmInitData$SchemeData != null) {
                b = s;
                if (!TextUtils.isEmpty((CharSequence)drmInitData$SchemeData.b)) {
                    b = drmInitData$SchemeData.b;
                }
            }
        }
        a = baw.a;
        keyRequest.getRequestType();
        return new eaa(array6, b);
    }
}
