import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apki extends agzi implements ahax
{
    public static final apki a;
    private static volatile ahbe c;
    public agzp b;
    
    static {
        agzi.registerDefaultInstance(apki.class, a = new apki());
    }
    
    private apki() {
        this.b = agzi.emptyFloatList();
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
                if ((c = apki.c) == null) {
                    synchronized (apki.class) {
                        if (apki.c == null) {
                            apki.c = (ahbe)new agzb((agzi)apki.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apki.a;
            }
            case 4: {
                return new agza((byte[])null, (byte[][][])null);
            }
            case 3: {
                return new apki();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apki.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0013", new Object[] { "b" });
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
