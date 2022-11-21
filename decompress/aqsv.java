import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsv extends ahcz implements aheo
{
    public static final aqsv a;
    private static volatile ahev n;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public String g;
    public String h;
    public String i;
    public int j;
    public long k;
    public long l;
    public String m;
    
    static {
        ahcz.registerDefaultInstance(aqsv.class, a = new aqsv());
    }
    
    private aqsv() {
        this.g = "";
        this.h = "";
        this.i = "";
        this.m = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev n;
                if ((n = aqsv.n) == null) {
                    synchronized (aqsv.class) {
                        if (aqsv.n == null) {
                            aqsv.n = (ahev)new ahcs((ahcz)aqsv.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return aqsv.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsv.a);
            }
            case 3: {
                return new aqsv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsv.a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0006\u1008\u0005\b\u1008\u0007\t\u1008\b\n\u1004\t\u000b\u1002\n\f\u1002\u000b\r\u1008\f", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m" });
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
