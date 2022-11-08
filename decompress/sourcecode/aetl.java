import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetl extends agzi implements ahax
{
    public static final aetl a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(aetl.class, a = new aetl());
    }
    
    private aetl() {
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
                if ((d = aetl.d) == null) {
                    synchronized (aetl.class) {
                        if (aetl.d == null) {
                            aetl.d = (ahbe)new agzb((agzi)aetl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aetl.a;
            }
            case 4: {
                return new agza((agzi)aetl.a);
            }
            case 3: {
                return new aetl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aetl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
