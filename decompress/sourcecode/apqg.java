import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqg extends agzi implements ahax
{
    private static volatile ahbe C;
    public static final apqg a;
    public apqe A;
    public String B;
    private apqc D;
    private byte E;
    public int b;
    public int c;
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public float k;
    public float l;
    public String m;
    public aorm n;
    public apqh o;
    public int p;
    public amvn q;
    public apqj r;
    public appx s;
    public ahas t;
    public boolean u;
    public appw v;
    public int w;
    public boolean x;
    public apqa y;
    public agyc z;
    
    static {
        agzi.registerDefaultInstance((Class)apqg.class, (agzi)(a = new apqg()));
    }
    
    private apqg() {
        this.t = ahas.a;
        this.E = 2;
        this.d = "";
        this.e = "";
        this.g = "";
        this.h = "";
        emptyProtobufList();
        this.m = "";
        this.z = agyc.b;
        this.B = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apqg.C) == null) {
                    synchronized (apqg.class) {
                        if (apqg.C == null) {
                            apqg.C = (ahbe)new agzb((agzi)apqg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apqg.a;
            }
            case 4: {
                return new agza((agzi)apqg.a);
            }
            case 3: {
                return new apqg();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqg.a, "\u0001\u001a\u0000\u0002\u0001\uf49c\u4129\u001a\u0001\u0000\u0003\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100b\u0002\u0005\u1008\u0005\u0006\u1007\u0006\u0007\u1001\b\b\u1001\t\t\u1008\u000b\f\u100c\u0011\r\u1008\u0003\u0010\u1009\u0018\u00122\u0014\u1007\u001c\u0015\u1409\u001d\u0016\u100c\u001e\u0017\u1007\u001f\u0019\u1007\u0007\u001a\u1009!\u001c\u100a#\u001d\u1009$ \u1008&#\u1409\f\uf70f\u207e\u1009\r\ue8f4\u2614\u1009\u0012\uf1b8\u3d17\u1009\u0015\uf49c\u4129\u1409\u0017", new Object[] { "b", "c", "d", "e", "f", "h", "i", "k", "l", "m", "p", apms.r, "g", "s", "t", apqf.a, "u", "v", "w", amsc.l, "x", "j", "y", "z", "A", "B", "n", "o", "q", "r", "D" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.E = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.E;
            }
        }
    }
}
