import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apuw extends ahcz implements aheo
{
    private static volatile ahev C;
    public static final apuw a;
    public apuu A;
    public String B;
    private apus D;
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
    public aowb n;
    public apux o;
    public int p;
    public amzw q;
    public apuz r;
    public apun s;
    public ahej t;
    public boolean u;
    public apum v;
    public int w;
    public boolean x;
    public apuq y;
    public ahbt z;
    
    static {
        ahcz.registerDefaultInstance(apuw.class, a = new apuw());
    }
    
    private apuw() {
        this.t = ahej.a;
        this.E = 2;
        this.d = "";
        this.e = "";
        this.g = "";
        this.h = "";
        emptyProtobufList();
        this.m = "";
        this.z = ahbt.b;
        this.B = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = apuw.C) == null) {
                    synchronized (apuw.class) {
                        if (apuw.C == null) {
                            apuw.C = (ahev)new ahcs((ahcz)apuw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apuw.a;
            }
            case 4: {
                return new ahcr((ahcz)apuw.a);
            }
            case 3: {
                return new apuw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apuw.a, "\u0001\u001a\u0000\u0002\u0001\uf49c\u4129\u001a\u0001\u0000\u0003\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100b\u0002\u0005\u1008\u0005\u0006\u1007\u0006\u0007\u1001\b\b\u1001\t\t\u1008\u000b\f\u100c\u0012\r\u1008\u0003\u0010\u1009\u0019\u00122\u0014\u1007\u001d\u0015\u1409\u001e\u0016\u100c\u001f\u0017\u1007 \u0019\u1007\u0007\u001a\u1009\"\u001c\u100a$\u001d\u1009% \u1008'#\u1409\r\uf70f\u207e\u1009\u000e\ue8f4\u2614\u1009\u0013\uf1b8\u3d17\u1009\u0016\uf49c\u4129\u1409\u0018", new Object[] { "b", "c", "d", "e", "f", "h", "i", "k", "l", "m", "p", aprh.t, "g", "s", "t", apuv.a, "u", "v", "w", amwi.m, "x", "j", "y", "z", "A", "B", "n", "o", "q", "r", "D" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.E = e;
                return null;
            }
            case 0: {
                return this.E;
            }
        }
    }
}
