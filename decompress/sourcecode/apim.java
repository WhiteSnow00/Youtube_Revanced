import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apim extends agzi implements ahax
{
    public static final apim a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(apim.class, a = new apim());
    }
    
    private apim() {
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
                if ((c = apim.c) == null) {
                    synchronized (apim.class) {
                        if (apim.c == null) {
                            apim.c = (ahbe)new agzb((agzi)apim.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apim.a;
            }
            case 4: {
                return new agza((agzi)apim.a);
            }
            case 3: {
                return new apim();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apim.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", apfn.u });
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
