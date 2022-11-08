import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpl extends agzi implements ahax
{
    public static final afpl a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(afpl.class, a = new afpl());
    }
    
    private afpl() {
        this.c = -1;
        this.d = "";
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
                if ((e = afpl.e) == null) {
                    synchronized (afpl.class) {
                        if (afpl.e == null) {
                            afpl.e = (ahbe)new agzb((agzi)afpl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return afpl.a;
            }
            case 4: {
                return new agza((agzi)afpl.a);
            }
            case 3: {
                return new afpl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
