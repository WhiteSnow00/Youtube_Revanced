import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agee extends ahbh implements ahcw
{
    public static final agee a;
    private static volatile ahdd f;
    public int b;
    public agec c;
    public ahab d;
    public ahab e;
    
    static {
        ahbh.registerDefaultInstance((Class)agee.class, (ahbh)(a = new agee()));
    }
    
    private agee() {
        this.d = ahab.b;
        this.e = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = agee.f) == null) {
                    synchronized (agee.class) {
                        if (agee.f == null) {
                            agee.f = (ahdd)new ahba((ahbh)agee.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agee.a;
            }
            case 4: {
                return new ahaz((ahbh)agee.a);
            }
            case 3: {
                return new agee();
            }
            case 2: {
                return newMessageInfo((MessageLite)agee.a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[] { "b", "c", "d", "e" });
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
