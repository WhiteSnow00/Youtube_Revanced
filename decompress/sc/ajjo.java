import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjo extends ahbh implements ahcw
{
    private static final ajjo a;
    private static volatile ahdd b;
    private ahbx c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajjo.class, (ahbh)(a = new ajjo()));
    }
    
    private ajjo() {
        this.c = emptyProtobufList();
    }
    
    public static ajjo a() {
        return ajjo.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajjo.b) == null) {
                    synchronized (ajjo.class) {
                        if (ajjo.b == null) {
                            ajjo.b = (ahdd)new ahba((ahbh)ajjo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajjo.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new ajjo();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjo.a, "\u0001\u0000", (Object[])null);
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
