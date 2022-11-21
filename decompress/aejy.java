import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejy extends ahcz implements aheo
{
    public static final ahdi a;
    public static final aejy b;
    private static volatile ahev e;
    public String c;
    public ahdh d;
    private int f;
    
    static {
        a = (ahdi)new pub(5);
        ahcz.registerDefaultInstance(aejy.class, b = new aejy());
    }
    
    private aejy() {
        this.c = "";
        this.d = ahcz.emptyIntList();
        emptyIntList();
        emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aejy.e) == null) {
                    synchronized (aejy.class) {
                        if (aejy.e == null) {
                            aejy.e = (ahev)new ahcs((ahcz)aejy.b);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aejy.b;
            }
            case 4: {
                return new ahcr((ahcz)aejy.b);
            }
            case 3: {
                return new aejy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aejy.b, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u1008\u0001\u0003\u001e", new Object[] { "f", "c", "d", aejw.b() });
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
