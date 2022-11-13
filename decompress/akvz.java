import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvz extends ahbh implements ahcw
{
    public static final akvz a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public ahbx d;
    public ahab e;
    public boolean f;
    
    static {
        ahbh.registerDefaultInstance((Class)akvz.class, (ahbh)(a = new akvz()));
    }
    
    private akvz() {
        this.c = "";
        this.d = emptyProtobufList();
        this.e = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = akvz.g) == null) {
                    synchronized (akvz.class) {
                        if (akvz.g == null) {
                            akvz.g = (ahdd)new ahba((ahbh)akvz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akvz.a;
            }
            case 4: {
                return new ahaz((short[][][])null, (int[][])null);
            }
            case 3: {
                return new akvz();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvz.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u100a\u0001\u0004\u1007\u0002", new Object[] { "b", "c", "d", akvy.class, "e", "f" });
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
