import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alov extends ahcz implements aheo
{
    public static final alov a;
    private static volatile ahev g;
    public int b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    
    static {
        ahcz.registerDefaultInstance(alov.class, a = new alov());
    }
    
    private alov() {
        this.d = "";
        emptyLongList();
        this.e = "";
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = alov.g) == null) {
                    synchronized (alov.class) {
                        if (alov.g == null) {
                            alov.g = (ahev)new ahcs((ahcz)alov.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alov.a;
            }
            case 4: {
                return new ahcr((ahcz)alov.a);
            }
            case 3: {
                return new alov();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alov.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1008\u0001\u0005\u1008\u0003\u0006\u1008\u0004", new Object[] { "b", "c", "d", "e", "f" });
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
