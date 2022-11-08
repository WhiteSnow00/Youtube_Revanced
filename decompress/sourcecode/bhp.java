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

public final class bhp
{
    public static void a(final bhj bhj, final Object o) {
        bhj.q((AudioDeviceInfo)o);
    }
    
    public static bbo b(final bjo bjo, String m, final bjl bjl, final int i) {
        final bbn bbn = new bbn();
        bbn.a = bjl.a(m);
        bbn.f = bjl.a;
        bbn.g = bjl.b;
        m = bjo.m();
        String string;
        if (m != null) {
            string = m;
        }
        else {
            string = bjl.a(((bjf)bjo.e.get(0)).a).toString();
        }
        bbn.h = string;
        bbn.i = i;
        return bbn.a();
    }
    
    public static int c(int i) {
        int n = 0;
        while (i > 0) {
            ++n;
            i >>>= 1;
        }
        return n;
    }
    
    public static Metadata d(final List list) {
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final String s = list.get(i);
            final String[] aq = baw.aq(s, "=");
            if (aq.length != 2) {
                bao.c("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(s)));
            }
            else if (aq[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    list2.add(PictureFrame.d(new bar(Base64.decode(aq[1], 0))));
                }
                catch (final RuntimeException ex) {
                    bao.d("VorbisUtil", "Failed to parse vorbis picture", (Throwable)ex);
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
    
    public static boolean e(int a, final bar bar, final boolean b) {
        if (bar.a() < 7) {
            if (b) {
                return false;
            }
            a = bar.a();
            final StringBuilder sb = new StringBuilder("too short header: ");
            sb.append(a);
            throw ayz.a(sb.toString(), (Throwable)null);
        }
        else if (bar.i() != a) {
            if (b) {
                return false;
            }
            throw ayz.a("expected header type ".concat(String.valueOf(Integer.toHexString(a))), (Throwable)null);
        }
        else {
            if (bar.i() == 118 && bar.i() == 111 && bar.i() == 114 && bar.i() == 98 && bar.i() == 105 && bar.i() == 115) {
                return true;
            }
            if (b) {
                return false;
            }
            throw ayz.a("expected characters 'vorbis'", (Throwable)null);
        }
    }
    
    public static int f(final buc buc, final aya aya, final int n, final boolean b) {
        return buc.f(aya, n, b);
    }
    
    public static void g(final buc buc, final bar bar, final int n) {
        buc.d(bar, n, 0);
    }
    
    public static avt h(final bar bar, final boolean b, final boolean b2) {
        int n = 0;
        if (b) {
            e(3, bar, false);
        }
        bar.w((int)bar.o());
        final long o = bar.o();
        final String[] array = new String[(int)o];
        while (n < o) {
            array[n] = bar.w((int)bar.o());
            ++n;
        }
        if (b2 && (bar.i() & 0x1) == 0x0) {
            throw ayz.a("framing bit expected to be set", (Throwable)null);
        }
        return new avt(array);
    }
}
