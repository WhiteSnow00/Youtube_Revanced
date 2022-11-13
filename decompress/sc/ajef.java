import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajef extends ahbh implements ahcw
{
    public static final ajef a;
    private static volatile ahdd e;
    public int b;
    public ahbx c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajef.class, (ahbh)(a = new ajef()));
    }
    
    private ajef() {
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajef.e) == null) {
                    synchronized (ajef.class) {
                        if (ajef.e == null) {
                            ajef.e = (ahdd)new ahba((ahbh)ajef.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajef.a;
            }
            case 4: {
                return new ahaz((short[][][])null, (byte[])null);
            }
            case 3: {
                return new ajef();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajef.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u100c\u0000", new Object[] { "b", "c", amem.class, "d", aieh.e });
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
