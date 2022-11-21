import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqts extends ahcz implements aheo
{
    public static final aqts a;
    private static volatile ahev q;
    public int b;
    public ajgi c;
    public long d;
    public String e;
    public long f;
    public boolean g;
    public long h;
    public boolean i;
    public long j;
    public boolean k;
    public ahej l;
    public ahej m;
    public ahej n;
    public int o;
    public int p;
    
    static {
        ahcz.registerDefaultInstance(aqts.class, a = new aqts());
    }
    
    private aqts() {
        this.l = ahej.a;
        final ahej a = ahej.a;
        this.m = a;
        this.n = a;
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev q;
                if ((q = aqts.q) == null) {
                    synchronized (aqts.class) {
                        if (aqts.q == null) {
                            aqts.q = (ahev)new ahcs((ahcz)aqts.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return aqts.a;
            }
            case 4: {
                return new ahcr((char[][][])null, (short[][][])null);
            }
            case 3: {
                return new aqts();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqts.a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0003\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1007\u0004\u0006\u1002\u0005\u0007\u1007\u0006\b\u1002\u0007\t\u1007\b\n2\u000b2\f2\r\u1004\t\u000e\u1004\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", aqtp.a, "m", aqtq.a, "n", aqtr.a, "o", "p" });
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
