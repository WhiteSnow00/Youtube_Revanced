import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akhc extends ahbh implements ahcw
{
    public static final akhc a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public String d;
    public boolean e;
    
    static {
        ahbh.registerDefaultInstance((Class)akhc.class, (ahbh)(a = new akhc()));
    }
    
    private akhc() {
        ahbh.emptyProtobufList();
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akhc.f) == null) {
                    synchronized (akhc.class) {
                        if (akhc.f == null) {
                            akhc.f = (ahdd)new ahba((ahbh)akhc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akhc.a;
            }
            case 4: {
                return new ahaz((ahbh)akhc.a);
            }
            case 3: {
                return new akhc();
            }
            case 2: {
                return newMessageInfo((MessageLite)akhc.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u1008\u0000\u0003\u1008\u0001\u0004\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
