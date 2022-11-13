import java.util.SortedMap;
import android.content.SharedPreferences;
import java.lang.reflect.AccessibleObject;
import android.net.Uri;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import com.google.android.libraries.blocks.runtime.BaseClient;
import android.util.Base64;
import java.util.Set;
import java.util.Map;
import java.security.SecureRandom;
import android.os.Bundle;
import android.graphics.Bitmap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.Iterator;
import java.io.File;
import java.util.Arrays;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import java.util.IllegalFormatException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.io.ByteArrayInputStream;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.Cipher;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.List;
import java.security.interfaces.ECPublicKey;
import java.lang.reflect.Field;
import android.os.Process;
import java.io.InputStream;
import com.google.apps.tiktok.account.AccountId;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adet
{
    public final Object a;
    
    public adet() {
        this.a = createElementsDependencies();
    }
    
    public adet(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9) {
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
    
    public adet(final int n, final aaui aaui) {
        this.a = new byte[n + n];
        int n2 = 0;
        double n3 = 0.0;
        int n4 = 0;
        int n5;
        double n6;
        while (true) {
            n5 = n >> 2;
            n6 = n - 1;
            if (n2 >= n5) {
                break;
            }
            n3 = aaui.a(n2, n6) * 65279.0;
            final Object a = this.a;
            final int n7 = n4 + 1;
            final double n8 = n3 / 256.0;
            final byte[] array = (byte[])a;
            array[n4] = (byte)n8;
            n4 = n7 + 1;
            array[n7] = (byte)(n3 % 256.0);
            ++n2;
        }
        int i;
        for (i = n5 + 3; i < n; i += 4) {
            final double n9 = (aaui.a(i, n6) * 65279.0 - n3) / 4.0;
            final double n10 = n3 + n9;
            final Object a2 = this.a;
            final int n11 = n4 + 1;
            final double n12 = n10 / 256.0;
            final byte[] array2 = (byte[])a2;
            array2[n4] = (byte)n12;
            final int n13 = n11 + 1;
            array2[n11] = (byte)(n10 % 256.0);
            final int n14 = n13 + 1;
            final double n15 = n10 + n9;
            array2[n13] = (byte)(n15 / 256.0);
            final int n16 = n14 + 1;
            array2[n14] = (byte)(n15 % 256.0);
            final int n17 = n16 + 1;
            final double n18 = n15 + n9;
            array2[n16] = (byte)(n18 / 256.0);
            final int n19 = n17 + 1;
            array2[n17] = (byte)(n18 % 256.0);
            final int n20 = n19 + 1;
            n3 = n18 + n9;
            array2[n19] = (byte)(n3 / 256.0);
            n4 = n20 + 1;
            array2[n20] = (byte)(n3 % 256.0);
        }
        for (i -= 3; i < n; ++i) {
            final double n21 = aaui.a(i, n6) * 65279.0;
            final Object a3 = this.a;
            final int n22 = n4 + 1;
            final double n23 = n21 / 256.0;
            final byte[] array3 = (byte[])a3;
            array3[n4] = (byte)n23;
            n4 = n22 + 1;
            array3[n22] = (byte)(n21 % 256.0);
        }
    }
    
    public adet(final aaqz a) {
        a.getClass();
        this.a = a;
    }
    
    public adet(final abpt abpt) {
        this.a = abpt.b();
    }
    
    public adet(final abpu a) {
        this.a = a;
    }
    
    public adet(final acgs a) {
        this.a = a;
    }
    
    public adet(final acmr a, final byte[] array) {
        this.a = a;
    }
    
    public adet(final adet a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
    }
    
    public adet(final adet a, final byte[] array, final byte[] array2, final byte[] array3, final char[] array4) {
        this.a = a;
    }
    
    public adet(final aece a) {
        this.a = a;
    }
    
    public adet(final aekp a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public adet(final aerx a) {
        this.a = a;
    }
    
    public adet(final afue a) {
        this.a = a;
    }
    
    public adet(final afvr a) {
        this.a = a;
    }
    
    public adet(final agaj a) {
        this.a = a;
    }
    
    public adet(final agdl a) {
        this.a = a;
    }
    
    public adet(final Activity a) {
        this.a = a;
    }
    
    public adet(final Context a) {
        this.a = a;
    }
    
    public adet(final Context a, final byte[] array) {
        this.a = a;
    }
    
    public adet(final arwh a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public adet(final atke a) {
        this.a = a;
    }
    
    public adet(final atke a, final byte[] array) {
        a.getClass();
        this.a = a;
    }
    
    public adet(final atke a, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public adet(final atke a, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
    }
    
    public adet(final atke a, final byte[] array, final char[] array2) {
        a.getClass();
        this.a = a;
    }
    
    public adet(final atke a, final char[] array) {
        this.a = a;
    }
    
    public adet(final atke a, final int[] array) {
        a.getClass();
        this.a = a;
    }
    
    public adet(final atke a, final short[] array) {
        a.getClass();
        this.a = a;
    }
    
    public adet(final PlayerResponseModel a) {
        this.a = a;
    }
    
    public adet(final AccountId a) {
        this.a = a;
    }
    
    public adet(final ggj a, final byte[] array) {
        this.a = a;
    }
    
    private adet(final InputStream a) {
        this.a = a;
    }
    
    public adet(final Object a) {
        this.a = a;
    }
    
    public adet(final String s) {
        final int myUid = Process.myUid();
        final int myPid = Process.myPid();
        final StringBuilder sb = new StringBuilder("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        this.a = sb.toString().concat(String.valueOf(s));
    }
    
    public adet(final String a, final String s) {
        a.getClass();
        this.a = a;
        s.getClass();
    }
    
    public adet(final String a, final byte[] array) {
        this.a = a;
    }
    
    public adet(final Field a) {
        ((AccessibleObject)(this.a = a)).setAccessible(true);
    }
    
    public adet(final ECPublicKey a) {
        this.a = a;
    }
    
    public adet(final List a) {
        this.a = a;
    }
    
    public adet(final Matcher a) {
        a.getClass();
        this.a = a;
    }
    
    public adet(final obq a) {
        this.a = a;
    }
    
    public adet(final oby a) {
        this.a = a;
    }
    
    public adet(final tgd a, final ashi ashi, final ablw ablw, final abot abot, final ashi ashi2, final ashi ashi3, final byte[] array) {
        this.a = a;
        final asiq asiq = new asiq();
        asiq.c(ashi.p().an((asjm)new abhx(this, 15, (byte[])null), (asjm)abfd.h));
        asiq.c(ashi2.an((asjm)new abhx(this, 18, (byte[])null), (asjm)abfd.h));
        asiq.c(ashi3.an((asjm)new abhx(this, 20, (byte[])null), (asjm)abfd.h));
        asiq.c(((ashi)ablw.j).p().an((asjm)new abiz(this, 1, (byte[])null), (asjm)abfd.h));
        asiq.c(ablw.c().p().an((asjm)new abiz(this, 0, (byte[])null), (asjm)abfd.h));
        asiq.c(((ashi)ablw.h).p().an((asjm)new abiz(this, 5, (byte[])null), (asjm)abfd.h));
        asiq.c(abot.I().p().an((asjm)new abiz(this, 20, (byte[])null), (asjm)abfd.h));
        asiq.c(abot.J().p().an((asjm)new abja(this, 1, (byte[])null), (asjm)abfd.h));
        asiq.c(abot.L().p().an((asjm)new abja(this, 0, (byte[])null), (asjm)abfd.h));
        asiq.c(abot.K().p().an((asjm)new abja(this, 2, (byte[])null), (asjm)abfd.h));
        asiq.c(abot.M().p().an((asjm)new abja(this, 3, (byte[])null), (asjm)abfd.h));
        asiq.c(abot.N().p().an((asjm)new abja(this, 4, (byte[])null), (asjm)abfd.h));
        asiq.c(abot.O().p().an((asjm)new abja(this, 5, (byte[])null), (asjm)abfd.h));
        asiq.c(abot.P().p().an((asjm)new abhx(this, 16, (byte[])null), (asjm)abfd.h));
        asiq.c(abot.R().p().an((asjm)new abhx(this, 17, (byte[])null), (asjm)abfd.h));
        asiq.c(abot.S().p().an((asjm)new abhx(this, 19, (byte[])null), (asjm)abfd.h));
    }
    
    public adet(final vaf vaf, final atke atke, final atke atke2) {
        Object a;
        if (vaf == null) {
            a = null;
        }
        else {
            alxp alxp;
            if ((alxp = vaf.b().e) == null) {
                alxp = alxp.a;
            }
            Object o;
            if (alxp.al) {
                o = atke.a();
            }
            else {
                o = atke2.a();
            }
            a = o;
        }
        this.a = a;
    }
    
    public adet(final xra a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public adet(final zaz a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public adet(final zdh a) {
        this.a = a;
    }
    
    public adet(final zfe a) {
        this.a = a;
    }
    
    public adet(final zjp a) {
        this.a = a;
    }
    
    public adet(final byte[] array) {
        this.a = atjs.e();
    }
    
    public adet(final byte[] array, final byte[] array2) {
        this.a = new ArrayList();
    }
    
    public adet(final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = agpi.O();
    }
    
    public adet(final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = afut.a();
    }
    
    public adet(byte[] ex, final byte[] array, final char[] array2) {
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
        throw new ylu((Exception)ex);
    }
    
    public adet(final byte[] array, final char[] array2) {
        final afam a = new afam();
        a.f();
        this.a = a;
    }
    
    public adet(final byte[] array, final short[] array2) {
        this.a = new TreeMap();
    }
    
    public adet(final char[] array) {
        this.a = new HashSet();
    }
    
    public adet(final char[] array, final byte[] array2) {
        this.a = new ConcurrentHashMap();
    }
    
    public adet(final int[] array) {
        this.a = new float[9];
    }
    
    public adet(final int[] array, final long[] array2, final long[] array3, final long[] array4) {
        this.a = new btb(array, array2, array3, array4);
    }
    
    public static int A(final admv admv) {
        adms adms;
        if ((adms = admv.ae) == null) {
            adms = adms.a;
        }
        final int i = adkp.i(adms.c);
        if (i != 0) {
            if (i == 4) {
                adms adms2;
                if ((adms2 = admv.ae) == null) {
                    adms2 = adms.a;
                }
                aphv aphv;
                if ((aphv = aphv.b(adms2.d)) == null) {
                    aphv = aphv.a;
                }
                if (aphv != aphv.v) {
                    return 4;
                }
            }
        }
        final adms ag = admv.ag;
        adms a;
        if (ag == null) {
            a = adms.a;
        }
        else {
            a = ag;
        }
        final int j = adkp.i(a.c);
        if (j != 0) {
            if (j == 4) {
                adms a2;
                if ((a2 = ag) == null) {
                    a2 = adms.a;
                }
                aphv aphv2;
                if ((aphv2 = aphv.b(a2.d)) == null) {
                    aphv2 = aphv.a;
                }
                if (aphv2 != aphv.v) {
                    return 4;
                }
            }
        }
        final adms ah = admv.ah;
        adms a3;
        if (ah == null) {
            a3 = adms.a;
        }
        else {
            a3 = ah;
        }
        final int k = adkp.i(a3.c);
        if (k != 0) {
            if (k == 4) {
                adms a4;
                if ((a4 = ah) == null) {
                    a4 = adms.a;
                }
                aphv aphv3;
                if ((aphv3 = aphv.b(a4.d)) == null) {
                    aphv3 = aphv.a;
                }
                if (aphv3 != aphv.v) {
                    return 4;
                }
            }
        }
        adms adms3;
        if ((adms3 = admv.ah) == null) {
            adms3 = adms.a;
        }
        final int l = adkp.i(adms3.c);
        if (l != 0) {
            if (l == 2) {
                return 2;
            }
        }
        return 1;
    }
    
    public static int B(final admt admt) {
        final admt a = admt.a;
        final int ordinal = admt.ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 3) {
            return 3;
        }
        if (ordinal != 5 && ordinal != 6) {
            return 1;
        }
        return 4;
    }
    
    public static void C(final ahaz ahaz) {
        adkp.H(((admv)ahaz.instance).w);
        ahaz.copyOnWrite();
        final admv admv = (admv)ahaz.instance;
        admv.an = null;
        admv.d &= 0xFFFFFFFE;
        ahaz.copyOnWrite();
        final admv admv2 = (admv)ahaz.instance;
        admv2.C = null;
        admv2.b &= 0xBFFFFFFF;
        ahaz.copyOnWrite();
        final admv admv3 = (admv)ahaz.instance;
        admv3.B = null;
        admv3.b &= 0xDFFFFFFF;
        if (admv3.D) {
            ahaz.copyOnWrite();
            final admv admv4 = (admv)ahaz.instance;
            admv4.E = null;
            admv4.c &= 0xFFFFFFFE;
            ahaz.copyOnWrite();
            final admv admv5 = (admv)ahaz.instance;
            admv5.c &= 0xFFFFFFFD;
            admv5.F = admv.a.F;
            ahaz.copyOnWrite();
            final admv admv6 = (admv)ahaz.instance;
            admv6.c &= 0xFFFFFFFB;
            admv6.G = 0L;
            ahaz.copyOnWrite();
            final admv admv7 = (admv)ahaz.instance;
            admv7.c &= 0xFFFFFFEF;
            admv7.I = 0L;
            ahaz.copyOnWrite();
            final admv admv8 = (admv)ahaz.instance;
            admv8.c |= 0x20;
            admv8.J = true;
        }
        ahaz.copyOnWrite();
        final admv admv9 = (admv)ahaz.instance;
        admv9.O = null;
        admv9.c &= 0xFFFFFBFF;
        ahaz.copyOnWrite();
        final admv admv10 = (admv)ahaz.instance;
        admv10.N = null;
        admv10.c &= 0xFFFFFDFF;
        ahaz.copyOnWrite();
        final admv admv11 = (admv)ahaz.instance;
        admv11.ar = null;
        admv11.d &= 0xFFFFFFEF;
        ahaz.copyOnWrite();
        final admv admv12 = (admv)ahaz.instance;
        admv12.P = null;
        admv12.c &= 0xFFFFF7FF;
        ahaz.copyOnWrite();
        final admv admv13 = (admv)ahaz.instance;
        admv13.Q = null;
        admv13.c &= 0xFFFFEFFF;
        ahaz.copyOnWrite();
        final admv admv14 = (admv)ahaz.instance;
        admv14.ag = null;
        admv14.c &= 0xFDFFFFFF;
        ahaz.copyOnWrite();
        final admv admv15 = (admv)ahaz.instance;
        admv15.ae = null;
        admv15.c &= 0xFF7FFFFF;
        if (admv15.z) {
            ahaz.copyOnWrite();
            final admv admv16 = (admv)ahaz.instance;
            admv16.as = null;
            admv16.d &= 0xFFFFFFDF;
        }
    }
    
    public static adet R(final byte[] array) {
        return new adet(new ByteArrayInputStream(array));
    }
    
    public static boolean V(final andl andl) {
        andl.getClass();
        return andl.d < 0 || andl.e < 0;
    }
    
    public static final andl W(final aiqj aiqj) {
        if (aiqj != null) {
            if (((ahbc)aiqj).ry((ahaq)WatchEndpointOuterClass.watchEndpoint)) {
                final apsk apsk = (apsk)((ahbc)aiqj).rx((ahaq)WatchEndpointOuterClass.watchEndpoint);
                apsl apsl;
                if ((apsl = apsk.o) == null) {
                    apsl = apsl.a;
                }
                if ((apsl.b & 0x1) != 0x0) {
                    apsl apsl2;
                    if ((apsl2 = apsk.o) == null) {
                        apsl2 = apsl.a;
                    }
                    andl andl;
                    if ((andl = apsl2.c) == null) {
                        andl = andl.a;
                    }
                    return andl;
                }
            }
        }
        return null;
    }
    
    private static String aA(final String s, final String s2, final Object... array) {
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
    
    private final byte[] aB(byte[] doFinal, final byte[] array, final int n) {
        final Mac mac = (Mac)agga.b.a((String)this.a);
        if (n <= mac.getMacLength() * 255) {
            final byte[] array2 = new byte[n];
            mac.init(new SecretKeySpec(doFinal, (String)this.a));
            doFinal = new byte[0];
            int n2 = 1;
            int n3 = 0;
            while (true) {
                mac.update(doFinal);
                mac.update(array);
                mac.update((byte)n2);
                doFinal = mac.doFinal();
                final int length = doFinal.length;
                final int n4 = n3 + length;
                if (n4 >= n) {
                    break;
                }
                System.arraycopy(doFinal, 0, array2, n3, length);
                ++n2;
                n3 = n4;
            }
            System.arraycopy(doFinal, 0, array2, n3, n - n3);
            return array2;
        }
        throw new GeneralSecurityException("size too large");
    }
    
    private final byte[] aC(final byte[] array, final byte[] array2) {
        final Mac mac = (Mac)agga.b.a((String)this.a);
        if (array2 != null && array2.length != 0) {
            mac.init(new SecretKeySpec(array2, (String)this.a));
        }
        else {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], (String)this.a));
        }
        return mac.doFinal(array);
    }
    
    private final void aD(final int n) {
        ((acmr)this.a).d(new wye(n - 1, 10), ajtz.j);
    }
    
    private static final String aE(final zme zme) {
        if (!zme.g()) {
            return "visitor_id";
        }
        return "incognito_visitor_id";
    }
    
    public static adet aw(String s, final long n, final vai vai) {
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
        if (vai == null || !vai.f(45383693L)) {
            b = false;
        }
        final ArrayList list = new ArrayList();
    Label_0127_Outer:
        while (i < array.length) {
            final String s2 = array[i];
            while (true) {
                if (b) {
                    try {
                        if (aezr.f(s2)) {
                            list.add(i, null);
                        }
                        else {
                            list.add(i, new abil(s, i, s2, n));
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
        return new adet(list);
    }
    
    public static void ax(final adet adet, final adet adet2, final adet adet3) {
        final float[] array = (float[])adet.a;
        final float n = array[0];
        final float[] array2 = (float[])adet2.a;
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
        adet3.Y(n * n2 + n3 * n4 + n5 * n6, n * n7 + n3 * n8 + n5 * n9, n * n10 + n3 * n11 + n5 * n12, n13 * n2 + n14 * n4 + n15 * n6, n13 * n7 + n14 * n8 + n15 * n9, n13 * n10 + n14 * n11 + n15 * n12, n2 * n16 + n4 * n17 + n6 * n18, n7 * n16 + n8 * n17 + n9 * n18, n16 * n10 + n17 * n11 + n18 * n12);
    }
    
    public static adet az(final btb btb) {
        if (btb != null) {
            return new adet(btb.b, btb.c, btb.d, btb.e);
        }
        return null;
    }
    
    private static int[] createElementsDependencies() {
        return new int[] { 2131232585, 2131232607, 2131232633, 2131232659, 2131232687, 2131232690, 2131232693, 2131232710, 2131232732, 2131232761, 2131232781, 2131232789, 2131232790, 2131232798, 2131232806, 2131232809, 2131232817, 2131232903, 2131232908, 2131232911, 2131232914, 2131232937 };
    }
    
    public static File d(final Context context, final String s, final String s2) {
        return new File(new File(context.getDir("youtube_upload", 0), s), s2);
    }
    
    public static long o(final File file) {
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
                n += o(listFiles[n3]);
                ++n3;
            }
        }
        return n2;
    }
    
    public static long p(final admv admv) {
        adms adms;
        if ((adms = admv.ah) == null) {
            adms = adms.a;
        }
        long n;
        if ((n = adms.g) == 0L) {
            adms adms2;
            if ((adms2 = admv.ag) == null) {
                adms2 = adms.a;
            }
            n = adms2.g;
        }
        long g = n;
        if (n == 0L) {
            adms adms3;
            if ((adms3 = admv.ae) == null) {
                adms3 = adms.a;
            }
            g = adms3.g;
        }
        return g;
    }
    
    public static aoua t(final aphy aphy) {
        for (final aphz aphz : aphy.e) {
            if ((aphz.b & 0x2) != 0x0) {
                aoua aoua;
                if ((aoua = aphz.c) == null) {
                    aoua = aoua.a;
                }
                return aoua;
            }
        }
        return null;
    }
    
    public static File u(final admv admv) {
        if ((admv.d & 0x4) == 0x0) {
            throw new IOException("Missing working directory ".concat(String.valueOf(admv.k)));
        }
        final File file = new File(admv.ap);
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException("Could not create working directory ".concat(String.valueOf(admv.k)));
        }
        return file;
    }
    
    public static File v(final admv admv) {
        if ((admv.c & 0x2) == 0x0) {
            throw new IOException("Missing copy file name ".concat(String.valueOf(admv.k)));
        }
        adms adms;
        if ((adms = admv.E) == null) {
            adms = adms.a;
        }
        final int i = adkp.i(adms.c);
        if (i != 0 && i == 2) {
            final String absolutePath = u(admv).getAbsolutePath();
            final String f = admv.F;
            final StringBuilder sb = new StringBuilder();
            sb.append(absolutePath);
            sb.append("/");
            sb.append(f);
            return new File(sb.toString());
        }
        throw new IOException("Invalid copy file state ".concat(String.valueOf(admv.k)));
    }
    
    public static boolean w(final aphy aphy) {
        for (final apia apia : aphy.d) {
            if ((apia.b & 0x80) != 0x0) {
                apmk apmk;
                if ((apmk = apia.f) == null) {
                    apmk = apmk.a;
                }
                final int aq = aqsx.aq(apmk.b);
                if (aq == 0) {
                    break;
                }
                if (aq == 2) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
    
    public static boolean x(final adms adms, final aphv aphv) {
        final int i = adkp.i(adms.c);
        if (i != 0) {
            if (i == 4) {
                aphv aphv2;
                if ((aphv2 = aphv.b(adms.d)) == null) {
                    aphv2 = aphv.a;
                }
                if (aphv2 == aphv) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean y(final adms adms) {
        final int c = adms.c;
        final int i = adkp.i(c);
        if (i != 0) {
            if (i == 2) {
                return true;
            }
        }
        final int j = adkp.i(c);
        if (j != 0) {
            if (j == 4) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean z(final admv admv) {
        if (admv.D && (admv.c & 0x2) != 0x0) {
            adms adms;
            if ((adms = admv.E) == null) {
                adms = adms.a;
            }
            final int i = adkp.i(adms.c);
            if (i != 0) {
                if (i == 2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final adms D(final aphv aphv, adms adms, final List list, final adet adet) {
        final ahaz builder = ((ahbh)adms.a).createBuilder();
        final long c = ((oby)this.a).c();
        int e;
        if ((adms.b & 0x1) != 0x0) {
            e = adms.e;
        }
        else {
            e = 0;
        }
        if (e >= list.size()) {
            final int ad = aphv.aD;
            final StringBuilder sb = new StringBuilder("Retry count exceeded. Reason[");
            sb.append(ad);
            sb.append("]");
            adet.h(sb.toString(), new Exception());
            builder.copyOnWrite();
            adms = (adms)builder.instance;
            adms.c = 3;
            adms.b |= 0x1;
        }
        else {
            builder.copyOnWrite();
            adms = (adms)builder.instance;
            adms.c = 2;
            adms.b |= 0x1;
            final long longValue = list.get(e);
            builder.copyOnWrite();
            adms = (adms)builder.instance;
            adms.b |= 0x8;
            adms.f = longValue + c;
            builder.copyOnWrite();
            adms = (adms)builder.instance;
            adms.b |= 0x4;
            adms.e = e + 1;
        }
        builder.copyOnWrite();
        adms = (adms)builder.instance;
        adms.d = aphv.aD;
        adms.b |= 0x2;
        builder.copyOnWrite();
        final adms adms2 = (adms)builder.instance;
        adms2.b |= 0x10;
        adms2.g = c;
        return (adms)builder.build();
    }
    
    public final int E() {
        return Mac.getInstance((String)this.a).getMacLength();
    }
    
    public final byte[] F() {
        final String s = (String)this.a;
        final int hashCode = s.hashCode();
        int n = 0;
        Label_0084: {
            if (hashCode != 984523022) {
                if (hashCode != 984524074) {
                    if (hashCode == 984525777) {
                        if (s.equals("HmacSha512")) {
                            n = 2;
                            break Label_0084;
                        }
                    }
                }
                else if (s.equals("HmacSha384")) {
                    n = 1;
                    break Label_0084;
                }
            }
            else if (s.equals("HmacSha256")) {
                n = 0;
                break Label_0084;
            }
            n = -1;
        }
        if (n == 0) {
            return agaf.f;
        }
        if (n == 1) {
            return agaf.g;
        }
        if (n == 2) {
            return agaf.h;
        }
        throw new GeneralSecurityException("Could not determine HPKE KDF ID");
    }
    
    public final byte[] G(final byte[] array, final byte[] array2, final String s, final byte[] array3, final int n) {
        return this.aB(array, agaf.f(s, array2, array3, n), n);
    }
    
    public final byte[] H(final byte[] array, final byte[] array2, final String s, final byte[] array3) {
        return this.aC(agaf.e(s, array2, array3), array);
    }
    
    public final byte[] I(final byte[] array, final byte[] array2, final byte[] array3, final int n) {
        return this.aB(this.aC(agaf.e("eae_prk", array, array3), null), agaf.f("shared_secret", array2, array3, n), n);
    }
    
    public final MessageLite J(final ahab ahab) {
        final MessageLite b = ((agaj)this.a).b(ahab);
        ((agaj)this.a).d(b);
        return ((agaj)this.a).a(b);
    }
    
    public final long K() {
        return ((afam)this.a).a(TimeUnit.MICROSECONDS);
    }
    
    public final void L(final Object o, final Executor executor) {
        executor.getClass();
        if (o != null) {
            ((afue)this.a).a((Closeable)o, executor);
        }
    }
    
    public final void M(final Object o, final int n) {
        try {
            ((Field)this.a).set(o, n);
        }
        catch (final IllegalAccessException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final void N(final Object o, final Object o2) {
        try {
            ((Field)this.a).set(o, o2);
        }
        catch (final IllegalAccessException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final void O(final afid afid) {
        adkp.M(afid.m() ^ true, "range must not be empty, but was %s", (Object)afid);
        ((List<afid>)this.a).add(afid);
    }
    
    public final ListenableFuture P(Callable i, final Executor executor) {
        final Object a = this.a;
        i = aeun.i(i);
        return ((ggj)a).j(i, executor);
    }
    
    public final ListenableFuture Q(afty c, final Executor executor) {
        final Object a = this.a;
        c = aeun.c(c);
        return ((ggj)a).k(c, executor);
    }
    
    public final void S(final Object o) {
        ((tgd)this.a).d(o);
    }
    
    public final void T(final Object o) {
        ((tgd)this.a).f(o);
    }
    
    public final abil U(final int n) {
        if (n >= 0 && n < ((List)this.a).size()) {
            return ((List<abil>)this.a).get(n);
        }
        return null;
    }
    
    public final float X(final int n, final int n2) {
        return ((float[])this.a)[n * 3 + n2];
    }
    
    public final void Y(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9) {
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
    
    public final boolean Z() {
        return ((Activity)this.a).shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
    }
    
    public final void a(final Bitmap bitmap, final Bundle bundle, final String s) {
        this.b(bitmap, bundle, s, null);
    }
    
    public final boolean aa() {
        return ((zqo)this.a).b();
    }
    
    public final void ab(final Throwable t) {
        this.aD(6);
        zlm.c(zll.b, zlk.g, "Chime registration error", t);
    }
    
    public final void ac() {
        this.aD(5);
    }
    
    public final void ad(final Throwable t) {
        this.aD(8);
        zlm.c(zll.b, zlk.g, "Chime unregistration error", t);
    }
    
    public final void ae() {
        this.aD(7);
    }
    
    public final zom af(final ajrq ajrq) {
        final SecureRandom secureRandom = (SecureRandom)((atke)this.a).a();
        secureRandom.getClass();
        ajrq.getClass();
        return new zom(secureRandom, ajrq);
    }
    
    public final String ag(final zme zme) {
        return ((SharedPreferences)((xra)this.a).a).getString(aE(zme), (String)null);
    }
    
    public final void ah(final zme zme, final String s) {
        ((SharedPreferences)((xra)this.a).a).edit().putString(aE(zme), s).apply();
    }
    
    public final String ai() {
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
    
    public final void aj(final String s, final long n) {
        ((Map<String, String>)this.a).put(s, String.format("%d", n));
    }
    
    public final void ak(final String s, final String s2) {
        ((Map<String, String>)this.a).put(s, s2);
    }
    
    public final void al(final String s, final boolean b) {
        ((Map<String, String>)this.a).put(s, String.format("%b", b));
    }
    
    public final void am(final String s, final byte[] array) {
        array.getClass();
        ((Map<String, String>)this.a).put(s, Base64.encodeToString(array, 0));
    }
    
    public final void an(final abzx c, final yyx yyx) {
        final Object a = this.a;
        final ahaz builder = ((ahbh)ygq.a).createBuilder();
        builder.copyOnWrite();
        final ygq ygq = (ygq)builder.instance;
        c.getClass();
        ygq.c = c;
        ygq.b |= 0x1;
        final xvk c2 = yyx.a().c();
        builder.copyOnWrite();
        final ygq ygq2 = (ygq)builder.instance;
        c2.getClass();
        ygq2.d = c2;
        ygq2.b |= 0x2;
        final ygq ygq3 = (ygq)builder.build();
        final ygj i = ((obq)a).i();
        if (i != null) {
            i.c();
            return;
        }
        final ahao ahao = (ahao)((BaseClient)a).c(-1400830973, (MessageLite)ygq3, ((ahbh)ahao.a).getParserForType());
    }
    
    public final byte[] ao() {
        try {
            return ((Cipher)this.a).doFinal();
        }
        catch (final BadPaddingException | IllegalBlockSizeException ex) {
            return null;
        }
    }
    
    public final int ap(final long n) {
        return ((btb)this.a).d(n);
    }
    
    public final int aq() {
        return ((btb)this.a).a;
    }
    
    public final long ar() {
        return ((btb)this.a).f;
    }
    
    public final int[] as() {
        return ((btb)this.a).b;
    }
    
    public final long[] at() {
        return ((btb)this.a).d;
    }
    
    public final long[] au() {
        return ((btb)this.a).c;
    }
    
    public final long[] av() {
        return ((btb)this.a).e;
    }
    
    public final void ay(final adet adet) {
        final float n = this.X(0, 0) * (this.X(1, 1) * this.X(2, 2) - this.X(2, 1) * this.X(1, 2)) - this.X(0, 1) * (this.X(1, 0) * this.X(2, 2) - this.X(1, 2) * this.X(2, 0)) + this.X(0, 2) * (this.X(1, 0) * this.X(2, 1) - this.X(1, 1) * this.X(2, 0));
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
        adet.Y((n3 * n4 - n5 * n6) * n2, -(n7 * n4 - n8 * n5) * n2, (n7 * n6 - n8 * n3) * n2, -(n9 * n4 - n6 * n10) * n2, (n4 * n11 - n8 * n10) * n2, -(n6 * n11 - n8 * n9) * n2, (n9 * n5 - n10 * n3) * n2, -(n5 * n11 - n10 * n7) * n2, (n11 * n3 - n9 * n7) * n2);
    }
    
    public final void b(final Bitmap bitmap, final Bundle bundle, final String c, final String b) {
        final mxw mxw = new mxw((Context)this.a);
        mxw.e((nbr)new adhq(bundle));
        if (bitmap != null) {
            mxw.d(bitmap);
        }
        if (c != null) {
            mxw.c = c;
        }
        if (b != null) {
            mxw.b = b;
        }
        mxv.e((Context)this.a).z(mxw.a());
    }
    
    public final aqwl c(final admv admv, final adng adng) {
        final Object a = this.a;
        int j;
        if ((j = adkp.j(admv.v)) == 0) {
            j = 1;
        }
        final adnh i = ((aekp)a).i(admv, j, Uri.parse(admv.f), adng);
        final File u = u(admv);
        admp admp;
        if ((admp = admv.B) == null) {
            admp = admp.a;
        }
        final aujg aujg = new aujg(admp, i, u);
        final adnf q = aujg.q();
        if (q.b()) {
            return (aqwl)new adqe(aujg, q, (byte[])null, (byte[])null);
        }
        return (aqwl)new adqd(q);
    }
    
    public final void e(String path, final ahaz ahaz) {
        final String path2 = d((Context)this.a, path, "working_dir").getPath();
        ahaz.copyOnWrite();
        final admv admv = (admv)ahaz.instance;
        final admv a = admv.a;
        path2.getClass();
        admv.d |= 0x4;
        admv.ap = path2;
        path = d((Context)this.a, path, "storage_dir").getPath();
        ahaz.copyOnWrite();
        final admv admv2 = (admv)ahaz.instance;
        path.getClass();
        admv2.d |= 0x8;
        admv2.aq = path;
    }
    
    public final adms f(final adms adms) {
        int i;
        if ((i = adkp.i(adms.c)) == 0) {
            i = 1;
        }
        if (i - 1 != 1) {
            return ((adet)this.a).s();
        }
        return adms.a;
    }
    
    public final void g(final String s) {
        this.h(s, null);
    }
    
    public final void h(final String s, final Throwable t) {
        this.i(s, t, null);
    }
    
    public final void i(final String s, final Throwable t, final admt admt) {
        final StringBuilder sb = new StringBuilder();
        apin apin;
        if ((apin = ((arwh)this.a).f().h) == null) {
            apin = apin.a;
        }
        String p3;
        if (TextUtils.isEmpty((CharSequence)(p3 = apin.p))) {
            p3 = "youtubeUploadService::";
        }
        sb.append(p3);
        sb.append(" ");
        sb.append(s);
        if (admt != null) {
            sb.append(" UploadType: ");
            sb.append(admt.h);
        }
        if (t != null) {
            ttr.o("UploadEcatcherReporter", sb.toString(), t);
        }
        else {
            ttr.m("UploadEcatcherReporter", sb.toString());
        }
        int n;
        if (admt == admt.d) {
            apin apin2;
            if ((apin2 = ((arwh)this.a).f().h) == null) {
                apin2 = apin.a;
            }
            n = apin2.n;
        }
        else if (t instanceof adkn) {
            final adkn adkn = (adkn)t;
            if (adkn.a != aphv.q && adkn.a != aphv.c) {
                apin apin3;
                if ((apin3 = ((arwh)this.a).f().h) == null) {
                    apin3 = apin.a;
                }
                n = apin3.m;
            }
            else {
                apin apin4;
                if ((apin4 = ((arwh)this.a).f().h) == null) {
                    apin4 = apin.a;
                }
                n = apin4.o;
            }
        }
        else {
            apin apin5;
            if ((apin5 = ((arwh)this.a).f().h) == null) {
                apin5 = apin.a;
            }
            n = apin5.m;
        }
        if (n != 0) {
            final double random = Math.random();
            final double n2 = n;
            Double.isNaN(n2);
            if (Math.floor(random * n2) == 0.0) {
                if (t != null) {
                    zlm.c(zll.a, zlk.i, sb.toString(), t);
                    return;
                }
                zlm.b(zll.a, zlk.i, sb.toString());
            }
        }
    }
    
    public final void j(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", aA((String)this.a, s, array));
        }
    }
    
    public final void k(final Throwable t, final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", aA((String)this.a, s, array), t);
        }
    }
    
    public final void l(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", aA((String)this.a, s, array));
        }
    }
    
    public final void m(final Object o) {
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
    
    public final void n(final int n) {
        ((List<aebp>)this.a).add(new aebp(n, System.currentTimeMillis()));
    }
    
    public final adms q(final long n) {
        final long c = ((oby)this.a).c();
        final ahaz builder = ((ahbh)adms.a).createBuilder();
        builder.copyOnWrite();
        final adms adms = (adms)builder.instance;
        adms.b |= 0x8;
        adms.f = n + c;
        builder.copyOnWrite();
        final adms adms2 = (adms)builder.instance;
        adms2.b |= 0x10;
        adms2.g = c;
        return (adms)builder.build();
    }
    
    public final adms r(final aphv aphv) {
        final ahaz builder = ((ahbh)adms.a).createBuilder();
        builder.copyOnWrite();
        final adms adms = (adms)builder.instance;
        adms.c = 3;
        adms.b |= 0x1;
        builder.copyOnWrite();
        final adms adms2 = (adms)builder.instance;
        adms2.d = aphv.aD;
        adms2.b |= 0x2;
        final long c = ((oby)this.a).c();
        builder.copyOnWrite();
        final adms adms3 = (adms)builder.instance;
        adms3.b |= 0x10;
        adms3.g = c;
        return (adms)builder.build();
    }
    
    public final adms s() {
        final ahaz builder = ((ahbh)adms.a).createBuilder();
        builder.copyOnWrite();
        final adms adms = (adms)builder.instance;
        adms.c = 1;
        adms.b |= 0x1;
        final long c = ((oby)this.a).c();
        builder.copyOnWrite();
        final adms adms2 = (adms)builder.instance;
        adms2.b |= 0x10;
        adms2.g = c;
        return (adms)builder.build();
    }
}
