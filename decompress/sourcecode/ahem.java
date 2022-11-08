import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahem extends agzi implements ahax
{
    public static final ahem a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(ahem.class, a = new ahem());
    }
    
    private ahem() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahem.d) == null) {
                    synchronized (ahem.class) {
                        if (ahem.d == null) {
                            ahem.d = (ahbe)new agzb((agzi)ahem.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahem.a;
            }
            case 4: {
                return new agza((agzi)ahem.a);
            }
            case 3: {
                return new ahem();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahem.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
