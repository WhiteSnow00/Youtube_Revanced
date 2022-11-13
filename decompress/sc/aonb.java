import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aonb extends ahbh implements ahcw
{
    public static final aonb a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aonb.class, (ahbh)(a = new aonb()));
    }
    
    private aonb() {
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
                if ((d = aonb.d) == null) {
                    synchronized (aonb.class) {
                        if (aonb.d == null) {
                            aonb.d = (ahdd)new ahba((ahbh)aonb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aonb.a;
            }
            case 4: {
                return new ahaz((ahbh)aonb.a);
            }
            case 3: {
                return new aonb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aonb.a, "\u0001\u0001\u0001\u0000\ue631\u3916\ue631\u3916\u0001\u0000\u0000\u0001\ue631\u3916\u143c\u0000", new Object[] { "c", "b", aone.class });
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
