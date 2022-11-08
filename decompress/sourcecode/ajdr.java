import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdr extends agzi implements ahax
{
    public static final ajdr a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(ajdr.class, a = new ajdr());
    }
    
    private ajdr() {
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
                if ((d = ajdr.d) == null) {
                    synchronized (ajdr.class) {
                        if (ajdr.d == null) {
                            ajdr.d = (ahbe)new agzb((agzi)ajdr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajdr.a;
            }
            case 4: {
                return new agza((agzi)ajdr.a);
            }
            case 3: {
                return new ajdr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
