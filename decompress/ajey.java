import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajey extends ahbh implements ahcw
{
    public static final ajey a;
    public static final ahbf b;
    private static volatile ahdd d;
    public aiqj c;
    private int e;
    private byte f;
    
    static {
        final ajey a2 = new ajey();
        ahbh.registerDefaultInstance((Class)ajey.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 388636837, ahek.k, (Class)ajey.class);
    }
    
    private ajey() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajey.d) == null) {
                    synchronized (ajey.class) {
                        if (ajey.d == null) {
                            ajey.d = (ahdd)new ahba((ahbh)ajey.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajey.a;
            }
            case 4: {
                return new ahaz((ahbh)ajey.a);
            }
            case 3: {
                return new ajey();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajey.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "e", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
