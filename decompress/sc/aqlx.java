import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlx extends ahbh implements ahcw
{
    public static final aqlx a;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public boolean d;
    public ahdy e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqlx.class, (ahbh)(a = new aqlx()));
    }
    
    private aqlx() {
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqlx.f) == null) {
                    synchronized (aqlx.class) {
                        if (aqlx.f == null) {
                            aqlx.f = (ahdd)new ahba((ahbh)aqlx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqlx.a;
            }
            case 4: {
                return new ahaz((byte[][])null, (int[][])null);
            }
            case 3: {
                return new aqlx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlx.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003\u1007\u0001\u0004\u1009\u0002", new Object[] { "b", "c", aqlw.class, "d", "e" });
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
