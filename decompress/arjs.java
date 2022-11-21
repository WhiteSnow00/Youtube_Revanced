import java.util.Arrays;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

@arjx(a = 64, b = { 5 })
public final class arjs extends arjt
{
    public static final Map a;
    public static final Map b;
    int A;
    int B;
    int C;
    boolean D;
    int E;
    int F;
    int G;
    int H;
    int I;
    int J;
    int K;
    int L;
    int M;
    int N;
    int O;
    int P;
    int Q;
    int R;
    boolean S;
    byte[] c;
    public int d;
    public int e;
    int f;
    public int g;
    int h;
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    int r;
    int s;
    int t;
    int u;
    int v;
    int w;
    int x;
    int y;
    int z;
    
    static {
        final Map map = a = new HashMap();
        final Map map2 = b = new HashMap();
        map.put(0, 96000);
        final Integer value = 1;
        map.put(value, 88200);
        final Integer value2 = 2;
        map.put(value2, 64000);
        final Integer value3 = 3;
        map.put(value3, 48000);
        final Integer value4 = 4;
        map.put(value4, 44100);
        final Integer value5 = 5;
        map.put(value5, 32000);
        final Integer value6 = 6;
        map.put(value6, 24000);
        final Integer value7 = 7;
        map.put(value7, 22050);
        final Integer value8 = 8;
        map.put(value8, 16000);
        final Integer value9 = 9;
        map.put(value9, 12000);
        final Integer value10 = 10;
        map.put(value10, 11025);
        final Integer value11 = 11;
        map.put(value11, 8000);
        map2.put(value, "AAC main");
        map2.put(value2, "AAC LC");
        map2.put(value3, "AAC SSR");
        map2.put(value4, "AAC LTP");
        map2.put(value5, "SBR");
        map2.put(value6, "AAC Scalable");
        map2.put(value7, "TwinVQ");
        map2.put(value8, "CELP");
        map2.put(value9, "HVXC");
        map2.put(value10, "(reserved)");
        map2.put(value11, "(reserved)");
        map2.put(12, "TTSI");
        map2.put(13, "Main synthetic");
        map2.put(14, "Wavetable synthesis");
        map2.put(15, "General MIDI");
        map2.put(16, "Algorithmic Synthesis and Audio FX");
        map2.put(17, "ER AAC LC");
        map2.put(18, "(reserved)");
        map2.put(19, "ER AAC LTP");
        map2.put(20, "ER AAC Scalable");
        map2.put(21, "ER TwinVQ");
        map2.put(22, "ER BSAC");
        map2.put(23, "ER AAC LD");
        map2.put(24, "ER CELP");
        map2.put(25, "ER HVXC");
        map2.put(26, "ER HILN");
        map2.put(27, "ER Parametric");
        map2.put(28, "SSC");
        map2.put(29, "PS");
        map2.put(30, "MPEG Surround");
        map2.put(31, "(escape)");
        map2.put(32, "Layer-1");
        map2.put(33, "Layer-2");
        map2.put(34, "Layer-3");
        map2.put(35, "DST");
        map2.put(36, "ALS");
        map2.put(37, "SLS");
        map2.put(38, "SLS non-core");
        map2.put(39, "ER AAC ELD");
        map2.put(40, "SMR Simple");
        map2.put(41, "SMR Main");
    }
    
    private static final int d(final arju arju) {
        final int b = arju.b(5);
        if (b == 31) {
            return arju.b(6) + 32;
        }
        return b;
    }
    
    @Override
    public final void a(final ByteBuffer byteBuffer) {
        final ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.U);
        byteBuffer.position(byteBuffer.position() + this.U);
        slice.get(this.c = new byte[this.U]);
        slice.rewind();
        final arju arju = new arju(slice, null);
        this.d = d(arju);
        final int b = arju.b(4);
        this.e = b;
        if (b == 15) {
            this.f = arju.b(24);
        }
        this.g = arju.b(4);
        final int d = this.d;
        if (d != 5 && d != 29) {
            this.h = 0;
        }
        else {
            this.h = 5;
            this.i = 1;
            if (d == 29) {
                this.j = 1;
            }
            if ((this.k = arju.b(4)) == 15) {
                this.l = arju.b(24);
            }
            if ((this.d = d(arju)) == 22) {
                this.m = arju.b(4);
            }
        }
        final int d2 = this.d;
        switch (d2) {
            case 40:
            case 41: {
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
            }
            case 39: {
                throw new UnsupportedOperationException("can't parse ELDSpecificConfig yet");
            }
            case 37:
            case 38: {
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            }
            case 36: {
                this.o = arju.b(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            }
            case 35: {
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            }
            case 32:
            case 33:
            case 34: {
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            }
            case 30: {
                this.n = arju.b(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            }
            case 28: {
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            }
            case 26:
            case 27: {
                final int b2 = arju.b(1);
                this.E = b2;
                if (b2 == 1) {
                    if ((this.F = arju.b(2)) != 1) {
                        this.H = arju.b(1);
                        this.I = arju.b(2);
                        if ((this.J = arju.b(1)) == 1) {
                            this.K = arju.b(1);
                        }
                    }
                    if (this.F != 0) {
                        this.L = arju.b(1);
                        this.M = arju.b(8);
                        this.N = arju.b(4);
                        this.O = arju.b(12);
                        this.P = arju.b(2);
                    }
                    this.G = arju.b(1);
                    this.S = true;
                    break;
                }
                if ((this.Q = arju.b(1)) == 1) {
                    this.R = arju.b(2);
                    break;
                }
                break;
            }
            case 25: {
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            }
            case 24: {
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            }
            case 13:
            case 14:
            case 15:
            case 16: {
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            }
            case 12: {
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            }
            case 9: {
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            }
            case 8: {
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23: {
                final int g = this.g;
                this.s = arju.b(1);
                final int b3 = arju.b(1);
                this.t = b3;
                if (b3 == 1) {
                    this.u = arju.b(14);
                }
                this.v = arju.b(1);
                if (g != 0) {
                    int n = 0;
                    Label_0821: {
                        if ((n = d2) != 6) {
                            if ((n = d2) != 20) {
                                break Label_0821;
                            }
                            n = 20;
                        }
                        this.w = arju.b(3);
                    }
                    if (this.v == 1) {
                        int n2;
                        if ((n2 = n) == 22) {
                            this.x = arju.b(5);
                            this.y = arju.b(11);
                            n2 = 22;
                        }
                        if (n2 == 17 || n2 == 19 || n2 == 20 || n2 == 23) {
                            this.z = arju.b(1);
                            this.A = arju.b(1);
                            this.B = arju.b(1);
                        }
                        this.C = arju.b(1);
                    }
                    this.D = true;
                    break;
                }
                throw new UnsupportedOperationException("can't parse program_config_element yet");
            }
        }
        final int d3 = this.d;
        Label_1066: {
            if (d3 != 17 && d3 != 39) {
                switch (d3) {
                    default: {
                        break Label_1066;
                    }
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27: {
                        break;
                    }
                }
            }
            final int b4 = arju.b(2);
            if ((this.p = b4) == 2 || b4 == 3) {
                throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
            }
            if (b4 == 3) {
                if ((this.q = arju.b(1)) == 0) {
                    throw new RuntimeException("not implemented");
                }
            }
        }
        if (this.h != 5 && arju.c() >= 16 && (this.r = arju.b(11)) == 695) {
            if ((this.h = d(arju)) == 5 && (this.i = arju.b(1)) == 1) {
                if ((this.k = arju.b(4)) == 15) {
                    this.l = arju.b(24);
                }
                if (arju.c() >= 12 && (this.r = arju.b(11)) == 1352) {
                    this.j = arju.b(1);
                }
            }
            if (this.h == 22) {
                if ((this.i = arju.b(1)) == 1 && (this.k = arju.b(4)) == 15) {
                    this.l = arju.b(24);
                }
                this.m = arju.b(4);
            }
        }
    }
    
    public final void b() {
        if (this.d == 2) {
            return;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arjs arjs = (arjs)o;
            return this.A == arjs.A && this.z == arjs.z && this.B == arjs.B && this.d == arjs.d && this.g == arjs.g && this.u == arjs.u && this.t == arjs.t && this.q == arjs.q && this.p == arjs.p && this.J == arjs.J && this.h == arjs.h && this.m == arjs.m && this.v == arjs.v && this.C == arjs.C && this.l == arjs.l && this.k == arjs.k && this.o == arjs.o && this.s == arjs.s && this.D == arjs.D && this.P == arjs.P && this.Q == arjs.Q && this.R == arjs.R && this.O == arjs.O && this.M == arjs.M && this.L == arjs.L && this.N == arjs.N && this.I == arjs.I && this.H == arjs.H && this.E == arjs.E && this.w == arjs.w && this.y == arjs.y && this.x == arjs.x && this.G == arjs.G && this.F == arjs.F && this.S == arjs.S && this.j == arjs.j && this.n == arjs.n && this.f == arjs.f && this.e == arjs.e && this.i == arjs.i && this.r == arjs.r && this.K == arjs.K && Arrays.equals(this.c, arjs.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final byte[] c = this.c;
        int hashCode;
        if (c != null) {
            hashCode = Arrays.hashCode(c);
        }
        else {
            hashCode = 0;
        }
        return (((((((((((((((((((((((((((((((((((((((((hashCode * 31 + this.d) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + this.h) * 31 + this.i) * 31 + this.j) * 31 + this.k) * 31 + this.l) * 31 + this.m) * 31 + this.n) * 31 + this.o) * 31 + this.p) * 31 + this.q) * 31 + this.r) * 31 + this.s) * 31 + this.t) * 31 + this.u) * 31 + this.v) * 31 + this.w) * 31 + this.x) * 31 + this.y) * 31 + this.z) * 31 + this.A) * 31 + this.B) * 31 + this.C) * 31 + (this.D ? 1 : 0)) * 31 + this.E) * 31 + this.F) * 31 + this.G) * 31 + this.H) * 31 + this.I) * 31 + this.J) * 31 + this.K) * 31 + this.L) * 31 + this.M) * 31 + this.N) * 31 + this.O) * 31 + this.P) * 31 + this.Q) * 31 + this.R) * 31 + (this.S ? 1 : 0);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb.append(dpv.a(this.c));
        sb.append(", audioObjectType=");
        sb.append(this.d);
        sb.append(" (");
        final Map b = arjs.b;
        sb.append((String)b.get(this.d));
        sb.append("), samplingFrequencyIndex=");
        sb.append(this.e);
        sb.append(" (");
        final Map a = arjs.a;
        sb.append(a.get(this.e));
        sb.append("), samplingFrequency=");
        sb.append(this.f);
        sb.append(", channelConfiguration=");
        sb.append(this.g);
        if (this.h > 0) {
            sb.append(", extensionAudioObjectType=");
            sb.append(this.h);
            sb.append(" (");
            sb.append((String)b.get(this.h));
            sb.append("), sbrPresentFlag=");
            sb.append(this.i);
            sb.append(", psPresentFlag=");
            sb.append(this.j);
            sb.append(", extensionSamplingFrequencyIndex=");
            sb.append(this.k);
            sb.append(" (");
            sb.append(a.get(this.k));
            sb.append("), extensionSamplingFrequency=");
            sb.append(this.l);
            sb.append(", extensionChannelConfiguration=");
            sb.append(this.m);
        }
        sb.append(", syncExtensionType=");
        sb.append(this.r);
        if (this.D) {
            sb.append(", frameLengthFlag=");
            sb.append(this.s);
            sb.append(", dependsOnCoreCoder=");
            sb.append(this.t);
            sb.append(", coreCoderDelay=");
            sb.append(this.u);
            sb.append(", extensionFlag=");
            sb.append(this.v);
            sb.append(", layerNr=");
            sb.append(this.w);
            sb.append(", numOfSubFrame=");
            sb.append(this.x);
            sb.append(", layer_length=");
            sb.append(this.y);
            sb.append(", aacSectionDataResilienceFlag=");
            sb.append(this.z);
            sb.append(", aacScalefactorDataResilienceFlag=");
            sb.append(this.A);
            sb.append(", aacSpectralDataResilienceFlag=");
            sb.append(this.B);
            sb.append(", extensionFlag3=");
            sb.append(this.C);
        }
        if (this.S) {
            sb.append(", isBaseLayer=");
            sb.append(this.E);
            sb.append(", paraMode=");
            sb.append(this.F);
            sb.append(", paraExtensionFlag=");
            sb.append(this.G);
            sb.append(", hvxcVarMode=");
            sb.append(this.H);
            sb.append(", hvxcRateMode=");
            sb.append(this.I);
            sb.append(", erHvxcExtensionFlag=");
            sb.append(this.J);
            sb.append(", var_ScalableFlag=");
            sb.append(this.K);
            sb.append(", hilnQuantMode=");
            sb.append(this.L);
            sb.append(", hilnMaxNumLine=");
            sb.append(this.M);
            sb.append(", hilnSampleRateCode=");
            sb.append(this.N);
            sb.append(", hilnFrameLength=");
            sb.append(this.O);
            sb.append(", hilnContMode=");
            sb.append(this.P);
            sb.append(", hilnEnhaLayer=");
            sb.append(this.Q);
            sb.append(", hilnEnhaQuantMode=");
            sb.append(this.R);
        }
        sb.append('}');
        return sb.toString();
    }
}
