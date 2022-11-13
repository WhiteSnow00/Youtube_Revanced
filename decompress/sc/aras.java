import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aras extends ahbh implements ahcw
{
    public static final aras a;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public arat d;
    public ahbx e;
    
    static {
        ahbh.registerDefaultInstance((Class)aras.class, (ahbh)(a = new aras()));
    }
    
    private aras() {
        this.c = emptyProtobufList();
        this.e = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aras.f) == null) {
                    synchronized (aras.class) {
                        if (aras.f == null) {
                            aras.f = (ahdd)new ahba((ahbh)aras.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aras.a;
            }
            case 4: {
                return new ahaz((boolean[][][])null, (float[])null);
            }
            case 3: {
                return new aras();
            }
            case 2: {
                return newMessageInfo((MessageLite)aras.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u1009\u0000\u0003\u001b", new Object[] { "b", "c", arar.class, "d", "e", aqyz.class });
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
