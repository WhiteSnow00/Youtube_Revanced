import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmx extends ahbh implements ahcw
{
    public static final akmx a;
    private static volatile ahdd m;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public long i;
    public long j;
    public int k;
    public ahbx l;
    
    static {
        ahbh.registerDefaultInstance((Class)akmx.class, (ahbh)(a = new akmx()));
    }
    
    private akmx() {
        this.l = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd m;
                if ((m = akmx.m) == null) {
                    synchronized (akmx.class) {
                        if (akmx.m == null) {
                            akmx.m = (ahdd)new ahba((ahbh)akmx.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return akmx.a;
            }
            case 4: {
                return new ahaz((char[][][])null, (boolean[][])null);
            }
            case 3: {
                return new akmx();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmx.a, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u1007\u0002\u0003\u100b\u0001\u0006\u1007\u0004\u0007\u1004\u0005\u000b\u1002\n\f\u1002\u000b\r\u100c\f\u000e\u001b\u000f\u1004\u0006", new Object[] { "b", "c", "e", "d", "f", "g", "i", "j", "k", ampw.l, "l", akmw.class, "h" });
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
