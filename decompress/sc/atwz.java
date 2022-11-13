import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwz extends ahbh implements ahcw
{
    public static final atwz a;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public atxa d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)atwz.class, (ahbh)(a = new atwz()));
    }
    
    private atwz() {
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
                if ((f = atwz.f) == null) {
                    synchronized (atwz.class) {
                        if (atwz.f == null) {
                            atwz.f = (ahdd)new ahba((ahbh)atwz.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return atwz.a;
            }
            case 4: {
                return new ahaz((short[][][])null, (byte[][])null);
            }
            case 3: {
                return new atwz();
            }
            case 2: {
                return newMessageInfo((MessageLite)atwz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000\u0003\u1004\u0001", new Object[] { "b", "c", atwy.class, "d", "e" });
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
