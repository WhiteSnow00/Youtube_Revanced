import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import android.util.Base64;
import java.util.ArrayList;
import androidx.media3.common.Metadata;
import java.util.List;
import android.media.AudioDeviceInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhq
{
    public static void a(final bhk bhk, final Object o) {
        bhk.q((AudioDeviceInfo)o);
    }
    
    public static bbp b(final bjp bjp, String m, final bjm bjm, final int i) {
        final bbo bbo = new bbo();
        bbo.a = bjm.a(m);
        bbo.f = bjm.a;
        bbo.g = bjm.b;
        m = bjp.m();
        String string;
        if (m != null) {
            string = m;
        }
        else {
            string = bjm.a(((bjg)bjp.e.get(0)).a).toString();
        }
        bbo.h = string;
        bbo.i = i;
        return bbo.a();
    }
    
    public static int c(int n) {
        final int n2 = 0;
        int i;
        for (i = n, n = n2; i > 0; i >>>= 1, ++n) {}
        return n;
    }
    
    public static Metadata d(final List list) {
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final String s = list.get(i);
            final String[] aq = bax.aq(s, "=");
            if (aq.length != 2) {
                bap.c("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(s)));
            }
            else if (aq[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    list2.add(PictureFrame.d(new bas(Base64.decode(aq[1], 0))));
                }
                catch (final RuntimeException ex) {
                    bap.d("VorbisUtil", "Failed to parse vorbis picture", (Throwable)ex);
                }
            }
            else {
                list2.add(new VorbisComment(aq[0], aq[1]));
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return new Metadata((List)list2);
    }
    
    public static boolean e(int a, final bas bas, final boolean b) {
        if (bas.a() < 7) {
            if (b) {
                return false;
            }
            a = bas.a();
            final StringBuilder sb = new StringBuilder("too short header: ");
            sb.append(a);
            throw aza.a(sb.toString(), (Throwable)null);
        }
        else if (bas.i() != a) {
            if (b) {
                return false;
            }
            throw aza.a("expected header type ".concat(String.valueOf(Integer.toHexString(a))), (Throwable)null);
        }
        else {
            if (bas.i() == 118 && bas.i() == 111 && bas.i() == 114 && bas.i() == 98 && bas.i() == 105 && bas.i() == 115) {
                return true;
            }
            if (b) {
                return false;
            }
            throw aza.a("expected characters 'vorbis'", (Throwable)null);
        }
    }
    
    public static int f(final bud bud, final ayb ayb, final int n, final boolean b) {
        return bud.f(ayb, n, b);
    }
    
    public static void g(final bud bud, final bas bas, final int n) {
        bud.d(bas, n, 0);
    }
    
    public static avu h(final bas bas, final boolean b, final boolean b2) {
        int n = 0;
        if (b) {
            e(3, bas, false);
        }
        bas.w((int)bas.o());
        final long o = bas.o();
        final String[] array = new String[(int)o];
        while (n < o) {
            array[n] = bas.w((int)bas.o());
            ++n;
        }
        if (b2 && (bas.i() & 0x1) == 0x0) {
            throw aza.a("framing bit expected to be set", (Throwable)null);
        }
        return new avu(array);
    }
}
