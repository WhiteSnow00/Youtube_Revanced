import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.Iterator;
import java.io.IOException;
import java.security.GeneralSecurityException;
import com.google.protobuf.ExtensionRegistryLite;
import io.grpc.Status;
import android.net.Uri;
import android.view.ViewGroup$LayoutParams;
import j$.util.Optional;
import java.util.Map;
import java.util.EnumMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arzw
{
    public Object a;
    public Object b;
    public Object c;
    
    public arzw() {
    }
    
    public arzw(final aeru a, final yul c, final yui b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public arzw(final auip auip, final byte[] array) {
        this.c = auip.c;
        this.a = new EnumMap((Map<Enum, ?>)auip.b);
        this.b = new EnumMap((Map<Enum, ?>)auip.a);
    }
    
    public arzw(final spy spy) {
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.b = spy.a;
        this.c = spy.b;
        this.a = spy.c;
    }
    
    public arzw(final byte[] array) {
        this.a("", new EnumMap((Class<K>)agxe.class));
    }
    
    public arzw(final byte[] array, final byte[] array2) {
    }
    
    public arzw(final byte[] array, final byte[] array2, final byte[] array3) {
        final aewp a = aewp.a;
        this.b = a;
        this.c = a;
    }
    
    public arzw(final byte[] array, final byte[] array2, final char[] array3) {
        this.b = Optional.empty();
        this.c = Optional.empty();
    }
    
    public arzw(final byte[] array, final char[] array2) {
        this.b = aewp.a;
    }
    
    public arzw(final byte[] array, final short[] array2) {
    }
    
    public arzw(final char[] array) {
        this.c = "";
        this.a = "";
        this.b = "";
    }
    
    public arzw(final char[] array, final byte[] array2) {
    }
    
    public arzw(final short[] array) {
        this(null, null, null, null, null);
    }
    
    public arzw(final short[] array, final byte[] array2) {
    }
    
    public static final void w(final nsu nsu) {
        nsu.e = 3;
        final nrz layoutParams = new nrz(-1, -2, (byte)16, -10);
        layoutParams.c();
        nsu.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public static final void x(final nsu nsu) {
        nsu.e = 4;
        final nrz layoutParams = new nrz(-2, -1, (byte)1, -10);
        layoutParams.c();
        nsu.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public static final float y(final int n) {
        if (n > 1) {
            return 0.7f;
        }
        return 0.65f;
    }
    
    public static final athj z() {
        return new athj(nua.a);
    }
    
    public final void a(final String c, final EnumMap a) {
        this.c = c;
        this.a = a;
        this.b = new EnumMap((Class<Enum>)agxe.class);
    }
    
    public final aeov b() {
        final Object c = this.c;
        final boolean b = true;
        agot.E(c != null, (Object)"Every SyncletBinding must have a non-null SyncKey.");
        agot.E(this.b != null, (Object)"Every SyncletBinding must have a non-null SyncConfig.");
        agot.E(this.a != null && b, (Object)"Every SyncletBinding must have a non-null Synclet.");
        return new aeov((aeot)this.c, (aeoq)this.b, (atjj)this.a);
    }
    
    @Deprecated
    public final void c(final aeou aeou) {
        aeou.getClass();
        this.a = new aauf(aeou, 8);
    }
    
    public final adnx d() {
        final Object a = this.a;
        if (a != null) {
            final Object c = this.c;
            if (c != null) {
                return new adnx((String)a, (afdu)c, (aexq)this.b);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.c == null) {
            sb.append(" unmetRequirements");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void e(final aexq b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null retryTime");
    }
    
    public final void f(final afdu c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null unmetRequirements");
    }
    
    public final adhv g() {
        final Object a = this.a;
        if (a != null) {
            return new adhv((Uri)a, (aexq)this.b, (aexq)this.c);
        }
        throw new IllegalStateException("Missing required properties: uri");
    }
    
    public final yuj h() {
        return new yuj((aeru)this.a, (yul)this.c, (yui)this.b, (byte[])null, (byte[])null);
    }
    
    public final vjm i() {
        if (this.a != null && this.c != null) {
            return new vjm((aext)this.a, (trb)this.b, (tri)this.c);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" isErrorRetryable");
        }
        if (this.c == null) {
            sb.append(" exponentialBackoff");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void j(final aext a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null isErrorRetryable");
    }
    
    public final vee k() {
        if (this.c != null && this.b != null) {
            return new vee((vdm)this.a, (vdn)this.c, (ahca)this.b);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" metadata");
        }
        if (this.b == null) {
            sb.append(" applicability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void l(final ahca b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null applicability");
    }
    
    public final void m(final vdn c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null metadata");
    }
    
    public final Status n(String c, final byte[] array, final byte[] array2) {
        try {
            agdd.a();
            this.a = afvb.c(adcr.S(array)).b((Class)afvk.class);
            this.c = c;
            final aqpz aqpz = (aqpz)agzi.parseFrom((agzi)aqpz.a, array2, ExtensionRegistryLite.getGeneratedRegistry());
            if ((aqpz.b & 0x1) == 0x0) {
                throw new GeneralSecurityException("Missing signed_keyset");
            }
            aqqb aqqb;
            if ((aqqb = aqpz.c) == null) {
                aqqb = aqqb.a;
            }
            final int b = aqqb.b;
            if ((b & 0x2) == 0x0) {
                throw new GeneralSecurityException("Missing signedKeyset.keyset");
            }
            if ((b & 0x1) == 0x0) {
                throw new GeneralSecurityException("Missing signedKeyset.identifier");
            }
            final long n = System.currentTimeMillis() / 1000L;
            if ((aqqb.b & 0x8) != 0x0) {
                ahca ahca;
                if ((ahca = aqqb.e) == null) {
                    ahca = ahca.a;
                }
                if (n < ahca.b) {
                    ahca ahca2;
                    if ((ahca2 = aqqb.e) == null) {
                        ahca2 = ahca.a;
                    }
                    final long b2 = ahca2.b;
                    final StringBuilder sb = new StringBuilder("Expired certificate: current time is before signed_keyset validity period. now = ");
                    sb.append(n);
                    sb.append(", valid_after = ");
                    sb.append(b2);
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            if ((aqqb.b & 0x4) != 0x0) {
                ahca ahca3;
                if ((ahca3 = aqqb.d) == null) {
                    ahca3 = ahca.a;
                }
                if (n > ahca3.b) {
                    ahca ahca4;
                    if ((ahca4 = aqqb.d) == null) {
                        ahca4 = ahca.a;
                    }
                    final long b3 = ahca4.b;
                    final StringBuilder sb2 = new StringBuilder("Expired certificate: current time has passed signed_keyset validity period. now = ");
                    sb2.append(n);
                    sb2.append(", valid_before = ");
                    sb2.append(b3);
                    throw new GeneralSecurityException(sb2.toString());
                }
            }
            if (aqpz.d.size() > 0) {
                final Iterator<Object> iterator = aqpz.d.iterator();
                while (iterator.hasNext()) {
                    final int b4 = iterator.next().b;
                    if ((b4 & 0x1) != 0x0 && (b4 & 0x2) != 0x0) {
                        continue;
                    }
                    throw new GeneralSecurityException("Missing Signature or Signature Identifier");
                }
                aqqb aqqb2;
                if ((aqqb2 = aqpz.c) == null) {
                    aqqb2 = aqqb.a;
                }
                final byte[] byteArray = ((agxl)aqqb2).toByteArray();
                for (final aqqa aqqa : aqpz.d) {
                    if (aqqa.d.equals(this.c)) {
                        final Object a = this.a;
                        if (a != null) {
                            ((afvk)a).a(aqqa.c.I(), byteArray);
                            aqqb aqqb3;
                            if ((aqqb3 = aqpz.c) == null) {
                                aqqb3 = aqqb.a;
                            }
                            this.b = afvb.c(adcr.S(aqqb3.c.I())).b((Class)afvk.class);
                            return Status.OK;
                        }
                        continue;
                    }
                }
                throw new GeneralSecurityException("Intermediate certificate not signed by known root certificate");
            }
            throw new GeneralSecurityException("No Signatures found");
        }
        catch (final IOException ex) {
            c = ex.getMessage();
            Status status;
            if (c != null) {
                status = Status.l.withDescription(c);
            }
            else {
                status = Status.l;
            }
            return status;
        }
        catch (final GeneralSecurityException ex2) {
            c = ex2.getMessage();
            Status status2;
            if (c != null) {
                status2 = Status.l.withDescription(c);
            }
            else {
                status2 = Status.l;
            }
            return status2;
        }
    }
    
    public final Status o(final byte[] array, final byte[] array2) {
        final Object b = this.b;
        if (b != null) {
            try {
                ((afvk)b).a(array, array2);
                return Status.OK;
            }
            catch (final GeneralSecurityException ex) {
                final String message = ex.getMessage();
                Status status;
                if (message != null) {
                    status = Status.g.withDescription(message);
                }
                else {
                    status = Status.g;
                }
                return status;
            }
        }
        return Status.l.withDescription("Intermediate verifier not available.");
    }
    
    public final spy p() {
        final Object a = this.a;
        if (a != null) {
            return new spy((Optional)this.b, (Optional)this.c, (String)a);
        }
        throw new IllegalStateException("Missing required properties: placeholderText");
    }
    
    public final void q(final Optional b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null image");
    }
    
    public final void r(final String a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null placeholderText");
    }
    
    public final plw s() {
        final Object c = this.c;
        if (c != null) {
            final Object b = this.b;
            if (b != null) {
                final Object a = this.a;
                if (a != null) {
                    return new plw((Long)c, (Integer)b, (byte[])a);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" jobType");
        }
        if (this.a == null) {
            sb.append(" payload");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void t(final byte[] a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null payload");
    }
    
    public final pdk u() {
        final Object a = this.a;
        a.getClass();
        if (this.c == null) {
            this.c = "Download result code: ".concat(String.valueOf(((pdj)a).name()));
        }
        return new pdk(this, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final Paint v() {
        if (this.c == null) {
            final Paint c = new Paint();
            this.c = c;
            final int color = Color.parseColor("#EFEFEF");
            final Paint paint = c;
            c.setColor(color);
            ((Paint)this.c).setStrokeWidth(nsg.c((Context)null, 1.0f));
        }
        return (Paint)this.c;
    }
}
