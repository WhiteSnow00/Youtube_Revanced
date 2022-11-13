import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcc extends ahbh implements ahcw
{
    public static final ajcc a;
    private static volatile ahdd d;
    public ahbx b;
    public boolean c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajcc.class, (ahbh)(a = new ajcc()));
    }
    
    private ajcc() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajcc.d) == null) {
                    synchronized (ajcc.class) {
                        if (ajcc.d == null) {
                            ajcc.d = (ahdd)new ahba((ahbh)ajcc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajcc.a;
            }
            case 4: {
                return new ahaz((ahbh)ajcc.a);
            }
            case 3: {
                return new ajcc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajcc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1007\u0000", new Object[] { "e", "b", pet.class, "c" });
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
