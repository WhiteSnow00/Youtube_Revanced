import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiid extends ahbh implements ahcw
{
    public static final aiid a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aiid.class, (ahbh)(a = new aiid()));
    }
    
    private aiid() {
        this.b = 0;
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aiid.d) == null) {
                    synchronized (aiid.class) {
                        if (aiid.d == null) {
                            aiid.d = (ahdd)new ahba((ahbh)aiid.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiid.a;
            }
            case 4: {
                return new ahaz((ahbh)aiid.a);
            }
            case 3: {
                return new aiid();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiid.a, "\u0001\u0001\u0001\u0000\ue99d\u171d\ue99d\u171d\u0001\u0000\u0000\u0001\ue99d\u171d\u143c\u0000", new Object[] { "c", "b", aiia.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
