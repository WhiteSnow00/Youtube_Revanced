import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anul extends ahbh implements ahcw
{
    public static final anul a;
    public static final ahbf b;
    private static volatile ahdd h;
    public int c;
    public String d;
    public boolean e;
    public boolean f;
    public ahab g;
    private ahhu i;
    private byte j;
    
    static {
        final anul a2 = new anul();
        ahbh.registerDefaultInstance((Class)anul.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiyg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 60487319, ahek.k, (Class)anul.class);
    }
    
    private anul() {
        this.j = 2;
        this.d = "";
        this.g = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = anul.h) == null) {
                    synchronized (anul.class) {
                        if (anul.h == null) {
                            anul.h = (ahdd)new ahba((ahbh)anul.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anul.a;
            }
            case 4: {
                return new ahaz((ahbh)anul.a);
            }
            case 3: {
                return new anul();
            }
            case 2: {
                return newMessageInfo((MessageLite)anul.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u100a\u0006\u0004\u1007\u0001\u0005\u1409\u0005\u0007\u1007\u0003", new Object[] { "c", "d", "g", "e", "i", "f" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
