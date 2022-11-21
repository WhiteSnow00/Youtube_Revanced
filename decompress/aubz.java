import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubz extends ahcz implements aheo
{
    public static final aubz a;
    private static volatile ahev v;
    public int b;
    public long c;
    public String d;
    public String e;
    public auap f;
    public auav g;
    public aubl h;
    public aubt i;
    public atzz j;
    public aubr k;
    public auba l;
    public atzv m;
    public auby n;
    public aubo o;
    public ahdp p;
    public aubi q;
    public aubx r;
    public aubp s;
    public auai t;
    public aubh u;
    private aubj w;
    private byte x;
    
    static {
        ahcz.registerDefaultInstance(aubz.class, a = new aubz());
    }
    
    private aubz() {
        this.x = 2;
        this.d = "";
        this.e = "";
        emptyProtobufList();
        emptyProtobufList();
        this.p = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte x = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev v;
                if ((v = aubz.v) == null) {
                    synchronized (aubz.class) {
                        if (aubz.v == null) {
                            aubz.v = (ahev)new ahcs((ahcz)aubz.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return aubz.a;
            }
            case 4: {
                return new ahcr((boolean[])null, (byte[][][])null);
            }
            case 3: {
                return new aubz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubz.a, "\u0001\u0014\u0000\u0001\u0001\"\u0014\u0000\u0001\b\u0001\u1409\u0003\u0002\u1005\u0000\u0003\u1008\u0001\u0005\u1009\u0018\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0019\t\u1009\u0007\n\u1409\b\f\u1009\n\u000e\u1409\u001b\u0010\u1409\f\u0011\u1008\u0002\u0015\u1009\u001c\u0017\u1009\u001a\u001d\u1409\u0015\u001e\u1009\u0016\u001f\u1009\u0017 \u1009\u0013\"\u001b", new Object[] { "b", "f", "c", "d", "q", "g", "h", "r", "i", "j", "k", "t", "l", "e", "u", "s", "w", "n", "o", "m", "p", aual.class });
            }
            case 1: {
                if (o == null) {
                    x = 0;
                }
                this.x = x;
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
