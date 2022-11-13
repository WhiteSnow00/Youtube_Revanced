import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnq extends ahbh implements ahcw
{
    public static final alnq a;
    public static final ahbf b;
    private static volatile ahdd h;
    public int c;
    public ajpm d;
    public aiqj e;
    public String f;
    public aiqj g;
    private byte i;
    
    static {
        final alnq a2 = new alnq();
        ahbh.registerDefaultInstance((Class)alnq.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)anuu.a, (Object)a2, (MessageLite)a2, (ahbm)null, 267256503, ahek.k, (Class)alnq.class);
    }
    
    private alnq() {
        this.i = 2;
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = alnq.h) == null) {
                    synchronized (alnq.class) {
                        if (alnq.h == null) {
                            alnq.h = (ahdd)new ahba((ahbh)alnq.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alnq.a;
            }
            case 4: {
                return new ahaz((ahbh)alnq.a);
            }
            case 3: {
                return new alnq();
            }
            case 2: {
                return newMessageInfo((MessageLite)alnq.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
