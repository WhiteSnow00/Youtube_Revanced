import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aosu extends agzi implements ahax
{
    public static final aosu a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aosu.class, a = new aosu());
    }
    
    private aosu() {
        this.b = "";
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
                if ((c = aosu.c) == null) {
                    synchronized (aosu.class) {
                        if (aosu.c == null) {
                            aosu.c = (ahbe)new agzb((agzi)aosu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aosu.a;
            }
            case 4: {
                return new agza((agzi)aosu.a);
            }
            case 3: {
                return new aosu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aosu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
