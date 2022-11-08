import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahin extends agzi implements ahax
{
    public static final ahin a;
    private static volatile ahbe d;
    public String b;
    public String c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahin.class, a = new ahin());
    }
    
    private ahin() {
        this.b = "";
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
                if ((d = ahin.d) == null) {
                    synchronized (ahin.class) {
                        if (ahin.d == null) {
                            ahin.d = (ahbe)new agzb((agzi)ahin.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahin.a;
            }
            case 4: {
                return new agza((agzi)ahin.a);
            }
            case 3: {
                return new ahin();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahin.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
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
