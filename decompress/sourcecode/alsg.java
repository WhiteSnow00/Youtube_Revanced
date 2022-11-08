import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsg extends agzi implements ahax
{
    public static final alsg a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(alsg.class, a = new alsg());
    }
    
    private alsg() {
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
                if ((d = alsg.d) == null) {
                    synchronized (alsg.class) {
                        if (alsg.d == null) {
                            alsg.d = (ahbe)new agzb((agzi)alsg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alsg.a;
            }
            case 4: {
                return new agza((agzi)alsg.a);
            }
            case 3: {
                return new alsg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsg.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "b", "c" });
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
