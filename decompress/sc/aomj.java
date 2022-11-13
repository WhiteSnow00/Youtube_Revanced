import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomj extends ahbh implements ahcw
{
    public static final aomj a;
    private static volatile ahdd e;
    public String b;
    public long c;
    public ahbx d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)aomj.class, (ahbh)(a = new aomj()));
    }
    
    private aomj() {
        this.b = "";
        this.d = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aomj.e) == null) {
                    synchronized (aomj.class) {
                        if (aomj.e == null) {
                            aomj.e = (ahdd)new ahba((ahbh)aomj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aomj.a;
            }
            case 4: {
                return new ahaz((ahbh)aomj.a);
            }
            case 3: {
                return new aomj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomj.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u1002\u0001\u0003\u1008\u0000\u0004\u001a", new Object[] { "f", "c", "b", "d" });
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
