import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajms extends agzi implements ahax
{
    public static final ajms a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public float d;
    
    static {
        agzi.registerDefaultInstance((Class)ajms.class, (agzi)(a = new ajms()));
    }
    
    private ajms() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ajms.e) == null) {
                    synchronized (ajms.class) {
                        if (ajms.e == null) {
                            ajms.e = (ahbe)new agzb((agzi)ajms.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajms.a;
            }
            case 4: {
                return new agza((agzi)ajms.a);
            }
            case 3: {
                return new ajms();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajms.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1001\u0001", new Object[] { "b", "c", "d" });
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
