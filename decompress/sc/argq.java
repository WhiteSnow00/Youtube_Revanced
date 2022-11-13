import java.util.Iterator;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class argq extends arfz
{
    static final Map d;
    public static final Map e;
    argf f;
    dqs g;
    long[] h;
    argp i;
    int j;
    long k;
    long l;
    public arfx m;
    private List n;
    
    static {
        final Map map = d = new HashMap();
        final Integer value = 1;
        map.put(value, "AAC Main");
        final Integer value2 = 2;
        map.put(value2, "AAC LC (Low Complexity)");
        final Integer value3 = 3;
        map.put(value3, "AAC SSR (Scalable Sample Rate)");
        final Integer value4 = 4;
        map.put(value4, "AAC LTP (Long Term Prediction)");
        final Integer value5 = 5;
        map.put(value5, "SBR (Spectral Band Replication)");
        final Integer value6 = 6;
        map.put(value6, "AAC Scalable");
        final Integer value7 = 7;
        map.put(value7, "TwinVQ");
        final Integer value8 = 8;
        map.put(value8, "CELP (Code Excited Linear Prediction)");
        final Integer value9 = 9;
        map.put(value9, "HXVC (Harmonic Vector eXcitation Coding)");
        final Integer value10 = 10;
        map.put(value10, "Reserved");
        final Integer value11 = 11;
        map.put(value11, "Reserved");
        map.put(12, "TTSI (Text-To-Speech Interface)");
        map.put(13, "Main Synthesis");
        map.put(14, "Wavetable Synthesis");
        map.put(15, "General MIDI");
        map.put(16, "Algorithmic Synthesis and Audio Effects");
        map.put(17, "ER (Error Resilient) AAC LC");
        map.put(18, "Reserved");
        map.put(19, "ER AAC LTP");
        map.put(20, "ER AAC Scalable");
        map.put(21, "ER TwinVQ");
        map.put(22, "ER BSAC (Bit-Sliced Arithmetic Coding)");
        map.put(23, "ER AAC LD (Low Delay)");
        map.put(24, "ER CELP");
        map.put(25, "ER HVXC");
        map.put(26, "ER HILN (Harmonic and Individual Lines plus Noise)");
        map.put(27, "ER Parametric");
        map.put(28, "SSC (SinuSoidal Coding)");
        map.put(29, "PS (Parametric Stereo)");
        map.put(30, "MPEG Surround");
        map.put(31, "(Escape value)");
        map.put(32, "Layer-1");
        map.put(33, "Layer-2");
        map.put(34, "Layer-3");
        map.put(35, "DST (Direct Stream Transfer)");
        map.put(36, "ALS (Audio Lossless)");
        map.put(37, "SLS (Scalable LosslesS)");
        map.put(38, "SLS non-core");
        map.put(39, "ER AAC ELD (Enhanced Low Delay)");
        map.put(40, "SMR (Symbolic Music Representation) Simple");
        map.put(41, "SMR Main");
        map.put(42, "USAC (Unified Speech and Audio Coding) (no SBR)");
        map.put(43, "SAOC (Spatial Audio Object Coding)");
        map.put(44, "LD MPEG Surround");
        map.put(45, "USAC");
        final Map map2 = e = new HashMap();
        final Integer value12 = 96000;
        final Integer value13 = 0;
        map2.put(value12, value13);
        final Integer value14 = 88200;
        map2.put(value14, value);
        final Integer value15 = 64000;
        map2.put(value15, value2);
        final Integer value16 = 48000;
        map2.put(value16, value3);
        final Integer value17 = 44100;
        map2.put(value17, value4);
        final Integer value18 = 32000;
        map2.put(value18, value5);
        final Integer value19 = 24000;
        map2.put(value19, value6);
        final Integer value20 = 22050;
        map2.put(value20, value7);
        final Integer value21 = 16000;
        map2.put(value21, value8);
        final Integer value22 = 12000;
        map2.put(value22, value9);
        final Integer value23 = 11025;
        map2.put(value23, value10);
        final Integer value24 = 8000;
        map2.put(value24, value11);
        map2.put(value13, value12);
        map2.put(value, value14);
        map2.put(value2, value15);
        map2.put(value3, value16);
        map2.put(value4, value17);
        map2.put(value5, value18);
        map2.put(value6, value19);
        map2.put(value7, value20);
        map2.put(value8, value21);
        map2.put(value9, value22);
        map2.put(value10, value23);
        map2.put(value11, value24);
    }
    
    public argq(final arfx m) {
        super(m.toString());
        this.f = new argf();
        this.m = m;
        this.n = new ArrayList();
        argp i = null;
    Label_0288_Outer:
        while (true) {
            argp argp = new argp();
            final ByteBuffer allocate = ByteBuffer.allocate(7);
            while (true) {
                while (allocate.position() < 7) {
                    if (m.a(allocate) == -1) {
                        argp = null;
                        if (argp != null) {
                            if (i == null) {
                                i = argp;
                            }
                            this.n.add(new argo(this, m.b(), argp.e - argp.a()));
                            m.f(m.b() + argp.e - argp.a());
                            continue Label_0288_Outer;
                        }
                        this.i = i;
                        final double n = i.c;
                        final double n2 = this.n.size();
                        final LinkedList<Integer> list = new LinkedList<Integer>();
                        final Iterator iterator = this.n.iterator();
                        long n3 = 0L;
                        double n4;
                        while (true) {
                            Double.isNaN(n);
                            n4 = n / 1024.0;
                            final boolean hasNext = iterator.hasNext();
                            int n5 = 0;
                            if (!hasNext) {
                                break;
                            }
                            final int n6 = (int)((argd)iterator.next()).a();
                            n3 += n6;
                            list.add(n6);
                            while (list.size() > n4) {
                                list.pop();
                            }
                            if (list.size() != (int)n4) {
                                continue Label_0288_Outer;
                            }
                            final Iterator<Object> iterator2 = list.iterator();
                            while (iterator2.hasNext()) {
                                n5 += iterator2.next();
                            }
                            final double n7 = n5;
                            final int size = list.size();
                            Double.isNaN(n7);
                            final double n8 = size;
                            Double.isNaN(n8);
                            final double n9 = n7 * 8.0 / n8 * n4;
                            if (n9 <= this.k) {
                                continue Label_0288_Outer;
                            }
                            this.k = (int)n9;
                        }
                        Double.isNaN(n2);
                        final double n10 = n2 / n4;
                        final double n11 = (double)(n3 * 8L);
                        Double.isNaN(n11);
                        this.l = (int)(n11 / n10);
                        this.j = 1536;
                        this.g = new dqs();
                        final dry dry = new dry("mp4a");
                        final argp j = this.i;
                        final int d = j.d;
                        if (d == 7) {
                            dry.b = 8;
                        }
                        else {
                            dry.b = d;
                        }
                        dry.d = j.c;
                        dry.a = 1;
                        dry.c = 16;
                        final argx argx = new argx();
                        final arhe a = new arhe();
                        a.a = 0;
                        final arhk k = new arhk();
                        k.b();
                        a.k = k;
                        final arhb l = new arhb();
                        l.a = 64;
                        l.b = 5;
                        l.d = this.j;
                        l.e = this.k;
                        l.f = this.l;
                        final argy h = new argy();
                        h.d = 2;
                        final argp i2 = this.i;
                        h.e = i2.a;
                        h.g = i2.d;
                        l.h = h;
                        a.j = l;
                        final ByteBuffer d2 = a.d();
                        ((argw)argx).a = a;
                        ((argw)argx).b = d2;
                        ((arfw)dry).w((dpv)argx);
                        ((arfw)this.g).w((dpv)dry);
                        this.f.d = new Date();
                        this.f.c = new Date();
                        final argf f = this.f;
                        f.a = "eng";
                        f.h = 1.0f;
                        f.b = this.i.c;
                        Arrays.fill(this.h = new long[this.n.size()], 1024L);
                        return;
                    }
                }
                final arha arha = new arha((ByteBuffer)allocate.rewind(), (byte[])null);
                if (arha.b(12) != 4095) {
                    throw new IOException("Expected Start Word 0xfff");
                }
                arha.b(1);
                arha.b(2);
                argp.b = arha.b(1);
                arha.b(2);
                final int b = arha.b(4);
                argp.a = b;
                argp.c = (int)argq.e.get(b);
                arha.b(1);
                argp.d = arha.b(3);
                arha.b(1);
                arha.b(1);
                arha.b(1);
                arha.b(1);
                argp.e = arha.b(13);
                arha.b(11);
                if (arha.b(2) + 1 != 1) {
                    throw new IOException("This muxer can only work with 1 AAC frame per ADTS frame");
                }
                if (argp.b == 0) {
                    m.a(ByteBuffer.allocate(2));
                }
                continue;
            }
        }
    }
    
    @Override
    public final drb b() {
        return null;
    }
    
    public final void close() {
    }
    
    @Override
    public final List d() {
        return null;
    }
    
    @Override
    public final List f() {
        return null;
    }
    
    @Override
    public final long[] h() {
        return null;
    }
    
    public final dqs i() {
        return this.g;
    }
    
    public final argf j() {
        return this.f;
    }
    
    public final String k() {
        return "soun";
    }
    
    public final List l() {
        return this.n;
    }
    
    public final long[] m() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        final argp i = this.i;
        final int c = i.c;
        final int d = i.d;
        final StringBuilder sb = new StringBuilder(63);
        sb.append("AACTrackImpl{sampleRate=");
        sb.append(c);
        sb.append(", channelconfig=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
