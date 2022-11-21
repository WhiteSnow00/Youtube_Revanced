import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqw extends ahcz implements aheo
{
    public static final aoqw a;
    private static volatile ahev f;
    public int b;
    public ahdh c;
    public int d;
    public int e;
    private int g;
    
    static {
        ahcz.registerDefaultInstance(aoqw.class, a = new aoqw());
    }
    
    private aoqw() {
        this.c = ahcz.emptyIntList();
        this.d = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aoqw.f) == null) {
                    synchronized (aoqw.class) {
                        if (aoqw.f == null) {
                            aoqw.f = (ahev)new ahcs((ahcz)aoqw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aoqw.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqw.a);
            }
            case 3: {
                return new aoqw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1004\u0000\u0002'\u0003\u100c\u0001\u0004\u1004\u0002", new Object[] { "g", "b", "c", "d", aonf.p, "e" });
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
