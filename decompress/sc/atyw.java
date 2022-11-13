import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyw extends ahbh implements ahcw
{
    public static final atyw a;
    private static volatile ahdd l;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public ahbx k;
    
    static {
        ahbh.registerDefaultInstance((Class)atyw.class, (ahbh)(a = new atyw()));
    }
    
    private atyw() {
        this.k = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = atyw.l) == null) {
                    synchronized (atyw.class) {
                        if (atyw.l == null) {
                            atyw.l = (ahdd)new ahba((ahbh)atyw.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return atyw.a;
            }
            case 4: {
                return new ahaz((char[][])null, (short[])null);
            }
            case 3: {
                return new atyw();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyw.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b\u1002\u0007\n\u001b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", atyv.class });
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
