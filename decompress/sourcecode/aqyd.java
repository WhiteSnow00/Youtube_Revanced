import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqyd extends agzi implements ahax
{
    public static final aqyd a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(aqyd.class, a = new aqyd());
    }
    
    private aqyd() {
        this.c = "";
        this.d = 1;
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
                if ((e = aqyd.e) == null) {
                    synchronized (aqyd.class) {
                        if (aqyd.e == null) {
                            aqyd.e = (ahbe)new agzb((agzi)aqyd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqyd.a;
            }
            case 4: {
                return new agza((agzi)aqyd.a);
            }
            case 3: {
                return new aqyd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqyd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", aqtg.r });
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
