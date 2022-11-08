import java.security.interfaces.ECKey;
import java.security.KeyPair;
import java.nio.ByteBuffer;
import java.util.Arrays;
import com.google.protobuf.MessageLite;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agdp implements afur
{
    private static final byte[] a;
    private final String b;
    private final byte[] c;
    private final agdo d;
    private final int e;
    private final agli f;
    
    static {
        a = new byte[0];
    }
    
    public agdp(final ECPublicKey ecPublicKey, final byte[] c, final String b, final int e, final agdo d) {
        aety.F(ecPublicKey);
        this.f = new agli(ecPublicKey);
        this.c = c;
        this.b = b;
        this.e = e;
        this.d = d;
    }
    
    public final byte[] a(byte[] array, byte[] b) {
        final agli f = this.f;
        final String b2 = this.b;
        final byte[] c = this.c;
        final int b3 = ((afxr)this.d).b;
        final int e = this.e;
        final KeyPair d = aety.D(((ECKey)f.a).getParams());
        final ECPublicKey ecPublicKey = (ECPublicKey)d.getPublic();
        final byte[] i = aety.I((ECPrivateKey)d.getPrivate(), (ECPublicKey)f.a);
        final byte[] o = aety.O(ecPublicKey.getParams().getCurve(), e, ecPublicKey.getW());
        int n = 1;
        final byte[] s = aety.S(new byte[][] { o, i });
        final Mac mac = (Mac)agdz.b.a(b2);
        if (b3 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (c != null && c.length != 0) {
            mac.init(new SecretKeySpec(c, b2));
        }
        else {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], b2));
        }
        final byte[] doFinal = mac.doFinal(s);
        final byte[] array2 = new byte[b3];
        mac.init(new SecretKeySpec(doFinal, b2));
        byte[] doFinal2 = new byte[0];
        int n2 = 0;
        while (true) {
            mac.update(doFinal2);
            mac.update(b);
            mac.update((byte)n);
            doFinal2 = mac.doFinal();
            final int length = doFinal2.length;
            final int n3 = n2 + length;
            if (n3 >= b3) {
                break;
            }
            System.arraycopy(doFinal2, 0, array2, n2, length);
            ++n;
            n2 = n3;
        }
        System.arraycopy(doFinal2, 0, array2, n2, b3 - n2);
        final ageq a = ageq.a(o);
        final ageq a2 = ageq.a(array2);
        final agdo d2 = this.d;
        final byte[] b4 = a2.b();
        final int length2 = b4.length;
        final afxr afxr = (afxr)d2;
        if (length2 == afxr.b) {
            final boolean equals = afxr.a.equals(afvn.b);
            afum afum = null;
            afup afup = null;
            Label_0824: {
                if (equals) {
                    final agza builder = ((agzi)agag.a).createBuilder();
                    builder.mergeFrom((agzi)afxr.c);
                    final agyc z = agyc.z(b4, 0, afxr.b);
                    builder.copyOnWrite();
                    ((agag)builder.instance).c = z;
                    afum = (afum)afvl.f(afxr.a, (MessageLite)builder.build(), (Class)afum.class);
                }
                else if (afxr.a.equals(afvn.a)) {
                    final byte[] copyOfRange = Arrays.copyOfRange(b4, 0, afxr.e);
                    final byte[] copyOfRange2 = Arrays.copyOfRange(b4, afxr.e, afxr.b);
                    final agza builder2 = ((agzi)agaa.a).createBuilder();
                    agaa agaa;
                    if ((agaa = afxr.d.c) == null) {
                        agaa = agaa.a;
                    }
                    builder2.mergeFrom((agzi)agaa);
                    final agyc x = agyc.x(copyOfRange);
                    builder2.copyOnWrite();
                    ((agaa)builder2.instance).d = x;
                    final agaa c2 = (agaa)builder2.build();
                    final agza builder3 = ((agzi)agbb.a).createBuilder();
                    agbb agbb;
                    if ((agbb = afxr.d.d) == null) {
                        agbb = agbb.a;
                    }
                    builder3.mergeFrom((agzi)agbb);
                    final agyc x2 = agyc.x(copyOfRange2);
                    builder3.copyOnWrite();
                    ((agbb)builder3.instance).d = x2;
                    final agbb d3 = (agbb)builder3.build();
                    final agza builder4 = ((agzi)afzy.a).createBuilder();
                    final int b5 = afxr.d.b;
                    builder4.copyOnWrite();
                    ((afzy)builder4.instance).b = b5;
                    builder4.copyOnWrite();
                    final afzy afzy = (afzy)builder4.instance;
                    c2.getClass();
                    afzy.c = c2;
                    builder4.copyOnWrite();
                    final afzy afzy2 = (afzy)builder4.instance;
                    d3.getClass();
                    afzy2.d = d3;
                    afum = (afum)afvl.f(afxr.a, (MessageLite)builder4.build(), (Class)afum.class);
                }
                else {
                    if (afxr.a.equals(afxg.a)) {
                        final agza builder5 = ((agzi)agak.a).createBuilder();
                        builder5.mergeFrom((agzi)afxr.f);
                        final agyc z2 = agyc.z(b4, 0, afxr.b);
                        builder5.copyOnWrite();
                        ((agak)builder5.instance).c = z2;
                        afup = (afup)afvl.f(afxr.a, (MessageLite)builder5.build(), (Class)afup.class);
                        break Label_0824;
                    }
                    throw new GeneralSecurityException("unknown DEM key type");
                }
                afup = null;
            }
            final byte[] a3 = agdp.a;
            if (afum != null) {
                array = afum.a(array, a3);
            }
            else {
                array = afup.a(array, a3);
            }
            b = a.b();
            return ByteBuffer.allocate(b.length + array.length).put(b).put(array).array();
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
