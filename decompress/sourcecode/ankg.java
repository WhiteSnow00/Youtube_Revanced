import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankg extends agzi implements ahax
{
    public static final ankg a;
    private static volatile ahbe e;
    public int b;
    public anke c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance(ankg.class, a = new ankg());
    }
    
    private ankg() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ankg.e) == null) {
                    synchronized (ankg.class) {
                        if (ankg.e == null) {
                            ankg.e = (ahbe)new agzb((agzi)ankg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ankg.a;
            }
            case 4: {
                return new agza((agzi)ankg.a);
            }
            case 3: {
                return new ankg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
