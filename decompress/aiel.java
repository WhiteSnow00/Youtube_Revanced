import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiel extends ahcz implements aheo
{
    public static final aiel a;
    private static volatile ahev i;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ahdh h;
    private int j;
    
    static {
        ahcz.registerDefaultInstance(aiel.class, a = new aiel());
    }
    
    private aiel() {
        this.h = ahcz.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = aiel.i) == null) {
                    synchronized (aiel.class) {
                        if (aiel.i == null) {
                            aiel.i = (ahev)new ahcs((ahcz)aiel.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aiel.a;
            }
            case 4: {
                return new ahcr((ahcz)aiel.a);
            }
            case 3: {
                return new aiel();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiel.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u0016", new Object[] { "j", "b", "c", "d", "e", "f", "g", "h" });
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
