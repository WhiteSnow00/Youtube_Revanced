import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvj extends ahbh implements ahcw
{
    public static final akvj a;
    private static volatile ahdd i;
    public int b;
    public String c;
    public long d;
    public ahbx e;
    public boolean f;
    public long g;
    public long h;
    
    static {
        ahbh.registerDefaultInstance((Class)akvj.class, (ahbh)(a = new akvj()));
    }
    
    private akvj() {
        this.c = "";
        this.e = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = akvj.i) == null) {
                    synchronized (akvj.class) {
                        if (akvj.i == null) {
                            akvj.i = (ahdd)new ahba((ahbh)akvj.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akvj.a;
            }
            case 4: {
                return new ahaz((short[])null, (char[][])null);
            }
            case 3: {
                return new akvj();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvj.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u001a\u0004\u1007\u0002\u0005\u1002\u0003\u0006\u1002\u0004", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
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
