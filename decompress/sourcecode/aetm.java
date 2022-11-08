import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetm extends agzi implements ahax
{
    public static final aetm a;
    private static volatile ahbe h;
    public int b;
    public Object c;
    public aetu d;
    public aetw e;
    public aetv f;
    public aetz g;
    
    static {
        agzi.registerDefaultInstance(aetm.class, a = new aetm());
    }
    
    private aetm() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = aetm.h) == null) {
                    synchronized (aetm.class) {
                        if (aetm.h == null) {
                            aetm.h = (ahbe)new agzb((agzi)aetm.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aetm.a;
            }
            case 4: {
                return new agza((agzi)aetm.a);
            }
            case 3: {
                return new aetm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aetm.a, "\u0000\t\u0001\u0000\u0001\r\t\u0000\u0000\u0000\u0001<\u0000\u0002\t\u0003\t\u0004\t\u0006\u023b\u0000\u0007\u023b\u0000\n\t\f<\u0000\r=\u0000", new Object[] { "c", "b", aets.class, "d", "e", "f", "g", aeuc.class });
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
