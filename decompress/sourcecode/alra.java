import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alra extends agzi implements ahax
{
    public static final alra a;
    private static volatile ahbe q;
    public int b;
    public alqy c;
    public long d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public String o;
    public int p;
    
    static {
        agzi.registerDefaultInstance(alra.class, a = new alra());
    }
    
    private alra() {
        this.o = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe q;
                if ((q = alra.q) == null) {
                    synchronized (alra.class) {
                        if (alra.q == null) {
                            alra.q = (ahbe)new agzb((agzi)alra.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return alra.a;
            }
            case 4: {
                return new alqz();
            }
            case 3: {
                return new alra();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alra.a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1003\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1004\u0006\b\u1004\u0007\t\u1004\b\n\u1004\t\u000b\u1004\n\f\u1004\u000b\r\u1008\f\u000e\u100b\r", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
