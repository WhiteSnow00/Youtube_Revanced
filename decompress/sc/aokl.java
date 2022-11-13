import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokl extends ahbh implements ahcw
{
    public static final aokl a;
    public static final ahbf b;
    private static volatile ahdd f;
    public String c;
    public aotp d;
    public int e;
    private int g;
    private byte h;
    
    static {
        final aokl a2 = new aokl();
        ahbh.registerDefaultInstance((Class)aokl.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 471068492, ahek.k, (Class)aokl.class);
    }
    
    private aokl() {
        this.h = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aokl.f) == null) {
                    synchronized (aokl.class) {
                        if (aokl.f == null) {
                            aokl.f = (ahdd)new ahba((ahbh)aokl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aokl.a;
            }
            case 4: {
                return new ahaz((ahbh)aokl.a);
            }
            case 3: {
                return new aokl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokl.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1004\u0002", new Object[] { "g", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
