import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexe extends ahcz implements aheo
{
    public static final aexe a;
    private static volatile ahev h;
    public int b;
    public Object c;
    public aexm d;
    public aexo e;
    public aexn f;
    public aexr g;
    
    static {
        ahcz.registerDefaultInstance(aexe.class, a = new aexe());
    }
    
    private aexe() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = aexe.h) == null) {
                    synchronized (aexe.class) {
                        if (aexe.h == null) {
                            aexe.h = (ahev)new ahcs((ahcz)aexe.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aexe.a;
            }
            case 4: {
                return new ahcr((ahcz)aexe.a);
            }
            case 3: {
                return new aexe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexe.a, "\u0000\t\u0001\u0000\u0001\r\t\u0000\u0000\u0000\u0001<\u0000\u0002\t\u0003\t\u0004\t\u0006\u023b\u0000\u0007\u023b\u0000\n\t\f<\u0000\r=\u0000", new Object[] { "c", "b", aexk.class, "d", "e", "f", "g", aexu.class });
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
