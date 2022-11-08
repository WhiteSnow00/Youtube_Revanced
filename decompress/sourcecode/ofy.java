import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ofy extends agzi implements ahax
{
    public static final ofy a;
    private static volatile ahbe c;
    public ahas b;
    
    static {
        agzi.registerDefaultInstance(ofy.class, a = new ofy());
    }
    
    private ofy() {
        this.b = ahas.a;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ofy.c) == null) {
                    synchronized (ofy.class) {
                        if (ofy.c == null) {
                            ofy.c = (ahbe)new agzb((agzi)ofy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ofy.a;
            }
            case 4: {
                return new agza((agzi)ofy.a);
            }
            case 3: {
                return new ofy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ofy.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", ofx.a });
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
