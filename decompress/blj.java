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

public final class blj implements bld
{
    public static final blg b;
    public final MediaDrm a;
    private final UUID c;
    private int d;
    
    static {
        b = blg.a;
    }
    
    private blj(final UUID c) {
        bad.b(c);
        bad.e(aya.b.equals(c) ^ true, "Use C.CLEARKEY_UUID instead");
        this.c = c;
        final MediaDrm a = new MediaDrm(r(c));
        this.a = a;
        this.d = 1;
        if (aya.d.equals(c) && "ASUS_Z00AD".equals(baz.d)) {
            a.setPropertyString("securityLevel", "L3");
        }
    }
    
    public static blj q(final UUID uuid) {
        try {
            return new blj(uuid);
        }
        catch (final Exception ex) {
            throw new blo(2, ex);
        }
        catch (final UnsupportedSchemeException ex2) {
            throw new blo(1, (Exception)ex2);
        }
    }
    
    private static UUID r(final UUID uuid) {
        UUID b = uuid;
        if (baz.a < 27) {
            b = uuid;
            if (aya.c.equals(uuid)) {
                b = aya.b;
            }
        }
        return b;
    }
    
    @Override
    public final int a() {
        return 2;
    }
    
    @Override
    public final /* bridge */ CryptoConfig b(final byte[] array) {
        final int a = baz.a;
        return (CryptoConfig)new ble(r(this.c), array);
    }
    
    @Override
    public final Map c(final byte[] array) {
        return this.a.queryKeyStatus(array);
    }
    
    @Override
    public final void d(final byte[] array) {
        this.a.closeSession(array);
    }
    
    @Override
    public final void e(final byte[] array) {
        this.a.provideProvisionResponse(array);
    }
    
    @Override
    public final void f() {
        synchronized (this) {
            final int d = this.d - 1;
            this.d = d;
            if (d == 0) {
                this.a.release();
            }
        }
    }
    
    @Override
    public final void g(final byte[] array, final byte[] array2) {
        this.a.restoreKeys(array, array2);
    }
    
    @Override
    public final void h(final blc blc) {
        final MediaDrm a = this.a;
        Object onEventListener;
        if (blc == null) {
            onEventListener = null;
        }
        else {
            onEventListener = new blh(blc);
        }
        a.setOnEventListener((MediaDrm$OnEventListener)onEventListener);
    }
    
    @Override
    public final void i(final byte[] array, final bhd bhd) {
        if (baz.a >= 31) {
            try {
                bli.a(this.a, array, bhd);
            }
            catch (final UnsupportedOperationException ex) {
                baq.c("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }
    
    @Override
    public final void j(final String s, final String s2) {
        this.a.setPropertyString(s, s2);
    }
    
    @Override
    public final boolean k(byte[] array, final String s) {
        if (baz.a >= 31) {
            return bli.b(this.a, s);
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
    
    @Override
    public final byte[] l() {
        return this.a.openSession();
    }
    
    @Override
    public final byte[] m(final byte[] array, final byte[] array2) {
        byte[] aj = array2;
        if (aya.c.equals(this.c)) {
            aj = array2;
            if (baz.a < 27) {
                try {
                    final JSONObject jsonObject = new JSONObject(baz.N(array2));
                    final StringBuilder sb = new StringBuilder("{\"keys\":[");
                    final JSONArray jsonArray = jsonObject.getJSONArray("keys");
                    for (int i = 0; i < jsonArray.length(); ++i) {
                        if (i != 0) {
                            sb.append(",");
                        }
                        final JSONObject jsonObject2 = jsonArray.getJSONObject(i);
                        sb.append("{\"k\":\"");
                        sb.append(bhx.b(jsonObject2.getString("k")));
                        sb.append("\",\"kid\":\"");
                        sb.append(bhx.b(jsonObject2.getString("kid")));
                        sb.append("\",\"kty\":\"");
                        sb.append(jsonObject2.getString("kty"));
                        sb.append("\"}");
                    }
                    sb.append("]}");
                    aj = baz.aj(sb.toString());
                }
                catch (final JSONException ex) {
                    baq.b("ClearKeyUtil", "Failed to adjust response data: ".concat(baz.N(array2)), (Throwable)ex);
                    aj = array2;
                }
            }
        }
        return this.a.provideKeyResponse(array, aj);
    }
    
    @Override
    public final String n() {
        return this.a.getPropertyString("securityLevel");
    }
    
    @Override
    public final eae o() {
        final MediaDrm$ProvisionRequest provisionRequest = this.a.getProvisionRequest();
        return new eae(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }
    
    @Override
    public final eae p(byte[] array, final List list, int a, final HashMap hashMap) {
        DrmInitData$SchemeData drmInitData$SchemeData = null;
        byte[] array6;
        String c2;
        if (list != null) {
            Label_0333: {
                if (!aya.d.equals(this.c)) {
                    drmInitData$SchemeData = list.get(0);
                }
                else {
                    Label_0265: {
                        if (baz.a >= 28 && list.size() > 1) {
                            final DrmInitData$SchemeData drmInitData$SchemeData2 = list.get(0);
                            int i = 0;
                            int n = 0;
                            while (i < list.size()) {
                                final DrmInitData$SchemeData drmInitData$SchemeData3 = list.get(i);
                                final byte[] array2 = (byte[])bad.b(drmInitData$SchemeData3.d);
                                if (!baz.aa(drmInitData$SchemeData3.c, drmInitData$SchemeData2.c) || !baz.aa(drmInitData$SchemeData3.b, drmInitData$SchemeData2.b) || bhw.l(array2) == null) {
                                    break Label_0265;
                                }
                                n += array2.length;
                                ++i;
                            }
                            final byte[] array3 = new byte[n];
                            int j = 0;
                            int n2 = 0;
                            while (j < list.size()) {
                                final byte[] array4 = (byte[])bad.b(list.get(j).d);
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
                        if (bhw.c((byte[])bad.b(drmInitData$SchemeData4.d)) == 1) {
                            drmInitData$SchemeData = drmInitData$SchemeData4;
                            break Label_0333;
                        }
                    }
                    drmInitData$SchemeData = list.get(0);
                }
            }
            final UUID c = this.c;
            byte[] e;
            byte[] array5 = e = (byte[])bad.b(drmInitData$SchemeData.d);
            if (aya.e.equals(c)) {
                final byte[] g = bhw.g(array5, c);
                if (g != null) {
                    array5 = g;
                }
                final UUID e2 = aya.e;
                final bat bat = new bat(array5);
                final int e3 = bat.e();
                final short y = bat.y();
                final short y2 = bat.y();
                if (y == 1 && y2 == 1) {
                    final String x = bat.x(bat.y(), afas.d);
                    if (!x.contains("<LA_URL>")) {
                        int index;
                        if ((index = x.indexOf("</DATA>")) == -1) {
                            baq.c("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
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
                        allocate.put(string.getBytes(afas.d));
                        array5 = allocate.array();
                    }
                }
                else {
                    baq.f();
                }
                e = bhw.e(e2, array5);
            }
            final int a2 = baz.a;
            array6 = e;
            Label_0763: {
                if (aya.e.equals(c)) {
                    array6 = e;
                    if ("Amazon".equals(baz.c)) {
                        if (!"AFTB".equals(baz.d) && !"AFTS".equals(baz.d) && !"AFTM".equals(baz.d)) {
                            array6 = e;
                            if (!"AFTT".equals(baz.d)) {
                                break Label_0763;
                            }
                        }
                        final byte[] g2 = bhw.g(e, c);
                        array6 = e;
                        if (g2 != null) {
                            array6 = g2;
                        }
                    }
                }
            }
            c2 = drmInitData$SchemeData.c;
        }
        else {
            drmInitData$SchemeData = null;
            array6 = null;
            c2 = null;
        }
        final MediaDrm$KeyRequest keyRequest = this.a.getKeyRequest(array, array6, c2, a, hashMap);
        final UUID c3 = this.c;
        byte[] array7;
        array = (array7 = keyRequest.getData());
        if (aya.c.equals(c3)) {
            if (baz.a >= 27) {
                array7 = array;
            }
            else {
                array7 = baz.aj(baz.N(array).replace('+', '-').replace('/', '_'));
            }
        }
        final String defaultUrl = keyRequest.getDefaultUrl();
        String s = null;
        Label_0913: {
            if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
                s = defaultUrl;
                if (baz.a != 33) {
                    break Label_0913;
                }
                s = defaultUrl;
                if (!"https://default.url".equals(defaultUrl)) {
                    break Label_0913;
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
        a = baz.a;
        keyRequest.getRequestType();
        return new eae(array7, b);
    }
}
