import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozf extends ahbh implements ahcw
{
    public static final aozf a;
    private static volatile ahdd e;
    public ahbx b;
    public ahbx c;
    public boolean d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)aozf.class, (ahbh)(a = new aozf()));
    }
    
    private aozf() {
        this.b = emptyProtobufList();
        ahbh.emptyProtobufList();
        this.c = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aozf.e) == null) {
                    synchronized (aozf.class) {
                        if (aozf.e == null) {
                            aozf.e = (ahdd)new ahba((ahbh)aozf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aozf.a;
            }
            case 4: {
                return new ahaz((ahbh)aozf.a);
            }
            case 3: {
                return new aozf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozf.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001\u001b\u0003\u001a\u0004\u1007\u0000", new Object[] { "f", "b", anvv.class, "c", "d" });
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
