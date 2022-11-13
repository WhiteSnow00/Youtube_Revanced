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

public final class agfq implements afwt
{
    private static final byte[] a;
    private final String b;
    private final byte[] c;
    private final agfp d;
    private final int e;
    private final adet f;
    
    static {
        a = new byte[0];
    }
    
    public agfq(final ECPublicKey ecPublicKey, final byte[] c, final String b, final int e, final agfp d) {
        aevy.G(ecPublicKey);
        this.f = new adet(ecPublicKey);
        this.c = c;
        this.b = b;
        this.e = e;
        this.d = d;
    }
    
    public final byte[] a(byte[] array, byte[] array2) {
        final adet f = this.f;
        final String b = this.b;
        final byte[] c = this.c;
        final int b2 = ((afzs)this.d).b;
        final int e = this.e;
        final KeyPair e2 = aevy.E(((ECKey)f.a).getParams());
        final ECPublicKey ecPublicKey = (ECPublicKey)e2.getPublic();
        final byte[] j = aevy.J((ECPrivateKey)e2.getPrivate(), (ECPublicKey)f.a);
        final byte[] p2 = aevy.P(ecPublicKey.getParams().getCurve(), e, ecPublicKey.getW());
        int n = 1;
        final byte[] t = aevy.T(new byte[][] { p2, j });
        final Mac mac = (Mac)agga.b.a(b);
        if (b2 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (c != null && c.length != 0) {
            mac.init(new SecretKeySpec(c, b));
        }
        else {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], b));
        }
        final byte[] doFinal = mac.doFinal(t);
        final byte[] array3 = new byte[b2];
        mac.init(new SecretKeySpec(doFinal, b));
        byte[] doFinal2 = new byte[0];
        int n2 = 0;
        while (true) {
            mac.update(doFinal2);
            mac.update(array2);
            mac.update((byte)n);
            doFinal2 = mac.doFinal();
            final int length = doFinal2.length;
            final int n3 = n2 + length;
            if (n3 >= b2) {
                break;
            }
            System.arraycopy(doFinal2, 0, array3, n2, length);
            ++n;
            n2 = n3;
        }
        System.arraycopy(doFinal2, 0, array3, n2, b2 - n2);
        final aggr a = aggr.a(p2);
        final aggr a2 = aggr.a(array3);
        final agfp d = this.d;
        array2 = a2.b();
        final int length2 = array2.length;
        final afzs afzs = (afzs)d;
        if (length2 == afzs.b) {
            final boolean equals = afzs.a.equals(afxo.b);
            afwo afwo = null;
            afwr afwr = null;
            Label_0845: {
                afwo afwo2;
                if (equals) {
                    final ahaz builder = ((ahbh)agch.a).createBuilder();
                    builder.mergeFrom((ahbh)afzs.c);
                    final ahab z = ahab.z(array2, 0, afzs.b);
                    builder.copyOnWrite();
                    ((agch)builder.instance).c = z;
                    afwo2 = (afwo)afxm.f(afzs.a, (MessageLite)builder.build(), (Class)afwo.class);
                }
                else if (afzs.a.equals(afxo.a)) {
                    final byte[] copyOfRange = Arrays.copyOfRange(array2, 0, afzs.e);
                    final byte[] copyOfRange2 = Arrays.copyOfRange(array2, afzs.e, afzs.b);
                    final ahaz builder2 = ((ahbh)agcb.a).createBuilder();
                    agcb agcb;
                    if ((agcb = afzs.d.c) == null) {
                        agcb = agcb.a;
                    }
                    builder2.mergeFrom((ahbh)agcb);
                    final ahab x = ahab.x(copyOfRange);
                    builder2.copyOnWrite();
                    ((agcb)builder2.instance).d = x;
                    final agcb c2 = (agcb)builder2.build();
                    final ahaz builder3 = ((ahbh)agdc.a).createBuilder();
                    agdc agdc;
                    if ((agdc = afzs.d.d) == null) {
                        agdc = agdc.a;
                    }
                    builder3.mergeFrom((ahbh)agdc);
                    final ahab x2 = ahab.x(copyOfRange2);
                    builder3.copyOnWrite();
                    ((agdc)builder3.instance).d = x2;
                    final agdc d2 = (agdc)builder3.build();
                    final ahaz builder4 = ((ahbh)agbz.a).createBuilder();
                    final int b3 = afzs.d.b;
                    builder4.copyOnWrite();
                    ((agbz)builder4.instance).b = b3;
                    builder4.copyOnWrite();
                    final agbz agbz = (agbz)builder4.instance;
                    c2.getClass();
                    agbz.c = c2;
                    builder4.copyOnWrite();
                    final agbz agbz2 = (agbz)builder4.instance;
                    d2.getClass();
                    agbz2.d = d2;
                    afwo2 = (afwo)afxm.f(afzs.a, (MessageLite)builder4.build(), (Class)afwo.class);
                }
                else {
                    if (afzs.a.equals(afzh.a)) {
                        final ahaz builder5 = ((ahbh)agcl.a).createBuilder();
                        builder5.mergeFrom((ahbh)afzs.f);
                        final ahab z2 = ahab.z(array2, 0, afzs.b);
                        builder5.copyOnWrite();
                        ((agcl)builder5.instance).c = z2;
                        afwr = (afwr)afxm.f(afzs.a, (MessageLite)builder5.build(), (Class)afwr.class);
                        break Label_0845;
                    }
                    throw new GeneralSecurityException("unknown DEM key type");
                }
                afwo = afwo2;
                afwr = null;
            }
            final byte[] a3 = agfq.a;
            if (afwo != null) {
                array = afwo.a(array, a3);
            }
            else {
                array = afwr.a(array, a3);
            }
            array2 = a.b();
            return ByteBuffer.allocate(array2.length + array.length).put(array2).put(array).array();
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
